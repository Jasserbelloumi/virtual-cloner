package o00oOooO;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import o0OO0oO0.o00oOOo0;
import o0OO0oO0.o00oOOoO;
import o0OO0oO0.o00oOo00;
import o0OO0oO0.o00oOoO;
import o0OO0oO0.o00oo00O;
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.ANNOTATION_TYPE})
@o00oOoO(o00oOOo0.BINARY)
@o00oo00O(allowedTargets = {o00oOOoO.VALUE_PARAMETER, o00oOOoO.LOCAL_VARIABLE, o00oOOoO.FUNCTION, o00oOOoO.PROPERTY_GETTER, o00oOOoO.PROPERTY_SETTER, o00oOOoO.FIELD, o00oOOoO.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\u0002\u0018\u00002\u00020\u0001B(\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0011\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lo00oOooO/o0OOO00;", "", "", "value", "()J", "min", "max", "multiple", "annotation"}, k = 1, mv = {1, 7, 1})
@o00oOo00
@Documented
/* loaded from: classes.dex */
public @interface o0OOO00 {
    long max() default Long.MAX_VALUE;

    long min() default Long.MIN_VALUE;

    long multiple() default 1;

    long value() default -1;
}
