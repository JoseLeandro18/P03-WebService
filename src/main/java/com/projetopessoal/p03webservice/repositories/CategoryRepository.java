package com.projetopessoal.p03webservice.repositories;

import com.projetopessoal.p03webservice.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
