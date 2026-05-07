import java.util.Scanner;

class MontantInvalideException extends RuntimeException {}

public class exo2_2 {

    String code;
    double solde;

    public exo2_2(String code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    void verser(exo2_2 e, double montant) {
        if (montant <= 0) {
            throw new MontantInvalideException();
        }
        e.solde += montant;
        System.out.println("Nouveau solde : " + e.solde);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter le code du compte : ");
        String code = sc.nextLine();

        System.out.print(" Enter le solde initial : ");
        double solde = sc.nextDouble();

        exo2_2 e = new exo2_2(code, solde);

        System.out.print(" Enter le montant a verser : ");
        double montant = sc.nextDouble();

        try {
            e.verser(e, montant);
        } catch (MontantInvalideException ex) {
            System.out.println("Erreur : Montant invalide (doit etre > 0).");
        }

        sc.close();
    }
}