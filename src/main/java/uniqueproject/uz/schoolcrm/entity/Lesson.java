package uniqueproject.uz.schoolcrm.entity;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Lesson extends BaseEntity {
    private Date date;
    private String location;

    @ManyToOne
    @JoinColumn(name = "instructor_id")
    private Instructor instructor;


    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Getters and setters
}

