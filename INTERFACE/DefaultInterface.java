interface A 
{
    void show();
    default void show2(int a)
    {
        System.out.println("Default method in Interface");
        show3();
        show4(a);
    }
    private int show3()
    {
      System.out.println("private method in INterface");
      return 0;
    }
    private int show4(int b)
    {
        System.out.println("Private method in interface");
        return 0;
    }
}
class B implements A 
{
     public void show()
     {
        System.out.println("Interface method");
     }
}

public class DefaultInterface {
    public static void main(String[] args) {
        
        B k=new B();
        k.show();
        k.show2(55);
    }
}
