import java.util.Scanner;

interface Calcul<T> {
    T addition(T a, T b);
}

class CalculInt implements Calcul<Integer> {
    public Integer addition(Integer a, Integer b) {
        return a + b;
    }
}

class CalculDouble implements Calcul<Double> {
    public Double addition(Double a, Double b) {
        return a + b;
    }
}

public class exo3_3 {

    public exo3_3() {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter premier Integer : ");
        int i1 = sc.nextInt();
        System.out.print(" Enter second Integer : ");
        int i2 = sc.nextInt();
        CalculInt ci = new CalculInt();
        System.out.println("Somme Integer : " + ci.addition(i1, i2));

        System.out.print(" Enter premier Double : ");
        double d1 = sc.nextDouble();
        System.out.print(" Enter second Double : ");
        double d2 = sc.nextDouble();
        CalculDouble cd = new CalculDouble();
        System.out.println("Somme Double : " + cd.addition(d1, d2));

        sc.close();
    }
}