import java.util.Scanner;

public class exo6 {

    boolean estAllumee;

    public exo6() {
        this.estAllumee = false;
    }

    public void demarrer(exo6 e) {
        if (e.estAllumee) {
            throw new IllegalStateException();
        }
        e.estAllumee = true;
        System.out.println("Machine ON");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter 1 pour demarrer la machine : ");
        int action = sc.nextInt();

        exo6 e = new exo6();

        try {
            e.demarrer(e);
            e.demarrer(e);
        } catch (IllegalStateException ex) {
            System.out.println("Erreur : La machine est deja ON");
        }

        sc.close();
    }
}