class A 
{
    String show(String name)
    {
        System.out.println(name);
        return name;
    }
}

class B 
{
    B show(String name)
    {
         System.out.println(name);
        return this;
    }
}


public class Returnargument1 {
   
    public static void main(String[] args) {
        
        A k=new A();
        k.show("piyush is a good boy");

        B k1=new B();
        k1.show("welcome to india");
    }
}
