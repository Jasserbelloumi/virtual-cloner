package androidx.emoji2.text;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.stream.IntStream;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0OoOoOO.o0OO00o;
/* loaded from: classes.dex */
public class o0O000O implements Spannable {
    @oo0oO0

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Spannable f2770o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public boolean f2771o00oo0O0 = false;

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        public static IntStream o00oOOo0(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream o00oOOoO(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO {
        public boolean o00oOOo0(CharSequence charSequence) {
            return charSequence instanceof o0OO00o;
        }
    }

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oOOoO {
        @Override // androidx.emoji2.text.o0O000O.o00oOOoO
        public boolean o00oOOo0(CharSequence charSequence) {
            return (charSequence instanceof PrecomputedText) || (charSequence instanceof o0OO00o);
        }
    }

    public o0O000O(@oo0oO0 Spannable spannable) {
        this.f2770o00oo0O = spannable;
    }

    public o0O000O(@oo0oO0 Spanned spanned) {
        this.f2770o00oo0O = new SpannableString(spanned);
    }

    public o0O000O(@oo0oO0 CharSequence charSequence) {
        this.f2770o00oo0O = new SpannableString(charSequence);
    }

    public static o00oOOoO o00oOo00() {
        return new o00oOo00();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f2770o00oo0O.charAt(i);
    }

    @Override // java.lang.CharSequence
    @o0OOooO0(api = 24)
    @oo0oO0
    public IntStream chars() {
        return this.f2770o00oo0O.chars();
    }

    @Override // java.lang.CharSequence
    @o0OOooO0(api = 24)
    @oo0oO0
    public IntStream codePoints() {
        return this.f2770o00oo0O.codePoints();
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2770o00oo0O.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2770o00oo0O.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2770o00oo0O.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.f2770o00oo0O.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2770o00oo0O.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2770o00oo0O.nextSpanTransition(i, i2, cls);
    }

    public final void o00oOOo0() {
        Spannable spannable = this.f2770o00oo0O;
        if (!this.f2771o00oo0O0 && new o00oOo00().o00oOOo0(spannable)) {
            this.f2770o00oo0O = new SpannableString(spannable);
        }
        this.f2771o00oo0O0 = true;
    }

    public Spannable o00oOOoO() {
        return this.f2770o00oo0O;
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        o00oOOo0();
        this.f2770o00oo0O.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        o00oOOo0();
        this.f2770o00oo0O.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    @oo0oO0
    public CharSequence subSequence(int i, int i2) {
        return this.f2770o00oo0O.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    @oo0oO0
    public String toString() {
        return this.f2770o00oo0O.toString();
    }
}
