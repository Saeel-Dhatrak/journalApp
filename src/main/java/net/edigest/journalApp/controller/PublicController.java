package net.edigest.journalApp.controller;

import net.edigest.journalApp.entity.User;
import net.edigest.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {

    @Autowired
    private UserService userService;
    @PostMapping
    public void createUser(@RequestBody User user){
        userService.saveNewUser(user);
    }
}
