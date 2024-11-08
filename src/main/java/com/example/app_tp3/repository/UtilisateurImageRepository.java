package com.example.app_tp3.repository;

import com.example.app_tp3.modele.UtilisateurImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UtilisateurImageRepository extends JpaRepository<UtilisateurImage,Long> {
    Optional<UtilisateurImage> findByUtilisateur(UtilisateurImage utilisateurImage);
}
