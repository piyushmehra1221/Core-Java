class A
{
    A()
    {
        this(5.5f,5.5f);
       System.out.println("firt constructor ");
       
    }
    A(int a)
    {
       this("hello");
        System.out.println("second constructor");
       
    }
    A(float a)
    {
        System.out.println("three constructor");
        
    }
    A(int a,int b)
    {
        this(5.5f);
        System.out.println("four constructor");
    }
    A(float a,float b)
    {
        this(5,5);
        System.out.println("five constructor");
    }
    A(String name)
    {
        this();
        System.out.println("six constructor");
        
    }
   
}


public class Constructoroverloading2 {
    
    public static void main(String[] args) {
        
        new A(5);
    
    }
}
