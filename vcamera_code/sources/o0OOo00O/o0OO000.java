package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016JE\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ^\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\u00022'\u0010\u0006\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\u0002\b\r2\u0006\u0010\u000e\u001a\u00028\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lo0OOo00O/o0OO000;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function1;", "Lo0OO/o00oOo0O;", "", "block", "completion", "Lo0OO0o/oO0Ooooo;", "invoke", "(Lo0OOOO/o00oo;Lo0OO/o00oOo0O;)V", "R", "Lkotlin/Function2;", "Lo0OO0o/o0O000Oo;", "receiver", "(Lo0OOOO/o0O00000;Ljava/lang/Object;Lo0OO/o00oOo0O;)V", "", "isLazy", "()Z", "isLazy$annotations", "()V", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public enum o0OO000 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f14021o00oOOo0;

        static {
            int[] iArr = new int[o0OO000.values().length];
            iArr[o0OO000.DEFAULT.ordinal()] = 1;
            iArr[o0OO000.ATOMIC.ordinal()] = 2;
            iArr[o0OO000.UNDISPATCHED.ordinal()] = 3;
            iArr[o0OO000.LAZY.ordinal()] = 4;
            f14021o00oOOo0 = iArr;
        }
    }

    @oO0o0o
    public static /* synthetic */ void isLazy$annotations() {
    }

    @oO0o0o
    public final <T> void invoke(@NotNull o0OOOO.o00oo<? super o00oOo0O<? super T>, ? extends Object> o00ooVar, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        int i = o00oOOo0.f14021o00oOOo0[ordinal()];
        if (i == 1) {
            o0OOo0o.o0O000.o00oOooO(o00ooVar, o00ooo0o2);
        } else if (i == 2) {
            o0OO.o00oo00O.o00oOoO(o00ooVar, o00ooo0o2);
        } else if (i == 3) {
            o0OOo0o.o0O000O.o00oOOo0(o00ooVar, o00ooo0o2);
        } else if (i != 4) {
            throw new o0OO0o.o0O0O0Oo();
        }
    }

    @oO0o0o
    public final <R, T> void invoke(@NotNull o0OOOO.o0O00000<? super R, ? super o00oOo0O<? super T>, ? extends Object> o0o00000, R r, @NotNull o00oOo0O<? super T> o00ooo0o2) {
        int i = o00oOOo0.f14021o00oOOo0[ordinal()];
        if (i == 1) {
            o0OOo0o.o0O000.o00oOo0o(o0o00000, r, o00ooo0o2, null, 4, null);
        } else if (i == 2) {
            o0OO.o00oo00O.o00oOoOO(o0o00000, r, o00ooo0o2);
        } else if (i == 3) {
            o0OOo0o.o0O000O.o00oOOoO(o0o00000, r, o00ooo0o2);
        } else if (i != 4) {
            throw new o0OO0o.o0O0O0Oo();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }
}
