abstract class A 
{
  A()
  {
    System.out.println("A class constructor");
  }
}
abstract class B 
{
  B()
  {
    System.out.println("B class constructor");
  }
}

class C extends A
{
   C()
   {
    super();
   }
}
class D extends B 
{
  D()
  {
    super();
  }
}

public class Abstract2 {
    public static void main(String[] args) {
       
        new C();
        new D();
    }
}
