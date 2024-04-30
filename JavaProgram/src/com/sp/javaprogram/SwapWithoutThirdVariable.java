package com.sp.javaprogram;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 10, b = 20;
        
      

        
        a = a + b;//30
        b = a - b;//-10
        a = a - b;//20
        
      //After Swaping
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}

