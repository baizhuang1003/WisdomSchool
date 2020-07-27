package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolCourse;
import com.tianyuan.WisdomTeacherServer.mapper.ClassScheduleMapper;
import com.tianyuan.WisdomTeacherServer.service.ClassScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassScheduleServiceImpl implements ClassScheduleService {

    @Autowired
    private ClassScheduleMapper scheduleMapper;

    @Override
    public SchoolCourse selectMySchedule(String year, String semester, String teacherid) {

        String[] split = year.split("-");
        String startyear = split[0];
        String endyear = split[1];

        SchoolCourse schoolCourse = scheduleMapper.selectMySchedule(startyear, endyear, semester, teacherid);
        return schoolCourse;
    }


    @Override
    public void classSchedule(String year, String semester, String grade, String clazz) {
            scheduleMapper.classSchedule(year,semester,grade,clazz);
    }
}
