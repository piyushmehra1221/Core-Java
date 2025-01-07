abstract class A 
{
    abstract void show1();
    private void show2()
    {
        System.out.println("private method");
    }
    void show3()
    {
        this.show2();
    }
}
class B extends A 
{
    void show1()
    {
        System.out.println("abstract method ");
    }
}
class C extends B 
{

}


public class Abstract12 {
    public static void main(String[] args) {
        C k=new C();
        k.show1();
        k.show3();
    }
}
