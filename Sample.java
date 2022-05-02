import java.lang.*;
class Sample
  {
    public static void main(String args[])
    {
      String str1="bitlabs";
      String str2="bitlabs";
      String str3=new String("bitlabs");
      String str4=new String("bitlabs");
      if(str3==str4)
      {
        System.out.println("true");
      }
      else
      {
        System.out.println("false");
      }
      if(str1.equals(str2))
      {
        System.out.println("true");
      }
      else
      {
        System.out.println("false");
      }
    }
  }