package o0OO0o;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.ANNOTATION_TYPE})
@o0OO0oO0.o00oOo00
@o0OO0oO0.o00oo00O(allowedTargets = {o0OO0oO0.o00oOOoO.CLASS, o0OO0oO0.o00oOOoO.FUNCTION, o0OO0oO0.o00oOOoO.PROPERTY, o0OO0oO0.o00oOOoO.ANNOTATION_CLASS, o0OO0oO0.o00oOOoO.CONSTRUCTOR, o0OO0oO0.o00oOOoO.PROPERTY_SETTER, o0OO0oO0.o00oOOoO.PROPERTY_GETTER, o0OO0oO0.o00oOOoO.TYPEALIAS})
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes.dex */
public @interface o0O0o {
    o00ooO0 level() default o00ooO0.WARNING;

    String message();

    o0OO000 replaceWith() default @o0OO000(expression = "", imports = {});
}
