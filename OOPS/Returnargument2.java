class A
{
   int show1(int b)
   {
     System.out.println("value of b is "+b);
    return b;
   }
}

class B
{
   char show1(char p)
   {
    System.out.println("char is :"+p);
    return p;
   }
}

class C
{

    int show1(int b)
    {
      System.out.println("value of b is "+b);
     return b;
    }


    float show1(float num)
   {
    System.out.println("num is : "+num);
    return num;
   }

   char show1(char p)
   {
    System.out.println("char is :"+p);
    return p;
   }
}

class D
{
  String show1(String name)
  {
    System.out.println("name is :"+name);
    return name;
  }

  int show1(int b)
    {
      System.out.println("value of b is "+b);
     return b;
    }


    float show1(float num)
   {
    System.out.println("num is : "+num);
    return num;
   }

   char show1(char p)
   {
    System.out.println("char is :"+p);
    return p;
   }
}


public class Returnargument2 {
    
    public static void main(String[] args) {
        
        A k=new A();
        k.show1(55);

        B k1=new B();
        k1.show1('p');

        C k2=new C();
        k2.show1(55);
        k2.show1('Q');
        k2.show1(4.7f);

        D k3=new D();
        k3.show1('P');
        k3.show1(5.5f);
        k3.show1("piyush");
    }
}
