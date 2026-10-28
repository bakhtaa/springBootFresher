package com.springpoly.demosshit.entities;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String description;

    @OneToMany(mappedBy = "categorie",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Produit> produits;
}