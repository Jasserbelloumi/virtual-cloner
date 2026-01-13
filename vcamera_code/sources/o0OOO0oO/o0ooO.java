package o0OOO0oO;

import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OOOoO0.oO000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class o0ooO implements oO000<String> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final BufferedReader f13489o00oOOo0;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<String>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public boolean f13490o00oo0O;
        @Nullable

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public String f13491o00oo0O0;

        public o00oOOo0() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13491o00oo0O0 == null && !this.f13490o00oo0O) {
                String readLine = o0ooO.this.f13489o00oOOo0.readLine();
                this.f13491o00oo0O0 = readLine;
                if (readLine == null) {
                    this.f13490o00oo0O = true;
                }
            }
            return this.f13491o00oo0O0 != null;
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: o00oOOo0 */
        public String next() {
            if (hasNext()) {
                String str = this.f13491o00oo0O0;
                this.f13491o00oo0O0 = null;
                o0OOOOO0.o0ooO.o00oo00O(str);
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public o0ooO(@NotNull BufferedReader bufferedReader) {
        o0OOOOO0.o0ooO.o00oo0O0(bufferedReader, "reader");
        this.f13489o00oOOo0 = bufferedReader;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<String> iterator() {
        return new o00oOOo0();
    }
}
