package com.goodjwon.learn.mongo.dao;

import com.goodjwon.learn.mongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDao extends MongoRepository<User, String> {
}
