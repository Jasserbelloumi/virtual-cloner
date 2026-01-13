package o0OoOoOO;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.v4.media.o00oOo0O;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import o00oOooO.o0O0OOOo;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOo000;
import o0O000.o0O00OOO;
import o0ooOoOO.oO0Ooooo;
import o0ooOoOO.ooOOOOoo;
/* loaded from: classes.dex */
public class o0OO00o implements Spannable {

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final char f16838o00oo0o = '\n';

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final Object f16839o00oo0oO = new Object();
    @o0O0OOOo("sLock")
    @o00oOooO.oo0oO0

    /* renamed from: o0O0o  reason: collision with root package name */
    public static Executor f16840o0O0o;
    @o00oOooO.oo0oO0

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oOOo0 f16841o00oo0O;
    @o00oOooO.oo0oO0

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Spannable f16842o00oo0O0;
    @o00oOooO.oo0oO0

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int[] f16843o00oo0Oo;
    @o00oOooO.o0OO00OO

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final PrecomputedText f16844o00oo0o0;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final TextPaint f16845o00oOOo0;
        @o00oOooO.o0OO00OO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final TextDirectionHeuristic f16846o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f16847o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public final PrecomputedText.Params f16848o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final int f16849o00oOooO;

        /* renamed from: o0OoOoOO.o0OO00o$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0221o00oOOo0 {
            @o00oOooO.oo0oO0

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public final TextPaint f16850o00oOOo0;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public int f16852o00oOo00 = 1;

            /* renamed from: o00oOooO  reason: collision with root package name */
            public int f16853o00oOooO = 1;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public TextDirectionHeuristic f16851o00oOOoO = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0221o00oOOo0(@o00oOooO.oo0oO0 TextPaint textPaint) {
                this.f16850o00oOOo0 = textPaint;
            }

            @o00oOooO.oo0oO0
            public o00oOOo0 o00oOOo0() {
                return new o00oOOo0(this.f16850o00oOOo0, this.f16851o00oOOoO, this.f16852o00oOo00, this.f16853o00oOooO);
            }

            @o00oOooO.o0OOooO0(23)
            public C0221o00oOOo0 o00oOOoO(int i) {
                this.f16852o00oOo00 = i;
                return this;
            }

            @o00oOooO.o0OOooO0(23)
            public C0221o00oOOo0 o00oOo00(int i) {
                this.f16853o00oOooO = i;
                return this;
            }

            @o00oOooO.o0OOooO0(18)
            public C0221o00oOOo0 o00oOooO(@o00oOooO.oo0oO0 TextDirectionHeuristic textDirectionHeuristic) {
                this.f16851o00oOOoO = textDirectionHeuristic;
                return this;
            }
        }

        @o00oOooO.o0OOooO0(28)
        public o00oOOo0(@o00oOooO.oo0oO0 PrecomputedText.Params params) {
            this.f16845o00oOOo0 = params.getTextPaint();
            this.f16846o00oOOoO = params.getTextDirection();
            this.f16847o00oOo00 = params.getBreakStrategy();
            this.f16849o00oOooO = params.getHyphenationFrequency();
            this.f16848o00oOo0O = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public o00oOOo0(@o00oOooO.oo0oO0 TextPaint textPaint, @o00oOooO.oo0oO0 TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            this.f16848o00oOo0O = Build.VERSION.SDK_INT >= 29 ? new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build() : null;
            this.f16845o00oOOo0 = textPaint;
            this.f16846o00oOOoO = textDirectionHeuristic;
            this.f16847o00oOo00 = i;
            this.f16849o00oOooO = i2;
        }

        public boolean equals(@o00oOooO.o0OO00OO Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof o00oOOo0) {
                o00oOOo0 o00oooo02 = (o00oOOo0) obj;
                return o00oOOo0(o00oooo02) && this.f16846o00oOOoO == o00oooo02.f16846o00oOOoO;
            }
            return false;
        }

        public int hashCode() {
            return oO0Ooooo.o00oOOo0.o00oOOoO(Float.valueOf(this.f16845o00oOOo0.getTextSize()), Float.valueOf(this.f16845o00oOOo0.getTextScaleX()), Float.valueOf(this.f16845o00oOOo0.getTextSkewX()), Float.valueOf(this.f16845o00oOOo0.getLetterSpacing()), Integer.valueOf(this.f16845o00oOOo0.getFlags()), this.f16845o00oOOo0.getTextLocales(), this.f16845o00oOOo0.getTypeface(), Boolean.valueOf(this.f16845o00oOOo0.isElegantTextHeight()), this.f16846o00oOOoO, Integer.valueOf(this.f16847o00oOo00), Integer.valueOf(this.f16849o00oOooO));
        }

        @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
        public boolean o00oOOo0(@o00oOooO.oo0oO0 o00oOOo0 o00oooo02) {
            if (this.f16847o00oOo00 == o00oooo02.f16847o00oOo00 && this.f16849o00oOooO == o00oooo02.f16849o00oOooO && this.f16845o00oOOo0.getTextSize() == o00oooo02.f16845o00oOOo0.getTextSize() && this.f16845o00oOOo0.getTextScaleX() == o00oooo02.f16845o00oOOo0.getTextScaleX() && this.f16845o00oOOo0.getTextSkewX() == o00oooo02.f16845o00oOOo0.getTextSkewX() && this.f16845o00oOOo0.getLetterSpacing() == o00oooo02.f16845o00oOOo0.getLetterSpacing() && TextUtils.equals(this.f16845o00oOOo0.getFontFeatureSettings(), o00oooo02.f16845o00oOOo0.getFontFeatureSettings()) && this.f16845o00oOOo0.getFlags() == o00oooo02.f16845o00oOOo0.getFlags() && this.f16845o00oOOo0.getTextLocales().equals(o00oooo02.f16845o00oOOo0.getTextLocales())) {
                return this.f16845o00oOOo0.getTypeface() == null ? o00oooo02.f16845o00oOOo0.getTypeface() == null : this.f16845o00oOOo0.getTypeface().equals(o00oooo02.f16845o00oOOo0.getTypeface());
            }
            return false;
        }

        @o00oOooO.o0OOooO0(23)
        public int o00oOOoO() {
            return this.f16847o00oOo00;
        }

        @o00oOooO.o0OOooO0(23)
        public int o00oOo00() {
            return this.f16849o00oOooO;
        }

        @o00oOooO.oo0oO0
        public TextPaint o00oOo0O() {
            return this.f16845o00oOOo0;
        }

        @o00oOooO.o0OOooO0(18)
        @o00oOooO.o0OO00OO
        public TextDirectionHeuristic o00oOooO() {
            return this.f16846o00oOOoO;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("textSize=");
            o00oOOo02.append(this.f16845o00oOOo0.getTextSize());
            sb.append(o00oOOo02.toString());
            sb.append(", textScaleX=" + this.f16845o00oOOo0.getTextScaleX());
            sb.append(", textSkewX=" + this.f16845o00oOOo0.getTextSkewX());
            sb.append(", letterSpacing=" + this.f16845o00oOOo0.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f16845o00oOOo0.isElegantTextHeight());
            sb.append(", textLocale=" + this.f16845o00oOOo0.getTextLocales());
            sb.append(", typeface=" + this.f16845o00oOOo0.getTypeface());
            sb.append(", variationSettings=" + this.f16845o00oOOo0.getFontVariationSettings());
            sb.append(", textDir=" + this.f16846o00oOOoO);
            sb.append(", breakStrategy=" + this.f16847o00oOo00);
            sb.append(", hyphenationFrequency=" + this.f16849o00oOooO);
            sb.append("}");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends FutureTask<o0OO00o> {

        /* loaded from: classes.dex */
        public static class o00oOOo0 implements Callable<o0OO00o> {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public o00oOOo0 f16854o00oOOo0;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public CharSequence f16855o00oOOoO;

            public o00oOOo0(@o00oOooO.oo0oO0 o00oOOo0 o00oooo02, @o00oOooO.oo0oO0 CharSequence charSequence) {
                this.f16854o00oOOo0 = o00oooo02;
                this.f16855o00oOOoO = charSequence;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: o00oOOo0 */
            public o0OO00o call() throws Exception {
                return o0OO00o.o00oOOo0(this.f16855o00oOOoO, this.f16854o00oOOo0);
            }
        }

        public o00oOOoO(@o00oOooO.oo0oO0 o00oOOo0 o00oooo02, @o00oOooO.oo0oO0 CharSequence charSequence) {
            super(new o00oOOo0(o00oooo02, charSequence));
        }
    }

    @o00oOooO.o0OOooO0(28)
    public o0OO00o(@o00oOooO.oo0oO0 PrecomputedText precomputedText, @o00oOooO.oo0oO0 o00oOOo0 o00oooo02) {
        this.f16842o00oo0O0 = precomputedText;
        this.f16841o00oo0O = o00oooo02;
        this.f16843o00oo0Oo = null;
        this.f16844o00oo0o0 = Build.VERSION.SDK_INT < 29 ? null : precomputedText;
    }

    public o0OO00o(@o00oOooO.oo0oO0 CharSequence charSequence, @o00oOooO.oo0oO0 o00oOOo0 o00oooo02, @o00oOooO.oo0oO0 int[] iArr) {
        this.f16842o00oo0O0 = new SpannableString(charSequence);
        this.f16841o00oo0O = o00oooo02;
        this.f16843o00oo0Oo = iArr;
        this.f16844o00oo0o0 = null;
    }

    @SuppressLint({"WrongConstant"})
    public static o0OO00o o00oOOo0(@o00oOooO.oo0oO0 CharSequence charSequence, @o00oOooO.oo0oO0 o00oOOo0 o00oooo02) {
        PrecomputedText.Params params;
        charSequence.getClass();
        o00oooo02.getClass();
        try {
            o0O00OOO.o00oOOoO("PrecomputedText");
            if (Build.VERSION.SDK_INT >= 29 && (params = o00oooo02.f16848o00oOo0O) != null) {
                o0OO00o o0oo00o = new o0OO00o(PrecomputedText.create(charSequence, params), o00oooo02);
                o0O00OOO.o00oOOo0.o00oOOoO();
                return o0oo00o;
            }
            ArrayList arrayList = new ArrayList();
            int length = charSequence.length();
            int i = 0;
            while (i < length) {
                int indexOf = TextUtils.indexOf(charSequence, '\n', i, length);
                i = indexOf < 0 ? length : indexOf + 1;
                arrayList.add(Integer.valueOf(i));
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
            StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), o00oooo02.f16845o00oOOo0, Integer.MAX_VALUE).setBreakStrategy(o00oooo02.f16847o00oOo00).setHyphenationFrequency(o00oooo02.f16849o00oOooO).setTextDirection(o00oooo02.f16846o00oOOoO).build();
            o0OO00o o0oo00o2 = new o0OO00o(charSequence, o00oooo02, iArr);
            o0O00OOO.o00oOOo0.o00oOOoO();
            return o0oo00o2;
        } catch (Throwable th) {
            o0O00OOO.o00oOooO();
            throw th;
        }
    }

    @o0OOo000
    public static Future<o0OO00o> o00oOoO0(@o00oOooO.oo0oO0 CharSequence charSequence, @o00oOooO.oo0oO0 o00oOOo0 o00oooo02, @o00oOooO.o0OO00OO Executor executor) {
        o00oOOoO o00ooooo2 = new o00oOOoO(o00oooo02, charSequence);
        if (executor == null) {
            synchronized (f16839o00oo0oO) {
                if (f16840o0O0o == null) {
                    f16840o0O0o = Executors.newFixedThreadPool(1);
                }
                executor = f16840o0O0o;
            }
        }
        executor.execute(o00ooooo2);
        return o00ooooo2;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f16842o00oo0O0.charAt(i);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f16842o00oo0O0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f16842o00oo0O0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f16842o00oo0O0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? (T[]) this.f16844o00oo0o0.getSpans(i, i2, cls) : (T[]) this.f16842o00oo0O0.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f16842o00oo0O0.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f16842o00oo0O0.nextSpanTransition(i, i2, cls);
    }

    @o0O0o00O(from = 0)
    public int o00oOOoO() {
        return Build.VERSION.SDK_INT >= 29 ? this.f16844o00oo0o0.getParagraphCount() : this.f16843o00oo0Oo.length;
    }

    @o0O0o00O(from = 0)
    public int o00oOo00(@o0O0o00O(from = 0) int i) {
        ooOOOOoo.o00oOoO0(i, 0, o00oOOoO(), "paraIndex");
        return Build.VERSION.SDK_INT >= 29 ? this.f16844o00oo0o0.getParagraphEnd(i) : this.f16843o00oo0Oo[i];
    }

    @o00oOooO.oo0oO0
    public o00oOOo0 o00oOo0O() {
        return this.f16841o00oo0O;
    }

    @o00oOooO.o0OOooO0(28)
    @o00oOooO.o0OO00OO
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public PrecomputedText o00oOo0o() {
        Spannable spannable = this.f16842o00oo0O0;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    @o0O0o00O(from = 0)
    public int o00oOooO(@o0O0o00O(from = 0) int i) {
        ooOOOOoo.o00oOoO0(i, 0, o00oOOoO(), "paraIndex");
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f16844o00oo0o0.getParagraphStart(i);
        }
        if (i == 0) {
            return 0;
        }
        return this.f16843o00oo0Oo[i - 1];
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f16844o00oo0o0.removeSpan(obj);
        } else {
            this.f16842o00oo0O0.removeSpan(obj);
        }
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f16844o00oo0o0.setSpan(obj, i, i2, i3);
        } else {
            this.f16842o00oo0O0.setSpan(obj, i, i2, i3);
        }
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.f16842o00oo0O0.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @o00oOooO.oo0oO0
    public String toString() {
        return this.f16842o00oo0O0.toString();
    }
}
