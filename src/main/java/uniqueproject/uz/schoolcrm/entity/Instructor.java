package uniqueproject.uz.schoolcrm.entity;
import java.util.List;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Instructor extends BaseEntity {
    private String name;
    private String bio;
    private String profilePictureUrl;

    @OneToMany(mappedBy = "instructor")
    private List<Lesson> lessons;
}

