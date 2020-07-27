package com.tianyuan.WisdomTeacherServer.service;


import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;

public interface FloorService {
    SchoolFloor searchClass();
    public boolean insertFloor(SchoolFloor schoolFloor);
    public boolean updateFloor(SchoolFloor schoolFloor);
    public boolean deleteFloor(Integer id);
}
