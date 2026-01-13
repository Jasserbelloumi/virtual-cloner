package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import o00oOooO.o0OO0oO;
import o0O000oo.o0O0o00O;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class oO0Oo implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final long f1524o00ooO = 15000;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f1525o00ooO0O = "TooltipCompatHandler";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final long f1526o00ooO0o = 2500;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static oO0Oo f1527o00ooOO = null;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final long f1528o00ooOO0 = 3000;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static oO0Oo f1529o00ooOOo;

    /* renamed from: o00oo  reason: collision with root package name */
    public o0oo0000 f1530o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final CharSequence f1531o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final View f1532o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f1533o00oo0Oo;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f1536o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public boolean f1537o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public boolean f1538o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f1539o0O0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final Runnable f1535o00oo0o0 = new Runnable() { // from class: androidx.appcompat.widget.o0OOo000
        @Override // java.lang.Runnable
        public final void run() {
            oO0Oo.this.o00oOoOO(false);
        }
    };

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final Runnable f1534o00oo0o = new Runnable() { // from class: androidx.appcompat.widget.o0o0000
        @Override // java.lang.Runnable
        public final void run() {
            oO0Oo.this.o00oOooO();
        }
    };

    public oO0Oo(View view, CharSequence charSequence) {
        this.f1532o00oo0O0 = view;
        this.f1531o00oo0O = charSequence;
        this.f1533o00oo0Oo = o0O000oo.o0OoOoO.o00oOo00(ViewConfiguration.get(view.getContext()));
        o00oOo00();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private /* synthetic */ void o00oOo0O() {
        o00oOoOO(false);
    }

    public static void o00oOoO(View view, CharSequence charSequence) {
        oO0Oo oo0oo = f1527o00ooOO;
        if (oo0oo != null && oo0oo.f1532o00oo0O0 == view) {
            o00oOoO0(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new oO0Oo(view, charSequence);
            return;
        }
        oO0Oo oo0oo2 = f1529o00ooOOo;
        if (oo0oo2 != null && oo0oo2.f1532o00oo0O0 == view) {
            oo0oo2.o00oOooO();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static void o00oOoO0(oO0Oo oo0oo) {
        oO0Oo oo0oo2 = f1527o00ooOO;
        if (oo0oo2 != null) {
            oo0oo2.o00oOOoO();
        }
        f1527o00ooOO = oo0oo;
        if (oo0oo != null) {
            oo0oo.o00oOo0o();
        }
    }

    public final void o00oOOoO() {
        this.f1532o00oo0O0.removeCallbacks(this.f1535o00oo0o0);
    }

    public final void o00oOo00() {
        this.f1537o00ooO0 = true;
    }

    public final void o00oOo0o() {
        this.f1532o00oo0O0.postDelayed(this.f1535o00oo0o0, ViewConfiguration.getLongPressTimeout());
    }

    public void o00oOoOO(boolean z) {
        long longPressTimeout;
        if (o0O000oo.o0O0o00O.o0O0OOoo(this.f1532o00oo0O0)) {
            o00oOoO0(null);
            oO0Oo oo0oo = f1529o00ooOOo;
            if (oo0oo != null) {
                oo0oo.o00oOooO();
            }
            f1529o00ooOOo = this;
            this.f1538o00ooO00 = z;
            o0oo0000 o0oo0000Var = new o0oo0000(this.f1532o00oo0O0.getContext());
            this.f1530o00oo = o0oo0000Var;
            o0oo0000Var.o00oOo0O(this.f1532o00oo0O0, this.f1536o00oo0oO, this.f1539o0O0o, this.f1538o00ooO00, this.f1531o00oo0O);
            this.f1532o00oo0O0.addOnAttachStateChangeListener(this);
            if (this.f1538o00ooO00) {
                longPressTimeout = f1526o00ooO0o;
            } else {
                longPressTimeout = ((o0O0o00O.o00oo0OO.o00oOoO0(this.f1532o00oo0O0) & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f1532o00oo0O0.removeCallbacks(this.f1534o00oo0o);
            this.f1532o00oo0O0.postDelayed(this.f1534o00oo0o, longPressTimeout);
        }
    }

    public final boolean o00oOoOo(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (this.f1537o00ooO0 || Math.abs(x - this.f1536o00oo0oO) > this.f1533o00oo0Oo || Math.abs(y - this.f1539o0O0o) > this.f1533o00oo0Oo) {
            this.f1536o00oo0oO = x;
            this.f1539o0O0o = y;
            this.f1537o00ooO0 = false;
            return true;
        }
        return false;
    }

    public void o00oOooO() {
        if (f1529o00ooOOo == this) {
            f1529o00ooOOo = null;
            o0oo0000 o0oo0000Var = this.f1530o00oo;
            if (o0oo0000Var != null) {
                o0oo0000Var.o00oOo00();
                this.f1530o00oo = null;
                o00oOo00();
                this.f1532o00oo0O0.removeOnAttachStateChangeListener(this);
            }
        }
        if (f1527o00ooOO == this) {
            o00oOoO0(null);
        }
        this.f1532o00oo0O0.removeCallbacks(this.f1534o00oo0o);
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1530o00oo == null || !this.f1538o00ooO00) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1532o00oo0O0.getContext().getSystemService("accessibility");
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action != 7) {
                if (action == 10) {
                    o00oOo00();
                    o00oOooO();
                }
            } else if (this.f1532o00oo0O0.isEnabled() && this.f1530o00oo == null && o00oOoOo(motionEvent)) {
                o00oOoO0(this);
            }
            return false;
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1536o00oo0oO = view.getWidth() / 2;
        this.f1539o0O0o = view.getHeight() / 2;
        o00oOoOO(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        o00oOooO();
    }
}
