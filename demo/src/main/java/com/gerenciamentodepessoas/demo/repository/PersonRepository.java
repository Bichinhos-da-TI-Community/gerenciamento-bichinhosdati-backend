package com.gerenciamentodepessoas.demo.repository;

import com.gerenciamentodepessoas.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Integer> {
}
