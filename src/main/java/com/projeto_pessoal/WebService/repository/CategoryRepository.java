package com.projeto_pessoal.WebService.repository;

import com.projeto_pessoal.WebService.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
