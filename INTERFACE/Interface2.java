interface A 
{
    private int show()
    {
        System.out.println("private method in interface ");
        return 0;
    }
    default void show2()
    {
        show();
    }
}
interface B 
{
    private int show(int a)
    {
        System.out.println("value of a is: "+a);
        return 0;
    }
    default void show3()
    {
        show(55);
    }
}
class C implements A 
{
  
}
class D implements B 
{

}
class E implements A,B{

}

public class Interface2 {
    public static void main(String[] args) {
        
        C k=new C();
        k.show2();

        D k1=new D();
        k1.show3();

        E k2=new E();
        k2.show2();
        k2.show3();
    }
}
