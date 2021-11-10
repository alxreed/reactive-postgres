package com.reactive.psql.demo.reactivepostgres.dogs.dataproviders.db.repository;

import com.reactive.psql.demo.reactivepostgres.dogs.core.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DogRepository extends JpaRepository<Dog, Long> {
  Optional<Dog> findByName(String name);
}

