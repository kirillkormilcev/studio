package ru.shagiclass.studio.controller;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.shagiclass.studio.model.User;

import java.util.*;

@Slf4j
@Controller
@RequestMapping("/user")
@Getter
public class UserController {
    private final Map<Long, User> users = new HashMap<>();
    Long userId = 2L;

    public UserController() {
        users.put(1L, User.builder()
                        .id(1L)
                        .name("Кирилл")
                        .phone("7987983465490")
                .build());
        users.put(2L, User.builder()
                .id(2L)
                .name("Кириллка")
                .phone("79879838746549")
                .build());
    }

    @PostMapping
    public String addUserForm(User user) {
        user.setId(++userId);
        users.put(user.getId(), user);
        return "redirect: /user";
    }

    @GetMapping
    public String getUsersForm() {
        return "users";
    }

    @ModelAttribute(name="users")
    public Map<Long, User> getUsers() {
        return users;
    }

    @ModelAttribute(name="user")
    public User getUser() {
        return User.builder().build();
    }
}
