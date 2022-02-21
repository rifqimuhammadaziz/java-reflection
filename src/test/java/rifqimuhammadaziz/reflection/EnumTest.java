package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Gender;

import java.util.Arrays;

public class EnumTest {

    @Test
    void testEnum() {
        Class<Gender> genderClass = Gender.class;

        System.out.println(genderClass.getName()); // enum name
        System.out.println(genderClass.getSuperclass()); // enum
        System.out.println(Arrays.toString(genderClass.getEnumConstants())); // get all constant
        System.out.println(genderClass.isEnum()); // true
        System.out.println(genderClass.getDeclaredFields());
        System.out.println(Arrays.toString(genderClass.getDeclaredConstructors())); // private (cannot be instantiated)
        System.out.println(Arrays.toString(genderClass.getDeclaredMethods())); // get all method
    }
}
