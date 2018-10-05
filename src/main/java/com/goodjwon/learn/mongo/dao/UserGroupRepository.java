package com.goodjwon.learn.mongo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserGroupRepository extends MongoRepository <UserGroupRepository, String> {
}
