package com.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    //成功
    public String paymentInfo_OK(Integer id){
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_OK,id：  "+id+"\t"+"哈哈哈"  ;
    }

    //故意设置超时,失败
    //设置超时或异常处理办法

    public String paymentInfo_TimeOut(Integer id){
        int timeNumber = 3;
        //try { TimeUnit.SECONDS.sleep(timeNumber); }catch (Exception e) {e.printStackTrace();}
        return "线程池："+Thread.currentThread().getName()+"   paymentInfo_TimeOut,id：  "+id+"\t"+"呜呜呜"+" 耗时(秒)"+timeNumber;
    }



}
