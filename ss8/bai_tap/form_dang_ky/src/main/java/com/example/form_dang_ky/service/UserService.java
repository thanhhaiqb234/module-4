package com.example.form_dang_ky.service;

import com.example.form_dang_ky.model.User;
import com.example.form_dang_ky.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;
    @Override
    public Page<User> findAll(Pageable pageable,String name) {
        return userRepository.findAllByNameContaining(pageable,name);
    }

    @Override
    public void createUser(User user) {
        userRepository.save(user);
    }
}
