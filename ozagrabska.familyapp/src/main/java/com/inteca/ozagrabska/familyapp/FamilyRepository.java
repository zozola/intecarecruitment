package com.inteca.ozagrabska.familyapp;

import org.springframework.data.repository.CrudRepository;
import java.util.Optional;

public interface FamilyRepository extends CrudRepository<Family, Integer> {

    Optional<Family> findById(Integer id);
}
