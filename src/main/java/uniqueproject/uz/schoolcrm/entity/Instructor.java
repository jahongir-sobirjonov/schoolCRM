package uniqueproject.uz.schoolcrm.entity;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private String bio;
    private String profilePictureUrl;

    @OneToMany(mappedBy = "instructor")
    private List<Lesson> lessons;

    // Getters and setters
}

