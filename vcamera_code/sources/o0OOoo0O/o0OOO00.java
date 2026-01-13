package o0OOoo0O;

import android.content.Context;
import com.google.common.base.Ascii;
import o0OOoO0.o00oo;
/* loaded from: classes3.dex */
public class o0OOO00 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static Context f15078o00oOOo0;

    public static Context o00oOOo0() {
        if (f15078o00oOOo0 == null) {
            synchronized (o0OOO00.class) {
                if (f15078o00oOOo0 == null) {
                    try {
                        Class<?> cls = Class.forName(o00oo.o00oOOo0(new byte[]{100, -48, 122, 46, Ascii.US, 45, Ascii.SYN, -67, 100, -50, 110, 114, 49, 39, 6, -6, 115, -41, 106, 37, 36, 44, 0, -10, 100, -38}, new byte[]{5, -66, Ascii.RS, 92, 112, 68, 114, -109}));
                        Object invoke = cls.getMethod(o00oo.o00oOOo0(new byte[]{-88, -1, -91, -17, 77, -15, -103, Ascii.DC2, -88, -2, -66, -21, 65, -21, -108, 7, -93, -8, -78, -4, 76}, new byte[]{-53, -118, -41, -99, 40, -97, -19, 83}), new Class[0]).invoke(cls, new Object[0]);
                        f15078o00oOOo0 = (Context) invoke.getClass().getMethod(o00oo.o00oOOo0(new byte[]{58, 63, 100, 115, Ascii.FS, -24, -52, Byte.MAX_VALUE, 62, 59, 100, 91, 3, -10}, new byte[]{93, 90, Ascii.DLE, 50, 108, -104, -96, Ascii.SYN}), new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return f15078o00oOOo0;
    }
}
