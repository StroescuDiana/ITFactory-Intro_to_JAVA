/*
 Operatori

->aritmetici: +, -, /, *, %(modulo)
->de comparatie: < >, ==, !=, >=, <=
->logici: &&(si), ||(sau; suficient sa fie unul adevarat)

Ternary operator ? "x" : "y"
*/


public class Operatori {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;
        String age;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Comparison Operators
        int x = 5;
        int y = 10;

        boolean isLess = x < y;
        boolean isGreater = x > y;
        boolean isEqual = x == y;
        boolean isNotEqual = x != y;
        boolean isGreaterOrEqual = x >= y;
        boolean isLessOrEqual = x <= y;

        System.out.println("\nComparison Operators:");
        System.out.println("x < y: " + isLess);
        System.out.println("x > y: " + isGreater);
        System.out.println("x == y: " + isEqual);
        System.out.println("x != y: " + isNotEqual);
        System.out.println("x >= y: " + isGreaterOrEqual);
        System.out.println("x <= y: " + isLessOrEqual);

        // Logical Operators
        boolean p = true;
        boolean q = false;

        boolean resultAND = p && q;
        boolean resultOR = p || q;

        System.out.println("\nLogical Operators:");
        System.out.println("p && q: " + resultAND);
        System.out.println("p || q: " + resultOR);

        // Ternary Operator
        age = a < 18 ? "You are a minor" : "You're an adult";
        System.out.println(age);
    }
}

