import java.util.Scanner;
public class Ifelse8
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num");
    int num=sc.nextInt();
    if(num%5==0 || num%7==0)
    {
        System.out.println("divisible");
    }
    else{
        System.out.println("not divisible");
    }
  }
}
