public class circumcirclefun {

    public static double circumference(double radius) {
        final double pi = 3.14;
        double circumferen = 2 * pi * radius * radius;
        return circumferen;
    }

    public static void main(String[] args) {
        double radius = 4;
        double circircle = circumference(radius);
        System.out.println("The circumference of circle is: " + circircle);
    }
}
