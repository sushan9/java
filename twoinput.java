import java.util.Scanner;

public class twoinput {
    public static void main(String[] args){

        Scanner imput=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a= imput.nextInt();
        System.out.println("Enter the value of B");
        int b=imput.nextInt();
        if(a==b){
            System.out.println("A is equal to b");
        }
        else { 
            if(a>b) 
            {
            System.out.println("A is greater than B");
        }
        else{
            System.out.println("A is less than B");
        }
       
    }
    imput.close();
}
}
