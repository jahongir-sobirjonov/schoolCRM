package uniqueproject.uz.schoolcrm.entity;

import jakarta.persistence.*;
@Entity
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String phone;
    private String password;
    private String role; // ADMIN, INSTRUCTOR, STUDENT

    // Getters and setters
}

