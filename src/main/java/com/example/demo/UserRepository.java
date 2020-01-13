package com.example.demo;

import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/*
JPARepository provides built-in functions for CRUD methods
Can be replaced with CrudRepository
JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository and has therefore more functionalities
 */

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String username);
}
