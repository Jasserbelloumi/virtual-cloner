package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.o00oo;
import kotlin.Metadata;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u000b\u000fB\u001f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001eR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010!R\u0014\u0010%\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010$¨\u0006("}, d2 = {"Landroidx/window/layout/o00ooO0;", "Landroidx/window/layout/o00oo;", "", "toString", "", "other", "", "equals", "", "hashCode", "Lo0O0OoO/o00oo0;", "o00oOOo0", "Lo0O0OoO/o00oo0;", "featureBounds", "Landroidx/window/layout/o00ooO0$o00oOOoO;", o0OO000o.o00oOOoO.f12961o00oOo00, "Landroidx/window/layout/o00ooO0$o00oOOoO;", "o00oOooO", "()Landroidx/window/layout/o00ooO0$o00oOOoO;", "type", "Landroidx/window/layout/o00oo$o00oOo00;", "o00oOo00", "Landroidx/window/layout/o00oo$o00oOo00;", "getState", "()Landroidx/window/layout/o00oo$o00oOo00;", "state", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "()Z", "isSeparating", "Landroidx/window/layout/o00oo$o00oOOo0;", "()Landroidx/window/layout/o00oo$o00oOOo0;", "occlusionType", "Landroidx/window/layout/o00oo$o00oOOoO;", "()Landroidx/window/layout/o00oo$o00oOOoO;", "orientation", "<init>", "(Lo0O0OoO/o00oo0;Landroidx/window/layout/o00ooO0$o00oOOoO;Landroidx/window/layout/o00oo$o00oOo00;)V", "window_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o00ooO0 implements o00oo {
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final o00oOOo0 f5505o00oOooO = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0OoO.o00oo0 f5506o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o00oOOoO f5507o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oo.o00oOo00 f5508o00oOo00;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/layout/o00ooO0$o00oOOo0;", "", "Lo0O0OoO/o00oo0;", "bounds", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0O0OoO/o00oo0;)V", "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        public final void o00oOOo0(@NotNull o0O0OoO.o00oo0 o00oo0Var) {
            o0ooO.o00oo0O0(o00oo0Var, "bounds");
            int i = o00oo0Var.f11960o00oOo00;
            int i2 = o00oo0Var.f11958o00oOOo0;
            boolean z = false;
            if (!((i - i2 == 0 && o00oo0Var.f11961o00oOooO - o00oo0Var.f11959o00oOOoO == 0) ? false : true)) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (i2 == 0 || o00oo0Var.f11959o00oOOoO == 0) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/window/layout/o00ooO0$o00oOOoO;", "", "", "toString", "o00oOOo0", "Ljava/lang/String;", "description", "<init>", "(Ljava/lang/String;)V", o0OO000o.o00oOOoO.f12961o00oOo00, "window_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class o00oOOoO {
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final o00oOOo0 f5509o00oOOoO = new o00oOOo0(null);
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final o00oOOoO f5510o00oOo00 = new o00oOOoO("FOLD");
        @NotNull

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final o00oOOoO f5511o00oOooO = new o00oOOoO("HINGE");
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final String f5512o00oOOo0;

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/o00ooO0$o00oOOoO$o00oOOo0;", "", "Landroidx/window/layout/o00ooO0$o00oOOoO;", "FOLD", "Landroidx/window/layout/o00ooO0$o00oOOoO;", "o00oOOo0", "()Landroidx/window/layout/o00ooO0$o00oOOoO;", "HINGE", o0OO000o.o00oOOoO.f12961o00oOo00, "<init>", "()V", "window_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class o00oOOo0 {
            public o00oOOo0() {
            }

            public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
            }

            @NotNull
            public final o00oOOoO o00oOOo0() {
                return o00oOOoO.f5510o00oOo00;
            }

            @NotNull
            public final o00oOOoO o00oOOoO() {
                return o00oOOoO.f5511o00oOooO;
            }
        }

        public o00oOOoO(String str) {
            this.f5512o00oOOo0 = str;
        }

        @NotNull
        public String toString() {
            return this.f5512o00oOOo0;
        }
    }

    public o00ooO0(@NotNull o0O0OoO.o00oo0 o00oo0Var, @NotNull o00oOOoO o00ooooo2, @NotNull o00oo.o00oOo00 o00ooo002) {
        o0ooO.o00oo0O0(o00oo0Var, "featureBounds");
        o0ooO.o00oo0O0(o00ooooo2, "type");
        o0ooO.o00oo0O0(o00ooo002, "state");
        this.f5506o00oOOo0 = o00oo0Var;
        this.f5507o00oOOoO = o00ooooo2;
        this.f5508o00oOo00 = o00ooo002;
        f5505o00oOooO.o00oOOo0(o00oo0Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (o0ooO.o00oOoO0(o00ooO0.class, obj == null ? null : obj.getClass())) {
            if (obj != null) {
                o00ooO0 o00ooo02 = (o00ooO0) obj;
                return o0ooO.o00oOoO0(this.f5506o00oOOo0, o00ooo02.f5506o00oOOo0) && o0ooO.o00oOoO0(this.f5507o00oOOoO, o00ooo02.f5507o00oOOoO) && o0ooO.o00oOoO0(this.f5508o00oOo00, o00ooo02.f5508o00oOo00);
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        return false;
    }

    @Override // androidx.window.layout.o00oo0
    @NotNull
    public Rect getBounds() {
        return this.f5506o00oOOo0.o00oOoOO();
    }

    @Override // androidx.window.layout.o00oo
    @NotNull
    public o00oo.o00oOo00 getState() {
        return this.f5508o00oOo00;
    }

    public int hashCode() {
        int hashCode = this.f5507o00oOOoO.hashCode();
        return this.f5508o00oOo00.hashCode() + ((hashCode + (this.f5506o00oOOo0.hashCode() * 31)) * 31);
    }

    @Override // androidx.window.layout.o00oo
    public boolean o00oOOo0() {
        o00oOOoO o00ooooo2 = this.f5507o00oOOoO;
        o00oOOoO.o00oOOo0 o00oooo02 = o00oOOoO.f5509o00oOOoO;
        o00oooo02.getClass();
        if (o0ooO.o00oOoO0(o00ooooo2, o00oOOoO.f5511o00oOooO)) {
            return true;
        }
        o00oOOoO o00ooooo3 = this.f5507o00oOOoO;
        o00oooo02.getClass();
        return o0ooO.o00oOoO0(o00ooooo3, o00oOOoO.f5510o00oOo00) && o0ooO.o00oOoO0(this.f5508o00oOo00, o00oo.o00oOo00.f5491o00oOooO);
    }

    @Override // androidx.window.layout.o00oo
    @NotNull
    public o00oo.o00oOOoO o00oOOoO() {
        o0O0OoO.o00oo0 o00oo0Var = this.f5506o00oOOo0;
        return o00oo0Var.f11960o00oOo00 - o00oo0Var.f11958o00oOOo0 > o00oo0Var.f11961o00oOooO - o00oo0Var.f11959o00oOOoO ? o00oo.o00oOOoO.f5487o00oOooO : o00oo.o00oOOoO.f5486o00oOo00;
    }

    @Override // androidx.window.layout.o00oo
    @NotNull
    public o00oo.o00oOOo0 o00oOo00() {
        o0O0OoO.o00oo0 o00oo0Var = this.f5506o00oOOo0;
        return (o00oo0Var.f11960o00oOo00 - o00oo0Var.f11958o00oOOo0 == 0 || o00oo0Var.f11961o00oOooO - o00oo0Var.f11959o00oOOoO == 0) ? o00oo.o00oOOo0.f5482o00oOo00 : o00oo.o00oOOo0.f5483o00oOooO;
    }

    @NotNull
    public final o00oOOoO o00oOooO() {
        return this.f5507o00oOOoO;
    }

    @NotNull
    public String toString() {
        return ((Object) o00ooO0.class.getSimpleName()) + " { " + this.f5506o00oOOo0 + ", type=" + this.f5507o00oOOoO + ", state=" + this.f5508o00oOo00 + " }";
    }
}
