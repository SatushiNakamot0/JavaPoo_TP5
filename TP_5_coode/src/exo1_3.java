import java.util.Scanner;

public class exo1_3<T> {
    T contenu;

    public exo1_3() {}

    void setContenu(exo1_3<T> e, T contenu) {
        e.contenu = contenu;
    }

    T getContenu(exo1_3<T> e) {
        return e.contenu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Test avec String
        System.out.print(" Enter un contenu String : ");
        String s = sc.nextLine();
        exo1_3<String> boiteS = new exo1_3<>();
        boiteS.setContenu(boiteS, s);
        System.out.println("Contenu String : " + boiteS.getContenu(boiteS));

        // Test avec Integer
        System.out.print(" Enter un contenu Integer : ");
        int i = sc.nextInt();
        exo1_3<Integer> boiteI = new exo1_3<>();
        boiteI.setContenu(boiteI, i);
        System.out.println("Contenu Integer : " + boiteI.getContenu(boiteI));

        sc.close();
    }
}