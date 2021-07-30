package com.zj.study;

import com.zj.study.pool.AsyncTask;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/2 9:39
 * @Description:
 */
@SpringBootTest
public class AppTests {

    @Autowired
    private AsyncTask asyncTask;

    @Test
    void test(){
        for (int i = 0; i < 100; i++) {
            asyncTask.run(i);
        }
    }

}
