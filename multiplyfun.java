public class multiplyfun {
    public static int multiplynumber(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        int a = 5, b = 8;
        int mul = multiplynumber(a, b);
        System.out.println("The product of two number is :" + mul);
    }
}
