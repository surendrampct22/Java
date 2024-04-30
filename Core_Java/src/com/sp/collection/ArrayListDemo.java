package com.sp.collection;

import java.util.ArrayList;

class ArrayListDemo 
{
public static void main(String[] args) 
{
ArrayList a=new ArrayList();
a.add("A");//0
a.add(10);//1
a.add("A");//2
a.add(null);//3
System.out.println(a);
a.remove(2);
System.out.println(a);
a.add(2,"m");
a.add("n");
System.out.println(a);
}
}
