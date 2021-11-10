package com.reactive.psql.demo.reactivepostgres.dogs.entrypoints;

import com.reactive.psql.demo.reactivepostgres.dogs.core.model.Dog;
import com.reactive.psql.demo.reactivepostgres.dogs.dataproviders.db.repository.DogRepository;
import io.smallrye.mutiny.Uni;
import org.jboss.resteasy.reactive.RestPath;


import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

@Path("/api/dogs")
public class DogResource {

  @Inject
  DogRepository dogRepository;

  @GET
  public Uni<List<Dog>> getAll() {
    return dogRepository.listAll();
  }

  @GET
  @Path("/{name}")
  public Uni<Dog> getOne(@RestPath String name) {
    return dogRepository.findByName(name);
  }
}
