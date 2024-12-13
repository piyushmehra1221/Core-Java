import java.util.Scanner;
public class Ifelse12 {
    
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

     System.out.println("enter Male for m and Femail for f");
     char a=sc.next().charAt(0);
     
     if(a=='m')
     {
        System.out.println("Male");
     }
     else if(a=='f')
     {
        System.out.println("Femail");
     }
     else 
     {
        System.out.println("other");
     }

   }
    
}
