package o0Oo00oO;

import android.app.Application;
import android.content.Context;
import android.support.v4.media.o00oOo0O;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import multispace.multiapp.clone.app.App;
import o0OOoO0.o00oo;
import o0ooO0O0.oOo000Oo;
/* loaded from: classes3.dex */
public class o0OoOoOo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static boolean f15677o00oOOo0;

    public static void o00oOOo0(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field o00oOOoO2 = o00oOOoO(obj, str);
        Object[] objArr2 = (Object[]) o00oOOoO2.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        o00oOOoO2.set(obj, objArr3);
    }

    public static Field o00oOOoO(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(str);
        o00oOOo02.append(o00oo.o00oOOo0(new byte[]{-36, -19, 65, 79, 60, -11, 98, 63, -110, -25, 0}, new byte[]{-4, -125, 46, 59, Ascii.FS, -109, Ascii.CR, 74}));
        throw new NoSuchFieldException(o00oOOo02.toString());
    }

    public static Method o00oOo00(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0(str);
        o00oOOo02.append(o00oo.o00oOOo0(new byte[]{126, -66, -20, 122, 112, -46, -25, 100, 48, -76, -83}, new byte[]{94, -48, -125, Ascii.SO, 80, -76, -120, 17}));
        throw new NoSuchMethodException(o00oOOo02.toString());
    }

    public static void o00oOo0O(String str) {
        Field field;
        IOException[] iOExceptionArr;
        try {
            ClassLoader classLoader = o0OoOoOo.class.getClassLoader();
            Object obj = o00oOOoO(classLoader, o00oo.o00oOOo0(new byte[]{-32, 101, -89, -63, -87, 116, -63, -110}, new byte[]{-112, 4, -45, -87, -27, Ascii.GS, -78, -26})).get(classLoader);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new File(str));
            o00oOOo0(obj, o00oo.o00oOOo0(new byte[]{70, 55, 103, -37, -9, 41, -15, 72, 76, 38, 108}, new byte[]{34, 82, Ascii.US, -98, -101, 76, -100, 45}), o00oOo0o(obj, arrayList2, arrayList));
            if (arrayList.size() > 0) {
                try {
                    field = o00oOOoO(classLoader, o00oo.o00oOOo0(new byte[]{77, 71, 7, 67, -28, -27, -36, 58, 71, 86, Ascii.FF, 85, -3, -16, -63, 45, 76, 81, Ascii.FF, 99, -20, -59, -55, 60, 76, 82, Ascii.VT, 111, -25, -18, -62}, new byte[]{41, 34, Byte.MAX_VALUE, 6, -120, Byte.MIN_VALUE, -79, 95}));
                } catch (Throwable unused) {
                    field = null;
                }
                if (field == null) {
                    try {
                        field = o00oOOoO(obj, o00oo.o00oOOo0(new byte[]{93, -2, -32, 66, -84, 4, -48, Ascii.VT, 87, -17, -21, 84, -75, 17, -51, Ascii.FS, 92, -24, -21, 98, -92, 36, -59, Ascii.CR, 92, -21, -20, 110, -81, Ascii.SI, -50}, new byte[]{57, -101, -104, 7, -64, 97, -67, 110}));
                    } catch (Throwable unused2) {
                    }
                    classLoader = obj;
                }
                if (field == null) {
                    throw new RuntimeException(o00oo.o00oOOo0(new byte[]{46, -59, 3, -122, Ascii.FF, 77, 43, -24, 36, -44, 8, -112, Ascii.NAK, 88, 54, -1, 47, -45, 8, -90, 4, 109, 62, -18, 47, -48, Ascii.SI, -86, Ascii.SI, 70, 53, -83, 36, -49, Ascii.SI, -29, 6, 71, 51, -29, 46, -114}, new byte[]{74, -96, 123, -61, 96, 40, 70, -115}));
                }
                IOException[] iOExceptionArr2 = (IOException[]) field.get(classLoader);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                field.set(classLoader, iOExceptionArr);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static Object[] o00oOo0o(Object obj, ArrayList<File> arrayList, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return (Object[]) o00oOo00(obj, o00oo.o00oOOo0(new byte[]{126, Ascii.ETB, 105, -81, 98, -70, 45, -111, 86, Ascii.SUB, 103, -89, 87, -75, 45, -118}, new byte[]{19, 118, 2, -54, 50, -37, 89, -7}), List.class, File.class, List.class).invoke(obj, arrayList, null, arrayList2);
    }

    public static void o00oOooO(Context context) {
        if (f15677o00oOOo0) {
            return;
        }
        File file = new File(context.getFilesDir() + o00oo.o00oOOo0(new byte[]{-57}, new byte[]{-24, 111, -123, -40, -92, 3, Ascii.GS, 75}) + Application.getProcessName() + o00oo.o00oOOo0(new byte[]{-112, -97, -98, -56, 42}, new byte[]{-3, -26, -6, -83, 82, -110, -44, 71}));
        file.mkdirs();
        try {
            oOo000Oo.o00oOOo0(App.o00oOOoO(), o00oo.o00oOOo0(new byte[]{68, 80, -20, -112, -53, -11, -28, -71, 68}, new byte[]{52, 53, Byte.MIN_VALUE, -1, -84, -37, -98, -48}), file.getAbsolutePath());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        o00oOo0O(file.getAbsolutePath() + o00oo.o00oOOo0(new byte[]{59, 36, 102, -38, -62, Ascii.SO, 59, -57, 100, 63}, new byte[]{Ascii.DC4, 84, 3, -74, -83, 105, Ascii.NAK, -90}));
        System.load(file.getAbsolutePath() + o00oo.o00oOOo0(new byte[]{116, Ascii.DC2, 113, 49, -2, -64, -22, -61, 60, 80, 107, 60}, new byte[]{91, 126, Ascii.CAN, 83, -114, -91, -122, -84}));
        f15677o00oOOo0 = true;
    }
}
