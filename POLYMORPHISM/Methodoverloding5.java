class A 
{
    void show(int b,float a)
    {
       System.out.println(a+" "+b );
    }
    void show(float b,int a)
    {
      System.out.println(a+" "+b);
    }
}

public class Methodoverloding5 {
    public static void main(String[] args) {
        
        A k=new A();
        k.show(5, 5.5f);
        k.show(5.5f,5);
    }
}
