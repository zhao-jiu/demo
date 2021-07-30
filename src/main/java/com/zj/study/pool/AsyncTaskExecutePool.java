package com.zj.study.pool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/2 9:36
 * @Description: 异步线程池配置
 */
@EnableAsync
@Configuration
public class AsyncTaskExecutePool {

    //核心线程池大小
    private final static int corePoolSize = 10;
    //最大线程数
    private final static int maxPoolSize = 15;
    //队列容量
    private final static int queueCapacity = 50;
    //活跃时间/秒
    private final static int keepAliveSeconds = 60;

    @Bean
    public Executor myAsyncTaskPool() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //核心线程池大小
        executor.setCorePoolSize(corePoolSize);
        //最大线程数
        executor.setMaxPoolSize(maxPoolSize);
        //队列容量
        executor.setQueueCapacity(queueCapacity);
        //活跃时间
        executor.setKeepAliveSeconds(keepAliveSeconds);
        //设置线程池关闭的时候等待所有任务都完成再继续销毁其他的Bean
        executor.setWaitForTasksToCompleteOnShutdown(true);
        //线程名字前缀
        executor.setThreadNamePrefix("my-async1--");
        // setRejectedExecutionHandler：当pool已经达到max size的时候，如何处理新任务
        // CallerRunsPolicy：不在新线程中执行任务，而是由调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}
