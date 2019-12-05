package com.firefirer.springeasy.repository;


import com.firefirer.springeasy.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
}
