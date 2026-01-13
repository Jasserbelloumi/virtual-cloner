package com.imuxuan.floatingview;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;
import o00oOooO.o0O0O0o0;
import o00oOooO.oooOO0;
import o0O000oo.o0O0o00O;
import o0OO00Oo.o00oo0O0;
import o0OO00oo.o00oo;
import o0OO00oo.o00ooO;
import o0OO00oo.o00ooO0;
/* loaded from: classes2.dex */
public class o00oOOoO implements o00ooO0 {

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static volatile o00oOOoO f6529o00oOo0o;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public o00oo f6530o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public WeakReference<FrameLayout> f6531o00oOOoO;
    @oooOO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f6532o00oOo00 = R.layout.en_floating_view;
    @o0O0O0o0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f6534o00oOooO = R.drawable.imuxuan;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public ViewGroup.LayoutParams f6533o00oOo0O = o00oo0o0();

    /* loaded from: classes2.dex */
    public class o00oOOo0 implements Runnable {
        public o00oOOo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o00oo o00ooVar = o00oOOoO.this.f6530o00oOOo0;
            if (o00ooVar == null) {
                return;
            }
            if (o0O0o00O.o0O0OOoo(o00ooVar) && o00oOOoO.this.o00oo0Oo() != null) {
                o00oOOoO.this.o00oo0Oo().removeView(o00oOOoO.this.f6530o00oOOo0);
            }
            o00oOOoO.this.f6530o00oOOo0 = null;
        }
    }

    public static o00oOOoO o00oo0O0() {
        if (f6529o00oOo0o == null) {
            synchronized (o00oOOoO.class) {
                if (f6529o00oOo0o == null) {
                    f6529o00oOo0o = new o00oOOoO();
                }
            }
        }
        return f6529o00oOo0o;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oo getView() {
        return this.f6530o00oOOo0;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOOo0(Activity activity) {
        o00oOo0O(o00oo0O(activity));
        return this;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOOoO(o00ooO o00ooo) {
        o00oo o00ooVar = this.f6530o00oOOo0;
        if (o00ooVar != null) {
            o00ooVar.setMagnetViewListener(o00ooo);
        }
        return this;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOo00(o00oo o00ooVar) {
        this.f6530o00oOOo0 = o00ooVar;
        return this;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOo0O(FrameLayout frameLayout) {
        o00oo o00ooVar;
        if (frameLayout == null || (o00ooVar = this.f6530o00oOOo0) == null) {
            this.f6531o00oOOoO = new WeakReference<>(frameLayout);
            return this;
        } else if (o00ooVar.getParent() == frameLayout) {
            return this;
        } else {
            if (this.f6530o00oOOo0.getParent() != null) {
                ((ViewGroup) this.f6530o00oOOo0.getParent()).removeView(this.f6530o00oOOo0);
            }
            this.f6531o00oOOoO = new WeakReference<>(frameLayout);
            frameLayout.addView(this.f6530o00oOOo0);
            return this;
        }
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOo0o(@o0O0O0o0 int i) {
        this.f6534o00oOooO = i;
        return this;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOoO() {
        o00oo0OO();
        return this;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOoO0(FrameLayout frameLayout) {
        o00oo o00ooVar = this.f6530o00oOOo0;
        if (o00ooVar != null && frameLayout != null && o0O0o00O.o0O0OOoo(o00ooVar)) {
            frameLayout.removeView(this.f6530o00oOOo0);
        }
        if (o00oo0Oo() == frameLayout) {
            this.f6531o00oOOoO = null;
        }
        return this;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOoOO(Activity activity) {
        o00oOoO0(o00oo0O(activity));
        return this;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOoOo(ViewGroup.LayoutParams layoutParams) {
        this.f6533o00oOo0O = layoutParams;
        o00oo o00ooVar = this.f6530o00oOOo0;
        if (o00ooVar != null) {
            o00ooVar.setLayoutParams(layoutParams);
        }
        return this;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO o00oOooO(@oooOO0 int i) {
        this.f6532o00oOo00 = i;
        return this;
    }

    public final void o00oo0(View view) {
        if (o00oo0Oo() == null) {
            return;
        }
        o00oo0Oo().addView(view);
    }

    public final FrameLayout o00oo0O(Activity activity) {
        if (activity == null) {
            return null;
        }
        try {
            return (FrameLayout) activity.getWindow().getDecorView().findViewById(16908290);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void o00oo0OO() {
        synchronized (this) {
            if (this.f6530o00oOOo0 != null) {
                return;
            }
            com.imuxuan.floatingview.o00oOOo0 o00oooo02 = new com.imuxuan.floatingview.o00oOOo0(o00oo0O0.o00oOOo0(), this.f6532o00oOo00);
            this.f6530o00oOOo0 = o00oooo02;
            o00oooo02.setLayoutParams(this.f6533o00oOo0O);
            o00oooo02.setIconImage(this.f6534o00oOooO);
            o00oo0(o00oooo02);
        }
    }

    public final FrameLayout o00oo0Oo() {
        WeakReference<FrameLayout> weakReference = this.f6531o00oOOoO;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public final FrameLayout.LayoutParams o00oo0o0() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = BadgeDrawable.BOTTOM_START;
        layoutParams.setMargins(13, layoutParams.topMargin, layoutParams.rightMargin, 500);
        return layoutParams;
    }

    @Override // o0OO00oo.o00ooO0
    public o00oOOoO remove() {
        new Handler(Looper.getMainLooper()).post(new o00oOOo0());
        return this;
    }
}
