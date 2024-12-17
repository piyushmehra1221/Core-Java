  class A 
  {
    void show1()
    {
        System.out.println("class A");
    }
  }

  class B
  {
    void show1()
    {
        System.out.println("class B");
    }
  }
  class C
  {
    void show1()
    {
        System.out.println("class C");
    }
    void show2()
    {
        System.out.println("class C");
    }
    void show3()
    {
        System.out.println("class C");
    }
  }
  class D
  {
    void show1()
    {
        System.out.println("class D");
    }
    void show2()
    {
        System.out.println("class D");
    }
    void show3()
    {
        System.out.println("class D");
    }
    void show4()
    {
        System.out.println("class D");
    }
  }

public class Methods3 {
    
    public static void main(String [] args)
    {
       A k=new A();
       k.show1();

       B k1=new B();
       k1.show1();

       C k2=new C();
       k2.show1();
       k2.show2();
       k2.show3();

       D k3=new D();
       k3.show1();
       k3.show2();
       k3.show3();
       k3.show4();
    }
}
