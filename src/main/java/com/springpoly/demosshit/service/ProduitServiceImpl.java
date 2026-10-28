package com.springpoly.demosshit.service;

import com.springpoly.demosshit.dao.ProduitRepository;
import com.springpoly.demosshit.entities.Produit;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProduitServiceImpl implements IgestionProduit {

    private final ProduitRepository produitRepository;

    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }

    @Override
    public Produit getProduitById(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public List<Produit> findByNom(String mc) {
        return produitRepository.findByNomContains(mc);
    }
}