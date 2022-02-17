package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MethodTest {

    @Test
    void testGetMethod() {
        Class<Person> personClass = Person.class;

        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName()); // method name
            System.out.println(method.getReturnType()); // type data return
            System.out.println(Arrays.toString(method.getParameterTypes())); // parameter on method
            System.out.println(Arrays.toString(method.getExceptionTypes())); // exception on method
            System.out.println("==============");
        }
    }

    @Test
    void testGetMethodValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Person> personClass = Person.class;
        Method getFirstName = personClass.getDeclaredMethod("getFirstName");

        Person person = new Person("Xenosty", "Theord");

        // execute method
        String firstName = (String) getFirstName.invoke(person);
        System.out.println(firstName);
    }
}
