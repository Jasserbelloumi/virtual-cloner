package o0OOo0OO;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO000o.o00oOOoO;
import o0OOOO0o.o00oOoO;
import o0OOo0Oo.oO00OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J)\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00062\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lo0OOo0OO/oO0Ooooo;", "Lo0OOo0Oo/oO00OO;", "Lo0OOo0OO/oO000O0;", "flow", "", "o00oOo00", "", "Lo0OO/o00oOo0O;", "Lo0OO0o/oO0Ooooo;", "o00oOooO", "(Lo0OOo0OO/oO000O0;)[Lo0OO/o00oOo0O;", "", "o00oOOo0", "J", FirebaseAnalytics.Param.INDEX, o00oOOoO.f12961o00oOo00, "Lo0OO/o00oOo0O;", "cont", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oO0Ooooo extends oO00OO<oO000O0<?>> {
    @o00oOoO

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public long f14492o00oOOo0 = -1;
    @o00oOoO
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOo0O<? super o0OO0o.oO0Ooooo> f14493o00oOOoO;

    @Override // o0OOo0Oo.oO00OO
    /* renamed from: o00oOo00 */
    public boolean o00oOOo0(@NotNull oO000O0<?> oo000o0) {
        if (this.f14492o00oOOo0 >= 0) {
            return false;
        }
        this.f14492o00oOOo0 = oo000o0.o0O000o();
        return true;
    }

    @Override // o0OOo0Oo.oO00OO
    @NotNull
    /* renamed from: o00oOooO */
    public o00oOo0O<o0OO0o.oO0Ooooo>[] o00oOOoO(@NotNull oO000O0<?> oo000o0) {
        long j = this.f14492o00oOOo0;
        this.f14492o00oOOo0 = -1L;
        this.f14493o00oOOoO = null;
        return oo000o0.o0O000o0(j);
    }
}
