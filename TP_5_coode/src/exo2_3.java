import java.util.Scanner;

public class exo2_3<T, U> {
    T premier;
    U second;

    public exo2_3(T premier, U second) {
        this.premier = premier;
        this.second = second;
    }

    void afficherPaire(exo2_3<T, U> p) {
        System.out.println("Paire -> Premier: " + p.premier + ", Second: " + p.second);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter premier element (String) : ");
        String p1 = sc.nextLine();
        System.out.print(" Enter second element (Integer) : ");
        int p2 = sc.nextInt();

        exo2_3<String, Integer> paire = new exo2_3<>(p1, p2);
        paire.afficherPaire(paire);

        sc.close();
    }
}