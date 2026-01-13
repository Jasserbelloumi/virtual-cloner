package o0OO00OO;

import android.animation.ValueAnimator;
/* loaded from: classes2.dex */
public class o00oo0OO extends o00oOo0O {

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f12995o00ooOO = 1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f12996o00ooOO0 = 0;

    /* renamed from: o00ooO  reason: collision with root package name */
    public boolean f12997o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public float f12998o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public float f12999o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public final int f13000o00ooO0o;

    public o00oo0OO() {
        this(0);
    }

    public o00oo0OO(int i) {
        this.f13000o00ooO0o = i;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("You cannot pass in directions other than horizontal or vertical");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oo0oO(float f, ValueAnimator valueAnimator) {
        o00oo0O0(((Float) valueAnimator.getAnimatedValue()).floatValue(), f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0O0o(float f, ValueAnimator valueAnimator) {
        o00oo0O0(f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void o00oo(float f, float f2, float f3) {
        o00ooO00(f, f2, f3, o00oo0o(f, f2));
    }

    public long o00oo0o(float f, float f2) {
        long abs = Math.abs(f2 - f) / 2.0f;
        if (abs > 800) {
            return 800L;
        }
        return abs;
    }

    public void o00ooO0(float f, float f2, float f3) {
        o00ooO0O(f, f2, f3, o00oo0o(f2, f3));
    }

    public void o00ooO00(float f, float f2, final float f3, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OO00OO.o00oo00O
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o00oo0OO.this.o00oo0oO(f3, valueAnimator);
            }
        });
        ofFloat.start();
    }

    public void o00ooO0O(final float f, float f2, float f3, long j) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o0OO00OO.o00oo0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                o00oo0OO.this.o0O0o(f, valueAnimator);
            }
        });
        ofFloat.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (r0 != 3) goto L9;
     */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OO00OO.o00oo0OO.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
