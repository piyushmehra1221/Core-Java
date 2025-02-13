public class swapvalue2 {
    public static void main(String[] args) {
        
       int a[]={1,2,3,4,5,6,7,8,9,10};

       int temp=a[0];
       a[0]=a[4];
       a[4]=temp;
       temp=a[5];
       a[5]=a[a.length-1];
       a[a.length-1]=temp;

       for(int i: a)
       {
        System.out.print(i+" ");
       }

    }
}
