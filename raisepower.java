public class raisepower {

    public static int calculatepower(int x, int y) {
        double power = Math.pow(x, y);
        System.out.println(power);
        return 1;
    }

    public static void main(String[] args) {
        int x = 4, y = 2;
        calculatepower(x, y);
    }
}
