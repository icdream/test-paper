package com.cdream.testpaper.mapper;

import com.cdream.testpaper.pojo.StudyTestpaper;
import com.cdream.testpaper.pojo.StudyTestpaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyTestpaperMapper {
    int countByExample(StudyTestpaperExample example);

    int deleteByExample(StudyTestpaperExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudyTestpaper record);

    int insertSelective(StudyTestpaper record);

    List<StudyTestpaper> selectByExample(StudyTestpaperExample example);

    StudyTestpaper selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudyTestpaper record, @Param("example") StudyTestpaperExample example);

    int updateByExample(@Param("record") StudyTestpaper record, @Param("example") StudyTestpaperExample example);

    int updateByPrimaryKeySelective(StudyTestpaper record);

    int updateByPrimaryKey(StudyTestpaper record);
}