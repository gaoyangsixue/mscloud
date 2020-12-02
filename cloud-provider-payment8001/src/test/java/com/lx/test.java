package com.lx;

public class test {
    public static void main(String[] args) {
        try {
            int a= 10/0;
        }catch (Exception e){

            System.out.println("===="+e);
            throw e;
        }
        System.out.println("+++++++++");
    }
}
