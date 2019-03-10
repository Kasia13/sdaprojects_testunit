package pl.sda.user;

import pl.sda.email.EmailSender;

import java.util.Objects;

public class UserService {

    private UserDatabase database;
    private EmailSender emailSender;
    private UserValidation validation;

    public UserService(UserDatabase database,
                       EmailSender emailSender,
                       UserValidation validation) {
        this.database = Objects.requireNonNull(database, "UserDatabase should be defined");
        this.emailSender = Objects.requireNonNull(emailSender, "EmailSender should be defined");
        this.validation = Objects.requireNonNull(validation, "UserValidation should be defined");
    }

    public User register(User user) {
        if (validation.validUser(user)
                && !database.containsLogin(user.getEmail())) {
            database.add(user);
        }

        // Jeśli był problem z wysłaniem maila to dane o użytkowniku nie zostaną zwrócone.
        // Implementacja na potrzeby nauki testów.
        boolean emailSent = emailSender.sendWelcomeTo(user);
        if (emailSent) {
            return user;
        } else {
            return null;
        }
    }

    public boolean login(String email, String password) {
        if (validation.validEmail(email)
                && validation.validPassword(password)) {
            return database.login(email, password);
        }

        return false;
    }
}
