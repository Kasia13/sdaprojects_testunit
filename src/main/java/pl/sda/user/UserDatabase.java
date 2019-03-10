package pl.sda.user;

import java.util.HashSet;
import java.util.Set;

public class UserDatabase {

    private Set<User> users = new HashSet<>();

    //Symulacja autogeneracji rosnących identyfikatorów dla nowych użytkowników.
    private static int id = 0;

    public User add(User user) {
        user.setId(++id);
        users.add(user);

        return user;
    }

    public boolean containsLogin(String login) {
        for (User user : users) {
            if (user.getEmail().equals(login)) {
                return true;
            }
        }
        return false;
    }

    public User getByLogin(String login) {
        for (User user : users) {
            if (user.getEmail().equals(login)) {
                return user;
            }
        }
        return null;
    }

    public boolean login(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email)
                    && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
