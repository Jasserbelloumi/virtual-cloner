package o0OO0oO;

import com.google.android.exoplayer2.text.CueDecoder;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OO0o.o0OO00o0(version = "1.1")
/* loaded from: classes3.dex */
public abstract class o00oo0O0<E> extends o0OO0oO.o00oOOo0<E> implements Set<E>, o0OOOOO.o00oOOo0 {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final o00oOOo0 f13319o00oo0O0 = new o00oOOo0(null);

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        public o00oOOo0() {
        }

        public o00oOOo0(o0OOOOO0.o0O00 o0o00) {
        }

        public final boolean o00oOOo0(@NotNull Set<?> set, @NotNull Set<?> set2) {
            o0OOOOO0.o0ooO.o00oo0O0(set, CueDecoder.BUNDLED_CUES);
            o0OOOOO0.o0ooO.o00oo0O0(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int o00oOOoO(@NotNull Collection<?> collection) {
            o0OOOOO0.o0ooO.o00oo0O0(collection, CueDecoder.BUNDLED_CUES);
            Iterator<?> it = collection.iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i += next != null ? next.hashCode() : 0;
            }
            return i;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            return f13319o00oo0O0.o00oOOo0(this, (Set) obj);
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return f13319o00oo0O0.o00oOOoO(this);
    }

    @Override // o0OO0oO.o00oOOo0, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
