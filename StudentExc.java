import java.util.*;
class StudentExc{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   String usn,name;
   int i;
   int marks[]=new int[3];
   try{
      if(args.length==0||args.length<0)
      throw new NoArgException("Zero arguments");
      }
      catch(NoArgException e){
      System.out.println(e);
      System.out.println("Restart the programme");
      System.exit(0);
      }
      System.out.println("Enter the USN and Name of Student");
      usn=sc.next();
      name=sc.next();
      try{
         for(i=0;i<3;i++)
          {
           marks[i]=Integer.parseInt(args[i]);
           if(marks[i]<0)
           {
            throw new NoArgException("Marks<0 Exception");
           }
          }
         }
       catch(NoArgException e){
       System.out.println(e);
       }
       System.out.println("*** Details ***");
       System.out.println("USN="+usn+"\tName="+name);
       for(i=0;i<3;i++)
       {
       System.out.println("Marks= "+marks[i]);
       }
  }
 }
 
 class NoArgException extends Exception{
 String p;
 public NoArgException(String s){
 p=s;
 }
 public String toString(){
 return p;
 }
 }        
          
