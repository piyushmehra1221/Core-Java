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
class C extends A
{
    void show()
    {
        super.show();
        System.out.println("C class method");
    }
}
public class Methodoverriding2
{
    public static void main(String[] args) {
        
        B p=new B();
          p.show();
        C k=new C();
        k.show();
    }
}