package com.retoDisney.retoDisney.domain.repository;

import com.retoDisney.retoDisney.domain.model.User;

import java.util.Optional;

public interface UserRepository {
    User save(User user);

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}
