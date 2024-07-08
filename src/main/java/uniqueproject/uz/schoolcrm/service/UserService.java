package uniqueproject.uz.schoolcrm.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import uniqueproject.uz.schoolcrm.entity.UserEntity;
import uniqueproject.uz.schoolcrm.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserEntity registerUser(UserEntity user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public String loginUser(String phone, String password) {
        UserEntity user = userRepository.findByPhone(phone)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (passwordEncoder.matches(password, user.getPassword())) {
            // Generate and return JWT token (implement JWT generation logic here)
            return "JWT_TOKEN";
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}

