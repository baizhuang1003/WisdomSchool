package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.AttendanceWeeekTotal;

public interface AttendanceWeeekTotalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AttendanceWeeekTotal record);

    int insertSelective(AttendanceWeeekTotal record);

    AttendanceWeeekTotal selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AttendanceWeeekTotal record);

    int updateByPrimaryKey(AttendanceWeeekTotal record);
}