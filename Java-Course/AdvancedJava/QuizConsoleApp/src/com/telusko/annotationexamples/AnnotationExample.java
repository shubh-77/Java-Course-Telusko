package com.telusko.annotationexamples;


class A{


  public void show(){
    System.out.println("in A show()");
  }  
}

class B extends A{

  @Override
  public void show() {
    System.out.println("in B show");
  }


}


public class AnnotationExample {
public static void main(String[] args) {
    B bobj  = new B();
    bobj.show();
}
}
