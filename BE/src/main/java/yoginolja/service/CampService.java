package yoginolja.service;


import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yoginolja.domain.Camp;
import yoginolja.dto.CampDTO;
import yoginolja.dto.DefaultResponseDTO;
import yoginolja.dto.UserDTO;
import yoginolja.repository.CampRepository;
import yoginolja.utils.ResponseMessage;
import yoginolja.utils.StatusCode;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Slf4j
@AllArgsConstructor
@Service
public class CampService {

    @Autowired
    private CampRepository campRepository;
    public DefaultResponseDTO getCampInformationByHost(Long hostIdx){

        Optional<Camp> camp = campRepository.findByHostId(hostIdx);
        if(camp != null){
            return DefaultResponseDTO.res(StatusCode.OK,ResponseMessage.GET_CAMP_INFORMATION_SUCCESS,camp);
        }

        return DefaultResponseDTO.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
    }

    public DefaultResponseDTO getCampInformationByGuest(Long campIdx){

        Optional<Camp> camp = campRepository.findById(campIdx);
        if(camp != null){
            return DefaultResponseDTO.res(StatusCode.OK,ResponseMessage.GET_CAMP_INFORMATION_SUCCESS,camp);
        }

        return DefaultResponseDTO.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
    }


    public DefaultResponseDTO updateCampInformation(Long hostIdx, CampDTO campDTO) {
        Optional<Camp> camp = campRepository.findByHostId(hostIdx);

        if (campDTO.checkProperties()) {
            if (camp.isEmpty()) {
                //불러온 캠프가 없어 새로 등록 하는 과정
                try {
                    campRepository.save(campDTO.toEntityForPost());
                    return DefaultResponseDTO.res(StatusCode.CREATED, ResponseMessage.POST_CAMP_INFORMATION_SUCCESS);
                } catch (Exception e) {
                    log.error(e.getMessage());
                    return DefaultResponseDTO.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
                }
            } else {
                //update
                try {
                    campRepository.save(campDTO.toEntityForUpdate());
                    return DefaultResponseDTO.res(StatusCode.CREATED, ResponseMessage.UPDATE_CAMP_INFORMATION_SUCCESS);
                } catch (Exception e) {
                    return DefaultResponseDTO.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);
                }
            }
        } else {
            return DefaultResponseDTO.res(StatusCode.BAD_REQUEST, ResponseMessage.INVALID_CAMP_INFORMATION);
        }
    }


    public DefaultResponseDTO getCampList(String location , int peopleNum , Date reservationDate){
        try{
            Optional<List<Camp>> campList = campRepository.findByCampAddressIsLikeAndCampIsFullIsFalseAndPossibleDateIs(location,reservationDate);
            if(campList != null){
                return DefaultResponseDTO.res(StatusCode.OK,ResponseMessage.GET_CAMP_LIST_SUCCESS,campList);
            }
                return DefaultResponseDTO.res(StatusCode.OK,ResponseMessage.NO_CONDITION_CAMP_LIST);
            }catch (Exception e){
            return DefaultResponseDTO.res(StatusCode.BAD_REQUEST,ResponseMessage.INVALID_CAMP_SEARCH_INPUT);
        }

    }
}
