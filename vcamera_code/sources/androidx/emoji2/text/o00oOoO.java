package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.o00oo00O;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o00oooOo.oOO0O000;
@o00oOooO.o0O000O
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
/* loaded from: classes.dex */
public class o00oOoO implements o00oo00O.o00oOoO {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f2657o00oOOoO = 10;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final ThreadLocal<StringBuilder> f2658o00oOo00 = new ThreadLocal<>();

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final TextPaint f2659o00oOOo0;

    public o00oOoO() {
        TextPaint textPaint = new TextPaint();
        this.f2659o00oOOo0 = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder o00oOOoO() {
        ThreadLocal<StringBuilder> threadLocal = f2658o00oOo00;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return threadLocal.get();
    }

    @Override // androidx.emoji2.text.o00oo00O.o00oOoO
    public boolean o00oOOo0(@oo0oO0 CharSequence charSequence, int i, int i2, int i3) {
        StringBuilder o00oOOoO2 = o00oOOoO();
        o00oOOoO2.setLength(0);
        while (i < i2) {
            o00oOOoO2.append(charSequence.charAt(i));
            i++;
        }
        return oOO0O000.o00oOOo0(this.f2659o00oOOo0, o00oOOoO2.toString());
    }
}
