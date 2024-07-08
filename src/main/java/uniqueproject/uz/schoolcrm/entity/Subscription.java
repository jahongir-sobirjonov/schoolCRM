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
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String type; // e.g., Monthly, Yearly
    private Date startDate;
    private Date endDate;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Getters and setters
}

