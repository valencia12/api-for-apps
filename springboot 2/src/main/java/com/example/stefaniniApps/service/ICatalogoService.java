package com.example.stefaniniApps.service;

import com.example.stefaniniApps.persistence.entity.Catalogo;

import java.util.List;

public interface ICatalogoService {
    /**
     * Return all catalogos
     * @return
     */
    List<Catalogo> getAllCatalogo();

    /**
     * Return all catalogos filter by category
     * @param category
     * @return
     */
    List<Catalogo> getAllCatalogoByCategory(String category);

    /**
     * Return catalogo by NAME
     * @return
     */
    Catalogo getCatalogoById(String id);

    /**
     * Initialize all the catalogo information
     */
    void createCatalogoFromScratch();
}
