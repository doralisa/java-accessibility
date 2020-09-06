package ar.com.ada.online.second.javaaccessibility.access.modifiers;

public class User {
    protected String nickName;
    protected String password;

    protected void showAttributeValues() {
        System.out.println("Nickname = " + this.nickName);
        System.out.println("password = " + this.password);
    }
}
