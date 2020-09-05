package cn.lcvc.user.dao;

import cn.lcvc.user.model.User;

/**
 * 用户DAO接口
 * @author Administrator
 *
 */
public interface UserDao {

	public User selectByCondition(User user);
}

