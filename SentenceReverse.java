package com.kali.strings;

import java.util.Scanner;
public class SentenceReverse
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Sentence: ");
    String s = sc.nextLine();

    System.out.println("Entered String: "+s);

    String ss[] = s.split("m");
    for(int i = ss.length ; i>0; i--){
      System.out.print(ss[i-1]+" ");
    }
    System.out.print("\n");
  }
}
