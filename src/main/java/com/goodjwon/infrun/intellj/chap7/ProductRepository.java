package com.goodjwon.infrun.intellj.chap7;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<Product, ObjectId> {

    Optional<Product> findByName(String name);
}
