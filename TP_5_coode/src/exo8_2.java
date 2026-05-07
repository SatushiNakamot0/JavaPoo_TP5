import java.util.Scanner;

class ChampObligatoireException8 extends Exception {}

public class exo8_2 {

    public exo8_2() {}

    void validerFormulaire(exo8_2 e, String nom, String email) throws ChampObligatoireException8 {
        if (nom == null || nom.isEmpty() || email == null || email.isEmpty()) {
            throw new ChampObligatoireException8();
        }
        System.out.println("Formulaire valide");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter nom : ");
        String n = sc.nextLine();
        System.out.print(" Enter email : ");
        String m = sc.nextLine();

        exo8_2 e = new exo8_2();
        try {
            e.validerFormulaire(e, n, m);
        } catch (ChampObligatoireException8 ex) {
            System.out.println("Erreur : Champ obligatoire vide");
        }
        sc.close();
    }
}