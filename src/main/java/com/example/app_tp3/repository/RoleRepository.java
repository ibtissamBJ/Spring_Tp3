package com.example.app_tp3.repository;

import com.example.app_tp3.modele.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByNom(String nom);
}
