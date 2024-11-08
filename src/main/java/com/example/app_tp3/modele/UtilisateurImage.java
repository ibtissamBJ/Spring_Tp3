package com.example.app_tp3.modele;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class UtilisateurImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomImage;

    @Column(nullable = false)
    private String cheminImage;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;

    public UtilisateurImage() {
        super();
    }

    // Getters, setters, etc.
}
