import java.util.Scanner;

public class Ifelse2 {
   public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number");
      int num=sc.nextInt();
      if(num>10)
      {
        System.out.println("number max then 10");
      }
      else
      {
        System.out.println("number low then 10");
      }
    }

    
}
