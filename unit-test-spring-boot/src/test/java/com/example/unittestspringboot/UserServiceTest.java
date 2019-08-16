package com.example.unittestspringboot;

import com.example.unittestspringboot.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class) // @RunWith: integrate spring with junit
@SpringBootTest(classes = {UnitTestSpringBootApplication.class}) // The main class
//@ContextConfiguration(classes = {UnitTestSpringBootApplication.class}) // an alternative
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testGetUser() {
        Assert.assertEquals(userService.getUser(), "Tom");
    }
}
