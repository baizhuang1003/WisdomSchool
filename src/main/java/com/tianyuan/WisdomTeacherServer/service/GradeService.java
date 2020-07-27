package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolGrade;

public interface GradeService {
    SchoolGrade searchGrade();
    public boolean insertGrade(SchoolGrade schoolGrade);
    public boolean updateGrade(SchoolGrade schoolGrade);
    public boolean deleteGrade(Integer id);
}
