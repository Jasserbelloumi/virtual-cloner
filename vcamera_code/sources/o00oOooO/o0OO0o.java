package o00oOooO;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import o0OO0oO0.o00oOOoO;
import o0OO0oO0.o00oOoO;
import o0OO0oO0.o00oo00O;
@Target({ElementType.ANNOTATION_TYPE})
@o00oOoO(o0OO0oO0.o00oOOo0.BINARY)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lo00oOooO/o0OO0o;", "", "Lo00oOooO/o0OO0o$o00oOOo0;", FirebaseAnalytics.Param.LEVEL, "()Lo00oOooO/o0OO0o$o00oOOo0;", "o00oOOo0", "annotation-experimental_release"}, k = 1, mv = {1, 7, 1})
@o00oo00O(allowedTargets = {o00oOOoO.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface o0OO0o {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lo00oOooO/o0OO0o$o00oOOo0;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public enum o00oOOo0 {
        WARNING,
        ERROR
    }

    o00oOOo0 level() default o00oOOo0.ERROR;
}
