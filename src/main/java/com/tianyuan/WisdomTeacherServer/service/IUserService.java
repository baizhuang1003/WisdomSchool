package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolStudent;

import java.util.List;

public interface IUserService {
    SchoolStudent searchStudent();
    boolean updateStudent(SchoolStudent schoolStudent);
    SchoolStudent searchStudent(String id);
    List<SchoolStudent> findAll();
    Integer countItem();
}
