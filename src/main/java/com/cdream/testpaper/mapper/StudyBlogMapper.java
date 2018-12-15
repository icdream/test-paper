package com.cdream.testpaper.mapper;

import com.cdream.testpaper.pojo.StudyBlog;
import com.cdream.testpaper.pojo.StudyBlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyBlogMapper {
    int countByExample(StudyBlogExample example);

    int deleteByExample(StudyBlogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudyBlog record);

    int insertSelective(StudyBlog record);

    List<StudyBlog> selectByExample(StudyBlogExample example);

    StudyBlog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudyBlog record, @Param("example") StudyBlogExample example);

    int updateByExample(@Param("record") StudyBlog record, @Param("example") StudyBlogExample example);

    int updateByPrimaryKeySelective(StudyBlog record);

    int updateByPrimaryKey(StudyBlog record);
}