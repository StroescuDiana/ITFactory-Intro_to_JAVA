public class Variabile {
    public static void main(String[] args) {
        String marcaMasina = "Volvo";
        String modelMasina = "XC 90";
        System.out.println("Am cumparat o masina marca: " + marcaMasina);

        System.out.println(marcaMasina.toUpperCase());

        // Override
        marcaMasina = "Ferrari";
        System.out.println("Am cumparat o masina marca: " + marcaMasina);

        // declarare
        String nume;
        String prenume;
        //initializare
        prenume = "Diana";
        nume = "Stroescu";
        // concatenare de strings
        System.out.println(nume +" "+ prenume);

        // STRONGLY typed = trebuie sa specificam tipurile de date cu care lucram
    }
}
