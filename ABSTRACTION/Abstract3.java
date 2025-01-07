abstract class A 
{
  A(int a,int b)
  {
    System.out.println(a+" "+b);
  }
}
abstract class B 
{
  B(int a,int b)
  {
    System.out.println(a+" "+b);
  }
}

class C extends A
{
   C()
   {
    super(5,5);
   }
}
class D extends B 
{
  D()
  {
    super(6,6);
  }
}

public class Abstract3 {
    public static void main(String[] args) {
       
        new C();
        new D();
    }
}
