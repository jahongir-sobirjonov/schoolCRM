package uniqueproject.uz.schoolcrm.entity;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Student extends BaseEntity {
    private String name;
    private Date birthDate;
    private String profilePictureUrl;

    @OneToMany(mappedBy = "student")
    private List<Lesson> lessons;

}

