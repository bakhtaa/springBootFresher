package com.springpoly.demosshit.entities;



import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private double prix;
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}