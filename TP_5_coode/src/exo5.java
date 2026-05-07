import java.util.Scanner;

public class exo5 {

    public exo5() {}

    public int racineCarree(exo5 e, int x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        }
        return (int) Math.sqrt(x);
    }

    public void justifier(exo5 e) {
        System.out.println("Justification : IllegalArgumentException car c'est une erreur de logique du developpeur (argument invalide) et non une erreur materielle.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter un entier pour la racine : ");
        int x = sc.nextInt();

        exo5 e = new exo5();
        e.justifier(e);

        try {
            int resultat = e.racineCarree(e, x);
            System.out.println(resultat);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erreur");
        }

        sc.close();
    }
}