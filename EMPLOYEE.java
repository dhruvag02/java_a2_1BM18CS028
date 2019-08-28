import java.util.*;
class EMPLOYEE
{
 int Employee_Number;
 String Employee_Name;
 double Basic, DA, IT, Net_Salary;
 double gross_salary;
 
 void Read()
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Employee_Number, Employee Name, Basic and Gross Salary");
     Employee_Number = sc.nextInt();
     Employee_Name = sc.next();
     Basic = sc.nextFloat();
     gross_salary = sc.nextFloat();
    
 }
 void CalNetSalary()
 {
     DA = 0.75 * Basic;
     IT = 0.30 * gross_salary;
     Net_Salary = Basic + DA - IT;
    
 }
 void Print()
 {
     System.out.println("Employee_Name-> "+ Employee_Name);
     System.out.println("Employee_Number-> "+ Employee_Number);
     System.out.println("Basic-> "+ Basic);
     System.out.println("DA->"+ DA);
     System.out.println("IT->"+ IT);
     System.out.println("Net Salary->"+ Net_Salary);
 }
}
class Employeede
{
    public static void main(String args[])
    {
        int n;
        EMPLOYEE obj = new EMPLOYEE();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        n = sc.nextInt();
       
        for(int i = 0; i < n; i++)
        {
            obj.Read();
            obj.CalNetSalary();
            obj.Print();
        }
    }
}  
