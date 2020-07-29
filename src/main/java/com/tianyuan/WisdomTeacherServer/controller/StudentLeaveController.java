package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.bean.StudentLeave;
import com.tianyuan.WisdomTeacherServer.service.StudentleaveService;
import com.tianyuan.WisdomTeacherServer.util.PoiUtil;
import com.tianyuan.WisdomTeacherServer.vo.Result;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@ApiModel("学生管理-信息管理")
@RestController
public class StudentLeaveController {


        @Autowired
        private StudentleaveService studentleaveService;

        @ApiOperation("导出学生信息的")
        @RequestMapping("/student/export")
        @Transactional
        public Result export(@ApiParam("（复选框）要导出到表中的学生id")@RequestParam String[] arrys,HttpServletRequest request, HttpServletResponse response){

            //定义表名称
            String title = "学生信息表";
            //表的列名称
            String[] rowsName = new String[]{"id","监督人id","监督人姓名","监护人手机","学生id","学生姓名",
            "教师id","教师名称","类型id","类型名称","开始时间","结束时间","状态","备注","修改时间","创建人","创建时间","修改人","是否删除"};
            //属性类的名称
            String[] attributes = new String[]{
            "id", "guardionId", "guardionName", "guardionMobile", "studentId", "studentName", "teacherId", "teacherName",
            "typeId", "typeName", "startTime", "endTime", "status", "remark", "updateTime", "createUid", "createTime", "updateUid", "del"};
            try {
                List<StudentLeave> leaveList = new ArrayList<>();
                //查询学生信息
                for (int i = 0; i < arrys.length; i++) {

                StudentLeave leave = studentleaveService.selectByPrimaryKey(arrys[i]);
                    leaveList.add(leave);
                }

                PoiUtil.downLoadExcel(attributes,rowsName,leaveList,"D:\\excel","studentLeaver.xlsx");
                return new Result(true,"导出成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false,"导出失败");
            }
        }


        @ApiOperation("通过excel导入学生")
        @RequestMapping("/student/upload")
        public Result upload(@ApiParam("excel文件") @RequestParam("excelFile")MultipartFile excelFile){
            try {
                List<String[]> excelList = PoiUtil.readExcel(excelFile);
                List<StudentLeave> studentList = new ArrayList<>();
                if (excelFile != null && excelList.size() > 0){
                    StudentLeave student = null;
                    for (String[] excel : excelList) {
                       student =  new StudentLeave();
                        if (excel[0].equals("无") || excel[0].isEmpty() || excel[0]== null){
                            excel[0] ="";
                        }else {
                            student.setId(excel[0]);
                        }
                        if (excel[1].equals("无") || excel[1].isEmpty()  || excel[1]== null){
                            excel[1] ="";
                        }else {
                            student.setGuardionId(excel[1]);
                        }
                        if (excel[2].equals("无") || excel[2].isEmpty() || excel[2]== null){
                            excel[2] ="";
                        }else {
                            student.setGuardionName(excel[2]);
                        }
                        if (excel[3].equals("无") || excel[3].isEmpty() || excel[3]== null){
                            excel[3] ="";
                        }else {
                            student.setGuardionMobile(excel[3]);
                        }
                        if (excel[4].equals("无") || excel[4].isEmpty() || excel[4]== null){
                            excel[4] ="";
                        }else {
                            student.setStudentId(excel[4]);
                        }
                        if (excel[5].equals("无") || excel[5].isEmpty() || excel[5]== null){
                            excel[5] ="";
                        }else {
                            student.setStudentName(excel[5]);
                        }
                        if (excel[6].equals("无") || excel[6].isEmpty() || excel[6]== null){
                            excel[6] ="";
                        }else {
                            student.setTeacherId(excel[6]);
                        }
                        if (excel[7].equals("无") || excel[7].isEmpty() || excel[7]== null){
                            excel[7] ="";
                        }else {
                            student.setTeacherName(excel[7]);
                        }
                        if (excel[8].equals("无") || excel[8].isEmpty() || excel[8]== null){
                            excel[8] ="";
                        }else {
                            student.setTypeId(excel[8]);
                        }
                        if (excel[9].equals("无") || excel[9].isEmpty()  || excel[9]== null){
                            excel[9] ="";
                        }else {
                            student.setTypeName(excel[9]);
                        }
                        if (excel[10].equals("无") || excel[10].isEmpty()  || excel[10]== null){
                            excel[10] ="";
                        }else {
                            student.setStartTime(excel[10]);
                        }
                        if (excel[11].equals("无") || excel[11].isEmpty() || excel[11]== null){
                            excel[11] ="";
                        }else {
                            student.setEndTime(excel[11]);
                        }
                        if (excel[12].equals("无") || excel[12].isEmpty() || excel[12]== null){
                            excel[12] ="";
                        }else {
                            student.setStatus(excel[12]);
                        }
                        if (excel[0].equals("无")|| excel[13].isEmpty() || excel[13]== null){
                            excel[0] ="";
                        }else {
                            student.setRemark(excel[13]);
                        }
                        if (excel[14].equals("无") || excel[14].isEmpty() || excel[14]== null){
                            excel[14] ="";
                        }else {
                            student.setUpdateTime(excel[14]);
                        }
                        if (excel[15].equals("无") || excel[15].isEmpty() || excel[15]== null){
                            excel[15] ="";
                        }else {
                            student.setCreateUid(excel[15]);
                        }
                        if (excel[16].equals("无") || excel[16].isEmpty() || excel[16]== null){
                            excel[16] ="";
                        }else {
                             student.setCreateTime(excel[16]);
                        }
                        if (excel[17].equals("无") || excel[17].isEmpty() || excel[17]== null){
                            excel[17] ="";
                        }else {
                            student.setUpdateUid(excel[17]);
                        }
                        if (excel[18].equals("无") || excel[18].isEmpty() || excel[18]== null){
                            excel[18] ="";
                        }else {
                            student.setDel(excel[18]);
                        }
                        studentList.add(student);
                    }
                }
                        studentleaveService.importStudentLeave(studentList);
                return  new Result(true,"导入成功");
            } catch (IOException e) {
                e.printStackTrace();
            return  new Result(false,"导入失败");
            }
        }

        @ApiOperation(value = "查询所有的学生信息")
        @GetMapping("/student/findAll")
        public Result findAll(){
            List<StudentLeave> studentAll = studentleaveService.findAll();

            if (studentAll != null){
                return new Result(true,"查询成功",studentAll);
            }else {
                return new Result(false,"查询失败");
            }
        }

        @ApiOperation(value = "根据主键删除数据库中的学生信息")
        @GetMapping("/student/deleteByPrimaryKey/{id}")
        public Result deleteByPrimaryKey(@ApiParam(value = "主键id") @PathVariable("id") String[] ids){
            try {
                for (String id : ids) {
                    studentleaveService.deleteByPrimaryKey(id);
                }
                return new Result(true,"删除成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false,"删除失败");
            }
        }

        @ApiOperation(value = "新增学生")
        @PostMapping("/student/insert")
        public Result insert(@ApiParam("JOSN格式的学生对象") @RequestBody StudentLeave record){
            try {
                studentleaveService.insert(record);
                return new Result(true,"添加学生成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(false,"添加学生失败");
            }
        }

        @ApiOperation("插入学生信息")
        @PostMapping("/student/insertSelective")
        public Result insertSelective(@ApiParam("JOSN格式的学生对象") @RequestBody StudentLeave record){
            try {
                studentleaveService.insertSelective(record);
                return new Result(true,"插入学生成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(true,"插入学生失败");
            }
        }

        @ApiOperation("根据主键查询学生信息")
        @GetMapping("/student/selectByPrimaryKey/{id}")
        public Result selectByPrimaryKey(@ApiParam("查询的主键") @PathVariable String id){
            StudentLeave studentLeave = studentleaveService.selectByPrimaryKey(id);
            if (studentLeave !=null){
                return new Result(true,"查询成功",studentLeave);
            }else {
                return new Result(false,"查询失败");
            }
        }

        @ApiOperation("插入修改学生信息")
        @PostMapping("/student/updateByPrimaryKeySelective")
        public Result updateByPrimaryKeySelective(@ApiParam("JOSN格式的学生对象") @RequestBody StudentLeave record){
            try {
                studentleaveService.updateByPrimaryKeySelective(record);
                return new Result(true,"插入修改成功");
            } catch (Exception e) {
                e.printStackTrace();
              return new Result(false,"插入修改失败");
            }
        }

        @ApiOperation("修改学生信息")
        @PostMapping("/student/updateByPrimaryKey")
        public Result updateByPrimaryKey(@ApiParam("JOSN格式的学生对象") @RequestBody StudentLeave record){
            try {
                studentleaveService.updateByPrimaryKey(record);
                return new Result(true,"修改成功");
            } catch (Exception e) {
                e.printStackTrace();
                return new Result(true,"修改失败");
            }
        }
}
