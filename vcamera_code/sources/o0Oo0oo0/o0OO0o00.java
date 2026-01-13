package o0Oo0oo0;

import java.net.IDN;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public final class o0OO0o00 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f16651o00oOo0O = "publicsuffixes.gz";

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final byte f16655o00oOoOO = 33;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final AtomicBoolean f16657o00oOOo0 = new AtomicBoolean(false);

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final CountDownLatch f16658o00oOOoO = new CountDownLatch(1);

    /* renamed from: o00oOo00  reason: collision with root package name */
    public byte[] f16659o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public byte[] f16660o00oOooO;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final byte[] f16652o00oOo0o = {42};

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String[] f16654o00oOoO0 = new String[0];

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String[] f16653o00oOoO = {"*"};

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final o0OO0o00 f16656o00oOoOo = new o0OO0o00();

    public static String o00oOOo0(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != 10) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == 10) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z2 = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z2) {
                    i3 = 46;
                    z = false;
                } else {
                    z = z2;
                    i3 = bArr2[i10][i11] & 255;
                }
                i4 = i3 - (bArr[i7 + i12] & 255);
                if (i4 == 0) {
                    i12++;
                    i11++;
                    if (i12 == i9) {
                        break;
                    } else if (bArr2[i10].length != i11) {
                        z2 = z;
                    } else if (i10 == bArr2.length - 1) {
                        break;
                    } else {
                        i10++;
                        i11 = -1;
                        z2 = true;
                    }
                } else {
                    break;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    while (true) {
                        i10++;
                        if (i10 >= bArr2.length) {
                            break;
                        }
                        length2 += bArr2[i10].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, oO0000O.f15758o00oOoOo);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    public static o0OO0o00 o00oOo00() {
        return f16656o00oOoOo;
    }

    public final String[] o00oOOoO(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i = 0;
        if (this.f16657o00oOOo0.get() || !this.f16657o00oOOo0.compareAndSet(false, true)) {
            try {
                this.f16658o00oOOoO.await();
            } catch (InterruptedException unused) {
            }
        } else {
            o00oOo0O();
        }
        synchronized (this) {
            if (this.f16659o00oOo00 == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(oO0000O.f15758o00oOoOo);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = o00oOOo0(this.f16659o00oOo00, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            for (int i4 = 0; i4 < bArr2.length - 1; i4++) {
                bArr2[i4] = f16652o00oOo0o;
                str3 = o00oOOo0(this.f16659o00oOo00, bArr2, i4);
                if (str3 != null) {
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String o00oOOo02 = o00oOOo0(this.f16660o00oOooO, bArr, i);
                if (o00oOOo02 != null) {
                    str = o00oOOo02;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return f16653o00oOoO;
        } else {
            String[] split = str2 != null ? str2.split("\\.") : f16654o00oOoO0;
            String[] split2 = str3 != null ? str3.split("\\.") : f16654o00oOoO0;
            return split.length > split2.length ? split : split2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00oOo0O() {
        /*
            r6 = this;
            java.lang.Class<o0Oo0oo0.o0OO0o00> r0 = o0Oo0oo0.o0OO0o00.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            r1 = 0
            if (r0 == 0) goto L49
            o0Oo.o0O00 r2 = new o0Oo.o0O00
            o0Oo.o0O0O0Oo r0 = o0Oo.o0O00O.o00oOooo(r0)
            r2.<init>(r0)
            o0Oo.o0O00o00 r0 = new o0Oo.o0O00o00
            r0.<init>(r2)
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r0.readFully(r2)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            int r3 = r0.readInt()     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            r0.readFully(r3)     // Catch: java.lang.Throwable -> L34 java.io.IOException -> L36
            o0Oo0Oo.oO0000O.o00oOo00(r0)
            r1 = r2
            goto L4a
        L34:
            r1 = move-exception
            goto L45
        L36:
            r2 = move-exception
            o0Oo0oO.oO0Ooooo r3 = o0Oo0oO.oO0Ooooo.o00oOoO()     // Catch: java.lang.Throwable -> L34
            r4 = 5
            java.lang.String r5 = "Failed to read public suffix list"
            r3.o00oo00O(r4, r5, r2)     // Catch: java.lang.Throwable -> L34
            o0Oo0Oo.oO0000O.o00oOo00(r0)
            goto L49
        L45:
            o0Oo0Oo.oO0000O.o00oOo00(r0)
            throw r1
        L49:
            r3 = r1
        L4a:
            monitor-enter(r6)
            r6.f16659o00oOo00 = r1     // Catch: java.lang.Throwable -> L56
            r6.f16660o00oOooO = r3     // Catch: java.lang.Throwable -> L56
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            java.util.concurrent.CountDownLatch r0 = r6.f16658o00oOOoO
            r0.countDown()
            return
        L56:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L56
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0Oo0oo0.o0OO0o00.o00oOo0O():void");
    }

    public void o00oOo0o(byte[] bArr, byte[] bArr2) {
        this.f16659o00oOo00 = bArr;
        this.f16660o00oOooO = bArr2;
        this.f16657o00oOOo0.set(true);
        this.f16658o00oOOoO.countDown();
    }

    public String o00oOooO(String str) {
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] o00oOOoO2 = o00oOOoO(split);
            if (split.length != o00oOOoO2.length || o00oOOoO2[0].charAt(0) == '!') {
                char charAt = o00oOOoO2[0].charAt(0);
                int length = split.length;
                int length2 = o00oOOoO2.length;
                if (charAt != '!') {
                    length2++;
                }
                StringBuilder sb = new StringBuilder();
                String[] split2 = str.split("\\.");
                for (int i = length - length2; i < split2.length; i++) {
                    sb.append(split2[i]);
                    sb.append('.');
                }
                sb.deleteCharAt(sb.length() - 1);
                return sb.toString();
            }
            return null;
        }
        throw new NullPointerException("domain == null");
    }
}
