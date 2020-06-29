package com.ldgroup.easycodedemo.JobTest;

import com.ldgroup.easycodedemo.entity.Job;
import com.ldgroup.easycodedemo.service.JobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Description
 * @Author by mocar小师兄
 * @Date 2020/6/28 14:38
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class JobTest {

    @Autowired
    private JobService jobService;

    @Test
    public void testConn(){
        List<Job> jobs = jobService.queryAllByLimit(0, 10);
        for (Job job : jobs) {
            System.out.println(job);
        }
    }

    @Test
    public void testQueryAll(){
        List<Job> jobs = jobService.selectAllJobs();
        for (Job job : jobs) {
            System.out.println(job);
        }
    }
}
