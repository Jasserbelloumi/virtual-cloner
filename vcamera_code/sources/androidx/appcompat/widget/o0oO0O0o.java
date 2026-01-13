package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.R;
import java.lang.ref.WeakReference;
import java.util.Locale;
import o00oOooO.o0OO0oO;
import o00ooo0o.o0O0OO;
import o0OoO00O.oOooo;
/* loaded from: classes.dex */
public class o0oO0O0o {

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f1437o00oo0 = -1;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f1438o00oo0O = 3;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f1439o00oo0O0 = 2;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f1440o00oo0OO = 1;
    @o00oOooO.oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final TextView f1441o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public o0OO f1442o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public o0OO f1443o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public o0OO f1444o00oOo0O;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public o0OO f1445o00oOo0o;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public o0OO f1446o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public o0OO f1447o00oOoO0;
    @o00oOooO.oo0oO0

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public final o0O0O0Oo f1448o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public int f1449o00oOoOo = 0;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public int f1450o00oOoo0 = -1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public o0OO f1451o00oOooO;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public Typeface f1452o00oOooo;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public boolean f1453o00oo00O;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O0OO.o00oo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ int f1454o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ int f1455o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ WeakReference f1456o00oOo00;

        public o00oOOo0(int i, int i2, WeakReference weakReference) {
            this.f1454o00oOOo0 = i;
            this.f1455o00oOOoO = i2;
            this.f1456o00oOo00 = weakReference;
        }

        @Override // o00ooo0o.o0O0OO.o00oo0
        public void onFontRetrievalFailed(int i) {
        }

        @Override // o00ooo0o.o0O0OO.o00oo0
        public void onFontRetrieved(@o00oOooO.oo0oO0 Typeface typeface) {
            int i = this.f1454o00oOOo0;
            if (i != -1) {
                typeface = o00oo0.o00oOOo0(typeface, i, (this.f1455o00oOOoO & 2) != 0);
            }
            o0oO0O0o.this.o00oo0(this.f1456o00oOo00, typeface);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ Typeface f1458o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ TextView f1459o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ int f1460o00oo0Oo;

        public o00oOOoO(TextView textView, Typeface typeface, int i) {
            this.f1459o00oo0O0 = textView;
            this.f1458o00oo0O = typeface;
            this.f1460o00oo0Oo = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1459o00oo0O0.setTypeface(this.f1458o00oo0O, this.f1460o00oo0Oo);
        }
    }

    @o00oOooO.o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o00oOooO.o0O0O0Oo
        public static Drawable[] o00oOOo0(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o00oOooO.o0O0O0Oo
        public static Locale o00oOOo0(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @o00oOooO.o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o00oOooO.o0O0O0Oo
        public static LocaleList o00oOOo0(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @o00oOooO.o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oo0 {
        @o00oOooO.o0O0O0Oo
        public static Typeface o00oOOo0(Typeface typeface, int i, boolean z) {
            return Typeface.create(typeface, i, z);
        }
    }

    @o00oOooO.o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oo00O {
        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOooO(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    public o0oO0O0o(@o00oOooO.oo0oO0 TextView textView) {
        this.f1441o00oOOo0 = textView;
        this.f1448o00oOoOO = new o0O0O0Oo(textView);
    }

    public static o0OO o00oOooO(Context context, o00ooO o00ooo, int i) {
        ColorStateList o00oOo0o2 = o00ooo.o00oOo0o(context, i);
        if (o00oOo0o2 != null) {
            o0OO o0oo = new o0OO();
            o0oo.f1261o00oOooO = true;
            o0oo.f1258o00oOOo0 = o00oOo0o2;
            return o0oo;
        }
        return null;
    }

    public final void o00oOOo0(Drawable drawable, o0OO o0oo) {
        if (drawable == null || o0oo == null) {
            return;
        }
        o00ooO.o00oOoOo(drawable, o0oo, this.f1441o00oOOo0.getDrawableState());
    }

    public void o00oOOoO() {
        if (this.f1442o00oOOoO != null || this.f1443o00oOo00 != null || this.f1451o00oOooO != null || this.f1444o00oOo0O != null) {
            Drawable[] compoundDrawables = this.f1441o00oOOo0.getCompoundDrawables();
            o00oOOo0(compoundDrawables[0], this.f1442o00oOOoO);
            o00oOOo0(compoundDrawables[1], this.f1443o00oOo00);
            o00oOOo0(compoundDrawables[2], this.f1451o00oOooO);
            o00oOOo0(compoundDrawables[3], this.f1444o00oOo0O);
        }
        if (this.f1445o00oOo0o == null && this.f1447o00oOoO0 == null) {
            return;
        }
        Drawable[] o00oOOo02 = o00oOo00.o00oOOo0(this.f1441o00oOOo0);
        o00oOOo0(o00oOOo02[0], this.f1445o00oOo0o);
        o00oOOo0(o00oOOo02[2], this.f1447o00oOoO0);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oOo00() {
        this.f1448o00oOoOO.o00oOOoO();
    }

    public int o00oOo0O() {
        return this.f1448o00oOoOO.o00oOoO();
    }

    public int o00oOo0o() {
        return this.f1448o00oOoOO.o00oOoOO();
    }

    public int[] o00oOoO() {
        return this.f1448o00oOoOO.o00oOoo0();
    }

    public int o00oOoO0() {
        return this.f1448o00oOoOO.o00oOoOo();
    }

    public int o00oOoOO() {
        return this.f1448o00oOoOO.o00oOooo();
    }

    @o00oOooO.o0OO00OO
    public ColorStateList o00oOoOo() {
        o0OO o0oo = this.f1446o00oOoO;
        if (o0oo != null) {
            return o0oo.f1258o00oOOo0;
        }
        return null;
    }

    @o00oOooO.o0OO00OO
    public PorterDuff.Mode o00oOoo0() {
        o0OO o0oo = this.f1446o00oOoO;
        if (o0oo != null) {
            return o0oo.f1259o00oOOoO;
        }
        return null;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public boolean o00oOooo() {
        return this.f1448o00oOoOO.o00oo0O();
    }

    public void o00oo(@o00oOooO.o0OO00OO ColorStateList colorStateList) {
        if (this.f1446o00oOoO == null) {
            this.f1446o00oOoO = new o0OO();
        }
        o0OO o0oo = this.f1446o00oOoO;
        o0oo.f1258o00oOOo0 = colorStateList;
        o0oo.f1261o00oOooO = colorStateList != null;
        o00ooO0O();
    }

    public void o00oo0(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1453o00oo00O) {
            this.f1452o00oOooo = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (o0O000oo.o0O0o00O.o0O0OOoo(textView)) {
                    textView.post(new o00oOOoO(textView, typeface, this.f1449o00oOoOo));
                } else {
                    textView.setTypeface(typeface, this.f1449o00oOoOo);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f4  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o00oo00O(@o00oOooO.o0OO00OO android.util.AttributeSet r18, int r19) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0oO0O0o.o00oo00O(android.util.AttributeSet, int):void");
    }

    public void o00oo0O(Context context, int i) {
        String o00oo2;
        o0OOO0 o00ooOOo2 = o0OOO0.o00ooOOo(context, i, R.styleable.TextAppearance);
        int i2 = R.styleable.TextAppearance_textAllCaps;
        if (o00ooOOo2.o00ooOO0(i2)) {
            o00oo0o0(o00ooOOo2.o00oOOo0(i2, false));
        }
        int i3 = R.styleable.TextAppearance_android_textSize;
        if (o00ooOOo2.o00ooOO0(i3) && o00ooOOo2.o00oOoO0(i3, -1) == 0) {
            this.f1441o00oOOo0.setTextSize(0, 0.0f);
        }
        o00ooOO0(context, o00ooOOo2);
        int i4 = R.styleable.TextAppearance_fontVariationSettings;
        if (o00ooOOo2.o00ooOO0(i4) && (o00oo2 = o00ooOOo2.o00oo(i4)) != null) {
            o00oo00O.o00oOooO(this.f1441o00oOOo0, o00oo2);
        }
        o00ooOOo2.o00ooOoo();
        Typeface typeface = this.f1452o00oOooo;
        if (typeface != null) {
            this.f1441o00oOOo0.setTypeface(typeface, this.f1449o00oOoOo);
        }
    }

    public void o00oo0O0() {
        o00oOOoO();
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00oo0OO(boolean z, int i, int i2, int i3, int i4) {
        if (o.f1019o00oOo00) {
            return;
        }
        o00oOo00();
    }

    public void o00oo0Oo(@o00oOooO.oo0oO0 TextView textView, @o00oOooO.o0OO00OO InputConnection inputConnection, @o00oOooO.oo0oO0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        oOooo.o00oOoOo(editorInfo, textView.getText());
    }

    public void o00oo0o(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        this.f1448o00oOoOO.o00oo0o0(i, i2, i3, i4);
    }

    public void o00oo0o0(boolean z) {
        this.f1441o00oOOo0.setAllCaps(z);
    }

    public void o00oo0oO(@o00oOooO.oo0oO0 int[] iArr, int i) throws IllegalArgumentException {
        this.f1448o00oOoOO.o00oo0o(iArr, i);
    }

    public final void o00ooO(int i, float f) {
        this.f1448o00oOoOO.o00oo(i, f);
    }

    public final void o00ooO0(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] o00oOOo02 = o00oOo00.o00oOOo0(this.f1441o00oOOo0);
            TextView textView = this.f1441o00oOOo0;
            if (drawable5 == null) {
                drawable5 = o00oOOo02[0];
            }
            if (drawable2 == null) {
                drawable2 = o00oOOo02[1];
            }
            if (drawable6 == null) {
                drawable6 = o00oOOo02[2];
            }
            if (drawable4 == null) {
                drawable4 = o00oOOo02[3];
            }
            o00oOo00.o00oOOoO(textView, drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            Drawable[] o00oOOo03 = o00oOo00.o00oOOo0(this.f1441o00oOOo0);
            Drawable drawable7 = o00oOOo03[0];
            if (drawable7 != null || o00oOOo03[2] != null) {
                TextView textView2 = this.f1441o00oOOo0;
                if (drawable2 == null) {
                    drawable2 = o00oOOo03[1];
                }
                Drawable drawable8 = o00oOOo03[2];
                if (drawable4 == null) {
                    drawable4 = o00oOOo03[3];
                }
                o00oOo00.o00oOOoO(textView2, drawable7, drawable2, drawable8, drawable4);
                return;
            }
            Drawable[] compoundDrawables = this.f1441o00oOOo0.getCompoundDrawables();
            TextView textView3 = this.f1441o00oOOo0;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    public void o00ooO00(@o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        if (this.f1446o00oOoO == null) {
            this.f1446o00oOoO = new o0OO();
        }
        o0OO o0oo = this.f1446o00oOoO;
        o0oo.f1259o00oOOoO = mode;
        o0oo.f1260o00oOo00 = mode != null;
        o00ooO0O();
    }

    public final void o00ooO0O() {
        o0OO o0oo = this.f1446o00oOoO;
        this.f1442o00oOOoO = o0oo;
        this.f1443o00oOo00 = o0oo;
        this.f1451o00oOooO = o0oo;
        this.f1444o00oOo0O = o0oo;
        this.f1445o00oOo0o = o0oo;
        this.f1447o00oOoO0 = o0oo;
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public void o00ooO0o(int i, float f) {
        if (o.f1019o00oOo00 || o00oOooo()) {
            return;
        }
        o00ooO(i, f);
    }

    public final void o00ooOO0(Context context, o0OOO0 o0ooo0) {
        String o00oo2;
        Typeface create;
        Typeface typeface;
        this.f1449o00oOoOo = o0ooo0.o00oo0OO(R.styleable.TextAppearance_android_textStyle, this.f1449o00oOoOo);
        int o00oo0OO2 = o0ooo0.o00oo0OO(R.styleable.TextAppearance_android_textFontWeight, -1);
        this.f1450o00oOoo0 = o00oo0OO2;
        if (o00oo0OO2 != -1) {
            this.f1449o00oOoOo = (this.f1449o00oOoOo & 2) | 0;
        }
        int i = R.styleable.TextAppearance_android_fontFamily;
        if (!o0ooo0.o00ooOO0(i) && !o0ooo0.o00ooOO0(R.styleable.TextAppearance_fontFamily)) {
            int i2 = R.styleable.TextAppearance_android_typeface;
            if (o0ooo0.o00ooOO0(i2)) {
                this.f1453o00oo00O = false;
                int o00oo0OO3 = o0ooo0.o00oo0OO(i2, 1);
                if (o00oo0OO3 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (o00oo0OO3 == 2) {
                    typeface = Typeface.SERIF;
                } else if (o00oo0OO3 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f1452o00oOooo = typeface;
                return;
            }
            return;
        }
        this.f1452o00oOooo = null;
        int i3 = R.styleable.TextAppearance_fontFamily;
        if (o0ooo0.o00ooOO0(i3)) {
            i = i3;
        }
        int i4 = this.f1450o00oOoo0;
        int i5 = this.f1449o00oOoOo;
        if (!context.isRestricted()) {
            try {
                Typeface o00oOoo02 = o0ooo0.o00oOoo0(i, this.f1449o00oOoOo, new o00oOOo0(i4, i5, new WeakReference(this.f1441o00oOOo0)));
                if (o00oOoo02 != null) {
                    if (this.f1450o00oOoo0 != -1) {
                        o00oOoo02 = o00oo0.o00oOOo0(Typeface.create(o00oOoo02, 0), this.f1450o00oOoo0, (this.f1449o00oOoOo & 2) != 0);
                    }
                    this.f1452o00oOooo = o00oOoo02;
                }
                this.f1453o00oo00O = this.f1452o00oOooo == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1452o00oOooo != null || (o00oo2 = o0ooo0.o00oo(i)) == null) {
            return;
        }
        if (this.f1450o00oOoo0 != -1) {
            create = o00oo0.o00oOOo0(Typeface.create(o00oo2, 0), this.f1450o00oOoo0, (this.f1449o00oOoOo & 2) != 0);
        } else {
            create = Typeface.create(o00oo2, this.f1449o00oOoOo);
        }
        this.f1452o00oOooo = create;
    }

    public void o0O0o(int i) {
        this.f1448o00oOoOO.o00oo0oO(i);
    }
}
