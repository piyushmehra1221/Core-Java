class A 
{
    int a=55;
    int b=5;

    void show()
    {
        int c=a+b;
        System.out.println("add is :"+c);
    }
}

public class Constantcode {
    
    public static void main(String[] args) {
        
        A k=new A();
        k.show();
    }
}
