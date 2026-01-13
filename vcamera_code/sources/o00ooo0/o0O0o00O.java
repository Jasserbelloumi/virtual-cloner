package o00ooo0;

import android.content.SharedPreferences;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public final class o0O0o00O {

    @Deprecated
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static o00oOOo0 f9624o00oOOoO;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final C0117o00oOOo0 f9625o00oOOo0 = new C0117o00oOOo0();

        /* renamed from: o00ooo0.o0O0o00O$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0117o00oOOo0 {
            public void o00oOOo0(@oo0oO0 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static o00oOOo0 o00oOOoO() {
            if (f9624o00oOOoO == null) {
                f9624o00oOOoO = new o00oOOo0();
            }
            return f9624o00oOOoO;
        }

        @Deprecated
        public void o00oOOo0(@oo0oO0 SharedPreferences.Editor editor) {
            this.f9625o00oOOo0.o00oOOo0(editor);
        }
    }
}
