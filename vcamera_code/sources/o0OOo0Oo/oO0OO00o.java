package o0OOo0Oo;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO.o00oo0O0;
import o0OO0o.o0O0oo0o;
import o0OOo00O.oO0o0o;
import o0OOo0O0.o0O000;
import o0OOo0OO.o0OO00o;
import org.jetbrains.annotations.NotNull;
@oO0o0o
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J,\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¨\u0006\n"}, d2 = {"Lo0OOo0Oo/oO0OO00o;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO00o;", "Lo0OO/o00oo0;", "context", "", "capacity", "Lo0OOo0O0/o0O000;", "onBufferOverflow", "o00oOooO", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface oO0OO00o<T> extends o0OO00o<T> {

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public static /* synthetic */ o0OO00o o00oOOo0(oO0OO00o oo0oo00o, o00oo0 o00oo0Var, int i, o0O000 o0o000, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    o00oo0Var = o00oo0O0.INSTANCE;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    o0o000 = o0O000.SUSPEND;
                }
                return oo0oo00o.o00oOooO(o00oo0Var, i, o0o000);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    @NotNull
    o0OO00o<T> o00oOooO(@NotNull o00oo0 o00oo0Var, int i, @NotNull o0O000 o0o000);
}
