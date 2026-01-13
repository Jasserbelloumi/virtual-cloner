package o0OOoOO;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import o00ooOoo.oOo000Oo;
import o0OO000o.o00oOOoO;
import o0OOOOO0.o0ooO;
import o0OOoO0.o00oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u0006HÖ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lo0OOoOO/o0O0000O;", "", "", "o00oOOo0", "", o00oOOoO.f12961o00oOo00, "", "o00oOo00", "userID", FirebaseAnalytics.Param.SUCCESS, oOo000Oo.f9215o0O00o00, "o00oOooO", "toString", "hashCode", "other", "equals", "I", "o00oOoO", "()I", "Z", "o00oOoO0", "()Z", "Ljava/lang/String;", "o00oOo0o", "()Ljava/lang/String;", "<init>", "(IZLjava/lang/String;)V", "app_vcamRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class o0O0000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f14899o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f14900o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final String f14901o00oOo00;

    public o0O0000O(int i, boolean z, @NotNull String str) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{Ascii.SI, -103, 92}, new byte[]{98, -22, 59, -56, Ascii.ESC, -42, 120, 72}));
        this.f14899o00oOOo0 = i;
        this.f14900o00oOOoO = z;
        this.f14901o00oOo00 = str;
    }

    public static /* synthetic */ o0O0000O o00oOo0O(o0O0000O o0o0000o, int i, boolean z, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = o0o0000o.f14899o00oOOo0;
        }
        if ((i2 & 2) != 0) {
            z = o0o0000o.f14900o00oOOoO;
        }
        if ((i2 & 4) != 0) {
            str = o0o0000o.f14901o00oOo00;
        }
        return o0o0000o.o00oOooO(i, z, str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0000O) {
            o0O0000O o0o0000o = (o0O0000O) obj;
            return this.f14899o00oOOo0 == o0o0000o.f14899o00oOOo0 && this.f14900o00oOOoO == o0o0000o.f14900o00oOOoO && o0ooO.o00oOoO0(this.f14901o00oOo00, o0o0000o.f14901o00oOo00);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Integer.hashCode(this.f14899o00oOOo0) * 31;
        boolean z = this.f14900o00oOOoO;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.f14901o00oOo00.hashCode() + ((hashCode + i) * 31);
    }

    public final int o00oOOo0() {
        return this.f14899o00oOOo0;
    }

    public final boolean o00oOOoO() {
        return this.f14900o00oOOoO;
    }

    @NotNull
    public final String o00oOo00() {
        return this.f14901o00oOo00;
    }

    @NotNull
    public final String o00oOo0o() {
        return this.f14901o00oOo00;
    }

    public final int o00oOoO() {
        return this.f14899o00oOOo0;
    }

    public final boolean o00oOoO0() {
        return this.f14900o00oOOoO;
    }

    @NotNull
    public final o0O0000O o00oOooO(int i, boolean z, @NotNull String str) {
        o0ooO.o00oo0O0(str, o00oo.o00oOOo0(new byte[]{105, -8, 59}, new byte[]{4, -117, 92, -116, -78, -51, 95, 119}));
        return new o0O0000O(i, z, str);
    }

    @NotNull
    public String toString() {
        return o00oo.o00oOOo0(new byte[]{71, -124, -36, -15, Ascii.GS, -74, 17, 94, 108, -123, -19, -35, Ascii.DC2, -85, 77, 74, 115, -116, -35, -15, 55, -8}, new byte[]{0, -23, -81, -72, 115, -59, 101, 63}) + this.f14899o00oOOo0 + o00oo.o00oOOo0(new byte[]{Ascii.ETB, 73, SignedBytes.MAX_POWER_OF_TWO, Ascii.SO, 0, 41, -106, Byte.MAX_VALUE, 72, 84}, new byte[]{59, 105, 51, 123, 99, 74, -13, Ascii.FF}) + this.f14900o00oOOoO + o00oo.o00oOOo0(new byte[]{-125, -12, -55, 17, -89, 123}, new byte[]{-81, -44, -92, 98, -64, 70, -80, -80}) + this.f14901o00oOo00 + ')';
    }
}
