import java.util.Scanner;
public class Ifelse10 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");

        int num=sc.nextInt();
        if(num%3==0 && num%7==0)
        {
            System.out.println("divisible by 3 or 7");
        }
        else
        {
            System.out.println("not ");
        }
    }

}
