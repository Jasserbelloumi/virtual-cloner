package o0O0Oo;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface o0O0OOO0 extends Animatable {

    /* loaded from: classes.dex */
    public static abstract class o00oOOo0 {
        public Animatable2.AnimationCallback mPlatformCallback;

        /* renamed from: o0O0Oo.o0O0OOO0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0152o00oOOo0 extends Animatable2.AnimationCallback {
            public C0152o00oOOo0() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                o00oOOo0.this.onAnimationEnd(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                o00oOOo0.this.onAnimationStart(drawable);
            }
        }

        @o0OOooO0(23)
        public Animatable2.AnimationCallback getPlatformCallback() {
            if (this.mPlatformCallback == null) {
                this.mPlatformCallback = new C0152o00oOOo0();
            }
            return this.mPlatformCallback;
        }

        public void onAnimationEnd(Drawable drawable) {
        }

        public void onAnimationStart(Drawable drawable) {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@oo0oO0 o00oOOo0 o00oooo02);

    boolean unregisterAnimationCallback(@oo0oO0 o00oOOo0 o00oooo02);
}
