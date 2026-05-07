import java.util.Scanner;

public class exo3 {

    public exo3() {}

    public void versionIf(exo3 e, int[] tab, int index) {
        if (index >= 0 && index < 5) {
            System.out.println(tab[index]);
        } else {
            System.out.println("Hors limites");
        }
    }

    public void versionCatch(exo3 e, int[] tab, int index) {
        try {
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Hors limites");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tab = {10, 20, 30, 40, 50};

        System.out.print(" Enter un index : ");
        int index = sc.nextInt();

        exo3 e = new exo3();

        e.versionIf(e, tab, index);
        e.versionCatch(e, tab, index);

        sc.close();
    }
}