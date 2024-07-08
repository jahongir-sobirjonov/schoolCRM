package uniqueproject.uz.schoolcrm.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Date birthDate;
    private String profilePictureUrl;

    @OneToMany(mappedBy = "student")
    private List<Lesson> lessons;

    // Getters and setters
}

