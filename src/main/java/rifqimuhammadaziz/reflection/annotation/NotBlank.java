package rifqimuhammadaziz.reflection.annotation;

import java.lang.annotation.*;

@Documented // to add documentation on javadoc
@Target({
        ElementType.FIELD // this annotation only for field
})
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {

    boolean allowEmptyString() default false;

}
