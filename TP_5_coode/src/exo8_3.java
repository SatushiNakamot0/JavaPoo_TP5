import java.util.Scanner;

class Animal<T> {
    T nom;
}

class Chien extends Animal<String> {
    public Chien(String nom) {
        this.nom = nom;
    }
}

public class exo8_3 {

    public exo8_3() {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter le nom du chien : ");
        String n = sc.nextLine();

        Chien c = new Chien(n);
        System.out.println("Nom du chien (type String) : " + c.nom);

        sc.close();
    }
}