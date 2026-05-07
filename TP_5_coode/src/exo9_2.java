import java.util.Scanner;

class PaiementRefuseException9 extends Exception {}
class CarteExpireeException9 extends Exception {}

public class exo9_2 {
    double plafond = 2000.0;

    public exo9_2() {}

    void payer(exo9_2 e, double montant, boolean expiree) throws PaiementRefuseException9, CarteExpireeException9 {
        if (expiree) {
            throw new CarteExpireeException9();
        }
        if (montant > e.plafond) {
            throw new PaiementRefuseException9();
        }
        System.out.println("Paiement effectue");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter montant : ");
        double m = sc.nextDouble();
        System.out.print(" Est-ce que la carte est expiree (true/false) : ");
        boolean exp = sc.nextBoolean();

        exo9_2 e = new exo9_2();
        try {
            e.payer(e, m, exp);
        } catch (PaiementRefuseException9 ex) {
            System.out.println("Erreur : Plafond depasse");
        } catch (CarteExpireeException9 ex) {
            System.out.println("Erreur : Carte expiree");
        }
        sc.close();
    }
}