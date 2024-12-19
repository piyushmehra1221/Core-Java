   class A 
   {
     int show()
     {
        int a=45;
        System.out.println(a);
        return a;
     }
   }
   
   class B 
   {
     B show()
     {
        System.out.println("welcome to india");
        return this;
     }
   }

public class Methods6 {
    public static void main(String[] args) {
        
        A k=new A();
        k.show();

        B k1=new B();
        k1.show();
    }
}
