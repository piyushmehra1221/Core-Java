import java.util.Scanner;
public class reserve {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int num[]={1234};
      for(int i=0;i<num.length;i++)
      {
        int rem; int sum=0;
         int temp=num[i];
         while(temp>0)
         {
          
           rem=temp%10;
           sum=sum*10+rem;
           temp=temp/10;
         }
         System.out.println(sum);
      }
         
        
        
       
    }
}
