package com.telusko.enumexamples;




public class EnumWithIfAndSwitchExample {
public static void main(String[] args) {


    Status s = Status.Success;

    System.out.println(s.getClass().getSuperclass());

    //using if else
    
    if(s ==Status.Running){
        System.out.println("All good");
    }else if(s==Status.Failed){
        System.out.println("Try Again");
    } else if(s==Status.Pending){
        System.out.println("Please Wait");
    }   else{
        System.out.println("Done");
    }


    switch (s) {
        case Running ->System.out.println("Running");
        case Failed ->System.out.println("Try Again");
        case Pending->System.out.println("Please Wait");
        case Success->System.out.println("Success");
        default->System.out.println("Something is wrong");
    }




}
}
