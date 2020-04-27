package com.huzz.service.impl;


import com.huzz.mapper.UserDao;
import com.huzz.pojo.UserDto;
import com.huzz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDto getUser(String userName) {
        return userDao.selectByLoginName(userName);
    }

}
