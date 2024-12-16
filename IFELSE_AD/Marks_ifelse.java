import java.util.Scanner;
public class Marks_ifelse {
    
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.println("enter your 5 subject marks");
    System.out.println("English = ");
    int eng=sc.nextInt();
    System.out.println("Hindi = ");
    int h=sc.nextInt();
    System.out.println("Maths = ");
    int m=sc.nextInt();
    System.out.println("Science = ");
    int s=sc.nextInt();
    System.out.println("Sst = ");
    int ss=sc.nextInt();

    float T=eng+h+m+s+ss;
    double p=(T/500)*100;
    if(p<25)
    {
        System.out.println("Your grade is F:");
        System.out.println("Your persentage is :"+p);
    }
    else if(p>=25 && p<=45)
    {
        System.out.println("Your grade is E:");
        System.out.println("Your persentage is :"+p);
    }
    else if(p>=46 && p<=50)
    {
        System.out.println("Your grade is D:");
        System.out.println("Your persentage is :"+p);
    }
    else if(p>=51 && p<=60)
    {
        System.out.println("Your grade is C:");
        System.out.println("Your persentage is :"+p);
    }
    else if(p>=61 && p<=80)
    {
        System.out.println("Your grade is B:");
        System.out.println("Your persentage is :"+p);

    }
    else if(p>80)
    {
        System.out.println("your grade is A");
        System.out.println("your persentage is :"+p);
    }
    else 
    {
        System.out.println("not match");
    }
   }
    
}
