package yoginolja.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.startup.HostRuleSet;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yoginolja.domain.Guest;
import yoginolja.domain.User;
import yoginolja.domain.UserType;
import yoginolja.dto.DefaultResponseDTO;
import yoginolja.dto.GuestDTO;
import yoginolja.dto.HostDTO;
import yoginolja.dto.UserDTO;
import yoginolja.repository.GuestRepository;
import yoginolja.repository.HostRepository;
import yoginolja.repository.UserRepository;
import yoginolja.utils.ResponseMessage;
import yoginolja.utils.StatusCode;

import java.util.Optional;

@Slf4j
@Service
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GuestRepository guestRepository;
    @Autowired
    private HostRepository hostRepository;

    @Transactional
    public DefaultResponseDTO SignIn(UserDTO userDTO) {

        Optional<Guest> guest = guestRepository.findById(userDTO.getId());
        if(userDTO.getId() == null ||userDTO.getPassword() == null){
            return DefaultResponseDTO.res(StatusCode.BAD_REQUEST, ResponseMessage.LOGIN_FAIL);
        }
        if (guest != null) {
            if (userDTO.getPassword().equals(guest.get().getPassword())) {
                log.info(userDTO.getPassword());
                return DefaultResponseDTO.res(StatusCode.OK, ResponseMessage.LOGIN_SUCCESS, guest.get().getId());
            }
        }
        return DefaultResponseDTO.res(StatusCode.BAD_REQUEST, ResponseMessage.LOGIN_FAIL);
    }
    @Transactional
    public DefaultResponseDTO SignUp(UserDTO userDTO) {
        //pw 암호화
        //   BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        // userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        log.info(userDTO.toString());
        log.info("heelo");
        if (userDTO.getType() == UserType.GUEST) {
             GuestDTO guestDTO = userDTO.toGuestDTO();
            Optional<User> guest = guestRepository.findByEmail(guestDTO.getEmail());
            log.info(guest.toString());
            if (userDTO.checkProperties()) {
                if (guest.isEmpty()) {
                    try {
                        // String passwordHashed = BCrypt.hashpw(userDTO.getPassword(), BCrypt.gensalt());
                        // userDTO.setPassword(passwordHashed);
                        log.info("OK!!!!");
                        guestRepository.save(guestDTO.toEntity());
                        return DefaultResponseDTO.res(StatusCode.CREATED, ResponseMessage.CREATED_USER);
                    } catch (Exception e) {
                        log.error(e.getMessage());

                        return DefaultResponseDTO.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
                    }

                } else {
                    return DefaultResponseDTO.res(StatusCode.CONFLICT, ResponseMessage.ALREADY_USER);
                }
            }
            return DefaultResponseDTO.res(StatusCode.BAD_REQUEST, ResponseMessage.INVALID_CREATED_USER);

        }else if(userDTO.getType() == UserType.HOST){
            HostDTO hostDTO = userDTO.toHostDTO();
            Optional<User> host =  hostRepository.findByEmail(hostDTO.getEmail());
            if(hostDTO.checkProperties()){
                if(host.isEmpty()){
                    try{
                        hostRepository.save(hostDTO.toEntity());
                        return DefaultResponseDTO.res(StatusCode.CREATED, ResponseMessage.CREATED_USER);
                    }catch (Exception e){
                        return DefaultResponseDTO.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
                    }

                }else{
                    return DefaultResponseDTO.res(StatusCode.CONFLICT, ResponseMessage.ALREADY_USER);
                }
            }
            return DefaultResponseDTO.res(StatusCode.BAD_REQUEST, ResponseMessage.INVALID_CREATED_USER);
        }
         return DefaultResponseDTO.res(StatusCode.BAD_REQUEST, ResponseMessage.INVALID_CREATED_USER);
    }

    @Transactional
    public DefaultResponseDTO idCheck(UserDTO userDTO){
        Optional<User> user = userRepository.findById(userDTO.getIdx());
        if(user != null){
            return DefaultResponseDTO.res(StatusCode.BAD_REQUEST,ResponseMessage.ALREADY_ID);
        }else{
            return DefaultResponseDTO.res(StatusCode.OK,ResponseMessage.ID_CHECK_OK);
        }
    }


}
