package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.AttendanceMonthTotal;
import com.tianyuan.WisdomTeacherServer.bean.SchoolAttendanceRecord;
import com.tianyuan.WisdomTeacherServer.bean.TeacherLeaveRecord;
import com.tianyuan.WisdomTeacherServer.mapper.TeacherAttendanceMapper;
import com.tianyuan.WisdomTeacherServer.service.TeacherAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.util.List;


@Service
public class TeacherAttendanceServiceImpl implements TeacherAttendanceService {

    @Autowired
    private TeacherAttendanceMapper attendanceMapper;

    @Override
    public List<SchoolAttendanceRecord> selectTeacherAttendance(String day, String userid, String type) throws ParseException {



        List<SchoolAttendanceRecord> record = attendanceMapper.selectTeacherAttendance(userid, type);

        for (SchoolAttendanceRecord atendanceRecord : record) {

        String startTime = atendanceRecord.getStartTime();

        String data = startTime;
        String[] data1 = data.split(" ");
        String oneday = data1[0];

            if (day.equals(oneday)){
                return record;
            }
        }
            return  null;
    }

    @Override
    public AttendanceMonthTotal monthlyAttendance(String start, String end, String teacherid) {
      return   attendanceMapper.monthlyAttendanc(start,end,teacherid);
    }

    @Override
    public List<TeacherLeaveRecord>laveRecord(String[] dates, String teacherid, String type) {

        String startTime = dates[0];
        String endTime = dates[1];
        if(type.equals("3")){
            type = null;
        }

        List<TeacherLeaveRecord> teacherLeaveRecord = attendanceMapper.laveRecord(startTime, endTime, teacherid, type);

        return teacherLeaveRecord;
    }

    @Override
    public void askForLeave(TeacherLeaveRecord teacherLeaveRecord) {
        attendanceMapper.askForLeave(teacherLeaveRecord);
    }
}
