import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // MAP = reprezentare de date in sistem cheie-valoare
        // Ada-10 , Mona-8

        // declaram un map
        Map<String,Integer> note_elevi = new HashMap<>();

        // adaugam elemente
        {{
        note_elevi.put("Ada", 9);
        note_elevi.put("Mona", 8);
        note_elevi.put("Marius", 10);
        }}

        // aflu note
        System.out.println("Ada are acum nota " + note_elevi.get("Ada"));

        // suprascriere
        note_elevi.replace("Ada", 5);
        System.out.println("Dupa suprascriere, Ada are acum nota " + note_elevi.get("Ada"));

        // aflam dimensiunea
        System.out.println("Dimensiunea HashMap-ului note_elevi este de " + note_elevi.size());

        // stergem valori
        note_elevi.remove("Mona");
        System.out.println(note_elevi.get("Mona")); // null

        System.out.println("Note_elevi contine: " + note_elevi);

    }
}
