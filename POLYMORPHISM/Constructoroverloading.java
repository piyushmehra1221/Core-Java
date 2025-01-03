class A 
{
    A()
    {
      System.out.println("");
    }
    A(int a)
    {
        System.out.println(a);
    }
}

public class Constructoroverloading {

    public static void main(String[] args)
    {
       new A(55);
    }
}
