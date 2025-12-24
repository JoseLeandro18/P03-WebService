package com.projetopessoal.p03webservice.repositories;

import com.projetopessoal.p03webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
