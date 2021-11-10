package com.reactive.psql.demo.reactivepostgres.dogs.dataproviders.db.repository;

import com.reactive.psql.demo.reactivepostgres.dogs.core.model.Dog;
import io.quarkus.hibernate.reactive.panache.PanacheRepository;
import io.smallrye.mutiny.Uni;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class DogRepository implements PanacheRepository<Dog> {
  public Uni<Dog> findByName(String name){
    return find("name", name).firstResult();
  }
}

