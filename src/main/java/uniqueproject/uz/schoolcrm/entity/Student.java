package uniqueproject.uz.schoolcrm.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private Date birthDate;
    private String profilePictureUrl;

    @OneToMany(mappedBy = "student")
    private List<Lesson> lessons;

}

