package o0O0OO;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface o0O00000 {
    String name() default "";

    boolean unique() default false;

    String[] value();
}
