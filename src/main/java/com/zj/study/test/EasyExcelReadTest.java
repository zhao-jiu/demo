package com.zj.study.test;

import com.alibaba.excel.EasyExcel;
import com.zj.study.entity.DemoData;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/1 16:51
 * @Description:
 */
public class EasyExcelReadTest {

    public static void main(String[] args) {

        //实现excel读操作
        String filename = "F:\\testData\\write.xlsx";
        EasyExcel.read(filename, DemoData.class,new ExcelListener()).sheet().doRead();
    }

}
