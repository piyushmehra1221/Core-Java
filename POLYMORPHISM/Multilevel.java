class A 
{
   void show1()
   {
    System.out.println("A method");
   }
}

class B extends A
{
    void show2()
   {
    System.out.println("B method");
   }
}

class C extends B
{
    void show3()
   {
    System.out.println("C method");
   }
}

class D extends C
{
    void show4()
   {
    System.out.println("D method");
   }
}


public class Multilevel {
    
    public static void main(String[] args) {

      
        C k=new D();
        k.show1();
        k.show2();
        k.show3();

        
    }
}
