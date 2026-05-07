import java.util.Scanner;

public class exo7_3 {

    public exo7_3() {}

    public static <T extends Number> double somme(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter un entier (Integer) : ");
        int i = sc.nextInt();
        System.out.print(" Enter un reel (Double) : ");
        double d = sc.nextDouble();

        System.out.println("Somme (doubleValue) : " + somme(i, d));

        sc.close();
    }
}