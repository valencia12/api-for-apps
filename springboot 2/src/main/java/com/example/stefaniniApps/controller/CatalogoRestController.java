package com.example.stefaniniApps.controller;

import com.example.stefaniniApps.persistence.entity.Catalogo;
import com.example.stefaniniApps.service.impl.CatalogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatalogoRestController {

    @Autowired
    CatalogoService catalogoService;

    @CrossOrigin(origins ="http://localhost:3000/", allowCredentials = "true")
    @GetMapping("/catalogo")
    public List<Catalogo> getCatalogos(){
        catalogoService.createCatalogoFromScratch();
        List<Catalogo> listadoCatalogos = catalogoService.getAllCatalogo();
        return listadoCatalogos;
    }

    @CrossOrigin(origins ="http://localhost:3000/", allowCredentials = "true")
    @GetMapping("/catalogo_by_id")
    public Catalogo getCatalogoById(@RequestParam(name = "id") String id){
        System.out.println("mi pichula" + catalogoService.getCatalogoById(id));
        System.out.println();
        return catalogoService.getCatalogoById(id);
    }
    
    @CrossOrigin(origins ="http://localhost:3000/", allowCredentials = "true")
    @GetMapping("/catalogo_filter_by_category")
    public List<Catalogo> getAllCatalogosByCategory(@RequestParam(name = "category") String category){
        return catalogoService.getAllCatalogoByCategory(category);
    }



}
