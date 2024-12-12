import java.util.Scanner;

public class Ifelse5 {
        public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter number ");
      int a=sc.nextInt();
      
      if(a>0)
      {
        System.out.println("positive number");
      }
      else if(a<0)
      {
        System.out.println("negetive number");
      }
      else
      {
        System.out.println("zero");
      }
    }

    
}
