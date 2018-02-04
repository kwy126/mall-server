package com.circle.service;

import com.circle.common.ServerResponse;
import com.circle.pojo.User;

/**
 * @Author:keweiyang
 * @Date:Created in 下午9:30 2018/2/3
 * @Description:
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);

    ServerResponse<String> register(User user);
}
