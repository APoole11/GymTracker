package com.example.gym_tracker_backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/users")
    public List<Integer> getAllUsers() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        return list;
    }
}
