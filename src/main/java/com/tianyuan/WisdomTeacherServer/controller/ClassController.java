package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.bean.SchoolClass;
import com.tianyuan.WisdomTeacherServer.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
public class ClassController {
    @Autowired
    private ClassService classService;

    @RequestMapping(value = "/searchclass",method = RequestMethod.GET)
    public SchoolClass seach(){
        SchoolClass schoolClass = classService.searchClass();
        return schoolClass;
    }

    @RequestMapping(value ="/insertclass",method = RequestMethod.POST)
    public boolean insert(SchoolClass schoolClass){
        boolean b = classService.insertClass(schoolClass);
        return b;
    }

    @RequestMapping(value ="/updateclass",method = RequestMethod.POST)
    public boolean edit(SchoolClass schoolClass){
        boolean b = classService.updateClass(schoolClass);
        return b;
    }

    @RequestMapping(value ="/deleteclass",method = RequestMethod.POST)
    public boolean delete(Integer id){
        boolean b = classService.deleteClass(id);
        return b;
    }
}
