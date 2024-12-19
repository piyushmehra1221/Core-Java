class A 
{
    int show(int a)
    {
        System.out.println(a);
        return a;
    }
}

public class Returnargument {
    
    public static void main(String[] args) {
        
        A k=new A();
        k.show(45);
    }
}
