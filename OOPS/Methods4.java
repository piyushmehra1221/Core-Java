       class A 
       {
         void show1(int a)
         {
            System.out.println("a is value is : "+a);
         }
         
       }

       class B 
       {
        void show1(int a)
        {
           System.out.println("a is value is : "+a);
        }

       }
       
       class C
       {

        void show1(int a)
        {
           System.out.println("a is value is : "+a);
        }
        void show2(int b)
        {
           System.out.println("b is value is : "+b);
        }
        void show3(int c)
        {
           System.out.println("c is value : "+c);
        }

       }

       class D 
       {

        void show1(int a)
        {
           System.out.println("a is value is : "+a);
        }
        void show2(int b)
        {
           System.out.println("b is value is : "+b);
        }
        void show3(int c)
        {
           System.out.println("c is value : "+c);
        }
        void show4(int d)
        {
           System.out.println("d is value :"+d);
        }

       }


public class Methods4 {
    
    public static void main(String[] args) {
        
        A k=new A();
        k.show1(555555);
        
        B k1=new B();
        k1.show1(33333);

        C k2=new C();
        k2.show1(1111111);
        k2.show2(222222);
        k2.show3(33333333);
    }
}
