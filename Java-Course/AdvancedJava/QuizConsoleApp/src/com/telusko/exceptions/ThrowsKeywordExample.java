package com.telusko.exceptions;


class Dummy{
    public void show() throws ClassNotFoundException{
        
            Class.forName("ThrowsKeywordExample");
        
    }
}

public class ThrowsKeywordExample  {

    static{
         System.out.println("Class Loaded");
    }
public static void main(String[] args) {
       Dummy d = new Dummy();
       try {
        d.show();
    } catch (ClassNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
}
}
