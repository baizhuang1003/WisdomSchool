package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.AttendanceMonthTotal;
import com.tianyuan.WisdomTeacherServer.bean.SchoolAttendanceRecord;

import java.text.ParseException;

public interface TeacherAttendanceService {
    /**
     *
     * @param day 当天日期
     * @param type  人员类型
     * @return
     */

    SchoolAttendanceRecord selectTeacherAttendance(String day,String userid,String type) throws ParseException;

    /**
     *  查询每月的教师的考勤
     * @param year
     * @param month
     * @param teacherid
     * @return
     */
    AttendanceMonthTotal monthlyAttendance(String year, String month, String teacherid);
}
