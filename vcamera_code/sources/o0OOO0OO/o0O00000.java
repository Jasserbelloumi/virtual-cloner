package o0OOO0OO;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o0OO0o.o0OO00o0;
import o0OOOOO0.o0OO0o;
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
@o0OO0oO0.o00oOoO(o0OO0oO0.o00oOOo0.SOURCE)
@o0OO0oO0.o00oo00O(allowedTargets = {o0OO0oO0.o00oOOoO.CLASS, o0OO0oO0.o00oOOoO.FUNCTION, o0OO0oO0.o00oOOoO.PROPERTY, o0OO0oO0.o00oOOoO.CONSTRUCTOR, o0OO0oO0.o00oOOoO.TYPEALIAS})
@Retention(RetentionPolicy.SOURCE)
@o0OO00o0(version = "1.2")
@o0OO0oO0.o00oOo0O
@Repeatable(o00oOOo0.class)
/* loaded from: classes3.dex */
public @interface o0O00000 {

    @Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
    @o0OO0oO0.o00oOoO(o0OO0oO0.o00oOOo0.SOURCE)
    @o0OO0oO0.o00oo00O(allowedTargets = {o0OO0oO0.o00oOOoO.CLASS, o0OO0oO0.o00oOOoO.FUNCTION, o0OO0oO0.o00oOOoO.PROPERTY, o0OO0oO0.o00oOOoO.CONSTRUCTOR, o0OO0oO0.o00oOOoO.TYPEALIAS})
    @o0OO0o
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface o00oOOo0 {
        o0O00000[] value();
    }

    int errorCode() default -1;

    o0OO0o.o00ooO0 level() default o0OO0o.o00ooO0.ERROR;

    String message() default "";

    String version();

    o0O0000O versionKind() default o0O0000O.LANGUAGE_VERSION;
}
