package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Person;
import rifqimuhammadaziz.reflection.validation.Validator;

public class AnnotationTest {

    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {
        Person person1 = new Person("Xenosty", " ");
        Validator.validateNotBlank(person1);
    }
}
