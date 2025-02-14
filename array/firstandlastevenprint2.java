import java.util.Scanner;

public class firstandlastevenprint2 {

    public static void show(int a[])
    {
        int f=1;
            int l=0;
        for(int i=0;i<a.length;i++)
        {
          
            if(a[i]%2==0)
            {
                if(f==i)
                {
                    f=a[i];
                }
              l=a[i];
           
           
        }
       
        }
        System.out.println(f);
        System.out.println(l);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter size of arrya");
        int size=sc.nextInt();
       
        int a[]={1,2,3,4,5,6,7,8};

        
        // for(int i=0;i<n.length;i++)
        //     if(n[i]%2==0)
        //     {
        //         if(f==i)
        //         {
        //             f=n[i];
        //         }
        //       l=n[i];
           
           
        // }
        
        
        show(a);
        
    }
}
