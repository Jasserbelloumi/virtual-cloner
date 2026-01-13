package o0OOOOO0;

import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public abstract class o0OO000o<T> {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final int f13605o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f13606o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final T[] f13607o00oOo00;

    public o0OO000o(int i) {
        this.f13605o00oOOo0 = i;
        this.f13607o00oOo00 = (T[]) new Object[i];
    }

    public static /* synthetic */ void o00oOooO() {
    }

    public final void o00oOOo0(@NotNull T t) {
        o0ooO.o00oo0O0(t, "spreadArgument");
        T[] tArr = this.f13607o00oOo00;
        int i = this.f13606o00oOOoO;
        this.f13606o00oOOoO = i + 1;
        tArr[i] = t;
    }

    public final int o00oOOoO() {
        return this.f13606o00oOOoO;
    }

    public abstract int o00oOo00(@NotNull T t);

    public final void o00oOo0O(int i) {
        this.f13606o00oOOoO = i;
    }

    public final int o00oOo0o() {
        int i = 0;
        o0OO0oO.o0O0o0 it = new o0OOOo0o.o0O0O0Oo(0, this.f13605o00oOOo0 - 1).iterator();
        while (it.hasNext()) {
            T t = this.f13607o00oOo00[it.nextInt()];
            i += t != null ? o00oOo00(t) : 1;
        }
        return i;
    }

    @NotNull
    public final T o00oOoO0(@NotNull T t, @NotNull T t2) {
        o0ooO.o00oo0O0(t, androidx.lifecycle.o0O.f3319o00oOoO0);
        o0ooO.o00oo0O0(t2, "result");
        o0OO0oO.o0O0o0 it = new o0OOOo0o.o0O0O0Oo(0, this.f13605o00oOOo0 - 1).iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            int nextInt = it.nextInt();
            T t3 = this.f13607o00oOo00[nextInt];
            if (t3 != null) {
                if (i < nextInt) {
                    int i3 = nextInt - i;
                    System.arraycopy(t, i, t2, i2, i3);
                    i2 += i3;
                }
                int o00oOo002 = o00oOo00(t3);
                System.arraycopy(t3, 0, t2, i2, o00oOo002);
                i2 += o00oOo002;
                i = nextInt + 1;
            }
        }
        int i4 = this.f13605o00oOOo0;
        if (i < i4) {
            System.arraycopy(t, i, t2, i2, i4 - i);
        }
        return t2;
    }
}
