import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Liste {
    public static void main(String[] args) {
        // decalaram o lista goala
        List<String> fructe = new ArrayList<>();
        // au o dimensiune dinamica

        // adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se iau elementele
        fructe.get(0);
        System.out.println(fructe.get(0));

        // aflam dimensiunea
        System.out.println("In lista sunt " + fructe.size() + " fructe");

        // cum se afla indexul unui elem
        System.out.println(fructe.indexOf("banana"));

        // este lista goala
        System.out.println(fructe.isEmpty());

        if (fructe.isEmpty()){
            System.out.println("Nu avem ce manca");
        } else {
            System.out.println("Avem ce manca :)");
        }
        ///// SAU /////
        if (!fructe.isEmpty()){  // Daca lista fructe NU este goala atunci ...
            System.out.println("Avem ce manca");
        } else {
            System.out.println(" :( ");
        }

        // scoatem un element
        fructe.remove("portocala");

        // printam elementele
        System.out.println(fructe);

        // declaram o lista (de tip ArrayList) imutabila(adica nu mai putem adauga in ea) si o initializam cu valori
        List<String> list = Arrays.asList("foo", "bar");
        /* nu pot sa mai scriu list.add("rosu");                                                             */
        //  <Integer>                  (1,2,3,4,5);
        System.out.println(list);

        // declaram o lista de tip ArrayList dinamic si o initializam
        String[] materii = {"romana", "desen", "mate", "istorie"};   // am creat un array
        List<String> materiiList = new ArrayList<>(Arrays.asList(materii)); // am transformat array-ul intr-o lista de tip ArrayList
        materiiList.add("sport");
        System.out.println(materiiList);
        /* ArrayList poate fi printat in intregime
        Dar un Array nu poate fi printat direct */

        // aflam index-ul unui element
        int element_index = materiiList.indexOf("mate");
        // stergem elementul din acel index
        materiiList.remove(element_index);
        // putem sa scoatem si in functie de valoare
        materiiList.remove("desen");
        System.out.println(materiiList);

    }
}
