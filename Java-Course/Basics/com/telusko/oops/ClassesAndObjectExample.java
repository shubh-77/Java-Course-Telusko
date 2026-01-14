package com.telusko.oops;

class Calculator{

        int result ;

        public int add(int num1,int num2){
            result = num1+num2;
            return result;
        }

        
        public double add(double num1,double num2){
            return  num1+num2;
        }

        public int add(int num1,int num2, int num3){
            result = num1+num2+num3;
            return result;
        }





}


class Computer{

    public void playMusic(){
        System.out.println("Playing music...");
    }

    public String getMePen(int cost){
        if(cost>=10){
            return "Pen"+cost;
        }
        return "Cost should be more than 10";
    }


}
public class ClassesAndObjectExample {
    public static void main(String[] args) {
        int num1 =10,num2=20,num3=30;
        Calculator calc = new Calculator();
        System.out.println("The result is: " + calc.add(num1,num2));
        
        System.out.println("The result is: "+ calc.add(num1,num2,num3));








        Computer comp = new Computer();
        comp.playMusic();
        System.out.println(comp.getMePen(5));
    }
}

//Camel Case Notation
//1. class and interface-> should start with capital letter(Calc,Runnable)
//2. variable and method -> should start with small letter(markrs(),show())
//3. Constants -> should be in all capital letters(PIE,BRAND_NAME)

