package yoginolja.domain;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;


@Getter @Setter
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_idx")
    protected Long idx;

    @Column(name = "user_id")
    protected String id;
    @Column(name = "user_name")
    protected String name;

    @Column(name = "user_birthday")
    protected String birthday;
    @Column(name = "user_password")
    protected String password;
    @Column(name = "user_email")
    protected String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "user_type")
    protected UserType type;

    @Column(name = "user_phone_number")
    protected String phoneNumber;

    @CreatedDate
    @Column(name = "user_register_at")
    protected LocalDateTime registerAt;
}
