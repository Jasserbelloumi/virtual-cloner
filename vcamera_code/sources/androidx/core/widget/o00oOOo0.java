package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public abstract class o00oOOo0 implements View.OnTouchListener {

    /* renamed from: o0  reason: collision with root package name */
    public static final int f2453o0 = ViewConfiguration.getTapTimeout();

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final float f2454o00ooOo = 0.0f;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final float f2455o00ooOoO = Float.MAX_VALUE;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static final float f2456o00ooOoo = 0.0f;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static final int f2457o00ooo0 = 1;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static final int f2458o00ooo00 = 0;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static final int f2459o00ooo0O = 2;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static final int f2460o00ooo0o = 0;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static final int f2461o00oooO = 1;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static final int f2462o00oooOO = 1;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static final int f2463o00oooOo = 315;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final float f2464o00oooo = Float.MAX_VALUE;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f2465o00oooo0 = 1575;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final float f2466o00ooooO = 0.2f;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final float f2467o00ooooo = 1.0f;

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final int f2468o0O00000 = 500;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final int f2469o0O0000O = 500;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f2470o00oo;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final View f2473o00oo0Oo;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public Runnable f2475o00oo0o0;

    /* renamed from: o00ooO  reason: collision with root package name */
    public boolean f2477o00ooO;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public boolean f2481o00ooO0o;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public boolean f2482o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public boolean f2483o00ooOO0;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public boolean f2484o00ooOOo;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public boolean f2485o00ooOo0;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f2486o0O0o;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final C0015o00oOOo0 f2472o00oo0O0 = new C0015o00oOOo0();

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Interpolator f2471o00oo0O = new AccelerateInterpolator();

    /* renamed from: o00oo0o  reason: collision with root package name */
    public float[] f2474o00oo0o = {0.0f, 0.0f};

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public float[] f2476o00oo0oO = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: o00ooO00  reason: collision with root package name */
    public float[] f2479o00ooO00 = {0.0f, 0.0f};

    /* renamed from: o00ooO0  reason: collision with root package name */
    public float[] f2478o00ooO0 = {0.0f, 0.0f};

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public float[] f2480o00ooO0O = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: androidx.core.widget.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0015o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public int f2487o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f2488o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public float f2489o00oOo00;

        /* renamed from: o00oOoOo  reason: collision with root package name */
        public float f2495o00oOoOo;

        /* renamed from: o00oOoo0  reason: collision with root package name */
        public int f2496o00oOoo0;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public float f2497o00oOooO;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public long f2490o00oOo0O = Long.MIN_VALUE;

        /* renamed from: o00oOoOO  reason: collision with root package name */
        public long f2494o00oOoOO = -1;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public long f2491o00oOo0o = 0;

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public int f2493o00oOoO0 = 0;

        /* renamed from: o00oOoO  reason: collision with root package name */
        public int f2492o00oOoO = 0;

        public void o00oOOo0() {
            if (this.f2491o00oOo0o == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float o00oOoO02 = o00oOoO0(o00oOo0O(currentAnimationTimeMillis));
            this.f2491o00oOo0o = currentAnimationTimeMillis;
            float f = ((float) (currentAnimationTimeMillis - this.f2491o00oOo0o)) * o00oOoO02;
            this.f2493o00oOoO0 = (int) (this.f2489o00oOo00 * f);
            this.f2492o00oOoO = (int) (f * this.f2497o00oOooO);
        }

        public int o00oOOoO() {
            return this.f2493o00oOoO0;
        }

        public int o00oOo00() {
            return this.f2492o00oOoO;
        }

        public final float o00oOo0O(long j) {
            long j2 = this.f2490o00oOo0O;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.f2494o00oOoOO;
            if (j3 < 0 || j < j3) {
                return o00oOOo0.o00oOo0O(((float) (j - j2)) / this.f2487o00oOOo0, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.f2495o00oOoOo;
            return (o00oOOo0.o00oOo0O(((float) (j - j3)) / this.f2496o00oOoo0, 0.0f, 1.0f) * f) + (1.0f - f);
        }

        public int o00oOo0o() {
            float f = this.f2497o00oOooO;
            return (int) (f / Math.abs(f));
        }

        public boolean o00oOoO() {
            return this.f2494o00oOoOO > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2494o00oOoOO + ((long) this.f2496o00oOoo0);
        }

        public final float o00oOoO0(float f) {
            return (f * 4.0f) + ((-4.0f) * f * f);
        }

        public void o00oOoOO() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2496o00oOoo0 = o00oOOo0.o00oOo0o((int) (currentAnimationTimeMillis - this.f2490o00oOo0O), 0, this.f2488o00oOOoO);
            this.f2495o00oOoOo = o00oOo0O(currentAnimationTimeMillis);
            this.f2494o00oOoOO = currentAnimationTimeMillis;
        }

        public void o00oOoOo(int i) {
            this.f2488o00oOOoO = i;
        }

        public void o00oOoo0(int i) {
            this.f2487o00oOOo0 = i;
        }

        public int o00oOooO() {
            float f = this.f2489o00oOo00;
            return (int) (f / Math.abs(f));
        }

        public void o00oOooo(float f, float f2) {
            this.f2489o00oOo00 = f;
            this.f2497o00oOooO = f2;
        }

        public void o00oo00O() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2490o00oOo0O = currentAnimationTimeMillis;
            this.f2494o00oOoOO = -1L;
            this.f2491o00oOo0o = currentAnimationTimeMillis;
            this.f2495o00oOoOo = 0.5f;
            this.f2493o00oOoO0 = 0;
            this.f2492o00oOoO = 0;
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oOOo0 o00oooo02 = o00oOOo0.this;
            if (o00oooo02.f2482o00ooOO) {
                if (o00oooo02.f2477o00ooO) {
                    o00oooo02.f2477o00ooO = false;
                    o00oooo02.f2472o00oo0O0.o00oo00O();
                }
                C0015o00oOOo0 c0015o00oOOo0 = o00oOOo0.this.f2472o00oo0O0;
                if (c0015o00oOOo0.o00oOoO() || !o00oOOo0.this.o00ooO00()) {
                    o00oOOo0.this.f2482o00ooOO = false;
                    return;
                }
                o00oOOo0 o00oooo03 = o00oOOo0.this;
                if (o00oooo03.f2483o00ooOO0) {
                    o00oooo03.f2483o00ooOO0 = false;
                    o00oooo03.o00oOo00();
                }
                c0015o00oOOo0.o00oOOo0();
                o00oOOo0.this.o00oOooo(c0015o00oOOo0.o00oOOoO(), c0015o00oOOo0.o00oOo00());
                o0O0o00O.o0O0oo0O(o00oOOo0.this.f2473o00oo0Oo, this);
            }
        }
    }

    public o00oOOo0(@oo0oO0 View view) {
        this.f2473o00oo0Oo = view;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = (int) ((1575.0f * f) + 0.5f);
        o00oo0Oo(f2, f2);
        float f3 = (int) ((f * 315.0f) + 0.5f);
        o00oo0o0(f3, f3);
        o00oo0(1);
        o00oo0O(Float.MAX_VALUE, Float.MAX_VALUE);
        o0O0o(0.2f, 0.2f);
        o00oo(1.0f, 1.0f);
        o00oo00O(f2453o0);
        o00oo0oO(500);
        o00oo0o(500);
    }

    public static float o00oOo0O(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    public static int o00oOo0o(int i, int i2, int i3) {
        return i > i3 ? i3 : i < i2 ? i2 : i;
    }

    public abstract boolean o00oOOo0(int i);

    public abstract boolean o00oOOoO(int i);

    public void o00oOo00() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2473o00oo0Oo.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float o00oOoO(float f, float f2, float f3, float f4) {
        float interpolation;
        float o00oOo0O2 = o00oOo0O(f * f2, 0.0f, f3);
        float o00oOoO02 = o00oOoO0(f2 - f4, o00oOo0O2) - o00oOoO0(f4, o00oOo0O2);
        if (o00oOoO02 < 0.0f) {
            interpolation = -this.f2471o00oo0O.getInterpolation(-o00oOoO02);
        } else if (o00oOoO02 <= 0.0f) {
            return 0.0f;
        } else {
            interpolation = this.f2471o00oo0O.getInterpolation(o00oOoO02);
        }
        return o00oOo0O(interpolation, -1.0f, 1.0f);
    }

    public final float o00oOoO0(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f2486o0O0o;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f2482o00ooOO && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    public boolean o00oOoOO() {
        return this.f2484o00ooOOo;
    }

    public boolean o00oOoOo() {
        return this.f2485o00ooOo0;
    }

    public final void o00oOoo0() {
        if (this.f2477o00ooO) {
            this.f2482o00ooOO = false;
        } else {
            this.f2472o00oo0O0.o00oOoOO();
        }
    }

    public final float o00oOooO(int i, float f, float f2, float f3) {
        float o00oOoO2 = o00oOoO(this.f2474o00oo0o[i], f2, this.f2476o00oo0oO[i], f);
        int i2 = (o00oOoO2 > 0.0f ? 1 : (o00oOoO2 == 0.0f ? 0 : -1));
        if (i2 == 0) {
            return 0.0f;
        }
        float f4 = this.f2479o00ooO00[i];
        float f5 = this.f2478o00ooO0[i];
        float f6 = this.f2480o00ooO0O[i];
        float f7 = f4 * f3;
        return i2 > 0 ? o00oOo0O(o00oOoO2 * f7, f5, f6) : -o00oOo0O((-o00oOoO2) * f7, f5, f6);
    }

    public abstract void o00oOooo(int i, int i2);

    @oo0oO0
    public o00oOOo0 o00oo(float f, float f2) {
        float[] fArr = this.f2479o00ooO00;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @oo0oO0
    public o00oOOo0 o00oo0(int i) {
        this.f2486o0O0o = i;
        return this;
    }

    @oo0oO0
    public o00oOOo0 o00oo00O(int i) {
        this.f2470o00oo = i;
        return this;
    }

    @oo0oO0
    public o00oOOo0 o00oo0O(float f, float f2) {
        float[] fArr = this.f2476o00oo0oO;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    public o00oOOo0 o00oo0O0(boolean z) {
        this.f2485o00ooOo0 = z;
        return this;
    }

    public o00oOOo0 o00oo0OO(boolean z) {
        if (this.f2484o00ooOOo && !z) {
            o00oOoo0();
        }
        this.f2484o00ooOOo = z;
        return this;
    }

    @oo0oO0
    public o00oOOo0 o00oo0Oo(float f, float f2) {
        float[] fArr = this.f2480o00ooO0O;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @oo0oO0
    public o00oOOo0 o00oo0o(int i) {
        this.f2472o00oo0O0.o00oOoOo(i);
        return this;
    }

    @oo0oO0
    public o00oOOo0 o00oo0o0(float f, float f2) {
        float[] fArr = this.f2478o00ooO0;
        fArr[0] = f / 1000.0f;
        fArr[1] = f2 / 1000.0f;
        return this;
    }

    @oo0oO0
    public o00oOOo0 o00oo0oO(int i) {
        this.f2472o00oo0O0.o00oOoo0(i);
        return this;
    }

    public final void o00ooO0() {
        int i;
        if (this.f2475o00oo0o0 == null) {
            this.f2475o00oo0o0 = new o00oOOoO();
        }
        this.f2482o00ooOO = true;
        this.f2477o00ooO = true;
        if (this.f2481o00ooO0o || (i = this.f2470o00oo) <= 0) {
            this.f2475o00oo0o0.run();
        } else {
            o0O0o00O.oooOO0(this.f2473o00oo0Oo, this.f2475o00oo0o0, i);
        }
        this.f2481o00ooO0o = true;
    }

    public boolean o00ooO00() {
        C0015o00oOOo0 c0015o00oOOo0 = this.f2472o00oo0O0;
        int o00oOo0o2 = c0015o00oOOo0.o00oOo0o();
        int o00oOooO2 = c0015o00oOOo0.o00oOooO();
        return (o00oOo0o2 != 0 && o00oOOoO(o00oOo0o2)) || (o00oOooO2 != 0 && o00oOOo0(o00oOooO2));
    }

    @oo0oO0
    public o00oOOo0 o0O0o(float f, float f2) {
        float[] fArr = this.f2474o00oo0o;
        fArr[0] = f;
        fArr[1] = f2;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2484o00ooOOo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.o00oOoo0()
            goto L58
        L1a:
            r5.f2483o00ooOO0 = r2
            r5.f2481o00ooO0o = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2473o00oo0Oo
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.o00oOooO(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2473o00oo0Oo
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.o00oOooO(r2, r7, r6, r3)
            androidx.core.widget.o00oOOo0$o00oOOo0 r7 = r5.f2472o00oo0O0
            r7.o00oOooo(r0, r6)
            boolean r6 = r5.f2482o00ooOO
            if (r6 != 0) goto L58
            boolean r6 = r5.o00ooO00()
            if (r6 == 0) goto L58
            r5.o00ooO0()
        L58:
            boolean r6 = r5.f2485o00ooOo0
            if (r6 == 0) goto L61
            boolean r6 = r5.f2482o00ooOO
            if (r6 == 0) goto L61
            r1 = r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.o00oOOo0.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
