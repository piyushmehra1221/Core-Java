
import java.util.Scanner;

    
    class A 
    {
      int add(int a,int b)
      {
          int c=a+b;
          System.out.println("add is :"+c);
          return c;
      }
  
      int sub(int a,int b)
      {
          int c=a-b;
          System.out.println("sub is :"+c);
          return a;
      }
  
      int div(int a,int b)
      {
          int c=a/b;
          System.out.println("div is :"+c);
          return a;
      }
  
      int multi(int a,int b)
      {
          int c=a*b;
          System.out.println("multi is :"+c);
          return a;
      }
  
    }
  
    class B 
    {
      int even(int n)
      {
          if(n%2==0)
          {
              System.out.println("even num");
          }
          else
          {
            System.out.println("not ");  
            
          }
          return n;
      }
  
    }
  
    class C 
    {
      int odd(int n)
      {
          if(n%2!=0)
          {
              System.out.println("even num");
          }
          else
          {
            System.out.println("not ");  
            
          }
          return n;
      }
    }
  
      public class Return {
      public static void main(String[] args) {
  
          B k1= new B();
          Scanner bc=new Scanner(System.in);
          System.out.println("check even num");
          int n=bc.nextInt();
  
          k1.even(n);
          
          A k=new A();
          Scanner sc=new Scanner(System.in);
          System.out.println("enter a value ");
          int a=sc.nextInt();
          System.out.println("enter b value");
          int b=sc.nextInt();
  
          k.add(a,b);
  
          System.out.println("enter a value ");
          int c=sc.nextInt();
          System.out.println("enter b value");
          int d=sc.nextInt();
          
          k.sub(a,b);
  
          
          System.out.println("enter a value ");
          int e=sc.nextInt();
          System.out.println("enter b value");
          int f=sc.nextInt();
  
          k.div(a,b);
  
          
          System.out.println("enter a value ");
          int g=sc.nextInt();
          System.out.println("enter b value");
          int h=sc.nextInt();
  
          k.multi(a, b);
  
      }
  }
  

