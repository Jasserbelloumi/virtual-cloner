package o0Oo0Oo0;

import android.support.v4.media.o00oOo0O;
import android.support.v4.media.o00oOoO;
import java.net.URL;
import java.util.List;
import javax.annotation.Nullable;
import o00oo0o0.o00oo0;
import o0Oo0Oo.oO0000O;
import o0Oo0Oo0.o0O0o00;
import o0Oo0o00.o00oo0O;
/* loaded from: classes3.dex */
public final class o0OO000o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0o00O f16086o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final String f16087o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O0o00 f16088o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public final Object f16089o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public volatile o0oO0Ooo f16090o00oOo0o;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final oo0oO0 f16091o00oOooO;

    /* loaded from: classes3.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0O0o00O f16092o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public String f16093o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0O0o00.o00oOOo0 f16094o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public Object f16095o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public oo0oO0 f16096o00oOooO;

        public o00oOOo0() {
            this.f16093o00oOOoO = o00oo0.f7537o00oOoOO;
            this.f16094o00oOo00 = new o0O0o00.o00oOOo0();
        }

        public o00oOOo0(o0OO000o o0oo000o) {
            this.f16092o00oOOo0 = o0oo000o.f16086o00oOOo0;
            this.f16093o00oOOoO = o0oo000o.f16087o00oOOoO;
            this.f16096o00oOooO = o0oo000o.f16091o00oOooO;
            this.f16095o00oOo0O = o0oo000o.f16089o00oOo0O;
            this.f16094o00oOo00 = o0oo000o.f16088o00oOo00.o00oOo0o();
        }

        public o00oOOo0 o00oOOo0(String str, String str2) {
            this.f16094o00oOo00.o00oOOoO(str, str2);
            return this;
        }

        public o0OO000o o00oOOoO() {
            if (this.f16092o00oOOo0 != null) {
                return new o0OO000o(this);
            }
            throw new IllegalStateException("url == null");
        }

        public o00oOOo0 o00oOo00(o0oO0Ooo o0oo0ooo) {
            String o0oo0ooo2 = o0oo0ooo.toString();
            return o0oo0ooo2.isEmpty() ? o00oo0("Cache-Control") : o00oOoO("Cache-Control", o0oo0ooo2);
        }

        public o00oOOo0 o00oOo0O(@Nullable oo0oO0 oo0oo0) {
            return o00oOoOo("DELETE", oo0oo0);
        }

        public o00oOOo0 o00oOo0o() {
            return o00oOoOo(o00oo0.f7537o00oOoOO, null);
        }

        public o00oOOo0 o00oOoO(String str, String str2) {
            this.f16094o00oOo00.o00oOoOO(str, str2);
            return this;
        }

        public o00oOOo0 o00oOoO0() {
            return o00oOoOo("HEAD", null);
        }

        public o00oOOo0 o00oOoOO(o0O0o00 o0o0o00) {
            this.f16094o00oOo00 = o0o0o00.o00oOo0o();
            return this;
        }

        public o00oOOo0 o00oOoOo(String str, @Nullable oo0oO0 oo0oo0) {
            if (str != null) {
                if (str.length() != 0) {
                    if (oo0oo0 == null || o00oo0O.o00oOOoO(str)) {
                        if (oo0oo0 == null && o00oo0O.o00oOo0O(str)) {
                            throw new IllegalArgumentException(o00oOoO.o00oOOo0("method ", str, " must have a request body."));
                        }
                        this.f16093o00oOOoO = str;
                        this.f16096o00oOooO = oo0oo0;
                        return this;
                    }
                    throw new IllegalArgumentException(o00oOoO.o00oOOo0("method ", str, " must not have a request body."));
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public o00oOOo0 o00oOoo0(oo0oO0 oo0oo0) {
            return o00oOoOo("PATCH", oo0oo0);
        }

        public o00oOOo0 o00oOooO() {
            return o00oOo0O(oO0000O.f15760o00oOooO);
        }

        public o00oOOo0 o00oOooo(oo0oO0 oo0oo0) {
            return o00oOoOo(o00oo0.f7538o00oOoOo, oo0oo0);
        }

        public o00oOOo0 o00oo0(String str) {
            this.f16094o00oOo00.o00oOoO(str);
            return this;
        }

        public o00oOOo0 o00oo00O(oo0oO0 oo0oo0) {
            return o00oOoOo("PUT", oo0oo0);
        }

        public o00oOOo0 o00oo0O(URL url) {
            if (url != null) {
                o0O0o00O o00oo02 = o0O0o00O.o00oo0(url);
                if (o00oo02 != null) {
                    return o00oo0Oo(o00oo02);
                }
                throw new IllegalArgumentException("unexpected url: " + url);
            }
            throw new NullPointerException("url == null");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public o0Oo0Oo0.o0OO000o.o00oOOo0 o00oo0O0(java.lang.String r9) {
            /*
                r8 = this;
                if (r9 == 0) goto L4d
                r1 = 1
                r2 = 0
                r4 = 0
                r5 = 3
                java.lang.String r3 = "ws:"
                r0 = r9
                boolean r0 = r0.regionMatches(r1, r2, r3, r4, r5)
                if (r0 == 0) goto L17
                java.lang.String r0 = "http:"
                java.lang.StringBuilder r0 = android.support.v4.media.o00oOo0O.o00oOOo0(r0)
                r1 = 3
                goto L2b
            L17:
                r3 = 1
                r4 = 0
                r6 = 0
                r7 = 4
                java.lang.String r5 = "wss:"
                r2 = r9
                boolean r0 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r0 == 0) goto L36
                java.lang.String r0 = "https:"
                java.lang.StringBuilder r0 = android.support.v4.media.o00oOo0O.o00oOOo0(r0)
                r1 = 4
            L2b:
                java.lang.String r9 = r9.substring(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
            L36:
                o0Oo0Oo0.o0O0o00O r0 = o0Oo0Oo0.o0O0o00O.o00oo0oO(r9)
                if (r0 == 0) goto L41
                o0Oo0Oo0.o0OO000o$o00oOOo0 r9 = r8.o00oo0Oo(r0)
                return r9
            L41:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "unexpected url: "
                java.lang.String r9 = o00oOoOo.o00oo.o00oOOo0(r1, r9)
                r0.<init>(r9)
                throw r0
            L4d:
                java.lang.NullPointerException r9 = new java.lang.NullPointerException
                java.lang.String r0 = "url == null"
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: o0Oo0Oo0.o0OO000o.o00oOOo0.o00oo0O0(java.lang.String):o0Oo0Oo0.o0OO000o$o00oOOo0");
        }

        public o00oOOo0 o00oo0OO(Object obj) {
            this.f16095o00oOo0O = obj;
            return this;
        }

        public o00oOOo0 o00oo0Oo(o0O0o00O o0o0o00o) {
            if (o0o0o00o != null) {
                this.f16092o00oOOo0 = o0o0o00o;
                return this;
            }
            throw new NullPointerException("url == null");
        }
    }

    public o0OO000o(o00oOOo0 o00oooo02) {
        this.f16086o00oOOo0 = o00oooo02.f16092o00oOOo0;
        this.f16087o00oOOoO = o00oooo02.f16093o00oOOoO;
        o0O0o00.o00oOOo0 o00oooo03 = o00oooo02.f16094o00oOo00;
        o00oooo03.getClass();
        this.f16088o00oOo00 = new o0O0o00(o00oooo03);
        this.f16091o00oOooO = o00oooo02.f16096o00oOooO;
        Object obj = o00oooo02.f16095o00oOo0O;
        this.f16089o00oOo0O = obj == null ? this : obj;
    }

    @Nullable
    public oo0oO0 o00oOOo0() {
        return this.f16091o00oOooO;
    }

    public o0oO0Ooo o00oOOoO() {
        o0oO0Ooo o0oo0ooo = this.f16090o00oOo0o;
        if (o0oo0ooo != null) {
            return o0oo0ooo;
        }
        o0oO0Ooo o00oo00O2 = o0oO0Ooo.o00oo00O(this.f16088o00oOo00);
        this.f16090o00oOo0o = o00oo00O2;
        return o00oo00O2;
    }

    public String o00oOo00(String str) {
        return this.f16088o00oOo00.o00oOOo0(str);
    }

    public o0O0o00 o00oOo0O() {
        return this.f16088o00oOo00;
    }

    public boolean o00oOo0o() {
        return this.f16086o00oOOo0.o00oo0O();
    }

    public o00oOOo0 o00oOoO() {
        return new o00oOOo0(this);
    }

    public String o00oOoO0() {
        return this.f16087o00oOOoO;
    }

    public Object o00oOoOO() {
        return this.f16089o00oOo0O;
    }

    public o0O0o00O o00oOoOo() {
        return this.f16086o00oOOo0;
    }

    public List<String> o00oOooO(String str) {
        return this.f16088o00oOo00.o00oOooo(str);
    }

    public String toString() {
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Request{method=");
        o00oOOo02.append(this.f16087o00oOOoO);
        o00oOOo02.append(", url=");
        o00oOOo02.append(this.f16086o00oOOo0);
        o00oOOo02.append(", tag=");
        Object obj = this.f16089o00oOo0O;
        if (obj == this) {
            obj = null;
        }
        o00oOOo02.append(obj);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
