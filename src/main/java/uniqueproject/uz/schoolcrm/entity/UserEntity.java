package uniqueproject.uz.schoolcrm.entity;
import jakarta.persistence.*;
import lombok.*;
import uniqueproject.uz.schoolcrm.entity.enums.UserRole;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserEntity extends BaseEntity {
    private String phone;
    private String password;
    private UserRole role; // ADMIN, INSTRUCTOR, STUDENT

}

