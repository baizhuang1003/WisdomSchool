package com.tianyuan.WisdomTeacherServer.service.impl;

import com.tianyuan.WisdomTeacherServer.bean.SchoolFloor;
import com.tianyuan.WisdomTeacherServer.bean.SchoolFloorKey;
import com.tianyuan.WisdomTeacherServer.mapper.SchoolFloorMapper;
import com.tianyuan.WisdomTeacherServer.service.FloorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FloorServiceImpl implements FloorService {

    @Autowired
    private SchoolFloorMapper schoolFloorMapper;

    public SchoolFloor searchFloor() {
        SchoolFloor SchoolFloor = schoolFloorMapper.selectByPrimaryKey(1);
        return SchoolFloor;
    }

    @Override
    public SchoolFloor searchClass() {
        return null;
    }

    public boolean insertFloor(SchoolFloor schoolFloor) {
        int count = schoolFloorMapper.insertSelective(schoolFloor);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean updateFloor(SchoolFloor schoolFloor) {
        int count =schoolFloorMapper.updateByPrimaryKeySelective(schoolFloor);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean deleteFloor(Integer id) {
        return false;
    }

    public boolean deleteFloor(SchoolFloorKey key) {
        int count = schoolFloorMapper.deleteByPrimaryKey(key);
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }
}
