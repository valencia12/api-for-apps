package com.example.stefaniniApps.persistence.repository;

import com.example.stefaniniApps.persistence.entity.Catalogo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatalogoRepository extends MongoRepository<Catalogo,String> {
    //
    //    @Query("{name:'^s'}")
    @Query("{id : {$regex:?0}}")
    Catalogo findByCharacter(String id);

    @Query("{category : {$regex :?0}}")
    List<Catalogo> findAllByCategory(String category);

    List<Catalogo> findAll();

    public long count();

}
