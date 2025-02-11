public class evenandodd {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6,7,8,9,10 };

        for(int i=0;i<5;i++)
        {
            if(a[i]%2==0)
           System.out.print(a[i]+" ");
            
          
           }
           for(int j=5;j<a.length;j++)
           {
            if(a[j]%2!=0)
            System.out.print(a[j]+" ");
           }
           
           
        }
    }


