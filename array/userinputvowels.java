import java.util.Scanner;
public class userinputvowels {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int size=5;
     char a[]=new char[size];

     for(int i=0;i<a.length;i++)
     {
        System.out.println("enter vowels");
        a[i] = sc.next().charAt(0);
     }

     int count=0;
     for(int i=0;i<a.length;i++)
     {
        count++;
     }
     System.out.println("vowels are : "+count);
   }
}
