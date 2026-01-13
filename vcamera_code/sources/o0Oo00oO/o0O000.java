package o0Oo00oO;

import android.location.Location;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Objects;
import multispace.multiapp.clone.bean.LocationInfo;
import o0OOO0oo.oo0OOoo;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.ooOOO0Oo;
/* loaded from: classes3.dex */
public class o0O000 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static LocationInfo f15649o00oOOo0;

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15650o00oo0O0;

        public o00oOOo0(double[] dArr) {
            this.f15650o00oo0O0 = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(Double.valueOf(this.f15650o00oo0O0[1]));
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15651o00oo0O0;

        public o00oOOoO(double[] dArr) {
            this.f15651o00oo0O0 = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(Double.valueOf(this.f15651o00oo0O0[0]));
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15652o00oo0O0;

        public o00oOo00(double[] dArr) {
            this.f15652o00oo0O0 = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(Double.valueOf(this.f15652o00oo0O0[1]));
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15653o00oo0O0;

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements InvocationHandler {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final /* synthetic */ Object f15654o00oOOo0;

            public o00oOOo0(Object obj) {
                this.f15654o00oOOo0 = obj;
            }

            @Override // java.lang.reflect.InvocationHandler
            public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
                if (method.getName().equals(o0OOoO0.o00oo.o00oOOo0(new byte[]{-63, Ascii.ESC, 82, 96, 77, -42, -15, 115, -63, Ascii.ESC, 93, 103, 79, -39, -30, Byte.MAX_VALUE, -54}, new byte[]{-82, 117, Ascii.RS, Ascii.SI, 46, -73, -123, Ascii.SUB}))) {
                    try {
                        Object obj2 = objArr[0];
                        new ooOOO0Oo(obj2).o00oOo0o(o0OOoO0.o00oo.o00oOOo0(new byte[]{-54, 115, -60, -79, -26, -79, 43, 100, -51, 99, -44, -104}, new byte[]{-71, Ascii.SYN, -80, -3, -119, -33, 76, Ascii.CR}), Double.valueOf(o00oOo0O.this.f15653o00oo0O0[0]));
                        new ooOOO0Oo(obj2).o00oOo0o(o0OOoO0.o00oo.o00oOOo0(new byte[]{-111, -122, -96, Ascii.SYN, -18, -60, -30, 111, -105, -121, -79}, new byte[]{-30, -29, -44, 90, -113, -80, -117, Ascii.ESC}), Double.valueOf(o00oOo0O.this.f15653o00oo0O0[1]));
                        o0OOoO0.o00oo.o00oOOo0(new byte[]{85, o0OO0o00.f16655o00oOoOO, 56, 10, 89}, new byte[]{100, Ascii.DLE, 9, 59, 104, -21, -98, -29});
                        o0OOoO0.o00oo.o00oOOo0(new byte[]{-2, 17, -102, -43, -93, 85, -94, -89, -2, 17, -102, -43, -93, 85, -94, -89, -2, 17, -56, -122, -46, 7, -4, -5, -73, 69, -56, -122, -35, 0, -2, -12, -92, 73, -61, -58, -80, 70, -79, -76, -19, 2, -119, -119, -45, 9, -17, -42, -84, 79, -58, -100, -9, 7, -15, -96}, new byte[]{-61, 44, -89, -24, -98, 104, -97, -102});
                        Objects.toString(obj2);
                    } catch (Throwable th) {
                        o0OOoO0.o00oo.o00oOOo0(new byte[]{4, -1, 74, -83, -83}, new byte[]{53, -50, 123, -100, -100, 120, 119, 58});
                        o0OOoO0.o00oo.o00oOOo0(new byte[]{-37, -74, 47, -101, -118, Ascii.DC4, -66, 86, -37, -74, 47, -101, -118, Ascii.DC4, -66, 86, -37, -74, 125, -56, -5, 70, -32, 10, -110, -30, 125, -56, -12, 65, -30, 5, -127, -18, 118, -100}, new byte[]{-26, -117, Ascii.DC2, -90, -73, 41, -125, 107});
                        th.toString();
                    }
                }
                return method.invoke(this.f15654o00oOOo0, objArr);
            }
        }

        public o00oOo0O(double[] dArr) {
            this.f15653o00oo0O0 = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-72, 100, 17, -71, 1}, new byte[]{-119, 85, 32, -120, 48, Ascii.CR, Ascii.CAN, 87});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-10, -114, -2, -5, -84, -40}, new byte[]{-122, -17, -116, -102, -63, -30, -73, Ascii.CR});
            Arrays.toString(methodHookParam.args);
            Object obj = methodHookParam.args[0];
            methodHookParam.args[0] = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new o00oOOo0(obj));
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOoO extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15656o00oo0O0;

        public o00oOoO(double[] dArr) {
            this.f15656o00oo0O0 = dArr;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                ooOOO0Oo.o00ooO00(methodHookParam.thisObject).o00oOo0o(o0OOoO0.o00oo.o00oOOo0(new byte[]{-91, Ascii.FS, Ascii.NAK, -19, -23, 46, -100, 34, -93, Ascii.GS, 4}, new byte[]{-42, 121, 97, -95, -120, 90, -11, 86}), Double.valueOf(this.f15656o00oo0O0[0]));
                ooOOO0Oo.o00ooO00(methodHookParam.thisObject).o00oOo0o(o0OOoO0.o00oo.o00oOOo0(new byte[]{-13, 104, -97, -114, 126, -76, -81, 47, -12, 120, -113, -89}, new byte[]{Byte.MIN_VALUE, Ascii.CR, -21, -62, 17, -38, -56, 70}), Double.valueOf(this.f15656o00oo0O0[1]));
            } catch (Exception e) {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.EM, -30, -82, 75, -14}, new byte[]{40, -45, -97, 122, -61, 39, 78, -7});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-25, -46, -67, -96, -50, -124, -1, -51, -20, -112}, new byte[]{-126, -86, -34, -59, -66, -16, -106, -94});
                e.toString();
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-110, -65, 58, -99, 40, 7}, new byte[]{-66, -53, 82, -12, 91, oo0OOoo.f13516o00oOoO, -60, -87});
                Objects.toString(methodHookParam.thisObject);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15657o00oo0O0;

        public o00oo(double[] dArr) {
            this.f15657o00oo0O0 = dArr;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                ooOOO0Oo.o00ooO00(methodHookParam.thisObject).o00oOo0o(o0OOoO0.o00oo.o00oOOo0(new byte[]{91, 57, 68, Ascii.SUB, 101, Ascii.US, Byte.MAX_VALUE, -5, 93, 56, 85}, new byte[]{40, 92, 48, 86, 4, 107, Ascii.SYN, -113}), Double.TYPE, Double.valueOf(this.f15657o00oo0O0[0]));
                ooOOO0Oo.o00ooO00(methodHookParam.thisObject).o00oOo0o(o0OOoO0.o00oo.o00oOOo0(new byte[]{-33, -29, -101, 6, -5, 84, 74, Ascii.CR, -40, -13, -117, 47}, new byte[]{-84, -122, -17, 74, -108, 58, 45, 100}), Double.TYPE, Double.valueOf(this.f15657o00oo0O0[1]));
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-79, -80, -31, -106, 103}, new byte[]{Byte.MIN_VALUE, -127, -48, -89, 86, -36, 120, -3});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{72, -65, 101, -36, -26, -63, -4, -84, 79, -66, 121, -61, -43, -40, -13, -101, 79, -94, 121, -115}, new byte[]{32, -48, 10, -73, -89, -83, -112, -17});
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0 extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15658o00oo0O0;

        public o00oo0(double[] dArr) {
            this.f15658o00oo0O0 = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                methodHookParam.setResult(Double.valueOf(this.f15658o00oo0O0[1]));
            } catch (Exception e) {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.SUB, 3, 58, 19, -39}, new byte[]{43, 50, Ascii.VT, 34, -24, -110, 46, -4});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{50, -125, -30, -55, -114, -70, -101, -63, 57, -63}, new byte[]{87, -5, -127, -84, -2, -50, -14, -82});
                e.toString();
                o0OOoO0.o00oo.o00oOOo0(new byte[]{99, -42, 79, -52, 125, 109}, new byte[]{79, -94, 39, -91, Ascii.SO, 87, -67, -5});
                Objects.toString(methodHookParam.thisObject);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo00O extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15659o00oo0O0;

        public o00oo00O(double[] dArr) {
            this.f15659o00oo0O0 = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                methodHookParam.setResult(Double.valueOf(this.f15659o00oo0O0[0]));
            } catch (Exception e) {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-62, 51, -91, 85, 7}, new byte[]{-13, 2, -108, 100, 54, 10, Ascii.FS, 107});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-60, -24, -40, -57, Ascii.DC4, -112, -73, -120, -49, -86}, new byte[]{-95, -112, -69, -94, 100, -28, -34, -25});
                e.toString();
                o0OOoO0.o00oo.o00oOOo0(new byte[]{67, 55, -114, -54, -24, -21}, new byte[]{111, 67, -26, -93, -101, -47, 115, 94});
                Objects.toString(methodHookParam.thisObject);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15660o00oo0O0;

        /* loaded from: classes3.dex */
        public class o00oOOo0 extends XC_MethodHook {
            public o00oOOo0() {
            }

            public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-113, 49, -97, 120, -80}, new byte[]{-66, 0, -82, 73, -127, -72, 10, -16});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{109, Ascii.GS, -55, -120, 41, -98, Ascii.CR, -45, 100, Ascii.ETB, -54, -86, 4, -126, Ascii.SUB, -7, 126, 17, -46, -86, 104, -118, Ascii.FS, -20, 70, Ascii.EM, -55, -83, 60, -104, Ascii.GS, -3, 48}, new byte[]{10, 120, -67, -60, 72, -19, 121, -104});
                methodHookParam.setResult(Double.valueOf(o00oo0O.this.f15660o00oo0O0[0]));
            }
        }

        /* loaded from: classes3.dex */
        public class o00oOOoO extends XC_MethodHook {
            public o00oOOoO() {
            }

            public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-21, -126, 9, -27, 80}, new byte[]{-38, -77, 56, -44, 97, 70, -122, -42});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-43, 73, 126, 125, 58, 3, 62, -73, -36, 67, 125, 95, Ascii.ETB, Ascii.US, 41, -99, -58, 69, 101, 95, 123, Ascii.ETB, 47, -120, -2, 67, 100, 86, 50, 4, 63, -104, -41, Ascii.SYN}, new byte[]{-78, 44, 10, 49, 91, 112, 74, -4});
                methodHookParam.setResult(Double.valueOf(o00oo0O.this.f15660o00oo0O0[1]));
            }
        }

        public o00oo0O(double[] dArr) {
            this.f15660o00oo0O0 = dArr;
        }

        public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                Object result = methodHookParam.getResult();
                XposedHelpers.findAndHookMethod(result.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-15, Ascii.ESC, 98, -58, 60, -29, -60, Ascii.GS, -29, Ascii.SUB, 115}, new byte[]{-106, 126, Ascii.SYN, -118, 93, -105, -83, 105}), new Object[]{new o00oOOo0()});
                XposedHelpers.findAndHookMethod(result.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{46, 43, -90, -74, -105, -97, 77, 82, oo0OOoo.f13516o00oOoO, 59, -74, -97}, new byte[]{73, 78, -46, -6, -8, -15, 42, 59}), new Object[]{new o00oOOoO()});
            } catch (Throwable unused) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0O0 extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15663o00oo0O0;

        public o00oo0O0(double[] dArr) {
            this.f15663o00oo0O0 = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                methodHookParam.setResult(Double.valueOf(this.f15663o00oo0O0[1]));
            } catch (Exception e) {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-61, -93, Ascii.SUB, 56, 2}, new byte[]{-14, -110, 43, 9, 51, 3, 124, -29});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{93, 89, 57, 99, 121, 49, 119, -122, 84, 83, 58, 65, 84, 45, 96, -84, 78, 85, 34, 65, 56, 39, 123, -82, 95, 76, 57, 70, 119, 44, 57}, new byte[]{58, 60, 77, 47, Ascii.CAN, 66, 3, -51});
                e.toString();
                o0OOoO0.o00oo.o00oOOo0(new byte[]{43, 126, -70, -84, 54, -110}, new byte[]{7, 10, -46, -59, 69, -88, -3, -61});
                Objects.toString(methodHookParam.thisObject);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0OO extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15664o00oo0O0;

        public o00oo0OO(double[] dArr) {
            this.f15664o00oo0O0 = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            try {
                methodHookParam.setResult(Double.valueOf(this.f15664o00oo0O0[0]));
            } catch (Exception e) {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-46, -81, 90, -49, -118}, new byte[]{-29, -98, 107, -2, -69, 103, 2, o0OO0o00.f16655o00oOoOO});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{124, -93, 4, 72, 50, Ascii.SUB, -47, 121, 117, -87, 7, 106, Ascii.US, 6, -58, 83, 111, -81, Ascii.US, 106, 115, Ascii.FF, -35, 81, 126, -74, 4, 109, 60, 7, -97}, new byte[]{Ascii.ESC, -58, 112, 4, 83, 105, -91, 50});
                e.toString();
                o0OOoO0.o00oo.o00oOOo0(new byte[]{88, 48, -120, -118, -35, -19}, new byte[]{116, 68, -32, -29, -82, -41, -100, 125});
                Objects.toString(methodHookParam.thisObject);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00ooO0 extends XC_MethodHook {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ double[] f15665o00oo0O0;

        public o00ooO0(double[] dArr) {
            this.f15665o00oo0O0 = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            methodHookParam.setResult(Double.valueOf(this.f15665o00oo0O0[0]));
        }
    }

    /* loaded from: classes3.dex */
    public class o0O0o extends XC_MethodHook {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ double[] f15666o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Method f15667o00oo0O0;

        /* loaded from: classes3.dex */
        public class o00oOOo0 extends XC_MethodHook {

            /* renamed from: o0Oo00oO.o0O000$o0O0o$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0219o00oOOo0 extends XC_MethodHook {
                public C0219o00oOOo0() {
                }

                public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                    o0OOoO0.o00oo.o00oOOo0(new byte[]{84, -106, -119, 74, 104}, new byte[]{101, -89, -72, 123, 89, Ascii.FS, -68, -16});
                    o0OOoO0.o00oo.o00oOOo0(new byte[]{-80, -93, 75, -21, Ascii.DLE, 44, -25, -44, -94, -94, 90, -99}, new byte[]{-41, -58, 63, -89, 113, 88, -114, -96});
                    Objects.toString(o0O0o.this.f15667o00oo0O0);
                    methodHookParam.setResult(Double.valueOf(o0O0o.this.f15666o00oo0O[0]));
                }
            }

            /* loaded from: classes3.dex */
            public class o00oOOoO extends XC_MethodHook {
                public o00oOOoO() {
                }

                public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                    o0OOoO0.o00oo.o00oOOo0(new byte[]{-58, 95, 1, 62, 102}, new byte[]{-9, 110, 48, Ascii.SI, 87, -60, -37, -6});
                    o0OOoO0.o00oo.o00oOOo0(new byte[]{-49, 86, -9, -104, -29, 113, 86, -45, -36, 70, -25, -79, -74}, new byte[]{-88, 51, -125, -44, -116, Ascii.US, 49, -70});
                    Objects.toString(o0O0o.this.f15667o00oo0O0);
                    methodHookParam.setResult(Double.valueOf(o0O0o.this.f15666o00oo0O[1]));
                }
            }

            public o00oOOo0() {
            }

            public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
                Object obj = methodHookParam.args[0];
                XposedHelpers.findAndHookMethod(obj.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.SUB, -53, 75, -72, Ascii.SI, 65, -118, SignedBytes.MAX_POWER_OF_TWO, 8, -54, 90}, new byte[]{125, -82, 63, -12, 110, 53, -29, 52}), new Object[]{new C0219o00oOOo0()});
                XposedHelpers.findAndHookMethod(obj.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{102, 89, 126, 42, 36, 71, -73, -72, 117, 73, 110, 3}, new byte[]{1, 60, 10, 102, 75, 41, -48, -47}), new Object[]{new o00oOOoO()});
            }
        }

        public o0O0o(Method method, double[] dArr) {
            this.f15667o00oo0O0 = method;
            this.f15666o00oo0O = dArr;
        }

        public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws Throwable {
            Object[] objArr;
            Method[] declaredMethods;
            o0OOoO0.o00oo.o00oOOo0(new byte[]{51, -47, 9, -115, 90}, new byte[]{2, -32, 56, -68, 107, 49, 50, 42});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-87, -120, 39, Ascii.SUB, 58, 51, 77, Ascii.ETB, -92, -122, 36, 17, 5, 51, 113, Ascii.DLE, -92, -119, 97, Ascii.CAN, 45, 34, 109, Ascii.ETB, -81, -41}, new byte[]{-53, -19, 65, 117, 72, 86, 5, 120});
            Objects.toString(methodHookParam.thisObject);
            for (Object obj : methodHookParam.args) {
                if (obj.toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{6, -103, -17, 119, 118, 8, -65, 83, oo0OOoo.f13516o00oOoO, -97, -32, 96, 122, 9, -91, 83, 59, -113, -11, 113, 125, 3, -71}, new byte[]{82, -4, -127, Ascii.DC4, 19, 102, -53, Ascii.US}))) {
                    for (Method method : obj.getClass().getDeclaredMethods()) {
                        if (method.getName().equals(o0OOoO0.o00oo.o00oOOo0(new byte[]{10, 124, -118, Ascii.CR, Ascii.DLE, -5, -19, -122, 10, 124, -123, 10, Ascii.DC2, -12, -2, -118, 1}, new byte[]{101, Ascii.DC2, -58, 98, 115, -102, -103, -17}))) {
                            XposedBridge.hookMethod(method, new o00oOOo0());
                        }
                    }
                    return;
                }
            }
        }
    }

    public static boolean o00oOOo0(ClassLoader classLoader) {
        try {
            double[] o00oOo0O2 = o0O0000O.o00oOo0O(f15649o00oOOo0.o00oOOoO(), f15649o00oOOo0.o00oOo00());
            Class<?> loadClass = classLoader.loadClass(o0OOoO0.o00oo.o00oOOo0(new byte[]{82, 105, -101, -105, -67, 1, -50, -61, Ascii.US, 103, -122, -48, -14, 0, -64, -48, 80, 114, -97, -42, -78, 66, -18, -2, 80, 118, -70, -42, -65, Ascii.CR, -37, -38, 94, 104}, new byte[]{49, 6, -10, -71, -36, 108, -81, -77}));
            XposedHelpers.findAndHookMethod(loadClass, o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.DC4, 125, -56, -4, -56, -67, 113, -22, 6, 124, -39}, new byte[]{115, Ascii.CAN, -68, -80, -87, -55, Ascii.CAN, -98}), new Object[]{new o00oOOoO(o00oOo0O2)});
            XposedHelpers.findAndHookMethod(loadClass, o0OOoO0.o00oo.o00oOOo0(new byte[]{-34, -118, -20, 106, Ascii.FS, -12, 35, -84, -51, -102, -4, 67}, new byte[]{-71, -17, -104, 38, 115, -102, 68, -59}), new Object[]{new o00oOo00(o00oOo0O2)});
            return true;
        } catch (Exception e) {
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-33, 63, 68, 108, Ascii.NAK}, new byte[]{-18, Ascii.SO, 117, 93, 36, 121, 66, -57});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-95, 87, -29, 78, 104, -33, 88, 39, -86, Ascii.NAK}, new byte[]{-60, 47, Byte.MIN_VALUE, 43, Ascii.CAN, -85, 49, 72});
            e.toString();
            return false;
        }
    }

    public static boolean o00oOOoO(ClassLoader classLoader) {
        Class<?> cls;
        try {
            cls = classLoader.loadClass(o0OOoO0.o00oo.o00oOOo0(new byte[]{65, 47, 82, 42, -74, -18, 72, -15, Ascii.FF, o0OO0o00.f16655o00oOoOO, 79, 109, -7, -17, 70, -30, 67, 52, 86, 107, -71, -83, 104, -52, 67, 48, 115, 107, -76, -30, 93, -24, 77, 46, 124, 104, -66, -26, 71, -11}, new byte[]{34, SignedBytes.MAX_POWER_OF_TWO, 63, 4, -41, -125, 41, -127}));
        } catch (Exception unused) {
            cls = null;
        }
        try {
            if (cls == null) {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-78, -123, -98, 8, 55}, new byte[]{-125, -76, -81, 57, 6, 38, -45, -92});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-13, -79, 40, 109, -24, 118, 85, -7, -58, -107, 38, 115, -124, 119, 89, -20, -110, -102, 38, 104, -54, 125, Ascii.CAN}, new byte[]{-78, -4, 73, Ascii.GS, -92, Ascii.EM, 54, -104});
                return false;
            }
            o0OOoO0.o00oo.o00oOOo0(new byte[]{68, -25, 42, 47, -56}, new byte[]{117, -42, Ascii.ESC, Ascii.RS, -7, -45, 10, 113});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{SignedBytes.MAX_POWER_OF_TWO, -93, -28, Ascii.ESC, 101, -53, Ascii.DC2, 91, 117, -121, -22, 5, 9, -62, Ascii.RS, 79, 111, -118, -85}, new byte[]{1, -18, -123, 107, 41, -92, 113, 58});
            double[] o00oOo0O2 = o0O0000O.o00oOo0O(f15649o00oOOo0.o00oOOoO(), f15649o00oOOo0.o00oOo00());
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method = declaredMethods[i];
                if (method.getName().equals(o0OOoO0.o00oo.o00oOOo0(new byte[]{-83, 69, -104, -46, -7, -3, 32, -82, -73, 79, -126, -46, -1, -19, 53, -65, -80, 69, -98}, new byte[]{-34, 32, -20, -98, -106, -98, 65, -38})) && method.toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{42, -101, Ascii.VT, 51, Ascii.CR, -97, -17, 45, Ascii.US, -65, 5, 45, Ascii.CR, -103, -1, 56, Ascii.SO, -72, Ascii.SI, 49}, new byte[]{107, -42, 106, 67, 65, -16, -116, 76}))) {
                    o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.DLE, -27, 48, -104, -116}, new byte[]{o0OO0o00.f16655o00oOoOO, -44, 1, -87, -67, -42, 122, 118});
                    o0OOoO0.o00oo.o00oOOo0(new byte[]{66, -90, -101, -103, -68, 48, Ascii.FS}, new byte[]{47, -61, -17, -15, -45, 84, 38, -107});
                    method.toString();
                    XposedBridge.hookMethod(method, new o00oOo0O(o00oOo0O2));
                    break;
                }
                o0OOoO0.o00oo.o00oOOo0(new byte[]{41, -121, o0OO0o00.f16655o00oOoOO, -122, -49}, new byte[]{Ascii.CAN, -74, Ascii.DLE, -73, -2, 87, 90, -47});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-68, -38, -88, -96, -46, 48, 39, 86, -74, -105, -83, -65, -100, oo0OOoo.f13516o00oOoO, 102}, new byte[]{-35, -73, -55, -48, -14, 88, 72, 57});
                i++;
            }
            return true;
        } catch (Exception e) {
            o0OOoO0.o00oo.o00oOOo0(new byte[]{8, -51, -2, -32, 39}, new byte[]{57, -4, -49, -47, Ascii.SYN, -39, -31, 42});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-68, 76, -30, -115, -28, -47, 70, -64, -73, Ascii.SO}, new byte[]{-39, 52, -127, -24, -108, -91, 47, -81});
            e.toString();
            return false;
        }
    }

    public static boolean o00oOo00(ClassLoader classLoader) {
        Class<?> cls;
        try {
            cls = classLoader.loadClass(o0OOoO0.o00oo.o00oOOo0(new byte[]{82, 74, 2, Ascii.GS, 81, 67, -16, -118, 68, Ascii.VT, 3, 92, 80, 67, -19, -121, 94, 75, 65, 113, 119, 110, -10, -115, 80, 81, 6, 92, 93}, new byte[]{49, 37, 111, 51, 51, 34, -103, -18}));
        } catch (Exception unused) {
            cls = null;
        }
        try {
            if (cls == null) {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.GS, Ascii.SO, -88, 105, 91}, new byte[]{44, 63, -103, 88, 106, -110, -50, 39});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-32, -114, 49, 83, 101, 123, -126, -11, -51, -92, 93, 82, 105, 110, -42, -6, -51, -65, 19, 88, 40}, new byte[]{-94, -54, 125, 60, 6, Ascii.SUB, -10, -100});
                return false;
            }
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-36, 85, -98, 70, -37}, new byte[]{-19, 100, -81, 119, -22, 41, 42, Ascii.ETB});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{38, 124, 95, -103, 8, -18, 125, Ascii.DC4, Ascii.VT, 86, 51, -112, 4, -6, 103, Ascii.EM, 74}, new byte[]{100, 56, 19, -10, 107, -113, 9, 125});
            double[] o00oOo0o2 = o0O0000O.o00oOo0o(f15649o00oOOo0.o00oOOoO(), f15649o00oOOo0.o00oOo00());
            XposedBridge.hookAllConstructors(cls, new o00oOoO(o00oOo0o2));
            XposedHelpers.findAndHookMethod(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{-23, 68, 19, 66, 32, -96, -65, 58, -5, 69, 2}, new byte[]{-114, o0OO0o00.f16655o00oOoOO, 103, Ascii.SO, 65, -44, -42, 78}), new Object[]{new o00oo00O(o00oOo0o2)});
            XposedHelpers.findAndHookMethod(cls, o0OOoO0.o00oo.o00oOOo0(new byte[]{-66, 7, -14, 83, -35, -41, 90, 57, -83, Ascii.ETB, -30, 122}, new byte[]{-39, 98, -122, Ascii.US, -78, -71, oo0OOoo.f13516o00oOoO, 80}), new Object[]{new o00oo0(o00oOo0o2)});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{48, oo0OOoo.f13516o00oOoO, 5, -100, Ascii.VT}, new byte[]{1, Ascii.FF, 52, -83, 58, -12, -121, 108});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-47, Ascii.SYN, Byte.MIN_VALUE, -15, 114, -55, 37, -93, -36, Ascii.FS, -55, -15, 104, -121, 40, -30}, new byte[]{-77, 119, -23, -107, 7, -23, 77, -52});
            return true;
        } catch (Exception e) {
            o0OOoO0.o00oo.o00oOOo0(new byte[]{115, 59, Ascii.DC4, -98, -90}, new byte[]{66, 10, 37, -81, -105, -106, 58, Ascii.SUB});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-26, -95, 60, Ascii.SI, 103, -77, -47, -84, -19, -29}, new byte[]{-125, -39, 95, 106, Ascii.ETB, -57, -72, -61});
            e.toString();
            return false;
        }
    }

    public static boolean o00oOo0O(ClassLoader classLoader) {
        Class<?> cls;
        XC_MethodHook o00oo0o2;
        char c = '\r';
        try {
            cls = classLoader.loadClass(o0OOoO0.o00oo.o00oOOo0(new byte[]{106, 85, 41, -78, 114, Ascii.ESC, -15, -71, 108, 84, 48, -78, 107, Ascii.US, -17, -12, 110, 95, 43, -16, 105, Ascii.GS, -2, -82, 96, 85, 42, -78, 117, Ascii.US, -17, -86, 39, 110, o0OO0o00.f16655o00oOoOO, -14, 101, Ascii.ESC, -15, -82, 69, 85, 39, -3, 114, Ascii.ETB, -16, -76, 68, 91, 42, -3, 97, Ascii.ESC, -19}, new byte[]{9, 58, 68, -100, 6, 126, -97, -38}));
        } catch (Exception unused) {
            cls = null;
        }
        if (cls == null) {
            try {
                cls = classLoader.loadClass(o0OOoO0.o00oo.o00oOOo0(new byte[]{76, -104, Byte.MAX_VALUE, 41, 84, -30, -90, -20, 74, -103, 102, 41, 77, -26, -72, -95, 72, -110, 125, 107, 79, -28, -87, -5, 70, -104, 124, 41, 116, -30, -90, -20, 74, -103, 102, 75, 79, -28, -87, -5, 70, -104, 124, 74, 65, -23, -87, -24, 74, -123}, new byte[]{47, -9, Ascii.DC2, 7, 32, -121, -56, -113}));
            } catch (Exception unused2) {
            }
        }
        try {
            if (cls == null) {
                o0OOoO0.o00oo.o00oOOo0(new byte[]{-122, -53, 55, -28, -13}, new byte[]{-73, -6, 6, -43, -62, -24, 93, 5});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.US, -54, -68, -127, 118, -59, 47, 84, 36, -52, -77, -106, 122, -60, 53, 56, 37, -64, -90, -62, 117, -60, 46, 118, 47, -127}, new byte[]{75, -81, -46, -30, 19, -85, 91, Ascii.CAN});
                return false;
            }
            double[] o00oOo0O2 = o0O0000O.o00oOo0O(f15649o00oOOo0.o00oOOoO(), f15649o00oOOo0.o00oOo00());
            Method[] declaredMethods = cls.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            while (i < length) {
                Method method = declaredMethods[i];
                String name = method.getName();
                byte[] bArr = new byte[26];
                bArr[0] = Ascii.EM;
                bArr[1] = 111;
                bArr[2] = -61;
                bArr[3] = 44;
                bArr[4] = -41;
                bArr[5] = -8;
                bArr[6] = Byte.MIN_VALUE;
                bArr[7] = -127;
                bArr[8] = 2;
                bArr[9] = 100;
                bArr[10] = -43;
                bArr[11] = 53;
                bArr[12] = -41;
                bArr[c] = -51;
                bArr[14] = -122;
                bArr[15] = -73;
                bArr[16] = Ascii.CAN;
                bArr[17] = 98;
                bArr[18] = -2;
                bArr[19] = 54;
                bArr[20] = -47;
                bArr[21] = -22;
                bArr[22] = Byte.MIN_VALUE;
                bArr[23] = -69;
                bArr[24] = 4;
                bArr[25] = 100;
                if (!name.equals(o0OOoO0.o00oo.o00oOOo0(bArr, new byte[]{107, 10, -78, 89, -78, -117, -12, -46})) && !method.getName().equals(o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.RS, Ascii.DC2, -63, -18, -8, -10, -23, -2, 3, Ascii.DC4, -47, -17, -12, -22, -13, -27, 5, 3, -40, -56, -2, -32, -13, -41}, new byte[]{108, 119, -80, -101, -99, -123, -99, -78})) && (!method.getName().equals(o0OOoO0.o00oo.o00oOOo0(new byte[]{126, 58, -12, -102, 54, Ascii.NAK, -89, -115, 99, 60, -28, -101, 58, 9, -67, -108, 124, 59, -28, -101, 54, Ascii.NAK}, new byte[]{Ascii.FF, 95, -123, -17, 83, 102, -45, -63})) || !method.toString().contains(o0OOoO0.o00oo.o00oOOo0(new byte[]{-54, -77, Ascii.SO, -117, 106, 46}, new byte[]{-122, -36, 97, -5, Ascii.SI, 92, -79, 105})))) {
                    if (method.getName().equals(o0OOoO0.o00oo.o00oOOo0(new byte[]{1, 8, -74, -40, -41, -34, 120, 47, 8, 2, -75, -6, -6, -62, 111, 5, Ascii.DC2, 4, -83, -6}, new byte[]{102, 109, -62, -108, -74, -83, Ascii.FF, 100}))) {
                        o00oo0o2 = new o00oo0O(o00oOo0O2);
                        XposedBridge.hookMethod(method, o00oo0o2);
                        i++;
                        c = '\r';
                    } else {
                        i++;
                        c = '\r';
                    }
                }
                o0OOoO0.o00oo.o00oOOo0(new byte[]{93, -119, -94, -45, -120}, new byte[]{108, -72, -109, -30, -71, 80, -51, -77});
                o0OOoO0.o00oo.o00oOOo0(new byte[]{88, -13, -77, Byte.MAX_VALUE, -93, 80, 35, 94, 95, -8, -4, 121, -117, 65, 63, 89, 84, -90}, new byte[]{48, -100, -36, Ascii.DC4, -18, 53, 87, 54});
                method.getName();
                o00oo0o2 = new o0O0o(method, o00oOo0O2);
                XposedBridge.hookMethod(method, o00oo0o2);
                i++;
                c = '\r';
            }
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-59, 66, -75, -48, -71}, new byte[]{-12, 115, -124, -31, -120, 80, -86, -73});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{Ascii.EM, -76, -87, 80, 115, 105, -110, -104, 34, -78, -90, 71, Byte.MAX_VALUE, 104, -120, -12, 37, -66, -88, 88, 54, 99, -119, -70, 40, -1}, new byte[]{77, -47, -57, 51, Ascii.SYN, 7, -26, -44});
            return true;
        } catch (Exception e) {
            o0OOoO0.o00oo.o00oOOo0(new byte[]{4, 4, -67, -86, 47}, new byte[]{53, 53, -116, -101, Ascii.RS, 121, 69, 63});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-73, -29, -53, -30, Ascii.ESC, -27, 85, SignedBytes.MAX_POWER_OF_TWO, -68, -95}, new byte[]{-46, -101, -88, -121, 107, -111, 60, 47});
            e.toString();
            return false;
        }
    }

    public static void o00oOo0o() {
        try {
            double[] o00oOo0O2 = o0O0000O.o00oOo0O(f15649o00oOOo0.o00oOOoO(), f15649o00oOOo0.o00oOo00());
            XposedBridge.hookAllConstructors(Location.class, new o00oo(o00oOo0O2));
            XposedHelpers.findAndHookMethod(Location.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-84, -12, 109, -3, 69, -48, -114, -39, -66, -11, 124}, new byte[]{-53, -111, Ascii.EM, -79, 36, -92, -25, -83}), new Object[]{new o00ooO0(o00oOo0O2)});
            XposedHelpers.findAndHookMethod(Location.class, o0OOoO0.o00oo.o00oOOo0(new byte[]{-111, 70, 95, -18, 49, -12, -1, 78, -126, 86, 79, -57}, new byte[]{-10, 35, 43, -94, 94, -102, -104, 39}), new Object[]{new o00oOOo0(o00oOo0O2)});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-73, oo0OOoo.f13516o00oOoO, 48, -58, 85}, new byte[]{-122, Ascii.FF, 1, -9, 100, Ascii.US, -113, 65});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{74, 52, 53, -80, 70, 10, 52, 52, 86, 34, 45, -28, 71, 8, 122, 57, Ascii.ETB}, new byte[]{57, 77, 70, -60, 35, 103, Ascii.DC4, 92});
        } catch (Exception e) {
            o0OOoO0.o00oo.o00oOOo0(new byte[]{-102, 101, 117, 1, -15}, new byte[]{-85, 84, 68, 48, -64, -46, -78, 10});
            o0OOoO0.o00oo.o00oOOo0(new byte[]{82, -98, -24, Ascii.SI, Ascii.RS, 72, Ascii.ESC, Ascii.SUB, 78, -124, -6, Ascii.SI, Ascii.DC2, 74, 85, 76}, new byte[]{o0OO0o00.f16655o00oOoOO, -25, -101, 123, 123, 37, 59, 118});
            e.toString();
        }
    }

    public static void o00oOoO0(LocationInfo locationInfo) {
        f15649o00oOOo0 = locationInfo;
    }

    public static void o00oOooO(Object obj) {
        try {
            double[] o00oOo0O2 = o0O0000O.o00oOo0O(f15649o00oOOo0.o00oOOoO(), f15649o00oOOo0.o00oOo00());
            XposedHelpers.findAndHookMethod(obj.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-56, 40, -93, Ascii.EM, 40, 52, 99, -35, -38, 41, -78}, new byte[]{-81, 77, -41, 85, 73, SignedBytes.MAX_POWER_OF_TWO, 10, -87}), new Object[]{new o00oo0OO(o00oOo0O2)});
            XposedHelpers.findAndHookMethod(obj.getClass(), o0OOoO0.o00oo.o00oOOo0(new byte[]{-78, -79, 116, 35, -9, 126, -57, 120, -95, -95, 100, 10}, new byte[]{-43, -44, 0, 111, -104, Ascii.DLE, -96, 17}), new Object[]{new o00oo0O0(o00oOo0O2)});
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
