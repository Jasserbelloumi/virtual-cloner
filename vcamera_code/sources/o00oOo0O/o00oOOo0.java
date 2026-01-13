package o00oOo0O;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import o0OO0o.o0O0o;
import o0OO0o.o0OO000;
import o0OO0oO0.o00oOoO;
import o0OO0oO0.o00oo00O;
@Target({ElementType.ANNOTATION_TYPE})
@o00oOoO(o0OO0oO0.o00oOOo0.BINARY)
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\n\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lo00oOo0O/o00oOOo0;", "", "Lo00oOo0O/o00oOOo0$o00oOOo0;", FirebaseAnalytics.Param.LEVEL, "()Lo00oOo0O/o00oOOo0$o00oOOo0;", "o00oOOo0", "annotation-experimental_release"}, k = 1, mv = {1, 7, 1})
@o0O0o(message = "This annotation has been replaced by `@RequiresOptIn`", replaceWith = @o0OO000(expression = "RequiresOptIn", imports = {"androidx.annotation.RequiresOptIn"}))
@o00oo00O(allowedTargets = {o0OO0oO0.o00oOOoO.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface o00oOOo0 {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lo00oOo0O/o00oOOo0$o00oOOo0;", "", "<init>", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "annotation-experimental_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: o00oOo0O.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum EnumC0099o00oOOo0 {
        WARNING,
        ERROR
    }

    EnumC0099o00oOOo0 level() default EnumC0099o00oOOo0.ERROR;
}
