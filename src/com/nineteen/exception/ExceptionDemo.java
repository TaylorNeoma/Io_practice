package com.nineteen.exception;
//异常练习
public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
//        try {
//            System.out.println("a/b=" + (a / b));
//        } catch (Exception e) {
//            System.out.println("除数不能为0");
//        }
        //系统会自动处理，处理结果是显示相应的问题原因和问题名称等，但是程序会结束
        System.out.println("a/b=" + (a / b));
    }
}
