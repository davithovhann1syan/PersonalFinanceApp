public class User {
    private int id;
    private String username;
    private String password;


    public boolean login(String username, String password) {
        return true;
    }

    public void logout() {
        System.out.println("a");
        System.out.println("R");
    }
}