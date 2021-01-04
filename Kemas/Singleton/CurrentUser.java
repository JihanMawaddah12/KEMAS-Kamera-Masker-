package Singleton;

public class CurrentUser {
    // *******variables area****** //
    private static User activeUser = null;

    // *****constructors area***** //
    // untuk mencegah pembuatan object
    private CurrentUser() {
    }

    // ********methods area******* //
    public static User user() {
        return activeUser;
    }

    public static void login(String username, String password) {
        activeUser = new User(username, password);
    }

    public static void logout() {
        activeUser = null;
    }

    public static boolean isLoggedIn() {
        if (activeUser == null) {
            return false;
        } else {
            return true;
        }
    }
}