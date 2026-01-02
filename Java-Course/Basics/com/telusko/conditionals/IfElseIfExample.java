package com.telusko.conditionals;


public class IfElseIfExample {
public static void main(String[] args) {
    
    int x =8;
    int y=7;
    int z =6;
    if(x>y && x>z){
        System.out.println("X is greatest "+x);
    } else if(y>z){
        System.out.println("Y is greatest "+y);
    }
    else{
        System.out.println("Z is greatest "+z);
    }
}    
}
