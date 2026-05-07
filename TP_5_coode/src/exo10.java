import java.util.Scanner;

public class exo10 {

    public exo10() {}

    public void verifierChecked(exo10 e, int age) throws Exception {
        if (age < 18) {
            throw new Exception();
        }
    }

    public void verifierUnchecked(exo10 e, int age) {
        if (age < 18) {
            throw new RuntimeException();
        }
    }

    public void comparer(exo10 e) {
        System.out.println("Comparaison :");
        System.out.println("- Exception (Checked) : Oblige le developpeur a utiliser un try/catch ou un throws. Verifie a la compilation.");
        System.out.println("- RuntimeException (Unchecked) : N'oblige pas de try/catch. L'erreur est detectee seulement a l'execution.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter un age a tester : ");
        int age = sc.nextInt();

        exo10 e = new exo10();
        e.comparer(e);

        try {
            e.verifierChecked(e, age);
        } catch (Exception ex) {
            System.out.println("Erreur Checked attrapee.");
        }

        try {
            e.verifierUnchecked(e, age);
        } catch (RuntimeException ex) {
            System.out.println("Erreur Unchecked attrapee.");
        }

        sc.close();
    }
}