import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class exo12_3 {

    public exo12_3() {}

    void afficherNombres(List<? extends Number> liste) {
        for (Number n : liste) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        List<Integer> entiers = new ArrayList<>();
        entiers.add(10);
        entiers.add(20);

        List<Double> reels = new ArrayList<>();
        reels.add(15.5);
        reels.add(25.5);

        exo12_3 e = new exo12_3();

        System.out.print(" Liste Integer : ");
        e.afficherNombres(entiers);

        System.out.print(" Liste Double : ");
        e.afficherNombres(reels);

        sc.close();
    }
}