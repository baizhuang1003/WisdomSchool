package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.AttendanceMonthTotal;
import com.tianyuan.WisdomTeacherServer.bean.SchoolAttendanceRecord;
import com.tianyuan.WisdomTeacherServer.bean.TeacherLeaveRecord;

import java.text.ParseException;
import java.util.List;

public interface TeacherAttendanceService {
    /**
     *
     * @param day 当天日期
     * @param type  人员类型
     * @return
     */

    List<SchoolAttendanceRecord> selectTeacherAttendance(String day, String userid, String type) throws ParseException;

    /**
     *  查询每月的教师的考勤
     * @param year
     * @param month
     * @param teacherid
     * @return
     */
    AttendanceMonthTotal monthlyAttendance(String year, String month, String teacherid);

    /**
     *  查询教师的请假记录
     * @param dates
     * @param teacherid
     * @param type
     * @return
     */
    List<TeacherLeaveRecord> laveRecord(String[] dates, String teacherid, String type);

    /**
     *  请假
     * @param teacherLeaveRecord
     */
    void askForLeave(TeacherLeaveRecord teacherLeaveRecord);
}
