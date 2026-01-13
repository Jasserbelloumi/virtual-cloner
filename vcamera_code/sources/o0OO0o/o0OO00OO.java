package o0OO0o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes.dex */
public final class o0OO00OO<T> implements o0oO0Ooo<T>, Serializable {
    @NotNull
    public static final o00oOOo0 Companion = new o00oOOo0(null);
    private static final AtomicReferenceFieldUpdater<o0OO00OO<?>, Object> valueUpdater = AtomicReferenceFieldUpdater.newUpdater(o0OO00OO.class, Object.class, "_value");
    @Nullable
    private volatile Object _value;
    @NotNull

    /* renamed from: final  reason: not valid java name */
    private final Object f0final;
    @Nullable
    private volatile o0OOOO.o00oOOo0<? extends T> initializer;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }
    }

    public o0OO00OO(@NotNull o0OOOO.o00oOOo0<? extends T> o00oooo02) {
        o0OOOOO0.o0ooO.o00oo0O0(o00oooo02, "initializer");
        this.initializer = o00oooo02;
        oO00000o oo00000o = oO00000o.f13228o00oOOo0;
        this._value = oo00000o;
        this.f0final = oo00000o;
    }

    private final Object writeReplace() {
        return new o0O00O0(getValue());
    }

    @Override // o0OO0o.o0oO0Ooo
    public T getValue() {
        T t = (T) this._value;
        oO00000o oo00000o = oO00000o.f13228o00oOOo0;
        if (t != oo00000o) {
            return t;
        }
        o0OOOO.o00oOOo0<? extends T> o00oooo02 = this.initializer;
        if (o00oooo02 != null) {
            T invoke = o00oooo02.invoke();
            if (androidx.concurrent.futures.o00oOo00.o00oOOo0(valueUpdater, this, oo00000o, invoke)) {
                this.initializer = null;
                return invoke;
            }
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
