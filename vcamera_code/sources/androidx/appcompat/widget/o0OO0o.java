package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import androidx.appcompat.R;
import o00oOooO.o0OO0oO;
import o00oooOo.oOO00OO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class o0OO0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f1294o00oOOo0 = "ThemeUtils";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f1295o00oOOoO = new ThreadLocal<>();

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int[] f1296o00oOo00 = {-16842910};

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int[] f1304o00oOooO = {16842908};

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int[] f1297o00oOo0O = {16843518};

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int[] f1298o00oOo0o = {16842919};

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int[] f1300o00oOoO0 = {16842912};

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int[] f1299o00oOoO = {16842913};

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int[] f1301o00oOoOO = {-16842919, -16842908};

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int[] f1302o00oOoOo = new int[0];

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int[] f1303o00oOoo0 = new int[1];

    public static void o00oOOo0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.styleable.AppCompatTheme);
        try {
            if (!obtainStyledAttributes.hasValue(R.styleable.AppCompatTheme_windowActionBar)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @o00oOooO.oo0oO0
    public static ColorStateList o00oOOoO(int i, int i2) {
        return new ColorStateList(new int[][]{f1296o00oOo00, f1302o00oOoOo}, new int[]{i2, i});
    }

    public static int o00oOo00(@o00oOooO.oo0oO0 Context context, int i) {
        ColorStateList o00oOo0o2 = o00oOo0o(context, i);
        if (o00oOo0o2 == null || !o00oOo0o2.isStateful()) {
            TypedValue o00oOoO02 = o00oOoO0();
            context.getTheme().resolveAttribute(16842803, o00oOoO02, true);
            return o00oOo0O(context, i, o00oOoO02.getFloat());
        }
        return o00oOo0o2.getColorForState(f1296o00oOo00, o00oOo0o2.getDefaultColor());
    }

    public static int o00oOo0O(@o00oOooO.oo0oO0 Context context, int i, float f) {
        int o00oOooO2 = o00oOooO(context, i);
        return oOO00OO.o00ooO(o00oOooO2, Math.round(Color.alpha(o00oOooO2) * f));
    }

    @o00oOooO.o0OO00OO
    public static ColorStateList o00oOo0o(@o00oOooO.oo0oO0 Context context, int i) {
        int[] iArr = f1303o00oOoo0;
        iArr[0] = i;
        o0OOO0 o00ooOo02 = o0OOO0.o00ooOo0(context, null, iArr);
        try {
            return o00ooOo02.o00oOooO(0);
        } finally {
            o00ooOo02.o00ooOoo();
        }
    }

    public static TypedValue o00oOoO0() {
        ThreadLocal<TypedValue> threadLocal = f1295o00oOOoO;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    public static int o00oOooO(@o00oOooO.oo0oO0 Context context, int i) {
        int[] iArr = f1303o00oOoo0;
        iArr[0] = i;
        o0OOO0 o00ooOo02 = o0OOO0.o00ooOo0(context, null, iArr);
        try {
            return o00ooOo02.o00oOo00(0, 0);
        } finally {
            o00ooOo02.o00ooOoo();
        }
    }
}
