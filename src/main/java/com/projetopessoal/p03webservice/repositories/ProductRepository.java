package com.projetopessoal.p03webservice.repositories;

import com.projetopessoal.p03webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
