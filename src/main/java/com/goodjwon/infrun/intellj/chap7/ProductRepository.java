package com.goodjwon.infrun.intellj.chap7;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, Long> {

    Optional<Product> findByName(String name);
}
