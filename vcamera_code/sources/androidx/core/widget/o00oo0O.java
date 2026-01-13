package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0O {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final EdgeEffect f2509o00oOOo0;

    @o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        private o00oOOo0() {
        }

        @o0O0O0Oo
        public static void o00oOOo0(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    @o0OOooO0(31)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        private o00oOOoO() {
        }

        @o0O0O0Oo
        public static EdgeEffect o00oOOo0(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @o0O0O0Oo
        public static float o00oOOoO(EdgeEffect edgeEffect) {
            float distance;
            try {
                distance = edgeEffect.getDistance();
                return distance;
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @o0O0O0Oo
        public static float o00oOo00(EdgeEffect edgeEffect, float f, float f2) {
            float onPullDistance;
            try {
                onPullDistance = edgeEffect.onPullDistance(f, f2);
                return onPullDistance;
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public o00oo0O(Context context) {
        this.f2509o00oOOo0 = new EdgeEffect(context);
    }

    @oo0oO0
    public static EdgeEffect o00oOOo0(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? o00oOOoO.o00oOOo0(context, attributeSet) : new EdgeEffect(context);
    }

    public static void o00oOoO0(@oo0oO0 EdgeEffect edgeEffect, float f, float f2) {
        o00oOOo0.o00oOOo0(edgeEffect, f, f2);
    }

    public static float o00oOoOo(@oo0oO0 EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return o00oOOoO.o00oOo00(edgeEffect, f, f2);
        }
        o00oOOo0.o00oOOo0(edgeEffect, f, f2);
        return f;
    }

    public static float o00oOooO(@oo0oO0 EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return o00oOOoO.o00oOOoO(edgeEffect);
        }
        return 0.0f;
    }

    @Deprecated
    public boolean o00oOOoO(Canvas canvas) {
        return this.f2509o00oOOo0.draw(canvas);
    }

    @Deprecated
    public void o00oOo00() {
        this.f2509o00oOOo0.finish();
    }

    @Deprecated
    public boolean o00oOo0O() {
        return this.f2509o00oOOo0.isFinished();
    }

    @Deprecated
    public boolean o00oOo0o(int i) {
        this.f2509o00oOOo0.onAbsorb(i);
        return true;
    }

    @Deprecated
    public boolean o00oOoO(float f) {
        this.f2509o00oOOo0.onPull(f);
        return true;
    }

    @Deprecated
    public boolean o00oOoOO(float f, float f2) {
        o00oOOo0.o00oOOo0(this.f2509o00oOOo0, f, f2);
        return true;
    }

    @Deprecated
    public boolean o00oOoo0() {
        this.f2509o00oOOo0.onRelease();
        return this.f2509o00oOOo0.isFinished();
    }

    @Deprecated
    public void o00oOooo(int i, int i2) {
        this.f2509o00oOOo0.setSize(i, i2);
    }
}
