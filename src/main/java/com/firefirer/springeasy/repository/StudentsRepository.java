package com.firefirer.springeasy.repository;


import com.firefirer.springeasy.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students, Integer> {
}
