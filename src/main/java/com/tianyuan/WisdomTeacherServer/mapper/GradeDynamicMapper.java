package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.GradeDynamic;

public interface GradeDynamicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GradeDynamic record);

    int insertSelective(GradeDynamic record);

    GradeDynamic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GradeDynamic record);

    int updateByPrimaryKey(GradeDynamic record);
}