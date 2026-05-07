import java.util.Scanner;

class SoldeInsuffisantException extends Exception {}

public class exo1_2 {

    String code;
    double solde;

    public exo1_2(String code, double solde) {
        this.code = code;
        this.solde = solde;
    }
    void verser(exo1_2 e, double montant) {
        e.solde += montant;
        System.out.println("Nouveau solde : " + e.solde);
    }
    void retirer(exo1_2 e, double montant) throws SoldeInsuffisantException {
        if (montant > e.solde) {
            throw new SoldeInsuffisantException();
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

        exo1_2 e = new exo1_2(code, solde);

        System.out.print(" Enter le montant a retirer : ");
        double montant = sc.nextDouble();

        try {
            e.retirer(e, montant);
        } catch (SoldeInsuffisantException ex) {
            System.out.println("Erreur : Solde insuffisant.");
        }

        sc.close();
    }
}