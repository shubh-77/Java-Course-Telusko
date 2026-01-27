package com.telusko.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputOutputExample {
public static void main(String[] args) throws IOException {
    System.out.println("Enter a number");
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int num = Integer.parseInt(br.readLine());

    // System.out.println("Number entered:"+num);
    // //closing the resource to avoid leakage
    // br.close();

    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();
    System.out.println("Number entered:"+num);
    sc.close();

}
}
