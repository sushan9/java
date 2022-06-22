import java.util.Scanner;

public class oddeven {
    public static void main(String[] args){
        System.out.println("Enter the number");
        Scanner check=new Scanner(System.in);
        int number=check.nextInt();
        if(number%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
        check.close();
    }
}
