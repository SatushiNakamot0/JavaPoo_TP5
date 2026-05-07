import java.util.Scanner;

class EmailInvalideException4 extends Exception {}
class AgeInvalideException4 extends Exception {}

public class exo4_2 {

    public exo4_2() {}

    void inscrire(exo4_2 e, String email, int age) throws EmailInvalideException4, AgeInvalideException4 {
        if (!email.contains("@")) {
            throw new EmailInvalideException4();
        }
        if (age < 18) {
            throw new AgeInvalideException4();
        }
        System.out.println("Inscription reussie");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter email : ");
        String email = sc.nextLine();
        System.out.print(" Enter age : ");
        int age = sc.nextInt();

        exo4_2 e = new exo4_2();
        try {
            e.inscrire(e, email, age);
        } catch (EmailInvalideException4 ex) {
            System.out.println("Erreur : Email invalide");
        } catch (AgeInvalideException4 ex) {
            System.out.println("Erreur : Age invalide");
        }
        sc.close();
    }
}