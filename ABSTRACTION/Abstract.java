abstract class A 
{
   abstract void show1();
   abstract int show2();
}
abstract class B 
{
  abstract void show3(int a);
  abstract int show4(int b);
}
class C extends A 
{
   void show1()
   {
    System.out.println("First method");
   }
   int show2()
   {
    System.out.println("second method");
    return 0;
   }
}
class D extends B 
{
   void show3(int a)
   {
    System.out.println("value of a is :"+a);
   }
   int show4(int b)
   {
    System.out.println("value of b is :"+b);
    return 0;
   }
}

public class Abstract
{
    public static void main(String[] args)
    {
      C k=new C();
      k.show1();
      k.show2();
       
      D k1=new D();
       k1.show3(55);
       k1.show4(66);
    }
}