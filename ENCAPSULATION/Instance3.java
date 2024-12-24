import java.util.Scanner;
class A
{
    int a;
    int b;

    void add(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println(this.a+this.b);
    }
    void sub(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println(this.a-this.b);
    }
    void multi(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println(this.a/this.b);
    }
    
}


public class Instance3 {
    public static void main(String[] args) {
        A k=new A();

        Scanner sc=new Scanner(System.in);
        System.out.println("enter your a");
        int a=sc.nextInt();
        System.out.println("enter b vale");
        int b=sc.nextInt();
       
        k.add(a, b);
       
        Scanner cc=new Scanner(System.in);
        System.out.println("enter your a");
        int c=sc.nextInt();
        System.out.println("enter b vale");
        int d=sc.nextInt();
        k.sub(a, b);

        Scanner ss=new Scanner(System.in);
        System.out.println("enter your a");
        int e=sc.nextInt();
        System.out.println("enter b vale");
        int f=sc.nextInt();
        k.multi(a,b);
    }
}
