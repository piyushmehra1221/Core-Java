import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");
        int names = sc.nextInt();
        

        String n[] = new String[names];

        for (int i = 0; i < n.length; i++){
            System.out.println("enter your name");
            n[i] = sc.next();
        } 

        System.out.println("Enter Name to count occurance : ");
        String nameToSearch = sc.next();

        int count = 0;

        for (int i = 0; i < n.length; i++) {
            if (nameToSearch.equals(n[i]))
                count++;
        }

        System.out.println(count);

    }
}
