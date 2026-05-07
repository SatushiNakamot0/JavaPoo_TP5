import java.util.Scanner;

public class exo10_2 {

    public exo10_2() {}

    void expliquer(exo10_2 e) {
        System.out.println("1. Checked : Pour les erreurs externes recuperables (ex: Fichier introuvable).");
        System.out.println("2. Unchecked : Pour les erreurs de logique (bugs) (ex: Index hors limites).");
        System.out.println("3. Personnalisee : Pour donner un sens metier clair a l'erreur.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter 1 pour afficher la synthese : ");
        int choix = sc.nextInt();

        exo10_2 e = new exo10_2();
        if (choix == 1) {
            e.expliquer(e);
        }

        sc.close();
    }
}