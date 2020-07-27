package com.tianyuan.WisdomTeacherServer.controller;

import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;
import com.tianyuan.WisdomTeacherServer.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FloorController {
    @Autowired
    private FloorService floorService;
    @RequestMapping(value = "/searchfloor",method = RequestMethod.GET)
    public SchoolFloor seach(){
        SchoolFloor schoolFloor = floorService.searchClass();
        return schoolFloor;
    }

    @RequestMapping(value ="/insertfloor",method = RequestMethod.POST)
    public boolean insert(SchoolFloor schoolFloor){
        boolean b = floorService.insertFloor(schoolFloor);
        return b;
    }

    @RequestMapping(value ="/updatefloor",method = RequestMethod.POST)
    public boolean edit(SchoolFloor schoolFloor){
        boolean b = floorService.updateFloor(schoolFloor);
        return b;
    }

    @RequestMapping(value ="/deletefloor",method = RequestMethod.POST)
    public boolean delete(Integer id){
        boolean b = floorService.deleteFloor(id);
        return b;
    }
}
