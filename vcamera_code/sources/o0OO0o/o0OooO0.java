package o0OO0o;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.CONSTRUCTOR, ElementType.LOCAL_VARIABLE})
@o0OO0oO0.o00oOoO(o0OO0oO0.o00oOOo0.SOURCE)
@o0OO0oO0.o00oo00O(allowedTargets = {o0OO0oO0.o00oOOoO.CLASS, o0OO0oO0.o00oOOoO.PROPERTY, o0OO0oO0.o00oOOoO.LOCAL_VARIABLE, o0OO0oO0.o00oOOoO.VALUE_PARAMETER, o0OO0oO0.o00oOOoO.CONSTRUCTOR, o0OO0oO0.o00oOOoO.FUNCTION, o0OO0oO0.o00oOOoO.PROPERTY_GETTER, o0OO0oO0.o00oOOoO.PROPERTY_SETTER, o0OO0oO0.o00oOOoO.EXPRESSION, o0OO0oO0.o00oOOoO.FILE, o0OO0oO0.o00oOOoO.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@o0OO00o0(version = "1.3")
/* loaded from: classes.dex */
public @interface o0OooO0 {
    Class<? extends Annotation>[] markerClass();
}
