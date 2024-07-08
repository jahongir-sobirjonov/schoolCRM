package uniqueproject.uz.schoolcrm.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type; // e.g., Monthly, Yearly
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Getters and setters
}

