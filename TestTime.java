import java.sql.Time;

public class TestTime {
    public static void main(String[] args) {
        // Create two Time objects
        Time t1 = new Time(21, 10, 15);
        Time t2 = new Time(10, 20, 25);

        // Display the initial times
        System.out.println("Initial times:");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);

        // Apply nextSecond() for t1 and previousSecond() for t2
        t1.nextSecond();
        t2.previousSecond();

        // Display the final times
        System.out.println("\nTimes after nextSecond() and previousSecond():");
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
    }
}
