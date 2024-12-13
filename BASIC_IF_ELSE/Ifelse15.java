import java.util.Scanner;
public class Ifelse15 {
    
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter char ");
        char a=sc.next().charAt(0);
        if(a=='a')
        {
            System.out.println("apple");
        }
        else if(a=='b')
        {
            System.out.println("ball");
        }
        else if(a=='c')
        {
            System.out.println("cat");
        }
        else
        {
            System.out.println("not match");
        }
    }
}
