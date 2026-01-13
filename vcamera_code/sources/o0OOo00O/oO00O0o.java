package o0OOo00O;

import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lo0OOo00O/oO00O0o;", "Lo0OOo00O/o0ooO;", "Lo0OOo00O/o0OOO0OO;", "Lo0OOo00O/oO000O0O;", "Lo0OO0o/oO0Ooooo;", o00oOOoO.f12961o00oOo00, "", "toString", "Lo0OOo00O/oOo00OO0;", "o00oo0o0", "Lo0OOo00O/oOo00OO0;", "o0O00O0", "()Lo0OOo00O/oOo00OO0;", "o0OoO00O", "(Lo0OOo00O/oOo00OO0;)V", "job", "", "isActive", "()Z", "Lo0OOo00O/oO00OOO;", "o00oOoo0", "()Lo0OOo00O/oO00OOO;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class oO00O0o extends o0ooO implements o0OOO0OO, oO000O0O {

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public oOo00OO0 f14073o00oo0o0;

    @Override // o0OOo00O.oO000O0O
    public boolean isActive() {
        return true;
    }

    @Override // o0OOo00O.o0OOO0OO
    public void o00oOOoO() {
        o0O00O0().o0O0o00O(this);
    }

    @Override // o0OOo00O.oO000O0O
    @Nullable
    public oO00OOO o00oOoo0() {
        return null;
    }

    @NotNull
    public final oOo00OO0 o0O00O0() {
        oOo00OO0 ooo00oo0 = this.f14073o00oo0o0;
        if (ooo00oo0 != null) {
            return ooo00oo0;
        }
        o0OOOOO0.o0ooO.o00ooooO("job");
        return null;
    }

    public final void o0OoO00O(@NotNull oOo00OO0 ooo00oo0) {
        this.f14073o00oo0o0 = ooo00oo0;
    }

    @Override // o0OOo0o0.o0OOO0OO
    @NotNull
    public String toString() {
        return oo0ooO.o00oOOo0(this) + '@' + oo0ooO.o00oOOoO(this) + "[job@" + oo0ooO.o00oOOoO(o0O00O0()) + ']';
    }
}
