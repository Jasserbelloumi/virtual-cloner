package o0OOoO0o;

import android.content.SharedPreferences;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import kotlin.Metadata;
import multispace.multiapp.clone.app.App;
import o0OO000o.o00oOOoO;
import o0OO0o.o0O00oO0;
import o0OO0o.o0O0oo0o;
import o0OO0o.o0oO0Ooo;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\bR!\u0010\t\u001a\u00020\u00028FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lo0OOoO0o/o0OO00o;", "", "Landroid/content/SharedPreferences;", o00oOOoO.f12961o00oOo00, "Lo0OO0o/o0oO0Ooo;", "o00oOOo0", "()Landroid/content/SharedPreferences;", "getMRemarkSharedPreferences$annotations", "()V", "mRemarkSharedPreferences", "<init>", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0OO00o {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OO00o f14874o00oOOo0 = new o0OO00o();
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final o0oO0Ooo f14875o00oOOoO = o0O00oO0.o00oOo00(o00oOOo0.INSTANCE);

    @o0O0oo0o(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0O0OO implements o0OOOO.o00oOOo0<SharedPreferences> {
        public static final o00oOOo0 INSTANCE = new o00oOOo0();

        public o00oOOo0() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // o0OOOO.o00oOOo0
        public final SharedPreferences invoke() {
            return App.f6679o00oo0Oo.o00oOOo0().getSharedPreferences(o00oo.o00oOOo0(new byte[]{-113, -22, 2, Ascii.NAK, 62, 51, -38, -85, -88, -14}, new byte[]{-38, -103, 103, 103, 108, 86, -73, -54}), 0);
        }
    }

    @NotNull
    public static final SharedPreferences o00oOOo0() {
        Object value = f14875o00oOOoO.getValue();
        o0ooO.o00oo0OO(value, o00oo.o00oOOo0(new byte[]{-42, -31, 114, 40, -7, -15, 119, -78, -121, -25, 101, 55, -121, -12, 68, -91, -113, -30, 71, 46, -79, -6, SignedBytes.MAX_POWER_OF_TWO, -91, -113, -24, 116, 57, -89, -94, Ascii.CR, -7, -60, -88, 62}, new byte[]{-22, -122, Ascii.ETB, 92, -44, -100, 37, -41}));
        return (SharedPreferences) value;
    }

    @o00ooO0
    public static /* synthetic */ void o00oOOoO() {
    }
}
