import java.util.Scanner;

public class exo7 {

    public exo7() {}

    public void methodeC(exo7 e) throws Exception {
        throw new Exception();
    }

    public void methodeB(exo7 e) throws Exception {
        e.methodeC(e);
    }

    public void methodeA(exo7 e) {
        try {
            e.methodeB(e);
        } catch (Exception ex) {
            System.out.println("Erreur interceptee par A");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter 1 pour lancer la propagation : ");
        int action = sc.nextInt();

        exo7 e = new exo7();
        e.methodeA(e);

        sc.close();
    }
}