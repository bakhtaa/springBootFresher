package com.springpoly.demosshit;

import com.springpoly.demosshit.dao.CategorieRepository;
import com.springpoly.demosshit.entities.Categorie;
import com.springpoly.demosshit.entities.Produit;
import com.springpoly.demosshit.service.IgestionProduit;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GestionProduitApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestionProduitApplication.class, args);
    }

    // Declared as a Bean : Spring manages its lifecycle
    @Bean
    CommandLineRunner initData(IgestionProduit produitService,
                               CategorieRepository categorieRepo) {
        return args -> {
            // 1. Creation et sauvegarde des categories
            Categorie cat1 = categorieRepo.save(
                    Categorie.builder()
                            .nom("Electronique")
                            .description("Appareils electroniques")
                            .build()
            );
            Categorie cat2 = categorieRepo.save(
                    Categorie.builder()
                            .nom("Alimentaire")
                            .description("Produits alimentaires")
                            .build()
            );

            // 2. Creation et sauvegarde des produits
            produitService.saveProduit(
                    Produit.builder()
                            .nom("Laptop Dell")
                            .prix(1200.0)
                            .quantite(5)
                            .categorie(cat1)
                            .build()
            );
            produitService.saveProduit(
                    Produit.builder()
                            .nom("Huile d'Olive")
                            .prix(8.5)
                            .quantite(100)
                            .categorie(cat2)
                            .build()
            );

            System.out.println("Donnees initialisees avec succes !");
        };
    }
}


