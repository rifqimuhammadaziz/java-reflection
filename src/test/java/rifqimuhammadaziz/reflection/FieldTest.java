package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Person;

import java.lang.reflect.Field;
import java.util.Objects;

public class FieldTest {

    @Test
    void testGetField() {
        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " : " + field.getType());
        }
    }

    @Test
    void testGetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true); // set private field to be accessible

        Person person1 = new Person("Xenosty", "Theord");

        // get string object
        Object result1 = firstName.get(person1);
        System.out.println(result1);

        // or
        Person person2 = new Person("Rifqi", "Muhammad");
        String result2 = (String) firstName.get(person2);
        System.out.println(result2);
    }

    @Test
    void testSetFieldValue() throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true); // set private field to be accessible

        Person person1 = new Person("Xenosty", "Theord");
        firstName.set(person1, "Aziz"); // person1.setFirstName("Aziz")
        System.out.println(person1.getFirstName());

        // or
        Person person2 = new Person("Rifqi", "Muhammad");
        firstName.set(person2, "Bagas");
        System.out.println(person2.getFirstName());

    }
}
