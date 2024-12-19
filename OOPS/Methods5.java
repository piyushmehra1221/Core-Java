import java.util.Scanner;

class A
{
    void add(int a,int b)
    {
        int f=a+b;
        System.out.println("add is "+f);
    }

    void sub(int a,int b)
    {
        int c=a-b;
        System.out.println("sub is "+c);
    }

    void div(int a,int b)
    {
        int d=a/b;
        System.out.println("div is "+d);
    }

    void multi(int a,int b)
    {
        int e=a*b;
        System.out.println("multi is "+e);
    }
}

public class Methods5 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value ");
        int a=sc.nextInt();
        System.out.println("enter  b value ");
        int b=sc.nextInt();

        A k=new A();
        k.add(a, b);
        k.sub(a, b);
        k.div(a, b);
        k.div(a, b);

    }
}
