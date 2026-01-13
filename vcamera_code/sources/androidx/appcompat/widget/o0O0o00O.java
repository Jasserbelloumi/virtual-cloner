package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o0O0o00O implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: o00oo  reason: collision with root package name */
    public int f1237o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final int f1238o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final float f1239o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f1240o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public Runnable f1241o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final View f1242o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public Runnable f1243o00oo0oO;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final int[] f1244o00ooO00 = new int[2];

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f1245o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = o0O0o00O.this.f1242o00oo0o0.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements Runnable {
        public o00oOOoO() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o0O0o00O.this.o00oOo0O();
        }
    }

    public o0O0o00O(View view) {
        this.f1242o00oo0o0 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1239o00oo0O0 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1238o00oo0O = tapTimeout;
        this.f1240o00oo0Oo = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public static boolean o00oOoO(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    public final void o00oOOo0() {
        Runnable runnable = this.f1243o00oo0oO;
        if (runnable != null) {
            this.f1242o00oo0o0.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1241o00oo0o;
        if (runnable2 != null) {
            this.f1242o00oo0o0.removeCallbacks(runnable2);
        }
    }

    public abstract o00oOoo0.o00ooO0 o00oOOoO();

    public boolean o00oOo00() {
        o00oOoo0.o00ooO0 o00oOOoO2 = o00oOOoO();
        if (o00oOOoO2 == null || o00oOOoO2.o00oOOo0()) {
            return true;
        }
        o00oOOoO2.show();
        return true;
    }

    public void o00oOo0O() {
        o00oOOo0();
        View view = this.f1242o00oo0o0;
        if (view.isEnabled() && !view.isLongClickable() && o00oOo00()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1245o0O0o = true;
        }
    }

    public final boolean o00oOo0o(MotionEvent motionEvent) {
        oo0OOoo oo0oooo;
        View view = this.f1242o00oo0o0;
        o00oOoo0.o00ooO0 o00oOOoO2 = o00oOOoO();
        if (o00oOOoO2 == null || !o00oOOoO2.o00oOOo0() || (oo0oooo = (oo0OOoo) o00oOOoO2.o00oo0OO()) == null || !oo0oooo.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        o00oOoOO(view, obtainNoHistory);
        o00oOoOo(oo0oooo, obtainNoHistory);
        boolean o00oOo0o2 = oo0oooo.o00oOo0o(obtainNoHistory, this.f1237o00oo);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        return o00oOo0o2 && (actionMasked != 1 && actionMasked != 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        if (r1 != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean o00oOoO0(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1242o00oo0o0
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L41
            r3 = 1
            if (r1 == r3) goto L3d
            r4 = 2
            if (r1 == r4) goto L1a
            r6 = 3
            if (r1 == r6) goto L3d
            goto L6d
        L1a:
            int r1 = r5.f1237o00oo
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L6d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1239o00oo0O0
            boolean r6 = o00oOoO(r0, r4, r6, r1)
            if (r6 != 0) goto L6d
            r5.o00oOOo0()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L3d:
            r5.o00oOOo0()
            goto L6d
        L41:
            int r6 = r6.getPointerId(r2)
            r5.f1237o00oo = r6
            java.lang.Runnable r6 = r5.f1241o00oo0o
            if (r6 != 0) goto L52
            androidx.appcompat.widget.o0O0o00O$o00oOOo0 r6 = new androidx.appcompat.widget.o0O0o00O$o00oOOo0
            r6.<init>()
            r5.f1241o00oo0o = r6
        L52:
            java.lang.Runnable r6 = r5.f1241o00oo0o
            int r1 = r5.f1238o00oo0O
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1243o00oo0oO
            if (r6 != 0) goto L65
            androidx.appcompat.widget.o0O0o00O$o00oOOoO r6 = new androidx.appcompat.widget.o0O0o00O$o00oOOoO
            r6.<init>()
            r5.f1243o00oo0oO = r6
        L65:
            java.lang.Runnable r6 = r5.f1243o00oo0oO
            int r1 = r5.f1240o00oo0Oo
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L6d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0O0o00O.o00oOoO0(android.view.MotionEvent):boolean");
    }

    public final boolean o00oOoOO(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1244o00ooO00;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    public final boolean o00oOoOo(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1244o00ooO00;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public boolean o00oOooO() {
        o00oOoo0.o00ooO0 o00oOOoO2 = o00oOOoO();
        if (o00oOOoO2 == null || !o00oOOoO2.o00oOOo0()) {
            return true;
        }
        o00oOOoO2.dismiss();
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1245o0O0o;
        if (z2) {
            z = o00oOo0o(motionEvent) || !o00oOooO();
        } else {
            z = o00oOoO0(motionEvent) && o00oOo00();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1242o00oo0o0.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1245o0O0o = z;
        return z || z2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1245o0O0o = false;
        this.f1237o00oo = -1;
        Runnable runnable = this.f1241o00oo0o;
        if (runnable != null) {
            this.f1242o00oo0o0.removeCallbacks(runnable);
        }
    }
}
