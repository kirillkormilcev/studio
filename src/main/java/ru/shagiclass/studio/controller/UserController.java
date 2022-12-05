package ru.shagiclass.studio.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.shagiclass.studio.dao.UserDao;
import ru.shagiclass.studio.model.User;

import java.util.*;

@Slf4j
@Controller
@RequestMapping("/user")
@Getter
@RequiredArgsConstructor
public class UserController {
    private final UserDao userDao;

    @PostMapping
    public String addUserForm(User user) {
        userDao.save(user);
        return "redirect: /user";
    }

    @GetMapping
    public String getUsersForm() {
        return "users";
    }

    @ModelAttribute(name="users")
    public List<User> getUsers() {
        return userDao.findAll();
    }

    @ModelAttribute(name="user")
    public User getUser() {
        return new User();
    }
}
