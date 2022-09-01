package com.udacity.DogGraphQL.repository;

import com.udacity.DogGraphQL.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
