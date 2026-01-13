package o0OO0o;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.ANNOTATION_TYPE})
@o0OO0oO0.o00oOoO(o0OO0oO0.o00oOOo0.BINARY)
@o0OO0oO0.o00oo00O(allowedTargets = {o0OO0oO0.o00oOOoO.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@o0OO00o0(version = "1.3")
/* loaded from: classes.dex */
public @interface o0OO000o {

    /* loaded from: classes.dex */
    public enum o00oOOo0 {
        WARNING,
        ERROR
    }

    o00oOOo0 level() default o00oOOo0.ERROR;

    String message() default "";
}
