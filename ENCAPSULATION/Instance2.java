import java.util.Scanner;
class A 
{
   int a;
   int b;

   A(int c, int d)
   {
     a=c;
     b=d;
     System.out.println(a+b);
   }
}

class B 
{
    int a;
    int b;
 
    B(int e, int f)
    {
      a=e;
      b=f;
      System.out.println(a-b);
    }
}

class C 
{
    int a;
    int b;
 
    C(int g, int h)
    {
      a=g;
      b=h;
      System.out.println(a/b);
    }
}


public class Instance2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value");
        int c=sc.nextInt();
        System.out.println("enter b value");
        int d=sc.nextInt();
        new A(c, d);
        
        Scanner cc=new Scanner(System.in);
        System.out.println("enter a value");
        int e=cc.nextInt();
        System.out.println("enter b value");
        int f=cc.nextInt();
        new B(e, f);

        Scanner ss=new Scanner(System.in);
        System.out.println("enter a value");
        int g=ss.nextInt();
        System.out.println("enter b value");
        int h=ss.nextInt();
    }
}
