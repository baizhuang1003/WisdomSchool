package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.bean.SchoolGrade;
import com.tianyuan.WisdomTeacherServer.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GradeController {

    @Autowired
    private GradeService gradeService;

    @RequestMapping(value = "/searchgrade",method = RequestMethod.GET)
    public SchoolGrade seach(){
        SchoolGrade schoolGrade = gradeService.searchGrade();
        return schoolGrade;
    }

    @RequestMapping(value ="/insertgrade",method = RequestMethod.POST)
    public boolean insert(SchoolGrade SchoolGrade){
        boolean b = gradeService.insertGrade(SchoolGrade);
        return b;
    }

    @RequestMapping(value ="/updategrade",method = RequestMethod.POST)
    public boolean edit(SchoolGrade SchoolGrade){
        boolean b = gradeService.updateGrade(SchoolGrade);
        return b;
    }

    @RequestMapping(value ="/deletegrade",method = RequestMethod.POST)
    public boolean delete(Integer id){
        boolean b = gradeService.deleteGrade(id);
        return b;
    }
}
