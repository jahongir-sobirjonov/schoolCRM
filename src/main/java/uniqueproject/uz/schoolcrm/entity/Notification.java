package uniqueproject.uz.schoolcrm.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Notification extends BaseEntity {
    private String message;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}

