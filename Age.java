import java.util.*;
class Father{
Scanner sc=new Scanner(System.in);
int fage;
Father(){
try{
System.out.println("Enter Father's Age");
fage=sc.nextInt();
if(fage<0)
throw new AgeException("Age less than zero");
}
catch(AgeException e){
System.out.println(e);
}
finally{
System.out.println("Enter valid age of Father");
fage=sc.nextInt();
}
}
}

class Son extends Father{
int sage;
Son(){
super();
try{
System.out.println("Enter Son's age");
sage=sc.nextInt();
if(sage>fage)
throw new AgeException("Son's age is greater than Father's age");
}
catch(AgeException e){
System.out.println(e);
}
finally{
System.out.println("Enter valid Son's age");
sage=sc.nextInt();
}
}
void print(){
System.out.println("Father's age="+fage+" and Son's age="+sage);
}
}

class AgeException extends Exception{
String s;
AgeException(String d){
s=d;
}
public String toString(){
return s;
}
}
class Age{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Son s=new Son();
s.print();
}
}



