package uniqueproject.uz.schoolcrm.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import uniqueproject.uz.schoolcrm.entity.UserEntity;
import uniqueproject.uz.schoolcrm.service.UserService;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<UserEntity> registerUser(@RequestBody UserEntity user) {
        UserEntity createdUser = userService.registerUser(user);
        return ResponseEntity.status(201).body(createdUser);
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody LoginRequest loginRequest) {
        String token = userService.loginUser(loginRequest.getPhone(), loginRequest.getPassword());
        return ResponseEntity.ok(token);
    }
}

