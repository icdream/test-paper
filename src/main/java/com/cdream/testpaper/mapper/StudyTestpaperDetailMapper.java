package com.cdream.testpaper.mapper;

import com.cdream.testpaper.pojo.StudyTestpaperDetail;
import com.cdream.testpaper.pojo.StudyTestpaperDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudyTestpaperDetailMapper {
    int countByExample(StudyTestpaperDetailExample example);

    int deleteByExample(StudyTestpaperDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudyTestpaperDetail record);

    int insertSelective(StudyTestpaperDetail record);

    List<StudyTestpaperDetail> selectByExample(StudyTestpaperDetailExample example);

    StudyTestpaperDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudyTestpaperDetail record, @Param("example") StudyTestpaperDetailExample example);

    int updateByExample(@Param("record") StudyTestpaperDetail record, @Param("example") StudyTestpaperDetailExample example);

    int updateByPrimaryKeySelective(StudyTestpaperDetail record);

    int updateByPrimaryKey(StudyTestpaperDetail record);
}