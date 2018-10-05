package com.goodjwon.learn.mongo.model;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Document
@Data
public class User {

    @Id
    private Long id;
    private String userId;
    private String userName;
    private String eamliAddress;
    //private List<UserGroup> affiliationUserGroups;

}
