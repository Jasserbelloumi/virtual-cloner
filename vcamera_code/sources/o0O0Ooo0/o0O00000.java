package o0O0Ooo0;

import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class o0O00000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static o0O00000 f12167o00oOOo0 = null;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f12168o00oOOoO = "WM-";

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f12169o00oOo00 = 23;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f12170o00oOooO = 20;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o0O00000 {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f12171o00oOo0O;

        public o00oOOo0(int i) {
            super(i);
            this.f12171o00oOo0O = i;
        }

        @Override // o0O0Ooo0.o0O00000
        public void o00oOOo0(String str, String str2, Throwable... thArr) {
            if (this.f12171o00oOo0O > 3 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // o0O0Ooo0.o0O00000
        public void o00oOOoO(String str, String str2, Throwable... thArr) {
            if (this.f12171o00oOo0O > 6 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // o0O0Ooo0.o0O00000
        public void o00oOoO(String str, String str2, Throwable... thArr) {
            if (this.f12171o00oOo0O > 5 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // o0O0Ooo0.o0O00000
        public void o00oOoO0(String str, String str2, Throwable... thArr) {
            if (this.f12171o00oOo0O > 2 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // o0O0Ooo0.o0O00000
        public void o00oOooO(String str, String str2, Throwable... thArr) {
            if (this.f12171o00oOo0O > 4 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }
    }

    public o0O00000(int i) {
    }

    public static synchronized o0O00000 o00oOo00() {
        o0O00000 o0o00000;
        synchronized (o0O00000.class) {
            if (f12167o00oOOo0 == null) {
                f12167o00oOOo0 = new o00oOOo0(3);
            }
            o0o00000 = f12167o00oOOo0;
        }
        return o0o00000;
    }

    public static synchronized void o00oOo0O(o0O00000 o0o00000) {
        synchronized (o0O00000.class) {
            f12167o00oOOo0 = o0o00000;
        }
    }

    public static String o00oOo0o(@oo0oO0 String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append(f12168o00oOOoO);
        int i = f12170o00oOooO;
        if (length >= i) {
            str = str.substring(0, i);
        }
        sb.append(str);
        return sb.toString();
    }

    public abstract void o00oOOo0(String str, String str2, Throwable... thArr);

    public abstract void o00oOOoO(String str, String str2, Throwable... thArr);

    public abstract void o00oOoO(String str, String str2, Throwable... thArr);

    public abstract void o00oOoO0(String str, String str2, Throwable... thArr);

    public abstract void o00oOooO(String str, String str2, Throwable... thArr);
}
