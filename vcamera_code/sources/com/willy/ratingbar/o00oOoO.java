package com.willy.ratingbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class o00oOoO extends com.willy.ratingbar.o00oOOo0 {

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final long f6660o00ooo0O = 15;

    /* loaded from: classes2.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o00oOo00 f6662o00oo0O0;

        public o00oOOo0(o00oOo00 o00ooo002) {
            this.f6662o00oo0O0 = o00ooo002;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6662o00oo0O0.o00oOOoO();
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final /* synthetic */ double f6663o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int f6664o00oo0O0;

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final /* synthetic */ o00oOo00 f6665o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final /* synthetic */ float f6667o00oo0o0;

        public o00oOOoO(int i, double d, o00oOo00 o00ooo002, float f) {
            this.f6664o00oo0O0 = i;
            this.f6663o00oo0O = d;
            this.f6665o00oo0Oo = o00ooo002;
            this.f6667o00oo0o0 = f;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f6664o00oo0O0 == this.f6663o00oo0O) {
                this.f6665o00oo0Oo.o00oOo0o(this.f6667o00oo0o0);
            } else {
                this.f6665o00oo0Oo.o00oOooO();
            }
            if (this.f6664o00oo0O0 == this.f6667o00oo0o0) {
                this.f6665o00oo0Oo.startAnimation(AnimationUtils.loadAnimation(o00oOoO.this.getContext(), R.anim.rotation));
            }
        }
    }

    public o00oOoO(Context context) {
        super(context);
    }

    public o00oOoO(Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public o00oOoO(Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.willy.ratingbar.BaseRatingBar
    public void o00oOo0O(float f) {
        if (this.f6649o00ooo00 != null) {
            this.f6647o00ooOoo.removeCallbacksAndMessages(this.f6648o00ooo0);
        }
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            int intValue = ((Integer) o00ooo002.getTag()).intValue();
            double ceil = Math.ceil(f);
            if (intValue > ceil) {
                o00ooo002.o00oOOoO();
            } else {
                Runnable o00oo0O02 = o00oo0O0(f, o00ooo002, intValue, ceil);
                this.f6649o00ooo00 = o00oo0O02;
                o00oo0OO(o00oo0O02, 15L);
            }
        }
    }

    @Override // com.willy.ratingbar.BaseRatingBar
    public void o00oOooO() {
        if (this.f6649o00ooo00 != null) {
            this.f6647o00ooOoo.removeCallbacksAndMessages(this.f6648o00ooo0);
        }
        long j = 0;
        for (o00oOo00 o00ooo002 : this.f6643o00ooOo) {
            j += 5;
            this.f6647o00ooOoo.postDelayed(new o00oOOo0(o00ooo002), j);
        }
    }

    @oo0oO0
    public final Runnable o00oo0O0(float f, o00oOo00 o00ooo002, int i, double d) {
        return new o00oOOoO(i, d, o00ooo002, f);
    }
}
