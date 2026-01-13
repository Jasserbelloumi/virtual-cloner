package o0OOooo0;

import android.content.pm.ApplicationInfo;
import com.google.common.base.Ascii;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.IXposedMod;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Objects;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0Oo0oo0.o0OO0o00;
/* loaded from: classes3.dex */
public final class oO0OOO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f15416o00oOOo0 = o00oo.o00oOOo0(new byte[]{7, -110, 6, -56, 119}, new byte[]{54, -93, 55, -7, 70, 68, 59, 122});

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static boolean f15417o00oOOoO = false;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static boolean f15418o00oOo00 = false;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final XposedBridge.CopyOnWriteSortedSet<XC_LoadPackage> f15419o00oOo0O = new XposedBridge.CopyOnWriteSortedSet<>();

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static o00oOOo0 f15420o00oOooO;

    /* loaded from: classes3.dex */
    public interface o00oOOo0 {
        void o00oOOo0(IXposedMod iXposedMod);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x02c2, code lost:
        if (((o0OOooo0.oO0OO0O) r26).findClass(de.robv.android.xposed.XposedBridge.class.getName()) != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x02d4, code lost:
        if (r26.loadClass(de.robv.android.xposed.XposedBridge.class.getName()) != de.robv.android.xposed.XposedBridge.class) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0316 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean o00oOOo0(java.lang.ClassLoader r26) {
        /*
            Method dump skipped, instructions count: 1062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOooo0.oO0OOO0.o00oOOo0(java.lang.ClassLoader):boolean");
    }

    public static void o00oOOoO(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static o00oOOo0 o00oOo00() {
        return f15420o00oOooO;
    }

    public static void o00oOo0O(File file) {
        o00oOo0o(file, false);
    }

    public static void o00oOo0o(File file, boolean z) {
        if (file.exists()) {
            ClassLoader classLoader = oO0OOO0.class.getClassLoader();
            String absolutePath = file.getAbsolutePath();
            o00oOoO(absolutePath, new oO0OO0O(absolutePath, classLoader), z);
            return;
        }
        o00oo.o00oOOo0(new byte[]{-24, 87, -63, -2, -8, -19, 84}, new byte[]{-56, 119, -121, -105, -108, -120, 116, -3});
        file.toString();
        o00oo.o00oOOo0(new byte[]{62, Byte.MIN_VALUE, -60, 104, -125, -120, -105, -28, 106, -60, -50, 117, -103, -37, -115}, new byte[]{Ascii.RS, -28, -85, Ascii.CR, -16, -88, -7, -117});
    }

    public static void o00oOoO(String str, ClassLoader classLoader, boolean z) {
        InputStream resourceAsStream;
        Class<?> loadClass;
        if (o00oOOo0(classLoader)) {
            try {
                byte b = 9;
                char c = '\n';
                o00oo.o00oOOo0(new byte[]{Ascii.ETB, -50, -52, -37, 62, 96, 96, -2, 6, -46, -52, -37, 46, 76, 38, -24, Ascii.US, -55}, new byte[]{118, -67, -65, -66, 74, 19, 79, -122});
                if (classLoader instanceof oO0OO0O) {
                    URL findResource = ((oO0OO0O) classLoader).findResource(o00oo.o00oOOo0(new byte[]{-97, -123, 56, 39, -60, 90, 72, 45, -114, -103, 56, 39, -44, 118, Ascii.SO, 59, -105, -126}, new byte[]{-2, -10, 75, 66, -80, 41, 103, 85}));
                    resourceAsStream = findResource != null ? findResource.openStream() : null;
                } else {
                    resourceAsStream = classLoader.getResourceAsStream(o00oo.o00oOOo0(new byte[]{83, -125, -36, -44, 70, 124, -11, -22, 66, -97, -36, -44, 86, 80, -77, -4, 91, -124}, new byte[]{50, -16, -81, -79, 50, Ascii.SI, -38, -110}));
                }
                if (resourceAsStream == null) {
                    o00oo.o00oOOo0(new byte[]{-67, -66, 83, -46, -90, 91, -76, 116, -67, -22, 122, -109, -93, 88, -80, 116, -67, -13, 122, -41, -70, 91, -76, 48}, new byte[]{-99, -98, Ascii.NAK, -77, -49, 55, -47, Ascii.DLE});
                    o00oo.o00oOOo0(new byte[]{-106, -85, -27, 88, -111, 44, 104, 34, -103, -13, -12, 68, -111, 44, 120, Ascii.SO, -33, -27, -19, 95, -62, 39, 115, 37, -106, -19, -21, 94, -116, 45, 60, 56, -40, -85, -16, 67, -121, 105, 113, 62, -46, -2, -24, 78, -62, 8, 76, Ascii.SUB}, new byte[]{-74, -117, -124, 43, -30, 73, Ascii.FS, 81});
                    return;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream));
                while (true) {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String trim = readLine.trim();
                            if (!trim.isEmpty()) {
                                if (!trim.startsWith(o00oo.o00oOOo0(new byte[]{-127}, new byte[]{-94, 91, -82, 99, 112, Ascii.SI, 78, 85}))) {
                                    try {
                                        loadClass = classLoader.loadClass(trim);
                                    } catch (Throwable unused) {
                                    }
                                    if (IXposedMod.class.isAssignableFrom(loadClass)) {
                                        IXposedHookZygoteInit iXposedHookZygoteInit = (IXposedMod) loadClass.newInstance();
                                        byte[] bArr = new byte[b];
                                        bArr[0] = 5;
                                        bArr[1] = Ascii.ETB;
                                        bArr[2] = -76;
                                        bArr[3] = -5;
                                        bArr[4] = 7;
                                        bArr[5] = -106;
                                        bArr[6] = 111;
                                        bArr[7] = -95;
                                        bArr[8] = 92;
                                        o00oo.o00oOOo0(bArr, new byte[]{102, 118, -40, -105, 101, -9, Ascii.FF, -54});
                                        Objects.toString(iXposedHookZygoteInit);
                                        if ((iXposedHookZygoteInit instanceof IXposedHookZygoteInit) && !f15418o00oOo00) {
                                            IXposedHookZygoteInit.StartupParam startupParam = new IXposedHookZygoteInit.StartupParam();
                                            try {
                                                startupParam.modulePath = str;
                                            } catch (Throwable unused2) {
                                                o00oo.o00oOOo0(new byte[]{53, 53, -114, 4, 58, -26, -45, -107, 112, 113, -114, 80, 19, -89, -42, -106, 116, 113, -114, 71, Ascii.DLE, -26, -55, -118, 53}, new byte[]{Ascii.NAK, Ascii.NAK, -82, 36, 124, -121, -70, -7});
                                                o00oo.o00oOOo0(new byte[]{113, 67, -101, -19, -88, 126, -23, 38, 53, 80, -123, -25, -27}, new byte[]{81, 37, -23, -126, -59, 94, -124, 73});
                                                o00oo.o00oOOo0(new byte[]{-3, 101}, new byte[]{-35, 95, -31, 65, -110, Ascii.VT, Ascii.SYN, 119});
                                                b = 9;
                                                c = '\n';
                                            }
                                            try {
                                                startupParam.startsSystemServer = z;
                                                iXposedHookZygoteInit.initZygote(startupParam);
                                            } catch (Throwable unused3) {
                                                o00oo.o00oOOo0(new byte[]{53, 53, -114, 4, 58, -26, -45, -107, 112, 113, -114, 80, 19, -89, -42, -106, 116, 113, -114, 71, Ascii.DLE, -26, -55, -118, 53}, new byte[]{Ascii.NAK, Ascii.NAK, -82, 36, 124, -121, -70, -7});
                                                o00oo.o00oOOo0(new byte[]{113, 67, -101, -19, -88, 126, -23, 38, 53, 80, -123, -25, -27}, new byte[]{81, 37, -23, -126, -59, 94, -124, 73});
                                                o00oo.o00oOOo0(new byte[]{-3, 101}, new byte[]{-35, 95, -31, 65, -110, Ascii.VT, Ascii.SYN, 119});
                                                b = 9;
                                                c = '\n';
                                            }
                                        }
                                        if (iXposedHookZygoteInit instanceof IXposedHookLoadPackage) {
                                            o00oOooO((IXposedHookLoadPackage) iXposedHookZygoteInit);
                                            o00oo.o00oOOo0(new byte[]{-75, -118, 110, 39, 48, -76, oo0OOoo.f13516o00oOoO, -78, -115, -124, 98, 39, Ascii.GS, -68, 57, -20}, new byte[]{-35, -27, 1, 76, 124, -37, 92, -42});
                                            Objects.toString(iXposedHookZygoteInit);
                                        }
                                        o00oOOo0 o00oooo02 = f15420o00oOooO;
                                        if (o00oooo02 != null) {
                                            o00oooo02.o00oOOo0(iXposedHookZygoteInit);
                                        }
                                        b = 9;
                                    } else {
                                        byte[] bArr2 = new byte[31];
                                        bArr2[0] = 100;
                                        bArr2[1] = -67;
                                        bArr2[2] = -92;
                                        bArr2[3] = o0OO0o00.f16655o00oOoOO;
                                        bArr2[4] = 56;
                                        bArr2[5] = -57;
                                        bArr2[6] = 56;
                                        bArr2[7] = o0OO0o00.f16655o00oOoOO;
                                        bArr2[8] = 43;
                                        bArr2[b] = -23;
                                        bArr2[c] = -92;
                                        bArr2[11] = 109;
                                        bArr2[12] = Ascii.DC4;
                                        bArr2[13] = -57;
                                        bArr2[14] = 50;
                                        bArr2[15] = 111;
                                        bArr2[16] = 39;
                                        bArr2[17] = -4;
                                        bArr2[18] = -24;
                                        bArr2[19] = 109;
                                        bArr2[20] = Ascii.EM;
                                        bArr2[21] = -57;
                                        bArr2[22] = 53;
                                        bArr2[23] = 36;
                                        bArr2[24] = 100;
                                        bArr2[25] = -2;
                                        bArr2[26] = -24;
                                        bArr2[27] = 96;
                                        bArr2[28] = 8;
                                        bArr2[29] = -43;
                                        bArr2[30] = 118;
                                        o00oo.o00oOOo0(bArr2, new byte[]{68, -99, -124, 1, 123, -90, 86, 79});
                                        byte[] bArr3 = new byte[11];
                                        bArr3[0] = -37;
                                        bArr3[1] = -21;
                                        bArr3[2] = Byte.MIN_VALUE;
                                        bArr3[3] = -28;
                                        bArr3[4] = 112;
                                        bArr3[5] = 112;
                                        bArr3[6] = 121;
                                        bArr3[7] = 100;
                                        bArr3[8] = -105;
                                        bArr3[b] = -25;
                                        bArr3[c] = -50;
                                        o00oo.o00oOOo0(bArr3, new byte[]{-5, -126, -18, -60, Ascii.GS, Ascii.US, Ascii.GS, 17});
                                        o00oo.o00oOOo0(new byte[]{118, -123}, new byte[]{86, -65, -109, -8, -115, 3, -102, -54});
                                        byte[] bArr4 = new byte[77];
                                        bArr4[0] = -37;
                                        bArr4[1] = 76;
                                        bArr4[2] = oo0OOoo.f13516o00oOoO;
                                        bArr4[3] = 86;
                                        bArr4[4] = Ascii.FF;
                                        bArr4[5] = -66;
                                        bArr4[6] = -123;
                                        bArr4[7] = -111;
                                        bArr4[8] = -37;
                                        bArr4[b] = Ascii.SI;
                                        bArr4[c] = 113;
                                        bArr4[11] = Ascii.ETB;
                                        bArr4[12] = 43;
                                        bArr4[13] = -91;
                                        bArr4[14] = -52;
                                        bArr4[15] = -122;
                                        bArr4[16] = -108;
                                        bArr4[17] = b;
                                        bArr4[18] = 110;
                                        bArr4[19] = Ascii.CAN;
                                        bArr4[20] = Byte.MAX_VALUE;
                                        bArr4[21] = -94;
                                        bArr4[22] = -52;
                                        bArr4[23] = -117;
                                        bArr4[24] = -106;
                                        bArr4[25] = Ascii.FS;
                                        bArr4[26] = 113;
                                        bArr4[27] = 19;
                                        bArr4[28] = 53;
                                        bArr4[29] = -77;
                                        bArr4[30] = -126;
                                        bArr4[31] = -106;
                                        bArr4[32] = -37;
                                        bArr4[33] = Ascii.CR;
                                        bArr4[34] = 115;
                                        bArr4[35] = Ascii.SI;
                                        bArr4[36] = 120;
                                        bArr4[37] = -91;
                                        bArr4[38] = -103;
                                        bArr4[39] = Byte.MIN_VALUE;
                                        bArr4[40] = -42;
                                        bArr4[41] = 5;
                                        bArr4[42] = 115;
                                        bArr4[43] = 2;
                                        bArr4[44] = oo0OOoo.f13516o00oOoO;
                                        bArr4[45] = -92;
                                        bArr4[46] = -118;
                                        bArr4[47] = -125;
                                        bArr4[48] = -104;
                                        bArr4[49] = b;
                                        bArr4[50] = oo0OOoo.f13516o00oOoO;
                                        bArr4[51] = Ascii.EM;
                                        bArr4[52] = 62;
                                        bArr4[53] = -10;
                                        bArr4[54] = -91;
                                        bArr4[55] = -70;
                                        bArr4[56] = -117;
                                        bArr4[57] = 3;
                                        bArr4[58] = 110;
                                        bArr4[59] = 19;
                                        bArr4[60] = 60;
                                        bArr4[61] = -101;
                                        bArr4[62] = -125;
                                        bArr4[63] = -122;
                                        bArr4[64] = -41;
                                        bArr4[65] = 76;
                                        bArr4[66] = 110;
                                        bArr4[67] = Ascii.GS;
                                        bArr4[68] = 49;
                                        bArr4[69] = -90;
                                        bArr4[70] = -100;
                                        bArr4[71] = -117;
                                        bArr4[72] = -107;
                                        bArr4[73] = Ascii.VT;
                                        bArr4[74] = oo0OOoo.f13516o00oOoO;
                                        bArr4[75] = Ascii.US;
                                        bArr4[76] = 44;
                                        o00oo.o00oOOo0(bArr4, new byte[]{-5, 108, Ascii.GS, 118, 88, -42, -20, -30});
                                    }
                                }
                            }
                            c = '\n';
                        } catch (IOException unused4) {
                            o00oo.o00oOOo0(new byte[]{121, 10, -124, Ascii.ESC, -10, 50, 39, 117, 121, 94, -83, 90, -13, 49, 35, 117, 121, 71, -83, Ascii.RS, -22, 50, 39, 49}, new byte[]{89, 42, -62, 122, -97, 94, 66, 17});
                            o00oo.o00oOOo0(new byte[]{-23, -42, -47, 106, -81, -109, 35, -48, -23, -124, -9, 106, -91, -35, 45, -41, -70, -109, -26, 120, -18, -123, 60, -53, -70, -109, -10, 84, -88, -109, 37, -48, -23, -97, -4, 43, -75, -107, 41, -124, -92, -103, -10, 126, -83, -104, 108, -27, -103, -67}, new byte[]{-55, -10, -110, Ascii.VT, -63, -3, 76, -92});
                        }
                    } finally {
                        o00oOOoO(bufferedReader);
                    }
                }
            } catch (IOException unused5) {
                o00oo.o00oOOo0(new byte[]{-82, 116, Ascii.US, -127, -118, 46, -73, -9, -82, 32, 54, -64, -113, 45, -77, -9, -82, 57, 54, -124, -106, 46, -73, -77}, new byte[]{-114, 84, 89, -32, -29, 66, -46, -109});
                o00oo.o00oOOo0(new byte[]{-77, -69, -58, 121, Ascii.DLE, 47, -78, 105, -77, -12, -11, 125, Ascii.DLE, 97, -68, 110, -32, -2, -15, 107, 81, 57, -83, 114, -32, -2, -31, 71, Ascii.ETB, 47, -76, 105, -77, -14, -21, 56, 10, 41, -72, oo0OOoo.f13516o00oOoO, -2, -12, -31, 109, Ascii.DC2, 36, -3, 92, -61, -48}, new byte[]{-109, -101, -123, Ascii.CAN, 126, 65, -35, Ascii.GS});
            }
        }
    }

    public static void o00oOoO0(String str) {
        o00oOo0o(new File(str), false);
    }

    public static void o00oOoOO(String str, String str2, ApplicationInfo applicationInfo, boolean z, ClassLoader classLoader) {
        XC_LoadPackage.LoadPackageParam loadPackageParam = new XC_LoadPackage.LoadPackageParam(f15419o00oOo0O);
        loadPackageParam.packageName = str;
        loadPackageParam.processName = str2;
        loadPackageParam.appInfo = applicationInfo;
        loadPackageParam.isFirstApplication = z;
        loadPackageParam.classLoader = classLoader;
        XC_LoadPackage.callAll(loadPackageParam);
    }

    public static void o00oOoOo(o00oOOo0 o00oooo02) {
        f15420o00oOooO = o00oooo02;
    }

    public static void o00oOooO(IXposedHookLoadPackage iXposedHookLoadPackage) {
        f15419o00oOo0O.add(new IXposedHookLoadPackage.Wrapper(iXposedHookLoadPackage));
    }
}
