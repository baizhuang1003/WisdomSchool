package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolCourse;

public interface ClassScheduleService {

    /**
     *  教师自己的课程表
     * @param year
     * @param semester
     * @param teacherid
     * @return
     */
    SchoolCourse selectMySchedule(String year, String semester, String teacherid);

    /**
     *  班级的课程表
     * @param year
     * @param semester
     * @param grade
     * @param clazz
     */
    void classSchedule(String year, String semester, String grade, String clazz);
}
