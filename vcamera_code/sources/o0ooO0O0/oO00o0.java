package o0ooO0O0;

import android.os.Process;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class oO00o0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final Map<File, oO00o0> f17053o00oOOoO = new HashMap();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Set<String> f17054o00oOOo0 = new HashSet();

    public oO00o0(File file) {
        ZipFile zipFile;
        Set<String> set;
        String o00oOOo02;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                String name = entries.nextElement().getName();
                if (name.startsWith(o00oo.o00oOOo0(new byte[]{-120, 41, 96, -125, 51, 38, 71, -56, -48, 109, 116, -108, 51}, new byte[]{-28, SignedBytes.MAX_POWER_OF_TWO, 2, -84, 82, 84, 42, -2}))) {
                    set = this.f17054o00oOOo0;
                    o00oOOo02 = o00oo.o00oOOo0(new byte[]{-70, -109, 67, 86, -67, -119, -91, -78, -70}, new byte[]{-37, -31, 46, 96, -119, -92, -45, -118});
                } else if (name.startsWith(o00oo.o00oOOo0(new byte[]{-14, -118, Ascii.CAN, 82, -111, -74, -123, -104, -1, -127, 19}, new byte[]{-98, -29, 122, 125, -16, -60, -24, -3}))) {
                    set = this.f17054o00oOOo0;
                    o00oOOo02 = o00oo.o00oOOo0(new byte[]{-108, 45, 107, 82, -107, -39, 122}, new byte[]{-11, 95, 6, 55, -12, -69, 19, 72});
                } else if (name.startsWith(o00oo.o00oOOo0(new byte[]{-94, -11, -85, 79, 56, 99, 100, -4, -81, -2, -96, 77, 47, 38, 104}, new byte[]{-50, -100, -55, 96, 89, 17, 9, -103}))) {
                    set = this.f17054o00oOOo0;
                    o00oOOo02 = o00oo.o00oOOo0(new byte[]{-45, -76, 54, -31, 0, 125, 89, -65, -60, -15, 58}, new byte[]{-78, -58, 91, -124, 97, Ascii.US, 48, -110});
                }
                set.add(o00oOOo02);
            }
            o00oOOo0(zipFile);
        } catch (Exception e2) {
            e = e2;
            zipFile2 = zipFile;
            e.printStackTrace();
            o00oOOo0(zipFile2);
        } catch (Throwable th2) {
            th = th2;
            zipFile2 = zipFile;
            o00oOOo0(zipFile2);
            throw th;
        }
    }

    public static void o00oOOo0(Closeable... closeableArr) {
        if (closeableArr == null) {
            return;
        }
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    public static boolean o00oOo0O(File file) {
        Map<File, oO00o0> map = f17053o00oOOoO;
        oO00o0 oo00o0 = map.get(file);
        if (oo00o0 == null) {
            oo00o0 = new oO00o0(file);
            map.put(file, oo00o0);
        }
        if (oo00o0.o00oOooO()) {
            return true;
        }
        return Process.is64Bit() ? oo00o0.o00oOo00() : oo00o0.o00oOOoO();
    }

    public boolean o00oOOoO() {
        return this.f17054o00oOOo0.contains(o00oo.o00oOOo0(new byte[]{37, 87, Ascii.ESC, -99, -114, -45, -107}, new byte[]{68, 37, 118, -8, -17, -79, -4, Byte.MIN_VALUE})) || this.f17054o00oOOo0.contains(o00oo.o00oOOo0(new byte[]{41, -104, -4, -4, -107, Ascii.CR, -32, 3, 62, -35, -16}, new byte[]{72, -22, -111, -103, -12, 111, -119, 46}));
    }

    public boolean o00oOo00() {
        return this.f17054o00oOOo0.contains(o00oo.o00oOOo0(new byte[]{103, -72, Byte.MIN_VALUE, 38, 7, -43, -13, -73, 103}, new byte[]{6, -54, -19, Ascii.DLE, 51, -8, -123, -113}));
    }

    public boolean o00oOooO() {
        return this.f17054o00oOOo0.isEmpty();
    }
}
