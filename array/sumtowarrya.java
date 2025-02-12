public class sumtowarrya {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,2,3,4,10};

        int sum1=0;
        int sum2=0;
        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        for(int i=0;i<a.length;i++)
        {
            sum2=sum2+b[i];
        }
        int total=sum1+sum2;
        System.out.println(total);
    }
}
