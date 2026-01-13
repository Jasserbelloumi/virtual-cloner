package o0O0OO;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface o0O0000O {
    Class<?> entity() default Object.class;

    @o0OoOoOo
    int onConflict() default 3;
}
