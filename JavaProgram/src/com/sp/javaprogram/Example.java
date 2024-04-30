package com.sp.javaprogram;

class Test {
    public String m1() {
        //System.out.println("String  " + name);
        return "nisha";
    }
}

class Demo extends Test {
//	@Override
//    public Object m1() {
//        //System.out.println("obj  " + obj);
//    	Object onj="sp";
//        return onj;
//    }
}
class Example{
public static void main(String[] args) {
                Test t = new Test();
		t.m1();
		Demo d = new Demo();
		d.m1();
		Test t1 = new Demo();
		t1.m1();
}
}
