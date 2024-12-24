import java.util.Scanner;
class A 
{
    int a;
    int b;

    void add(int c , int d)
    {
        a=c;
        b=d;

        System.out.println(a+b);
        
       
    }
    void sub(int e,int f)
    {
        a=e;
        b=f;

        System.out.println(a-b);
         
    }
    void div(int g,int h)
    {
        a=g;
        b=h;

        System.out.println(a/b);
         
    }
}

public class Instance {
    public static void main(String[] args) {
        A k=new A();

        Scanner ss=new Scanner(System.in);
        System.out.println("enter value of a");
        int g=ss.nextInt();
        System.out.println("enter b");
        int h=ss.nextInt();
         k.div(g,h);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        int e=sc.nextInt();
        System.out.println("enter b");
        int f=sc.nextInt();
        k.sub(e,f);

        Scanner cc=new Scanner(System.in);
        System.out.println("enter a");
        int c=sc.nextInt();
        System.out.println("enter b");
        int d=sc.nextInt();
        
        k.add(c,d);
    }
}
