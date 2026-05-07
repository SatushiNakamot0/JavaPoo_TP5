import java.util.Scanner;

class AuthentificationException5 extends Exception {}

public class exo5_2 {

    public exo5_2() {}

    void login(exo5_2 e, String username, String password) throws AuthentificationException5 {
        if (!username.equals("admin") || !password.equals("1234")) {
            throw new AuthentificationException5();
        }
        System.out.println("Connexion reussie");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter username : ");
        String user = sc.nextLine();
        System.out.print(" Enter password : ");
        String pass = sc.nextLine();

        exo5_2 e = new exo5_2();
        try {
            e.login(e, user, pass);
        } catch (AuthentificationException5 ex) {
            System.out.println("Identifiants incorrects");
        }
        sc.close();
    }
}