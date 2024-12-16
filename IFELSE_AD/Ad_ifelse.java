import java.util.Scanner;
public class Ad_ifelse
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Check a leap year");
      int num=sc.nextInt();
      if(num%4==0)
      {
        System.out.println("Leap year");
      }
      else
      {
        System.out.println("not ");
      }
    }
}