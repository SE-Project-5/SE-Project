package yoginolja.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class Guest extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guest_idx")
    private Long idx;

    private String id;
    private String name;

    private String birthday;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private UserType type;

    private String phoneNumber;

    @CreatedDate
    private LocalDateTime registerAt;

    @OneToMany(mappedBy = "guest",cascade = CascadeType.ALL)
    private List<CLike> CLikeList = new ArrayList<>();
}
