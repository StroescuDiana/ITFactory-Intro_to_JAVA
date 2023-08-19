public class Functii {
    // o functie simpla care printeaza un salut
    public static void printGreeeting() {
        System.out.println("Buna ziua!");
    }

    // o functie care printeaza un salut in functie de user name
    public static void greetingsName(String nume, String prenume) {
        System.out.println("Buna dimineata " + nume + " " + prenume + "!");

    }

    // o functie care returneaza media numerelor
    public static double mediaNumerelor(double a, double b, double c) {
        double media = (a+b+c) / 3;
        return media;
    }

    public static double piValue() {
        final double PI = 3.14;
        return PI;
    }


    // creez o functie care returneaza cate caractere are numele si prenumele
    public static int numeLenght(String nume) {
        return nume.length();
    }

    public static int prenumeLenght(String prenume) {
        return prenume.length();
    }



    public static void main(String[] args) {
        // din functia main apelez functia printGreeting()

        printGreeeting();

        // apelez functia greetingsName()
        greetingsName("Stroescu", "Diana");
        System.out.println();

        System.out.println("Media numerelor este de: " + mediaNumerelor(5,10,8));
        System.out.println("Media numerelor este de: " + mediaNumerelor(100,50,9999));
        System.out.println();

        double value =piValue();
        System.out.println("Valoarea lui PI este: " + value);
        System.out.println();

        System.out.println("Lungimea numelui este de: " + numeLenght("Stroescu") + " caractere");
        System.out.println("Lungimea prenumelui este de: " + prenumeLenght("Diana") + " caractere");

    }
}
