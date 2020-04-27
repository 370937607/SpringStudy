package com.niit.vhrend.mapper;

import com.niit.vhrend.model.JObLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JObLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JObLevel record);

    int insertSelective(JObLevel record);

    JObLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JObLevel record);

    int updateByPrimaryKey(JObLevel record);

    List<JObLevel> getAllJobLevels();

    Integer deleteJobLevelsByIds(@Param("ids") Integer[] ids);
}