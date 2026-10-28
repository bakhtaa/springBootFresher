package com.springpoly.demosshit.dao;

import com.springpoly.demosshit.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository
        extends JpaRepository<Categorie, Long> {

}