package com.example.securitytestdemo.service;

import com.example.securitytestdemo.mapper.UserMapper;
import com.example.securitytestdemo.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lenovo
 */
@Service
public class UserService implements UserDetailsService {
    @Resource
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userMapper.loadUserByUsername(username);
        if (user == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        user.setRoles(userMapper.getUserRolesById(user.getId()));
        return user;
    }



}
