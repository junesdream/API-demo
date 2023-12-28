package com.rainbowdev.apidemo.service;

import com.rainbowdev.apidemo.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(1, "Mimi", 24, "mimi@gmail.com");
        User user2 = new User(2, "Nora", 29, "nora@mail.com");
        User user3 = new User(3, "Mike", 42, "mike@mail.com");
        User user4 = new User(4, "Jurin", 36, "jurin@mail.com");
        User user5 = new User(5, "Adina", 28, "adina@gmail.com");

        userList.addAll(Arrays.asList(user1,user2,user3,user4,user5));
    }

    public Optional<User> getUser(Integer id) {
        Optional<User> optional = Optional.empty();
        for(User user: userList) {
            if(id == user.getId()) {
                optional = Optional.of(user);
                return optional;
            }
        }
        return optional;
    }
}
