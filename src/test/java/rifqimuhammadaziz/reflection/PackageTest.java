package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Person;

import java.util.Arrays;

public class PackageTest {

    @Test
    void testGetPackage() {
        Class<Person> personClass = Person.class;
        Package aPackage = personClass.getPackage(); // get package of person

        System.out.println(aPackage.getName());
        System.out.println(Arrays.toString(aPackage.getAnnotations()));
    }
}
