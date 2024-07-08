package uniqueproject.uz.schoolcrm.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class LoginRequest {
    private String phone;
    private String password;
}
