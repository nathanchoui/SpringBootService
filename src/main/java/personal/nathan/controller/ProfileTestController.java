package personal.nathan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * Created by zhangwei on 2018/6/19.
 */
@RestController
public class ProfileTestController {


    @GetMapping("/profile")
    public String profile(@Value("${profile}") String profile) {
        return profile;
    }
}
