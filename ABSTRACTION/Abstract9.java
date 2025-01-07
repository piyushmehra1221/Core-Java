abstract class A 
{
    abstract void show();
}

class B extends A 
{
    void show()
    {
      System.out.println("B class extends A");
    }
}

class C extends A 
{
    void show()
    {
      System.out.println("C class extends A");
    }
}

public class Abstract9 {
    public static void main(String[] args) {
        
        B k=new B();
        k.show();
        C k1=new C();
        k1.show();
    }
}
