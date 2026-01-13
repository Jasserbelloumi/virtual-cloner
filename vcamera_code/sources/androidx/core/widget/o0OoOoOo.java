package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO0;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0OoOoOO.o0OO00o;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public final class o0OoOoOo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f2534o00oOOo0 = "TextViewCompat";

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f2535o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f2536o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static boolean f2537o00oOo0O = false;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static Field f2538o00oOo0o = null;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static Field f2539o00oOoO = null;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static boolean f2540o00oOoO0 = false;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static boolean f2541o00oOoOO = false;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static Field f2542o00oOoOo = null;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static boolean f2543o00oOoo0 = false;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Field f2544o00oOooO = null;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f2545o00oOooo = 1;

    @o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static boolean o00oOOo0(TextView textView) {
            return textView.getIncludeFontPadding();
        }

        @o0O0O0Oo
        public static int o00oOOoO(TextView textView) {
            return textView.getMaxLines();
        }

        @o0O0O0Oo
        public static int o00oOo00(TextView textView) {
            return textView.getMinLines();
        }
    }

    @o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        public static Drawable[] o00oOOo0(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        @o0O0O0Oo
        public static int o00oOOoO(View view) {
            return view.getLayoutDirection();
        }

        @o0O0O0Oo
        public static int o00oOo00(View view) {
            return view.getTextDirection();
        }

        @o0O0O0Oo
        public static void o00oOo0O(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        }

        @o0O0O0Oo
        public static void o00oOo0o(TextView textView, int i, int i2, int i3, int i4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        }

        @o0O0O0Oo
        public static void o00oOoO(View view, int i) {
            view.setTextDirection(i);
        }

        @o0O0O0Oo
        public static void o00oOoO0(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        @o0O0O0Oo
        public static Locale o00oOooO(TextView textView) {
            return textView.getTextLocale();
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOo00 {
        @o0O0O0Oo
        public static int o00oOOo0(TextView textView) {
            return textView.getBreakStrategy();
        }

        @o0O0O0Oo
        public static ColorStateList o00oOOoO(TextView textView) {
            return textView.getCompoundDrawableTintList();
        }

        @o0O0O0Oo
        public static PorterDuff.Mode o00oOo00(TextView textView) {
            return textView.getCompoundDrawableTintMode();
        }

        @o0O0O0Oo
        public static void o00oOo0O(TextView textView, int i) {
            textView.setBreakStrategy(i);
        }

        @o0O0O0Oo
        public static void o00oOo0o(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        @o0O0O0Oo
        public static void o00oOoO(TextView textView, int i) {
            textView.setHyphenationFrequency(i);
        }

        @o0O0O0Oo
        public static void o00oOoO0(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        @o0O0O0Oo
        public static int o00oOooO(TextView textView) {
            return textView.getHyphenationFrequency();
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOo0O {
        @o0O0O0Oo
        public static DecimalFormatSymbols o00oOOo0(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oOoO {
        @o0O0O0Oo
        public static int o00oOOo0(TextView textView) {
            return textView.getAutoSizeMaxTextSize();
        }

        @o0O0O0Oo
        public static int o00oOOoO(TextView textView) {
            return textView.getAutoSizeMinTextSize();
        }

        @o0O0O0Oo
        public static int o00oOo00(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @o0O0O0Oo
        public static int o00oOo0O(TextView textView) {
            return textView.getAutoSizeTextType();
        }

        @o0O0O0Oo
        public static void o00oOo0o(TextView textView, int i, int i2, int i3, int i4) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
        }

        @o0O0O0Oo
        public static void o00oOoO(TextView textView, int i) {
            textView.setAutoSizeTextTypeWithDefaults(i);
        }

        @o0O0O0Oo
        public static void o00oOoO0(TextView textView, int[] iArr, int i) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
        }

        @o0O0O0Oo
        public static int[] o00oOooO(TextView textView) {
            return textView.getAutoSizeTextAvailableSizes();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o00oo0 {
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oo00O {
        @o0O0O0Oo
        public static String[] o00oOOo0(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        @o0O0O0Oo
        public static PrecomputedText.Params o00oOOoO(TextView textView) {
            return textView.getTextMetricsParams();
        }

        @o0O0O0Oo
        public static void o00oOo00(TextView textView, int i) {
            textView.setFirstBaselineToTopHeight(i);
        }
    }

    @o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o00oo0OO implements ActionMode.Callback {

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final int f2546o00oOoO0 = 100;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final ActionMode.Callback f2547o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final TextView f2548o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public Class<?> f2549o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public boolean f2550o00oOo0O;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public boolean f2551o00oOo0o = false;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public Method f2552o00oOooO;

        public o00oo0OO(ActionMode.Callback callback, TextView textView) {
            this.f2547o00oOOo0 = callback;
            this.f2548o00oOOoO = textView;
        }

        public final Intent o00oOOo0() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final Intent o00oOOoO(ResolveInfo resolveInfo, TextView textView) {
            Intent putExtra = o00oOOo0().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !o00oOo0O(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return putExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        public final List<ResolveInfo> o00oOo00(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(o00oOOo0(), 0)) {
                    if (o00oOo0o(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
                return arrayList;
            }
            return arrayList;
        }

        public final boolean o00oOo0O(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        public final boolean o00oOo0o(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo.exported) {
                String str = activityInfo.permission;
                return str == null || context.checkSelfPermission(str) == 0;
            }
            return false;
        }

        public final void o00oOoO0(Menu menu) {
            Context context = this.f2548o00oOOoO.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f2551o00oOo0o) {
                this.f2551o00oOo0o = true;
                try {
                    Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2549o00oOo00 = cls;
                    this.f2552o00oOooO = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                    this.f2550o00oOo0O = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2549o00oOo00 = null;
                    this.f2552o00oOooO = null;
                    this.f2550o00oOo0O = false;
                }
            }
            try {
                Method declaredMethod = (this.f2550o00oOo0O && this.f2549o00oOo00.isInstance(menu)) ? this.f2552o00oOooO : menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> o00oOo002 = o00oOo00(context, packageManager);
                for (int i = 0; i < o00oOo002.size(); i++) {
                    ResolveInfo resolveInfo = o00oOo002.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(o00oOOoO(resolveInfo, this.f2548o00oOOoO)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @oo0oO0
        public ActionMode.Callback o00oOooO() {
            return this.f2547o00oOOo0;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2547o00oOOo0.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2547o00oOOo0.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2547o00oOOo0.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            o00oOoO0(menu);
            return this.f2547o00oOOo0.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int o00oOOo0(@oo0oO0 TextView textView) {
        return o00oOoO.o00oOOo0(textView);
    }

    public static int o00oOOoO(@oo0oO0 TextView textView) {
        return o00oOoO.o00oOOoO(textView);
    }

    public static int o00oOo00(@oo0oO0 TextView textView) {
        return o00oOoO.o00oOo00(textView);
    }

    public static int o00oOo0O(@oo0oO0 TextView textView) {
        return o00oOoO.o00oOo0O(textView);
    }

    @o0OO00OO
    public static ColorStateList o00oOo0o(@oo0oO0 TextView textView) {
        textView.getClass();
        return o00oOo00.o00oOOoO(textView);
    }

    @oo0oO0
    public static Drawable[] o00oOoO(@oo0oO0 TextView textView) {
        return o00oOOoO.o00oOOo0(textView);
    }

    @o0OO00OO
    public static PorterDuff.Mode o00oOoO0(@oo0oO0 TextView textView) {
        textView.getClass();
        return o00oOo00.o00oOo00(textView);
    }

    public static int o00oOoOO(@oo0oO0 TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int o00oOoOo(@oo0oO0 TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static int o00oOoo0(@oo0oO0 TextView textView) {
        return o00oOOo0.o00oOOoO(textView);
    }

    @oo0oO0
    public static int[] o00oOooO(@oo0oO0 TextView textView) {
        return o00oOoO.o00oOooO(textView);
    }

    public static int o00oOooo(@oo0oO0 TextView textView) {
        return o00oOOo0.o00oOo00(textView);
    }

    public static void o00oo(@oo0oO0 TextView textView, @o0OO00OO Drawable drawable, @o0OO00OO Drawable drawable2, @o0OO00OO Drawable drawable3, @o0OO00OO Drawable drawable4) {
        o00oOOoO.o00oOo0O(textView, drawable, drawable2, drawable3, drawable4);
    }

    @o0OOooO0(18)
    public static TextDirectionHeuristic o00oo0(@oo0oO0 TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if ((textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(o00oo00O.o00oOOo0(o00oOo0O.o00oOOo0(o00oOOoO.o00oOooO(textView)))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z = o00oOOoO.o00oOOoO(textView) == 1;
        switch (o00oOOoO.o00oOo00(textView)) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    @o0OOooO0(18)
    public static int o00oo00O(@oo0oO0 TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        return textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL ? 7 : 1;
    }

    public static int o00oo0O(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            field.getName();
            return -1;
        }
    }

    public static Field o00oo0O0(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException unused) {
            return field;
        }
    }

    @oo0oO0
    public static o0OO00o.o00oOOo0 o00oo0OO(@oo0oO0 TextView textView) {
        return new o0OO00o.o00oOOo0(o00oo00O.o00oOOoO(textView));
    }

    public static void o00oo0Oo(@oo0oO0 TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        o00oOoO.o00oOo0o(textView, i, i2, i3, i4);
    }

    public static void o00oo0o(@oo0oO0 TextView textView, int i) {
        o00oOoO.o00oOoO(textView, i);
    }

    public static void o00oo0o0(@oo0oO0 TextView textView, @oo0oO0 int[] iArr, int i) throws IllegalArgumentException {
        o00oOoO.o00oOoO0(textView, iArr, i);
    }

    public static void o00oo0oO(@oo0oO0 TextView textView, @o0OO00OO ColorStateList colorStateList) {
        textView.getClass();
        o00oOo00.o00oOo0o(textView, colorStateList);
    }

    public static void o00ooO(@oo0oO0 TextView textView, @o0OO0 @o0O0o00O(from = 0) int i) {
        ooOOOOoo.o00oOoOO(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i2 = o00oOOo0.o00oOOo0(textView) ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void o00ooO0(@oo0oO0 TextView textView, @o0OO00OO Drawable drawable, @o0OO00OO Drawable drawable2, @o0OO00OO Drawable drawable3, @o0OO00OO Drawable drawable4) {
        o00oOOoO.o00oOoO0(textView, drawable, drawable2, drawable3, drawable4);
    }

    public static void o00ooO00(@oo0oO0 TextView textView, @o0O0O0o0 int i, @o0O0O0o0 int i2, @o0O0O0o0 int i3, @o0O0O0o0 int i4) {
        o00oOOoO.o00oOo0o(textView, i, i2, i3, i4);
    }

    public static void o00ooO0O(@oo0oO0 TextView textView, @oo0oO0 ActionMode.Callback callback) {
        textView.setCustomSelectionActionModeCallback(callback);
    }

    public static void o00ooO0o(@oo0oO0 TextView textView, @o0OO0 @o0O0o00O(from = 0) int i) {
        ooOOOOoo.o00oOoOO(i);
        o00oo00O.o00oOo00(textView, i);
    }

    public static void o00ooOO(@oo0oO0 TextView textView, @oo0oO0 o0OO00o o0oo00o) {
        PrecomputedText precomputedText;
        if (Build.VERSION.SDK_INT >= 29) {
            precomputedText = o0oo00o.o00oOo0o();
        } else {
            boolean o00oOOo02 = o00oo0OO(textView).o00oOOo0(o0oo00o.o00oOo0O());
            precomputedText = o0oo00o;
            if (!o00oOOo02) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
        }
        textView.setText(precomputedText);
    }

    public static void o00ooOO0(@oo0oO0 TextView textView, @o0OO0 @o0O0o00O(from = 0) int i) {
        ooOOOOoo.o00oOoOO(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void o00ooOOo(@oo0oO0 TextView textView, @o0OOO0OO int i) {
        textView.setTextAppearance(i);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback o00ooOo(@o0OO00OO ActionMode.Callback callback) {
        return callback instanceof o00oo0OO ? ((o00oo0OO) callback).o00oOooO() : callback;
    }

    public static void o00ooOo0(@oo0oO0 TextView textView, @oo0oO0 o0OO00o.o00oOOo0 o00oooo02) {
        o00oOOoO.o00oOoO(textView, o00oo00O(o00oooo02.f16846o00oOOoO));
        textView.getPaint().set(o00oooo02.f16845o00oOOo0);
        o00oOo00.o00oOo0O(textView, o00oooo02.f16847o00oOo00);
        o00oOo00.o00oOoO(textView, o00oooo02.f16849o00oOooO);
    }

    @o0OO00OO
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public static ActionMode.Callback o00ooOoO(@oo0oO0 TextView textView, @o0OO00OO ActionMode.Callback callback) {
        return callback;
    }

    public static void o0O0o(@oo0oO0 TextView textView, @o0OO00OO PorterDuff.Mode mode) {
        textView.getClass();
        o00oOo00.o00oOoO0(textView, mode);
    }
}
