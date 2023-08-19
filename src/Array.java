public class Array {
    public static void main(String[] args) {
        // declarare si iniitializare
        String[] elevi = {"Ada", "Ion", "Maria", "Diana", "Qiqi"}; //indexarea incepe de la 0
        int[] numere ={1, 5, 3, 8, 10};
        // ARRAY are o dimensiune FIXA
        // are proprietatea lenght, care ne da dimensiunea array-ului

        // sa printez tot timpul ultimul element din array indiferent de marime
        System.out.println(elevi[elevi.length - 1]);

        //declarare si alocare de memorie
        int[] note = new int[5];
        note[0] = 10;
        note[1] = 9;
        note[2] = 8;
        System.out.println(note[1]);





    }

}
