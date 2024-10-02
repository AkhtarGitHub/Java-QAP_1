public class TestDate {
    public static void main(String[] args) {
        // Creating a Date object
        Date myDate = new Date(24, 9, 2024);

        // Printing the Date object using the toString method
        System.out.println("Date: " + myDate.toString());

        // Changing the date using setters
        myDate.setDay(25);
        myDate.setMonth(12);
        myDate.setYear(2025);

        // Printing the updated Date
        System.out.println("Updated Date: " + myDate.toString());

        // Setting the date using setDate method
        myDate.setDate(1, 1, 2023);

        // Printing the new set date
        System.out.println("New Date: " + myDate.toString());
    }
}
