package uniqueproject.uz.schoolcrm.entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
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

