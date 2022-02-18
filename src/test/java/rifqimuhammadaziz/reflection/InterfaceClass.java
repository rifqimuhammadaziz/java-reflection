package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Nameable;
import rifqimuhammadaziz.reflection.data.Person;

import java.util.Arrays;

public class InterfaceClass {

    @Test
    void testClass() {
        Class<Nameable> nameableClass = Nameable.class;
        System.out.println(nameableClass.getName());
        System.out.println(nameableClass.isInterface()); // check interface or not
        System.out.println(nameableClass.getSuperclass()); // null, interface is contract, has no super class
        System.out.println(Arrays.toString(nameableClass.getInterfaces()));
        System.out.println(Arrays.toString(nameableClass.getDeclaredFields()));
        System.out.println(Arrays.toString(nameableClass.getDeclaredMethods())); // get all method
        System.out.println(Arrays.toString(nameableClass.getConstructors()));
    }

    @Test
    void testSuperInterfaces() {
        Class<Person> personClass = Person.class;
        System.out.println(Arrays.toString(personClass.getInterfaces())); // get interface of Person
    }
}
