package yoginolja.domain;


import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Camp {

    @Id
    @GeneratedValue
    @Column(name = "camp_id")
    private Long id;


    private String campAddress;

    private String campName;
    private boolean campIsFull;
    private int campCostPerHead ;  //인당 가격
    private float campReviewAvg;
    private int campMaxRoomNum;
    private int campOccupiedRoomNum;
    private Date possibleDate;




    @OneToOne
    @JoinColumn(name = "host_idx")
    private Host host;

    private String campDetail;

    private String image1;

    @OneToMany(mappedBy = "camp",cascade = CascadeType.ALL)
    private List<Review> reviewList = new ArrayList<>();


    @CreatedDate
    private LocalDateTime registerAt;


    public boolean isCampFull(int campMaxRoomNum, int campOccupiedRoomNum){
        if(campMaxRoomNum - campOccupiedRoomNum > 0){
            campIsFull = false;
            return true;
        }else
            campIsFull = true;
            return false;
    }

    public void subCampOccupiedNum(){
        campOccupiedRoomNum--;
    }

    public void addCampOccupiedNum(){
        campOccupiedRoomNum++;
    }

    @OneToMany(mappedBy = "camp",cascade = CascadeType.ALL)
    private List<CLike> CLikeList = new ArrayList<>();


}
