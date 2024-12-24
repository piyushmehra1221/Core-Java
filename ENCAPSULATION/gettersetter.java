class Person
{
    private String name;
    private int age;

    void set(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    String get()
    {
        return name;
    }
    int get1()
    {
        return age;
    }
}

public class gettersetter {

    public static void main(String[] args) {
        
        Person k=new Person();
        k.set("Piyush" , 19);
        System.out.println(k.get());
        System.out.println(k.get1());
    }
}
