package o0OO0oOO;

import java.util.Map;
import java.util.Map.Entry;
import o0OO0oO.o00oo0OO;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public abstract class o0O00O0o<E extends Map.Entry<? extends K, ? extends V>, K, V> extends o00oo0OO<E> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return o00oOOo0((Map.Entry) obj);
        }
        return false;
    }

    public final boolean o00oOOo0(@NotNull E e) {
        o0ooO.o00oo0O0(e, "element");
        return o00oOOoO(e);
    }

    public abstract boolean o00oOOoO(@NotNull Map.Entry<? extends K, ? extends V> entry);

    public /* bridge */ boolean o00oOo00(Map.Entry<?, ?> entry) {
        return super.remove(entry);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return o00oOo00((Map.Entry) obj);
        }
        return false;
    }
}
