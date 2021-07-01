package com.axsos.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.axsos.mvc.models.language;
// ...
@Repository
public interface languageRepository extends CrudRepository<language, Long>{
    // this method retrieves all the languages from the database
    List<language> findAll();
    // this method finds languages with descriptions containing the search string
    List<language> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a language that starts with a specific title
    Long deleteByTitleStartingWith(String search);
}
