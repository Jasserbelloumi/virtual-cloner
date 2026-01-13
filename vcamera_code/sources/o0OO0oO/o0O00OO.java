package o0OO0oO;

import java.util.Enumeration;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o0O00OO extends o0O00O {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements Iterator<T>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Enumeration<T> f13351o00oo0O0;

        public o00oOOo0(Enumeration<T> enumeration) {
            this.f13351o00oo0O0 = enumeration;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f13351o00oo0O0.hasMoreElements();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f13351o00oo0O0.nextElement();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    public static final <T> Iterator<T> o0OoOoOO(@NotNull Enumeration<T> enumeration) {
        o0OOOOO0.o0ooO.o00oo0O0(enumeration, "<this>");
        return new o00oOOo0(enumeration);
    }
}
