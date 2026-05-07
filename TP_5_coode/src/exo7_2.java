import java.util.Scanner;

class QuotaDepasseException7 extends Exception {}

public class exo7_2 {
    double limite = 500.0;

    public exo7_2() {}

    void telechargerFichier(exo7_2 e, double taille) throws QuotaDepasseException7 {
        if (taille > e.limite) {
            throw new QuotaDepasseException7();
        }
        System.out.println("Telechargement fini");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter taille du fichier : ");
        double t = sc.nextDouble();

        exo7_2 e = new exo7_2();
        try {
            e.telechargerFichier(e, t);
        } catch (QuotaDepasseException7 ex) {
            System.out.println("Erreur : Quota depasse");
        }
        sc.close();
    }
}