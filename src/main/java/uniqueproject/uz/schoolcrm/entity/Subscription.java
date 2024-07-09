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
public class Subscription extends BaseEntity {
    private String type; // e.g., Monthly, Yearly
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
}

