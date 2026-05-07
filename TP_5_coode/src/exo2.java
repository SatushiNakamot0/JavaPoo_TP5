import java.util.Scanner;

public class exo2 {

    public exo2() {}

    public void longueurSansCatch(exo2 e, String s) {
        if (s == null) {
            System.out.println("Null");
        } else {
            System.out.println(s.length());
        }
    }

    public void longueurAvecCatch(exo2 e, String s) {
        try {
            System.out.println(s.length());
        } catch (NullPointerException ex) {
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter une chaine : ");
        String s = sc.nextLine();

        exo2 e = new exo2();

        e.longueurSansCatch(e, s);
        e.longueurAvecCatch(e, s);

        String testNull = null;
        e.longueurSansCatch(e, testNull);
        e.longueurAvecCatch(e, testNull);

        sc.close();
    }
}