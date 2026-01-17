package com.telusko;




public class WrapperClassExample {
    public static void main(String[] args) {
        int num=7;
        Integer num1 = num;
        //storing and autmatic conversion of primitive to object is called as autoboxing


        int num2 =num1;//auto-unboxing conversion from object to primitve type
        System.out.println(num1);
        System.out.println(num2);

        String str= "12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3);


    }
}
