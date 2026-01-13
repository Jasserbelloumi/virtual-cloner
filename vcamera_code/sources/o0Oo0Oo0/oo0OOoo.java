package o0Oo0Oo0;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import o00oo0o0.o00oo0;
import o0Oo.o0;
import o0Oo.o00ooO;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public final class oo0OOoo extends oo0oO0 {

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o0oOo0O0 f16155o00oOo00 = o0oOo0O0.o00oOo00(o00oo0.f7539o00oOoo0);

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final List<String> f16156o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final List<String> f16157o00oOOoO;

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final List<String> f16158o00oOOo0 = new ArrayList();

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final List<String> f16159o00oOOoO = new ArrayList();

        public o00oOOo0 o00oOOo0(String str, String str2) {
            this.f16158o00oOOo0.add(o0O0o00O.o00oOOoO(str, o0O0o00O.f15886o00oo0Oo, false, false, true, true));
            this.f16159o00oOOoO.add(o0O0o00O.o00oOOoO(str2, o0O0o00O.f15886o00oo0Oo, false, false, true, true));
            return this;
        }

        public o00oOOo0 o00oOOoO(String str, String str2) {
            this.f16158o00oOOo0.add(o0O0o00O.o00oOOoO(str, o0O0o00O.f15886o00oo0Oo, true, false, true, true));
            this.f16159o00oOOoO.add(o0O0o00O.o00oOOoO(str2, o0O0o00O.f15886o00oo0Oo, true, false, true, true));
            return this;
        }

        public oo0OOoo o00oOo00() {
            return new oo0OOoo(this.f16158o00oOOo0, this.f16159o00oOOoO);
        }
    }

    public oo0OOoo(List<String> list, List<String> list2) {
        this.f16156o00oOOo0 = oO0000O.o00oo0OO(list);
        this.f16157o00oOOoO = oO0000O.o00oo0OO(list2);
    }

    @Override // o0Oo0Oo0.oo0oO0
    public long o00oOOo0() {
        return o00oo0(null, true);
    }

    @Override // o0Oo0Oo0.oo0oO0
    public o0oOo0O0 o00oOOoO() {
        return f16155o00oOo00;
    }

    @Override // o0Oo0Oo0.oo0oO0
    public void o00oOoO(o0 o0Var) throws IOException {
        o00oo0(o0Var, false);
    }

    public String o00oOoOO(int i) {
        return this.f16156o00oOOo0.get(i);
    }

    public String o00oOoOo(int i) {
        return this.f16157o00oOOoO.get(i);
    }

    public String o00oOoo0(int i) {
        return o0O0o00O.o00ooO0o(o00oOoOO(i), true);
    }

    public int o00oOooo() {
        return this.f16156o00oOOo0.size();
    }

    public final long o00oo0(@Nullable o0 o0Var, boolean z) {
        o00ooO o00ooo = z ? new o00ooO() : o0Var.o00oOo00();
        int size = this.f16156o00oOOo0.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                o00ooo.writeByte(38);
            }
            o00ooo.o00oooo0(this.f16156o00oOOo0.get(i));
            o00ooo.writeByte(61);
            o00ooo.o00oooo0(this.f16157o00oOOoO.get(i));
        }
        if (z) {
            long j = o00ooo.f15434o00oo0O;
            o00ooo.o00oOOoO();
            return j;
        }
        return 0L;
    }

    public String o00oo00O(int i) {
        return o0O0o00O.o00ooO0o(o00oOoOo(i), true);
    }
}
