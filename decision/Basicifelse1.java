

import java.util.Scanner;

public class Basicifelse1 {
    public static void main(String [] args)
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter your age");
      int age=sc.nextInt();
      if(age>=18)
      {
        System.out.println("you are valid to vote");
      }
      else
      {
        System.out.println("you are not valid to vote");
      }
 
    }
}