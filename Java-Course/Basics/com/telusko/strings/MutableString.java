package com.telusko.strings;

public class MutableString {
    public static void main(String[] args) {
        

        //String BUffer
        StringBuffer stringBuffer = new StringBuffer("Navin");
        // stringBuffer.deleteCharAt(2);
        // System.out.println(stringBuffer.length());//length of the string buffer obj
        // System.out.println(stringBuffer.capacity());//entire space give to that object
        stringBuffer.append("Reddy");
        stringBuffer.insert(5, " Java ");
        stringBuffer.setLength(30);
        System.out.println(stringBuffer.capacity());

        String str =stringBuffer.toString();
        System.out.println(str);    






    }
}
