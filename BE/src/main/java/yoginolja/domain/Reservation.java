package yoginolja.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue
    @Column(name = "reservation_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "guest_idx")
    private Guest guest;

    @Column(name = "reservation_people_num")
    private int peopleNum;

    @Column(name = "reservation_is_modified")
    private boolean isModified;

    @Column(name = "reservation_is_checked")
    private boolean isChecked;

    @Column(name = "reservation_total_cost")
    private int totalCost;

    private Date reservationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "camp_id")
    private Camp camp;
}
