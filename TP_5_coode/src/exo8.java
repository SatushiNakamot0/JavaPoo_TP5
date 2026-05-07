import java.util.Scanner;

public class exo8 {

    public exo8() {}

    public void verifierAge(exo8 e, int age) throws Exception {
        if (age < 18) {
            throw new Exception();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter un age : ");
        int age = sc.nextInt();

        exo8 e = new exo8();

        try {
            e.verifierAge(e, age);
            System.out.println("Age valide.");
        } catch (Exception ex) {
            System.out.println("Erreur : Age inferieur a 18.");
        }

        sc.close();
    }
}