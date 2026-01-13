package o0Oo0o0o;

import java.io.IOException;
import java.util.List;
import o0Oo.o0O00000;
/* loaded from: classes3.dex */
public interface o0O00o00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O00o00 f16520o00oOOo0 = new o00oOOo0();

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements o0O00o00 {
        @Override // o0Oo0o0o.o0O00o00
        public void o00oOOo0(int i, o0OoOoOo o0oooooo) {
        }

        @Override // o0Oo0o0o.o0O00o00
        public boolean o00oOOoO(int i, List<o0O000Oo> list) {
            return true;
        }

        @Override // o0Oo0o0o.o0O00o00
        public boolean o00oOo00(int i, List<o0O000Oo> list, boolean z) {
            return true;
        }

        @Override // o0Oo0o0o.o0O00o00
        public boolean o00oOooO(int i, o0O00000 o0o00000, int i2, boolean z) throws IOException {
            o0o00000.skip(i2);
            return true;
        }
    }

    void o00oOOo0(int i, o0OoOoOo o0oooooo);

    boolean o00oOOoO(int i, List<o0O000Oo> list);

    boolean o00oOo00(int i, List<o0O000Oo> list, boolean z);

    boolean o00oOooO(int i, o0O00000 o0o00000, int i2, boolean z) throws IOException;
}
