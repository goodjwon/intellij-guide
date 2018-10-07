package com.goodjwon.learn.mongo.repository;

import com.goodjwon.learn.mongo.model.UserGroup;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserGroupRepository extends MongoRepository<UserGroup, ObjectId> {

    Optional<UserGroup> findByUserGroupName(String userGroupName);
}
