package com.projetopessoal.p03webservice.repositories;

import com.projetopessoal.p03webservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
