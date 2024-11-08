package com.example.app_tp3.repository;

import com.example.app_tp3.modele.Role;
import com.example.app_tp3.modele.Utilisateur;
import com.example.app_tp3.modele.UtilisateurImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {

    Optional<Utilisateur> findByEmail(String email);
    List<Utilisateur> findByRole(Role role);


    List<Utilisateur> findByRoleNom(String roleName);
}
