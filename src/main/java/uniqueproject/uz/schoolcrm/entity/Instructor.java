package uniqueproject.uz.schoolcrm.entity;

import jakarta.persistence.*;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String bio;
    private String profilePictureUrl;

    @OneToMany(mappedBy = "instructor")
    private List<Lesson> lessons;

    // Getters and setters
}

