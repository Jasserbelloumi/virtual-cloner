package o0OO0oO0;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@o00oo00O(allowedTargets = {o00oOOoO.ANNOTATION_CLASS})
/* loaded from: classes.dex */
public @interface o00oOoO {
    o00oOOo0 value() default o00oOOo0.RUNTIME;
}
