package o00oo0oO;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import o00oOooO.o0OO00OO;
import o00oo0oO.o0O00O0o;
/* loaded from: classes.dex */
public class o0O000o0 implements o0O00O0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final RectF f7561o00oOOo0 = new RectF();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o0O00O0o.o00oOOo0 {
        public o00oOOo0() {
        }

        @Override // o00oo0oO.o0O00O0o.o00oOOo0
        public void o00oOOo0(Canvas canvas, RectF rectF, float f, Paint paint) {
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                o0O000o0.this.f7561o00oOOo0.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas.translate(rectF.left + f3, rectF.top + f3);
                canvas.drawArc(o0O000o0.this.f7561o00oOOo0, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(o0O000o0.this.f7561o00oOOo0, 180.0f, 90.0f, true, paint);
                canvas.translate(height, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(o0O000o0.this.f7561o00oOOo0, 180.0f, 90.0f, true, paint);
                canvas.translate(width, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(o0O000o0.this.f7561o00oOOo0, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(save);
                float f5 = rectF.top;
                canvas.drawRect((rectF.left + f3) - 1.0f, f5, (rectF.right - f3) + 1.0f, f5 + f3, paint);
                float f6 = rectF.bottom;
                canvas.drawRect((rectF.left + f3) - 1.0f, f6 - f3, (rectF.right - f3) + 1.0f, f6, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
        }
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOOo0(o0O00 o0o00) {
        o00oo0O(o0o00).o00oo00O(o0o00.o00oOo0O());
        o00oOooo(o0o00);
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOOoO(o0O00 o0o00) {
        return o00oo0O(o0o00).o00oOoOo();
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOo00(o0O00 o0o00) {
        return o00oo0O(o0o00).o00oOoo0();
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOo0O(o0O00 o0o00) {
        return o00oo0O(o0o00).o00oOoOO();
    }

    @Override // o00oo0oO.o0O00O0
    public ColorStateList o00oOo0o(o0O00 o0o00) {
        return o00oo0O(o0o00).o00oOo0o();
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOoO(o0O00 o0o00) {
        return o00oo0O(o0o00).o00oOoO0();
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOoO0(o0O00 o0o00, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        o0O00O0o o00oo0O02 = o00oo0O0(context, colorStateList, f, f2, f3);
        o00oo0O02.o00oo00O(o0o00.o00oOo0O());
        o0o00.o00oOOo0(o00oo0O02);
        o00oOooo(o0o00);
    }

    @Override // o00oo0oO.o0O00O0
    public float o00oOoOO(o0O00 o0o00) {
        return o00oo0O(o0o00).o00oOooo();
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOoOo(o0O00 o0o00, float f) {
        o00oo0O(o0o00).o00oo0O(f);
        o00oOooo(o0o00);
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOoo0(o0O00 o0o00, float f) {
        o00oo0O(o0o00).o00oo0O0(f);
        o00oOooo(o0o00);
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOooO(o0O00 o0o00, float f) {
        o00oo0O(o0o00).o00oo0Oo(f);
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oOooo(o0O00 o0o00) {
        Rect rect = new Rect();
        o00oo0O(o0o00).o00oOoO(rect);
        o0o00.o00oOooO((int) Math.ceil(o00oOo00(o0o00)), (int) Math.ceil(o00oOOoO(o0o00)));
        o0o00.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oo0() {
        o0O00O0o.f7565o00oo0o0 = new o00oOOo0();
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oo00O(o0O00 o0o00, @o0OO00OO ColorStateList colorStateList) {
        o00oo0O(o0o00).o00oo0OO(colorStateList);
    }

    public final o0O00O0o o00oo0O(o0O00 o0o00) {
        return (o0O00O0o) o0o00.o00oOo00();
    }

    public final o0O00O0o o00oo0O0(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new o0O00O0o(context.getResources(), colorStateList, f, f2, f3);
    }

    @Override // o00oo0oO.o0O00O0
    public void o00oo0OO(o0O00 o0o00) {
    }
}
