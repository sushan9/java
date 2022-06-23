import java.util.Scanner;

class displayposneg {
    public static void displayposineg() {
        Scanner totalcount = new Scanner(System.in);
        int number, countpositive = 0, countnegative = 0, countzero = 0;
        char choice;
        do {
            System.out.println("Enter the number");
            number = totalcount.nextInt();
            if (number > 0) {
                countpositive++;
            } else if (number < 0) {
                countnegative++;
            } else {
                countzero++;
            }
            System.out.println("Do you want to continure Y/N");
            choice = totalcount.next().charAt(0);

        } while (choice == 'Y' || choice == 'Y');

        System.out.println("positive number=" + countpositive);
        System.out.println("positive number=" + countnegative);
        System.out.println("positive number=" + countzero);

    }

    public static void main(String[] args) {
        // int countpositive,countnegative,countzero;
        displayposineg();

    }
}