public class scanner {
    public static void main(String[] args) {
        // Création d'un objet User avec des valeurs fixes
        User user = new User("Alice", "Paris");

        // Affichage des informations
        user.displayInfo();
    }
}

// Classe User
class User {
    private String name;
    private String city;

    // Constructeur
    public User(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // Méthode pour afficher les infos
    public void displayInfo() {
        System.out.println("Nom  : " + name);
        System.out.println("Ville : " + city);
    }
}
