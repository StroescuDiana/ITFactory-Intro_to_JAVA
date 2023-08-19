public class While {

    public static void main(String[] args) {
        // exercitiu: masina merge cat timp are benzina
        int litri_benzina = 10;
        while(litri_benzina > 0){
            // acceleram
            System.out.println("Vroom. " + "Litri " + litri_benzina);
            // scadem benzina
            litri_benzina = litri_benzina -1;
            //System.out.println("Litri ramasi " + litri_benzina);

            // aprindem beculetul atunci cand avem <= 3 litri
            if (litri_benzina <= 3){
                System.out.println("Se aprinde becul rosu");
            }
        }
        System.out.println("Rezervor gol");

    }
}
