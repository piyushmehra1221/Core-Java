class A 
{
    void show(int a,int b)
    {
       int rr=a+b;
       System.out.println("add is :"+a);
    }
    void show(float a,float b)
    {
        float rr=a-b;
        System.out.println("sub is :"+a);
    }
    void show(int a, float b)
    {
        float rr=a/b;
        System.out.println("div is :"+a);
    }
    void show(float a,int b)
    {
        float rr=a*b;
        System.out.println("multi is :"+rr);
    }
    void show(long a , float c)
    {
        double rr=a%c;
        System.out.println("mod is :"+rr);
    }
}


public class Methodoverloding2 {
    public static void main(String[] args) {
        A k=new A();
        k.show(5, 5);
        k.show(5.5f,5.5f);
        k.show(55,5f);
        k.show(5.5f,5);
        k.show((long)55,5f);
    }
}
