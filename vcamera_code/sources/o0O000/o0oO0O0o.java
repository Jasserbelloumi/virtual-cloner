package o0O000;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0O000.o0O00OOO;
import o0OO0o.o0OO000;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "sectionName", "Lkotlin/Function0;", "block", "o00oOOo0", "(Ljava/lang/String;Lo0OOOO/o00oOOo0;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class o0oO0O0o {
    @o0OO0o.o0O0o(message = "Use androidx.tracing.Trace instead", replaceWith = @o0OO000(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    public static final <T> T o00oOOo0(@NotNull String str, @NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0ooO.o00oo0O0(str, "sectionName");
        o0ooO.o00oo0O0(o00oooo02, "block");
        o0O00OOO.o00oOOoO(str);
        try {
            return o00oooo02.invoke();
        } finally {
            o0O00OOO.o00oOOo0.o00oOOoO();
        }
    }
}
