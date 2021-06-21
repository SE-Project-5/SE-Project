package yoginolja.dto;


import lombok.*;
import yoginolja.domain.Camp;
import yoginolja.domain.Guest;
import yoginolja.domain.Reservation;

import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {

    private Long id;

    private Guest guest;

    private int peopleNum;

    private boolean isModified;

    private boolean isChecked;

    private int totalCost;

    private Date reservationDate;

    private Camp camp;



    public Reservation toEntity(){
        return Reservation.builder()
                .id(id)
                .camp(camp)
                .guest(guest)
                .isChecked(isChecked)
                .isModified(isModified)
                .peopleNum(peopleNum)
                .reservationDate(reservationDate)
                .totalCost(totalCost)
                .build();
    }
}
