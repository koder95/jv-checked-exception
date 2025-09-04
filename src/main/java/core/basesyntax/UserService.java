package core.basesyntax;

public class UserService {
    private final PasswordValidator validator = new PasswordValidator();

    public void registerUser(User user) {
        //write your code here
        if (user == null) {
            System.out.println("User cannot be null");
            return;
        }
        try {
            validator.validate(user.getPassword(), user.getRepeatPassword());
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }

    public void saveUser(User user) {
        System.out.println("User " + user.toString() + " was saved to database!!!");
    }
}
