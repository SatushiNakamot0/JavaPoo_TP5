import java.util.Scanner;

public class exo1 {

    public exo1() {}

    public void calculer(exo1 e, int a, int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException();
            }
            System.out.println(a / b);
        } catch (ArithmeticException ex) {
            System.out.println("Erreur");
        } catch (Exception ex) {
            System.out.println("Erreur");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();

        System.out.print("Enter b : ");
        int b = sc.nextInt();

        exo1 d = new exo1();
        d.calculer(d, a, b);

        sc.close();
    }
}