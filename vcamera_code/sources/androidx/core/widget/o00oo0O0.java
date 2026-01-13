package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOo000;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o00oo0O0 extends ProgressBar {

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f2510o00oo = 500;

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f2511o0O0o = 500;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f2512o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public long f2513o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f2514o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final Runnable f2515o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public boolean f2516o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final Runnable f2517o00oo0oO;

    public o00oo0O0(@oo0oO0 Context context) {
        this(context, null);
    }

    public o00oo0O0(@oo0oO0 Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2513o00oo0O0 = -1L;
        this.f2512o00oo0O = false;
        this.f2514o00oo0Oo = false;
        this.f2516o00oo0o0 = false;
        this.f2515o00oo0o = new Runnable() { // from class: androidx.core.widget.o00oo0
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0O0.this.o00oOoO0();
            }
        };
        this.f2517o00oo0oO = new Runnable() { // from class: androidx.core.widget.o00oo0OO
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0O0.this.o00oOoO();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOoO() {
        this.f2514o00oo0Oo = false;
        if (this.f2516o00oo0o0) {
            return;
        }
        this.f2513o00oo0O0 = System.currentTimeMillis();
        setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oOoO0() {
        this.f2512o00oo0O = false;
        this.f2513o00oo0O0 = -1L;
        setVisibility(8);
    }

    public void o00oOo0O() {
        post(new Runnable() { // from class: androidx.core.widget.o00oo00O
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0O0.this.o00oOo0o();
            }
        });
    }

    @o0OOo000
    public final void o00oOo0o() {
        this.f2516o00oo0o0 = true;
        removeCallbacks(this.f2517o00oo0oO);
        this.f2514o00oo0Oo = false;
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f2513o00oo0O0;
        long j2 = currentTimeMillis - j;
        if (j2 >= 500 || j == -1) {
            setVisibility(8);
        } else if (this.f2512o00oo0O) {
        } else {
            postDelayed(this.f2515o00oo0o, 500 - j2);
            this.f2512o00oo0O = true;
        }
    }

    public final void o00oOoOO() {
        removeCallbacks(this.f2515o00oo0o);
        removeCallbacks(this.f2517o00oo0oO);
    }

    public void o00oOoOo() {
        post(new Runnable() { // from class: androidx.core.widget.o00oOoO
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0O0.this.o00oOoo0();
            }
        });
    }

    @o0OOo000
    public final void o00oOoo0() {
        this.f2513o00oo0O0 = -1L;
        this.f2516o00oo0o0 = false;
        removeCallbacks(this.f2515o00oo0o);
        this.f2512o00oo0O = false;
        if (this.f2514o00oo0Oo) {
            return;
        }
        postDelayed(this.f2517o00oo0oO, 500L);
        this.f2514o00oo0Oo = true;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        o00oOoOO();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o00oOoOO();
    }
}
