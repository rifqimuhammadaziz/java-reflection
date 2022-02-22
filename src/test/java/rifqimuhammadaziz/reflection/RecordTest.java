package rifqimuhammadaziz.reflection;

import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.reflection.data.Product;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.RecordComponent;
import java.util.Arrays;

public class RecordTest {

    @Test
    void testClassRecord() {
        Class<Product> productClass = Product.class;

        System.out.println(productClass.isRecord());
        System.out.println(Arrays.toString(productClass.getDeclaredFields())); // final field
        System.out.println(Arrays.toString(productClass.getDeclaredMethods()));
        System.out.println(Arrays.toString(productClass.getDeclaredConstructors()));
        System.out.println(Arrays.toString(productClass.getRecordComponents())); // constructor parameter
    }

    @Test
    void testGetRecordValue() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<Product> productClass = Product.class;
        Method id = productClass.getDeclaredMethod("id");

        Product product = new Product("1", "iPhone Xr", 5000000L);
        System.out.println(id.invoke(product));
    }

    @Test
    void testGetRecordValueByComponent() throws InvocationTargetException, IllegalAccessException {
        Class<Product> productClass = Product.class;
        RecordComponent[] recordComponents = productClass.getRecordComponents();

        Product product = new Product("1", "iPhone 11 Pro Max", 13000000L);

        for (RecordComponent component : recordComponents) {
            Method accessor = component.getAccessor();
            System.out.println(accessor.getName());
            System.out.println(accessor.invoke(product));
        }
    }
}
