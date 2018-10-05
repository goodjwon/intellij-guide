package com.goodjwon.learn.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserGroupDao extends MongoRepository <UserGroupDao, String> {
}
