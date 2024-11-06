package com.example.demo.controller;

import com.example.demo.dto.RequestDelete;
import com.example.demo.dto.RequestName;
import com.example.demo.entity.User;
import com.example.demo.exception.UserException;
import com.example.demo.repository.UserRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class Test {
    private final UserRepository userRepository;

    @GetMapping("/getName")
    @ResponseBody
    List<User> getName() throws UserException {
        return userRepository.findAll();
    }

    @PostMapping("/create")
    String createName(@Valid RequestName name){
        return name.getName();
    }

    @DeleteMapping("/deleteIds")
    String deleteIds(@RequestBody RequestDelete request) {
        userRepository.deleteAllById(request.getIds());
        return "";
    }
}
