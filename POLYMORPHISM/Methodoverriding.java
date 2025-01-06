class A 
{
    void show()
    {
        System.out.println("A class method");
    }
}
class B extends A 
{
    void show()
    {
        super.show();
        System.out.println("B class method");
    }
}

public class Methodoverriding {
    public static void main(String[] args) {
        
        B k=new B();
        k.show();
    }
}
