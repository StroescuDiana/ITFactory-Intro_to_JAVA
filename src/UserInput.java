import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // used for input information
        // sysout FOR System.out.println()

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
        scanner.nextLine(); // --------------> used to clear out \n and proceed with the next question
        System.out.println("What is your favourite food?");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);

    }
}
