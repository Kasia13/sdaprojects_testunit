package pl.sda.user;

public class UserValidation {

    public boolean validUser(User user) {
        return validEmail(user.getEmail())
                && validPassword(user.getPassword());
    }

    public boolean validEmail(String email) {
        return email.length() >= 3;
    }

    public boolean validPassword(String password) {
        return password.length() >= 8;
    }
}
