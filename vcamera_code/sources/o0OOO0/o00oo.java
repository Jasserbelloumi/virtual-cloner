package o0OOO0;

import o0OO0o.oO0Ooooo;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o00oo implements o0OO.o00oOo0O<oO0Ooooo> {
    @Nullable

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public oo0oO0<oO0Ooooo> f13434o00oo0O0;

    @Override // o0OO.o00oOo0O
    @NotNull
    public o0OO.o00oo0 getContext() {
        return o0OO.o00oo0O0.INSTANCE;
    }

    public final void o00oOOoO() {
        synchronized (this) {
            while (true) {
                oo0oO0<oO0Ooooo> oo0oo0 = this.f13434o00oo0O0;
                if (oo0oo0 == null) {
                    o0ooO.o00oo0(this, "null cannot be cast to non-null type java.lang.Object");
                    wait();
                } else {
                    oo0ooO.o00oo0(oo0oo0.m16unboximpl());
                }
            }
        }
    }

    @Nullable
    public final oo0oO0<oO0Ooooo> o00oOo00() {
        return this.f13434o00oo0O0;
    }

    public final void o00oOooO(@Nullable oo0oO0<oO0Ooooo> oo0oo0) {
        this.f13434o00oo0O0 = oo0oo0;
    }

    @Override // o0OO.o00oOo0O
    public void resumeWith(@NotNull Object obj) {
        synchronized (this) {
            this.f13434o00oo0O0 = oo0oO0.m6boximpl(obj);
            o0ooO.o00oo0(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        }
    }
}
