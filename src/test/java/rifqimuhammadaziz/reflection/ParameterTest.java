package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterTest {

    @Test
    void testGetParameters() {
        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods(); // get all method

        for (Method method : methods) {
            System.out.println(method.getName()); // method name
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("Parameter Name : " + parameter.getName());
                System.out.println("Parameter Type : " + parameter.getType());
            }
            System.out.println("==========");
        }
    }

    @Test
    void testInvokeMethodWithParameters() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

        // execute
        Person person = new Person("Xenosty", "Theord");
        setFirstName.invoke(person, "Rifqi"); // void / no return value

        System.out.println(person.getFirstName());
    }
}
