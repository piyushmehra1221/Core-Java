interface A 
{
  void show1();
}
interface B 
{
  void show2();

}
interface C 
{
  void show3();

}
interface D 
{
  void show4();
}

class P implements A,B,C,D
{
  public void show1()
  {
    System.out.println("Interface A");
  }

  public void show2()
  {
    System.out.println("Interface B");
  }

  public void show3()
  {
    System.out.println("INterface C");
  }

  public void show4()
  {
    System.out.println("Interface D");
  }
}

public class MultipleInterface {
    public static void main(String[] args) {
        P k=new P();
        k.show1();
        k.show2();
        k.show3();
        k.show4();
    }
}
