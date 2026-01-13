package o0O0OO;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface o0O0OO0 {
    Class<?> entity() default Object.class;

    @o0OoOoOo
    int onConflict() default 3;
}
