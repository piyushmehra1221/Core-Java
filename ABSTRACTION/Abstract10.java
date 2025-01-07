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

class C extends B
{
    
}

public class Abstract10 {
    public static void main(String[] args) {
        
       
        C k1=new C();
        k1.show();
    }
}
