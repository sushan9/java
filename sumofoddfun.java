public class sumofoddfun {

    public static int sumofodd(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 5;
        int oddsum = sumofodd(n);
        System.out.println(oddsum);
    }
}
