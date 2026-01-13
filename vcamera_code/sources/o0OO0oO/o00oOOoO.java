package o0OO0oO;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public abstract class o00oOOoO<T> implements Iterator<T>, o0OOOOO.o00oOOo0 {
    @Nullable

    /* renamed from: o00oo0O  reason: collision with root package name */
    public T f13301o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o0OOO0O f13302o00oo0O0 = o0OOO0O.NotReady;

    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f13303o00oOOo0;

        static {
            int[] iArr = new int[o0OOO0O.values().length];
            try {
                iArr[o0OOO0O.Done.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0OOO0O.Ready.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f13303o00oOOo0 = iArr;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        o0OOO0O o0ooo0o = this.f13302o00oo0O0;
        if (o0ooo0o != o0OOO0O.Failed) {
            int i = o00oOOo0.f13303o00oOOo0[o0ooo0o.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return o00oOooO();
                }
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.Iterator
    public T next() {
        if (hasNext()) {
            this.f13302o00oo0O0 = o0OOO0O.NotReady;
            return this.f13301o00oo0O;
        }
        throw new NoSuchElementException();
    }

    public abstract void o00oOOo0();

    public final void o00oOOoO() {
        this.f13302o00oo0O0 = o0OOO0O.Done;
    }

    public final void o00oOo00(T t) {
        this.f13301o00oo0O = t;
        this.f13302o00oo0O0 = o0OOO0O.Ready;
    }

    public final boolean o00oOooO() {
        this.f13302o00oo0O0 = o0OOO0O.Failed;
        o00oOOo0();
        return this.f13302o00oo0O0 == o0OOO0O.Ready;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
