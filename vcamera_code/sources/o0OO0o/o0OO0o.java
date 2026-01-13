package o0OO0o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0OO0o<T> implements o0oO0Ooo<T>, Serializable {
    @Nullable
    private volatile Object _value;
    @Nullable
    private o0OOOO.o00oOOo0<? extends T> initializer;
    @NotNull
    private final Object lock;

    public o0OO0o(@NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02, @Nullable Object obj) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "initializer");
        this.initializer = o00oooo02;
        this._value = oO00000o.f13228o00oOOo0;
        this.lock = obj == null ? this : obj;
    }

    public /* synthetic */ o0OO0o(o0OOOO.o00oOOo0 o00oooo02, Object obj, int i, o0OOOOO0.o0O00 o0o00) {
        this(o00oooo02, (i & 2) != 0 ? null : obj);
    }

    private final Object writeReplace() {
        return new o0O00O0(getValue());
    }

    @Override // o0OO0o.o0oO0Ooo
    public T getValue() {
        T t;
        T t2 = (T) this._value;
        oO00000o oo00000o = oO00000o.f13228o00oOOo0;
        if (t2 != oo00000o) {
            return t2;
        }
        synchronized (this.lock) {
            t = (T) this._value;
            if (t == oo00000o) {
                o0OOOO.o00oOOo0<? extends T> o00oooo02 = this.initializer;
                o0OOOOO0.o0ooO.o00oo00O(o00oooo02);
                t = o00oooo02.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    @Override // o0OO0o.o0oO0Ooo
    public boolean isInitialized() {
        return this._value != oO00000o.f13228o00oOOo0;
    }

    @NotNull
    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
