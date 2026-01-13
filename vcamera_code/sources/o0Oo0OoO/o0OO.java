package o0Oo0OoO;

import com.google.common.net.HttpHeaders;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import o0Oo0Oo.oO00000;
import o0Oo0Oo0.o0O0o00;
import o0Oo0Oo0.o0OO000o;
import o0Oo0Oo0.o0oO0Ooo;
import o0Oo0Oo0.oo0ooO;
import o0Oo0o00.o00oo0O0;
import o0Oo0o00.o00oo0OO;
/* loaded from: classes3.dex */
public final class o0OO {
    @Nullable

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0OO000o f16211o00oOOo0;
    @Nullable

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final oo0ooO f16212o00oOOoO;

    /* loaded from: classes3.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final long f16213o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0OO000o f16214o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final oo0ooO f16215o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public String f16216o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public Date f16217o00oOo0o;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public Date f16218o00oOoO;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public String f16219o00oOoO0;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public long f16220o00oOoOO;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public long f16221o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public String f16222o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Date f16223o00oOooO;

        /* renamed from: o00oOooo  reason: collision with root package name */
        public int f16224o00oOooo;

        public o00oOOo0(long j, o0OO000o o0oo000o, oo0ooO oo0ooo) {
            this.f16224o00oOooo = -1;
            this.f16213o00oOOo0 = j;
            this.f16214o00oOOoO = o0oo000o;
            this.f16215o00oOo00 = oo0ooo;
            if (oo0ooo != null) {
                this.f16220o00oOoOO = oo0ooo.f16178o00ooO0O;
                this.f16221o00oOoOo = oo0ooo.f16179o00ooO0o;
                o0O0o00 o0o0o00 = oo0ooo.f16174o00oo0oO;
                int length = o0o0o00.f15872o00oOOo0.length / 2;
                for (int i = 0; i < length; i++) {
                    String o00oOooO2 = o0o0o00.o00oOooO(i);
                    String o00oOoo02 = o0o0o00.o00oOoo0(i);
                    if ("Date".equalsIgnoreCase(o00oOooO2)) {
                        this.f16223o00oOooO = o00oo0OO.o00oOOoO(o00oOoo02);
                        this.f16216o00oOo0O = o00oOoo02;
                    } else if ("Expires".equalsIgnoreCase(o00oOooO2)) {
                        this.f16218o00oOoO = o00oo0OO.o00oOOoO(o00oOoo02);
                    } else if (HttpHeaders.LAST_MODIFIED.equalsIgnoreCase(o00oOooO2)) {
                        this.f16217o00oOo0o = o00oo0OO.o00oOOoO(o00oOoo02);
                        this.f16219o00oOoO0 = o00oOoo02;
                    } else if (HttpHeaders.ETAG.equalsIgnoreCase(o00oOooO2)) {
                        this.f16222o00oOoo0 = o00oOoo02;
                    } else if (HttpHeaders.AGE.equalsIgnoreCase(o00oOooO2)) {
                        this.f16224o00oOooo = o00oo0O0.o00oOoO0(o00oOoo02, -1);
                    }
                }
            }
        }

        public static boolean o00oOo0O(o0OO000o o0oo000o) {
            return (o0oo000o.o00oOo00(HttpHeaders.IF_MODIFIED_SINCE) == null && o0oo000o.o00oOo00(HttpHeaders.IF_NONE_MATCH) == null) ? false : true;
        }

        public final long o00oOOo0() {
            Date date = this.f16223o00oOooO;
            long max = date != null ? Math.max(0L, this.f16221o00oOoOo - date.getTime()) : 0L;
            int i = this.f16224o00oOooo;
            if (i != -1) {
                max = Math.max(max, TimeUnit.SECONDS.toMillis(i));
            }
            long j = this.f16221o00oOoOo;
            return max + (j - this.f16220o00oOoOO) + (this.f16213o00oOOo0 - j);
        }

        public final long o00oOOoO() {
            int i = this.f16215o00oOo00.o00oOOoO().f16116o00oOo00;
            if (i != -1) {
                return TimeUnit.SECONDS.toMillis(i);
            }
            if (this.f16218o00oOoO != null) {
                Date date = this.f16223o00oOooO;
                long time = this.f16218o00oOoO.getTime() - (date != null ? date.getTime() : this.f16221o00oOoOo);
                if (time > 0) {
                    return time;
                }
                return 0L;
            } else if (this.f16217o00oOo0o == null || this.f16215o00oOo00.f16170o00oo0O0.f16086o00oOOo0.o00ooOo0() != null) {
                return 0L;
            } else {
                Date date2 = this.f16223o00oOooO;
                long time2 = (date2 != null ? date2.getTime() : this.f16220o00oOoOO) - this.f16217o00oOo0o.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0L;
            }
        }

        public o0OO o00oOo00() {
            o0OO o00oOooO2 = o00oOooO();
            return (o00oOooO2.f16211o00oOOo0 == null || !this.f16214o00oOOoO.o00oOOoO().f16122o00oOoOo) ? o00oOooO2 : new o0OO(null, null);
        }

        public final boolean o00oOo0o() {
            return this.f16215o00oOo00.o00oOOoO().f16116o00oOo00 == -1 && this.f16218o00oOoO == null;
        }

        public final o0OO o00oOooO() {
            int i;
            if (this.f16215o00oOo00 == null) {
                return new o0OO(this.f16214o00oOOoO, null);
            }
            if ((!this.f16214o00oOOoO.o00oOo0o() || this.f16215o00oOo00.f16172o00oo0o != null) && o0OO.o00oOOo0(this.f16215o00oOo00, this.f16214o00oOOoO)) {
                o0oO0Ooo o00oOOoO2 = this.f16214o00oOOoO.o00oOOoO();
                if (o00oOOoO2.f16114o00oOOo0 || o00oOo0O(this.f16214o00oOOoO)) {
                    return new o0OO(this.f16214o00oOOoO, null);
                }
                long o00oOOo02 = o00oOOo0();
                long o00oOOoO3 = o00oOOoO();
                int i2 = o00oOOoO2.f16116o00oOo00;
                if (i2 != -1) {
                    o00oOOoO3 = Math.min(o00oOOoO3, TimeUnit.SECONDS.toMillis(i2));
                }
                int i3 = o00oOOoO2.f16121o00oOoOO;
                long j = 0;
                long millis = i3 != -1 ? TimeUnit.SECONDS.toMillis(i3) : 0L;
                o0oO0Ooo o00oOOoO4 = this.f16215o00oOo00.o00oOOoO();
                if (!o00oOOoO4.f16120o00oOoO0 && (i = o00oOOoO2.f16119o00oOoO) != -1) {
                    j = TimeUnit.SECONDS.toMillis(i);
                }
                if (!o00oOOoO4.f16114o00oOOo0) {
                    long j2 = millis + o00oOOo02;
                    if (j2 < j + o00oOOoO3) {
                        oo0ooO oo0ooo = this.f16215o00oOo00;
                        oo0ooo.getClass();
                        oo0ooO.o00oOOo0 o00oooo02 = new oo0ooO.o00oOOo0(oo0ooo);
                        if (j2 >= o00oOOoO3) {
                            o00oooo02.o00oOOo0(HttpHeaders.WARNING, "110 HttpURLConnection \"Response is stale\"");
                        }
                        if (o00oOOo02 > 86400000 && o00oOo0o()) {
                            o00oooo02.o00oOOo0(HttpHeaders.WARNING, "113 HttpURLConnection \"Heuristic expiration\"");
                        }
                        return new o0OO(null, o00oooo02.o00oOo00());
                    }
                }
                String str = this.f16222o00oOoo0;
                String str2 = HttpHeaders.IF_MODIFIED_SINCE;
                if (str != null) {
                    str2 = HttpHeaders.IF_NONE_MATCH;
                } else if (this.f16217o00oOo0o != null) {
                    str = this.f16219o00oOoO0;
                } else if (this.f16223o00oOooO == null) {
                    return new o0OO(this.f16214o00oOOoO, null);
                } else {
                    str = this.f16216o00oOo0O;
                }
                o0O0o00.o00oOOo0 o00oOo0o2 = this.f16214o00oOOoO.f16088o00oOo00.o00oOo0o();
                oO00000.f15748o00oOOo0.o00oOOoO(o00oOo0o2, str2, str);
                o0OO000o o0oo000o = this.f16214o00oOOoO;
                o0oo000o.getClass();
                o0OO000o.o00oOOo0 o00oooo03 = new o0OO000o.o00oOOo0(o0oo000o);
                o00oOo0o2.getClass();
                return new o0OO(o00oooo03.o00oOoOO(new o0O0o00(o00oOo0o2)).o00oOOoO(), this.f16215o00oOo00);
            }
            return new o0OO(this.f16214o00oOOoO, null);
        }
    }

    public o0OO(o0OO000o o0oo000o, oo0ooO oo0ooo) {
        this.f16211o00oOOo0 = o0oo000o;
        this.f16212o00oOOoO = oo0ooo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (r3.o00oOOoO().f16117o00oOo0O == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o00oOOo0(o0Oo0Oo0.oo0ooO r3, o0Oo0Oo0.o0OO000o r4) {
        /*
            int r0 = r3.f16171o00oo0Oo
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L53
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L53
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L53
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L53
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L53
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L53
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L2f
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L53
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L53
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L53
            switch(r0) {
                case 300: goto L53;
                case 301: goto L53;
                case 302: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L52
        L2f:
            r0 = 0
            java.lang.String r1 = "Expires"
            java.lang.String r0 = r3.o00oOooo(r1, r0)
            if (r0 != 0) goto L53
            o0Oo0Oo0.o0oO0Ooo r0 = r3.o00oOOoO()
            int r0 = r0.f16116o00oOo00
            r1 = -1
            if (r0 != r1) goto L53
            o0Oo0Oo0.o0oO0Ooo r0 = r3.o00oOOoO()
            boolean r0 = r0.f16118o00oOo0o
            if (r0 != 0) goto L53
            o0Oo0Oo0.o0oO0Ooo r0 = r3.o00oOOoO()
            boolean r0 = r0.f16117o00oOo0O
            if (r0 == 0) goto L52
            goto L53
        L52:
            return r2
        L53:
            o0Oo0Oo0.o0oO0Ooo r3 = r3.o00oOOoO()
            boolean r3 = r3.f16115o00oOOoO
            if (r3 != 0) goto L64
            o0Oo0Oo0.o0oO0Ooo r3 = r4.o00oOOoO()
            boolean r3 = r3.f16115o00oOOoO
            if (r3 != 0) goto L64
            r2 = 1
        L64:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo0OoO.o0OO.o00oOOo0(o0Oo0Oo0.oo0ooO, o0Oo0Oo0.o0OO000o):boolean");
    }
}
