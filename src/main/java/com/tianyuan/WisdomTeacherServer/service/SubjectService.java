package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;

public interface SubjectService {
    SchoolSubject serchSubject();
    boolean insertSubject(SchoolSubject schoolSubject);
    boolean updateSubject(SchoolSubject schoolSubject);
    boolean deleteSubject(Integer id);
}
