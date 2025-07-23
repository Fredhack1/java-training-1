import java.util.ArrayList;
import java.util.Scanner;

public class UserManager {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        Scanner scanner =  new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Menu =====");
            System.out.println("1. Ajouter un utilisateur");
            System.out.println("2. Lister les utilisateurs");
            System.out.println("3. Quitter");
            System.out.println("Choix : ");

            int choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Nom : ");
                    String name = scanner.nextLine();

                    System.out.println("Email : ");
                    String email = scanner.nextLine();

                    users.add(new User(name, email));
                    System.out.println("✅ Utilisateur ajouté !");
                    break;

                case 2:
                    System.out.println("\n👥 Liste des utilisateurs :");
                    if (users.isEmpty()) {
                        System.out.println("Aucun utilisateur pour le moment.");
                    } else  {
                        for (User user : users) {
                            System.out.println(user);
                        }
                    }
                    break;

                case 3:
                    System.out.println("👋 Au revoir !");
                    return;

                default:
                    System.out.println("❌ Choix invalide !");
            }
        }
    }
}
