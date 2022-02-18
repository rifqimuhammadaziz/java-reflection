package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ConstructorTest {

    @Test
    void testGetConstructor() {
        Class<Person> personClass = Person.class;
        Constructor<?>[] constructors = personClass.getDeclaredConstructors(); // get all constructor of person

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName()); // get constructor name
            System.out.println(Arrays.toString(constructor.getParameterTypes())); // get all parameter of constructor

            System.out.println("==========");
        }
    }

    @Test
    void testCreateObjectUsingConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Constructor<Person> constructor = personClass.getConstructor(); // get constructor of person (without parameter)
        Constructor<Person> constructorParameters = personClass.getConstructor(String.class, String.class); // get constructor of person (with String parameter)

        Person person1 = constructor.newInstance(); // without parameter
        Person person2 = constructorParameters.newInstance("Xenosty", "Theord");

        System.out.println(person1);
        System.out.println(person2);
    }
}
