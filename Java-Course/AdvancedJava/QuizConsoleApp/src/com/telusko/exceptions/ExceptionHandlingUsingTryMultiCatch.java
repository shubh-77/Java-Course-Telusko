package com.telusko.exceptions;









public class ExceptionHandlingUsingTryMultiCatch {
public static void main(String[] args) {

    

    int i=2;
    int j =0;

    int num[] = new int[5];
    String str=null;

    try{
       j=18/i;
       System.out.println(str.length());
        System.out.println(num[1]);
        System.out.println(num[5]);

    }
    catch(ArithmeticException e){
        System.out.println("Cannot / by zero ");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Invalid Array index accessed");
    }
    catch(Exception e){
        System.out.println("Something went wrong "+e);

    }

    System.out.println(j);

    System.out.println("Bye");






}
}
