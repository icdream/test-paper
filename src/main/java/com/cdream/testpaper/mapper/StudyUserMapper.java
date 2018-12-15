package com.cdream.testpaper.mapper;

import com.cdream.testpaper.pojo.StudyUser;
import com.cdream.testpaper.pojo.StudyUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudyUserMapper {
    int countByExample(StudyUserExample example);

    int deleteByExample(StudyUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudyUser record);

    int insertSelective(StudyUser record);

    List<StudyUser> selectByExample(StudyUserExample example);

    StudyUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudyUser record, @Param("example") StudyUserExample example);

    int updateByExample(@Param("record") StudyUser record, @Param("example") StudyUserExample example);

    int updateByPrimaryKeySelective(StudyUser record);

    int updateByPrimaryKey(StudyUser record);

    /**
     * 检查用户名是否存在
     * @param username
     * @return
     */
    int checkUsername(String username);

    /**
     * 检查邮箱是否已经被注册
     * @param email
     * @return
     */
    int checkEmail(String email);

    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    StudyUser selectLogin(@Param("username") String username, @Param("password") String password);
}