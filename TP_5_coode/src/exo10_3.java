import java.util.Scanner;

class User {
    String nom;
    public User(String nom) { this.nom = nom; }
    public String toString() { return "User: " + nom; }
}

class Repository<T> {
    void save(T obj) {
        System.out.println("Objet sauvegarde : " + obj.toString());
    }
}

class UserRepository extends Repository<User> {
}

public class exo10_3 {

    public exo10_3() {}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter le nom de l'utilisateur a sauvegarder : ");
        String n = sc.nextLine();

        User u = new User(n);
        UserRepository repo = new UserRepository();
        repo.save(u);

        sc.close();
    }
}