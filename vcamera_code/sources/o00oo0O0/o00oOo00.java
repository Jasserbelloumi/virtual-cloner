package o00oo0O0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
@Deprecated
/* loaded from: classes.dex */
public class o00oOo00 extends Dialog {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final long f7405o00oo0O = 250;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final long f7406o00oo0Oo = 150;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final View f7407o00oo0O0;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends AnimatorListenerAdapter {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ boolean f7408o00oOOo0;

        public o00oOOo0(boolean z) {
            this.f7408o00oOOo0 = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f7408o00oOOo0) {
                return;
            }
            o00oOo00.super.dismiss();
        }
    }

    public o00oOo00(Context context, View view) {
        super(context);
        this.f7407o00oo0O0 = view;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        o00oOOoO(false);
    }

    public final void o00oOOoO(boolean z) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        long j = z ? 250L : 150L;
        this.f7407o00oo0O0.setScaleX(f);
        this.f7407o00oo0O0.setScaleY(f);
        this.f7407o00oo0O0.animate().scaleX(f2).scaleY(f2).setDuration(j).setInterpolator(new o0O00o00.o00oOo00()).setListener(new o00oOOo0(z)).start();
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        o00oOOoO(true);
        super.show();
    }
}
