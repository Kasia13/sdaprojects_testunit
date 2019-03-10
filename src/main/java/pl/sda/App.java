package pl.sda;


import pl.sda.email.EmailSender;
import pl.sda.user.User;
import pl.sda.user.UserDatabase;
import pl.sda.user.UserService;
import pl.sda.user.UserValidation;

public class App {
    public static void main(String[] args) {
        UserDatabase database = new UserDatabase();
        UserValidation validation = new UserValidation();

        EmailSender emailSender = new EmailSender();

        UserService userService = new UserService(database, emailSender, validation);
        User jnowak = new User("jnowak@gmail.com", "password123");
        User jkowalski = new User("jkowalski@gmail.com", "password321");

        User savedJnowak = userService.register(jnowak);
        User savedJkowalski = userService.register(jkowalski);

        System.out.println("Saved users: ");
        System.out.println("jnowak: " + savedJnowak);
        System.out.println("jkowalski: " + savedJkowalski);

        System.out.println();
        System.out.println("Login users");
        System.out.println("jnowak login: " + userService.login("jnowak@gmail.com", "password123"));
        System.out.println("jkowalski login: " + userService.login("jkowalski@gmail.com", "password321"));
    }
}
