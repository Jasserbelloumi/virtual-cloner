package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
import o0ooOoOO.ooOOOOoo;
@o0OOooO0(19)
/* loaded from: classes.dex */
public abstract class o0O0o extends ReplacementSpan {
    @oo0oO0

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0O0 f2772o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final Paint.FontMetricsInt f2773o00oo0O0 = new Paint.FontMetricsInt();

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public short f2774o00oo0Oo = -1;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public short f2776o00oo0o0 = -1;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float f2775o00oo0o = 1.0f;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public o0O0o(@oo0oO0 o00oo0O0 o00oo0o02) {
        ooOOOOoo.o00oo00O(o00oo0o02, "metadata cannot be null");
        this.f2772o00oo0O = o00oo0o02;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(@oo0oO0 Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i, int i2, @o0OO00OO Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2773o00oo0O0);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2773o00oo0O0;
        this.f2775o00oo0o = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f2772o00oo0O.o00oOo0o();
        this.f2776o00oo0o0 = (short) (this.f2772o00oo0O.o00oOo0o() * this.f2775o00oo0o);
        short o00oOoo02 = (short) (this.f2772o00oo0O.o00oOoo0() * this.f2775o00oo0o);
        this.f2774o00oo0Oo = o00oOoo02;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2773o00oo0O0;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return o00oOoo02;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public final int o00oOOo0() {
        return this.f2776o00oo0o0;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.TESTS})
    public final int o00oOOoO() {
        return o00oOo00().o00oOoO0();
    }

    @oo0oO0
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
    public final o00oo0O0 o00oOo00() {
        return this.f2772o00oo0O;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public final int o00oOo0O() {
        return this.f2774o00oo0Oo;
    }

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY})
    public final float o00oOooO() {
        return this.f2775o00oo0o;
    }
}
