package com.zj.study.pool;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/2 9:38
 * @Description: 异步线程池执行任务
 */
@Component
@Slf4j
public class AsyncTask {

    /**
     * myAsyncTaskPool 线程池的方法名，此处如果不写，会使用Spring默认的线程池
     * @param i
     */
    @Async("myAsyncTaskPool")
    public void run(int i){
        log.info("我是：" + i);
    }

}
