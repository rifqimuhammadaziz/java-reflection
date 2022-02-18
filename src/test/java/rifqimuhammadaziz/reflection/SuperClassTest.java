package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Person;

public class SuperClassTest {

    @Test
    void testGetSuperClass() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass);

        // parent class of person is Object, because person has no super class (Object is root)
        Class<? super Person> objectClass = personClass.getSuperclass();
        System.out.println(objectClass);

        // object class has no super class, because Object is root
        Class<? super Person> nullClass = objectClass.getSuperclass();
        System.out.println(nullClass);
    }
}
