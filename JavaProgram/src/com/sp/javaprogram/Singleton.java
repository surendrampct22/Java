package com.sp.javaprogram;

public class Singleton implements Cloneable {
	private static Singleton singleton;

	private Singleton() {
	}

	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			// synchronized (Singleton.class) {
			// if(singleton==null)
			singleton = new Singleton();
		}  
		// }
		return singleton;

	}

	@Override
	protected synchronized Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}