package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import o00oOooO.o0OO0oO;
/* loaded from: classes.dex */
public class o0O0O0Oo {

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final String f1184o00oOooo = "ACTVAutoSizeHelper";

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f1185o00oo0 = 12;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f1188o00oo0O0 = 1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f1189o00oo0OO = 112;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f1191o00oo0o = 1048576;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final float f1192o00oo0o0 = -1.0f;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public TextPaint f1198o00oOoO;
    @o00oOooO.oo0oO0

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final TextView f1200o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public final Context f1201o00oOoOo;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public final o00oo00O f1202o00oOoo0;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final RectF f1186o00oo00O = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1187o00oo0O = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f1190o00oo0Oo = new ConcurrentHashMap<>();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public int f1193o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public boolean f1194o00oOOoO = false;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public float f1195o00oOo00 = -1.0f;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public float f1203o00oOooO = -1.0f;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public float f1196o00oOo0O = -1.0f;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int[] f1197o00oOo0o = new int[0];

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public boolean f1199o00oOoO0 = false;

    @o00oOooO.o0OOooO0(16)
    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        @o00oOooO.oo0oO0
        public static StaticLayout o00oOOo0(@o00oOooO.oo0oO0 CharSequence charSequence, @o00oOooO.oo0oO0 Layout.Alignment alignment, int i, @o00oOooO.oo0oO0 TextView textView, @o00oOooO.oo0oO0 TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOOoO(@o00oOooO.oo0oO0 TextView textView) {
            return textView.getMaxLines();
        }
    }

    @o00oOooO.o0OOooO0(18)
    /* loaded from: classes.dex */
    public static final class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOo0(@o00oOooO.oo0oO0 View view) {
            return view.isInLayout();
        }
    }

    @o00oOooO.o0OOooO0(23)
    /* loaded from: classes.dex */
    public static final class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        @o00oOooO.oo0oO0
        public static StaticLayout o00oOOo0(@o00oOooO.oo0oO0 CharSequence charSequence, @o00oOooO.oo0oO0 Layout.Alignment alignment, int i, int i2, @o00oOooO.oo0oO0 TextView textView, @o00oOooO.oo0oO0 TextPaint textPaint, @o00oOooO.oo0oO0 o00oo00O o00oo00o) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                o00oo00o.o00oOOo0(obtain, textView);
            } catch (ClassCastException unused) {
            }
            return obtain.build();
        }
    }

    @o00oOooO.o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOo0O extends o00oo00O {
        @Override // androidx.appcompat.widget.o0O0O0Oo.o00oo00O
        public void o00oOOo0(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) o0O0O0Oo.o00oo0O0(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @o00oOooO.o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOoO extends o00oOo0O {
        @Override // androidx.appcompat.widget.o0O0O0Oo.o00oOo0O, androidx.appcompat.widget.o0O0O0Oo.o00oo00O
        public void o00oOOo0(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.o0O0O0Oo.o00oo00O
        public boolean o00oOOoO(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo00O {
        public void o00oOOo0(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean o00oOOoO(TextView textView) {
            return ((Boolean) o0O0O0Oo.o00oo0O0(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public o0O0O0Oo(@o00oOooO.oo0oO0 TextView textView) {
        this.f1200o00oOoOO = textView;
        this.f1201o00oOoOo = textView.getContext();
        this.f1202o00oOoo0 = Build.VERSION.SDK_INT >= 29 ? new o00oOoO() : new o00oOo0O();
    }

    public static <T> T o00oOOo0(@o00oOooO.oo0oO0 Object obj, @o00oOooO.oo0oO0 String str, @o00oOooO.oo0oO0 T t) {
        try {
            Field o00oo00O2 = o00oo00O(str);
            return o00oo00O2 == null ? t : (T) o00oo00O2.get(obj);
        } catch (IllegalAccessException unused) {
            return t;
        }
    }

    @o00oOooO.o0OO00OO
    public static Method o00oo0(@o00oOooO.oo0oO0 String str) {
        try {
            Method method = f1187o00oo0O.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1187o00oo0O.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    @o00oOooO.o0OO00OO
    public static Field o00oo00O(@o00oOooO.oo0oO0 String str) {
        try {
            Field field = f1190o00oo0Oo.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1190o00oo0Oo.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    public static <T> T o00oo0O0(@o00oOooO.oo0oO0 Object obj, @o00oOooO.oo0oO0 String str, @o00oOooO.oo0oO0 T t) {
        try {
            return (T) o00oo0(str).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            return t;
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOOoO() {
        if (o00oo0O()) {
            if (this.f1194o00oOOoO) {
                if (this.f1200o00oOoOO.getMeasuredHeight() <= 0 || this.f1200o00oOoOO.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f1202o00oOoo0.o00oOOoO(this.f1200o00oOoOO) ? 1048576 : (this.f1200o00oOoOO.getMeasuredWidth() - this.f1200o00oOoOO.getTotalPaddingLeft()) - this.f1200o00oOoOO.getTotalPaddingRight();
                int height = (this.f1200o00oOoOO.getHeight() - this.f1200o00oOoOO.getCompoundPaddingBottom()) - this.f1200o00oOoOO.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f1186o00oo00O;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float o00oOoO02 = o00oOoO0(rectF);
                    if (o00oOoO02 != this.f1200o00oOoOO.getTextSize()) {
                        o00oo(0, o00oOoO02);
                    }
                }
            }
            this.f1194o00oOOoO = true;
        }
    }

    public final int[] o00oOo00(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    @o00oOooO.oo0oO0
    @o00oOooO.o0o0000
    public StaticLayout o00oOo0O(@o00oOooO.oo0oO0 CharSequence charSequence, @o00oOooO.oo0oO0 Layout.Alignment alignment, int i, int i2) {
        return o00oOo00.o00oOOo0(charSequence, alignment, i, i2, this.f1200o00oOoOO, this.f1198o00oOoO, this.f1202o00oOoo0);
    }

    public final StaticLayout o00oOo0o(CharSequence charSequence, Layout.Alignment alignment, int i) {
        return new StaticLayout(charSequence, this.f1198o00oOoO, i, alignment, ((Float) o00oOOo0(this.f1200o00oOoOO, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) o00oOOo0(this.f1200o00oOoOO, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) o00oOOo0(this.f1200o00oOoOO, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int o00oOoO() {
        return Math.round(this.f1196o00oOo0O);
    }

    public final int o00oOoO0(RectF rectF) {
        int i;
        int length = this.f1197o00oOo0o.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = 0;
        int i3 = 1;
        int i4 = length - 1;
        while (true) {
            int i5 = i3;
            int i6 = i2;
            i2 = i5;
            while (i2 <= i4) {
                i = (i2 + i4) / 2;
                if (o00ooO0o(this.f1197o00oOo0o[i], rectF)) {
                    break;
                }
                i6 = i - 1;
                i4 = i6;
            }
            return this.f1197o00oOo0o[i6];
            i3 = i + 1;
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int o00oOoOO() {
        return Math.round(this.f1203o00oOooO);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int o00oOoOo() {
        return Math.round(this.f1195o00oOo00);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int[] o00oOoo0() {
        return this.f1197o00oOo0o;
    }

    public final void o00oOooO() {
        this.f1193o00oOOo0 = 0;
        this.f1203o00oOooO = -1.0f;
        this.f1196o00oOo0O = -1.0f;
        this.f1195o00oOo00 = -1.0f;
        this.f1197o00oOo0o = new int[0];
        this.f1194o00oOOoO = false;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public int o00oOooo() {
        return this.f1193o00oOOo0;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo(int i, float f) {
        Context context = this.f1201o00oOoOo;
        o0O0o(TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oo0O() {
        return o00ooO() && this.f1193o00oOOo0 != 0;
    }

    @o00oOooO.o0o0000
    public void o00oo0OO(int i) {
        TextPaint textPaint = this.f1198o00oOoO;
        if (textPaint == null) {
            this.f1198o00oOoO = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1198o00oOoO.set(this.f1200o00oOoOO.getPaint());
        this.f1198o00oOoO.setTextSize(i);
    }

    public void o00oo0Oo(@o00oOooO.o0OO00OO AttributeSet attributeSet, int i) {
        int resourceId;
        Context context = this.f1201o00oOoOo;
        int[] iArr = R.styleable.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView = this.f1200o00oOoOO;
        o0O000oo.o0O0o00O.o0O0oOo0(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = R.styleable.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f1193o00oOOo0 = obtainStyledAttributes.getInt(i2, 0);
        }
        int i3 = R.styleable.AppCompatTextView_autoSizeStepGranularity;
        float dimension = obtainStyledAttributes.hasValue(i3) ? obtainStyledAttributes.getDimension(i3, -1.0f) : -1.0f;
        int i4 = R.styleable.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getDimension(i4, -1.0f) : -1.0f;
        int i5 = R.styleable.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = obtainStyledAttributes.hasValue(i5) ? obtainStyledAttributes.getDimension(i5, -1.0f) : -1.0f;
        int i6 = R.styleable.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i6) && (resourceId = obtainStyledAttributes.getResourceId(i6, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            o00ooO0(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!o00ooO()) {
            this.f1193o00oOOo0 = 0;
        } else if (this.f1193o00oOOo0 == 1) {
            if (!this.f1199o00oOoO0) {
                DisplayMetrics displayMetrics = this.f1201o00oOoOo.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                o00ooOO0(dimension2, dimension3, dimension);
            }
            o00ooO00();
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo0o(@o00oOooO.oo0oO0 int[] iArr, int i) throws IllegalArgumentException {
        if (o00ooO()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1201o00oOoOo.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.f1197o00oOo0o = o00oOo00(iArr2);
                if (!o00ooO0O()) {
                    StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("None of the preset sizes is valid: ");
                    o00oOOo02.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(o00oOOo02.toString());
                }
            } else {
                this.f1199o00oOoO0 = false;
            }
            if (o00ooO00()) {
                o00oOOoO();
            }
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo0o0(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (o00ooO()) {
            DisplayMetrics displayMetrics = this.f1201o00oOoOo.getResources().getDisplayMetrics();
            o00ooOO0(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (o00ooO00()) {
                o00oOOoO();
            }
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo0oO(int i) {
        if (o00ooO()) {
            if (i == 0) {
                o00oOooO();
            } else if (i != 1) {
                throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Unknown auto-size text type: ", i));
            } else {
                DisplayMetrics displayMetrics = this.f1201o00oOoOo.getResources().getDisplayMetrics();
                o00ooOO0(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (o00ooO00()) {
                    o00oOOoO();
                }
            }
        }
    }

    public final boolean o00ooO() {
        return !(this.f1200o00oOoOO instanceof AppCompatEditText);
    }

    public final void o00ooO0(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.f1197o00oOo0o = o00oOo00(iArr);
            o00ooO0O();
        }
    }

    public final boolean o00ooO00() {
        if (o00ooO() && this.f1193o00oOOo0 == 1) {
            if (!this.f1199o00oOoO0 || this.f1197o00oOo0o.length == 0) {
                int floor = ((int) Math.floor((this.f1196o00oOo0O - this.f1203o00oOooO) / this.f1195o00oOo00)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f1195o00oOo00) + this.f1203o00oOooO);
                }
                this.f1197o00oOo0o = o00oOo00(iArr);
            }
            this.f1194o00oOOoO = true;
        } else {
            this.f1194o00oOOoO = false;
        }
        return this.f1194o00oOOoO;
    }

    public final boolean o00ooO0O() {
        int[] iArr = this.f1197o00oOo0o;
        int length = iArr.length;
        boolean z = length > 0;
        this.f1199o00oOoO0 = z;
        if (z) {
            this.f1193o00oOOo0 = 1;
            this.f1203o00oOooO = iArr[0];
            this.f1196o00oOo0O = iArr[length - 1];
            this.f1195o00oOo00 = -1.0f;
        }
        return z;
    }

    public final boolean o00ooO0o(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1200o00oOoOO.getText();
        TransformationMethod transformationMethod = this.f1200o00oOoOO.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f1200o00oOoOO)) != null) {
            text = transformation;
        }
        int o00oOOoO2 = o00oOOo0.o00oOOoO(this.f1200o00oOoOO);
        o00oo0OO(i);
        StaticLayout o00oOo0O2 = o00oOo0O(text, (Layout.Alignment) o00oo0O0(this.f1200o00oOoOO, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), o00oOOoO2);
        return (o00oOOoO2 == -1 || (o00oOo0O2.getLineCount() <= o00oOOoO2 && o00oOo0O2.getLineEnd(o00oOo0O2.getLineCount() - 1) == text.length())) && ((float) o00oOo0O2.getHeight()) <= rectF.bottom;
    }

    public final void o00ooOO0(float f, float f2, float f3) throws IllegalArgumentException {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f1193o00oOOo0 = 1;
            this.f1203o00oOooO = f;
            this.f1196o00oOo0O = f2;
            this.f1195o00oOo00 = f3;
            this.f1199o00oOoO0 = false;
        }
    }

    public final void o0O0o(float f) {
        if (f != this.f1200o00oOoOO.getPaint().getTextSize()) {
            this.f1200o00oOoOO.getPaint().setTextSize(f);
            boolean o00oOOo02 = o00oOOoO.o00oOOo0(this.f1200o00oOoOO);
            if (this.f1200o00oOoOO.getLayout() != null) {
                this.f1194o00oOOoO = false;
                try {
                    Method o00oo02 = o00oo0("nullLayouts");
                    if (o00oo02 != null) {
                        o00oo02.invoke(this.f1200o00oOoOO, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (o00oOOo02) {
                    this.f1200o00oOoOO.forceLayout();
                } else {
                    this.f1200o00oOoOO.requestLayout();
                }
                this.f1200o00oOoOO.invalidate();
            }
        }
    }
}
