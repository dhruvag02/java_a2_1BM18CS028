
class Thread1 implements Runnable {
Thread t;
Thread2 t2;
public Thread1() {
	t=new Thread(this,"T1");
	t2= new Thread2();
	t.start();
}
public void run() {
	try {
		t2.t.join();
		System.out.println("Hello from thread1");
		Thread.sleep(1000);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

class Thread2 implements Runnable {
Thread t;
Thread3 t3;
public Thread2() {
	t=new Thread(this,"T2");
	t3= new Thread3();
	t.start();
}
public void run() {
	try {
		t3.t.join();
		System.out.println("Hello from thread2");	
		Thread.sleep(1000);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

class Thread3 implements Runnable {
Thread t;
Thread4 t4;
public Thread3() {
	t=new Thread(this,"T3");
	t4= new Thread4();
	t.start();
}
public void run() {
	try {
		t4.t.join();
		System.out.println("Hello from thread3");	
		Thread.sleep(1000);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

class Thread4 implements Runnable {
Thread t;
Thread5 t5;
public Thread4() {
	t=new Thread(this,"T4");
	t5= new Thread5();
	t.start();
}
public void run() {
	try {
		t5.t.join();
		System.out.println("Hello from thread4");	
		Thread.sleep(1000);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

class Thread5 implements Runnable {
Thread t;
public Thread5() {
	t=new Thread(this,"T5");
	t.start();
}
public void run() {
	try {
		System.out.println("Hello from thread5");
		Thread.sleep(1000);
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}

class NestedThread{
	public static void main(String args[]) {
	Thread1 t1=new Thread1();
	try {
		Thread.sleep(1000);
		t1.t.join();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("Exiting from main");
	}
}