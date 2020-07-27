package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.AttendanceMonthTotal;

public interface AttendanceMonthTotalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AttendanceMonthTotal record);

    int insertSelective(AttendanceMonthTotal record);

    AttendanceMonthTotal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AttendanceMonthTotal record);

    int updateByPrimaryKey(AttendanceMonthTotal record);
}