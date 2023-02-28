package com.example.habsida_3_1_2v4.controller;


import com.example.habsida_3_1_2v4.entity.User;
import com.example.habsida_3_1_2v4.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String getAllUsers(Model model){
        List<User> allUsers =  userService.getAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "all-users";
    }
    @RequestMapping("/addNewUser")
    public String addNewUser(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "addNewUser";
    }
    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user){
        userService.saveUser(user);
        return "redirect:/";
    }
    @GetMapping("/updateUser={id}")
    public String updateUser(@PathVariable Long id, Model model){
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "addNewUser";
    }
    @GetMapping("/deleteUser={id}")
    public String deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
        return "redirect:/";
    }
}