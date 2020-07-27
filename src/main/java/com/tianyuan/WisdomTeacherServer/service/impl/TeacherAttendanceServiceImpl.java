package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.AttendanceMonthTotal;
import com.tianyuan.WisdomTeacherServer.bean.SchoolAttendanceRecord;
import com.tianyuan.WisdomTeacherServer.mapper.TeacherAttendanceMapper;
import com.tianyuan.WisdomTeacherServer.service.TeacherAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;



@Service
public class TeacherAttendanceServiceImpl implements TeacherAttendanceService {

    @Autowired
    private TeacherAttendanceMapper attendanceMapper;

    @Override
    public SchoolAttendanceRecord selectTeacherAttendance(String day, String userid, String type) throws ParseException {



        SchoolAttendanceRecord record = attendanceMapper.selectTeacherAttendance(userid, type);

        String startTime = record.getStartTime();

        String data = startTime;
        String[] data1 = data.split(" ");
        String oneday = data1[0];


        if (day.equals(oneday)){
            return record;
        }else {
            return  null;
        }


    }

    @Override
    public AttendanceMonthTotal monthlyAttendance(String start, String end, String teacherid) {


      return   attendanceMapper.monthlyAttendanc(start,end,teacherid);

    }
}
