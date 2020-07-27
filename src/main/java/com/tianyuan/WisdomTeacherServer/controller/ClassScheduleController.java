package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.bean.SchoolCourse;
import com.tianyuan.WisdomTeacherServer.service.ClassScheduleService;
import com.tianyuan.WisdomTeacherServer.vo.Result;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiModel("课程表")
@RestController
public class ClassScheduleController {

    @Autowired
        private ClassScheduleService scheduleService;

    @ApiOperation("教师的个人课程表")
    @PostMapping("/mySchedule/{year}/{semester}/{teacherid}")
    public Result myClassSchedule(@ApiParam("查询的年份") @PathVariable("year") String year,
                                  @ApiParam("查询的学期") @PathVariable("semester")String semester,
                                  @ApiParam("教师的id") @PathVariable("teacherid") String teacherid){

        SchoolCourse schoolCourse = scheduleService.selectMySchedule(year, semester, teacherid);

        if (schoolCourse != null){
            return new Result(true,"查询成功",schoolCourse);
        }

        return new Result(false,"查询失败");
    }

    @ApiOperation("某个班级的课程表")
    @PostMapping("/clsaaSchedule/{year}/{semester}/{grade}/{clazz}")
    public Result classSchedule(@ApiParam("查询某年份") @PathVariable("year") String year,
                                @ApiParam("查询某学期") @PathVariable("semester") String semester,
                                @ApiParam("查询某年级") @PathVariable("grade") String grade,
                                @ApiParam("查询某班级") @PathVariable("clazz") String clazz){

        scheduleService.classSchedule(year,semester,grade,clazz);

        return new Result(false,"查询失败");
    }


}
