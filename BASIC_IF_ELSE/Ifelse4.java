import java.util.Scanner;

public class Ifelse4 {
     public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number a");
      int a=sc.nextInt();
      System.out.println("enter number b");
      int b=sc.nextInt();
      System.out.println("enter number c");
      int c=sc.nextInt();
      if(a>b && a>c)
      {
        System.out.println("a is max");
      }
     else if(b>a && b>c)
      {
        System.out.println("b is max");
      }
      else
      {
        System.out.println("c is max");
      }
    }

    
}
