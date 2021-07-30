package com.zj.study.test;

import com.alibaba.excel.EasyExcel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/9 15:12
 * @Description:
 */
public class WriteTest {

    public static void main(String[] args) {

        String filename = "F:\\testData\\0.xlsx";

        EasyExcel.write(filename, UserData.class).sheet("用户列表").doWrite(getData());
    }

    private static List<UserData> getData(){
        List<UserData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserData data = new UserData();
            data.setUId(i);
            data.setUName("tom"+i);
            list.add(data);
        }
        return list;
    }
}
