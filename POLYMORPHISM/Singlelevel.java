class A 
{
    int show1(int a)
    {
        System.out.println(a);
        return a;
    }
    int show2()
   {

    System.out.println("sencond method");

    return 0;

   }
}
class B extends A
{
   
}


public class Singlelevel {
    
    public static void main(String[] args) {
        
        A k=new B();
        k.show1(55);
        k.show2();
    }
}
