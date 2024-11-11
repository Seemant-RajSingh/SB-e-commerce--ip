package com.srs.e_commerce.repositories;

import com.srs.e_commerce.model.Cart;
import com.srs.e_commerce.model.Comment;
import com.srs.e_commerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByUserId(Long userId);
}
