package o0O0OO;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface o0O00O0 {
    o0O000O associateBy() default @o0O000O(Object.class);

    Class<?> entity() default Object.class;

    String entityColumn();

    String parentColumn();

    String[] projection() default {};
}
