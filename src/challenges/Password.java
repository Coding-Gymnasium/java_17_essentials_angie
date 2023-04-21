package challenges;

public class Password {
    private String password;

    public Password(String password) {
        setPassword(password);
    }

    public String setPassword(String password) {
        this.password = password;
        System.out.println("Your new password is: " + password);
        return password;
    }

}
