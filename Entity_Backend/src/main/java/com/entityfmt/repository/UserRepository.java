package com.entityfmt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entityfmt.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
  Optional<Users> findByEmail(String email);

  Boolean existsByEmail(String email);
  
}
