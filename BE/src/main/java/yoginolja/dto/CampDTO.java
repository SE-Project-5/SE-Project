package yoginolja.dto;


import lombok.*;
import yoginolja.domain.Camp;
import yoginolja.domain.Host;
import yoginolja.domain.User;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CampDTO {


    private Long id;
    private String campName;
    private String campAddress;
    private boolean campIsFull;
    private float campReviewAvg;
    private int campMaxRoomNum;
    private int campCostPerHead;
    private int campOccupiedRoomNum;
    private Date possibleDate;
    private String campDetail;
    private String image1;
    private Host host;

    private LocalDateTime registerAt;

    public Camp toEntityForPost(){
        return Camp.builder()
                .id(id)
                .campName(campName)
                .campAddress(campAddress)
                .campIsFull(false)
                .campReviewAvg(0)
                .campMaxRoomNum(campMaxRoomNum)
                .campOccupiedRoomNum(0)
                .campCostPerHead(campCostPerHead)
                .campDetail(campDetail)
                .image1(image1)
                .possibleDate(possibleDate)
                .host(host)
                .registerAt(registerAt)
                .build();
    }

    public Camp toEntityForUpdate(){
        return Camp.builder()
                .id(id)
                .campName(campName)
                .campAddress(campAddress)
                .campIsFull(campIsFull)
                .campReviewAvg(campReviewAvg)
                .campMaxRoomNum(campMaxRoomNum)
                .campOccupiedRoomNum(campOccupiedRoomNum)
                .campCostPerHead(campCostPerHead)
                .campDetail(campDetail)
                .image1(image1)
                .possibleDate(possibleDate)
                .host(host)
                .build();
    }

    public boolean checkProperties(){
        return (campName !=null && campAddress != null && campDetail != null && campMaxRoomNum != 0  && image1 != null);
    }

}
