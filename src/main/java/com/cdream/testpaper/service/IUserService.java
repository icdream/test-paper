package com.cdream.testpaper.service;

import com.cdream.testpaper.common.ServerResponse;
import com.cdream.testpaper.pojo.StudyUser;

/**
 * @author cdream
 * @date 2018/12/15
 */
public interface IUserService {
    /**
     * 用户登录方法
     * @param username 用户名
     * @param password 密码
     * @return 返回用户信息
     */
    ServerResponse<StudyUser> login(String username, String password);

    ServerResponse<String> checkValid(String content, String type);
}
