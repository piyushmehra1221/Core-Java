import java.util.Scanner;

class A
{
    void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value ");
      int b=sc.nextInt();
      int c=a+b;
      System.out.println("add is :"+c);
    }

    void sub()
    {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value ");
      int b=sc.nextInt();
      int c=a-b;
      System.out.println("sub is :"+c);
    }

    void div()
    {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value ");
      int b=sc.nextInt();
      int c=a/b;
      System.out.println("div is :"+c);
    }

    void multi()
    {
        Scanner sc=new Scanner(System.in);
      System.out.println("enter a value");
      int a=sc.nextInt();
      System.out.println("enter b value ");
      int b=sc.nextInt();
      int c=a*b;
      System.out.println("multi is :"+c);
    }
}

class B 
{
    Scanner sc=new Scanner(System.in);
    void even()
    {
        System.out.println("enter num");
        int e=sc.nextInt();
        if(e%2==0)
        {
          System.out.println("even num");
        }
        else{
            System.out.println("else");
        }
    }
}

class C
{
    Scanner sc=new Scanner(System.in);
    void even()
    {
        System.out.println("enter num");
        int e=sc.nextInt();
        if(e%2!=0)
        {
          System.out.println("even num");
        }
        else{
            System.out.println("else");
        }
    }
}

public class M_Maths {
    
    public static void main(String[] args) {
        
        B k=new B();
        k.even();
    }
}
