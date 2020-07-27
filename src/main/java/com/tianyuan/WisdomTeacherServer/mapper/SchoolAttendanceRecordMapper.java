package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolAttendanceRecord;

public interface SchoolAttendanceRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolAttendanceRecord record);

    int insertSelective(SchoolAttendanceRecord record);

    SchoolAttendanceRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolAttendanceRecord record);

    int updateByPrimaryKey(SchoolAttendanceRecord record);
}