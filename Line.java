import java.util.*;
class Line
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      //only spaces mentioned
      System.out.println("Enter e-mail");
      String str=sc.nextLine();
     if(str.contains("@") && str.contains("."))
     {
       System.out.println("true");
     }
      else
     {
     System.out.println("false");   
      }
      }
      }