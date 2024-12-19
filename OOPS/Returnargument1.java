class A 
{
    String show(String name)
    {
        System.out.println(name);
        return name;
    }
}


public class Returnargument1 {
   
    public static void main(String[] args) {
        
        A k=new A();
        k.show("piyush is a good boy");
    }
}
