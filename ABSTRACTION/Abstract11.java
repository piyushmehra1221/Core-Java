abstract class A 
{
    abstract void show();
    void show2()
    {
        System.out.println("non abstract method ");
    }
}
class B extends A 
{
    void show()
    {
        System.out.println("abstract method ");
    }
}
class C extends B 
{
    
}

public class Abstract11 {
    public static void main(String[] args) {
       
        C k=new C();
        k.show();
        k.show2();
    }
}
