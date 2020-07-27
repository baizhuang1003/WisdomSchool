package com.tianyuan.WisdomTeacherServer.controller;


import com.tianyuan.WisdomTeacherServer.bean.AttendanceMonthTotal;
import com.tianyuan.WisdomTeacherServer.bean.SchoolAttendanceRecord;
import com.tianyuan.WisdomTeacherServer.service.TeacherAttendanceService;
import com.tianyuan.WisdomTeacherServer.vo.Result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@ApiModel("查询勤率")
@RestController
public class TeacherAttendanceController {

    @Autowired
    private TeacherAttendanceService teacherAttendanceService;

    @ApiOperation("查询每天的出勤")
    @GetMapping("/teacher/attendance/now/{userId}/{type}/{day}")
    public Result selectTeacherAttendance(@ApiParam("用户的id")  @PathVariable("userId") String userId,
                                          @ApiParam("用户的类型") @PathVariable("type") String type,
                                          @ApiParam("今天的日期") @PathVariable String day) throws ParseException {
        // TODO 缺少参数校验
        SchoolAttendanceRecord schoolAttendanceRecord = teacherAttendanceService.selectTeacherAttendance(day, userId, type);
        if (schoolAttendanceRecord != null){
            return  new Result(true,"查询成功",schoolAttendanceRecord);
        }
        return new Result(false,"查询失败");
    }
    @ApiOperation("查询每月的出勤评率")
    @PostMapping("/monthlyAttendance/{dates}/{teacherid}")
    public Result monthlyAttendance(@ApiParam("一个月的日期") @PathVariable String dates[],
                                    @ApiParam("教师的id") @PathVariable String  teacherid){

       String start = dates[0];//开始的日期
       String end = dates[1];//结束的日期
        String[] split = end.split("-");
        String year = split[0];
        String month = split[1];
        AttendanceMonthTotal attendanceMonthTotal = teacherAttendanceService.monthlyAttendance(year,month, teacherid);
        if (attendanceMonthTotal != null){
            return  new Result(true,"查询成功",attendanceMonthTotal);
        }else {
             return new Result(false,"查询失败");
        }

    }
}
