package o0O0OO0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
/* loaded from: classes.dex */
public class o00ooO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f11457o00oOOo0 = 1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f11458o00oOOoO = 2;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f11459o00oOo00 = 4;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f11460o00oOo0O = 7;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final byte[] f11461o00oOo0o = {112, 114, 111, 0};

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final byte[] f11462o00oOoO0 = {112, 114, 109, 0};

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f11463o00oOooO = 6;

    public static int o00oOOo0(@oo0oO0 o00oOOoO o00ooooo2) {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : o00ooooo2.f11432o00oOoOO.entrySet()) {
            i |= entry.getValue().intValue();
        }
        return i;
    }

    @oo0oO0
    public static byte[] o00oOOoO(@oo0oO0 o00oOOoO[] o00oooooArr, @oo0oO0 byte[] bArr) throws IOException {
        int i = 0;
        int i2 = 0;
        for (o00oOOoO o00ooooo2 : o00oooooArr) {
            i2 += o00oOoo0(o00ooooo2.f11431o00oOoO0) + (o00ooooo2.f11428o00oOo0O * 2) + o00oOo00.o00oOoo0(o00oOoOo(o00ooooo2.f11425o00oOOo0, o00ooooo2.f11426o00oOOoO, bArr)) + 16 + o00ooooo2.f11429o00oOo0o;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, o00ooO.f11450o00oOo00)) {
            int length = o00oooooArr.length;
            while (i < length) {
                o00oOOoO o00ooooo3 = o00oooooArr[i];
                o00ooOo(byteArrayOutputStream, o00ooooo3, o00oOoOo(o00ooooo3.f11425o00oOOo0, o00ooooo3.f11426o00oOOoO, bArr));
                o00ooOo0(byteArrayOutputStream, o00ooooo3);
                i++;
            }
        } else {
            for (o00oOOoO o00ooooo4 : o00oooooArr) {
                o00ooOo(byteArrayOutputStream, o00ooooo4, o00oOoOo(o00ooooo4.f11425o00oOOo0, o00ooooo4.f11426o00oOOoO, bArr));
            }
            int length2 = o00oooooArr.length;
            while (i < length2) {
                o00ooOo0(byteArrayOutputStream, o00oooooArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("The bytes saved do not match expectation. actual=");
        o00oOOo02.append(byteArrayOutputStream.size());
        o00oOOo02.append(" expected=");
        o00oOOo02.append(i2);
        throw new IllegalStateException(o00oOOo02.toString());
    }

    public static o0 o00oOo00(@oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < o00oooooArr.length; i2++) {
            try {
                o00oOOoO o00ooooo2 = o00oooooArr[i2];
                o00oOo00.o00oo0O0(byteArrayOutputStream, i2);
                o00oOo00.o00oo0O0(byteArrayOutputStream, o00ooooo2.f11428o00oOo0O);
                i = i + 2 + 2 + (o00ooooo2.f11428o00oOo0O * 2);
                o00ooOO0(byteArrayOutputStream, o00ooooo2);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            o0 o0Var = new o0(o00oOoO.CLASSES, i, byteArray, true);
            byteArrayOutputStream.close();
            return o0Var;
        }
        throw new IllegalStateException("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static byte[] o00oOo0O(@oo0oO0 o00oOOoO o00ooooo2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            o00ooOoO(byteArrayOutputStream, o00ooooo2);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] o00oOo0o(@oo0oO0 o00oOOoO o00ooooo2) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            o00ooOoo(byteArrayOutputStream, o00ooooo2);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @oo0oO0
    public static String o00oOoO(@oo0oO0 String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    @oo0oO0
    public static String o00oOoO0(@oo0oO0 String str, @oo0oO0 String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @o0OO00OO
    public static o00oOOoO o00oOoOO(@oo0oO0 o00oOOoO[] o00oooooArr, @oo0oO0 String str) {
        if (o00oooooArr.length <= 0) {
            return null;
        }
        String o00oOoO2 = o00oOoO(str);
        for (int i = 0; i < o00oooooArr.length; i++) {
            if (o00oooooArr[i].f11426o00oOOoO.equals(o00oOoO2)) {
                return o00oooooArr[i];
            }
        }
        return null;
    }

    @oo0oO0
    public static String o00oOoOo(@oo0oO0 String str, @oo0oO0 String str2, @oo0oO0 byte[] bArr) {
        String o00oOOo02 = o00ooO.o00oOOo0(bArr);
        if (str.length() <= 0) {
            return o00oOoO0(str2, o00oOOo02);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return o00oOoO0(str2, o00oOOo02);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0(str);
        o00oOOo03.append(o00ooO.o00oOOo0(bArr));
        o00oOOo03.append(str2);
        return o00oOOo03.toString();
    }

    public static int o00oOoo0(int i) {
        return o00ooO0(i * 2) / 8;
    }

    public static o0 o00oOooO(@oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        for (int i2 = 0; i2 < o00oooooArr.length; i2++) {
            try {
                o00oOOoO o00ooooo2 = o00oooooArr[i2];
                int o00oOOo02 = o00oOOo0(o00ooooo2);
                byte[] o00oOo0O2 = o00oOo0O(o00ooooo2);
                byte[] o00oOo0o2 = o00oOo0o(o00ooooo2);
                o00oOo00.o00oo0O0(byteArrayOutputStream, i2);
                int length = o00oOo0O2.length + 2 + o00oOo0o2.length;
                o00oOo00.o00oo0OO(byteArrayOutputStream, length, 4);
                o00oOo00.o00oo0O0(byteArrayOutputStream, o00oOOo02);
                byteArrayOutputStream.write(o00oOo0O2);
                byteArrayOutputStream.write(o00oOo0o2);
                i = i + 2 + 4 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i == byteArray.length) {
            o0 o0Var = new o0(o00oOoO.METHODS, i, byteArray, true);
            byteArrayOutputStream.close();
            return o0Var;
        }
        throw new IllegalStateException("Expected size " + i + ", does not match actual size " + byteArray.length);
    }

    public static int o00oOooo(int i, int i2, int i3) {
        if (i != 1) {
            if (i != 2) {
                if (i == 4) {
                    return i2 + i3;
                }
                throw new IllegalStateException(android.support.v4.media.o00oOOo0.o00oOOo0("Unexpected flag: ", i));
            }
            return i2;
        }
        throw new IllegalStateException("HOT methods are not stored in the bitmap");
    }

    @oo0oO0
    public static o00oOOoO[] o00oo(@oo0oO0 InputStream inputStream, @oo0oO0 byte[] bArr, @oo0oO0 String str) throws IOException {
        if (Arrays.equals(bArr, o00ooO.f11449o00oOOoO)) {
            int o00oOoOo2 = o00oOo00.o00oOoOo(inputStream);
            byte[] o00oOo0O2 = o00oOo00.o00oOo0O(inputStream, (int) o00oOo00.o00oOoO0(inputStream, 4), (int) o00oOo00.o00oOoO0(inputStream, 4));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(o00oOo0O2);
                try {
                    o00oOOoO[] o00ooO002 = o00ooO00(byteArrayInputStream, str, o00oOoOo2);
                    byteArrayInputStream.close();
                    return o00ooO002;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported version");
    }

    public static int o00oo0(@oo0oO0 BitSet bitSet, int i, int i2) {
        int i3 = bitSet.get(o00oOooo(2, i, i2)) ? 2 : 0;
        return bitSet.get(o00oOooo(4, i, i2)) ? i3 | 4 : i3;
    }

    public static int[] o00oo00O(@oo0oO0 InputStream inputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += o00oOo00.o00oOoO(inputStream);
            iArr[i3] = i2;
        }
        return iArr;
    }

    @oo0oO0
    public static o00oOOoO[] o00oo0O(@oo0oO0 InputStream inputStream, @oo0oO0 byte[] bArr, @oo0oO0 byte[] bArr2, o00oOOoO[] o00oooooArr) throws IOException {
        if (Arrays.equals(bArr, o00ooO.f11452o00oOo0o)) {
            if (Arrays.equals(o00ooO.f11448o00oOOo0, bArr2)) {
                throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return o00oo0Oo(inputStream, bArr, o00oooooArr);
        } else if (Arrays.equals(bArr, o00ooO.f11454o00oOoO0)) {
            return o00oo0o(inputStream, bArr2, o00oooooArr);
        } else {
            throw new IllegalStateException("Unsupported meta version");
        }
    }

    public static void o00oo0O0(@oo0oO0 InputStream inputStream, @oo0oO0 o00oOOoO o00ooooo2) throws IOException {
        int available = inputStream.available() - o00ooooo2.f11429o00oOo0o;
        int i = 0;
        while (inputStream.available() > available) {
            i += o00oOo00.o00oOoO(inputStream);
            o00ooooo2.f11432o00oOoOO.put(Integer.valueOf(i), 1);
            for (int o00oOoO2 = o00oOo00.o00oOoO(inputStream); o00oOoO2 > 0; o00oOoO2--) {
                o00ooO0o(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw new IllegalStateException("Read too much data during profile line parse");
        }
    }

    public static byte[] o00oo0OO(@oo0oO0 InputStream inputStream, @oo0oO0 byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, o00oOo00.o00oOooO(inputStream, bArr.length))) {
            return o00oOo00.o00oOooO(inputStream, o00ooO.f11449o00oOOoO.length);
        }
        throw new IllegalStateException("Invalid magic");
    }

    @oo0oO0
    public static o00oOOoO[] o00oo0Oo(@oo0oO0 InputStream inputStream, @oo0oO0 byte[] bArr, o00oOOoO[] o00oooooArr) throws IOException {
        if (Arrays.equals(bArr, o00ooO.f11452o00oOo0o)) {
            int o00oOoOo2 = o00oOo00.o00oOoOo(inputStream);
            byte[] o00oOo0O2 = o00oOo00.o00oOo0O(inputStream, (int) o00oOo00.o00oOoO0(inputStream, 4), (int) o00oOo00.o00oOoO0(inputStream, 4));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(o00oOo0O2);
                try {
                    o00oOOoO[] o00oo0o02 = o00oo0o0(byteArrayInputStream, o00oOoOo2, o00oooooArr);
                    byteArrayInputStream.close();
                    return o00oo0o02;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
    }

    @oo0oO0
    public static o00oOOoO[] o00oo0o(@oo0oO0 InputStream inputStream, @oo0oO0 byte[] bArr, o00oOOoO[] o00oooooArr) throws IOException {
        int o00oOoO2 = o00oOo00.o00oOoO(inputStream);
        byte[] o00oOo0O2 = o00oOo00.o00oOo0O(inputStream, (int) o00oOo00.o00oOoO0(inputStream, 4), (int) o00oOo00.o00oOoO0(inputStream, 4));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(o00oOo0O2);
            try {
                o00oOOoO[] o00oo0oO2 = o00oo0oO(byteArrayInputStream, bArr, o00oOoO2, o00oooooArr);
                byteArrayInputStream.close();
                return o00oo0oO2;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        throw new IllegalStateException("Content found after the end of file");
    }

    @oo0oO0
    public static o00oOOoO[] o00oo0o0(@oo0oO0 InputStream inputStream, int i, o00oOOoO[] o00oooooArr) throws IOException {
        if (inputStream.available() == 0) {
            return new o00oOOoO[0];
        }
        if (i == o00oooooArr.length) {
            String[] strArr = new String[i];
            int[] iArr = new int[i];
            for (int i2 = 0; i2 < i; i2++) {
                int o00oOoO2 = o00oOo00.o00oOoO(inputStream);
                iArr[i2] = o00oOo00.o00oOoO(inputStream);
                strArr[i2] = o00oOo00.o00oOo0o(inputStream, o00oOoO2);
            }
            for (int i3 = 0; i3 < i; i3++) {
                o00oOOoO o00ooooo2 = o00oooooArr[i3];
                if (!o00ooooo2.f11426o00oOOoO.equals(strArr[i3])) {
                    throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
                }
                int i4 = iArr[i3];
                o00ooooo2.f11428o00oOo0O = i4;
                o00ooooo2.f11430o00oOoO = o00oo00O(inputStream, i4);
            }
            return o00oooooArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    @oo0oO0
    public static o00oOOoO[] o00oo0oO(@oo0oO0 InputStream inputStream, @oo0oO0 byte[] bArr, int i, o00oOOoO[] o00oooooArr) throws IOException {
        if (inputStream.available() == 0) {
            return new o00oOOoO[0];
        }
        if (i == o00oooooArr.length) {
            for (int i2 = 0; i2 < i; i2++) {
                o00oOo00.o00oOoO(inputStream);
                String o00oOo0o2 = o00oOo00.o00oOo0o(inputStream, o00oOo00.o00oOoO(inputStream));
                long o00oOoO02 = o00oOo00.o00oOoO0(inputStream, 4);
                int o00oOoO2 = o00oOo00.o00oOoO(inputStream);
                o00oOOoO o00oOoOO2 = o00oOoOO(o00oooooArr, o00oOo0o2);
                if (o00oOoOO2 == null) {
                    throw new IllegalStateException(o00oOoOo.o00oo.o00oOOo0("Missing profile key: ", o00oOo0o2));
                }
                o00oOoOO2.f11433o00oOooO = o00oOoO02;
                int[] o00oo00O2 = o00oo00O(inputStream, o00oOoO2);
                if (Arrays.equals(bArr, o00ooO.f11451o00oOo0O)) {
                    o00oOoOO2.f11428o00oOo0O = o00oOoO2;
                    o00oOoOO2.f11430o00oOoO = o00oo00O2;
                }
            }
            return o00oooooArr;
        }
        throw new IllegalStateException("Mismatched number of dex files found in metadata");
    }

    public static boolean o00ooO(@oo0oO0 OutputStream outputStream, @oo0oO0 byte[] bArr, @oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        if (Arrays.equals(bArr, o00ooO.f11448o00oOOo0)) {
            o00oooOO(outputStream, o00oooooArr);
            return true;
        } else if (Arrays.equals(bArr, o00ooO.f11449o00oOOoO)) {
            o00ooo0o(outputStream, o00oooooArr);
            return true;
        } else if (Arrays.equals(bArr, o00ooO.f11456o00oOooO)) {
            o00ooo0(outputStream, o00oooooArr);
            return true;
        } else if (Arrays.equals(bArr, o00ooO.f11450o00oOo00)) {
            o00ooo0O(outputStream, o00oooooArr);
            return true;
        } else if (Arrays.equals(bArr, o00ooO.f11451o00oOo0O)) {
            o00ooo00(outputStream, o00oooooArr);
            return true;
        } else {
            return false;
        }
    }

    public static int o00ooO0(int i) {
        return ((i + 8) - 1) & (-8);
    }

    @oo0oO0
    public static o00oOOoO[] o00ooO00(@oo0oO0 InputStream inputStream, @oo0oO0 String str, int i) throws IOException {
        if (inputStream.available() == 0) {
            return new o00oOOoO[0];
        }
        o00oOOoO[] o00oooooArr = new o00oOOoO[i];
        for (int i2 = 0; i2 < i; i2++) {
            int o00oOoO2 = o00oOo00.o00oOoO(inputStream);
            int o00oOoO3 = o00oOo00.o00oOoO(inputStream);
            o00oooooArr[i2] = new o00oOOoO(str, o00oOo00.o00oOo0o(inputStream, o00oOoO2), o00oOo00.o00oOoO0(inputStream, 4), 0L, o00oOoO3, (int) o00oOo00.o00oOoO0(inputStream, 4), (int) o00oOo00.o00oOoO0(inputStream, 4), new int[o00oOoO3], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            o00oOOoO o00ooooo2 = o00oooooArr[i3];
            o00oo0O0(inputStream, o00ooooo2);
            o00ooooo2.f11430o00oOoO = o00oo00O(inputStream, o00ooooo2.f11428o00oOo0O);
            o0O0o(inputStream, o00ooooo2);
        }
        return o00oooooArr;
    }

    public static void o00ooO0O(@oo0oO0 byte[] bArr, int i, int i2, @oo0oO0 o00oOOoO o00ooooo2) {
        int o00oOooo2 = o00oOooo(i, i2, o00ooooo2.f11431o00oOoO0);
        int i3 = o00oOooo2 / 8;
        bArr[i3] = (byte) ((1 << (o00oOooo2 % 8)) | bArr[i3]);
    }

    public static void o00ooO0o(@oo0oO0 InputStream inputStream) throws IOException {
        o00oOo00.o00oOoO(inputStream);
        int o00oOoOo2 = o00oOo00.o00oOoOo(inputStream);
        if (o00oOoOo2 == 6 || o00oOoOo2 == 7) {
            return;
        }
        while (o00oOoOo2 > 0) {
            o00oOo00.o00oOoOo(inputStream);
            for (int o00oOoOo3 = o00oOo00.o00oOoOo(inputStream); o00oOoOo3 > 0; o00oOoOo3--) {
                o00oOo00.o00oOoO(inputStream);
            }
            o00oOoOo2--;
        }
    }

    public static o0 o00ooOO(@oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            o00oOo00.o00oo0O0(byteArrayOutputStream, o00oooooArr.length);
            int i = 2;
            for (o00oOOoO o00ooooo2 : o00oooooArr) {
                o00oOo00.o00oo0OO(byteArrayOutputStream, o00ooooo2.f11427o00oOo00, 4);
                o00oOo00.o00oo0OO(byteArrayOutputStream, o00ooooo2.f11433o00oOooO, 4);
                o00oOo00.o00oo0OO(byteArrayOutputStream, o00ooooo2.f11431o00oOoO0, 4);
                String o00oOoOo2 = o00oOoOo(o00ooooo2.f11425o00oOOo0, o00ooooo2.f11426o00oOOoO, o00ooO.f11448o00oOOo0);
                int o00oOoo02 = o00oOo00.o00oOoo0(o00oOoOo2);
                o00oOo00.o00oo0O0(byteArrayOutputStream, o00oOoo02);
                i = i + 4 + 4 + 4 + 2 + (o00oOoo02 * 1);
                o00oOo00.o00oo0(byteArrayOutputStream, o00oOoOo2);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i == byteArray.length) {
                o0 o0Var = new o0(o00oOoO.DEX_FILES, i, byteArray, false);
                byteArrayOutputStream.close();
                return o0Var;
            }
            throw new IllegalStateException("Expected size " + i + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void o00ooOO0(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO o00ooooo2) throws IOException {
        int i = 0;
        for (int i2 : o00ooooo2.f11430o00oOoO) {
            Integer valueOf = Integer.valueOf(i2);
            o00oOo00.o00oo0O0(outputStream, valueOf.intValue() - i);
            i = valueOf.intValue();
        }
    }

    public static void o00ooOOo(@oo0oO0 OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f11461o00oOo0o);
        outputStream.write(bArr);
    }

    public static void o00ooOo(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO o00ooooo2, @oo0oO0 String str) throws IOException {
        o00oOo00.o00oo0O0(outputStream, o00oOo00.o00oOoo0(str));
        o00oOo00.o00oo0O0(outputStream, o00ooooo2.f11428o00oOo0O);
        o00oOo00.o00oo0OO(outputStream, o00ooooo2.f11429o00oOo0o, 4);
        o00oOo00.o00oo0OO(outputStream, o00ooooo2.f11427o00oOo00, 4);
        o00oOo00.o00oo0OO(outputStream, o00ooooo2.f11431o00oOoO0, 4);
        o00oOo00.o00oo0(outputStream, str);
    }

    public static void o00ooOo0(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO o00ooooo2) throws IOException {
        o00ooOoo(outputStream, o00ooooo2);
        o00ooOO0(outputStream, o00ooooo2);
        o00ooOoO(outputStream, o00ooooo2);
    }

    public static void o00ooOoO(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO o00ooooo2) throws IOException {
        byte[] bArr = new byte[o00oOoo0(o00ooooo2.f11431o00oOoO0)];
        for (Map.Entry<Integer, Integer> entry : o00ooooo2.f11432o00oOoOO.entrySet()) {
            int intValue = entry.getKey().intValue();
            int intValue2 = entry.getValue().intValue();
            if ((intValue2 & 2) != 0) {
                o00ooO0O(bArr, 2, intValue, o00ooooo2);
            }
            if ((intValue2 & 4) != 0) {
                o00ooO0O(bArr, 4, intValue, o00ooooo2);
            }
        }
        outputStream.write(bArr);
    }

    public static void o00ooOoo(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO o00ooooo2) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : o00ooooo2.f11432o00oOoOO.entrySet()) {
            int intValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                o00oOo00.o00oo0O0(outputStream, intValue - i);
                o00oOo00.o00oo0O0(outputStream, 0);
                i = intValue;
            }
        }
    }

    public static void o00ooo0(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        o00oOo00.o00oo0Oo(outputStream, o00oooooArr.length);
        for (o00oOOoO o00ooooo2 : o00oooooArr) {
            String o00oOoOo2 = o00oOoOo(o00ooooo2.f11425o00oOOo0, o00ooooo2.f11426o00oOOoO, o00ooO.f11456o00oOooO);
            o00oOo00.o00oo0O0(outputStream, o00oOo00.o00oOoo0(o00oOoOo2));
            o00oOo00.o00oo0O0(outputStream, o00ooooo2.f11430o00oOoO.length);
            o00oOo00.o00oo0OO(outputStream, o00ooooo2.f11432o00oOoOO.size() * 4, 4);
            o00oOo00.o00oo0OO(outputStream, o00ooooo2.f11427o00oOo00, 4);
            o00oOo00.o00oo0(outputStream, o00oOoOo2);
            for (Integer num : o00ooooo2.f11432o00oOoOO.keySet()) {
                o00oOo00.o00oo0O0(outputStream, num.intValue());
                o00oOo00.o00oo0O0(outputStream, 0);
            }
            for (int i : o00ooooo2.f11430o00oOoO) {
                o00oOo00.o00oo0O0(outputStream, i);
            }
        }
    }

    public static void o00ooo00(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        o00oOo00.o00oo0O0(outputStream, o00oooooArr.length);
        for (o00oOOoO o00ooooo2 : o00oooooArr) {
            String o00oOoOo2 = o00oOoOo(o00ooooo2.f11425o00oOOo0, o00ooooo2.f11426o00oOOoO, o00ooO.f11451o00oOo0O);
            o00oOo00.o00oo0O0(outputStream, o00oOo00.o00oOoo0(o00oOoOo2));
            o00oOo00.o00oo0O0(outputStream, o00ooooo2.f11432o00oOoOO.size());
            o00oOo00.o00oo0O0(outputStream, o00ooooo2.f11430o00oOoO.length);
            o00oOo00.o00oo0OO(outputStream, o00ooooo2.f11427o00oOo00, 4);
            o00oOo00.o00oo0(outputStream, o00oOoOo2);
            for (Integer num : o00ooooo2.f11432o00oOoOO.keySet()) {
                o00oOo00.o00oo0O0(outputStream, num.intValue());
            }
            for (int i : o00ooooo2.f11430o00oOoO) {
                o00oOo00.o00oo0O0(outputStream, i);
            }
        }
    }

    public static void o00ooo0O(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        byte[] o00oOOoO2 = o00oOOoO(o00oooooArr, o00ooO.f11450o00oOo00);
        o00oOo00.o00oo0Oo(outputStream, o00oooooArr.length);
        o00oOo00.o00oo00O(outputStream, o00oOOoO2);
    }

    public static void o00ooo0o(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        byte[] o00oOOoO2 = o00oOOoO(o00oooooArr, o00ooO.f11449o00oOOoO);
        o00oOo00.o00oo0Oo(outputStream, o00oooooArr.length);
        o00oOo00.o00oo00O(outputStream, o00oOOoO2);
    }

    public static void o00oooO(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        o00oooOO(outputStream, o00oooooArr);
    }

    public static void o00oooOO(@oo0oO0 OutputStream outputStream, @oo0oO0 o00oOOoO[] o00oooooArr) throws IOException {
        int length;
        byte[] bArr;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(o00ooOO(o00oooooArr));
        arrayList.add(o00oOo00(o00oooooArr));
        arrayList.add(o00oOooO(o00oooooArr));
        long length2 = o00ooO.f11448o00oOOo0.length + f11461o00oOo0o.length + 4 + (arrayList.size() * 16);
        o00oOo00.o00oo0OO(outputStream, arrayList.size(), 4);
        for (int i = 0; i < arrayList.size(); i++) {
            o0 o0Var = (o0) arrayList.get(i);
            o00oOo00.o00oo0OO(outputStream, o0Var.f11418o00oOOo0.getValue(), 4);
            o00oOo00.o00oo0OO(outputStream, length2, 4);
            if (o0Var.f11421o00oOooO) {
                byte[] o00oOOoO2 = o00oOo00.o00oOOoO(o0Var.f11420o00oOo00);
                arrayList2.add(o00oOOoO2);
                o00oOo00.o00oo0OO(outputStream, o00oOOoO2.length, 4);
                o00oOo00.o00oo0OO(outputStream, bArr.length, 4);
                length = o00oOOoO2.length;
            } else {
                arrayList2.add(o0Var.f11420o00oOo00);
                o00oOo00.o00oo0OO(outputStream, o0Var.f11420o00oOo00.length, 4);
                o00oOo00.o00oo0OO(outputStream, 0L, 4);
                length = o0Var.f11420o00oOo00.length;
            }
            length2 += length;
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            outputStream.write((byte[]) arrayList2.get(i2));
        }
    }

    public static void o0O0o(@oo0oO0 InputStream inputStream, @oo0oO0 o00oOOoO o00ooooo2) throws IOException {
        BitSet valueOf = BitSet.valueOf(o00oOo00.o00oOooO(inputStream, o00oOo00.o00oOOo0(o00ooooo2.f11431o00oOoO0 * 2)));
        int i = 0;
        while (true) {
            int i2 = o00ooooo2.f11431o00oOoO0;
            if (i >= i2) {
                return;
            }
            int o00oo02 = o00oo0(valueOf, i, i2);
            if (o00oo02 != 0) {
                Integer num = o00ooooo2.f11432o00oOoOO.get(Integer.valueOf(i));
                if (num == null) {
                    num = 0;
                }
                o00ooooo2.f11432o00oOoOO.put(Integer.valueOf(i), Integer.valueOf(o00oo02 | num.intValue()));
            }
            i++;
        }
    }
}
