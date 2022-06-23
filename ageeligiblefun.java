//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

public class ageeligiblefun {

    public static int ageeligible(int age) {
        if (age >= 18) {
            System.out.println("Person is eligible for vote");
        } else {
            System.out.println("Person is not eligible for vote");
        }
        return 1;
    }

    public static void main(String[] args) {
        int age = 14;
        ageeligible(age);
    }
}
