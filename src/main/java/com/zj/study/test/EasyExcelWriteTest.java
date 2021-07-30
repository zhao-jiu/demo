package com.zj.study.test;

import com.alibaba.excel.EasyExcel;
import com.zj.study.entity.DemoData;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/1 16:45
 * @Description: EasyExcel 写操作测试
 */
public class EasyExcelWriteTest {

    public static void main(String[] args) {
        //实现excel写的操作
        //1 设置写入文件夹地址和excel文件名称
        String filename = "F:\\testData\\write.xlsx";
        // 2 调用easyexcel里面的方法实现写操作
        // write方法两个参数：第一个参数文件路径名称，第二个参数实体类class
        EasyExcel.write(filename, DemoData.class).sheet("学生列表").doWrite(getData());

    }

    //创建方法返回list集合
    private static List<DemoData> getData() {
        List<DemoData> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            DemoData data = new DemoData();
            data.setSno(i);
            data.setSname("tom"+i);
            list.add(data);
        }
        return list;
    }
}
