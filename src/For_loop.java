public class For_loop {
    public static void main(String[] args) {
        // for = se foloseste cand stim de cate ori vrem sa facem o chestie repetata

        for (int i = 1; i <= 102; i++){
            //System.out.println("Dalmatianul " + i);
        }

        int[] numere = {1,2,3,10,77};
        for (int i = 0; i < numere.length; i++){
            //System.out.println("Pozitia cu indexul " + i + " " + "are valoarea " + numere[i]);
        }

        // for each =  parcurge toate elementele din array si ajunge direct la valoare
        String[] culori = {"maro", "rosu", "galben", "verde"};
        for (String culoare:culori) {
            //System.out.println(culoare);
        }

        // suma numerelor din array
        int s = 0;
        for (int numar:numere){
            s += numar;
        }
        System.out.println("Suma numerelor din array este " + s);

    }
}
