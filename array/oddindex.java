import java.util.Scanner;

public class oddindex {
    public static void show(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2!=0)
            
            System.out.print(a[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int size=sc.nextInt();

        int n[]=new int[size];

        for(int i=0;i<n.length;i++)
        {
            n[i]=n[i]+i;
        }
        show(n);
        
    }
}
