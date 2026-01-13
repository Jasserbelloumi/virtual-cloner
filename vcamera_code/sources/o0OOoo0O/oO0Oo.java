package o0OOoo0O;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o0O0oOO0.o0oO0Ooo;
import o0OOO0oo.oo0OOoo;
import o0ooO0O0.oO0O0O0o;
import o0ooO0O0.oO0Oo0o0;
/* loaded from: classes3.dex */
public class oO0Oo {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static SurfaceTexture f15243o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static Surface f15244o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static SurfaceTexture f15245o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static SurfaceTexture f15246o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static Surface f15247o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static Camera f15248o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static oO000Oo f15249o00oOoo0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Surface f15250o00oOooO;

    /* renamed from: o00oo  reason: collision with root package name */
    public static oO000Oo f15252o00oo;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static MediaPlayer f15253o00oo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static MediaPlayer f15254o00oo00O;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static CameraDevice.StateCallback f15255o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static Surface f15258o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static MediaPlayer f15259o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static SurfaceTexture f15260o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static MediaPlayer f15261o00oo0oO;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static CaptureRequest.Builder f15262o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static Surface f15263o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static Surface f15264o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static Surface f15265o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static Surface f15266o00ooO0o;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static int f15268o00ooOO0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static oO000Oo f15269o0O0o;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o0OO f15270o00oOOo0 = null;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f15271o00oOOoO = true;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public boolean f15272o00oOo00 = true;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static volatile byte[] f15251o00oOooo = {0};

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static HashMap<Surface, ImageReader> f15257o00oo0OO = new HashMap<>();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static HashMap<String, Integer> f15256o00oo0O0 = new HashMap<>();

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static boolean f15267o00ooOO = false;

    /* loaded from: classes3.dex */
    public class o0 extends XC_MethodHook {
        public o0() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{99, 123, -112, -59, -70, 65, -89, 17, -80, -113}, new byte[]{Ascii.FF, Ascii.NAK, -43, -73, -56, 46, -43, -2}) + ((Integer) methodHookParam.args[1]).intValue());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends XC_MethodHook {
        public o00oOOo0() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            int intValue = ((Integer) ((CameraCharacteristics) methodHookParam.getResult()).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            oO0Oo.f15256o00oo0O0.put((String) methodHookParam.args[0], Integer.valueOf(intValue));
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends XC_MethodHook {
        public o00oOOoO() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj = methodHookParam.args[1];
            if (obj == null || obj.equals(oO0Oo.f15255o00oo0O)) {
                return;
            }
            Object[] objArr = methodHookParam.args;
            oO0Oo.f15255o00oo0O = (CameraDevice.StateCallback) objArr[1];
            String str = (String) objArr[0];
            if (!TextUtils.isEmpty(str)) {
                oO0Oo.f15268o00ooOO0 = oO0Oo.f15256o00oo0O0.get(str).intValue();
            }
            oO0Oo.this.o00ooO00(oO0Oo.f15255o00oo0O);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends XC_MethodHook {
        public o00oOo00() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj = methodHookParam.args[2];
            if (obj == null || obj.equals(oO0Oo.f15255o00oo0O)) {
                return;
            }
            Object[] objArr = methodHookParam.args;
            oO0Oo.f15255o00oo0O = (CameraDevice.StateCallback) objArr[2];
            String str = (String) objArr[0];
            if (!TextUtils.isEmpty(str)) {
                oO0Oo.f15268o00ooOO0 = oO0Oo.f15256o00oo0O0.get(str).intValue();
            }
            oO0Oo.this.o00ooO00(oO0Oo.f15255o00oo0O);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O extends XC_MethodHook {
        public o00oOo0O() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            StringBuilder sb;
            String o00oOOo02;
            Object obj = methodHookParam.args[0];
            if (obj == null) {
                return;
            }
            Surface surface = (Surface) obj;
            if (surface.equals(oO0Oo.f15258o00oo0Oo)) {
                return;
            }
            oO0Oo.o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{SignedBytes.MAX_POWER_OF_TWO, 9, -105, -58, 9, -25, Ascii.SUB, 10, 85, 87}, new byte[]{o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 109, -13, -110, 104, -107, 125, 111}) + surface);
            if (surface.toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{-41, -84, -121, 114, 109, 7, 97, 103, -22, -72, -104, 113, 49, 10, 113, 35, -24, -16}, new byte[]{-124, -39, -11, Ascii.DC4, Ascii.FF, 100, 4, 79}))) {
                Surface surface2 = oO0Oo.f15265o00ooO0O;
                if (surface2 != null) {
                    if (!surface2.equals(methodHookParam.args[0]) && oO0Oo.f15266o00ooO0o == null) {
                        oO0Oo.f15266o00ooO0o = (Surface) methodHookParam.args[0];
                        sb = new StringBuilder();
                        o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{-124, 38, -49, -84, -39, -47, 88, 36, -59, Ascii.FS, -23, -23, -43, -2, 106, 60, -123, 37, -38, -17, -47, -44, 75, 38, -102, 10, -42, -19, -45, -9, 107, 44, -106, 39, -34, -2, -122, -88}, new byte[]{-9, 67, -69, -116, -76, -110, 57, 73});
                    }
                    methodHookParam.args[0] = oO0Oo.f15258o00oo0Oo;
                }
                oO0Oo.f15265o00ooO0O = (Surface) methodHookParam.args[0];
                sb = new StringBuilder();
                o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{-37, -110, -28, -64, 35, 123, Ascii.EM, -64, -102, -88, -62, -123, 47, 84, 43, -40, -38, -111, -15, -125, 43, 126, 10, -62, -59, -66, -3, -127, 41, 93, 42, -56, -55, -109, -11, -110, Byte.MAX_VALUE, 2}, new byte[]{-88, -9, -112, -32, 78, 56, 120, -83});
                sb.append(o00oOOo02);
                sb.append(surface);
                oO0Oo.o00ooOO0(sb.toString());
                methodHookParam.args[0] = oO0Oo.f15258o00oo0Oo;
            }
            Surface surface3 = oO0Oo.f15264o00ooO00;
            if (surface3 != null) {
                if (!surface3.equals(methodHookParam.args[0]) && oO0Oo.f15263o00ooO0 == null) {
                    oO0Oo.f15263o00ooO0 = (Surface) methodHookParam.args[0];
                    sb = new StringBuilder();
                    o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{55, 115, 103, -100, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -78, -48, -46, 118, 73, 65, -39, 45, -99, -30, -54, 54, 112, 114, -33, 41, -73, -61, -48, 41, 70, 97, -39, 58, -104, -44, -56, 118, 44}, new byte[]{68, Ascii.SYN, 19, -68, 76, -15, -79, -65});
                }
                methodHookParam.args[0] = oO0Oo.f15258o00oo0Oo;
            }
            oO0Oo.f15264o00ooO00 = (Surface) methodHookParam.args[0];
            sb = new StringBuilder();
            o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.RS, -109, -34, 120, 117, -65, -79, -61, 95, -87, -8, oo0OOoo.f13516o00oOoO, 121, -112, -125, -37, Ascii.US, -112, -53, 59, 125, -70, -94, -63, 0, -90, -40, oo0OOoo.f13516o00oOoO, 110, -107, -75, -39, 92, -52}, new byte[]{109, -10, -86, 88, Ascii.CAN, -4, -48, -82});
            sb.append(o00oOOo02);
            sb.append(surface);
            oO0Oo.o00ooOO0(sb.toString());
            methodHookParam.args[0] = oO0Oo.f15258o00oo0Oo;
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOoO extends XC_MethodHook {
        public o00oOoO() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Object obj = methodHookParam.args[0];
            if (obj == null) {
                return;
            }
            Surface surface = (Surface) obj;
            oO0Oo.f15257o00oo0OO.remove(surface);
            if (surface.equals(oO0Oo.f15264o00ooO00)) {
                oO0Oo.f15264o00ooO00 = null;
            } else if (surface.equals(oO0Oo.f15263o00ooO0)) {
                oO0Oo.f15263o00ooO0 = null;
            } else if (surface.equals(oO0Oo.f15266o00ooO0o)) {
                oO0Oo.f15266o00ooO0o = null;
            } else if (surface.equals(oO0Oo.f15265o00ooO0O)) {
                oO0Oo.f15265o00ooO0O = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo extends XC_MethodHook {
        public o00oo() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            super.beforeHookedMethod(methodHookParam);
            if (oO0Oo.this.f15271o00oOOoO) {
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-72, 122, 46, -58, -77, 34, -124, -124, -115, 63, 36, -38, -31, 40, -126, -98, -54, 108, 56, -39, -79, 41, -97, -98, -53}, new byte[]{-22, Ascii.US, 77, -87, -63, 70, -19, -22}));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0 extends XC_MethodHook {
        public o00oo0() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.contains(oO000Oo.class.getCanonicalName()) || stackTraceString.contains(oO00000.class.getCanonicalName())) {
                return;
            }
            ImageReader imageReader = (ImageReader) methodHookParam.getResult();
            oO0Oo.f15257o00oo0OO.put(imageReader.getSurface(), imageReader);
            if (oO0Oo.this.f15272o00oOo00) {
                int intValue = ((Integer) methodHookParam.args[0]).intValue();
                int intValue2 = ((Integer) methodHookParam.args[1]).intValue();
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-97, -43, 10, -32, 37, 7, 63, SignedBytes.MAX_POWER_OF_TWO, -91, -8, 2, -13, 111, 92, 3, SignedBytes.MAX_POWER_OF_TWO, -77, -43, 9, -14, 54, 3, 3, 70, -95, -63, 71, -62, 35, Ascii.SI, 8, 87, -91, -68, Ascii.DC4, -24, 56, 7, 77, 77, -95, -18, 2, -95, 43, 17, 77, 126, -77, -11, 3, -11, 42, 88}, new byte[]{-60, -100, 103, -127, 66, 98, 109, 37}) + intValue + o0OOoO0.o00oo.o00oOOo0(new byte[]{53, Ascii.VT, -38, 81, -118, 79, 56, 60}, new byte[]{Ascii.EM, 99, -65, 56, -19, 39, 76, 6}) + intValue2 + o0OOoO0.o00oo.o00oOOo0(new byte[]{-93}, new byte[]{-2, -73, -92, 41, -42, 97, -56, Ascii.RS}));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo00O extends XC_MethodHook {
        public o00oo00O() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (methodHookParam.thisObject.equals(oO0Oo.f15262o00ooO)) {
                return;
            }
            oO0Oo.f15262o00ooO = (CaptureRequest.Builder) methodHookParam.thisObject;
            oO0Oo.this.o00ooOoO();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O extends XC_MethodHook {
        public o00oo0O() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (!Log.getStackTraceString(new Throwable()).contains(oO00000.class.getCanonicalName())) {
                oO000Oo oo000oo = oO0Oo.f15269o0O0o;
                if (oO000Oo.f15171o00ooOoO != methodHookParam.thisObject) {
                    return;
                }
            }
            oO000Oo oo000oo2 = oO0Oo.f15269o0O0o;
            if (oo000oo2 == null && (oo000oo2 = oO0Oo.f15252o00oo) == null) {
                return;
            }
            methodHookParam.setResult(oo000oo2.f15183o00ooO0O.o00oOo00());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O0 extends XC_MethodHook {
        public o00oo0O0() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (!Log.getStackTraceString(new Throwable()).contains(oO00000.class.getCanonicalName())) {
                oO000Oo oo000oo = oO0Oo.f15269o0O0o;
                if (oO000Oo.f15171o00ooOoO != methodHookParam.thisObject) {
                    return;
                }
            }
            oO000Oo oo000oo2 = oO0Oo.f15269o0O0o;
            if (oo000oo2 == null && (oo000oo2 = oO0Oo.f15252o00oo) == null) {
                return;
            }
            methodHookParam.setResult(oo000oo2.f15183o00ooO0O.o00oOo00());
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0OO extends XC_MethodHook {
        public o00oo0OO() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-94, -34, 58, Ascii.DC2, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 3, Ascii.CAN, 62, -88, -10, Ascii.CAN, Ascii.SUB, oo0OOoo.f13516o00oOoO, Ascii.DC2, 9, 118}, new byte[]{-51, -80, 121, 115, 81, 119, 109, 76}) + ((CaptureFailure) methodHookParam.args[2]).getReason());
        }
    }

    /* loaded from: classes3.dex */
    public class o00ooO extends XC_MethodHook {

        /* loaded from: classes3.dex */
        public class o00oOOo0 extends XC_MethodHook {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ XC_MethodHook.MethodHookParam f15287o00oo0O0;

            public o00oOOo0(XC_MethodHook.MethodHookParam methodHookParam) {
                this.f15287o00oo0O0 = methodHookParam;
            }

            public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                if (this.f15287o00oo0O0.args[0] == null) {
                    return;
                }
                oO0Oo.o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{107, 115, Ascii.ETB, -46, 1, Ascii.FF, -5, -49, 120, 117, 7, -63, Ascii.DLE, 58, -35, -35, 123, 104, Ascii.GS, -35, 85, 4, -5, -49, 101, 51, 45, -11, Ascii.DC4, 2, -35, -3, 125, 115, Ascii.DC4, -46, Ascii.SYN, Ascii.FF, -126}, new byte[]{8, 1, 114, -77, 117, 105, -72, -82}) + oO0Oo.f15258o00oo0Oo);
                methodHookParam.args[0] = Arrays.asList(oO0Oo.f15258o00oo0Oo);
                Object obj = methodHookParam.args[1];
                if (obj != null) {
                    oO0Oo.this.o00ooOo((CameraCaptureSession.StateCallback) obj);
                }
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOOoO extends XC_MethodHook {
            public o00oOOoO() {
            }

            public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                if (methodHookParam.args[0] == null) {
                    return;
                }
                methodHookParam.args[0] = Arrays.asList(new OutputConfiguration(oO0Oo.f15258o00oo0Oo));
                Object obj = methodHookParam.args[1];
                if (obj != null) {
                    oO0Oo.this.o00ooOo((CameraCaptureSession.StateCallback) obj);
                }
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOo00 extends XC_MethodHook {
            public o00oOo00() {
            }

            public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                Object[] objArr = methodHookParam.args;
                if (objArr[0] == null) {
                    return;
                }
                objArr[0] = Arrays.asList(oO0Oo.f15258o00oo0Oo);
                Object obj = methodHookParam.args[1];
                if (obj != null) {
                    oO0Oo.this.o00ooOo((CameraCaptureSession.StateCallback) obj);
                }
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOo0O extends XC_MethodHook {
            public o00oOo0O() {
            }

            public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                Object[] objArr = methodHookParam.args;
                if (objArr[1] == null) {
                    return;
                }
                objArr[1] = Arrays.asList(oO0Oo.f15258o00oo0Oo);
                Object obj = methodHookParam.args[2];
                if (obj != null) {
                    oO0Oo.this.o00ooOo((CameraCaptureSession.StateCallback) obj);
                }
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOoO extends XC_MethodHook {
            public o00oOoO() {
            }

            public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                if (methodHookParam.args[1] == null) {
                    return;
                }
                methodHookParam.args[0] = Arrays.asList(new OutputConfiguration(oO0Oo.f15258o00oo0Oo));
                Object obj = methodHookParam.args[2];
                if (obj != null) {
                    oO0Oo.this.o00ooOo((CameraCaptureSession.StateCallback) obj);
                }
            }
        }

        /* loaded from: classes3.dex */
        public class o00oo00O extends XC_MethodHook {
            public o00oo00O() {
            }

            public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                Object obj = methodHookParam.args[0];
                if (obj == null) {
                    return;
                }
                SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
                methodHookParam.args[0] = new SessionConfiguration(sessionConfiguration.getSessionType(), Arrays.asList(new OutputConfiguration(oO0Oo.f15258o00oo0Oo)), sessionConfiguration.getExecutor(), sessionConfiguration.getStateCallback());
                oO0Oo.this.o00ooOo(sessionConfiguration.getStateCallback());
            }
        }

        public o00ooO() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            oO0Oo.this.o00oo0o0();
            oO0Oo.this.o00oo0OO();
            XposedHelpers.findAndHookMethod(methodHookParam.args[0].getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{43, -90, 65, 105, 111, 114, 38, 9, 56, -96, 81, 122, 126, 68, 0, Ascii.ESC, 59, -67, 75, 102}, new byte[]{72, -44, 36, 8, Ascii.ESC, Ascii.ETB, 101, 104}), new Object[]{List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o00oOOo0(methodHookParam)});
            XposedHelpers.findAndHookMethod(methodHookParam.args[0].getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-16, -51, Ascii.FF, -88, 58, -15, 79, 52, -29, -53, Ascii.FS, -69, 43, -57, 105, 38, -32, -42, 6, -89, Ascii.FF, -19, 67, 32, -25, -49, Ascii.FS, -67, Ascii.CR, -5, 98, 51, -6, -40, Ascii.FS, -69, 47, -32, 101, 58, -3, -52}, new byte[]{-109, -65, 105, -55, 78, -108, Ascii.FF, 85}), new Object[]{List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o00oOOoO()});
            XposedHelpers.findAndHookMethod(methodHookParam.args[0].getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-96, 51, 105, -103, -6, -87, -20, -96, -83, 50, 120, -118, -17, -91, -63, -86, -89, 9, 101, -97, -26, -97, -33, -86, -90, 37, 79, -103, -2, -72, -38, -67, -90, Ascii.DC2, 105, -117, -3, -91, -64, -95}, new byte[]{-61, 65, Ascii.FF, -8, -114, -52, -81, -49}), new Object[]{List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o00oOo00()});
            XposedHelpers.findAndHookMethod(methodHookParam.args[0].getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-53, -79, 57, Ascii.CR, 1, -94, 8, -4, -40, -79, 51, Ascii.SI, Ascii.DLE, -76, 41, -8, -54, -81, 57, 47, Ascii.DC4, -73, 46, -20, -38, -90, Ascii.SI, 9, 6, -76, 51, -10, -58}, new byte[]{-88, -61, 92, 108, 117, -57, 90, -103}), new Object[]{InputConfiguration.class, List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o00oOo0O()});
            XposedHelpers.findAndHookMethod(methodHookParam.args[0].getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{32, -98, -23, -78, 44, 47, Ascii.SO, 5, 51, -98, -29, -80, oo0OOoo.f13516o00oOoO, 57, 47, 1, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Byte.MIN_VALUE, -23, -112, 57, 58, 40, Ascii.NAK, 49, -119, -33, -74, 43, 57, 53, Ascii.SI, 45, -82, -11, -112, 55, 36, 58, 9, 36, -103, -2, -78, 44, 35, 51, Ascii.SO, 48}, new byte[]{67, -20, -116, -45, 88, 74, 92, 96}), new Object[]{InputConfiguration.class, List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o00oOoO()});
            XposedHelpers.findAndHookMethod(methodHookParam.args[0].getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{82, 56, SignedBytes.MAX_POWER_OF_TWO, Ascii.DC2, 46, -92, 107, 110, 65, 62, 80, 1, 63, -110, 77, 124, 66, 35, 74, Ascii.GS}, new byte[]{49, 74, 37, 115, 90, -63, 40, Ascii.SI}), new Object[]{SessionConfiguration.class, new o00oo00O()});
        }
    }

    /* loaded from: classes3.dex */
    public class o00ooO0 extends XC_MethodHook {
        public o00ooO0() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            oO0Oo.this.o00oo0o0();
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00 extends XC_MethodHook {
        public o0O00() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.args[0] != null) {
                oO0Oo.this.o00ooOO(methodHookParam);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O000 extends XC_MethodHook {
        public o0O000() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                oO0Oo oo0oo = oO0Oo.this;
                methodHookParam.args[0] = oO0Oo.o00oo(oo0oo.o0O0o(new File(oO0Oo.this.f15270o00oOOo0.f14931o00oOOo0).getParentFile().getAbsolutePath() + o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.SUB, -33, -127, -26, Ascii.DLE, -102, Ascii.DLE, 52, 69}, new byte[]{53, -18, -79, -42, 32, -76, 114, 89})));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00000 extends XC_MethodHook {
        public o0O00000() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0000O extends XC_MethodHook {
        public o0O0000O() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                oO0Oo oo0oo = oO0Oo.this;
                Bitmap o0O0o2 = oo0oo.o0O0o(new File(oO0Oo.this.f15270o00oOOo0.f14931o00oOOo0).getParentFile().getAbsolutePath() + o0OOoO0.o00oo.o00oOOo0(new byte[]{34, 65, 93, -56, -23, 97, 97, 80, 125}, new byte[]{Ascii.CR, 112, 109, -8, -39, 79, 3, oo0OOoo.f13516o00oOoO}));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                o0O0o2.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                methodHookParam.args[0] = byteArrayOutputStream.toByteArray();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O000O extends XC_MethodHook {
        public o0O000O() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Camera camera = (Camera) methodHookParam.args[1];
            if (camera.equals(oO0Oo.f15248o00oOoOo)) {
                do {
                } while (oO0Oo.f15251o00oOooo == null);
                System.arraycopy(oO0Oo.f15251o00oOooo, 0, methodHookParam.args[0], 0, Math.min(oO0Oo.f15251o00oOooo.length, ((byte[]) methodHookParam.args[0]).length));
                return;
            }
            oO0Oo.f15248o00oOoOo = camera;
            if (oO0Oo.this.f15272o00oOo00) {
                int i = camera.getParameters().getPreviewSize().width;
                int i2 = oO0Oo.f15248o00oOoOo.getParameters().getPreviewSize().height;
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{112, -57, -32, -18, 125, -46, 93, SignedBytes.MAX_POWER_OF_TWO, 78, -33, -56, -52, 110, -38, 78, 116, Ascii.VT, -21, -17, -45, 106, -59, 74, 9, 88, -63, -12, -37, 47, -33, 78, 91, 78, -120, -25, -51, 47, -20, 92, SignedBytes.MAX_POWER_OF_TWO, 79, -36, -26, -124}, new byte[]{43, -88, -114, -66, Ascii.SI, -73, 43, 41}) + i + o0OOoO0.o00oo.o00oOOo0(new byte[]{125, -85, -63, 63, -116, 9, 101, 102}, new byte[]{81, -61, -92, 86, -21, 97, 17, 92}) + i2 + o0OOoO0.o00oo.o00oOOo0(new byte[]{-46}, new byte[]{-113, -107, -91, -11, Ascii.SYN, -44, 58, -75}));
            }
            oO000Oo oo000oo = oO0Oo.f15249o00oOoo0;
            if (oo000oo != null) {
                oo000oo.o00oo0O0();
            }
            oO000Oo oo000oo2 = new oO000Oo();
            oO0Oo.f15249o00oOoo0 = oo000oo2;
            oo000oo2.o00oo00O("", oO000O0O.NV21);
            oO0Oo.f15249o00oOoo0.o00oOooO(oO0Oo.this.f15270o00oOOo0.f14931o00oOOo0);
            do {
            } while (oO0Oo.f15251o00oOooo == null);
            System.arraycopy(oO0Oo.f15251o00oOooo, 0, methodHookParam.args[0], 0, Math.min(oO0Oo.f15251o00oOooo.length, ((byte[]) methodHookParam.args[0]).length));
        }
    }

    /* loaded from: classes3.dex */
    public class o0O000Oo extends XC_MethodHook {
        public o0O000Oo() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj = methodHookParam.args[0];
            if (obj == null) {
                return;
            }
            oO0Oo.f15250o00oOooO = (Surface) obj;
            SurfaceTexture surfaceTexture = oO0Oo.f15243o00oOo0O;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                oO0Oo.f15243o00oOo0O = null;
            }
            Surface surface = oO0Oo.f15244o00oOo0o;
            if (surface != null) {
                surface.release();
                oO0Oo.f15244o00oOo0o = null;
            }
            oO0Oo.f15243o00oOo0O = new SurfaceTexture(111);
            Surface surface2 = new Surface(oO0Oo.f15243o00oOo0O);
            oO0Oo.f15244o00oOo0o = surface2;
            methodHookParam.args[0] = surface2;
        }
    }

    /* loaded from: classes3.dex */
    public class o0O000o0 extends XC_MethodHook {
        public o0O000o0() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            Object obj = methodHookParam.args[0];
            if (obj == null) {
                return;
            }
            oO0Oo.f15246o00oOoO0 = (SurfaceTexture) obj;
            SurfaceTexture surfaceTexture = oO0Oo.f15245o00oOoO;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                oO0Oo.f15245o00oOoO = null;
            }
            Surface surface = oO0Oo.f15247o00oOoOO;
            if (surface != null) {
                surface.release();
                oO0Oo.f15247o00oOoOO = null;
            }
            oO0Oo.f15245o00oOoO = new SurfaceTexture(112);
            oO0Oo.f15247o00oOoOO = new Surface(oO0Oo.f15246o00oOoO0);
            methodHookParam.args[0] = oO0Oo.f15245o00oOoO;
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00O extends XC_MethodHook {
        public o0O00O() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            oO0Oo.f15267o00ooOO = false;
            Surface surface = oO0Oo.f15250o00oOooO;
            if (surface != null && surface.isValid()) {
                MediaPlayer mediaPlayer = oO0Oo.f15254o00oo00O;
                if (mediaPlayer != null) {
                    mediaPlayer.release();
                }
                oO0Oo.f15254o00oo00O = oO0Oo.this.o00oo0O0(oO0Oo.f15250o00oOooO);
            }
            if (oO0Oo.f15246o00oOoO0 != null) {
                MediaPlayer mediaPlayer2 = oO0Oo.f15253o00oo0;
                if (mediaPlayer2 != null) {
                    mediaPlayer2.release();
                }
                oO0Oo.f15253o00oo0 = oO0Oo.this.o00oo0O0(oO0Oo.f15247o00oOoOO);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00O0 extends XC_MethodHook {
        public o0O00O0() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.args[0] != null) {
                oO0Oo.this.o00ooOO(methodHookParam);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00O0o extends XC_MethodHook {
        public o0O00O0o() {
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.args[1] != null) {
                oO0Oo.this.o00ooOo0(methodHookParam);
            }
            if (methodHookParam.args[3] != null) {
                oO0Oo.this.o00ooOOo(methodHookParam, 3);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00OO extends XC_MethodHook {
        public o0O00OO() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            oO0Oo.o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{92, 54, -67, 115, -19, -77, 2, 54, 70, 39, -91, 57}, new byte[]{47, 66, -46, 3, -67, -63, 103, SignedBytes.MAX_POWER_OF_TWO}) + methodHookParam.thisObject + o0OOoO0.o00oo.o00oOOo0(new byte[]{-4}, new byte[]{-48, 78, Ascii.VT, -93, -45, -105, 126, 56}));
            oO0Oo.this.o00oo0Oo();
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0o extends XC_MethodHook {
        public o0O0o() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            int intValue = ((Integer) methodHookParam.args[0]).intValue();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(intValue, cameraInfo);
            oO0Oo.f15268o00ooOO0 = cameraInfo.orientation;
            oO0Oo.o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{87, Ascii.SYN, -119, 85}, new byte[]{56, 102, -20, 59, -104, 113, -107, -123}));
        }
    }

    /* loaded from: classes3.dex */
    public class o0OoO00O extends XC_MethodHook {
        public o0OoO00O() {
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.args[0] != null) {
                oO0Oo.this.o00ooOO(methodHookParam);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0OoOoOo implements MediaPlayer.OnPreparedListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ MediaPlayer f15308o00oo0O0;

        public o0OoOoOo(MediaPlayer mediaPlayer) {
            this.f15308o00oo0O0 = mediaPlayer;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            this.f15308o00oo0O0.start();
        }
    }

    public static byte[] o00oo(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        return o00ooOoo(iArr, width, height);
    }

    public static void o00ooOO0(String str) {
        o0OOoO0.o00oo.o00oOOo0(new byte[]{124, 109, 113, 95, 2}, new byte[]{77, 95, 66, 107, 55, 124, -18, 69});
    }

    public static byte[] o00ooOoo(int[] iArr, int i, int i2) {
        int i3 = i * i2;
        byte[] bArr = new byte[(i3 * 3) / 2];
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = (i4 * i) + i5;
                int i7 = iArr[i6] & 16777215;
                int i8 = i7 & 255;
                int i9 = (i7 >> 8) & 255;
                int i10 = (i7 >> 16) & 255;
                int o00oOOo02 = (o0oO0Ooo.o00oOOo0(i10, 25, (i9 * TsExtractor.TS_STREAM_TYPE_AC3) + (i8 * 66), 128) >> 8) + 16;
                int o00oOOo03 = (o0oO0Ooo.o00oOOo0(i10, 112, (i8 * (-38)) - (i9 * 74), 128) >> 8) + 128;
                int o00oOOo04 = (com.google.android.exoplayer2.extractor.o00oOo0O.o00oOOo0(i10, 18, (i8 * 112) - (i9 * 94), 128) >> 8) + 128;
                int min = o00oOOo02 >= 16 ? Math.min(o00oOOo02, 255) : 16;
                int min2 = o00oOOo03 < 0 ? 0 : Math.min(o00oOOo03, 255);
                int min3 = o00oOOo04 < 0 ? 0 : Math.min(o00oOOo04, 255);
                bArr[i6] = (byte) min;
                int i11 = ((i4 >> 1) * i) + i3 + (i5 & (-2));
                bArr[i11] = (byte) min2;
                bArr[i11 + 1] = (byte) min3;
            }
        }
        return bArr;
    }

    public static void o00ooo00(String str) {
        oO0Oo0o0.o00oOoO(str);
    }

    public final oO000Oo o00oo0O(Surface surface) {
        oO000O0O oo000o0o;
        if (surface == null) {
            return null;
        }
        oO000Oo oo000oo = new oO000Oo();
        try {
            if (f15257o00oo0OO.get(surface).getImageFormat() == 256) {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{45, 53, 57, -47}, new byte[]{67, SignedBytes.MAX_POWER_OF_TWO, 85, -67, -84, -49, 118, 84});
                oo000o0o = oO000O0O.JPEG;
            } else {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{72, 51, Ascii.SUB, 2}, new byte[]{38, 70, 118, 110, 81, -80, -69, -32});
                oo000o0o = oO000O0O.NV21;
            }
            oo000oo.f15176o00oo0Oo = oo000o0o;
            oo000oo.f15173o00oo = surface;
            oo000oo.o00oOooO(this.f15270o00oOOo0.f14931o00oOOo0);
        } catch (Throwable th) {
            th.printStackTrace();
            oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-118, -32, -110, 88, -127, -109, -63, 111, -127, -94}, new byte[]{-17, -104, -15, oo0OOoo.f13516o00oOoO, -15, -25, -88, 0}) + th);
        }
        return oo000oo;
    }

    public final MediaPlayer o00oo0O0(Surface surface) {
        float f;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setSurface(surface);
        if (!this.f15270o00oOOo0.f14934o00oOooO || f15267o00ooOO) {
            f = 0.0f;
        } else {
            f15267o00ooOO = true;
            f = 1.0f;
        }
        mediaPlayer.setVolume(f, f);
        mediaPlayer.setLooping(true);
        mediaPlayer.setOnPreparedListener(new o0OoOoOo(mediaPlayer));
        try {
            mediaPlayer.setDataSource(this.f15270o00oOOo0.f14931o00oOOo0);
            mediaPlayer.prepare();
        } catch (Throwable th) {
            th.printStackTrace();
            o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{123, -119, -9, 73, 95, -41, 113, 125, 74, -116, -6, 10}, new byte[]{43, -27, -106, 48, 58, -91, 81, Ascii.ESC}) + th.toString() + o0OOoO0.o00oo.o00oOOo0(new byte[]{70, 94, -54, 62, -18, SignedBytes.MAX_POWER_OF_TWO, 76, -70, 80}, new byte[]{106, 45, -65, 76, -120, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 47, -33}) + surface);
        }
        return mediaPlayer;
    }

    public final void o00oo0OO() {
        SurfaceTexture surfaceTexture = f15260o00oo0o0;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            f15260o00oo0o0 = null;
        }
        Surface surface = f15258o00oo0Oo;
        if (surface != null) {
            surface.release();
            f15258o00oo0Oo = null;
        }
        f15260o00oo0o0 = new SurfaceTexture(115);
        f15258o00oo0Oo = new Surface(f15260o00oo0o0);
    }

    public final void o00oo0Oo() {
        o00oo0o(f15254o00oo00O);
        o00oo0o(f15253o00oo0);
        o00oo0oO(f15249o00oOoo0);
        f15254o00oo00O = null;
        f15253o00oo0 = null;
        f15249o00oOoo0 = null;
        SurfaceTexture surfaceTexture = f15243o00oOo0O;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            f15243o00oOo0O = null;
        }
        Surface surface = f15244o00oOo0o;
        if (surface != null) {
            surface.release();
            f15244o00oOo0o = null;
        }
        SurfaceTexture surfaceTexture2 = f15245o00oOoO;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            f15245o00oOoO = null;
        }
        Surface surface2 = f15247o00oOoOO;
        if (surface2 != null) {
            surface2.release();
            f15247o00oOoOO = null;
        }
        f15267o00ooOO = false;
    }

    public final void o00oo0o(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
    }

    public final void o00oo0o0() {
        o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{97, -87, 108, 1, 55, 6, -92, 95, 105, -96, 92, Ascii.DC4, 53, 17, -81, Byte.MAX_VALUE, 55, -20, 108, 1, 57, 6, -87}, new byte[]{5, -52, Ascii.US, 117, 88, 116, -35, Ascii.RS}));
        o00oo0o(f15259o00oo0o);
        o00oo0o(f15261o00oo0oO);
        o00oo0oO(f15269o0O0o);
        o00oo0oO(f15252o00oo);
        f15259o00oo0o = null;
        f15261o00oo0oO = null;
        f15269o0O0o = null;
        f15252o00oo = null;
        Surface surface = f15258o00oo0Oo;
        if (surface != null) {
            surface.release();
            f15258o00oo0Oo = null;
        }
        SurfaceTexture surfaceTexture = f15260o00oo0o0;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            f15260o00oo0o0 = null;
        }
        if (f15265o00ooO0O != null) {
            f15265o00ooO0O = null;
        }
        if (f15266o00ooO0o != null) {
            f15266o00ooO0o = null;
        }
        if (f15264o00ooO00 != null) {
            f15264o00ooO00 = null;
        }
        if (f15263o00ooO0 != null) {
            f15263o00ooO0 = null;
        }
        Iterator<Surface> it = f15257o00oo0OO.keySet().iterator();
        while (it.hasNext()) {
            if (!it.next().isValid()) {
                it.remove();
            }
        }
        f15267o00ooOO = false;
        o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{118, 81, -97, 81, 69, -1, 67, -110, 126, 88, -81, 68, 71, -24, 72, -78, 32, Ascii.DC4, -119, 75, 78}, new byte[]{Ascii.DC2, 52, -20, 37, 42, -115, 58, -45}));
    }

    public final void o00oo0oO(oO000Oo oo000oo) {
        if (oo000oo != null) {
            oo000oo.o00oo0O0();
        }
    }

    public final void o00ooO() {
        XposedHelpers.findAndHookMethod(MediaRecorder.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-111, -75, -6, -21, 110, -7, 81, 83, -125}, new byte[]{-30, -48, -114, -88, Ascii.SI, -108, 52, o0Oo0oo0.o0OO0o00.f16655o00oOoOO}), new Object[]{Camera.class, new o00oo()});
    }

    public final void o00ooO0() {
        XposedHelpers.findAndHookMethod(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-44, 83, 58, -77}, new byte[]{-69, 35, 95, -35, -106, 109, -42, 98}), new Object[]{Integer.TYPE, new o0O0o()});
        XposedHelpers.findAndHookMethod(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-111, Ascii.NAK, -53, 97, -84, 58, -111, 34, -121, 7, -20, 68, -84, 57, -122, 40, -121}, new byte[]{-30, 112, -65, 49, -34, 95, -25, 75}), new Object[]{Surface.class, new o0O000Oo()});
        XposedHelpers.findAndHookMethod(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-118, 81, 46, -89, -29, -105, -94, 94, -100, 67, Ascii.SO, -110, -23, -122, -95, 69, -100}, new byte[]{-7, 52, 90, -9, -111, -14, -44, 55}), new Object[]{SurfaceTexture.class, new o0O000o0()});
        XposedHelpers.findAndHookMethod(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{59, -4, 53, 125, 60, Ascii.US, 83, 51, 45, -18, 2, 76, 34, Ascii.SYN, 71, 59, 43, -14}, new byte[]{72, -103, 65, 45, 78, 122, 37, 90}), new Object[]{Camera.PreviewCallback.class, new o0O00()});
        XposedHelpers.findAndHookMethod(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{95, Ascii.ESC, Ascii.SYN, 59, 81, -6, -37, 97, 73, 9, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 10, 79, -13, -49, 105, 79, Ascii.NAK, 53, 2, 87, -9, -17, 125, 74, Ascii.CAN, 7, Ascii.EM}, new byte[]{44, 126, 98, 107, 35, -97, -83, 8}), new Object[]{Camera.PreviewCallback.class, new o0O00O0()});
        XposedHelpers.findAndHookMethod(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-17, -33, -62, 106, -3, 109, -125, -72, -13, -50, -26, 87, -10, 126, -71, -75, -21, -7, -41, 73, -1, 106, -79, -77, -9}, new byte[]{-100, -70, -74, 37, -109, 8, -48, -48}), new Object[]{Camera.PreviewCallback.class, new o0OoO00O()});
        XposedHelpers.findAndHookMethod(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{109, -114, 45, -9, -17, 38, -1, -49, 108, -99, 35}, new byte[]{Ascii.EM, -17, 70, -110, -65, 79, -100, -69}), new Object[]{Camera.ShutterCallback.class, Camera.PictureCallback.class, Camera.PictureCallback.class, Camera.PictureCallback.class, new o0O00O0o()});
        XposedHelpers.findAndHookMethod(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{54, -31, 78, -107, -14, 45, 110, -118, 51, -4, 74, -112}, new byte[]{69, -107, 47, -25, -122, 125, Ascii.FS, -17}), new Object[]{new o0O00O()});
        XposedHelpers.findAndHookMethod(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-17, -106, -51, Ascii.GS, -119, 52, 53, -12, -11, -121, -43}, new byte[]{-100, -30, -94, 109, -39, 70, 80, -126}), new Object[]{new o0O00OO()});
    }

    public final void o00ooO00(CameraDevice.StateCallback stateCallback) {
        Method method;
        try {
            try {
                method = stateCallback.getClass().getDeclaredMethod(o0OOoO0.o00oo.o00oOOo0(new byte[]{-29, 48, 35, 111, 17, -122, SignedBytes.MAX_POWER_OF_TWO, -117}, new byte[]{-116, 94, 96, 3, 126, -11, 37, -17}), CameraDevice.class);
            } catch (Throwable unused) {
                method = null;
            }
        } catch (Throwable unused2) {
            method = stateCallback.getClass().getSuperclass().getDeclaredMethod(o0OOoO0.o00oo.o00oOOo0(new byte[]{100, 32, -58, 89, 7, 79, -56, -93}, new byte[]{Ascii.VT, 78, -123, 53, 104, 60, -83, -57}), CameraDevice.class);
        }
        o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{97, -67, -22, 32, 125, 47, -112, Ascii.GS, 106, -66, -31, 105}, new byte[]{2, -47, -123, 83, Ascii.CAN, 98, -11, 105}) + method);
        XposedBridge.hookMethod(method, new o00ooO0());
        XposedHelpers.findAndHookMethod(stateCallback.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{124, -60, -9, 106, 2, 6, -5, -14}, new byte[]{19, -86, -72, Ascii.SUB, 103, 104, -98, -106}), new Object[]{CameraDevice.class, new o00ooO()});
        XposedHelpers.findAndHookMethod(stateCallback.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-45, -58, -57, 105, 102, -57, Ascii.SO}, new byte[]{-68, -88, -126, Ascii.ESC, Ascii.DC4, -88, 124, 90}), new Object[]{CameraDevice.class, Integer.TYPE, new o0()});
        XposedHelpers.findAndHookMethod(stateCallback.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{66, 124, 38, 106, 52, -126, 55, -122, 67, 119, 1, 119, 34, -123}, new byte[]{45, Ascii.DC2, 98, 3, 71, -31, 88, -24}), new Object[]{CameraDevice.class, new o0O00000()});
    }

    public final void o00ooO0O() {
        XposedHelpers.findAndHookMethod(CameraManager.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-62, -1, -75, -57, -54, -18, 53, 77, -60, -39, -87, -27, -39, -30, 51, 75, -64, -24, -88, -9, -33, -22, 51, 76}, new byte[]{-91, -102, -63, -124, -85, -125, 80, 63}), new Object[]{String.class, new o00oOOo0()});
        XposedHelpers.findAndHookMethod(CameraManager.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-37, Ascii.ESC, -86, 41, -6, -87, 109, -107, -58, 10}, new byte[]{-76, 107, -49, 71, -71, -56, 0, -16}), new Object[]{String.class, CameraDevice.StateCallback.class, Handler.class, new o00oOOoO()});
        XposedHelpers.findAndHookMethod(CameraManager.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{4, -51, 77, 86, -20, 63, 32, -56, Ascii.EM, -36}, new byte[]{107, -67, 40, 56, -81, 94, 77, -83}), new Object[]{String.class, Executor.class, CameraDevice.StateCallback.class, new o00oOo00()});
        XposedHelpers.findAndHookMethod(CaptureRequest.Builder.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-73, -14, 43, -123, 49, -65, 65, 80, -94}, new byte[]{-42, -106, 79, -47, 80, -51, 38, 53}), new Object[]{Surface.class, new o00oOo0O()});
        XposedHelpers.findAndHookMethod(CaptureRequest.Builder.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-93, -29, 93, -23, -29, SignedBytes.MAX_POWER_OF_TWO, 92, -76, -93, -31, 85, -14}, new byte[]{-47, -122, 48, -122, -107, 37, 8, -43}), new Object[]{Surface.class, new o00oOoO()});
        XposedHelpers.findAndHookMethod(CaptureRequest.Builder.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{77, 87, 102, -113, -19}, new byte[]{47, 34, Ascii.SI, -29, -119, Ascii.GS, Ascii.NAK, 122}), new Object[]{new o00oo00O()});
        String o00oOOo02 = o0OOoO0.o00oo.o00oOOo0(new byte[]{-10, 120, 86, -127, -116, -37, -108, Ascii.SYN, -10, 126, 68}, new byte[]{-104, Ascii.GS, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -56, -30, -88, -32, 119});
        Class cls = Integer.TYPE;
        XposedHelpers.findAndHookMethod(ImageReader.class, o00oOOo02, new Object[]{cls, cls, cls, cls, new o00oo0()});
        XposedHelpers.findAndHookMethod(CameraCaptureSession.CaptureCallback.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-15, 91, -18, 72, 45, Ascii.SI, -61, -59, -5, 115, -52, SignedBytes.MAX_POWER_OF_TWO, 49, Ascii.RS, -46}, new byte[]{-98, 53, -83, 41, 93, 123, -74, -73}), new Object[]{CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class, new o00oo0OO()});
        XposedHelpers.findAndHookMethod(ImageReader.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{47, -66, 66, Byte.MIN_VALUE, -5, -99, -90, 102, 47, -87, 86, -122, -26, -90, -82, 75, 41, -72}, new byte[]{78, -35, 51, -11, -110, -17, -61, 42}), new Object[]{new o00oo0O0()});
        XposedHelpers.findAndHookMethod(ImageReader.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-54, 19, -24, Ascii.GS, 83, 7, 50, 95, -50, 8, -19, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 87, Ascii.DC4, 48, 116}, new byte[]{-85, 112, -103, 104, 58, 117, 87, 17}), new Object[]{new o00oo0O()});
        oO0O0O0o.o00oOOo0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-25, 32, -119, -19, 115, -3, -114, 125, -22, 97}, new byte[]{-113, 79, -26, -122, 83, -103, -31, 19}));
    }

    public void o00ooO0o(o0OO o0oo) throws Exception {
        this.f15270o00oOOo0 = o0oo;
        if (o0oo.f14932o00oOOoO) {
            if (!o0oo.o00oOOo0()) {
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-35, -80, 8, -126, -120, 42, 3, SignedBytes.MAX_POWER_OF_TWO, -1, -7, 9, -97, -114, 121, Ascii.EM, 1}, new byte[]{-117, -39, 108, -25, -25, 10, 109, 47}));
                return;
            }
            o00ooO0();
            o00ooO0O();
            o00ooO();
        }
    }

    public final void o00ooOO(XC_MethodHook.MethodHookParam methodHookParam) {
        XposedHelpers.findAndHookMethod(((Camera.PreviewCallback) methodHookParam.args[0]).getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-68, -108, 123, -12, 100, 85, 108, 86, -92, -68, 89, -25, 108, 70}, new byte[]{-45, -6, 43, -122, 1, 35, 5, 51}), new Object[]{byte[].class, Camera.class, new o0O000O()});
    }

    public final void o00ooOOo(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        XposedHelpers.findAndHookMethod(methodHookParam.args[i].getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-122, 8, -80, 95, -40, -104, Ascii.FF, 8, -116, 50, -127, 93, -34, -126}, new byte[]{-23, 102, -32, 54, -69, -20, 121, 122}), new Object[]{byte[].class, Camera.class, new o0O0000O()});
    }

    public final void o00ooOo(CameraCaptureSession.StateCallback stateCallback) {
    }

    public final void o00ooOo0(XC_MethodHook.MethodHookParam methodHookParam) {
        XposedHelpers.findAndHookMethod(methodHookParam.args[1].getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-116, 89, -46, -110, -20, -11, -105, -103, -122, 99, -29, -112, -22, -17}, new byte[]{-29, 55, -126, -5, -113, -127, -30, -21}), new Object[]{byte[].class, Camera.class, new o0O000()});
    }

    public final void o00ooOoO() {
        if (f15265o00ooO0O != null) {
            oO000Oo oo000oo = f15269o0O0o;
            if (oo000oo != null) {
                oo000oo.o00oo0O0();
                f15269o0O0o = null;
            }
            f15269o0O0o = o00oo0O(f15265o00ooO0O);
        }
        if (f15266o00ooO0o != null) {
            oO000Oo oo000oo2 = f15252o00oo;
            if (oo000oo2 != null) {
                oo000oo2.o00oo0O0();
                f15252o00oo = null;
            }
            f15252o00oo = o00oo0O(f15266o00ooO0o);
        }
        if (f15264o00ooO00 != null) {
            o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{-125, 17, -69, 81, -5, 78, -13, -3, -113, 62, -119, 73, -69, 119, -64, -5, -117, Ascii.DC4, -88, 83, -92, 65, -45, -3, -104, 59, -65, 75, -8, 43}, new byte[]{-18, 82, -38, 60, -55, 17, -95, -104}) + f15264o00ooO00);
            MediaPlayer mediaPlayer = f15259o00oo0o;
            if (mediaPlayer != null) {
                mediaPlayer.release();
                f15259o00oo0o = null;
            }
            f15259o00oo0o = o00oo0O0(f15264o00ooO00);
        }
        if (f15263o00ooO0 != null) {
            o00ooOO0(o0OOoO0.o00oo.o00oOOo0(new byte[]{94, -49, -82, -106, -109, -67, Ascii.DC4, -49, 82, -32, -100, -114, -45, -124, 39, -55, 86, -54, -67, -108, -52, -78, 52, -49, 69, -27, -86, -116, -109, -40}, new byte[]{51, -116, -49, -5, -95, -30, 70, -86}) + f15263o00ooO0);
            MediaPlayer mediaPlayer2 = f15261o00oo0oO;
            if (mediaPlayer2 != null) {
                mediaPlayer2.release();
                f15261o00oo0oO = null;
            }
            f15261o00oo0oO = o00oo0O0(f15263o00ooO0);
        }
    }

    public final Bitmap o0O0o(String str) throws Throwable {
        return BitmapFactory.decodeFile(str);
    }
}
