import java.util.Scanner;

public class hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();

        int sum = i + j + k;

        int average = sum / 3;

        System.out.println("The sum is : " + sum);
        System.out.println("The average is : " + average);
        sc.close();
    }
}