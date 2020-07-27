package com.tianyuan.WisdomTeacherServer.controller;


import com.tianyuan.WisdomTeacherServer.bean.SchoolDept;
import com.tianyuan.WisdomTeacherServer.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/searchdept",method = RequestMethod.GET)
    public SchoolDept seach(){
        SchoolDept schoolDept = deptService.searchDept();
        return schoolDept;
    }

    @RequestMapping(value ="/insertdept",method = RequestMethod.POST)
    public boolean insert(SchoolDept schoolDept) {
         boolean b= deptService.insertDept(schoolDept);
        return b;
    }

    @RequestMapping(value ="/editdept",method = RequestMethod.POST)
    public boolean edit(SchoolDept schoolDept){
        boolean b = deptService.updateDept(schoolDept);
        return b;
    }

    @RequestMapping(value ="/deletedept",method = RequestMethod.POST)
    public  boolean delete(Integer id) {
        boolean b = deptService.deleteDept(id);
        return b ;
    }
}
