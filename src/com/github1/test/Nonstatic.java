package com.github1.test;

public class Nonstatic 
{ 
   int a=9;
   void Gitest()
   {
	   System.out.println("hi");
   }

  public static void main(String[] args) 
   
   {
	    Nonstatic obj = new Nonstatic();
	    obj.velankani();
	    System.out.println(obj.a);
   }
   //testing this
   // to check whether this is visible in eclipse
}
