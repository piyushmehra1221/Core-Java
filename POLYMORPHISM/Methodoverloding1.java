class A 
{
    void show(int a, int b)
    {
       int c=a+b;
       System.out.println(c);
    }
    void show(int c, int d, int e)
    {
        int rr=c-d-e;
        System.out.println("multi is : "+rr);
    }
    void show(int f, int g, int h , int i)
   {
    int rr=f*g*h*i;
    System.out.println("multi is :"+rr);
}
void show(int j, int k, int l, int m, int n)
{
   int rr=j/k/l/m/n;
   System.out.println("div is :"+rr);
}
void show(int o, int p, int r, int s, int t ,int u)
{
    int rr=o%p%r%s%t%u;
    System.out.println("mod is :"+rr);
}
}


public class Methodoverloding1
{
    public static void main(String[] args)
    {
        A k=new A();
        k.show(55,5 );
        k.show(55,5 ,5);
        k.show(55,5,5,5 );
        k.show(55,5,5,5,5 );
        k.show(55,5,5,5,5,5 );
    }
}