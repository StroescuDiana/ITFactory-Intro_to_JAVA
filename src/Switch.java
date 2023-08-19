import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a day of the week.");
        String day = scanner.nextLine();

        switch (day) {
            case "Tuesday": System.out.println("It is Tuesday");
                break;
            case "Sunday": System.out.println("It is Sunday");
                break;
            case "Monday": System.out.println("It is Monday");
                break;
            case "Friday": System.out.println("It is Friday");
                break;
            // switch(-variable-) = is used to test a variable against a list of values. It is preferable to use it when we have many if statements

            default: System.out.println("That is not a day! Try again.");
                // default is used with switch() and it means that if there's no match it will execute what is typed after the ":"
        }
        scanner.close();
    }

}

