import java.util.Scanner;

public class switchbreak {
    public static void main(String[] args){

        System.out.println("presss the button");
        Scanner button=new Scanner(System.in);
        int key=button.nextInt();
        switch(key){
            case 1:System.out.println("I am a student");
            break;
            case 2:System.out.println("I am a programmer");
            break;
            case 3:System.out.println("I love java");
            break;
            default:System.out.println("Invalid option");

        }
        button.close();
    }
}
