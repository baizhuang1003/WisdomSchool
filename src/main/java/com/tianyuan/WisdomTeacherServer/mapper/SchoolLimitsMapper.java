package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolLimits;

public interface SchoolLimitsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolLimits record);

    int insertSelective(SchoolLimits record);

    SchoolLimits selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolLimits record);

    int updateByPrimaryKey(SchoolLimits record);
}