import java.util.Scanner;

class StockInsuffisantException6 extends Exception {}

public class exo6_2 {
    int stock;

    public exo6_2(int stock) {
        this.stock = stock;
    }

    void retirerDuStock(exo6_2 p, int quantite) throws StockInsuffisantException6 {
        if (quantite > p.stock) {
            throw new StockInsuffisantException6();
        }
        p.stock -= quantite;
        System.out.println("Stock restant : " + p.stock);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exo6_2 p = new exo6_2(50);
        System.out.print(" Enter quantite a retirer : ");
        int q = sc.nextInt();

        try {
            p.retirerDuStock(p, q);
        } catch (StockInsuffisantException6 ex) {
            System.out.println("Erreur : Stock insuffisant");
        }

        sc.close();
    }
}