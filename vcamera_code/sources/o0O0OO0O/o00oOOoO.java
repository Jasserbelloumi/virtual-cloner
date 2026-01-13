package o0O0OO0O;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o00oOooO.oo0oO0;
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes.dex */
public @interface o00oOOoO {

    @Target({})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOOo0 {
        int mask() default 0;

        @oo0oO0
        String name();

        int value();
    }

    @oo0oO0
    o00oOOo0[] intMapping() default {};

    @oo0oO0
    String value();
}
