import java.util.Scanner;

public class checktarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

       int a[]={1,2,2,2,4,4,3,3,3,3,3};
       int target=3;
       int count=0;
       int index=0;
       for(int i=0;i<a.length;i++)
       {
         if(target==a[i])
         {
            count++;
            index=i;
         }
        
       }
      
       System.out.println("check number "+target+" count is  " +count+" and index is "+index);
    }
}
