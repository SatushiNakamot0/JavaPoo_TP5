import java.util.Scanner;

interface Comparateur5<T> {
    int comparer(T a, T b);
}

class ComparateurInt5 implements Comparateur5<Integer> {
    public int comparer(Integer a, Integer b) {
        return a.compareTo(b);
    }
}

class ComparateurString5 implements Comparateur5<String> {
    public int comparer(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

public class exo5_3 {

    public exo5_3() {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter premier entier : ");
        int i1 = sc.nextInt();
        System.out.print(" Enter second entier : ");
        int i2 = sc.nextInt();

        ComparateurInt5 ci = new ComparateurInt5();
        System.out.println("Resultat comparaison (Integer) : " + ci.comparer(i1, i2));

        sc.nextLine();

        System.out.print(" Enter premiere chaine : ");
        String s1 = sc.nextLine();
        System.out.print(" Enter seconde chaine : ");
        String s2 = sc.nextLine();

        ComparateurString5 cs = new ComparateurString5();
        System.out.println("Resultat comparaison (Longueur String) : " + cs.comparer(s1, s2));

        sc.close();
    }
}