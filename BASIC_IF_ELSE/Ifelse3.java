import java.util.Scanner;

public class Ifelse3
{
   public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number a");
      int num=sc.nextInt();
      System.out.println("enter number b");
      int num1=sc.nextInt();
      if(num>num1)
      {
        System.out.println("a is max");
      }
      else
      {
        System.out.println("b is max");
      }
    }

}
