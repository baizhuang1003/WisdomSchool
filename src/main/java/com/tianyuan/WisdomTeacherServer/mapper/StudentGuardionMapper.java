package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.StudentGuardion;
import com.tianyuan.WisdomTeacherServer.bean.StudentGuardionKey;

public interface StudentGuardionMapper {
    int deleteByPrimaryKey(StudentGuardionKey key);

    int insert(StudentGuardion record);

    int insertSelective(StudentGuardion record);

    StudentGuardion selectByPrimaryKey(StudentGuardionKey key);

    int updateByPrimaryKeySelective(StudentGuardion record);

    int updateByPrimaryKey(StudentGuardion record);
}