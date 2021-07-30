package com.zj.study.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author ZhaoJiu
 * @CreateTime: 2021/7/1 16:44
 * @Description:
 */
@Data
public class DemoData {

    @ExcelProperty(value = "学生编号",index = 0)
    private Integer sno;
    @ExcelProperty(value = "学生姓名",index = 1)
    private String sname;
}
