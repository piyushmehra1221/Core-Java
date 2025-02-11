public class breack {
    public static void main(String[] args) {
        
        int a[]={1,2,3,4,5,6,7,8,9,10 };

        for(int i=0;i<a.length;i++)
        {
            if(i==6)
            continue;
            System.out.print(a[i]+" ");
        }
    }
}
