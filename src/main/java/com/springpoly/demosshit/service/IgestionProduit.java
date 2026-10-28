package com.springpoly.demosshit.service;

import com.springpoly.demosshit.entities.Produit;

import java.util.List;

public interface IgestionProduit {

    Produit saveProduit(Produit p);

    Produit updateProduit(Produit p);

    void deleteProduit(Long id);

    Produit getProduitById(Long id);

    List<Produit> getAllProduits();

    List<Produit> findByNom(String mc);
}
