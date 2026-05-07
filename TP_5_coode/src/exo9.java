import java.util.Scanner;

class AgeException extends Exception {}

public class exo9 {

    public exo9() {}

    public void verifierAge(exo9 e, int age) throws AgeException {
        if (age < 18) {
            throw new AgeException();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter un age : ");
        int age = sc.nextInt();

        exo9 e = new exo9();

        try {
            e.verifierAge(e, age);
            System.out.println("Age valide.");
        } catch (AgeException ex) {
            System.out.println("Erreur : Age inferieur a 18.");
        }

        sc.close();
    }
}
