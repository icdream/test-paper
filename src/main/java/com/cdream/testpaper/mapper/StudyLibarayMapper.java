package com.cdream.testpaper.mapper;

import com.cdream.testpaper.pojo.StudyLibaray;
import com.cdream.testpaper.pojo.StudyLibarayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyLibarayMapper {
    int countByExample(StudyLibarayExample example);

    int deleteByExample(StudyLibarayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudyLibaray record);

    int insertSelective(StudyLibaray record);

    List<StudyLibaray> selectByExampleWithBLOBs(StudyLibarayExample example);

    List<StudyLibaray> selectByExample(StudyLibarayExample example);

    StudyLibaray selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudyLibaray record, @Param("example") StudyLibarayExample example);

    int updateByExampleWithBLOBs(@Param("record") StudyLibaray record, @Param("example") StudyLibarayExample example);

    int updateByExample(@Param("record") StudyLibaray record, @Param("example") StudyLibarayExample example);

    int updateByPrimaryKeySelective(StudyLibaray record);

    int updateByPrimaryKeyWithBLOBs(StudyLibaray record);

    int updateByPrimaryKey(StudyLibaray record);
}