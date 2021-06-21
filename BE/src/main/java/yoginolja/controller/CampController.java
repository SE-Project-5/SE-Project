package yoginolja.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import yoginolja.domain.Camp;
import yoginolja.dto.CampDTO;
import yoginolja.dto.DefaultResponseDTO;
import yoginolja.service.CampService;

import java.util.Date;

@RequiredArgsConstructor
@Slf4j
@Controller
public class CampController {

    @Autowired
    private final CampService campService;

    @GetMapping("/camp/{camp_idx}")
    public ResponseEntity getCampDetail(@PathVariable(value = "camp_idx")final Long camp_idx){
        try{

            return new ResponseEntity<>(campService.getCampInformationByGuest(camp_idx), HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage());
            return new ResponseEntity<>(DefaultResponseDTO.FAIL_DETAIL_RES,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/camp/updatecamp")
    public ResponseEntity updateCampDetail(@RequestBody final CampDTO campDTO, @RequestBody final Long host_idx){
        try{
           return new ResponseEntity<>(campService.updateCampInformation(host_idx,campDTO),HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage());
        }
            return new ResponseEntity(DefaultResponseDTO.FAIL_DETAIL_RES,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @GetMapping("/camp/search/{location}/{peoplenum}/{reservationdate}")
    public ResponseEntity searchCampList(@PathVariable(value = "location")final String location, @PathVariable(value = "peoplenum")final int peopleNum,
                                         @PathVariable(value = "reservationdate")final Date reservationDate){
        try{
            return new ResponseEntity<>(campService.getCampList(location,peopleNum,reservationDate),HttpStatus.OK);
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return new ResponseEntity(DefaultResponseDTO.FAIL_DETAIL_RES,HttpStatus.INTERNAL_SERVER_ERROR);
    }

}
