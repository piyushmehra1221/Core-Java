import java.util.Scanner;
public class Ftc_ifelse {
    
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      
      System.out.println("enter fahrenheit to celsius and Celsius to fahrenheit");
      String name=sc.nextLine();
      if(name.equals("fahrenheit"))
      {
        Scanner sca=new Scanner(System.in);
        System.out.println("enter Fahrenheit degree");
        float f=sc.nextFloat();
        float c;
        c=(f-32)*5/9;
        System.out.println("fahrenheit to celsius is :"+c);
        
      }
      else if(name.equals("celsius"))
      {

      }
    }
}