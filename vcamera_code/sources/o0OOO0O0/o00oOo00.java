package o0OOO0O0;

import java.io.Serializable;
import java.lang.Enum;
import o0OO0o.o0O000;
import o0OO0o.o0OO00o0;
import o0OO0oO.o0O000O;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0O000
@o0OO00o0(version = "1.8")
/* loaded from: classes3.dex */
public final class o00oOo00<T extends Enum<T>> extends o0OO0oO.o00oOo00<T> implements o00oOOo0<T>, Serializable {
    @Nullable
    private volatile T[] _entries;
    @NotNull
    private final o0OOOO.o00oOOo0<T[]> entriesProvider;

    public o00oOo00(@NotNull o0OOOO.o00oOOo0<T[]> o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "entriesProvider");
        this.entriesProvider = o00oooo02;
    }

    private final T[] getEntries() {
        T[] tArr = this._entries;
        if (tArr != null) {
            return tArr;
        }
        T[] invoke = this.entriesProvider.invoke();
        this._entries = invoke;
        return invoke;
    }

    private final Object writeReplace() {
        return new o00oOo0O(getEntries());
    }

    public boolean contains(@NotNull T t) {
        o0ooO.o00oo0O0(t, "element");
        return ((Enum) o0O000O.oOO00oO0(getEntries(), t.ordinal())) == t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OO0oO.o00oOOo0, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Enum) {
            return contains((o00oOo00<T>) ((Enum) obj));
        }
        return false;
    }

    @Override // o0OO0oO.o00oOo00, java.util.List
    @NotNull
    public T get(int i) {
        T[] entries = getEntries();
        o0OO0oO.o00oOo00.Companion.o00oOOoO(i, entries.length);
        return entries[i];
    }

    @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
    public int getSize() {
        return getEntries().length;
    }

    public int indexOf(@NotNull T t) {
        o0ooO.o00oo0O0(t, "element");
        int ordinal = t.ordinal();
        if (((Enum) o0O000O.oOO00oO0(getEntries(), ordinal)) == t) {
            return ordinal;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OO0oO.o00oOo00, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Enum) {
            return indexOf((o00oOo00<T>) ((Enum) obj));
        }
        return -1;
    }

    public int lastIndexOf(@NotNull T t) {
        o0ooO.o00oo0O0(t, "element");
        return indexOf((Object) t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OO0oO.o00oOo00, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Enum) {
            return lastIndexOf((o00oOo00<T>) ((Enum) obj));
        }
        return -1;
    }
}
