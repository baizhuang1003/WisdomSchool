package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolSubject;
import com.tianyuan.WisdomTeacherServer.bean.SchoolTerm;

public interface TermService {
    SchoolTerm serchSubject();
    public boolean insert(SchoolSubject schoolSubject);
    public boolean updateJob(SchoolSubject schoolSubject);
    public boolean deleteJob(Integer id);
}
