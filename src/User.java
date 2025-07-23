public class User {
    private String name;
    private String email;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
    }

    public String getName() { return name; }
    public String getEmail() { return email;}

    public String toString() {
        return "Nom: " + name + ", Email: " + email;
    }
}
