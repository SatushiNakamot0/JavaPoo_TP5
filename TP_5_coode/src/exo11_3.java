import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class exo11_3 {

    public exo11_3() {}

    void afficherListe(List<?> liste) {
        for (Object obj : liste) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> noms = new ArrayList<>();
        noms.add("Yazid");
        noms.add("ENSAH");

        exo11_3 e = new exo11_3();
        System.out.print(" Liste wildcard : ");
        e.afficherListe(noms);

        sc.close();
    }
}