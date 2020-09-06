package ar.com.ada.online.second.javaaccessibility;

import ar.com.ada.online.second.javaaccessibility.access.modifiers.Bank;
import ar.com.ada.online.second.javaaccessibility.access.modifiers.Person;
import ar.com.ada.online.second.javaaccessibility.access.modifiers.User;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person();
        p1.name = "Doralys";
        p1.lastName = "Contreras";
        p1.age = 31;

        p1.showAttributeValues();

        User u1 = new User(); //no se puede acceder a sus atributos porque son de tipo protected y estan en otro paquete
        //no se puede acceder a la clase Dog porque es de tipo default y esta en otro paquete
        Bank b1 = new Bank; //nadie más que la clase Bank puede acceder a sus atributos porque son de tipo private
    }
}
