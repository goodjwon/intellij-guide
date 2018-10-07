package com.goodjwon.learn.mongo.repository;

import com.goodjwon.learn.mongo.model.UserGroup;
import com.goodjwon.learn.mongo.service.UserGroupService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserGroupRepositoryTest {

    @Autowired
    UserGroupRepository userGroupRepository;

    @Autowired
    UserGroupService userGroupService;

    @Before
    public void teatUp() throws Exception {
        userGroupRepository.deleteAll();
    }

    @After
    public void tearDown() throws Exception {
//        userGroupRepository.deleteAll();
    }


    @Test
    public void testInsertUserGroup() {

        UserGroup userGroup = userGroupRepository.save(
                new UserGroup("201812234", "asdf"));

        assertThat(userGroup.getUserGroupName(), is("asdf"));


        userGroup = userGroupService.register(
                new UserGroup("201812235", "asdf2"));

        assertThat(userGroup.getUserGroupName(), is("asdf2"));

    }

    @Test
    public void testSelectUserGroup() {

    }
}