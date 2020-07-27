package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.SchoolCourse;

public interface ClassScheduleMapper {

    /**
     *  根据年份和学期来查询
     * @param startyear
     * @param endyear
     * @param semester
     * @param teacherid
     * @return
     */
    SchoolCourse selectMySchedule(String startyear, String endyear, String semester, String teacherid);

    void classSchedule(String year, String semester, String grade, String clazz);
}
