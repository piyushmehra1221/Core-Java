import java.util.Scanner;

public class targetarmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array size : ");

        int size = sc.nextInt();

        int arm[] = new int[size];

        int rem, sum = 0;

        int temp = 0;

        int count = 0;

        for (int i = 0; i < arm.length; i++) {
            sum = 0;
            count = 0;

            System.out.print("Enter Number : ");
            arm[i] = sc.nextInt();

            temp = arm[i];

            while(temp > 0){
                count++;
                temp/=10;
            }


            temp = arm[i];
            int pow = 1;
            while(temp > 0){
                rem = temp%10;
                temp/=10;
                pow = 1;
                for(int j = 1; j <= count;j++)
                    pow *= rem;
                sum += pow;
            }

            if( sum == arm[i] )
                System.out.println(arm[i] + " is Armstrong ");

            // if (count == 3) {

            //     while (temp > 0) {
            //         rem = temp % 10;
            //         sum = sum + rem * rem * rem;
            //         temp = temp / 10;
            //     }

            //     if (arm[i] == sum) {
            //         System.out.println(sum + " arm");
            //     } else {
            //         System.out.println("not");
            //     }

            // }

        }

        sc.close();

    }
}
