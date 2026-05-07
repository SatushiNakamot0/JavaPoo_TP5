import java.util.Scanner;

class Vehicule<T> {
    T vitesse;
}

class Voiture<T> extends Vehicule<T> {
    public Voiture(T vitesse) {
        this.vitesse = vitesse;
    }
}

public class exo9_3 {

    public exo9_3() {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter la vitesse (Integer) : ");
        int v = sc.nextInt();

        Voiture<Integer> v1 = new Voiture<>(v);
        System.out.println("Vitesse de la voiture : " + v1.vitesse);

        sc.close();
    }
}