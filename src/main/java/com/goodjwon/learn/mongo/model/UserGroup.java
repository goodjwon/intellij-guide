package com.goodjwon.learn.mongo.model;

import lombok.Builder;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document
public class UserGroup {
    @Id
    private ObjectId id;
    private String uesrGroupId;
    private String userGroupName;
    //private List<UserGroup> groupHierarchy;

    @Builder
    public UserGroup(String uesrGroupId, String userGroupName) {
        this.uesrGroupId = uesrGroupId;
        this.userGroupName = userGroupName;
    }

    public String getUesrGroupId() {
        return uesrGroupId;
    }

    public String getUserGroupName() {
        return userGroupName;
    }
}
