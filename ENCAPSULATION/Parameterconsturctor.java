class A 
{
    A(int a,int b)
    {
        int c=a+b;
        System.out.println("add is : "+c);
    }
}

class B 
{
    B(int a,int b)
    {
        int c=a-b;
        System.out.println("sub is : "+c);
    }
}

class C 
{
    C(int a,int b)
    {
        int c=a/b;
        System.out.println("div is : "+c);
    }
}

class D 
{
    D(int a,int b)
    {
        int c=a*b;
        System.out.println("multi is : "+c);
    }
}

public class Parameterconsturctor
{
    public static void main(String[] args) {
        
        new A(5, 5);
        new B(10,5);
        new C(5,10);
        new D(5, 5);
    }
}