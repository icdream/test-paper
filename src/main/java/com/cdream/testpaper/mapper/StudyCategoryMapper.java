package com.cdream.testpaper.mapper;

import com.cdream.testpaper.pojo.StudyCategory;
import com.cdream.testpaper.pojo.StudyCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyCategoryMapper {
    int countByExample(StudyCategoryExample example);

    int deleteByExample(StudyCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudyCategory record);

    int insertSelective(StudyCategory record);

    List<StudyCategory> selectByExample(StudyCategoryExample example);

    StudyCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudyCategory record, @Param("example") StudyCategoryExample example);

    int updateByExample(@Param("record") StudyCategory record, @Param("example") StudyCategoryExample example);

    int updateByPrimaryKeySelective(StudyCategory record);

    int updateByPrimaryKey(StudyCategory record);
}