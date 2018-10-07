package com.goodjwon.learn.mongo.service;

import com.goodjwon.learn.mongo.model.UserGroup;
import com.goodjwon.learn.mongo.repository.UserGroupRepository;
import org.springframework.stereotype.Service;

@Service
public class UserGroupService {

    private final UserGroupRepository userGroupRepository;

    public UserGroupService(UserGroupRepository userGroupRepository) {
        this.userGroupRepository = userGroupRepository;
    }

    public UserGroup register(UserGroup userGroup) {
        return userGroupRepository.save(userGroup);
    }
}
