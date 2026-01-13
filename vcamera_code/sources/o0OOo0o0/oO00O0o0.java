package o0OOo0o0;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import o0OO.o00oo0;
import o0OO000o.o00oOOoO;
import o0OOOO0o.o00oOoO;
import o0OOOOO0.o0ooO;
import o0OOo00O.oO0O000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lo0OOo0o0/oO00O0o0;", "", "Lo0OOo00O/oO0O000;", "element", "value", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "Lo0OO/o00oo0;", "context", o00oOOoO.f12961o00oOo00, "Lo0OO/o00oo0;", "", "[Ljava/lang/Object;", androidx.lifecycle.o0O.f3319o00oOoO0, "o00oOo00", "[Lo0OOo00O/oO0O000;", "elements", "", "o00oOooO", "I", "i", GoogleApiAvailabilityLight.TRACKING_SOURCE_NOTIFICATION, "<init>", "(Lo0OO/o00oo0;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO00O0o0 {
    @o00oOoO
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o00oo0 f14651o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Object[] f14652o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final oO0O000<Object>[] f14653o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f14654o00oOooO;

    public oO00O0o0(@NotNull o00oo0 o00oo0Var, int i) {
        this.f14651o00oOOo0 = o00oo0Var;
        this.f14652o00oOOoO = new Object[i];
        this.f14653o00oOo00 = new oO0O000[i];
    }

    public final void o00oOOo0(@NotNull oO0O000<?> oo0o000, @Nullable Object obj) {
        Object[] objArr = this.f14652o00oOOoO;
        int i = this.f14654o00oOooO;
        objArr[i] = obj;
        oO0O000<Object>[] oo0o000Arr = this.f14653o00oOo00;
        this.f14654o00oOooO = i + 1;
        oo0o000Arr[i] = oo0o000;
    }

    public final void o00oOOoO(@NotNull o00oo0 o00oo0Var) {
        int length = this.f14653o00oOo00.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            oO0O000<Object> oo0o000 = this.f14653o00oOo00[length];
            o0ooO.o00oo00O(oo0o000);
            oo0o000.o0O0o00o(o00oo0Var, this.f14652o00oOOoO[length]);
            if (i < 0) {
                return;
            }
            length = i;
        }
    }
}
