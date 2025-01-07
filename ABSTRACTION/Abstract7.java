abstract class A 
{
    abstract int show(int a);
}

public class Abstract7 {
    public static void main(String[] args) {
        A k=new A() {
            int show(int a)
            {
                System.out.println("value of a is :"+a);
                return a;
            }
        };
        k.show(55);
    }
}
