package yoginolja.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
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
public class HostDTO extends UserDTO{

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


    public Host toEntity() {
        return Host.builder()
                .idx(idx)
                .id(id)
                .name(name)
                .password(password)
                .phoneNumber(phoneNumber)
                .email(email)
                .hostNumber(hostNumber)
                .type(type)
                .birthday(birthday)
                .registerAt(LocalDateTime.now())
                .build();
    }

    public boolean checkProperties() {
        if(hostNumber != null){
            return false;
        }
        return (id != null && email != null && password !=null && name != null && type != null && birthday != null && phoneNumber != null );
    }


}
