public class pallindrome {
    public static void main(String[] args) {
        int num[]={121};
        int i=0;
        int temp=num[num.length-1];
        int rem,sum=0;
        while (temp>0) 
        {
            rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;  
        }
        if(num[num.length-1]==sum)
        {
            System.out.println("pallindrome");
        }
        else
        {
            System.out.println("not");
        }
    }
}
