package com.telusko.conditionals;

public class TernaryOperatorExample {

   public static void main(String[] args) {
     int n=4;
    String result;
    result=n%2==0?"Even":"Odd";
    System.out.println(result);
   
      // Nested ternary operator example
    int num = 15;
    String output = num > 0 ? (num % 2 == 0 ? "Positive Even" : "Positive Odd") : (num < 0 ? "Negative" : "Zero");
    System.out.println(output);

}
    
}
