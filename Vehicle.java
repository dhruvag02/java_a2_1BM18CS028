import java.util.*;
class Vehicle
{
public static String model,col;
public static int year,total;

Vehicle(String model,String col,int year,int total)
{
this.model=model;
this.col=col;
this.year=year;
this.total=total;
}
void output()
{
System.out.println("Model="+model+",Year="+year+"and colour="+col);
}
static void tot()
{
System.out.println("Total number of cars="+total);
}
}
class Vehicleinfo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of cars");
int n=sc.nextInt();
Vehicle v[]=new Vehicle[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter model,year,colour and total for car"+i);
Vehicle.model=sc.next();
Vehicle.year=sc.nextInt();
Vehicle.col=sc.next();
Vehicle.total=sc.nextInt();
v[i]=new Vehicle(Vehicle.model,Vehicle.col,Vehicle.year,Vehicle.total);
v[i].output();
Vehicle.tot();
}
}
}
