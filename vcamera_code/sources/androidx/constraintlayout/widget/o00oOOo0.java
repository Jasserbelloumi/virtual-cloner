package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import o00oOoOo.o00oo;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public class o00oOOo0 {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f1921o00oOoO = "TransitionLayout";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public String f1922o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o00oOOoO f1923o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f1924o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public String f1925o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public boolean f1926o00oOo0o;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f1927o00oOoO0;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f1928o00oOooO;

    /* renamed from: androidx.constraintlayout.widget.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0013o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f1929o00oOOo0;

        static {
            int[] iArr = new int[o00oOOoO.values().length];
            f1929o00oOOo0 = iArr;
            try {
                iArr[o00oOOoO.COLOR_TYPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1929o00oOOo0[o00oOOoO.COLOR_DRAWABLE_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1929o00oOOo0[o00oOOoO.INT_TYPE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1929o00oOOo0[o00oOOoO.FLOAT_TYPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1929o00oOOo0[o00oOOoO.STRING_TYPE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1929o00oOOo0[o00oOOoO.BOOLEAN_TYPE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1929o00oOOo0[o00oOOoO.DIMENSION_TYPE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum o00oOOoO {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public o00oOOo0(o00oOOo0 o00oooo02, Object obj) {
        this.f1922o00oOOo0 = o00oooo02.f1922o00oOOo0;
        this.f1923o00oOOoO = o00oooo02.f1923o00oOOoO;
        o00oo0OO(obj);
    }

    public o00oOOo0(String str, o00oOOoO o00ooooo2) {
        this.f1922o00oOOo0 = str;
        this.f1923o00oOOoO = o00ooooo2;
    }

    public o00oOOo0(String str, o00oOOoO o00ooooo2, Object obj) {
        this.f1922o00oOOo0 = str;
        this.f1923o00oOOoO = o00ooooo2;
        o00oo0OO(obj);
    }

    public static int o00oOOo0(int i) {
        int i2 = (i & (~(i >> 31))) - 255;
        return (i2 & (i2 >> 31)) + 255;
    }

    public static HashMap<String, o00oOOo0> o00oOo00(HashMap<String, o00oOOo0> hashMap, View view) {
        HashMap<String, o00oOOo0> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            o00oOOo0 o00oooo02 = hashMap.get(str);
            try {
                hashMap2.put(str, str.equals("BackgroundColor") ? new o00oOOo0(o00oooo02, Integer.valueOf(((ColorDrawable) view.getBackground()).getColor())) : new o00oOOo0(o00oooo02, cls.getMethod("getMap" + str, new Class[0]).invoke(view, new Object[0])));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void o00oOoO(Context context, XmlPullParser xmlPullParser, HashMap<String, o00oOOo0> hashMap) {
        o00oOOoO o00ooooo2;
        Object string;
        int integer;
        float f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        o00oOOoO o00ooooo3 = null;
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == R.styleable.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == R.styleable.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                o00ooooo3 = o00oOOoO.BOOLEAN_TYPE;
            } else {
                if (index == R.styleable.CustomAttribute_customColorValue) {
                    o00ooooo2 = o00oOOoO.COLOR_TYPE;
                } else if (index == R.styleable.CustomAttribute_customColorDrawableValue) {
                    o00ooooo2 = o00oOOoO.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == R.styleable.CustomAttribute_customPixelDimension) {
                        o00ooooo2 = o00oOOoO.DIMENSION_TYPE;
                        f = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == R.styleable.CustomAttribute_customDimension) {
                        o00ooooo2 = o00oOOoO.DIMENSION_TYPE;
                        f = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == R.styleable.CustomAttribute_customFloatValue) {
                        o00ooooo2 = o00oOOoO.FLOAT_TYPE;
                        f = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == R.styleable.CustomAttribute_customIntegerValue) {
                        o00ooooo2 = o00oOOoO.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj2 = string;
                        o00ooooo3 = o00ooooo2;
                        obj = obj2;
                    } else if (index == R.styleable.CustomAttribute_customStringValue) {
                        o00ooooo2 = o00oOOoO.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        Object obj22 = string;
                        o00ooooo3 = o00ooooo2;
                        obj = obj22;
                    }
                    string = Float.valueOf(f);
                    Object obj222 = string;
                    o00ooooo3 = o00ooooo2;
                    obj = obj222;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2222 = string;
                o00ooooo3 = o00ooooo2;
                obj = obj2222;
            }
        }
        if (str != null && obj != null) {
            hashMap.put(str, new o00oOOo0(str, o00ooooo3, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public static void o00oOoOO(View view, HashMap<String, o00oOOo0> hashMap) {
        Class<?> cls = view.getClass();
        for (String str : hashMap.keySet()) {
            o00oOOo0 o00oooo02 = hashMap.get(str);
            String o00oOOo02 = o00oo.o00oOOo0("set", str);
            try {
            } catch (IllegalAccessException e) {
                e = e;
                e.printStackTrace();
            } catch (NoSuchMethodException e2) {
                e2.getMessage();
            } catch (InvocationTargetException e3) {
                e = e3;
                e.printStackTrace();
            }
            switch (C0013o00oOOo0.f1929o00oOOo0[o00oooo02.f1923o00oOOoO.ordinal()]) {
                case 1:
                    cls.getMethod(o00oOOo02, Integer.TYPE).invoke(view, Integer.valueOf(o00oooo02.f1927o00oOoO0));
                    continue;
                case 2:
                    Method method = cls.getMethod(o00oOOo02, Drawable.class);
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor(o00oooo02.f1927o00oOoO0);
                    method.invoke(view, colorDrawable);
                    continue;
                case 3:
                    cls.getMethod(o00oOOo02, Integer.TYPE).invoke(view, Integer.valueOf(o00oooo02.f1924o00oOo00));
                    continue;
                case 4:
                    cls.getMethod(o00oOOo02, Float.TYPE).invoke(view, Float.valueOf(o00oooo02.f1928o00oOooO));
                    continue;
                case 5:
                    cls.getMethod(o00oOOo02, CharSequence.class).invoke(view, o00oooo02.f1925o00oOo0O);
                    continue;
                case 6:
                    cls.getMethod(o00oOOo02, Boolean.TYPE).invoke(view, Boolean.valueOf(o00oooo02.f1926o00oOo0o));
                    continue;
                case 7:
                    cls.getMethod(o00oOOo02, Float.TYPE).invoke(view, Float.valueOf(o00oooo02.f1928o00oOooO));
                    continue;
                default:
                    continue;
            }
            e2.getMessage();
        }
    }

    public boolean o00oOOoO(o00oOOo0 o00oooo02) {
        o00oOOoO o00ooooo2;
        if (o00oooo02 == null || (o00ooooo2 = this.f1923o00oOOoO) != o00oooo02.f1923o00oOOoO) {
            return false;
        }
        switch (C0013o00oOOo0.f1929o00oOOo0[o00ooooo2.ordinal()]) {
            case 1:
            case 2:
                return this.f1927o00oOoO0 == o00oooo02.f1927o00oOoO0;
            case 3:
                return this.f1924o00oOo00 == o00oooo02.f1924o00oOo00;
            case 4:
                return this.f1928o00oOooO == o00oooo02.f1928o00oOooO;
            case 5:
                return this.f1924o00oOo00 == o00oooo02.f1924o00oOo00;
            case 6:
                return this.f1926o00oOo0o == o00oooo02.f1926o00oOo0o;
            case 7:
                return this.f1928o00oOooO == o00oooo02.f1928o00oOooO;
            default:
                return false;
        }
    }

    public float o00oOo0O() {
        switch (C0013o00oOOo0.f1929o00oOOo0[this.f1923o00oOOoO.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return this.f1924o00oOo00;
            case 4:
                return this.f1928o00oOooO;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f1926o00oOo0o ? 1.0f : 0.0f;
            case 7:
                return this.f1928o00oOooO;
            default:
                return Float.NaN;
        }
    }

    public void o00oOo0o(float[] fArr) {
        switch (C0013o00oOOo0.f1929o00oOOo0[this.f1923o00oOOoO.ordinal()]) {
            case 1:
            case 2:
                int i = this.f1927o00oOoO0;
                float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
                float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((i & 255) / 255.0f, 2.2d);
                fArr[3] = ((i >> 24) & 255) / 255.0f;
                return;
            case 3:
                fArr[0] = this.f1924o00oOo00;
                return;
            case 4:
                fArr[0] = this.f1928o00oOooO;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f1926o00oOo0o ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f1928o00oOooO;
                return;
            default:
                return;
        }
    }

    public int o00oOoO0() {
        int i = C0013o00oOOo0.f1929o00oOOo0[this.f1923o00oOOoO.ordinal()];
        return (i == 1 || i == 2) ? 4 : 1;
    }

    public void o00oOoOo(int i) {
        this.f1927o00oOoO0 = i;
    }

    public void o00oOoo0(float f) {
        this.f1928o00oOooO = f;
    }

    public o00oOOoO o00oOooO() {
        return this.f1923o00oOOoO;
    }

    public void o00oOooo(int i) {
        this.f1924o00oOo00 = i;
    }

    public void o00oo0(String str) {
        this.f1925o00oOo0O = str;
    }

    public void o00oo00O(View view, float[] fArr) {
        Class<?> cls = view.getClass();
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("set");
        o00oOOo02.append(this.f1922o00oOOo0);
        String sb = o00oOOo02.toString();
        try {
            boolean z = true;
            switch (C0013o00oOOo0.f1929o00oOOo0[this.f1923o00oOOoO.ordinal()]) {
                case 1:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((o00oOOo0((int) (fArr[3] * 255.0f)) << 24) | (o00oOOo0((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (o00oOOo0((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | o00oOOo0((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f))));
                    return;
                case 2:
                    Method method = cls.getMethod(sb, Drawable.class);
                    int o00oOOo03 = o00oOOo0((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f));
                    int o00oOOo04 = o00oOOo0((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f));
                    int o00oOOo05 = o00oOOo0((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((o00oOOo0((int) (fArr[3] * 255.0f)) << 24) | (o00oOOo03 << 16) | (o00oOOo04 << 8) | o00oOOo05);
                    method.invoke(view, colorDrawable);
                    return;
                case 3:
                    cls.getMethod(sb, Integer.TYPE).invoke(view, Integer.valueOf((int) fArr[0]));
                    return;
                case 4:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + this.f1922o00oOOo0);
                case 6:
                    Method method2 = cls.getMethod(sb, Boolean.TYPE);
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z = false;
                    }
                    objArr[0] = Boolean.valueOf(z);
                    method2.invoke(view, objArr);
                    return;
                case 7:
                    cls.getMethod(sb, Float.TYPE).invoke(view, Float.valueOf(fArr[0]));
                    return;
                default:
                    return;
            }
        } catch (IllegalAccessException e) {
            e = e;
            o00ooO00.o00oOoO.o00oOoo0(view);
            e.printStackTrace();
        } catch (NoSuchMethodException e2) {
            e = e2;
            o00ooO00.o00oOoO.o00oOoo0(view);
            e.printStackTrace();
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
        }
    }

    public void o00oo0O0(float[] fArr) {
        float f;
        switch (C0013o00oOOo0.f1929o00oOOo0[this.f1923o00oOOoO.ordinal()]) {
            case 1:
            case 2:
                int HSVToColor = Color.HSVToColor(fArr);
                this.f1927o00oOoO0 = HSVToColor;
                this.f1927o00oOoO0 = (o00oOOo0((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & 16777215);
                return;
            case 3:
                this.f1924o00oOo00 = (int) fArr[0];
                return;
            case 4:
                f = fArr[0];
                break;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                this.f1926o00oOo0o = ((double) fArr[0]) > 0.5d;
                return;
            case 7:
                f = fArr[0];
                break;
            default:
                return;
        }
        this.f1928o00oOooO = f;
    }

    public void o00oo0OO(Object obj) {
        switch (C0013o00oOOo0.f1929o00oOOo0[this.f1923o00oOOoO.ordinal()]) {
            case 1:
            case 2:
                this.f1927o00oOoO0 = ((Integer) obj).intValue();
                return;
            case 3:
                this.f1924o00oOo00 = ((Integer) obj).intValue();
                return;
            case 4:
            case 7:
                this.f1928o00oOooO = ((Float) obj).floatValue();
                return;
            case 5:
                this.f1925o00oOo0O = (String) obj;
                return;
            case 6:
                this.f1926o00oOo0o = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }
}
