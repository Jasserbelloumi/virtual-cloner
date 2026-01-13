package o0OOo0OO;

import android.support.v4.media.o00oOOo0;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO.o00oo0O0;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import o0OOo0O0.o0O000;
import o0OOo0Oo.oO00Oo0;
import o0OOo0Oo.oO0OO00o;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\n\u001a\u00020\t\u001a\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO00o;", "", "capacity", "Lo0OOo0O0/o0O000;", "onBufferOverflow", o00oOOoO.f12961o00oOo00, "o00oOOo0", "o00oOoO0", "Lo0OO/o00oo0;", "context", "o00oOoO", "o00oOo0O", "Lo0OO0o/oO0Ooooo;", "o00oOo0o", "(Lo0OO/o00oo0;)V", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class o0OO0oO {
    @NotNull
    public static final <T> o0OO00o<T> o00oOOoO(@NotNull o0OO00o<? extends T> o0oo00o, int i, @NotNull o0O000 o0o000) {
        int i2;
        o0O000 o0o0002;
        boolean z = true;
        if (i >= 0 || i == -2 || i == -1) {
            if (i == -1 && o0o000 != o0O000.SUSPEND) {
                z = false;
            }
            if (z) {
                if (i == -1) {
                    o0o0002 = o0O000.DROP_OLDEST;
                    i2 = 0;
                } else {
                    i2 = i;
                    o0o0002 = o0o000;
                }
                return o0oo00o instanceof oO0OO00o ? oO0OO00o.o00oOOo0.o00oOOo0((oO0OO00o) o0oo00o, null, i2, o0o0002, 1, null) : new oO00Oo0(o0oo00o, null, i2, o0o0002, 2, null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        throw new IllegalArgumentException(o00oOOo0.o00oOOo0("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ", i).toString());
    }

    public static /* synthetic */ o0OO00o o00oOo00(o0OO00o o0oo00o, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        return o00oOooO(o0oo00o, i, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> o0OO00o<T> o00oOo0O(@NotNull o0OO00o<? extends T> o0oo00o) {
        return o0oo00o instanceof o0OO000o ? o0oo00o : new oo0oO0(o0oo00o);
    }

    public static final void o00oOo0o(o00oo0 o00oo0Var) {
        if (o00oo0Var.get(o0OOo00O.ooOOOOoo.f14136o00oOoO) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + o00oo0Var).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> o0OO00o<T> o00oOoO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o00oo0 o00oo0Var) {
        o00oOo0o(o00oo0Var);
        return o0ooO.o00oOoO0(o00oo0Var, o00oo0O0.INSTANCE) ? o0oo00o : o0oo00o instanceof oO0OO00o ? oO0OO00o.o00oOOo0.o00oOOo0((oO0OO00o) o0oo00o, o00oo0Var, 0, null, 6, null) : new oO00Oo0(o0oo00o, o00oo0Var, 0, null, 12, null);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOoO0(@NotNull o0OO00o<? extends T> o0oo00o) {
        return o00oOooO(o0oo00o, -1, null, 2, null);
    }

    public static o0OO00o o00oOooO(o0OO00o o0oo00o, int i, o0O000 o0o000, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -2;
        }
        if ((i2 & 2) != 0) {
            o0o000 = o0O000.SUSPEND;
        }
        return o00oOOoO(o0oo00o, i, o0o000);
    }
}
