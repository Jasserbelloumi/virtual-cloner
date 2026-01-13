package o0OOOoo0;

import android.support.v4.media.o00oOo0O;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class oO00Oo0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final String f13883o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O0O0Oo f13884o00oOOoO;

    public oO00Oo0(@NotNull String str, @NotNull o0O0O0Oo o0o0o0oo) {
        o0ooO.o00oo0O0(str, "value");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        this.f13883o00oOOo0 = str;
        this.f13884o00oOOoO = o0o0o0oo;
    }

    public static /* synthetic */ oO00Oo0 o00oOooO(oO00Oo0 oo00oo0, String str, o0O0O0Oo o0o0o0oo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oo00oo0.f13883o00oOOo0;
        }
        if ((i & 2) != 0) {
            o0o0o0oo = oo00oo0.f13884o00oOOoO;
        }
        return oo00oo0.o00oOo00(str, o0o0o0oo);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oO00Oo0) {
            oO00Oo0 oo00oo0 = (oO00Oo0) obj;
            return o0ooO.o00oOoO0(this.f13883o00oOOo0, oo00oo0.f13883o00oOOo0) && o0ooO.o00oOoO0(this.f13884o00oOOoO, oo00oo0.f13884o00oOOoO);
        }
        return false;
    }

    public int hashCode() {
        return this.f13884o00oOOoO.hashCode() + (this.f13883o00oOOo0.hashCode() * 31);
    }

    @NotNull
    public final String o00oOOo0() {
        return this.f13883o00oOOo0;
    }

    @NotNull
    public final o0O0O0Oo o00oOOoO() {
        return this.f13884o00oOOoO;
    }

    @NotNull
    public final oO00Oo0 o00oOo00(@NotNull String str, @NotNull o0O0O0Oo o0o0o0oo) {
        o0ooO.o00oo0O0(str, "value");
        o0ooO.o00oo0O0(o0o0o0oo, SessionDescription.ATTR_RANGE);
        return new oO00Oo0(str, o0o0o0oo);
    }

    @NotNull
    public final o0O0O0Oo o00oOo0O() {
        return this.f13884o00oOOoO;
    }

    @NotNull
    public final String o00oOo0o() {
        return this.f13883o00oOOo0;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("MatchGroup(value=");
        o00oOOo02.append(this.f13883o00oOOo0);
        o00oOOo02.append(", range=");
        o00oOOo02.append(this.f13884o00oOOoO);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
