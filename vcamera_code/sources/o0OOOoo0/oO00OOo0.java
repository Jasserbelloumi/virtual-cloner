package o0OOOoo0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0OO0o.o0O0o00;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import o0OOOo0o.o0O0O0Oo;
import o0OOOo0o.oo0OOoo;
import o0OOOoO0.oO000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* loaded from: classes3.dex */
public final class oO00OOo0 implements oO000<o0O0O0Oo> {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final CharSequence f13873o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final int f13874o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final int f13875o00oOo00;
    @NotNull

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final o0O00000<CharSequence, Integer, o0O0o00<Integer, Integer>> f13876o00oOooO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements Iterator<o0O0O0Oo>, o0OOOOO.o00oOOo0 {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f13877o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f13878o00oo0O0 = -1;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public int f13879o00oo0Oo;

        /* renamed from: o00oo0o  reason: collision with root package name */
        public int f13880o00oo0o;
        @Nullable

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public o0O0O0Oo f13881o00oo0o0;

        public o00oOOo0() {
            int o00ooOoo2 = oo0OOoo.o00ooOoo(oO00OOo0.this.f13874o00oOOoO, 0, oO00OOo0.this.f13873o00oOOo0.length());
            this.f13877o00oo0O = o00ooOoo2;
            this.f13879o00oo0Oo = o00ooOoo2;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f13878o00oo0O0 == -1) {
                o00oOOo0();
            }
            return this.f13878o00oo0O0 == 1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
            if (r6 < r3) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void o00oOOo0() {
            /*
                r7 = this;
                int r0 = r7.f13879o00oo0Oo
                r1 = 0
                if (r0 >= 0) goto Lc
                r7.f13878o00oo0O0 = r1
                r0 = 0
                r7.f13881o00oo0o0 = r0
                goto L82
            Lc:
                o0OOOoo0.oO00OOo0 r2 = o0OOOoo0.oO00OOo0.this
                int r3 = r2.f13875o00oOo00
                r4 = -1
                r5 = 1
                if (r3 <= 0) goto L1b
                int r6 = r7.f13880o00oo0o
                int r6 = r6 + r5
                r7.f13880o00oo0o = r6
                if (r6 >= r3) goto L23
            L1b:
                java.lang.CharSequence r2 = r2.f13873o00oOOo0
                int r2 = r2.length()
                if (r0 <= r2) goto L37
            L23:
                o0OOOo0o.o0O0O0Oo r0 = new o0OOOo0o.o0O0O0Oo
                int r1 = r7.f13877o00oo0O
                o0OOOoo0.oO00OOo0 r2 = o0OOOoo0.oO00OOo0.this
                java.lang.CharSequence r2 = r2.f13873o00oOOo0
                int r2 = o0OOOoo0.oO0O0.o0OOo0oO(r2)
                r0.<init>(r1, r2)
            L32:
                r7.f13881o00oo0o0 = r0
                r7.f13879o00oo0Oo = r4
                goto L80
            L37:
                o0OOOoo0.oO00OOo0 r0 = o0OOOoo0.oO00OOo0.this
                o0OOOO.o0O00000<java.lang.CharSequence, java.lang.Integer, o0OO0o.o0O0o00<java.lang.Integer, java.lang.Integer>> r2 = r0.f13876o00oOooO
                java.lang.CharSequence r0 = r0.f13873o00oOOo0
                int r3 = r7.f13879o00oo0Oo
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.invoke(r0, r3)
                o0OO0o.o0O0o00 r0 = (o0OO0o.o0O0o00) r0
                if (r0 != 0) goto L5b
                o0OOOo0o.o0O0O0Oo r0 = new o0OOOo0o.o0O0O0Oo
                int r1 = r7.f13877o00oo0O
                o0OOOoo0.oO00OOo0 r2 = o0OOOoo0.oO00OOo0.this
                java.lang.CharSequence r2 = r2.f13873o00oOOo0
                int r2 = o0OOOoo0.oO0O0.o0OOo0oO(r2)
                r0.<init>(r1, r2)
                goto L32
            L5b:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f13877o00oo0O
                o0OOOo0o.o0O0O0Oo r3 = o0OOOo0o.oo0OOoo.o0OO00o(r3, r2)
                r7.f13881o00oo0o0 = r3
                int r2 = r2 + r0
                r7.f13877o00oo0O = r2
                if (r0 != 0) goto L7d
                r1 = r5
            L7d:
                int r2 = r2 + r1
                r7.f13879o00oo0Oo = r2
            L80:
                r7.f13878o00oo0O0 = r5
            L82:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOOoo0.oO00OOo0.o00oOOo0.o00oOOo0():void");
        }

        public final int o00oOOoO() {
            return this.f13880o00oo0o;
        }

        public final int o00oOo00() {
            return this.f13877o00oo0O;
        }

        public final int o00oOo0O() {
            return this.f13879o00oo0Oo;
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: o00oOoO */
        public o0O0O0Oo next() {
            if (this.f13878o00oo0O0 == -1) {
                o00oOOo0();
            }
            if (this.f13878o00oo0O0 != 0) {
                o0O0O0Oo o0o0o0oo = this.f13881o00oo0o0;
                o0ooO.o00oo0(o0o0o0oo, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f13881o00oo0o0 = null;
                this.f13878o00oo0O0 = -1;
                return o0o0o0oo;
            }
            throw new NoSuchElementException();
        }

        public final int o00oOoO0() {
            return this.f13878o00oo0O0;
        }

        public final void o00oOoOO(int i) {
            this.f13880o00oo0o = i;
        }

        public final void o00oOoOo(int i) {
            this.f13877o00oo0O = i;
        }

        public final void o00oOoo0(@Nullable o0O0O0Oo o0o0o0oo) {
            this.f13881o00oo0o0 = o0o0o0oo;
        }

        @Nullable
        public final o0O0O0Oo o00oOooO() {
            return this.f13881o00oo0o0;
        }

        public final void o00oOooo(int i) {
            this.f13879o00oo0Oo = i;
        }

        public final void o00oo00O(int i) {
            this.f13878o00oo0O0 = i;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oO00OOo0(@NotNull CharSequence charSequence, int i, int i2, @NotNull o0O00000<? super CharSequence, ? super Integer, o0O0o00<Integer, Integer>> o0o00000) {
        o0ooO.o00oo0O0(charSequence, "input");
        o0ooO.o00oo0O0(o0o00000, "getNextMatch");
        this.f13873o00oOOo0 = charSequence;
        this.f13874o00oOOoO = i;
        this.f13875o00oOo00 = i2;
        this.f13876o00oOooO = o0o00000;
    }

    @Override // o0OOOoO0.oO000
    @NotNull
    public Iterator<o0O0O0Oo> iterator() {
        return new o00oOOo0();
    }
}
