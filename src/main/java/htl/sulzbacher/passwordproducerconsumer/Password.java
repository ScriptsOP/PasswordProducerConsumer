package htl.sulzbacher.passwordproducerconsumer;

public class Password {
    private String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean check(String password) {
        return this.password.equals(password);
    }
}