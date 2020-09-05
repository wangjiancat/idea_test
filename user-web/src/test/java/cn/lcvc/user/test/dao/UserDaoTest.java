package cn.lcvc.user.test.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import cn.lcvc.user.dao.UserDao;
import cn.lcvc.user.model.User;
import cn.lcvc.user.test.common.SpringJunitTest;

public class UserDaoTest extends SpringJunitTest{
	  @Autowired
	  private UserDao userDao;

	  @Test
	  public void selectByConditionTest(){
	      User user = new User();
	      user.setUsername("tomcat");
	      user.setPassword("123456");
	      System.out.println(userDao.selectByCondition(user));
	  }
}
