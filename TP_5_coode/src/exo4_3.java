import java.util.Scanner;

interface Comparateur4<T> {
    int comparer(T a, T b);
}

class ComparateurInt4 implements Comparateur4<Integer> {
    @Override
    public int comparer(Integer a, Integer b) {
        return a.compareTo(b);
    }
}

class ComparateurString4 implements Comparateur4<String> {
    @Override
    public int comparer(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

public class exo4_3 {

    public exo4_3() {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter premier entier : ");
        int i1 = sc.nextInt();
        System.out.print(" Enter second entier : ");
        int i2 = sc.nextInt();

        ComparateurInt4 ci = new ComparateurInt4();
        System.out.println("Resultat comparaison (Integer) : " + ci.comparer(i1, i2));

        sc.nextLine();
        System.out.print(" Enter premiere chaine : ");
        String s1 = sc.nextLine();
        System.out.print(" Enter seconde chaine : ");
        String s2 = sc.nextLine();

        ComparateurString4 cs = new ComparateurString4();
        System.out.println("Resultat comparaison (Longueur String) : " + cs.comparer(s1, s2));

        sc.close();
    }
}