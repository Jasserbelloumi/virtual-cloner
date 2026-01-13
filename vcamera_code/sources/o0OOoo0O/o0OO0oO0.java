package o0OOoo0O;

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
import android.media.ImageWriter;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import de.robv.android.xposed.XC_MethodHook;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o0OOoO0o.o0OO0;
import o0ooO0O0.oO0O00O;
import o0ooO0O0.oO0OO0O;
import o0ooO0O0.oO0Oo0o0;
import o0ooO0O0.oOoo0;
import o0ooO0O0.ooOOO0Oo;
/* loaded from: classes3.dex */
public class o0OO0oO0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public Surface f14952o00oOoO;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public SurfaceTexture f14954o00oOoOO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public List<o0O0o00> f14947o00oOOo0 = new ArrayList();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public volatile byte[] f14948o00oOOoO = null;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public volatile byte[] f14949o00oOo00 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public Camera f14957o00oOooO = null;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f14950o00oOo0O = 0;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public oO000Oo0 f14951o00oOo0o = null;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public List<o0O0o00O> f14953o00oOoO0 = Collections.synchronizedList(new ArrayList());

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public HashMap<Surface, oO0000O> f14955o00oOoOo = new HashMap<>();

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public HashMap<String, Integer> f14956o00oOoo0 = new HashMap<>();

    /* renamed from: o00oOooo  reason: collision with root package name */
    public oO000Oo0 f14958o00oOooo = null;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public HashMap<CaptureRequest.Builder, o0O0o0> f14960o00oo00O = new HashMap<>();

    /* renamed from: o00oo0  reason: collision with root package name */
    public CaptureRequest f14959o00oo0 = null;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public HashMap<Surface, o0O0o00O> f14963o00oo0OO = new HashMap<>();

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public CameraDevice f14962o00oo0O0 = null;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public o0OO f14961o00oo0O = null;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f14964o00oo0Oo = true;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f14965o00oo0o0 = true;

    /* loaded from: classes3.dex */
    public class o0 extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14967o00oo0O0;

        public o0(Class cls) {
            this.f14967o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14967o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass()) && methodHookParam.args[0].equals(o0OO0oO0.this.f14962o00oo0O0)) {
                o0OO0oO0.this.o00ooO0();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends oOoo0.o00oOo00 {
        public o00oOOo0() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.thisObject.equals(o0OO0oO0.this.f14957o00oOooO)) {
                o0OO0oO0.this.o00ooO00();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends oOoo0.o00oOo00 {
        public o00oOOoO() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.thisObject.equals(o0OO0oO0.this.f14957o00oOooO)) {
                o0OO0oO0.this.o00ooO00();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends oOoo0.o00oOo00 {
        public o00oOo00() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            int intValue = ((Integer) ((CameraCharacteristics) methodHookParam.getResult()).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
            o0OO0oO0.this.f14956o00oOoo0.put((String) methodHookParam.args[0], Integer.valueOf(intValue));
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O extends oOoo0.o00oOo00 {
        public o00oOo0O() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj = methodHookParam.args[1];
            if (obj == null) {
                return;
            }
            o0OO0oO0.this.o00ooOo0((CameraDevice.StateCallback) obj);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOoO extends oOoo0.o00oOo00 {
        public o00oOoO() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj = methodHookParam.args[2];
            if (obj == null) {
                return;
            }
            o0OO0oO0.this.o00ooOo0((CameraDevice.StateCallback) obj);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo extends oOoo0.o00oOo00 {
        public o00oo() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0 extends oOoo0.o00oOo00 {
        public o00oo0() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            CaptureRequest.Builder builder = (CaptureRequest.Builder) methodHookParam.thisObject;
            CaptureRequest captureRequest = (CaptureRequest) methodHookParam.getResult();
            o0O0o0 o0o0o0 = (o0O0o0) o0OO0oO0.this.f14960o00oo00O.get(builder);
            if (o0o0o0 == null) {
                o0o0o0 = new o0O0o0(o0OO0oO0.this, null);
                o0OO0oO0.this.f14960o00oo00O.put(builder, o0o0o0);
                o0o0o0.f15024o00oOo00 = true;
            }
            o0o0o0.f15022o00oOOo0 = captureRequest;
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo00O extends oOoo0.o00oOo00 {
        public o00oo00O() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            Object obj = methodHookParam.args[0];
            if (obj == null) {
                return;
            }
            Surface surface = (Surface) obj;
            if (surface.equals(o0OO0oO0.this.f14952o00oOoO)) {
                return;
            }
            Object[] objArr = methodHookParam.args;
            o0OO0oO0 o0oo0oo0 = o0OO0oO0.this;
            objArr[0] = o0oo0oo0.f14952o00oOoO;
            CaptureRequest.Builder builder = (CaptureRequest.Builder) methodHookParam.thisObject;
            o0O0o0 o0o0o0 = (o0O0o0) o0oo0oo0.f14960o00oo00O.get(builder);
            if (o0o0o0 == null) {
                o0o0o0 = new o0O0o0(o0OO0oO0.this, null);
                o0OO0oO0.this.f14960o00oo00O.put(builder, o0o0o0);
            }
            o0o0o0.f15023o00oOOoO.add(surface);
            o0o0o0.f15024o00oOo00 = true;
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O extends oOoo0.o00oOo00 {
        public o00oo0O() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) {
            ImageReader imageReader = (ImageReader) methodHookParam.getResult();
            oO0000O oo0000o = new oO0000O();
            oo0000o.f15127o00oOOo0 = imageReader;
            o0OO0oO0.this.f14955o00oOoOo.put(imageReader.getSurface(), oo0000o);
            if (o0OO0oO0.this.f14965o00oo0o0) {
                int intValue = ((Integer) methodHookParam.args[0]).intValue();
                int intValue2 = ((Integer) methodHookParam.args[1]).intValue();
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{-3, -85, -2, -71, -55, -25, 52, -84, -57, -122, -10, -86, -125, -68, 8, -84, -47, -85, -3, -85, -38, -29, 8, -86, -61, -65, -77, -101, -49, -17, 3, -69, -57, -62, -32, -79, -44, -25, 70, -95, -61, -112, -10, -8, -57, -15, 70, -110, -47, -117, -9, -84, -58, -72}, new byte[]{-90, -30, -109, -40, -82, -126, 102, -55}) + intValue + o0OOoO0.o00oo.o00oOOo0(new byte[]{98, 9, 5, o0OOO0oo.oo0OOoo.f13516o00oOoO, -67, -86, 71, 6}, new byte[]{78, 97, 96, 84, -38, -62, 51, 60}) + intValue2 + o0OOoO0.o00oo.o00oOOo0(new byte[]{-92}, new byte[]{-7, -10, -99, 9, -95, -19, -84, 8}));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O0 extends oOoo0.o00oOo00 {
        public o00oo0O0() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            ImageReader imageReader = (ImageReader) methodHookParam.thisObject;
            o0OO0oO0.this.o00ooooO(o0OO0oO0.this.f14955o00oOoOo.remove(imageReader.getSurface()));
            o0OO0oO0.this.o00oooo((o0O0o00O) o0OO0oO0.this.f14963o00oo0OO.remove(imageReader.getSurface()));
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0OO extends oOoo0.o00oOo00 {
        public o00oo0OO() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            Object obj = methodHookParam.args[0];
            if (obj == null) {
                return;
            }
            Surface surface = (Surface) obj;
            if (surface.equals(o0OO0oO0.this.f14952o00oOoO)) {
                return;
            }
            o0O0o0 o0o0o0 = (o0O0o0) o0OO0oO0.this.f14960o00oo00O.get((CaptureRequest.Builder) methodHookParam.thisObject);
            if (o0o0o0 != null) {
                o0o0o0.f15023o00oOOoO.remove(surface);
                o0o0o0.f15024o00oOo00 = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00ooO extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14980o00oo0O0;

        public o00ooO(Class cls) {
            this.f14980o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14980o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                o0OO0oO0.this.f14962o00oo0O0 = (CameraDevice) methodHookParam.args[0];
                o0OO0oO0.this.o00oo();
                o0OO0oO0.this.o00ooOOo((CameraDevice) methodHookParam.args[0]);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00ooO0 extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14982o00oo0O0;

        public o00ooO0(Class cls) {
            this.f14982o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14982o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass()) && methodHookParam.args[0].equals(o0OO0oO0.this.f14962o00oo0O0)) {
                o0OO0oO0.this.o00ooO0();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00 extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14984o00oo0O0;

        public o0O00(Class cls) {
            this.f14984o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj;
            if (this.f14984o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass()) && (obj = methodHookParam.args[0]) != null) {
                SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
                methodHookParam.args[0] = new SessionConfiguration(sessionConfiguration.getSessionType(), Arrays.asList(new OutputConfiguration(o0OO0oO0.this.f14952o00oOoO)), sessionConfiguration.getExecutor(), sessionConfiguration.getStateCallback());
                o0OO0oO0.this.o00oooo0(sessionConfiguration.getStateCallback());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O000 extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14986o00oo0O0;

        public o0O000(Class cls) {
            this.f14986o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14986o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass()) && methodHookParam.args[0] != null) {
                methodHookParam.args[0] = Arrays.asList(new OutputConfiguration(o0OO0oO0.this.f14952o00oOoO));
                Object obj = methodHookParam.args[1];
                if (obj != null) {
                    o0OO0oO0.this.o00oooo0((CameraCaptureSession.StateCallback) obj);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00000 extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14988o00oo0O0;

        public o0O00000(Class cls) {
            this.f14988o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14988o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass()) && methodHookParam.args[0].equals(o0OO0oO0.this.f14962o00oo0O0)) {
                o0OO0oO0.this.o00ooO0();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0000O extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14990o00oo0O0;

        public o0O0000O(Class cls) {
            this.f14990o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14990o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                Object[] objArr = methodHookParam.args;
                if (objArr[0] == null) {
                    return;
                }
                objArr[0] = Arrays.asList(o0OO0oO0.this.f14952o00oOoO);
                Object obj = methodHookParam.args[1];
                if (obj != null) {
                    o0OO0oO0.this.o00oooo0((CameraCaptureSession.StateCallback) obj);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O000O extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14992o00oo0O0;

        public o0O000O(Class cls) {
            this.f14992o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14992o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                Object[] objArr = methodHookParam.args;
                if (objArr[0] == null) {
                    return;
                }
                objArr[0] = Arrays.asList(o0OO0oO0.this.f14952o00oOoO);
                Object obj = methodHookParam.args[1];
                if (obj != null) {
                    o0OO0oO0.this.o00oooo0((CameraCaptureSession.StateCallback) obj);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O000Oo extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14994o00oo0O0;

        public o0O000Oo(Class cls) {
            this.f14994o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14994o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass()) && methodHookParam.args[1] != null) {
                methodHookParam.args[0] = Arrays.asList(new OutputConfiguration(o0OO0oO0.this.f14952o00oOoO));
                Object obj = methodHookParam.args[2];
                if (obj != null) {
                    o0OO0oO0.this.o00oooo0((CameraCaptureSession.StateCallback) obj);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O000o0 extends oOoo0.o00oOo00 {
        public o0O000o0() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (o0OO0oO0.this.f14957o00oOooO != null) {
                o0OO0oO0.this.o00ooO00();
            }
            Object obj = methodHookParam.args[0];
            if (obj == null) {
                return;
            }
            SurfaceTexture surfaceTexture = new SurfaceTexture(o0OO0oO0.this.f14947o00oOOo0.size() + 100);
            Surface surface = new Surface(surfaceTexture);
            o0O0o00 o0o0o00 = new o0O0o00(o0OO0oO0.this, null);
            o0o0o00.f15026o00oOOo0 = (Surface) obj;
            o0o0o00.f15028o00oOo00 = surface;
            o0o0o00.f15030o00oOooO = surfaceTexture;
            o0OO0oO0.this.f14947o00oOOo0.add(o0o0o00);
            methodHookParam.args[0] = surface;
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00O extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14997o00oo0O0;

        public o0O00O(Class cls) {
            this.f14997o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14997o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                byte[] bArr = o0OO0oO0.this.f14948o00oOOoO;
                if (bArr == null) {
                    methodHookParam.setResult((Object) null);
                } else {
                    methodHookParam.args[0] = bArr;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00O0 extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f14999o00oo0O0;

        public o0O00O0(Class cls) {
            this.f14999o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f14999o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass()) && methodHookParam.thisObject.equals(o0OO0oO0.this.f14962o00oo0O0)) {
                o0OO0oO0.this.o00ooO0();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00O0o extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15001o00oo0O0;

        public o0O00O0o(Class cls) {
            this.f15001o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            this.f15001o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass());
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00OO extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15003o00oo0O0;

        public o0O00OO(Class cls) {
            this.f15003o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object obj;
            if (this.f15003o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass()) && (obj = methodHookParam.args[0]) != null) {
                o0OO0oO0.this.o00ooOo((CameraCaptureSession) obj);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00OOO extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15005o00oo0O0;

        public o0O00OOO(Class cls) {
            this.f15005o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15005o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                o0OO0oO0.this.o00oooO(methodHookParam, true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00o00 extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15007o00oo0O0;

        public o0O00o00(Class cls) {
            this.f15007o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15007o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                o0OO0oO0.this.o00oooO(methodHookParam, true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O00oO0 extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15009o00oo0O0;

        public o0O00oO0(Class cls) {
            this.f15009o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15009o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                o0OO0oO0.this.o00oooO(methodHookParam, true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0O0O extends oOoo0.o00oOo00 {
        public o0O0O0O() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            if (o0OO0oO0.this.f14957o00oOooO != null) {
                o0OO0oO0.this.o00ooO00();
            }
            Object obj = methodHookParam.args[0];
            if (obj == null) {
                return;
            }
            SurfaceTexture surfaceTexture = (SurfaceTexture) obj;
            SurfaceTexture surfaceTexture2 = new SurfaceTexture(o0OO0oO0.this.f14947o00oOOo0.size() + 100);
            Surface surface = new Surface(surfaceTexture2);
            o0O0o00 o0o0o00 = new o0O0o00(o0OO0oO0.this, null);
            o0o0o00.f15027o00oOOoO = surfaceTexture;
            o0o0o00.f15026o00oOOo0 = new Surface(surfaceTexture);
            o0o0o00.f15028o00oOo00 = surface;
            o0o0o00.f15030o00oOooO = surfaceTexture2;
            o0OO0oO0.this.f14947o00oOOo0.add(o0o0o00);
            methodHookParam.args[0] = surfaceTexture2;
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0O0Oo extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15012o00oo0O0;

        public o0O0O0Oo(Class cls) {
            this.f15012o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15012o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                o0OO0oO0.this.o00oooO(methodHookParam, false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0O0o0 extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15014o00oo0O0;

        public o0O0O0o0(Class cls) {
            this.f15014o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15014o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                o0OO0oO0.this.o00oooO(methodHookParam, false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0OO implements Runnable {
        public o0O0OO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            oO0O00O.o0O0o(o0OO0.f14869o00oOOoO);
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0OO0 implements oO0OOo0o {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ int f15016o00oOOo0;

        public o0O0OO0(int i) {
            this.f15016o00oOOo0 = i;
        }

        @Override // o0OOoo0O.oO0OOo0o
        public void o00oOOo0(Object obj) {
            int i = this.f15016o00oOOo0;
            if (i == 1) {
                o0OO0oO0.this.o00ooO00();
            } else if (i == 2) {
                if (obj == null || obj.equals(o0OO0oO0.this.f14962o00oo0O0)) {
                    o0OO0oO0.this.o00ooO0();
                }
            }
        }

        @Override // o0OOoo0O.oO0OOo0o
        public void o00oOOoO(byte[] bArr) {
            if (o0OO0oO0.this.o00ooOO0() == 1) {
                o0OO0oO0.this.f14948o00oOOoO = bArr;
            }
        }

        @Override // o0OOoo0O.oO0OOo0o
        public void o00oOo00(byte[] bArr) {
            o0OO0oO0.this.f14949o00oOo00 = bArr;
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0OOO extends oOoo0.o00oOo00 {
        public o0O0OOO() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.args[0] != null) {
                o0OO0oO0.this.o00ooo0o(methodHookParam);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0OOO0 extends oOoo0.o00oOo00 {
        public o0O0OOO0() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.args[0] != null) {
                o0OO0oO0.this.o00ooo0o(methodHookParam);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0OOOo extends oOoo0.o00oOo00 {
        public o0O0OOOo() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            Object[] objArr = methodHookParam.args;
            Object obj = objArr[0];
            if (obj != null) {
                objArr[0] = new byte[((byte[]) obj).length];
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0o extends oOoo0.o00oOo00 {
        public o0O0o() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            o0OO0oO0.this.f14950o00oOo0O = ((Integer) methodHookParam.args[0]).intValue();
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0o0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public CaptureRequest f15022o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public HashSet<Surface> f15023o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public boolean f15024o00oOo00;

        public o0O0o0() {
            this.f15022o00oOOo0 = null;
            this.f15023o00oOOoO = new HashSet<>();
            this.f15024o00oOo00 = false;
        }

        public /* synthetic */ o0O0o0(o0OO0oO0 o0oo0oo0, o0O0o o0o0o) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0o00 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Surface f15026o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public SurfaceTexture f15027o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Surface f15028o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public SurfaceTexture f15030o00oOooO;

        public o0O0o00() {
        }

        public /* synthetic */ o0O0o00(o0OO0oO0 o0oo0oo0, o0O0o o0o0o) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0o000 extends oOoo0.o00oOo00 {
        public o0O0o000() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            o0OO0oO0.this.f14957o00oOooO = (Camera) methodHookParam.thisObject;
            try {
                o0OO0oO0.this.o00ooooo(1);
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0o00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public Surface f15032o00oOOo0 = null;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public oO0000O f15033o00oOOoO = null;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0OOO0O f15034o00oOo00 = null;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public oO000o00 f15038o00oOooO = null;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f15035o00oOo0O = false;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f15036o00oOo0o = false;

        public o0O0o00O() {
        }

        public String toString() {
            return o0OOoO0.o00oo.o00oOOo0(new byte[]{87, -70, -89, 108, -40, 109, 9, -3, 92, -119, -95, 104, -114}, new byte[]{58, -24, -62, Ascii.CR, -76, 62, 124, -113}) + this.f15032o00oOOo0;
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0oo0o extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15040o00oo0O0;

        public o0O0oo0o(Class cls) {
            this.f15040o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15040o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                o0OO0oO0.this.o00oooO(methodHookParam, false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0OoO00O extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15042o00oo0O0;

        public o0OoO00O(Class cls) {
            this.f15042o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15042o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                for (int i = 0; i < 500 && o0OO0oO0.this.f14949o00oOo00 == null; i++) {
                    try {
                        Thread.sleep(10L);
                    } catch (Throwable unused) {
                    }
                }
                if (o0OO0oO0.this.f14949o00oOo00 != null) {
                    methodHookParam.args[0] = o0OO0oO0.this.f14949o00oOo00;
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0OoOoOo extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15044o00oo0O0;

        public o0OoOoOo(Class cls) {
            this.f15044o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15044o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                Object[] objArr = methodHookParam.args;
                if (objArr[1] == null) {
                    return;
                }
                objArr[1] = Arrays.asList(o0OO0oO0.this.f14952o00oOoO);
                Object obj = methodHookParam.args[2];
                if (obj != null) {
                    o0OO0oO0.this.o00oooo0((CameraCaptureSession.StateCallback) obj);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0OooO0 extends oOoo0.o00oOo00 {
        public o0OooO0() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOooO(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.args[0] != null) {
                o0OO0oO0.this.o00ooo0o(methodHookParam);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0oO0O0o extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15047o00oo0O0;

        public o0oO0O0o(Class cls) {
            this.f15047o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15047o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                o0OO0oO0.this.o00oooO(methodHookParam, false);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0oO0Ooo extends oOoo0.o00oOo00 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Class f15049o00oo0O0;

        public o0oO0Ooo(Class cls) {
            this.f15049o00oo0O0 = cls;
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            if (this.f15049o00oo0O0.isAssignableFrom(methodHookParam.thisObject.getClass())) {
                o0OO0oO0.this.o00oooO(methodHookParam, true);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o0ooO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ oO000Oo0 f15050o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ List f15051o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ boolean f15052o00oo0Oo;

        public o0ooO(List list, oO000Oo0 oo000oo0, boolean z) {
            this.f15051o00oo0O0 = list;
            this.f15050o00oo0O = oo000oo0;
            this.f15052o00oo0Oo = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0OO0oO0.this.f14953o00oOoO0.addAll(this.f15051o00oo0O0);
            oO000Oo0 oo000oo0 = this.f15050o00oo0O;
            if (oo000oo0 != null) {
                o0OO0o o0oo0o = oo000oo0.f15198o00oOoOo;
                o0oo0o.f14939o00oOOoO = this.f15052o00oo0Oo;
                o0oo0o.f14940o00oOo00 = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class oo0OOoo extends oOoo0.o00oOo00 {
        public oo0OOoo() {
        }

        @Override // o0ooO0O0.oOoo0.o00oOo00
        public void o00oOOoO(XC_MethodHook.MethodHookParam methodHookParam) {
            if (methodHookParam.args[1] != null) {
                o0OO0oO0.this.o00oooOo(methodHookParam);
            }
            if (methodHookParam.args[3] != null) {
                o0OO0oO0.this.o00oooOO(methodHookParam, 3);
            }
            oO000Oo0 oo000oo0 = o0OO0oO0.this.f14951o00oOo0o;
            if (oo000oo0 != null) {
                oo000oo0.f15197o00oOoOO.f14942o00oOOo0 = true;
            }
        }
    }

    public static void o0(String str) {
        oO0Oo0o0.o00oOoO(str);
    }

    public static void o00ooo0O(String str) {
        o0OOoO0.o00oo.o00oOOo0(new byte[]{65, -83, 77, -1, -118}, new byte[]{112, -97, 126, -53, -65, -38, -105, -37});
    }

    public final void o00oo() {
        SurfaceTexture surfaceTexture = this.f14954o00oOoOO;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f14954o00oOoOO = null;
        }
        Surface surface = this.f14952o00oOoO;
        if (surface != null) {
            surface.release();
            this.f14952o00oOoO = null;
        }
        this.f14954o00oOoOO = new SurfaceTexture(115);
        this.f14952o00oOoO = new Surface(this.f14954o00oOoOO);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x000d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<o0OOoo0O.o0OO0oO0.o0O0o00O> o00ooO(java.util.List<o0OOoo0O.o0OO0oO0.o0O0o00O> r10, o0OOoo0O.o0OO0oO0.o0O0o0 r11, boolean r12) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet<android.view.Surface> r1 = r11.f15023o00oOOoO
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        Ld:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ldb
            java.lang.Object r4 = r1.next()
            android.view.Surface r4 = (android.view.Surface) r4
            android.view.Surface r5 = r9.f14952o00oOoO
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L22
            goto Ld
        L22:
            java.util.HashSet<android.view.Surface> r5 = r11.f15023o00oOOoO
            int r5 = r5.size()
            r6 = 1
            if (r5 != r6) goto L4f
            java.util.Iterator r5 = r10.iterator()
        L2f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L41
            java.lang.Object r7 = r5.next()
            o0OOoo0O.o0OO0oO0$o0O0o00O r7 = (o0OOoo0O.o0OO0oO0.o0O0o00O) r7
            boolean r7 = r7.f15035o00oOo0O
            if (r7 == 0) goto L2f
            r5 = r6
            goto L42
        L41:
            r5 = r2
        L42:
            if (r5 == 0) goto L4b
            boolean r5 = o0OOoo0O.oO0OoOO0.o00oOo00(r4)
            if (r12 == r5) goto L56
            goto Ld
        L4b:
            if (r12 == 0) goto Ld
            r3 = r6
            goto L56
        L4f:
            boolean r5 = o0OOoo0O.oO0OoOO0.o00oOo00(r4)
            if (r12 == r5) goto L56
            goto Ld
        L56:
            java.util.Iterator r5 = r10.iterator()
        L5a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L73
            java.lang.Object r7 = r5.next()
            o0OOoo0O.o0OO0oO0$o0O0o00O r7 = (o0OOoo0O.o0OO0oO0.o0O0o00O) r7
            android.view.Surface r8 = r7.f15032o00oOOo0
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L5a
            r0.add(r7)
            r5 = r6
            goto L74
        L73:
            r5 = r2
        L74:
            if (r5 == 0) goto L77
            goto Ld
        L77:
            o0OOoo0O.o0OO0oO0$o0O0o00O r5 = new o0OOoo0O.o0OO0oO0$o0O0o00O
            r5.<init>()
            r5.f15032o00oOOo0 = r4
            boolean r7 = o0OOoo0O.oO0OoOO0.o00oOo00(r4)
            if (r7 != 0) goto L89
            if (r3 == 0) goto L87
            goto L89
        L87:
            r7 = r2
            goto L8a
        L89:
            r7 = r6
        L8a:
            r5.f15035o00oOo0O = r7
            java.util.HashMap<android.view.Surface, o0OOoo0O.oO0000O> r7 = r9.f14955o00oOoOo
            java.lang.Object r7 = r7.get(r4)
            o0OOoo0O.oO0000O r7 = (o0OOoo0O.oO0000O) r7
            r5.f15033o00oOOoO = r7
            if (r3 == 0) goto Lab
            if (r7 == 0) goto Lab
            android.media.ImageReader r7 = r7.f15127o00oOOo0
            int r7 = r7.getImageFormat()
            r8 = 256(0x100, float:3.59E-43)
            if (r7 == r8) goto Lab
            o0OOoo0O.oO0000O r7 = r5.f15033o00oOOoO
            r9.o0O0000O(r7)
            r5.f15036o00oOo0o = r6
        Lab:
            boolean r7 = r5.f15035o00oOo0O
            if (r7 != 0) goto Ld6
            o0OOoo0O.oO0000O r7 = r5.f15033o00oOOoO
            if (r7 == 0) goto Lbc
            android.media.ImageReader r7 = r7.f15127o00oOOo0
            int r7 = r7.getImageFormat()
            if (r7 != r6) goto Lbc
            goto Lbd
        Lbc:
            r6 = r2
        Lbd:
            if (r6 == 0) goto Lcb
            boolean r4 = r9.o0O00000(r5, r4)
            if (r4 != 0) goto Ld6
            o0OOoo0O.oO0000O r4 = r5.f15033o00oOOoO
            r9.o0O0000O(r4)
            goto Ld6
        Lcb:
            o0OOoo0O.oO0000O r6 = r5.f15033o00oOOoO
            boolean r6 = r9.o0O0000O(r6)
            if (r6 != 0) goto Ld6
            r9.o0O00000(r5, r4)
        Ld6:
            r0.add(r5)
            goto Ld
        Ldb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOoo0O.o0OO0oO0.o00ooO(java.util.List, o0OOoo0O.o0OO0oO0$o0O0o0, boolean):java.util.List");
    }

    public final void o00ooO0() {
        oO0O00O.o00oOoOO();
        SurfaceTexture surfaceTexture = this.f14954o00oOoOO;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f14954o00oOoOO = null;
        }
        Surface surface = this.f14952o00oOoO;
        if (surface != null) {
            surface.release();
            this.f14952o00oOoO = null;
        }
        o00ooO0o();
        for (oO0000O oo0000o : this.f14955o00oOoOo.values()) {
            o00ooooO(oo0000o);
        }
        this.f14955o00oOoOo.clear();
        for (o0O0o00O o0o0o00o : this.f14963o00oo0OO.values()) {
            o00oooo(o0o0o00o);
        }
        this.f14963o00oo0OO.clear();
        this.f14953o00oOoO0.clear();
        this.f14960o00oo00O.clear();
        this.f14962o00oo0O0 = null;
    }

    public final void o00ooO00() {
        oO0O00O.o00oOoOO();
        o00ooO0O();
        for (o0O0o00 o0o0o00 : this.f14947o00oOOo0) {
            if (o0o0o00.f15027o00oOOoO != null) {
                o0o0o00.f15026o00oOOo0.release();
                Surface surface = o0o0o00.f15026o00oOOo0;
                if (surface != null && surface.isValid()) {
                    o0o0o00.f15026o00oOOo0.release();
                }
            }
            Surface surface2 = o0o0o00.f15028o00oOo00;
            if (surface2 != null && surface2.isValid()) {
                o0o0o00.f15028o00oOo00.release();
            }
            SurfaceTexture surfaceTexture = o0o0o00.f15030o00oOooO;
            if (surfaceTexture != null) {
                surfaceTexture.release();
            }
        }
        this.f14947o00oOOo0.clear();
        this.f14950o00oOo0O = 0;
        this.f14957o00oOooO = null;
    }

    public final void o00ooO0O() {
        oO000Oo0 oo000oo0 = this.f14951o00oOo0o;
        if (oo000oo0 != null) {
            oo000oo0.o00ooO00();
            this.f14951o00oOo0o = null;
        }
    }

    public final void o00ooO0o() {
        oO000Oo0 oo000oo0 = this.f14958o00oOooo;
        if (oo000oo0 != null) {
            oo000oo0.o00ooO00();
            this.f14958o00oOooo = null;
        }
    }

    public oO000Oo0 o00ooOO() {
        if (o00ooOO0() == 1) {
            return this.f14951o00oOo0o;
        }
        if (o00ooOO0() == 2) {
            return this.f14958o00oOooo;
        }
        return null;
    }

    public int o00ooOO0() {
        if (this.f14957o00oOooO != null) {
            return 1;
        }
        return this.f14962o00oo0O0 != null ? 2 : -1;
    }

    public final void o00ooOOo(CameraDevice cameraDevice) {
        Class<?> cls = cameraDevice.getClass();
        oOoo0.o00oOOo0(cameraDevice.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-54, -92, -90, -3, -15, 73, -3, -17, -39, -94, -74, -18, -32, Byte.MAX_VALUE, -37, -3, -38, -65, -84, -14}, new byte[]{-87, -42, -61, -100, -123, 44, -66, -114}), List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o0O0000O(cls));
        oOoo0.o00oOOo0(cameraDevice.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{19, -108, -6, 99, -95, -58, -90, 47, 0, -110, -22, 112, -80, -16, Byte.MIN_VALUE, o0OOO0oo.oo0OOoo.f13516o00oOoO, 3, -113, -16, 108, -105, -38, -86, 59, 4, -106, -22, 118, -106, -52, -117, 40, Ascii.EM, -127, -22, 112, -76, -41, -116, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, Ascii.RS, -107}, new byte[]{112, -26, -97, 2, -43, -93, -27, 78}), List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o0O000(cls));
        oOoo0.o00oOOo0(cameraDevice.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-55, -119, -86, 2, -83, 51, -32, 98, -60, -120, -69, 17, -72, 63, -51, 104, -50, -77, -90, 4, -79, 5, -45, 104, -49, -97, -116, 2, -87, 34, -42, Byte.MAX_VALUE, -49, -88, -86, Ascii.DLE, -86, 63, -52, 99}, new byte[]{-86, -5, -49, 99, -39, 86, -93, Ascii.CR}), List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o0O000O(cls));
        oOoo0.o00oOOo0(cameraDevice.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-115, Ascii.FS, 40, -124, 10, -86, 88, -3, -98, Ascii.FS, 34, -122, Ascii.ESC, -68, 121, -7, -116, 2, 40, -90, Ascii.US, -65, 126, -19, -100, Ascii.VT, Ascii.RS, Byte.MIN_VALUE, Ascii.CR, -68, 99, -9, Byte.MIN_VALUE}, new byte[]{-18, 110, 77, -27, 126, -49, 10, -104}), InputConfiguration.class, List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o0OoOoOo(cls));
        oOoo0.o00oOOo0(cameraDevice.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.ETB, -14, 5, -118, 39, 54, 65, Ascii.NAK, 4, -14, Ascii.SI, -120, 54, 32, 96, 17, Ascii.SYN, -20, 5, -88, 50, 35, 103, 5, 6, -27, 51, -114, 32, 32, 122, Ascii.US, Ascii.SUB, -62, Ascii.EM, -88, 60, o0OOO0oo.oo0OOoo.f13516o00oOoO, 117, Ascii.EM, 19, -11, Ascii.DC2, -118, 39, 58, 124, Ascii.RS, 7}, new byte[]{116, Byte.MIN_VALUE, 96, -21, 83, 83, 19, 112}), InputConfiguration.class, List.class, CameraCaptureSession.StateCallback.class, Handler.class, new o0O000Oo(cls));
        oOoo0.o00oOOo0(cameraDevice.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-88, 104, -71, -122, Ascii.US, 58, 84, -109, -69, 110, -87, -107, Ascii.SO, Ascii.FF, 114, -127, -72, 115, -77, -119}, new byte[]{-53, Ascii.SUB, -36, -25, 107, 95, Ascii.ETB, -14}), SessionConfiguration.class, new o0O00(cls));
        oOoo0.o00oOOo0(cameraDevice.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-36, 98, -83, -40, -99}, new byte[]{-65, Ascii.SO, -62, -85, -8, 82, 101, -20}), new o0O00O0(cls));
    }

    public final void o00ooOo(CameraCaptureSession cameraCaptureSession) {
        Class<?> cls = cameraCaptureSession.getClass();
        oOoo0.o00oOo0o(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{93, -34, 91, -81, -8, -1, 56, 100, 90, -46, 65, -102, -33, -6, 47, 118, 90}, new byte[]{46, -69, 47, -3, -99, -113, 93, 5}), new o0O00OOO(cls));
        oOoo0.o00oOo0o(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{10, -126, 117, 49, Ascii.SYN, 98, 92, -56, Ascii.CR, -114, 111, 4, 49, 103, 75, -38, Ascii.CR, -75, 100, Ascii.DC2, 6, 119, 74, -35, 10}, new byte[]{121, -25, 1, 99, 115, Ascii.DC2, 57, -87}), new o0oO0Ooo(cls));
        oOoo0.o00oOo0o(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{36, -88, 17, o0OOO0oo.oo0OOoo.f13516o00oOoO, Ascii.NAK, 71, 53, -125, 35, -92, Ascii.VT, 8, 34, 82, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, -105, 50, -66, 17}, new byte[]{87, -51, 101, 111, 112, 55, 80, -30}), new o0O00o00(cls));
        oOoo0.o00oOo0o(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{19, -86, -94, 112, -36, -106, 41, -89, 5, -99, -77, 83, -48, -103, 58, -94, Ascii.SO, -88, -124, 70, -60, -115, 43, -72, Ascii.DC4}, new byte[]{96, -49, -42, 35, -75, -8, 78, -53}), new o0O00oO0(cls));
        oOoo0.o00oOo0o(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 38, -110, 45, -59, Ascii.CAN, 122}, new byte[]{66, 71, -30, 89, -80, 106, Ascii.US, 85}), new o0oO0O0o(cls));
        oOoo0.o00oOo0o(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{55, 93, -32, -99, 81, -4, 123, 78, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 78, -29, -99}, new byte[]{84, 60, -112, -23, 36, -114, Ascii.RS, Ascii.FF}), new o0O0oo0o(cls));
        oOoo0.o00oOo0o(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.DC2, 4, Ascii.DC4, 42, 46, 0, 103, 6, 4, Ascii.ETB, Ascii.ETB, 42, 9, Ascii.ETB, 115, 49, Ascii.DC4, Ascii.SYN, Ascii.DLE, 45}, new byte[]{113, 101, 100, 94, 91, 114, 2, 68}), new o0O0O0Oo(cls));
        oOoo0.o00oOo0o(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{-13, -58, 101, 59, -114, 94, -101, 90, -7, -55, 114, 35, -98, 126, -101, 120, -27, -62, 102, 59}, new byte[]{-112, -89, Ascii.NAK, 79, -5, 44, -2, 9}), new o0O0O0o0(cls));
    }

    public final void o00ooOo0(CameraDevice.StateCallback stateCallback) {
        Class<?> cls = stateCallback.getClass();
        oOoo0.o00oOOo0(stateCallback.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-81, -103, -51, -121, -104, 116, -48, 74}, new byte[]{-64, -9, -114, -21, -9, 7, -75, 46}), CameraDevice.class, new o00ooO0(cls));
        oOoo0.o00oOOo0(stateCallback.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{113, 95, -1, 6, 110, -121, 1, Ascii.SUB}, new byte[]{Ascii.RS, 49, -80, 118, Ascii.VT, -23, 100, 126}), CameraDevice.class, new o00ooO(cls));
        oOoo0.o00oOOo0(stateCallback.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{91, Ascii.ETB, -21, 124, -52, -95, 100}, new byte[]{52, 121, -82, Ascii.SO, -66, -50, Ascii.SYN, -118}), CameraDevice.class, Integer.TYPE, new o0(cls));
        oOoo0.o00oOOo0(stateCallback.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.SUB, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 82, Ascii.DLE, -71, o0OOO0oo.oo0OOoo.f13516o00oOoO, -83, -31, Ascii.ESC, 42, 117, Ascii.CR, -81, 58}, new byte[]{117, 79, Ascii.SYN, 121, -54, 94, -62, -113}), CameraDevice.class, new o0O00000(cls));
    }

    public final void o00ooOoO() {
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-57, -36, 117, 94, -12, Ascii.DC2, Ascii.DC2, 98, -43, -64, 78, 104, -12, 4, Ascii.FF, 122, -43, -51, 104, 117, -13}, new byte[]{-76, -71, 1, Ascii.SUB, -99, 97, 98, Ascii.SO}), Integer.TYPE, new o0O0o());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{111, -28, 52, 71, 119, 39, -110, -24, 121, -10, 19, 98, 119, 36, -123, -30, 121}, new byte[]{Ascii.FS, -127, SignedBytes.MAX_POWER_OF_TWO, Ascii.ETB, 5, 66, -28, -127}), Surface.class, new o0O000o0());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-118, 66, -35, 60, -63, 19, 59, -47, -100, 80, -3, 9, -53, 2, 56, -54, -100}, new byte[]{-7, 39, -87, 108, -77, 118, 77, -72}), SurfaceTexture.class, new o0O0O0O());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{78, 124, 83, -56, 90, 72, -96, -26, 88, 110, 100, -7, 68, 65, -76, -18, 94, 114}, new byte[]{o0OOO0oo.oo0OOoo.f13516o00oOoO, Ascii.EM, 39, -104, 40, 45, -42, -113}), Camera.PreviewCallback.class, new o0O0OOO0());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-99, 68, 57, 97, 74, -110, -72, -119, -117, 86, Ascii.SO, 80, 84, -101, -84, -127, -115, 74, Ascii.SUB, 88, 76, -97, -116, -107, -120, 71, 40, 67}, new byte[]{-18, o0Oo0oo0.o0OO0o00.f16655o00oOoOO, 77, 49, 56, -9, -50, -32}), Camera.PreviewCallback.class, new o0O0OOO());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{88, Ascii.CR, 0, 68, 106, -85, -33, -55, 88, 10, Ascii.SI, 69, 126, -95, -43, -50, 75}, new byte[]{57, 105, 100, 7, Ascii.VT, -57, -77, -85}), byte[].class, new o0O0OOOo());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-100, 45, -92, Ascii.SUB, Ascii.SI, 86, -83, 115, Byte.MIN_VALUE, 60, Byte.MIN_VALUE, 39, 4, 69, -105, 126, -104, Ascii.VT, -79, 57, Ascii.CR, 81, -97, 120, -124}, new byte[]{-17, 72, -48, 85, 97, 51, -2, Ascii.ESC}), Camera.PreviewCallback.class, new o0OooO0());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-27, -23, -36, -96, 51, -123, -81, 40, -28, -6, -46}, new byte[]{-111, -120, -73, -59, 99, -20, -52, 92}), Camera.ShutterCallback.class, Camera.PictureCallback.class, Camera.PictureCallback.class, Camera.PictureCallback.class, new oo0OOoo());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-24, -86, 67, 106, 3, Ascii.ESC, Ascii.SUB, Ascii.GS, -19, -73, 71, 111}, new byte[]{-101, -34, 34, Ascii.CAN, 119, 75, 104, 120}), new o0O0o000());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{97, 110, 59, 93, -73, -31, Ascii.RS, -123, 123, Byte.MAX_VALUE, 35}, new byte[]{Ascii.DC2, Ascii.SUB, 84, 45, -25, -109, 123, -13}), new o00oOOo0());
        oOoo0.o00oOOo0(Camera.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-118, Ascii.DC4, 36, -41, 55, -111, -31}, new byte[]{-8, 113, 72, -78, 86, -30, -124, -81}), new o00oOOoO());
    }

    public final void o00ooOoo() {
        oOoo0.o00oOOo0(CameraManager.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-92, -93, 97, -26, 56, 78, 55, 84, -94, -123, 125, -60, 43, 66, 49, 82, -90, -76, 124, -42, 45, 74, 49, 85}, new byte[]{-61, -58, Ascii.NAK, -91, 89, 35, 82, 38}), String.class, new o00oOo00());
        oOoo0.o00oOOo0(CameraManager.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-100, -102, -23, 19, 37, -56, Ascii.ETB, 101, -127, -117}, new byte[]{-13, -22, -116, 125, 102, -87, 122, 0}), String.class, CameraDevice.StateCallback.class, Handler.class, new o00oOo0O());
        oOoo0.o00oOOo0(CameraManager.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-101, Ascii.FF, Ascii.DLE, 110, 37, 120, -126, 5, -122, Ascii.GS}, new byte[]{-12, 124, 117, 0, 102, Ascii.EM, -17, 96}), String.class, Executor.class, CameraDevice.StateCallback.class, new o00oOoO());
        oOoo0.o00oOOo0(CaptureRequest.Builder.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{126, 32, -21, 85, -91, -36, -56, 96, 107}, new byte[]{Ascii.US, 68, -113, 1, -60, -82, -81, 5}), Surface.class, new o00oo00O());
        oOoo0.o00oOOo0(CaptureRequest.Builder.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{77, -121, -53, -94, 122}, new byte[]{47, -14, -94, -50, Ascii.RS, 38, 50, -15}), new o00oo0());
        oOoo0.o00oOOo0(CaptureRequest.Builder.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-61, -9, -38, 4, -40, 41, 63, -116, -61, -11, -46, Ascii.US}, new byte[]{-79, -110, -73, 107, -82, 76, 107, -19}), Surface.class, new o00oo0OO());
        oOoo0.o00oOOo0(ImageReader.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-127, 103, 90, 92, -93}, new byte[]{-30, Ascii.VT, 53, 47, -58, -7, 53, 109}), new o00oo0O0());
        oOoo0.o00oOo0o(ImageReader.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-33, 17, Ascii.CAN, -6, 39, 48, 112, 69, -33, Ascii.ETB, 10}, new byte[]{-79, 116, 111, -77, 73, 67, 4, 36}), new o00oo0O());
        oOoo0.o00oOOo0(CameraCaptureSession.CaptureCallback.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{120, -108, -28, -28, -67, -102, Ascii.DLE, -30, 114, -68, -58, -20, -95, -117, 1}, new byte[]{Ascii.ETB, -6, -89, -123, -51, -18, 101, -112}), CameraCaptureSession.class, CaptureRequest.class, CaptureFailure.class, new o00oo());
    }

    public final void o00ooo0() {
    }

    public void o00ooo00(o0OO o0oo) throws Exception {
        this.f14961o00oo0O = o0oo;
        if (o0oo.f14932o00oOOoO) {
            if (!o0oo.o00oOOo0()) {
                oO0Oo0o0.o00oOoO(o0OOoO0.o00oo.o00oOOo0(new byte[]{122, 44, -31, -90, Byte.MIN_VALUE, 55, -112, -24, 88, 101, -32, -69, -122, 100, -118, -87}, new byte[]{44, 69, -123, -61, -17, Ascii.ETB, -2, -121}));
                return;
            }
            o00ooOoO();
            o00ooOoo();
        }
    }

    public final void o00ooo0o(XC_MethodHook.MethodHookParam methodHookParam) {
        Class<?> cls = methodHookParam.args[0].getClass();
        oOoo0.o00oOOo0(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{116, 119, 100, 123, Ascii.EM, -97, 70, Ascii.SI, 108, 95, 70, 104, 17, -116}, new byte[]{Ascii.ESC, Ascii.EM, 52, 9, 124, -23, 47, 106}), byte[].class, Camera.class, new o0O00O(cls));
    }

    public final void o00oooO(XC_MethodHook.MethodHookParam methodHookParam, boolean z) {
        HashSet<Surface> hashSet;
        try {
            Object obj = methodHookParam.args[0];
            if (obj == null) {
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                list.size();
                obj = list.get(0);
            }
            CaptureRequest captureRequest = (CaptureRequest) obj;
            if (captureRequest == null) {
                return;
            }
            o0O0o0 o0o0o0 = null;
            Iterator<CaptureRequest.Builder> it = this.f14960o00oo00O.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o0O0o0 o0o0o02 = this.f14960o00oo00O.get(it.next());
                if (o0o0o02.f15022o00oOOo0.equals(captureRequest)) {
                    o0o0o0 = o0o0o02;
                    break;
                }
            }
            if (o0o0o0 != null && (hashSet = o0o0o0.f15023o00oOOoO) != null && hashSet.size() > 0) {
                CaptureRequest captureRequest2 = this.f14959o00oo0;
                if (captureRequest2 == null || !captureRequest2.equals(captureRequest) || o0o0o0.f15024o00oOo00) {
                    o0o0o0.f15024o00oOo00 = false;
                    this.f14959o00oo0 = captureRequest;
                    ArrayList arrayList = new ArrayList(this.f14953o00oOoO0);
                    List<o0O0o00O> o00ooO2 = o00ooO(arrayList, o0o0o0, true);
                    this.f14953o00oOoO0.clear();
                    this.f14953o00oOoO0.addAll(o00ooO2);
                    o00ooooo(2);
                    oO0OO0O.o00oOo0o(new o0ooO(o00ooO(arrayList, o0o0o0, false), this.f14958o00oOooo, z), 1000L);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void o00oooOO(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        Class<?> cls = methodHookParam.args[i].getClass();
        oOoo0.o00oOOo0(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{-33, 87, 86, -31, 58, -79, -5, Byte.MIN_VALUE, -43, 109, 103, -29, 60, -85}, new byte[]{-80, 57, 6, -120, 89, -59, -114, -14}), byte[].class, Camera.class, new o0OoO00O(cls));
    }

    public final void o00oooOo(XC_MethodHook.MethodHookParam methodHookParam) {
        Class<?> cls = methodHookParam.args[1].getClass();
        oOoo0.o00oOOo0(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{4, -51, 79, -31, -13, 68, -73, 45, Ascii.SO, -9, 126, -29, -11, 94}, new byte[]{107, -93, Ascii.US, -120, -112, 48, -62, 95}), byte[].class, Camera.class, new o0O00O0o(cls));
    }

    public final void o00oooo(o0O0o00O o0o0o00o) {
        oO000o00 oo000o00;
        if (o0o0o00o == null || (oo000o00 = o0o0o00o.f15038o00oOooO) == null) {
            return;
        }
        try {
            oo000o00.o00oOoO0();
            o0o0o00o.f15034o00oOo00.o00oOoOo();
            o0o0o00o.f15034o00oOo00.o00oo00O();
        } catch (Throwable unused) {
        }
    }

    public final void o00oooo0(CameraCaptureSession.StateCallback stateCallback) {
        if (stateCallback == null) {
            return;
        }
        Class<?> cls = stateCallback.getClass();
        oOoo0.o00oOOo0(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{-88, 103, -18, 124, -123, 74, -75, 19, -78, 123, -56, 119}, new byte[]{-57, 9, -83, 19, -21, 44, -36, 116}), CameraCaptureSession.class, new o0O00OO(cls));
    }

    public final void o00ooooO(oO0000O oo0000o) {
        ImageWriter imageWriter;
        if (oo0000o == null || (imageWriter = oo0000o.f15128o00oOOoO) == null) {
            return;
        }
        try {
            imageWriter.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void o00ooooo(int i) {
        if (o00ooOO0() != i) {
            return;
        }
        boolean z = true;
        if (i != 1 || this.f14951o00oOo0o == null) {
            if (i != 2 || this.f14958o00oOooo == null) {
                oO000Oo0 oo000oo0 = new oO000Oo0();
                if (i == 1) {
                    this.f14951o00oOo0o = oo000oo0;
                } else if (i == 2) {
                    this.f14958o00oOooo = oo000oo0;
                }
                oo000oo0.o00oo(this, this.f14961o00oo0O, new o0O0OO0(i));
                Surface surface = 0;
                if (o00ooOO0() == 1) {
                    int previewFormat = this.f14957o00oOooO.getParameters().getPreviewFormat();
                    o0OO0o00 o0oo0o00 = new o0OO0o00();
                    o0oo0o00.f14943o00oOOoO = this.f14957o00oOooO.getParameters().getPictureSize();
                    o0oo0o00.f14944o00oOo00 = previewFormat;
                    o0oo0o00.f14945o00oOooO = this.f14957o00oOooO;
                    for (o0O0o00 o0o0o00 : this.f14947o00oOOo0) {
                        try {
                            boolean o00oOo002 = oO0OoOO0.o00oOo00(o0o0o00.f15026o00oOOo0);
                            int i2 = this.f14957o00oOooO.getParameters().getPreviewSize().width;
                            int i3 = this.f14957o00oOooO.getParameters().getPreviewSize().height;
                            try {
                                Size o00oOOoO2 = oO0OoOO0.o00oOOoO(o0o0o00.f15026o00oOOo0);
                                if ((o00oOOoO2.getWidth() > 10) & (o00oOOoO2.getHeight() > 10)) {
                                    i2 = o00oOOoO2.getWidth();
                                    i3 = o00oOOoO2.getHeight();
                                }
                            } catch (Throwable unused) {
                            }
                            SurfaceTexture surfaceTexture = o0o0o00.f15027o00oOOoO;
                            if (surfaceTexture != null) {
                                surfaceTexture.setDefaultBufferSize(i2, i3);
                            }
                            if (o00oOo002) {
                                surface = o0o0o00.f15026o00oOOo0;
                                break;
                            }
                        } catch (Throwable unused2) {
                        }
                        Surface surface2 = o0o0o00.f15026o00oOOo0;
                        if (surface2 != null) {
                            surface = surface2;
                        }
                    }
                    int i4 = this.f14957o00oOooO.getParameters().getPreviewSize().width;
                    int i5 = this.f14957o00oOooO.getParameters().getPreviewSize().height;
                    try {
                        Size o00oOOoO3 = oO0OoOO0.o00oOOoO(surface);
                        boolean z2 = o00oOOoO3.getWidth() > 10;
                        if (o00oOOoO3.getHeight() <= 10) {
                            z = false;
                        }
                        if (z & z2) {
                            i4 = o00oOOoO3.getWidth();
                            i5 = o00oOOoO3.getHeight();
                        }
                    } catch (Throwable unused3) {
                    }
                    oo000oo0.f15197o00oOoOO = o0oo0o00;
                    oo000oo0.o00ooO0O(surface, i4, i5, false);
                } else if (o00ooOO0() == 2) {
                    Iterator<o0O0o00O> it = this.f14953o00oOoO0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        o0O0o00O next = it.next();
                        if (next.f15035o00oOo0O) {
                            surface = next;
                            break;
                        }
                    }
                    oo000oo0.f15198o00oOoOo.f14941o00oOooO = this.f14962o00oo0O0;
                    Size o00oOOoO4 = oO0OoOO0.o00oOOoO(surface.f15032o00oOOo0);
                    oo000oo0.o00ooO0O(surface.f15032o00oOOo0, o00oOOoO4.getWidth(), o00oOOoO4.getHeight(), surface.f15036o00oOo0o);
                }
                oO0OO0O.o00oOo0o(new o0O0OO(), 2000L);
            }
        }
    }

    public final boolean o0O00000(o0O0o00O o0o0o00o, Surface surface) {
        o0OOO0O o0ooo0o;
        oO000o00 oo000o00;
        oO000o00 oo000o002 = null;
        try {
            o0ooo0o = new o0OOO0O(this.f14958o00oOooo.f15191o00oOOoO.f15084o00oOOoO, 0);
            try {
                oo000o00 = new oO000o00(o0ooo0o, surface, false);
            } catch (Throwable unused) {
            }
            try {
                o0o0o00o.f15034o00oOo00 = o0ooo0o;
                o0o0o00o.f15038o00oOooO = oo000o00;
                this.f14963o00oo0OO.put(surface, o0o0o00o);
                return true;
            } catch (Throwable unused2) {
                oo000o002 = oo000o00;
                if (oo000o002 != null) {
                    try {
                        oo000o002.o00oOoO0();
                    } catch (Throwable unused3) {
                    }
                }
                if (o0ooo0o != null) {
                    try {
                        o0ooo0o.o00oOoOo();
                        o0ooo0o.o00oo00O();
                    } catch (Throwable unused4) {
                    }
                }
                return false;
            }
        } catch (Throwable unused5) {
            o0ooo0o = null;
        }
    }

    public final boolean o0O0000O(oO0000O oo0000o) {
        ImageReader imageReader = oo0000o.f15127o00oOOo0;
        if (imageReader == null) {
            return false;
        }
        try {
            if (imageReader.getImageFormat() == 256) {
                oo0000o.f15128o00oOOoO = (ImageWriter) new ooOOO0Oo((Class<?>) ImageWriter.class).o00oOo0o(o0OOoO0.o00oo.o00oOOo0(new byte[]{-15, 35, -83, Ascii.FF, -121, -125, 38, 60, -15, 37, -65}, new byte[]{-97, 70, -38, 69, -23, -16, 82, 93}), imageReader.getSurface(), Integer.valueOf(imageReader.getMaxImages()), Integer.valueOf(imageReader.getImageFormat()), Integer.valueOf(imageReader.getWidth() * imageReader.getHeight()), 1).o00oo0O0();
            } else {
                oo0000o.f15128o00oOOoO = ImageWriter.newInstance(imageReader.getSurface(), imageReader.getMaxImages());
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
