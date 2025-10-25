package com.projeto_pessoal.WebService.repository;

import com.projeto_pessoal.WebService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
