package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data   //不用写getter/setter等方法
@AllArgsConstructor//带参数构造函数注解
@NoArgsConstructor//无参的构造函数注解
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
 