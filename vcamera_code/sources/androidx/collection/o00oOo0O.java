package androidx.collection;

import androidx.lifecycle.o0O;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0086\b\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0003\"\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/collection/o00oOo00;", "o00oOOo0", "", o0O.f3319o00oOoO0, o0OO000o.o00oOOoO.f12961o00oOo00, "([Ljava/lang/Object;)Landroidx/collection/o00oOo00;", "collection-ktx"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class o00oOo0O {
    @NotNull
    public static final <T> o00oOo00<T> o00oOOo0() {
        return new o00oOo00<>();
    }

    @NotNull
    public static final <T> o00oOo00<T> o00oOOoO(@NotNull T... tArr) {
        o0ooO.o00oo0O(tArr, o0O.f3319o00oOoO0);
        o00oOo00<T> o00ooo002 = new o00oOo00<>(tArr.length);
        for (T t : tArr) {
            o00ooo002.add(t);
        }
        return o00ooo002;
    }
}
