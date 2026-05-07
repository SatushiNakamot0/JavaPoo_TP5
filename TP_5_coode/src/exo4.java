import java.util.Scanner;

public class exo4 {

    public exo4() {}

    public void convertir(exo4 e, String s) {
        try {
            int val = Integer.parseInt(s);
            System.out.println(val);
        } catch (NumberFormatException ex) {
            System.out.println("Message clair : La chaine saisie ne peut pas etre convertie en entier.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter une chaine a convertir : ");
        String s = sc.nextLine();

        exo4 e = new exo4();
        e.convertir(e, s);

        sc.close();
    }
}