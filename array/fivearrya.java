import java.util.Scanner;

public class fivearrya {
  
    public static void show(int n[])
    {
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+" ");
        }
        System.out.println();
      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size");
       int size=sc.nextInt();

      int n[]=new int[size];
      
      for(int i=0;i<n.length;i++)
      {
        n[i]=n[i]+i;

      }
      show(n);

      System.out.println("enter a size");
      int size1=sc.nextInt();
       
      int r[]=new int[size1];
      for(int i=0;i<r.length;i++)
      {
       
        r[i]=r[i]+i;

      }
     
      show(r);
      
      System.out.println("enter a size");
      int size2=sc.nextInt();
       int p[]=new int[size2];
       for(int i=0;i<p.length;i++)
       {
       
        p[i]=p[i]=i;
       }
       show(p);
       
      
    }
}
