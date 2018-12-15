package com.cdream.testpaper.controller.backend;

import com.cdream.testpaper.common.Const;
import com.cdream.testpaper.common.ServerResponse;
import com.cdream.testpaper.pojo.StudyUser;
import com.cdream.testpaper.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author cdream
 * @date 2018/12/15
 */
@Controller
@RequestMapping("/manage/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    @ResponseBody
    public ServerResponse<StudyUser> login(String username, String password, HttpSession session) {
        ServerResponse<StudyUser> response = iUserService.login(username, password);
        if (response.isSuccess()) {
            StudyUser user = response.getData();
            if (Const.Role.ROLE_ADMIN == user.getRole()) {
                session.setAttribute(Const.CURRENT_USER, user);
                return response;
            } else {
                return ServerResponse.createByErrorMessage("不是管理员无法登录");
            }
        }
        return response;
    }
}
