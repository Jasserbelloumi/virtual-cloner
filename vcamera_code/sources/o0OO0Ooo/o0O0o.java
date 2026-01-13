package o0OO0Ooo;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes2.dex */
public final class o0O0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f13178o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f13179o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f13180o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f13181o00oOooO;

    public o0O0o() {
        this(0, 0, 0, 0, 15, null);
    }

    public o0O0o(int i, int i2, int i3, int i4) {
        this.f13178o00oOOo0 = i;
        this.f13179o00oOOoO = i2;
        this.f13180o00oOo00 = i3;
        this.f13181o00oOooO = i4;
    }

    public /* synthetic */ o0O0o(int i, int i2, int i3, int i4, int i5, o0OOOOO0.o0O00 o0o00) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public static o0O0o o00oOo0o(o0O0o o0o0o, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = o0o0o.f13178o00oOOo0;
        }
        if ((i5 & 2) != 0) {
            i2 = o0o0o.f13179o00oOOoO;
        }
        if ((i5 & 4) != 0) {
            i3 = o0o0o.f13180o00oOo00;
        }
        if ((i5 & 8) != 0) {
            i4 = o0o0o.f13181o00oOooO;
        }
        o0o0o.getClass();
        return new o0O0o(i, i2, i3, i4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0o) {
            o0O0o o0o0o = (o0O0o) obj;
            return this.f13178o00oOOo0 == o0o0o.f13178o00oOOo0 && this.f13179o00oOOoO == o0o0o.f13179o00oOOoO && this.f13180o00oOo00 == o0o0o.f13180o00oOo00 && this.f13181o00oOooO == o0o0o.f13181o00oOooO;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f13179o00oOOoO);
        int hashCode2 = Integer.hashCode(this.f13180o00oOo00);
        return Integer.hashCode(this.f13181o00oOooO) + ((hashCode2 + ((hashCode + (Integer.hashCode(this.f13178o00oOOo0) * 31)) * 31)) * 31);
    }

    public final int o00oOOo0() {
        return this.f13178o00oOOo0;
    }

    public final int o00oOOoO() {
        return this.f13179o00oOOoO;
    }

    public final int o00oOo00() {
        return this.f13180o00oOo00;
    }

    @NotNull
    public final o0O0o o00oOo0O(int i, int i2, int i3, int i4) {
        return new o0O0o(i, i2, i3, i4);
    }

    public final int o00oOoO() {
        return this.f13180o00oOo00;
    }

    public final int o00oOoO0() {
        return this.f13181o00oOooO;
    }

    public final int o00oOoOO() {
        return this.f13179o00oOOoO;
    }

    public final int o00oOoOo() {
        return this.f13178o00oOOo0;
    }

    public final void o00oOoo0(int i) {
        this.f13181o00oOooO = i;
    }

    public final int o00oOooO() {
        return this.f13181o00oOooO;
    }

    public final void o00oOooo(int i) {
        this.f13180o00oOo00 = i;
    }

    public final void o00oo0(int i) {
        this.f13178o00oOOo0 = i;
    }

    public final void o00oo00O(int i) {
        this.f13179o00oOOoO = i;
    }

    @NotNull
    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("PowerSpinnerPaddings(top=");
        o00oOOo02.append(this.f13178o00oOOo0);
        o00oOOo02.append(", start=");
        o00oOOo02.append(this.f13179o00oOOoO);
        o00oOOo02.append(", end=");
        o00oOOo02.append(this.f13180o00oOo00);
        o00oOOo02.append(", bottom=");
        o00oOOo02.append(this.f13181o00oOooO);
        o00oOOo02.append(')');
        return o00oOOo02.toString();
    }
}
