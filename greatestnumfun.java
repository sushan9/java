public class greatestnumfun {

    public static int greatestnum(int a, int b) {
        if (a > b) {
            System.out.println("a is greatest");
        } else {
            System.out.println("b is greatest");
        }
        return 1;
    }

    public static void main(String[] args) {
        int a = 7, b = 6;
        greatestnum(a, b);
        // System.out.println("The greatest number is" + greatest);
    }
}
