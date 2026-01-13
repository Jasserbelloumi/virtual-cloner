package o0OOoOO;

import com.google.common.base.Ascii;
import kotlin.Metadata;
import o0O0OOOo.o00oo0O0;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0004HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lo0OOoOO/o0O00000;", "", "", "o00oOOo0", "", o00oOOoO.f12961o00oOo00, "", "o00oOo00", "userID", "userName", "isInstalledGms", "o00oOooO", "toString", "hashCode", "other", "equals", "I", "o00oOo0o", "()I", "Ljava/lang/String;", "o00oOoO0", "()Ljava/lang/String;", "Z", "o00oOoO", "()Z", "o00oOoOO", "(Z)V", "<init>", "(ILjava/lang/String;Z)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0O00000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f14896o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f14897o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f14898o00oOo00;

    public o0O00000(int i, @NotNull String str, boolean z) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{-8, -11, -79, 114, -66, Ascii.EM, -77, -126}, new byte[]{-115, -122, -44, 0, -16, 120, -34, -25}));
        this.f14896o00oOOo0 = i;
        this.f14897o00oOOoO = str;
        this.f14898o00oOo00 = z;
    }

    public static /* synthetic */ o0O00000 o00oOo0O(o0O00000 o0o00000, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = o0o00000.f14896o00oOOo0;
        }
        if ((i2 & 2) != 0) {
            str = o0o00000.f14897o00oOOoO;
        }
        if ((i2 & 4) != 0) {
            z = o0o00000.f14898o00oOo00;
        }
        return o0o00000.o00oOooO(i, str, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O00000) {
            o0O00000 o0o00000 = (o0O00000) obj;
            return this.f14896o00oOOo0 == o0o00000.f14896o00oOOo0 && o0ooO.o00oOoO0(this.f14897o00oOOoO, o0o00000.f14897o00oOOoO) && this.f14898o00oOo00 == o0o00000.f14898o00oOo00;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int o00oOOo02 = o00oo0O0.o00oOOo0(this.f14897o00oOOoO, Integer.hashCode(this.f14896o00oOOo0) * 31, 31);
        boolean z = this.f14898o00oOo00;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return o00oOOo02 + i;
    }

    public final int o00oOOo0() {
        return this.f14896o00oOOo0;
    }

    @NotNull
    public final String o00oOOoO() {
        return this.f14897o00oOOoO;
    }

    public final boolean o00oOo00() {
        return this.f14898o00oOo00;
    }

    public final int o00oOo0o() {
        return this.f14896o00oOOo0;
    }

    public final boolean o00oOoO() {
        return this.f14898o00oOo00;
    }

    @NotNull
    public final String o00oOoO0() {
        return this.f14897o00oOOoO;
    }

    public final void o00oOoOO(boolean z) {
        this.f14898o00oOo00 = z;
    }

    @NotNull
    public final o0O00000 o00oOooO(int i, @NotNull String str, boolean z) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{98, -40, 17, -88, 67, 89, 67, -3}, new byte[]{Ascii.ETB, -85, 116, -38, Ascii.CR, 56, 46, -104}));
        return new o0O00000(i, str, z);
    }

    @NotNull
    public String toString() {
        return o00oo.o00oOOo0(new byte[]{-30, 96, -73, Ascii.DLE, 120, -104, 68, 3, -48, 126, -95, 32, 84, -67, Ascii.ETB}, new byte[]{-91, Ascii.CR, -60, 82, Ascii.GS, -7, 42, 43}) + this.f14896o00oOOo0 + o00oo.o00oOOo0(new byte[]{-18, -104, 118, -13, 8, -34, Ascii.ESC, Ascii.EM, -81, -35, 62}, new byte[]{-62, -72, 3, Byte.MIN_VALUE, 109, -84, 85, 120}) + this.f14897o00oOOoO + o00oo.o00oOOo0(new byte[]{90, -54, -13, Ascii.NAK, -1, -10, -59, 124, Ascii.ETB, -122, -10, 3, -46, -33, -37, 123, 75}, new byte[]{118, -22, -102, 102, -74, -104, -74, 8}) + this.f14898o00oOo00 + ')';
    }
}
