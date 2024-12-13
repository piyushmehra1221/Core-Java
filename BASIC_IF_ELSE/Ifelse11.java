import java.util.Scanner;

public class Ifelse11 {
    
     public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int a=sc.nextInt();
        System.out.println("enter b value");
        int b=sc.nextInt();
        int c;
        System.out.println(" a value "+a);
        System.out.println(" b value "+b);
        System.out.println();
       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println("swap a value "+a);
        System.out.println("swap b value "+b);
       
    }
}
