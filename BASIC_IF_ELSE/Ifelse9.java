import java.util.Scanner;
public class Ifelse9 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter char");
        
        char a=sc.next().charAt(0);
        if(a<='A' && a>='Z')
        {
            System.out.println("upper case");
        }
        else 
        {
            System.out.println("lower case");
        }

    }
    
}
