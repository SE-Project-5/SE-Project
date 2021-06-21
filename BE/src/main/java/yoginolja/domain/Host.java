package yoginolja.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public class Host extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "host_idx")
    private Long idx;

    private String id;
    private String name;

    private String birthday;
    private String password;
    private String email;
    @Enumerated(EnumType.STRING)
    private UserType type;
    @Column(name = "user_host_number")
    protected String hostNumber;

    private String phoneNumber;

    @CreatedDate
    private LocalDateTime registerAt;


}
