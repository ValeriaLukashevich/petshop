package com.example.petshop.user;

import com.example.petshop.validation.Validation;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    public User getValidUser(String name, String password) {
        Optional<User> userOptional = userRepository.findBy(name, password);
        Validation.validateCorrectCredentials(userOptional);
        User user = userOptional.get();
        return user;

    }

    public User getUserByUserId(Integer userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.get();
        return user;
    }
}
