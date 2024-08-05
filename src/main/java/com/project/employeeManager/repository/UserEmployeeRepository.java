package com.project.employeeManager.repository;

import com.project.employeeManager.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserEmployeeRepository extends JpaRepository<Users, Integer> {

    Optional<Users> findByUsername(String username);
}
