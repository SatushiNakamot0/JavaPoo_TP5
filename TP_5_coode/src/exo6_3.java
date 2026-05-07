import java.util.Scanner;

public class exo6_3 {

    public exo6_3() {}

    public static <T> void afficherTableau(T[] tableau) {
        for (T element : tableau) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static <T> T getPremier(T[] tableau) {
        if (tableau.length > 0) {
            return tableau[0];
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] nombres = {10, 20, 30, 40, 50};
        String[] mots = {"Java", "Data", "ENSAH"};

        System.out.print(" Tableau Integer : ");
        afficherTableau(nombres);
        System.out.println("Premier Integer : " + getPremier(nombres));

        System.out.print(" Tableau String : ");
        afficherTableau(mots);
        System.out.println("Premier String : " + getPremier(mots));

        sc.close();
    }
}