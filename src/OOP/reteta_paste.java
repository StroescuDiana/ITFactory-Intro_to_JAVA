package OOP;

public class reteta_paste {

    // proprietati/ fields/ atributes
    int paste;
    int oua;
    boolean parmezan;
    String timp;

    public reteta_paste(int paste, int oua, boolean parmezan, String timp) {
        this.paste = paste;
        this.oua = oua;
        this.parmezan = parmezan;
        this.timp = timp;
    }

    public void prepararePaste(){
        System.out.println("Am pus " + this.paste + " grame de paste la fiert.");
        System.out.println("Pregatesc sosul din " + this.oua + " oua, sare, piper, smantana de gatit.");
        System.out.println("Dupa ce s-au fiert pastele, le amestec impreuna cu sosul.");
        if (parmezan == true){
            System.out.println("Le asez intr-o farfurie si rad parmezan deasupra.");

        } else {
            System.out.println("Le asez intr-o farfurie si nu rad parmezan deasupra.");
        }
        System.out.println("Totul a durat " + this.timp + ".");

    }
}
