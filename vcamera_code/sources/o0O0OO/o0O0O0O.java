package o0O0OO;

import java.util.concurrent.atomic.AtomicBoolean;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o0O0O0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final AtomicBoolean f11384o00oOOo0 = new AtomicBoolean(false);

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O00O0o f11385o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public volatile o0O0OOoO.o0O0000O f11386o00oOo00;

    public o0O0O0O(o0O00O0o o0o00o0o) {
        this.f11385o00oOOoO = o0o00o0o;
    }

    public o0O0OOoO.o0O0000O o00oOOo0() {
        o00oOOoO();
        return o00oOo0O(this.f11384o00oOOo0.compareAndSet(false, true));
    }

    public void o00oOOoO() {
        this.f11385o00oOOoO.o00oOOo0();
    }

    public final o0O0OOoO.o0O0000O o00oOo00() {
        return this.f11385o00oOOoO.o00oOo0o(o00oOooO());
    }

    public final o0O0OOoO.o0O0000O o00oOo0O(boolean z) {
        if (z) {
            if (this.f11386o00oOo00 == null) {
                this.f11386o00oOo00 = o00oOo00();
            }
            return this.f11386o00oOo00;
        }
        return o00oOo00();
    }

    public void o00oOo0o(o0O0OOoO.o0O0000O o0o0000o) {
        if (o0o0000o == this.f11386o00oOo00) {
            this.f11384o00oOOo0.set(false);
        }
    }

    public abstract String o00oOooO();
}
