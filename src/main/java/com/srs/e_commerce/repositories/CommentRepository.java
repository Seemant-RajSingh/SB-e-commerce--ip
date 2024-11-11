package com.srs.e_commerce.repositories;

import com.srs.e_commerce.model.Cart;
import com.srs.e_commerce.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByProductId(Long productId);
}
