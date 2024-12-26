class A 
{
    void show(int i)
    {
      System.out.println("int value :"+i);
    }
    void show(float a)
    {
        System.out.println("float value :"+a);
    }
    void show(char a)
    {
        System.out.println("char is :"+a);
    }
    void show(long l)
    {
        System.out.println("long value :"+l);
    }
    void show(double d)
    {
        System.out.println("double value is :"+d);
    }
    void show(short a)
    {
        System.out.println("short value :"+a);
    }
    void show(boolean a)
    {
        System.out.println("boolean value "+a);
    }
    void show(String a)
    {
       System.out.println("string name :"+a);
    }

}


public class Methodoverloding3 {
   public static void main(String[] args) {
      
      A k=new A();
      k.show("Name");
      k.show(7.7f);
      k.show(7.77);
      k.show(56);
      k.show((long)5555);
      k.show((short)55);
      k.show('i');
      k.show(true);
   } 
}
