package cn.lcvc.user.test.service;

import cn.lcvc.user.model.User;
import cn.lcvc.user.service.UserService;
import cn.lcvc.user.test.common.SpringJunitTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends SpringJunitTest{
    @Autowired
    private UserService userService;

    @Test
    public void loginTest(){
        User user = new User();
        user.setUsername("tomcat");
        user.setPassword("123456");
        System.out.println(userService.login(user));
    }
}
