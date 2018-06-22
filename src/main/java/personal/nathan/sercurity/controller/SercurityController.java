package personal.nathan.sercurity.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import personal.nathan.sercurity.JwtUtil;
import personal.nathan.sercurity.domain.Token;
import personal.nathan.sercurity.domain.User;

/**
 * Description:
 *
 * Created by zhangwei on 2018/6/21.
 */
@RestController
public class SercurityController {


    @GetMapping("/token")
    public Object getToken(HttpServletRequest request, HttpServletResponse httpServletResponse,
        @RequestParam final String username, @RequestParam final String password) {
        // TODO 验证用户的有效性
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        String tokenStr = JwtUtil.generateToken(user);
        Token token = new Token();
        token.setToken(tokenStr);
        return token;
    }


}
