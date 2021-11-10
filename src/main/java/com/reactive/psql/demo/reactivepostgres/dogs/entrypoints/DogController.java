package com.reactive.psql.demo.reactivepostgres.dogs.entrypoints;

import com.reactive.psql.demo.reactivepostgres.dogs.core.model.Dog;
import com.reactive.psql.demo.reactivepostgres.dogs.dataproviders.db.repository.DogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/dogs")
@RequiredArgsConstructor
public class DogController {

  private final DogRepository dogRepository;

  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
  public Flux<Dog> getAll() {
    return dogRepository.findAll();
  }

  @GetMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<Dog> getOne(@PathVariable String name) {
    return dogRepository.findByName(name);
  }
}
