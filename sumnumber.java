public class sumnumber {
    public static int sumNumber(int a, int b) {
        int sum = a + b;
        // System.out.println("The sum of a and b is " + sum); OR
        return sum;
    }

    public static void main(String[] args) {
        int a = 5, b = 6;
        int Sum = sumNumber(a, b);
        System.out.println("The sum is " + Sum);
    }
}
