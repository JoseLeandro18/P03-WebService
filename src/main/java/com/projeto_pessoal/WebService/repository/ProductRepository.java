package com.projeto_pessoal.WebService.repository;

import com.projeto_pessoal.WebService.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
