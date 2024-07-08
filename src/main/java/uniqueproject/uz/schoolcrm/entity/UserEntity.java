package uniqueproject.uz.schoolcrm.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;
import uniqueproject.uz.schoolcrm.entity.enums.UserRole;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    private String password;
    private UserRole role; // ADMIN, INSTRUCTOR, STUDENT

}

