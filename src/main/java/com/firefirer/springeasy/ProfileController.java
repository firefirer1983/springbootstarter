package com.firefirer.springeasy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.firefirer.springeasy.UserProfile;


@RestController
public class ProfileController {

    @RequestMapping("/profile")
    public UserProfile getProfile() {
        UserProfile user = new UserProfile("fyman.zhang", "xy", "unbind", false, new String [] {"dba", "user"});
        return user;
    }

}
