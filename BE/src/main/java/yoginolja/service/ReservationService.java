package yoginolja.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import yoginolja.domain.Reservation;
import yoginolja.dto.DefaultResponseDTO;
import yoginolja.dto.ReservationDTO;
import yoginolja.repository.ReservationRepository;
import yoginolja.utils.ResponseMessage;
import yoginolja.utils.StatusCode;

import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class ReservationService {

    @Autowired
    private ReservationRepository reservationRepository;


    @Transactional
    public DefaultResponseDTO AddReservation(Long guestIdx, ReservationDTO reservationDTO){

        Optional<Reservation> reservation = reservationRepository.findById(guestIdx);
        if(reservation.isEmpty()){
            try{
                reservationRepository.save(reservationDTO.toEntity());
                return DefaultResponseDTO.res(StatusCode.CREATED, ResponseMessage.ADD_RESERVATION_SUCCESS);
            }catch (Exception e){
                return DefaultResponseDTO.res(StatusCode.DB_ERROR, ResponseMessage.DB_ERROR);

            }
        }else{
            return DefaultResponseDTO.res(StatusCode.BAD_REQUEST,"INVALID_RESERVATION_INFORM");
        }
    }


}
