import java.util.*;
class Thread1 implements Runnable{
Thread t;
String p;
Thread1(String s){
p=s;
t=new Thread(this,"Thread1");
System.out.println("Name="+ t);
t.start();
}
public void run(){
while(true){
try{
System.out.println(p);
Thread.sleep(10000);
}
catch(Exception e){
System.out.println("Caught Exception"+ e);
}
}
}
}

class Thread2 implements Runnable{
Thread t;
String p;
Thread2(String s){
p=s;
t=new Thread(this,"Thread2");
System.out.println("Name="+ t);
t.start();
}
public void run(){
while(true){
try{
System.out.println(p);
Thread.sleep(2000);
}
catch(Exception e){
System.out.println("Caught Exception"+ e);
}
}
}
}

class TwoThread{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Thread1 t1=new Thread1("BMS College OF Engineering");
Thread2 t2=new Thread2("CSE");
try{
t1.t.join();
t2.t.join();
}
catch(Exception e){
System.out.println("Caught exception in main class"+ e);
}
System.out.println("Exiting from main");
}
}

