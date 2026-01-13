package o0OO0o;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes.dex */
public final class o0O00O0<T> implements o0oO0Ooo<T>, Serializable {
    private final T value;

    public o0O00O0(T t) {
        this.value = t;
    }

    @Override // o0OO0o.o0oO0Ooo
    public T getValue() {
        return this.value;
    }

    @Override // o0OO0o.o0oO0Ooo
    public boolean isInitialized() {
        return true;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
