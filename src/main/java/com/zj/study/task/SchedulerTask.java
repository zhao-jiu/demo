package com.zj.study.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/6/30 10:54
 * @Description: 定时器模板  springboot自带定时器
 */
@Component
public class SchedulerTask {


    /**
     * 每两秒打印一次
     * cron 七子表达式
     */
    @Scheduled(cron = "*/2 * * * * ?")
    private void process(){
        System.out.println("定时器工作中------->输出： " + new Date());
    }
}
