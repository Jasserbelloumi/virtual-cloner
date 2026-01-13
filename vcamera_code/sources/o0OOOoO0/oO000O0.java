package o0OOOoO0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO.o00oo0O0;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOO0.o00oo0OO;
import o0OOOOO.o00oOOo0;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class oO000O0<T> extends oO000O0O<T> implements Iterator<T>, o00oOo0O<o0OO0o.oO0Ooooo>, o00oOOo0 {
    @Nullable

    /* renamed from: o00oo0O  reason: collision with root package name */
    public T f13801o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int f13802o00oo0O0;
    @Nullable

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Iterator<? extends T> f13803o00oo0Oo;
    @Nullable

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o00oOo0O<? super o0OO0o.oO0Ooooo> f13804o00oo0o0;

    @Override // o0OO.o00oOo0O
    @NotNull
    public o00oo0 getContext() {
        return o00oo0O0.INSTANCE;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.f13802o00oo0O0;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw o00oOoO();
                }
                Iterator<? extends T> it = this.f13803o00oo0Oo;
                o0ooO.o00oo00O(it);
                if (it.hasNext()) {
                    this.f13802o00oo0O0 = 2;
                    return true;
                }
                this.f13803o00oo0Oo = null;
            }
            this.f13802o00oo0O0 = 5;
            o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2 = this.f13804o00oo0o0;
            o0ooO.o00oo00O(o00ooo0o2);
            this.f13804o00oo0o0 = null;
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            o00ooo0o2.resumeWith(oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f13802o00oo0O0;
        if (i == 0 || i == 1) {
            return o00oOooo();
        }
        if (i == 2) {
            this.f13802o00oo0O0 = 1;
            Iterator<? extends T> it = this.f13803o00oo0Oo;
            o0ooO.o00oo00O(it);
            return it.next();
        } else if (i == 3) {
            this.f13802o00oo0O0 = 0;
            T t = this.f13801o00oo0O;
            this.f13801o00oo0O = null;
            return t;
        } else {
            throw o00oOoO();
        }
    }

    @Override // o0OOOoO0.oO000O0O
    @Nullable
    public Object o00oOOoO(T t, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        this.f13801o00oo0O = t;
        this.f13802o00oo0O0 = 3;
        this.f13804o00oo0o0 = o00ooo0o2;
        o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        o00oo0OO.o00oOo00(o00ooo0o2);
        return o00oooo02;
    }

    public final Throwable o00oOoO() {
        int i = this.f13802o00oo0O0;
        if (i != 4) {
            if (i != 5) {
                StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Unexpected state of the iterator: ");
                o00oOOo02.append(this.f13802o00oo0O0);
                return new IllegalStateException(o00oOOo02.toString());
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    @Nullable
    public final o00oOo0O<o0OO0o.oO0Ooooo> o00oOoo0() {
        return this.f13804o00oo0o0;
    }

    @Override // o0OOOoO0.oO000O0O
    @Nullable
    public Object o00oOooO(@NotNull Iterator<? extends T> it, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        if (it.hasNext()) {
            this.f13803o00oo0Oo = it;
            this.f13802o00oo0O0 = 2;
            this.f13804o00oo0o0 = o00ooo0o2;
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            o00oo0OO.o00oOo00(o00ooo0o2);
            return o00oooo02;
        }
        return o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    public final T o00oOooo() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public final void o00oo00O(@Nullable o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        this.f13804o00oo0o0 = o00ooo0o2;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // o0OO.o00oOo0O
    public void resumeWith(@NotNull Object obj) {
        oo0ooO.o00oo0(obj);
        this.f13802o00oo0O0 = 4;
    }
}
