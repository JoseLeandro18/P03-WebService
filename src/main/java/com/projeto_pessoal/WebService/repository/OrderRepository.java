package com.projeto_pessoal.WebService.repository;

import com.projeto_pessoal.WebService.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
