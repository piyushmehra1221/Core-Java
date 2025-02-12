public class sum {
    public static void main(String[] args) {
        int num[]={123};
        int temp=num[num.length-1];
        int rem,sum=0;
        while(temp>0)
        {
            rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        System.out.println(sum);
    }
}
