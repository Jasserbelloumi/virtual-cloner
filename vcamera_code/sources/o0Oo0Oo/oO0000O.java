package o0Oo0Oo;

import android.support.v4.media.o00oOo0O;
import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o0Oo.o00ooO;
import o0Oo.o0O00000;
import o0Oo.o0O0000O;
import o0Oo.o0O0O0Oo;
import o0Oo.o0O0O0o0;
import o0Oo0Oo0.o0O0o00O;
import o0Oo0Oo0.o0OO00OO;
import o0Oo0Oo0.oo0oO0;
/* loaded from: classes3.dex */
public final class oO0000O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final byte[] f15750o00oOOo0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o0OO00OO f15752o00oOo00;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final oo0oO0 f15760o00oOooO;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String[] f15751o00oOOoO = new String[0];

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o0O0000O f15753o00oOo0O = o0O0000O.decodeHex("efbbbf");

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final o0O0000O f15754o00oOo0o = o0O0000O.decodeHex("feff");

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final o0O0000O f15756o00oOoO0 = o0O0000O.decodeHex("fffe");

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final o0O0000O f15755o00oOoO = o0O0000O.decodeHex("0000ffff");

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final o0O0000O f15757o00oOoOO = o0O0000O.decodeHex("ffff0000");

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final Charset f15758o00oOoOo = Charset.forName(C.UTF8_NAME);

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final Charset f15759o00oOoo0 = Charset.forName("UTF-16BE");

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final Charset f15761o00oOooo = Charset.forName(C.UTF16LE_NAME);

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final Charset f15763o00oo00O = Charset.forName("UTF-32BE");

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final Charset f15762o00oo0 = Charset.forName("UTF-32LE");

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final TimeZone f15766o00oo0OO = TimeZone.getTimeZone("GMT");

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final Comparator<String> f15765o00oo0O0 = new o00oOOo0();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final Pattern f15764o00oo0O = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Comparator<String> {
        @Override // java.util.Comparator
        public int compare(String str, String str2) {
            return str.compareTo(str2);
        }

        public int o00oOOo0(String str, String str2) {
            return str.compareTo(str2);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements ThreadFactory {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ String f15767o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ boolean f15768o00oOOoO;

        public o00oOOoO(String str, boolean z) {
            this.f15767o00oOOo0 = str;
            this.f15768o00oOOoO = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f15767o00oOOo0);
            thread.setDaemon(this.f15768o00oOOoO);
            return thread;
        }
    }

    static {
        byte[] bArr = new byte[0];
        f15750o00oOOo0 = bArr;
        f15752o00oOo00 = o0OO00OO.o00oo0(null, bArr);
        f15760o00oOooO = oo0oO0.o00oOo0o(null, bArr);
    }

    public static Charset o00oOOo0(o0O00000 o0o00000, Charset charset) throws IOException {
        o0O0000O o0o0000o = f15753o00oOo0O;
        if (o0o00000.o0O0o00O(0L, o0o0000o)) {
            o0o00000.skip(o0o0000o.size());
            return f15758o00oOoOo;
        }
        o0O0000O o0o0000o2 = f15754o00oOo0o;
        if (o0o00000.o0O0o00O(0L, o0o0000o2)) {
            o0o00000.skip(o0o0000o2.size());
            return f15759o00oOoo0;
        }
        o0O0000O o0o0000o3 = f15756o00oOoO0;
        if (o0o00000.o0O0o00O(0L, o0o0000o3)) {
            o0o00000.skip(o0o0000o3.size());
            return f15761o00oOooo;
        }
        o0O0000O o0o0000o4 = f15755o00oOoO;
        if (o0o00000.o0O0o00O(0L, o0o0000o4)) {
            o0o00000.skip(o0o0000o4.size());
            return f15763o00oo00O;
        }
        o0O0000O o0o0000o5 = f15757o00oOoOO;
        if (o0o00000.o0O0o00O(0L, o0o0000o5)) {
            o0o00000.skip(o0o0000o5.size());
            return f15762o00oo0;
        }
        return charset;
    }

    public static void o00oOOoO(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void o00oOo00(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static void o00oOo0O(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!o00oo0o(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static String[] o00oOo0o(String[] strArr, String str) {
        int length = strArr.length + 1;
        String[] strArr2 = new String[length];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[length - 1] = str;
        return strArr2;
    }

    public static int o00oOoO(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean o00oOoO0(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    public static int o00oOoOO(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean o00oOoOo(o0O0O0Oo o0o0o0oo, int i, TimeUnit timeUnit) {
        try {
            return o0O0o(o0o0o0oo, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static String o00oOoo0(String str) {
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (lowerCase.isEmpty()) {
                return null;
            }
            if (o00oOoO0(lowerCase)) {
                return null;
            }
            return lowerCase;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static void o00oOooO(ServerSocket serverSocket) {
        if (serverSocket != null) {
            try {
                serverSocket.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean o00oOooo(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int o00oo(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static String o00oo0(o0O0o00O o0o0o00o, boolean z) {
        String o00oOOo02 = o0o0o00o.f15897o00oOooO.contains(":") ? android.support.v4.media.o00oOOoO.o00oOOo0(o00oOo0O.o00oOOo0("["), o0o0o00o.f15897o00oOooO, "]") : o0o0o00o.f15897o00oOooO;
        if (z || o0o0o00o.f15892o00oOo0O != o0O0o00O.o00oOo0O(o0o0o00o.f15889o00oOOo0)) {
            StringBuilder o00oOOo03 = androidx.appcompat.widget.o00oOo0O.o00oOOo0(o00oOOo02, ":");
            o00oOOo03.append(o0o0o00o.f15892o00oOo0O);
            return o00oOOo03.toString();
        }
        return o00oOOo02;
    }

    public static String o00oo00O(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static int o00oo0O(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static <T> List<T> o00oo0O0(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <T> List<T> o00oo0OO(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static int o00oo0Oo(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    public static boolean o00oo0o(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static String[] o00oo0o0(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean o00oo0oO(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean o00ooO(String str) {
        return f15764o00oo0O.matcher(str).matches();
    }

    public static ThreadFactory o00ooO0(String str, boolean z) {
        return new o00oOOoO(str, z);
    }

    public static int o00ooO00(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static String o00ooO0O(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                o00ooO o00ooo = new o00ooO();
                o00ooo.o0O00000(str, 0, i);
                while (i < length) {
                    int codePointAt2 = str.codePointAt(i);
                    o00ooo.o00oo0o0((codePointAt2 <= 31 || codePointAt2 >= 127) ? 63 : codePointAt2);
                    i += Character.charCount(codePointAt2);
                }
                return o00ooo.o0O0o0o0();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    public static String o00ooO0o(String str, int i, int i2) {
        int o00oo2 = o00oo(str, i, i2);
        return str.substring(o00oo2, o00ooO00(str, o00oo2, i2));
    }

    public static boolean o0O0o(o0O0O0Oo o0o0o0oo, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long o00oOooO2 = o0o0o0oo.o00oOooO().o00oOo0o() ? o0o0o0oo.o00oOooO().o00oOooO() - nanoTime : Long.MAX_VALUE;
        o0o0o0oo.o00oOooO().o00oOo0O(Math.min(o00oOooO2, timeUnit.toNanos(i)) + nanoTime);
        try {
            o00ooO o00ooo = new o00ooO();
            while (o0o0o0oo.o0O0o000(o00ooo, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                o00ooo.o00oOOoO();
            }
            int i2 = (o00oOooO2 > Long.MAX_VALUE ? 1 : (o00oOooO2 == Long.MAX_VALUE ? 0 : -1));
            o0O0O0o0 o00oOooO3 = o0o0o0oo.o00oOooO();
            if (i2 == 0) {
                o00oOooO3.o00oOOo0();
            } else {
                o00oOooO3.o00oOo0O(nanoTime + o00oOooO2);
            }
            return true;
        } catch (InterruptedIOException unused) {
            int i3 = (o00oOooO2 > Long.MAX_VALUE ? 1 : (o00oOooO2 == Long.MAX_VALUE ? 0 : -1));
            o0O0O0o0 o00oOooO4 = o0o0o0oo.o00oOooO();
            if (i3 == 0) {
                o00oOooO4.o00oOOo0();
            } else {
                o00oOooO4.o00oOo0O(nanoTime + o00oOooO2);
            }
            return false;
        } catch (Throwable th) {
            int i4 = (o00oOooO2 > Long.MAX_VALUE ? 1 : (o00oOooO2 == Long.MAX_VALUE ? 0 : -1));
            o0O0O0o0 o00oOooO5 = o0o0o0oo.o00oOooO();
            if (i4 == 0) {
                o00oOooO5.o00oOOo0();
            } else {
                o00oOooO5.o00oOo0O(nanoTime + o00oOooO2);
            }
            throw th;
        }
    }
}
