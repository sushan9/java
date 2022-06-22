
import java.util.Scanner;
public class conditional {
    public static void main(String[] args){

        System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
        Integer age= sc.nextInt();

        if(age>=18&&age<=50){
            System.out.print("You are adult");
        }
        else if (age>50){
            System.out.println("You are old");
        }
        else{
            System.out.println("you are young");
        }
        sc.close();
    }
}
