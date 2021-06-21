package yoginolja.dto;


import lombok.*;
import lombok.experimental.SuperBuilder;
import yoginolja.domain.Guest;
import yoginolja.domain.User;
import yoginolja.domain.UserType;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder()
public class GuestDTO extends UserDTO {

    private Long idx;

    private String name;
    private String id;
    private String birthday;
    private UserType type;
    private String phoneNumber;
    private String email;
    private String password;
    private LocalDateTime registerAt;
    private LocalDateTime modifiedAt;


    public GuestDTO(Long idx, String name, String id, String birthday, UserType type, String phoneNumber, String email, String password, LocalDateTime registerAt, LocalDateTime modifiedAt, String hostNumber, Long idx1, String name1, String id1, String birthday1, UserType type1, String phoneNumber1, String email1, String password1, LocalDateTime registerAt1, LocalDateTime modifiedAt1) {
        super(idx, name, id, birthday, type, phoneNumber, email, password, registerAt, modifiedAt, hostNumber);
        this.idx = idx1;
        this.name = name1;
        this.id = id1;
        this.birthday = birthday1;
        this.type = type1;
        this.phoneNumber = phoneNumber1;
        this.email = email1;
        this.password = password1;
        this.registerAt = registerAt1;
        this.modifiedAt = modifiedAt1;
    }


    public Guest toEntity() {
        return Guest.builder()
                .idx(idx)
                .id(id)
                .name(name)
                .password(password)
                .phoneNumber(phoneNumber)
                .email(email)
                .type(type)
                .birthday(birthday)
                .registerAt(LocalDateTime.now())
                .build();
    }

    @Override
    public boolean checkProperties() {
        return (id != null && email != null && password !=null && name != null && type != null && birthday != null && phoneNumber != null );
    }
}
