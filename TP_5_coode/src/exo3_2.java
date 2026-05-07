import java.util.Scanner;

class SoldeInsuffisantException3 extends Exception {}
class MontantInvalideException3 extends RuntimeException {}

public class exo3_2 {

    String code;
    double solde;

    public exo3_2(String code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    void retirer(exo3_2 e, double montant) throws SoldeInsuffisantException3 {
        if (montant <= 0) {
            throw new MontantInvalideException3();
        }
        if (montant > e.solde) {
            throw new SoldeInsuffisantException3();
        }
        e.solde -= montant;
        System.out.println("Nouveau solde : " + e.solde);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter le code du compte : ");
        String code = sc.nextLine();

        System.out.print(" Enter le solde initial : ");
        double solde = sc.nextDouble();

        exo3_2 e = new exo3_2(code, solde);

        System.out.print(" Enter le montant a retirer : ");
        double montant = sc.nextDouble();

        try {
            e.retirer(e, montant);
        } catch (SoldeInsuffisantException3 ex) {
            System.out.println("Erreur : Solde insuffisant.");
        } catch (MontantInvalideException3 ex) {
            System.out.println("Erreur : Montant invalide.");
        }

        sc.close();
    }
}