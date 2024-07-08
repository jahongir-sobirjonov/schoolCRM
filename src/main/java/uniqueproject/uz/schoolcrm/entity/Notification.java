package uniqueproject.uz.schoolcrm.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;

    // Getters and setters
}

