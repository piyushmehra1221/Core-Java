//not possible abstract private method are not creat 

abstract class A 
{
   private void show1()
     {
         System.out.println("hi");
     }
     protected void show2()
     {
         System.out.println("ho");
    }
    private abstract void show3();
      void show4(){
        show1();
     }
}
class B extends A
{

}

public class Abstract6 {
    public static void main(String[] args) {
        B p = new B();
        p.show2();
        p.show3();
    }
}
