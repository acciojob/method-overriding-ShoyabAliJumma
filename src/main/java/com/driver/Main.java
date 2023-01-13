package com.driver;

public class Main
{
    public static void main(String[] args) {
        A b=new A();
        System.out.println(b.meth());
    }
  public static class A{
        public static String meth()
        {
            return "Invoking method from class A" ;
        }
  }
  public static class B extends A
  {
        public static String meth()
        {
            return "Method is overridden in Extended class B";
        }
  }
}