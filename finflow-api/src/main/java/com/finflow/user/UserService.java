package com.finflow.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.finflow.user.dto.CreateUserRequest;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository repository;

    public User create(CreateUserRequest request) {

        if(repository.existsByEmail(request.email())) {
            throw new RuntimeException("Email already exists");
        }

        User user = User.builder()
                .name(request.name())
                .email(request.email())
                .password(request.password())
                .createdAt(LocalDateTime.now())
                .build();

        return repository.save(user);
    }
}