package yoginolja.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import yoginolja.domain.Guest;
import yoginolja.domain.Host;
import yoginolja.domain.User;
import yoginolja.domain.UserType;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserDTO {
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
    private String hostNumber;

    public User toEntity(){
        return User.builder()
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


    public GuestDTO toGuestDTO(){
        return GuestDTO.builder()
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

    public HostDTO toHostDTO(){
        return HostDTO.builder()
                .idx(idx)
                .id(id)
                .name(name)
                .password(password)
                .phoneNumber(phoneNumber)
                .email(email)
                .type(type)
                .birthday(birthday)
                .hostNumber(hostNumber)
                .registerAt(LocalDateTime.now())
                .build();
    }
    public boolean checkProperties() {
        return (id != null && email != null && password !=null && name != null && type != null && birthday != null && phoneNumber != null );
    }
}
