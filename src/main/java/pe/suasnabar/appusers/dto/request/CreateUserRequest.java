package pe.suasnabar.appusers.dto.request;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {

    private Integer id;
    private String email;
    private String password;
    private String name;
}
