package com.goodjwon.learn.mongo.repository;

import com.goodjwon.learn.mongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
