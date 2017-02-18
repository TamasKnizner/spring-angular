package hu.kniznertamas.contentreader.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hu.kniznertamas.contentreader.domain.User;
import hu.kniznertamas.contentreader.service.UserReaderService;

@RestController
public class UserController {

    @Autowired
    private UserReaderService userReaderService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userReaderService.readUsers();
    }

}
