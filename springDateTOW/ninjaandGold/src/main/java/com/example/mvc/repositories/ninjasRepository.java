package com.example.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.mvc.models.DojoNinja;
import com.example.mvc.models.Ninja;
// ...
@Repository
public interface ninjasRepository extends CrudRepository<Ninja, Long>{
    // this method retrieves all the languages from the database
    List<Ninja> findAll();
    
    // this method finds languages with descriptions containing the search string
//    List<DojoNinja> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
//    Long countByTitleContaining(String search);
    // this method deletes a language that starts with a specific title
//    Long deleteByTitleStartingWith(String search);

}
