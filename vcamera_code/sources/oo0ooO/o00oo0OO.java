package oo0ooO;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.badge.BadgeDrawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oo0ooO.o00oo0O0;
import oo0ooO.o00oo0OO;
/* loaded from: classes2.dex */
public class o00oo0OO<X extends o00oo0OO<?>> implements Runnable, o00oo0O0.o00oOOo0 {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final Handler f17423o00ooO = new Handler(Looper.getMainLooper());

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final List<o00oo0OO<?>> f17424o00ooOO0 = new ArrayList();

    /* renamed from: o00oo  reason: collision with root package name */
    public oo0ooO.o00oOOoO f17425o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public ViewGroup f17426o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Context f17427o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public WindowManager f17428o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f17429o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public WindowManager.LayoutParams f17430o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f17431o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public o00oOo0O f17432o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public o0OO00OO.o00oOo0O f17433o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public o00oo0O0 f17434o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public final Runnable f17435o00ooO0o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public String f17436o0O0o;

    /* loaded from: classes2.dex */
    public interface o00oOOo0<V extends View> {
        void o00oOOo0(o00oo0OO<?> o00oo0oo, V v);
    }

    /* loaded from: classes2.dex */
    public interface o00oOOoO<V extends View> {
        boolean o00oOOo0(o00oo0OO<?> o00oo0oo, V v);
    }

    /* loaded from: classes2.dex */
    public interface o00oOo00<V extends View> {
        boolean o00oOOo0(o00oo0OO<?> o00oo0oo, V v, MotionEvent motionEvent);
    }

    /* loaded from: classes2.dex */
    public interface o00oOo0O {
        default void o00oOOo0(o00oo0OO<?> o00oo0oo) {
        }

        default void o00oOOoO(o00oo0OO<?> o00oo0oo) {
        }

        default void o00oOo00(o00oo0OO<?> o00oo0oo) {
        }
    }

    public o00oo0OO(Activity activity) {
        this((Context) activity);
        View decorView = activity.getWindow().getDecorView();
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        if ((attributes.flags & 1024) != 0 || (decorView.getSystemUiVisibility() & 4) != 0) {
            o00oOo0O(1024);
        }
        o0O000o(attributes.layoutInDisplayCutoutMode);
        int i = attributes.systemUiVisibility;
        if (i != 0) {
            o0O00o(i);
        }
        if (decorView.getSystemUiVisibility() != 0) {
            this.f17426o00oo0O.setSystemUiVisibility(decorView.getSystemUiVisibility());
        }
        oo0ooO.o00oOOoO o00ooooo2 = new oo0ooO.o00oOOoO(this, activity);
        this.f17425o00oo = o00ooooo2;
        o00ooooo2.o00oOOo0();
    }

    public o00oo0OO(Application application) {
        this((Context) application);
        o0O0OOoO(2038);
    }

    public o00oo0OO(Context context) {
        this.f17435o00ooO0o = new Runnable() { // from class: oo0ooO.o00oOo0O
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0OO.this.oo0OOoo();
            }
        };
        this.f17427o00oo0O0 = context;
        this.f17426o00oo0O = new o00ooO0(context);
        this.f17428o00oo0Oo = (WindowManager) context.getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f17430o00oo0o0 = layoutParams;
        layoutParams.height = -2;
        layoutParams.width = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = 16973828;
        layoutParams.packageName = context.getPackageName();
        this.f17430o00oo0o0.flags = 40;
        f17424o00ooOO0.add(this);
    }

    public static synchronized void o00oOoO(Class<o00oo0OO<?>> cls) {
        synchronized (o00oo0OO.class) {
            if (cls == null) {
                return;
            }
            for (o00oo0OO<?> o00oo0oo : f17424o00ooOO0) {
                if (o00oo0oo != null && cls.equals(o00oo0oo.getClass())) {
                    o00oo0oo.o00oOo0o();
                }
            }
        }
    }

    public static synchronized void o00oOoO0() {
        synchronized (o00oo0OO.class) {
            for (o00oo0OO<?> o00oo0oo : f17424o00ooOO0) {
                if (o00oo0oo != null) {
                    o00oo0oo.o00oOo0o();
                }
            }
        }
    }

    public static synchronized void o00oOoOO(String str) {
        synchronized (o00oo0OO.class) {
            if (str == null) {
                return;
            }
            for (o00oo0OO<?> o00oo0oo : f17424o00ooOO0) {
                if (o00oo0oo != null && str.equals(o00oo0oo.o00oo0O0())) {
                    o00oo0oo.o00oOo0o();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oo() {
        o0OO00OO.o00oOo0O o00ooo0o2 = this.f17433o00ooO00;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oo0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o00oo0oO() {
        o0OO00OO.o00oOo0O o00ooo0o2 = this.f17433o00ooO00;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oo0();
        }
    }

    public static void o00ooOO(Class<o00oo0OO<?>> cls) {
        if (cls == null) {
            return;
        }
        Iterator<o00oo0OO<?>> it = f17424o00ooOO0.iterator();
        while (it.hasNext()) {
            o00oo0OO<?> next = it.next();
            if (next != null && cls.equals(next.getClass())) {
                it.remove();
                next.o00ooO();
            }
        }
    }

    public static synchronized void o00ooOO0() {
        synchronized (o00oo0OO.class) {
            Iterator<o00oo0OO<?>> it = f17424o00ooOO0.iterator();
            while (it.hasNext()) {
                o00oo0OO<?> next = it.next();
                if (next != null) {
                    it.remove();
                    next.o00ooO();
                }
            }
        }
    }

    public static void o00ooOOo(String str) {
        if (str == null) {
            return;
        }
        Iterator<o00oo0OO<?>> it = f17424o00ooOO0.iterator();
        while (it.hasNext()) {
            o00oo0OO<?> next = it.next();
            if (next != null && str.equals(next.o00oo0O0())) {
                it.remove();
                next.o00ooO();
            }
        }
    }

    public static o00oo0OO o0O0OoO(Activity activity) {
        return new o00oo0OO(activity);
    }

    public static o00oo0OO o0O0OoOo(Application application) {
        return new o00oo0OO(application);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o0O0o() {
        o0OO00OO.o00oOo0O o00ooo0o2 = this.f17433o00ooO00;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oo0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0(o0OO00OO.o00oOo0O o00ooo0o2) {
        this.f17433o00ooO00 = o00ooo0o2;
        if (o00ooo0o2 != null) {
            o00ooOoO(16);
            o00ooOoO(512);
            if (o00oo0o()) {
                oo0OOoo();
                o00ooo0o2.o00oo0OO(this);
            }
        }
        if (this.f17434o00ooO0O == null) {
            this.f17434o00ooO0O = new o00oo0O0(this.f17427o00oo0O0.getResources().getConfiguration());
        }
        this.f17434o00ooO0O.o00oOOo0(this.f17427o00oo0O0, this);
        return this;
    }

    @Override // oo0ooO.o00oo0O0.o00oOOo0
    public void o00oOOo0(int i) {
        o0OO00OO.o00oOo0O o00ooo0o2;
        if (o00oo0o() && (o00ooo0o2 = this.f17433o00ooO00) != null) {
            o00ooo0o2.o00oo00O();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00oOo0O(int i) {
        WindowManager.LayoutParams layoutParams = this.f17430o00oo0o0;
        layoutParams.flags = i | layoutParams.flags;
        o00ooO0o();
        return this;
    }

    public void o00oOo0o() {
        if (this.f17429o00oo0o) {
            try {
                try {
                    this.f17428o00oo0Oo.removeViewImmediate(this.f17426o00oo0O);
                    o00ooOo0(this);
                    o00oOo0O o00ooo0o2 = this.f17432o00ooO0;
                    if (o00ooo0o2 != null) {
                        o00ooo0o2.o00oOOo0(this);
                    }
                } finally {
                    this.f17429o00oo0o = false;
                }
            } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public <V extends View> V o00oOoOo(int i) {
        return (V) this.f17426o00oo0O.findViewById(i);
    }

    public View o00oOoo0() {
        if (this.f17426o00oo0O.getChildCount() == 0) {
            return null;
        }
        return this.f17426o00oo0O.getChildAt(0);
    }

    public Context o00oOooo() {
        return this.f17427o00oo0O0;
    }

    public o0OO00OO.o00oOo0O o00oo0() {
        return this.f17433o00ooO00;
    }

    public View o00oo00O() {
        return this.f17426o00oo0O;
    }

    public WindowManager o00oo0O() {
        return this.f17428o00oo0Oo;
    }

    public String o00oo0O0() {
        return this.f17436o0O0o;
    }

    public Handler o00oo0OO() {
        return f17423o00ooO;
    }

    public WindowManager.LayoutParams o00oo0Oo() {
        return this.f17430o00oo0o0;
    }

    public boolean o00oo0o() {
        return this.f17429o00oo0o;
    }

    public boolean o00oo0o0(int i) {
        return (i & this.f17430o00oo0o0.flags) != 0;
    }

    public void o00ooO() {
        if (o00oo0o()) {
            o00oOo0o();
        }
        o00oo0O0 o00oo0o02 = this.f17434o00ooO0O;
        if (o00oo0o02 != null) {
            o00oo0o02.o00oOOoO(this.f17427o00oo0O0);
        }
        o00oOo0O o00ooo0o2 = this.f17432o00ooO0;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00oOOoO(this);
        }
        oo0ooO.o00oOOoO o00ooooo2 = this.f17425o00oo;
        if (o00ooooo2 != null) {
            o00ooooo2.o00oOOoO();
        }
        this.f17432o00ooO0 = null;
        this.f17427o00oo0O0 = null;
        this.f17426o00oo0O = null;
        this.f17428o00oo0Oo = null;
        this.f17430o00oo0o0 = null;
        this.f17425o00oo = null;
        this.f17433o00ooO00 = null;
        this.f17434o00ooO0O = null;
        f17424o00ooOO0.remove(this);
    }

    public boolean o00ooO0(Runnable runnable, long j) {
        return f17423o00ooO.postAtTime(runnable, this, j);
    }

    public boolean o00ooO00(Runnable runnable) {
        return o00ooO0O(runnable, 0L);
    }

    public boolean o00ooO0O(Runnable runnable, long j) {
        if (j < 0) {
            j = 0;
        }
        return o00ooO0(runnable, SystemClock.uptimeMillis() + j);
    }

    public void o00ooO0o() {
        if (o00oo0o()) {
            o00ooOo0(this.f17435o00ooO0o);
            o00ooO00(this.f17435o00ooO0o);
        }
    }

    public void o00ooOo() {
        f17423o00ooO.removeCallbacksAndMessages(this);
    }

    public void o00ooOo0(Runnable runnable) {
        f17423o00ooO.removeCallbacks(runnable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00ooOoO(int i) {
        WindowManager.LayoutParams layoutParams = this.f17430o00oo0o0;
        layoutParams.flags = (~i) & layoutParams.flags;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00ooOoo(int i) {
        this.f17430o00oo0o0.windowAnimations = i;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00ooo0(int i, Drawable drawable) {
        o00oOoOo(i).setBackground(drawable);
        return this;
    }

    public X o00ooo00(int i, int i2) {
        return o00ooo0(i, this.f17427o00oo0O0.getDrawable(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00ooo0O(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("amount must be a value between 0 and 1");
        }
        this.f17430o00oo0o0.dimAmount = f;
        if (f != 0.0f) {
            o00oOo0O(2);
        } else {
            o00ooOoO(2);
        }
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00ooo0o(int i) {
        this.f17430o00oo0o0.format = i;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00oooO(int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            this.f17430o00oo0o0.setBlurBehindRadius(i);
            o00oOo0O(4);
            o00ooO0o();
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00oooOO(float f) {
        this.f17430o00oo0o0.buttonBrightness = f;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00oooOo(int i) {
        this.f17430o00oo0o0.setColorMode(i);
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        r0.gravity = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X o00oooo(android.view.View r5) {
        /*
            r4 = this;
            android.view.ViewGroup r0 = r4.f17426o00oo0O
            int r0 = r0.getChildCount()
            if (r0 <= 0) goto Ld
            android.view.ViewGroup r0 = r4.f17426o00oo0O
            r0.removeAllViews()
        Ld:
            android.view.ViewGroup r0 = r4.f17426o00oo0O
            r0.addView(r5)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            boolean r0 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L26
            r0 = r5
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            r1 = 0
            r0.topMargin = r1
            r0.bottomMargin = r1
            r0.leftMargin = r1
            r0.rightMargin = r1
        L26:
            android.view.WindowManager$LayoutParams r0 = r4.f17430o00oo0o0
            int r1 = r0.gravity
            if (r1 != 0) goto L4e
            boolean r1 = r5 instanceof android.widget.FrameLayout.LayoutParams
            r2 = -1
            if (r1 == 0) goto L39
            r1 = r5
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r1 = r1.gravity
            if (r1 == r2) goto L46
            goto L44
        L39:
            boolean r1 = r5 instanceof android.widget.LinearLayout.LayoutParams
            if (r1 == 0) goto L46
            r1 = r5
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r1 = r1.gravity
            if (r1 == r2) goto L46
        L44:
            r0.gravity = r1
        L46:
            int r1 = r0.gravity
            if (r1 != 0) goto L4e
            r1 = 17
            r0.gravity = r1
        L4e:
            if (r5 == 0) goto L68
            int r1 = r0.width
            r2 = -2
            if (r1 != r2) goto L62
            int r3 = r0.height
            if (r3 != r2) goto L62
            int r1 = r5.width
            r0.width = r1
            int r5 = r5.height
            r0.height = r5
            goto L68
        L62:
            r5.width = r1
            int r0 = r0.height
            r5.height = r0
        L68:
            r4.o00ooO0o()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: oo0ooO.o00oo0OO.o00oooo(android.view.View):oo0ooO.o00oo0OO");
    }

    public X o00oooo0(int i) {
        return o00oooo(LayoutInflater.from(this.f17427o00oo0O0).inflate(i, this.f17426o00oo0O, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o00ooooO(ViewGroup viewGroup) {
        this.f17426o00oo0O = viewGroup;
        return this;
    }

    public X o00ooooo() {
        return o0(new o0OO00OO.o00oOoO());
    }

    public X o0O00(o00oOOo0<? extends View> o00oooo02) {
        return o0O000oo(this.f17426o00oo0O, o00oooo02);
    }

    public X o0O000(int i, int i2) {
        return o0O000O(i, this.f17427o00oo0O0.getResources().getString(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O00000(int i) {
        this.f17431o00oo0oO = i;
        if (o00oo0o() && this.f17431o00oo0oO != 0) {
            o00ooOo0(this);
            o00ooO0O(this, this.f17431o00oo0oO);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0000O(int i) {
        this.f17430o00oo0o0.gravity = i;
        o00ooO0o();
        o00ooO00(new Runnable() { // from class: oo0ooO.o00oo00O
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0OO.this.o00oo0oO();
            }
        });
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0000o(int i) {
        View childAt;
        ViewGroup.LayoutParams layoutParams;
        this.f17430o00oo0o0.height = i;
        if (this.f17426o00oo0O.getChildCount() > 0 && (layoutParams = (childAt = this.f17426o00oo0O.getChildAt(0)).getLayoutParams()) != null && layoutParams.height != i) {
            layoutParams.height = i;
            childAt.setLayoutParams(layoutParams);
        }
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O000O(int i, CharSequence charSequence) {
        ((TextView) o00oOoOo(i)).setHint(charSequence);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O000Oo(float f) {
        this.f17430o00oo0o0.horizontalMargin = f;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O000o(int i) {
        this.f17430o00oo0o0.layoutInDisplayCutoutMode = i;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O000o0(int i, Drawable drawable) {
        ((ImageView) o00oOoOo(i)).setImageDrawable(drawable);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final X o0O000oo(View view, o00oOOo0<? extends View> o00oooo02) {
        o00ooOoO(16);
        view.setClickable(true);
        view.setOnClickListener(new o00oo0O(this, o00oooo02));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O00O(o00oOo0O o00ooo0o2) {
        this.f17432o00ooO0 = o00ooo0o2;
        return this;
    }

    public X o0O00O0(int i, o00oOOoO<? extends View> o00ooooo2) {
        return o0OoO00O(o00oOoOo(i), o00ooooo2);
    }

    public X o0O00O0o(o00oOOoO<? extends View> o00ooooo2) {
        return o0OoO00O(this.f17426o00oo0O, o00ooooo2);
    }

    public X o0O00OO(int i, o00oOo00<? extends View> o00ooo002) {
        return o0O00OOO(o00oOoOo(i), o00ooo002);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final X o0O00OOO(View view, o00oOo00<? extends View> o00ooo002) {
        o00ooOoO(16);
        view.setEnabled(true);
        view.setOnTouchListener(new o00oo(this, o00ooo002));
        return this;
    }

    public X o0O00Oo(o00oOo00<? extends View> o00ooo002) {
        return o0O00OOO(this.f17426o00oo0O, o00ooo002);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O00OoO(int i) {
        this.f17430o00oo0o0.preferredDisplayModeId = i;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O00Ooo(float f) {
        this.f17430o00oo0o0.preferredRefreshRate = f;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O00o(int i) {
        this.f17430o00oo0o0.systemUiVisibility = i;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O00o00(float f) {
        this.f17430o00oo0o0.screenBrightness = f;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O00o0O(int i) {
        this.f17430o00oo0o0.screenOrientation = i;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O00o0o(int i) {
        this.f17430o00oo0o0.softInputMode = i;
        o00ooOoO(8);
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O00oO0(String str) {
        this.f17436o0O0o = str;
        return this;
    }

    public X o0O0O0O(int i) {
        return o0oO0O0o(16908299, i);
    }

    public X o0O0O0Oo(CharSequence charSequence) {
        return o0O0oo0o(16908299, charSequence);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0O0o(int i, float f) {
        ((TextView) o00oOoOo(i)).setTextSize(f);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0O0o0(int i, int i2) {
        ((TextView) o00oOoOo(i)).setTextColor(i2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0O0oO(int i, int i2, float f) {
        ((TextView) o00oOoOo(i)).setTextSize(i2, f);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0O0oo(float f) {
        this.f17430o00oo0o0.verticalMargin = f;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0OO(float f) {
        this.f17430o00oo0o0.alpha = f;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0OO0(int i, int i2) {
        o00oOoOo(i).setVisibility(i2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0OO0O(int i) {
        View childAt;
        ViewGroup.LayoutParams layoutParams;
        this.f17430o00oo0o0.width = i;
        if (this.f17426o00oo0O.getChildCount() > 0 && (layoutParams = (childAt = this.f17426o00oo0O.getChildAt(0)).getLayoutParams()) != null && layoutParams.width != i) {
            layoutParams.width = i;
            childAt.setLayoutParams(layoutParams);
        }
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0OOO(WindowManager.LayoutParams layoutParams) {
        this.f17430o00oo0o0 = layoutParams;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0OOO0(int i) {
        this.f17430o00oo0o0.flags = i;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0OOOo(CharSequence charSequence) {
        this.f17430o00oo0o0.setTitle(charSequence);
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0OOo(IBinder iBinder) {
        this.f17430o00oo0o0.token = iBinder;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0OOoO(int i) {
        this.f17430o00oo0o0.type = i;
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0OOoo(int i) {
        this.f17430o00oo0o0.x = i;
        o00ooO0o();
        o00ooO00(new Runnable() { // from class: oo0ooO.o00oOoO
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0OO.this.o0O0o();
            }
        });
        return this;
    }

    public void o0O0Oo(View view, int i, int i2, int i3) {
        if (this.f17426o00oo0O.getChildCount() == 0 || this.f17430o00oo0o0 == null) {
            throw new IllegalArgumentException("WindowParams and view cannot be empty");
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i, view.getResources().getConfiguration().getLayoutDirection());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        WindowManager.LayoutParams layoutParams = this.f17430o00oo0o0;
        layoutParams.gravity = BadgeDrawable.TOP_START;
        int i4 = (iArr[0] - rect.left) + i2;
        layoutParams.x = i4;
        layoutParams.y = (iArr[1] - rect.top) + i3;
        if ((absoluteGravity & 3) == 3) {
            int width = this.f17426o00oo0O.getWidth();
            if (width == 0) {
                width = this.f17426o00oo0O.getMeasuredWidth();
            }
            if (width == 0) {
                this.f17426o00oo0O.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                width = this.f17426o00oo0O.getMeasuredWidth();
            }
            this.f17430o00oo0o0.x -= width;
        } else if ((absoluteGravity & 5) == 5) {
            layoutParams.x = view.getWidth() + i4;
        }
        if ((absoluteGravity & 48) == 48) {
            int height = this.f17426o00oo0O.getHeight();
            if (height == 0) {
                height = this.f17426o00oo0O.getMeasuredHeight();
            }
            if (height == 0) {
                this.f17426o00oo0O.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                height = this.f17426o00oo0O.getMeasuredHeight();
            }
            this.f17430o00oo0o0.y -= height;
        } else if ((absoluteGravity & 80) == 80) {
            WindowManager.LayoutParams layoutParams2 = this.f17430o00oo0o0;
            layoutParams2.y = view.getHeight() + layoutParams2.y;
        }
        o0O0Oo0();
    }

    public void o0O0Oo0() {
        if (this.f17426o00oo0O.getChildCount() == 0 || this.f17430o00oo0o0 == null) {
            throw new IllegalArgumentException("WindowParams and view cannot be empty");
        }
        if (this.f17429o00oo0o) {
            oo0OOoo();
            return;
        }
        Context context = this.f17427o00oo0O0;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
        }
        try {
            if (this.f17426o00oo0O.getParent() != null) {
                this.f17428o00oo0Oo.removeViewImmediate(this.f17426o00oo0O);
            }
            this.f17428o00oo0Oo.addView(this.f17426o00oo0O, this.f17430o00oo0o0);
            this.f17429o00oo0o = true;
            if (this.f17431o00oo0oO != 0) {
                o00ooOo0(this);
                o00ooO0O(this, this.f17431o00oo0oO);
            }
            o0OO00OO.o00oOo0O o00ooo0o2 = this.f17433o00ooO00;
            if (o00ooo0o2 != null) {
                o00ooo0o2.o00oo0OO(this);
            }
            o00oOo0O o00ooo0o3 = this.f17432o00ooO0;
            if (o00ooo0o3 != null) {
                o00ooo0o3.o00oOo00(this);
            }
        } catch (WindowManager.BadTokenException | IllegalArgumentException | IllegalStateException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    public void o0O0Oo0O(View view) {
        o0O0Oo0o(view, 80);
    }

    public void o0O0Oo0o(View view, int i) {
        o0O0Oo(view, i, 0, 0);
    }

    public void o0O0OoO0(Class<? extends Activity> cls) {
        o0O0Oooo(new Intent(this.f17427o00oo0O0, cls));
    }

    public void o0O0Oooo(Intent intent) {
        if (!(this.f17427o00oo0O0 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        this.f17427o00oo0O0.startActivity(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0O0oo0o(int i, CharSequence charSequence) {
        ((TextView) o00oOoOo(i)).setText(charSequence);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final X o0OoO00O(View view, o00oOOoO<? extends View> o00ooooo2) {
        o00ooOoO(16);
        view.setClickable(true);
        view.setOnLongClickListener(new o0O0o(this, o00ooooo2));
        return this;
    }

    public X o0OoOoOO(int i, int i2) {
        return o0O000o0(i, this.f17427o00oo0O0.getDrawable(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0OoOoOo(int i, int i2) {
        ((TextView) o00oOoOo(i)).setHintTextColor(i2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0OooO0(int i) {
        this.f17430o00oo0o0.y = i;
        o00ooO0o();
        o00ooO00(new Runnable() { // from class: oo0ooO.o00oo0
            @Override // java.lang.Runnable
            public final void run() {
                o00oo0OO.this.o00oo();
            }
        });
        return this;
    }

    public X o0oO0O0o(int i, int i2) {
        return o0O0oo0o(i, this.f17427o00oo0O0.getResources().getString(i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0oO0Ooo(boolean z) {
        if (z) {
            o00oOo0O(40);
        } else {
            o00ooOoO(40);
        }
        o00ooO0o();
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public X o0ooO(float f) {
        this.f17430o00oo0o0.verticalWeight = f;
        o00ooO0o();
        return this;
    }

    public X o0ooOoOO(int i, o00oOOo0<? extends View> o00oooo02) {
        return o0O000oo(o00oOoOo(i), o00oooo02);
    }

    public void oo0OOoo() {
        if (o00oo0o()) {
            try {
                this.f17428o00oo0Oo.updateViewLayout(this.f17426o00oo0O, this.f17430o00oo0o0);
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        o00oOo0o();
    }
}
