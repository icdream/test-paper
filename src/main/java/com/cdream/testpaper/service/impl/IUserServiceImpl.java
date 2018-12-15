package com.cdream.testpaper.service.impl;

import com.cdream.testpaper.common.Const;
import com.cdream.testpaper.common.ServerResponse;
import com.cdream.testpaper.mapper.StudyUserMapper;
import com.cdream.testpaper.pojo.StudyUser;
import com.cdream.testpaper.service.IUserService;
import com.cdream.testpaper.util.MD5Util;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cdream
 * @date 2018/12/15
 */
@Service
public class IUserServiceImpl implements IUserService {
    @Autowired
    private StudyUserMapper userMapper;
    @Override
    public ServerResponse<StudyUser> login(String username, String password) {
        //先判断用户名是否存在
        ServerResponse<String> validRespose = checkValid(username, Const.USERNAME);
        if(validRespose.isSuccess()){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        password = MD5Util.MD5EncodeUtf8(password);
        StudyUser user = userMapper.selectLogin(username, password);
        if (user == null) {
            return ServerResponse.createByErrorMessage("用户名或密码错误");
        }

        user.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess("登录成功", user);
    }


    @Override
    public ServerResponse<String> checkValid(String content, String type) {
        if (StringUtils.isNotBlank(type)) {
            if (Const.USERNAME.equals(type)) {
                int resultCount = userMapper.checkUsername(content);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("用户名已存在");
                }
            } else if (Const.EMAIL.equals(type)) {
                int resultCount = userMapper.checkEmail(content);
                if (resultCount > 0) {
                    return ServerResponse.createByErrorMessage("邮箱已被注册");
                }
            }
        } else {
            return ServerResponse.createByErrorMessage("参数错误");
        }
        return ServerResponse.createBySuccessMessage("校验成功");
    }
}
