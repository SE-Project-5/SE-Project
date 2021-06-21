package yoginolja.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import yoginolja.dto.DefaultResponseDTO;
import yoginolja.dto.GuestDTO;
import yoginolja.dto.HostDTO;
import yoginolja.dto.UserDTO;
import yoginolja.service.UserService;

@Slf4j
@RequiredArgsConstructor
@Controller
public class UserController {

    @Autowired
    private final UserService userService;


    @PostMapping("auth/signup")
    public ResponseEntity signup(@RequestBody UserDTO userDTO){
        try {
            log.info(userDTO.toString());

            return new ResponseEntity<>(userService.SignUp(userDTO), HttpStatus.OK);
        }catch (Exception e){
            log.info("Controller signup error");
            log.error(e.getMessage());
            return new ResponseEntity<>(DefaultResponseDTO.FAIL_DETAIL_RES,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("auth/signin/guest")
    public ResponseEntity signInGuest(@RequestBody final GuestDTO guestDTO){
        try {
            log.info(guestDTO.getId());
            return new ResponseEntity<>(userService.SignIn(guestDTO),HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return new ResponseEntity(DefaultResponseDTO.FAIL_DETAIL_RES,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("auth/signin/host")
    public ResponseEntity signInHost(@RequestBody final HostDTO hostDTO){
        try {
            log.info(hostDTO.getId());
            return new ResponseEntity<>(userService.SignIn(hostDTO),HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return new ResponseEntity(DefaultResponseDTO.FAIL_DETAIL_RES,HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @PostMapping("auth/findIdPw")
    public ResponseEntity findIdPw(@RequestBody final UserDTO userDTO) {
        try {
            log.info(userDTO.getId().toString());
            // return new ResponseEntity<>(userService.)
        } catch (Exception e) {
            log.error(e.getMessage());

        }
        return new ResponseEntity(DefaultResponseDTO.FAIL_DETAIL_RES, HttpStatus.INTERNAL_SERVER_ERROR);

    }

}
