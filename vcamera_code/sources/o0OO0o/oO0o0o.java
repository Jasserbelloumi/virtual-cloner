package o0OO0o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class oO0o0o<T> implements o0oO0Ooo<T>, Serializable {
    @Nullable
    private Object _value;
    @Nullable
    private o0OOOO.o00oOOo0<? extends T> initializer;

    public oO0o0o(@NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "initializer");
        this.initializer = o00oooo02;
        this._value = oO00000o.f13228o00oOOo0;
    }

    private final Object writeReplace() {
        return new o0O00O0(getValue());
    }

    @Override // o0OO0o.o0oO0Ooo
    public T getValue() {
        if (this._value == oO00000o.f13228o00oOOo0) {
            o0OOOO.o00oOOo0<? extends T> o00oooo02 = this.initializer;
            o0OOOOO0.o0ooO.o00oo00O(o00oooo02);
            this._value = o00oooo02.invoke();
            this.initializer = null;
        }
        return (T) this._value;
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
