package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.GradeDynameicNum;

public interface GradeDynameicNumMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GradeDynameicNum record);

    int insertSelective(GradeDynameicNum record);

    GradeDynameicNum selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GradeDynameicNum record);

    int updateByPrimaryKey(GradeDynameicNum record);
}