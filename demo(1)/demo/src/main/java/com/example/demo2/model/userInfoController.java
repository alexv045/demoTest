package com.example.demo2.model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/userInfo")
public class userInfoController {
    private userInfoRepository userinfoRepository;

    public userInfoController(userInfoRepository userinfoRepository) {
        this.userinfoRepository = userinfoRepository;
    }
    @GetMapping("/all")
    public List<userInfo> getAll(){
        List<userInfo> user_Info = this.userinfoRepository.findAll();

        return user_Info;
    }
}
