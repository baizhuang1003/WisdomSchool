package com.tianyuan.WisdomTeacherServer.mapper;

import com.tianyuan.WisdomTeacherServer.bean.AttendanceMonthTotal;
import com.tianyuan.WisdomTeacherServer.bean.SchoolAttendanceRecord;
import com.tianyuan.WisdomTeacherServer.bean.TeacherLeaveRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface TeacherAttendanceMapper  {
    /**
     *
     * @param userid 查询用户的id
     * @param type  人员类型
     * @return 可以点了
     */

       // 这两个要对应 和 xml中的
    List<SchoolAttendanceRecord> selectTeacherAttendance(@Param("userid") String userid, @Param("type") String type);

    AttendanceMonthTotal monthlyAttendanc(@Param("year") String year,
                                          @Param("month") String month, @Param("teacherid") String teacherid);

    List<TeacherLeaveRecord> laveRecord(@Param("startTime") String startTime, @Param("endTime") String endTime,
                                  @Param("teacherid") String teacherid,@Param("type") String type);

    void askForLeave(TeacherLeaveRecord teacherLeaveRecord);
}
