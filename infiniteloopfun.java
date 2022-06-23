import java.lang.Thread.State;

//Write an infinite loop using do while condition.

public class infiniteloopfun {

    public static void infiniteloop() {
        int x = 100;
        do {
            System.out.println("This is infinite loop");
            x++;

        } while (x > 10);//Here x is greater than 10, so loop will run infinie amoun of time.
    }

    public static void main(String[] args) {
        infiniteloop();
    }
}
