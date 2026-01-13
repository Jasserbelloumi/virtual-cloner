package o0OO00oo;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import o0OO00Oo.o00oo0O;
/* loaded from: classes2.dex */
public class o00oo extends FrameLayout {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f13089o00ooO = 13;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f13090o00ooOO0 = 150;

    /* renamed from: o00oo  reason: collision with root package name */
    public int f13091o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public float f13092o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public float f13093o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public float f13094o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o00ooO f13095o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public float f13096o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public long f13097o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f13098o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public int f13099o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f13100o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public float f13101o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public o00oOOoO f13102o0O0o;

    /* loaded from: classes2.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ boolean f13104o00oo0O0;

        public o00oOOo0(boolean z) {
            this.f13104o00oo0O0 = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oo.this.o00oo0();
            o00oo o00ooVar = o00oo.this;
            o00ooVar.o00oOooo(o00ooVar.f13100o00ooO0O, this.f13104o00oo0O0);
        }
    }

    /* loaded from: classes2.dex */
    public class o00oOOoO implements Runnable {

        /* renamed from: o00oo0O  reason: collision with root package name */
        public float f13105o00oo0O;

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public Handler f13106o00oo0O0 = new Handler(Looper.getMainLooper());

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public float f13107o00oo0Oo;

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public long f13109o00oo0o0;

        public o00oOOoO() {
        }

        public void o00oOOoO(float f, float f2) {
            this.f13105o00oo0O = f;
            this.f13107o00oo0Oo = f2;
            this.f13109o00oo0o0 = System.currentTimeMillis();
            this.f13106o00oo0O0.post(this);
        }

        public final void o00oOo00() {
            this.f13106o00oo0O0.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (o00oo.this.getRootView() == null || o00oo.this.getRootView().getParent() == null) {
                return;
            }
            float min = Math.min(1.0f, ((float) (System.currentTimeMillis() - this.f13109o00oo0o0)) / 400.0f);
            o00oo.this.o00oOoOo((this.f13105o00oo0O - o00oo.this.getX()) * min, (this.f13107o00oo0Oo - o00oo.this.getY()) * min);
            if (min < 1.0f) {
                this.f13106o00oo0O0.post(this);
            }
        }
    }

    public o00oo(Context context) {
        this(context, null);
    }

    public o00oo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public o00oo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13100o00ooO0O = true;
        o00oOo0o();
    }

    public final void o00oOo00(MotionEvent motionEvent) {
        this.f13094o00oo0Oo = getX();
        this.f13096o00oo0o0 = getY();
        this.f13093o00oo0O0 = motionEvent.getRawX();
        this.f13092o00oo0O = motionEvent.getRawY();
        this.f13097o00oo0oO = System.currentTimeMillis();
    }

    public void o00oOo0O() {
        o00ooO o00ooo = this.f13095o00oo0o;
        if (o00ooo != null) {
            o00ooo.o00oOOo0(this);
        }
    }

    public final void o00oOo0o() {
        this.f13102o0O0o = new o00oOOoO();
        this.f13098o00ooO0 = o00oo0O.o00oOo00(getContext());
        setClickable(true);
    }

    public boolean o00oOoO() {
        return System.currentTimeMillis() - this.f13097o00oo0oO < 150;
    }

    public boolean o00oOoO0() {
        boolean z = getX() < ((float) (this.f13091o00oo / 2));
        this.f13100o00ooO0O = z;
        return z;
    }

    public final void o00oOoOO(boolean z) {
        if (z) {
            this.f13101o00ooO0o = getY();
        }
    }

    public final void o00oOoOo(float f, float f2) {
        setX(getX() + f);
        setY(getY() + f2);
    }

    public void o00oOoo0() {
        o00oOooo(o00oOoO0(), false);
    }

    public final void o00oOooO() {
        this.f13101o00ooO0o = 0.0f;
    }

    public void o00oOooo(boolean z, boolean z2) {
        float f = z ? 13.0f : this.f13091o00oo - 13;
        float y = getY();
        if (!z2) {
            float f2 = this.f13101o00ooO0o;
            if (f2 != 0.0f) {
                o00oOooO();
                y = f2;
            }
        }
        this.f13102o0O0o.o00oOOoO(f, Math.min(Math.max(0.0f, y), this.f13099o00ooO00 - getHeight()));
    }

    public void o00oo0() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            this.f13091o00oo = viewGroup.getWidth() - getWidth();
            this.f13099o00ooO00 = viewGroup.getHeight();
        }
    }

    public void o00oo00O() {
        o00ooO o00ooo = this.f13095o00oo0o;
        if (o00ooo != null) {
            o00ooo.o00oOOoO(this);
        }
    }

    public final void o00oo0OO(MotionEvent motionEvent) {
        setX((motionEvent.getRawX() + this.f13094o00oo0Oo) - this.f13093o00oo0O0);
        float rawY = (motionEvent.getRawY() + this.f13096o00oo0o0) - this.f13092o00oo0O;
        int i = this.f13098o00ooO0;
        if (rawY < i) {
            rawY = i;
        }
        if (rawY > this.f13099o00ooO00 - getHeight()) {
            rawY = this.f13099o00ooO00 - getHeight();
        }
        setY(rawY);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getParent() != null) {
            boolean z = configuration.orientation == 2;
            o00oOoOO(z);
            ((ViewGroup) getParent()).post(new o00oOOo0(z));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            o00oOo00(motionEvent);
            o00oo0();
            this.f13102o0O0o.o00oOo00();
        } else if (action == 1) {
            o00oOooO();
            o00oOoo0();
            if (o00oOoO()) {
                o00oOo0O();
            }
        } else if (action == 2) {
            o00oo0OO(motionEvent);
        }
        return true;
    }

    public void setMagnetViewListener(o00ooO o00ooo) {
        this.f13095o00oo0o = o00ooo;
    }
}
