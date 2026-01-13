package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import o00oOooO.o0O0o00O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(19)
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class o0O000 extends o0O0o {
    @o0OO00OO

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static Paint f2757o00oo0oO;

    public o0O000(@oo0oO0 o00oo0O0 o00oo0o02) {
        super(o00oo0o02);
    }

    @oo0oO0
    public static Paint o00oOo0o() {
        if (f2757o00oo0oO == null) {
            TextPaint textPaint = new TextPaint();
            f2757o00oo0oO = textPaint;
            textPaint.setColor(o00oo00O.o00oOOoO().o00oOo0O());
            f2757o00oo0oO.setStyle(Paint.Style.FILL);
        }
        return f2757o00oo0oO;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(@oo0oO0 Canvas canvas, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, @o0O0o00O(from = 0) int i, @o0O0o00O(from = 0) int i2, float f, int i3, int i4, int i5, @oo0oO0 Paint paint) {
        if (o00oo00O.o00oOOoO().o00oo0OO()) {
            canvas.drawRect(f, i3, f + this.f2774o00oo0Oo, i5, o00oOo0o());
        }
        this.f2772o00oo0O.o00oOOo0(canvas, f, i4, paint);
    }
}
