package com.finflow.user;

import com.finflow.common.exception.BusinessException;
import com.finflow.user.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.finflow.user.dto.CreateUserRequest;
import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor

public class UserService {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserResponse create(CreateUserRequest request) {

        if(repository.existsByEmail(request.email())) {
            throw new BusinessException(
                    "Email already exists"
            );
        }

        User user = User.builder()
                .name(request.name())
                .email(request.email())
                .password(
                        passwordEncoder.encode(request.password())
                )
                .createdAt(LocalDateTime.now())
                .build();

        User savedUser = repository.save(user);

        return new UserResponse(
                savedUser.getId(),
                savedUser.getName(),
                savedUser.getEmail(),
                savedUser.getCreatedAt()
        );
    }
}