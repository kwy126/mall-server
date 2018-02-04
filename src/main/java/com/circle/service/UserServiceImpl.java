package com.circle.service;

import com.circle.common.ServerResponse;
import com.circle.dao.UserMapper;
import com.circle.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:keweiyang
 * @Date:Created in 下午9:31 2018/2/3
 * @Description:
 */
@Service("iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    public ServerResponse<User> login(String username, String password) {
        int resultCount = userMapper.checkUsername(username);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        //TODO 密码登录MD5
        User user = userMapper.selectLogin(username, password);
        if (user == null) {
            return ServerResponse.createByErrorMessage("密码错误");
        }


        return ServerResponse.createBySuccess("登录成功", user);
    }

    public ServerResponse<String> register(User user) {
        int resultCount = userMapper.checkUsername(user.getUsername());
        if (resultCount > 0) {
            return ServerResponse.createByErrorMessage("用户名不存在");
        }

        resultCount = userMapper.checkEmail(user.getEmail());
        if (resultCount > 0) {
            return ServerResponse.createByErrorMessage("邮箱已存在");
        }

        return null;
    }
}
