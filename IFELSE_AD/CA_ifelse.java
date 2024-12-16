import java.util.Scanner;

public class CA_ifelse {
     public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
      
       System.out.println("enter ");
       char ch=sc.next().charAt(0);
       int a = (int )ch;

       if(a>=65 && a<=90)
       {
         System.out.println("this is alpha");

       }
       else if(a>=97 && a<=122)
       {
        System.out.println("this is alpha");
       }
       else
       {
        System.out.println("this is a digit");
       }
    }
}
