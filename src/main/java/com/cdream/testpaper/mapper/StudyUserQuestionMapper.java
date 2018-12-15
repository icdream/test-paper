package com.cdream.testpaper.mapper;

import com.cdream.testpaper.pojo.StudyUserQuestion;
import com.cdream.testpaper.pojo.StudyUserQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyUserQuestionMapper {
    int countByExample(StudyUserQuestionExample example);

    int deleteByExample(StudyUserQuestionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StudyUserQuestion record);

    int insertSelective(StudyUserQuestion record);

    List<StudyUserQuestion> selectByExample(StudyUserQuestionExample example);

    StudyUserQuestion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StudyUserQuestion record, @Param("example") StudyUserQuestionExample example);

    int updateByExample(@Param("record") StudyUserQuestion record, @Param("example") StudyUserQuestionExample example);

    int updateByPrimaryKeySelective(StudyUserQuestion record);

    int updateByPrimaryKey(StudyUserQuestion record);
}