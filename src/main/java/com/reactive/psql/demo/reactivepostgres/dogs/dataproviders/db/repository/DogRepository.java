package com.reactive.psql.demo.reactivepostgres.dogs.dataproviders.db.repository;

import com.reactive.psql.demo.reactivepostgres.dogs.core.model.Dog;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface DogRepository extends R2dbcRepository<Dog, Long> {
  Mono<Dog> findByName(String name);
}

