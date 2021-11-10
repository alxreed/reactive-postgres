package com.reactive.psql.demo.reactivepostgres.dogs.core.model;

import lombok.Builder;
import lombok.Value;
import org.springframework.data.annotation.Id;

@Value
@Builder
public class Dog {
  @Id
  Long id;
  String name;
}
