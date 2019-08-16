package com.example.unittestspringboot.service;

import com.example.unittestspringboot.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;

    public String getUser() {
        return userDao.getUser();
    }
}
