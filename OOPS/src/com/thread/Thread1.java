package com.thread;

public class Thread1 implements Runnable  
	{    
	public void run()  
	{    
	System.out.println("Now the thread is running ...");    
	}    
	    
	// main method  
	public static void main1(String argvs[])  
	{   
	// creating an object of the class MyThread2  
	Runnable r1 = Thread1();   
	  
	// creating an object of the class Thread using Thread(Runnable r, String name)  
	Thread th1 = new Thread(r1, "My new thread");    
	  
	// the start() method moves the thread to the active state  
	th1.start();   
	  
	// getting the thread name by invoking the getName() method  
	String str = th1.getName();  
	System.out.println(str);  
	}

	private static Runnable Thread1() {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object Runnable() {
		// TODO Auto-generated method stub
		return null;
	}    
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
