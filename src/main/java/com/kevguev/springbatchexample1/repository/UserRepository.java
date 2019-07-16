package com.kevguev.springbatchexample1.repository;

import com.kevguev.springbatchexample1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
