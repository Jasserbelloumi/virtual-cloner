package o0O0OO;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import o00oOooO.o0OOooO0;
import o0O0OO.o00ooO;
@Target({ElementType.TYPE})
@o0OOooO0(16)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface o00ooO0 {
    Class<?> contentEntity() default Object.class;

    String languageId() default "";

    o00ooO.o00oOOo0 matchInfo() default o00ooO.o00oOOo0.FTS4;

    String[] notIndexed() default {};

    o00ooO.o00oOOoO order() default o00ooO.o00oOOoO.ASC;

    int[] prefix() default {};

    String tokenizer() default "simple";

    String[] tokenizerArgs() default {};
}
