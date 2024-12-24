class A
{
    A()
    {
        System.out.println("constructor call");
    }
    void show()
    {
        System.out.println("no return and no argument");
    }
    int show1()
    {
        int a=55;
        System.out.println("a value is :"+a);
       return a;
    }
    int show2(int b)
    {
        System.out.println("b value is :"+b);
        return b;
    }

}


public class Constructorbasic {
    public static void main(String[] args) {

        new A().show();
        new A().show1();
        new A().show2(55);
  System.out.println();
        A k=new A();
        k.show();
        k.show1();
        k.show2(44);
        
    }
}
