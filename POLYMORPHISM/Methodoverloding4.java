class A
{
  int show(int a, int b)
  {
    int rr=a+b;
    System.out.println("add is :"+rr);
    return rr;
  }
  float show(int d,int e,int c)
  {
    int rr=c-d-e;
    System.out.println("sub is :"+rr);
    return rr;
  }
  long show(int f, int g, int h, int i)
  {
    
    int rr=f*g*h*i;
    System.out.println("multi is :"+rr);
    return rr;
  }
  double show(int j,int k,int l,int n,int m)
  {
    
    int rr=j%k%l%m%n;
    System.out.println("mod is :"+rr);
    return rr;
  }
  short show(int o,int p,int q,int r,int s,int t)
  {
    
    int rr=o/p/q/r/s/t;
    System.out.println("div is :"+rr);
    return (short) rr;
  }
}

public class Methodoverloding4 {
    public static void main(String[] args) {
        
        A k=new A();
        k.show(5, 5);
        k.show(5,5,5);
        k.show(5,5,5,5);
        k.show(5,5,5,5,5);
        k.show(5,5,5,5,5,5);
    }
}
