interface A 
{
    void show1();
    void show2(int a);
    int show3();
    int show(int b);

}
class B implements A 
{
   public void show1()
    {
        System.out.println("No return and NO argument");
    }
    public void show2(int a)
    {
        System.out.println("NO return and Argument");
    }
    public int show3()
    {
        System.out.println("Retrun and NO argument");
        return 0;
    }
    public int show(int b)
    {
        System.out.println("Return and Argument ");
        return 0;
    }
}

public class Interface1
{
    public static void main(String[] args)
    {
      B k=new B();
      k.show1();
      k.show2(55);
      k.show3();
      k.show(44);
    }
}