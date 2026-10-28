package com.springpoly.demosshit.dao;
import com.springpoly.demosshit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

    // Derived Query : recherche par nom
    List<Produit> findByNomContains(String mc);

    // Requête JPQL personnalisée
    @Query("SELECT p FROM Produit p WHERE p.categorie.id = :idCat")
    List<Produit> getProduitsByCatId(@Param("idCat") Long idCat);
}