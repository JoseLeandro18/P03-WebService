package com.projetopessoal.p03webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopessoal.p03webservice.entities.OrderItem;
import com.projetopessoal.p03webservice.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
