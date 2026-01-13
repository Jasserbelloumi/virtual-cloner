package o0OOo0OO;

import android.support.v4.media.o00oOOo0;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OOOO0o.o00oOoO;
import o0OOo0O0.o0O000;
import o0OOo0Oo.oO00Oo0;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u001a%\u0010\f\u001a\u0004\u0018\u00010\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0010\u001a\u00020\u000f*\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a6\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u001a\u0010\u001c\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "replay", "extraBufferCapacity", "Lo0OOo0O0/o0O000;", "onBufferOverflow", "Lo0OOo0OO/oO00000;", "o00oOOo0", "", "", "", FirebaseAnalytics.Param.INDEX, "o00oOo0o", "([Ljava/lang/Object;J)Ljava/lang/Object;", "item", "Lo0OO0o/oO0Ooooo;", "o00oOoO", "([Ljava/lang/Object;JLjava/lang/Object;)V", "Lo0OOo0OO/oO000;", "Lo0OO/o00oo0;", "context", "capacity", "Lo0OOo0OO/o0OO00o;", "o00oOo0O", "Lo0OOo0o0/oO0o0o;", "Lo0OOo0o0/oO0o0o;", "getNO_VALUE$annotations", "()V", "NO_VALUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO000O0O {
    @o00oOoO
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OOo0o0.oO0o0o f14473o00oOOo0 = new o0OOo0o0.oO0o0o("NO_VALUE");

    @NotNull
    public static final <T> oO00000<T> o00oOOo0(int i, int i2, @NotNull o0O000 o0o000) {
        boolean z = true;
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && o0o000 != o0O000.SUSPEND) {
                    z = false;
                }
                if (z) {
                    int i3 = i2 + i;
                    if (i3 < 0) {
                        i3 = Integer.MAX_VALUE;
                    }
                    return new oO000O0(i, i3, o0o000);
                }
                throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + o0o000).toString());
            }
            throw new IllegalArgumentException(o00oOOo0.o00oOOo0("extraBufferCapacity cannot be negative, but was ", i2).toString());
        }
        throw new IllegalArgumentException(o00oOOo0.o00oOOo0("replay cannot be negative, but was ", i).toString());
    }

    public static /* synthetic */ oO00000 o00oOOoO(int i, int i2, o0O000 o0o000, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            o0o000 = o0O000.SUSPEND;
        }
        return o00oOOo0(i, i2, o0o000);
    }

    public static final /* synthetic */ Object o00oOo00(Object[] objArr, long j) {
        return o00oOo0o(objArr, j);
    }

    @NotNull
    public static final <T> o0OO00o<T> o00oOo0O(@NotNull oO000<? extends T> oo000, @NotNull o00oo0 o00oo0Var, int i, @NotNull o0O000 o0o000) {
        return ((i == 0 || i == -3) && o0o000 == o0O000.SUSPEND) ? oo000 : new oO00Oo0(oo000, o00oo0Var, i, o0o000);
    }

    public static final Object o00oOo0o(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void o00oOoO(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static /* synthetic */ void o00oOoO0() {
    }

    public static final /* synthetic */ void o00oOooO(Object[] objArr, long j, Object obj) {
        o00oOoO(objArr, j, obj);
    }
}
