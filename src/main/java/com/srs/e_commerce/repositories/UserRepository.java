package com.srs.e_commerce.repositories;

import com.srs.e_commerce.model.Comment;
import com.srs.e_commerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

}
