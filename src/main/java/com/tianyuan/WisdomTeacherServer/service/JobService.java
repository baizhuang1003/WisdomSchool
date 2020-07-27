package com.tianyuan.WisdomTeacherServer.service;

import com.tianyuan.WisdomTeacherServer.bean.SchoolJob;

public interface JobService {
    SchoolJob searchJob();
    public boolean insertJob(SchoolJob schoolJob);
    public boolean updateJob(SchoolJob schoolJob);
    public boolean deleteJob(Integer id);
}
