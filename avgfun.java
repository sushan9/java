import java.util.Scanner;

//Enter 3 numbers from the user & make a function to print their average.

public class avgfun {

    public static int averagefun(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);//this is same as the used scanf in
        // c-program, as syntax is diff
        // int a= sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();

        int a = 5, b = 6, c = 7;
        // int avg=averagefun(a, b, c);
        // System.out.println(avg);
        System.out.println("The averag is" + " " + averagefun(a, b, c));
    }
}
