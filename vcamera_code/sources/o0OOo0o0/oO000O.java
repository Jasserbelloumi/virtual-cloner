package o0OOo0o0;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OOOO.o00oOOo0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007*\u0010\b\u0007\u0010\t\"\u00020\u00012\u00020\u0001B\u0002\b\b¨\u0006\n"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "lock", "Lkotlin/Function0;", "block", o00oOOoO.f12961o00oOo00, "(Ljava/lang/Object;Lo0OOOO/o00oOOo0;)Ljava/lang/Object;", "Lo0OOo00O/oO0o0o;", "SynchronizedObject", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO000O {
    @o0OOo00O.oO0o0o
    public static /* synthetic */ void o00oOOo0() {
    }

    @o0OOo00O.oO0o0o
    public static final <T> T o00oOOoO(@NotNull Object obj, @NotNull o00oOOo0<? extends T> o00oooo02) {
        T invoke;
        synchronized (obj) {
            invoke = o00oooo02.invoke();
        }
        return invoke;
    }
}
