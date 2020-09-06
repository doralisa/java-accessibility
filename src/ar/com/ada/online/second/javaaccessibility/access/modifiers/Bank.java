package ar.com.ada.online.second.javaaccessibility.access.modifiers;

public class Bank {
    private Integer numberAccount;
    private String amount;

    private void showAttributeValues () {
        System.out.println("Number account = " + this.numberAccount);
        System.out.println("amount = " + this.amount);
    }
}
