package com.skydoves.powerspinner;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.o00oo;
import androidx.lifecycle.o0O0O0O;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o00ooO0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.skydoves.powerspinner.PowerSpinnerView;
import com.skydoves.powerspinner.o00oOOoO;
import java.util.List;
import o00oOooO.o0O;
import o00oOooO.o0O00O;
import o00oOooO.o0O0O0o0;
import o00oOooO.o0OO0;
import o00oOooO.o0OOO0OO;
import o00oOooO.o0OoOoOo;
import o00ooOoo.oOo000Oo;
import o00oooo0.o0O0O0Oo;
import o0OO0Ooo.o00oo0;
import o0OO0Ooo.o00oo0O;
import o0OO0Ooo.o00oo0O0;
import o0OO0Ooo.o00oo0OO;
import o0OO0Ooo.o0O00;
import o0OO0Ooo.o0O00O0;
import o0OO0Ooo.o0O0o;
import o0OO0Ooo.o0OoO00O;
import o0OO0o.oO0Ooooo;
import o0OO0oO.o0O000O;
import o0OOOO.o00oOOo0;
import o0OOOO.o0O000;
import o0OOOO.o0O00000;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO00;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\nPowerSpinnerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PowerSpinnerView.kt\ncom/skydoves/powerspinner/PowerSpinnerView\n+ 2 WhatIfExtension.kt\ncom/skydoves/powerspinner/internals/WhatIfExtensionKt\n*L\n1#1,1026:1\n31#2:1027\n46#2,4:1028\n33#2:1032\n51#2:1033\n35#2:1034\n31#2:1035\n46#2,4:1036\n33#2:1040\n51#2:1041\n35#2:1042\n*S KotlinDebug\n*F\n+ 1 PowerSpinnerView.kt\ncom/skydoves/powerspinner/PowerSpinnerView\n*L\n638#1:1027\n638#1:1028,4\n638#1:1032\n638#1:1033\n638#1:1034\n861#1:1035\n861#1:1036,4\n861#1:1040\n861#1:1041\n861#1:1042\n*E\n"})
/* loaded from: classes2.dex */
public final class PowerSpinnerView extends AppCompatTextView implements o00oo {
    @Nullable

    /* renamed from: o0  reason: collision with root package name */
    public o00oo0 f6571o0;

    /* renamed from: o00oo  reason: collision with root package name */
    public long f6572o00oo;
    @NotNull

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final PopupWindow f6573o00oo0O;
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OO0o00.o00oOOoO f6574o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f6575o00oo0Oo;
    @NotNull

    /* renamed from: o00oo0o  reason: collision with root package name */
    public o00oo0O<?> f6576o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public int f6577o00oo0o0;
    @NotNull

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final o0O0o f6578o00oo0oO;
    @o0O0O0o0

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f6579o00ooO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public long f6580o00ooO0;
    @Nullable

    /* renamed from: o00ooO00  reason: collision with root package name */
    public Drawable f6581o00ooO00;
    @o0OOOO0o.o00oOoO

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public boolean f6582o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public long f6583o00ooO0o;
    @NotNull

    /* renamed from: o00ooOO  reason: collision with root package name */
    public o0O00O0 f6584o00ooOO;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public boolean f6585o00ooOO0;
    @Nullable

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public o0OoO00O f6586o00ooOOo;
    @o0O00O

    /* renamed from: o00ooOo  reason: collision with root package name */
    public int f6587o00ooOo;
    @o0OO0

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public int f6588o00ooOo0;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f6589o00ooOoO;
    @o0OO0

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public int f6590o00ooOoo;
    @Nullable

    /* renamed from: o00ooo0  reason: collision with root package name */
    public Drawable f6591o00ooo0;
    @o0O00O

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f6592o00ooo00;
    @o0OO0

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public int f6593o00ooo0O;
    @o0OOO0OO

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public int f6594o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public int f6595o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public int f6596o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public int f6597o00oooOo;
    @Nullable

    /* renamed from: o00oooo  reason: collision with root package name */
    public Drawable f6598o00oooo;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public int f6599o00oooo0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public boolean f6600o00ooooO;
    @Nullable

    /* renamed from: o00ooooo  reason: collision with root package name */
    public o00oo0O0 f6601o00ooooo;
    @NotNull

    /* renamed from: o0O00000  reason: collision with root package name */
    public o0O00 f6602o0O00000;
    @Nullable

    /* renamed from: o0O0000O  reason: collision with root package name */
    public String f6603o0O0000O;
    @Nullable

    /* renamed from: o0O0000o  reason: collision with root package name */
    public o0O0O0O f6604o0O0000o;

    /* renamed from: o0O0o  reason: collision with root package name */
    public boolean f6605o0O0o;

    @o0OO0o0.o00oOoO
    @o0OOO00({"SMAP\nPowerSpinnerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PowerSpinnerView.kt\ncom/skydoves/powerspinner/PowerSpinnerView$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1026:1\n1#2:1027\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class o00oOOo0 {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final PowerSpinnerView f6606o00oOOo0;

        public o00oOOo0(@NotNull Context context) {
            o0ooO.o00oo0O0(context, "context");
            this.f6606o00oOOo0 = new PowerSpinnerView(context);
        }

        public static final void o00oo0Oo(o0OOOO.o00oOOo0 o00oooo02) {
            o0ooO.o00oo0O0(o00oooo02, "$block");
            o00oooo02.invoke();
        }

        public static final void o00oo0oO(o0O000 o0o000, int i, Object obj, int i2, Object obj2) {
            o0ooO.o00oo0O0(o0o000, "$block");
            o0o000.invoke(Integer.valueOf(i), obj, Integer.valueOf(i2), obj2);
        }

        public static final void o00ooO00(o0O00000 o0o00000, View view, MotionEvent motionEvent) {
            o0ooO.o00oo0O0(o0o00000, "$unit");
            o0ooO.o00oo0O0(view, "view");
            o0ooO.o00oo0O0(motionEvent, oOo000Oo.f9217o0O00o0o);
            o0o00000.invoke(view, motionEvent);
        }

        @NotNull
        public final o00oOOo0 o00oOo0O(boolean z) {
            this.f6606o00oOOo0.setArrowAnimate(z);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oOo0o(long j) {
            this.f6606o00oOOo0.setArrowAnimationDuration(j);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oOoO(@NotNull o0O00O0 o0o00o0) {
            o0ooO.o00oo0O0(o0o00o0, "value");
            this.f6606o00oOOo0.setArrowGravity(o0o00o0);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oOoO0(@o0O0O0o0 int i) {
            this.f6606o00oOOo0.setArrowResource(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oOoOO(@o0OO0 int i) {
            this.f6606o00oOOo0.setArrowPadding(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oOoOo(@o0O00O int i) {
            this.f6606o00oOOo0.setArrowTint(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oOoo0(boolean z) {
            this.f6606o00oOOo0.f6582o00ooO0O = z;
            return this;
        }

        @NotNull
        public final PowerSpinnerView o00oOooO() {
            return this.f6606o00oOOo0;
        }

        @NotNull
        public final o00oOOo0 o00oOooo(boolean z) {
            this.f6606o00oOOo0.setDismissWhenNotifiedItemSelected(z);
            return this;
        }

        public final /* synthetic */ o00oOOo0 o00oo(final o0O00000 o0o00000) {
            o0ooO.o00oo0O0(o0o00000, "unit");
            this.f6606o00oOOo0.setSpinnerOutsideTouchListener(new o00oo0O0() { // from class: o0OO0Ooo.o0O000O
                @Override // o0OO0Ooo.o00oo0O0
                public final void o00oOOo0(View view, MotionEvent motionEvent) {
                    PowerSpinnerView.o00oOOo0.o00ooO00(o0OOOO.o0O00000.this, view, motionEvent);
                }
            });
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oo0(@o0OO0 int i) {
            this.f6606o00oOOo0.setDividerSize(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oo00O(@o0O00O int i) {
            this.f6606o00oOOo0.setDividerColor(i);
            return this;
        }

        public final /* synthetic */ o00oOOo0 o00oo0O(final o0OOOO.o00oOOo0 o00oooo02) {
            o0ooO.o00oo0O0(o00oooo02, "block");
            this.f6606o00oOOo0.setOnSpinnerDismissListener(new o00oo0() { // from class: o0OO0Ooo.o0O000Oo
                @Override // o0OO0Ooo.o00oo0
                public final void onDismiss() {
                    PowerSpinnerView.o00oOOo0.o00oo0Oo(o00oOOo0.this);
                }
            });
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oo0O0(@NotNull o00oo0 o00oo0Var) {
            o0ooO.o00oo0O0(o00oo0Var, "value");
            this.f6606o00oOOo0.setOnSpinnerDismissListener(o00oo0Var);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00oo0OO(@NotNull o0O0O0O o0o0o0o) {
            o0ooO.o00oo0O0(o0o0o0o, "value");
            this.f6606o00oOOo0.setLifecycleOwner(o0o0o0o);
            return this;
        }

        public final /* synthetic */ o00oOOo0 o00oo0o(final o0O000 o0o000) {
            o0ooO.o00oo0O0(o0o000, "block");
            o00oo0O o00oo0o2 = this.f6606o00oOOo0.f6576o00oo0o;
            o0ooO.o00oo0(o00oo0o2, "null cannot be cast to non-null type com.skydoves.powerspinner.PowerSpinnerInterface<T of com.skydoves.powerspinner.PowerSpinnerView.Builder.setOnSpinnerItemSelectedListener$lambda$15>");
            o00oo0o2.o00oOo0o(new o00oo0OO() { // from class: o0OO0Ooo.o0OoOoOo
                @Override // o0OO0Ooo.o00oo0OO
                public final void o00oOOo0(int i, Object obj, int i2, Object obj2) {
                    PowerSpinnerView.o00oOOo0.o00oo0oO(o0OOOO.o0O000.this, i, obj, i2, obj2);
                }
            });
            return this;
        }

        @NotNull
        public final <T> o00oOOo0 o00oo0o0(@NotNull o00oo0OO<T> o00oo0oo) {
            o0ooO.o00oo0O0(o00oo0oo, "onSpinnerItemSelectedListener");
            o00oo0O o00oo0o2 = this.f6606o00oOOo0.f6576o00oo0o;
            o0ooO.o00oo0(o00oo0o2, "null cannot be cast to non-null type com.skydoves.powerspinner.PowerSpinnerInterface<T of com.skydoves.powerspinner.PowerSpinnerView.Builder.setOnSpinnerItemSelectedListener$lambda$13>");
            o00oo0o2.o00oOo0o(o00oo0oo);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooO(@o0OO0 int i) {
            this.f6606o00oOOo0.setSpinnerItemHeight(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooO0(@NotNull String str) {
            o0ooO.o00oo0O0(str, "value");
            this.f6606o00oOOo0.setPreferenceName(str);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooO0O(boolean z) {
            this.f6606o00oOOo0.setShowArrow(z);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooO0o(boolean z) {
            this.f6606o00oOOo0.setShowDivider(z);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooOO(@o0OOO0OO int i) {
            this.f6606o00oOOo0.setSpinnerPopupAnimationStyle(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooOO0(@NotNull o0O00 o0o00) {
            o0ooO.o00oo0O0(o0o00, "value");
            this.f6606o00oOOo0.setSpinnerPopupAnimation(o0o00);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooOOo(@NotNull Drawable drawable) {
            o0ooO.o00oo0O0(drawable, "value");
            this.f6606o00oOOo0.setSpinnerPopupBackground(drawable);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooOo(@o0OO0 int i) {
            this.f6606o00oOOo0.setSpinnerPopupHeight(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooOo0(@o0O0O0o0 int i) {
            this.f6606o00oOOo0.setBackgroundResource(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooOoO(@o0OO0 int i) {
            this.f6606o00oOOo0.setSpinnerPopupMaxHeight(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooOoo(@o0OO0 int i) {
            this.f6606o00oOOo0.setSpinnerPopupWidth(i);
            return this;
        }

        @NotNull
        public final o00oOOo0 o00ooo00(@NotNull Drawable drawable) {
            o0ooO.o00oo0O0(drawable, "value");
            this.f6606o00oOOo0.setSpinnerSelectedItemBackground(drawable);
            return this;
        }

        @NotNull
        public final o00oOOo0 o0O0o(@NotNull o00oo0O0 o00oo0o02) {
            o0ooO.o00oo0O0(o00oo0o02, "value");
            this.f6606o00oOOo0.setSpinnerOutsideTouchListener(o00oo0o02);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f6607o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final /* synthetic */ int[] f6608o00oOOoO;

        static {
            int[] iArr = new int[o0O00O0.values().length];
            try {
                iArr[o0O00O0.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o0O00O0.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o0O00O0.END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o0O00O0.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f6607o00oOOo0 = iArr;
            int[] iArr2 = new int[o0O00.values().length];
            try {
                iArr2[o0O00.DROPDOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o0O00.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[o0O00.BOUNCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f6608o00oOOoO = iArr2;
        }
    }

    /* loaded from: classes2.dex */
    public static final class o00oOo00 extends o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
        public o00oOo00() {
            super(0);
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
            invoke2();
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PowerSpinnerView powerSpinnerView = PowerSpinnerView.this;
            if (powerSpinnerView.f6575o00oo0Oo) {
                powerSpinnerView.o00oo(false);
                PowerSpinnerView.this.getSpinnerWindow().dismiss();
                PowerSpinnerView.this.f6575o00oo0Oo = false;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class o00oOo0O extends o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
        public final /* synthetic */ int $xOff;
        public final /* synthetic */ int $yOff;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo0O(int i, int i2) {
            super(0);
            this.$xOff = i;
            this.$yOff = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(PowerSpinnerView powerSpinnerView) {
            o0ooO.o00oo0O0(powerSpinnerView, "this$0");
            powerSpinnerView.getSpinnerWindow().update(powerSpinnerView.getSpinnerWidth(), powerSpinnerView.getSpinnerHeight());
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
            invoke2();
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            PowerSpinnerView powerSpinnerView = PowerSpinnerView.this;
            if (powerSpinnerView.f6575o00oo0Oo) {
                return;
            }
            powerSpinnerView.f6575o00oo0Oo = true;
            powerSpinnerView.o00oo(true);
            PowerSpinnerView.this.o00ooO00();
            PowerSpinnerView.this.getSpinnerWindow().setWidth(PowerSpinnerView.this.getSpinnerWidth());
            if (PowerSpinnerView.this.getSpinnerHeight() != 0) {
                PowerSpinnerView.this.getSpinnerWindow().setHeight(PowerSpinnerView.this.getSpinnerHeight());
            }
            PowerSpinnerView.this.getSpinnerWindow().showAsDropDown(PowerSpinnerView.this, this.$xOff, this.$yOff);
            final PowerSpinnerView powerSpinnerView2 = PowerSpinnerView.this;
            powerSpinnerView2.post(new Runnable() { // from class: o0OO0Ooo.o0O000o0
                @Override // java.lang.Runnable
                public final void run() {
                    PowerSpinnerView.o00oOo0O.invoke$lambda$0(PowerSpinnerView.this);
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public static final class o00oOoO implements View.OnTouchListener {
        public o00oOoO() {
        }

        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(@NotNull View view, @NotNull MotionEvent motionEvent) {
            o0ooO.o00oo0O0(view, "view");
            o0ooO.o00oo0O0(motionEvent, oOo000Oo.f9217o0O00o0o);
            if (motionEvent.getAction() == 4) {
                o00oo0O0 spinnerOutsideTouchListener = PowerSpinnerView.this.getSpinnerOutsideTouchListener();
                if (spinnerOutsideTouchListener != null) {
                    spinnerOutsideTouchListener.o00oOOo0(view, motionEvent);
                    return true;
                }
                return true;
            }
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerSpinnerView(@NotNull Context context) {
        super(context);
        o0ooO.o00oo0O0(context, "context");
        o0OO0o00.o00oOOoO inflate = o0OO0o00.o00oOOoO.inflate(LayoutInflater.from(getContext()), null, false);
        o0ooO.o00oo0OO(inflate, "inflate(LayoutInflater.from(context), null, false)");
        this.f6574o00oo0O0 = inflate;
        this.f6577o00oo0o0 = -1;
        this.f6576o00oo0o = new o0OO0Ooo.o00oOo00(this);
        this.f6578o00oo0oO = new o0O0o(0, 0, 0, 0, 15, null);
        this.f6605o0O0o = true;
        this.f6572o00oo = 250L;
        Context context2 = getContext();
        o0ooO.o00oo0OO(context2, "context");
        Drawable o00oOOo02 = o0OO0o0.o00oOOoO.o00oOOo0(context2, R.drawable.powerspinner_arrow);
        this.f6581o00ooO00 = o00oOOo02 != null ? o00oOOo02.mutate() : null;
        this.f6580o00ooO0 = 150L;
        this.f6579o00ooO = Integer.MIN_VALUE;
        this.f6585o00ooOO0 = true;
        this.f6584o00ooOO = o0O00O0.END;
        this.f6587o00ooOo = Integer.MIN_VALUE;
        this.f6590o00ooOoo = o0OO0o0.o00oOOoO.o00oOooO(this, 0.5f);
        this.f6592o00ooo00 = -1;
        this.f6593o00ooo0O = o0OO0o0.o00oOOoO.o00oOo0O(this, 4);
        this.f6594o00ooo0o = Integer.MIN_VALUE;
        this.f6595o00oooO = Integer.MIN_VALUE;
        this.f6596o00oooOO = Integer.MIN_VALUE;
        this.f6597o00oooOo = Integer.MIN_VALUE;
        this.f6599o00oooo0 = Integer.MIN_VALUE;
        this.f6600o00ooooO = true;
        this.f6602o0O00000 = o0O00.NORMAL;
        if (this.f6576o00oo0o instanceof RecyclerView.o00oo0OO) {
            RecyclerView spinnerRecyclerView = getSpinnerRecyclerView();
            o00oo0O<?> o00oo0o2 = this.f6576o00oo0o;
            o0ooO.o00oo0(o00oo0o2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            spinnerRecyclerView.setAdapter((RecyclerView.o00oo0OO) o00oo0o2);
        }
        this.f6573o00oo0O = new PopupWindow(inflate.body, -1, -2);
        setOnClickListener(new View.OnClickListener() { // from class: o0OO0Ooo.o00oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PowerSpinnerView.o00oo0O(PowerSpinnerView.this, view);
            }
        });
        if (getGravity() == 0) {
            setGravity(16);
        }
        Context context3 = getContext();
        if (this.f6604o0O0000o == null && (context3 instanceof o0O0O0O)) {
            setLifecycleOwner((o0O0O0O) context3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerSpinnerView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        o0ooO.o00oo0O0(context, "context");
        o0ooO.o00oo0O0(attributeSet, "attributeSet");
        o0OO0o00.o00oOOoO inflate = o0OO0o00.o00oOOoO.inflate(LayoutInflater.from(getContext()), null, false);
        o0ooO.o00oo0OO(inflate, "inflate(LayoutInflater.from(context), null, false)");
        this.f6574o00oo0O0 = inflate;
        this.f6577o00oo0o0 = -1;
        this.f6576o00oo0o = new o0OO0Ooo.o00oOo00(this);
        this.f6578o00oo0oO = new o0O0o(0, 0, 0, 0, 15, null);
        this.f6605o0O0o = true;
        this.f6572o00oo = 250L;
        Context context2 = getContext();
        o0ooO.o00oo0OO(context2, "context");
        Drawable o00oOOo02 = o0OO0o0.o00oOOoO.o00oOOo0(context2, R.drawable.powerspinner_arrow);
        this.f6581o00ooO00 = o00oOOo02 != null ? o00oOOo02.mutate() : null;
        this.f6580o00ooO0 = 150L;
        this.f6579o00ooO = Integer.MIN_VALUE;
        this.f6585o00ooOO0 = true;
        this.f6584o00ooOO = o0O00O0.END;
        this.f6587o00ooOo = Integer.MIN_VALUE;
        this.f6590o00ooOoo = o0OO0o0.o00oOOoO.o00oOooO(this, 0.5f);
        this.f6592o00ooo00 = -1;
        this.f6593o00ooo0O = o0OO0o0.o00oOOoO.o00oOo0O(this, 4);
        this.f6594o00ooo0o = Integer.MIN_VALUE;
        this.f6595o00oooO = Integer.MIN_VALUE;
        this.f6596o00oooOO = Integer.MIN_VALUE;
        this.f6597o00oooOo = Integer.MIN_VALUE;
        this.f6599o00oooo0 = Integer.MIN_VALUE;
        this.f6600o00ooooO = true;
        this.f6602o0O00000 = o0O00.NORMAL;
        if (this.f6576o00oo0o instanceof RecyclerView.o00oo0OO) {
            RecyclerView spinnerRecyclerView = getSpinnerRecyclerView();
            o00oo0O<?> o00oo0o2 = this.f6576o00oo0o;
            o0ooO.o00oo0(o00oo0o2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            spinnerRecyclerView.setAdapter((RecyclerView.o00oo0OO) o00oo0o2);
        }
        this.f6573o00oo0O = new PopupWindow(inflate.body, -1, -2);
        setOnClickListener(new View.OnClickListener() { // from class: o0OO0Ooo.o00oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PowerSpinnerView.o00oo0O(PowerSpinnerView.this, view);
            }
        });
        if (getGravity() == 0) {
            setGravity(16);
        }
        Context context3 = getContext();
        if (this.f6604o0O0000o == null && (context3 instanceof o0O0O0O)) {
            setLifecycleOwner((o0O0O0O) context3);
        }
        o00ooOO0(attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerSpinnerView(@NotNull Context context, @NotNull AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0ooO.o00oo0O0(context, "context");
        o0ooO.o00oo0O0(attributeSet, "attributeSet");
        o0OO0o00.o00oOOoO inflate = o0OO0o00.o00oOOoO.inflate(LayoutInflater.from(getContext()), null, false);
        o0ooO.o00oo0OO(inflate, "inflate(LayoutInflater.from(context), null, false)");
        this.f6574o00oo0O0 = inflate;
        this.f6577o00oo0o0 = -1;
        this.f6576o00oo0o = new o0OO0Ooo.o00oOo00(this);
        this.f6578o00oo0oO = new o0O0o(0, 0, 0, 0, 15, null);
        this.f6605o0O0o = true;
        this.f6572o00oo = 250L;
        Context context2 = getContext();
        o0ooO.o00oo0OO(context2, "context");
        Drawable o00oOOo02 = o0OO0o0.o00oOOoO.o00oOOo0(context2, R.drawable.powerspinner_arrow);
        this.f6581o00ooO00 = o00oOOo02 != null ? o00oOOo02.mutate() : null;
        this.f6580o00ooO0 = 150L;
        this.f6579o00ooO = Integer.MIN_VALUE;
        this.f6585o00ooOO0 = true;
        this.f6584o00ooOO = o0O00O0.END;
        this.f6587o00ooOo = Integer.MIN_VALUE;
        this.f6590o00ooOoo = o0OO0o0.o00oOOoO.o00oOooO(this, 0.5f);
        this.f6592o00ooo00 = -1;
        this.f6593o00ooo0O = o0OO0o0.o00oOOoO.o00oOo0O(this, 4);
        this.f6594o00ooo0o = Integer.MIN_VALUE;
        this.f6595o00oooO = Integer.MIN_VALUE;
        this.f6596o00oooOO = Integer.MIN_VALUE;
        this.f6597o00oooOo = Integer.MIN_VALUE;
        this.f6599o00oooo0 = Integer.MIN_VALUE;
        this.f6600o00ooooO = true;
        this.f6602o0O00000 = o0O00.NORMAL;
        if (this.f6576o00oo0o instanceof RecyclerView.o00oo0OO) {
            RecyclerView spinnerRecyclerView = getSpinnerRecyclerView();
            o00oo0O<?> o00oo0o2 = this.f6576o00oo0o;
            o0ooO.o00oo0(o00oo0o2, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            spinnerRecyclerView.setAdapter((RecyclerView.o00oo0OO) o00oo0o2);
        }
        this.f6573o00oo0O = new PopupWindow(inflate.body, -1, -2);
        setOnClickListener(new View.OnClickListener() { // from class: o0OO0Ooo.o00oo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PowerSpinnerView.o00oo0O(PowerSpinnerView.this, view);
            }
        });
        if (getGravity() == 0) {
            setGravity(16);
        }
        Context context3 = getContext();
        if (this.f6604o0O0000o == null && (context3 instanceof o0O0O0O)) {
            setLifecycleOwner((o0O0O0O) context3);
        }
        o00ooOO(attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpinnerWidth() {
        int i = this.f6595o00oooO;
        return i != Integer.MIN_VALUE ? i : getWidth();
    }

    public static final void o00oo0O(PowerSpinnerView powerSpinnerView, View view) {
        o0ooO.o00oo0O0(powerSpinnerView, "this$0");
        o00oooo0(powerSpinnerView, 0, 0, 3, null);
    }

    public static final void o00ooOoO(o0O000 o0o000, int i, Object obj, int i2, Object obj2) {
        o0ooO.o00oo0O0(o0o000, "$block");
        o0o000.invoke(Integer.valueOf(i), obj, Integer.valueOf(i2), obj2);
    }

    public static final void o00ooOoo(o0O00000 o0o00000, View view, MotionEvent motionEvent) {
        o0ooO.o00oo0O0(o0o00000, "$block");
        o0ooO.o00oo0O0(view, "view");
        o0ooO.o00oo0O0(motionEvent, oOo000Oo.f9217o0O00o0o);
        o0o00000.invoke(view, motionEvent);
    }

    public static /* synthetic */ void o00ooo0o(PowerSpinnerView powerSpinnerView, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        powerSpinnerView.o00ooo0O(i, i2);
    }

    public static /* synthetic */ void o00oooo0(PowerSpinnerView powerSpinnerView, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        powerSpinnerView.o00oooOo(i, i2);
    }

    public static final void o0O00000(final PowerSpinnerView powerSpinnerView) {
        o0ooO.o00oo0O0(powerSpinnerView, "this$0");
        PopupWindow popupWindow = powerSpinnerView.f6573o00oo0O;
        popupWindow.setWidth(powerSpinnerView.getWidth());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: o0OO0Ooo.o00ooO
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                PowerSpinnerView.o0O0000O(PowerSpinnerView.this);
            }
        });
        popupWindow.setTouchInterceptor(new o00oOoO());
        popupWindow.setElevation(powerSpinnerView.getSpinnerPopupElevation());
        FrameLayout frameLayout = powerSpinnerView.f6574o00oo0O0.body;
        frameLayout.setBackground(powerSpinnerView.getSpinnerPopupBackground() == null ? powerSpinnerView.getBackground() : powerSpinnerView.getSpinnerPopupBackground());
        o0O0o o0o0o = powerSpinnerView.f6578o00oo0oO;
        frameLayout.setPaddingRelative(o0o0o.f13179o00oOOoO, o0o0o.f13178o00oOOo0, o0o0o.f13180o00oOo00, o0o0o.f13181o00oOooO);
        if (powerSpinnerView.getShowDivider()) {
            o00ooO0 o00ooo02 = new o00ooO0(frameLayout.getContext(), 1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setSize(frameLayout.getWidth(), powerSpinnerView.getDividerSize());
            gradientDrawable.setColor(powerSpinnerView.getDividerColor());
            o00ooo02.o00oOoOO(gradientDrawable);
            powerSpinnerView.getSpinnerRecyclerView().addItemDecoration(o00ooo02);
        }
        int i = powerSpinnerView.f6595o00oooO;
        if (i != Integer.MIN_VALUE) {
            powerSpinnerView.f6573o00oo0O.setWidth(i);
        }
        int i2 = powerSpinnerView.f6596o00oooOO;
        if (i2 != Integer.MIN_VALUE) {
            powerSpinnerView.f6573o00oo0O.setHeight(i2);
        }
    }

    public static final void o0O0000O(PowerSpinnerView powerSpinnerView) {
        o0ooO.o00oo0O0(powerSpinnerView, "this$0");
        o00oo0 o00oo0Var = powerSpinnerView.f6571o0;
        if (o00oo0Var != null) {
            o00oo0Var.onDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setIsFocusable$lambda$14(PowerSpinnerView powerSpinnerView) {
        o0ooO.o00oo0O0(powerSpinnerView, "this$0");
        powerSpinnerView.o00ooO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnSpinnerDismissListener$lambda$13(o0OOOO.o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "$block");
        o00oooo02.invoke();
    }

    private final void setTypeArray(TypedArray typedArray) {
        int resourceId;
        int i = R.styleable.PowerSpinnerView_spinner_arrow_drawable;
        if (typedArray.hasValue(i)) {
            this.f6579o00ooO = typedArray.getResourceId(i, this.f6579o00ooO);
        }
        int i2 = R.styleable.PowerSpinnerView_spinner_arrow_show;
        if (typedArray.hasValue(i2)) {
            this.f6585o00ooOO0 = typedArray.getBoolean(i2, this.f6585o00ooOO0);
        }
        int i3 = R.styleable.PowerSpinnerView_spinner_arrow_gravity;
        if (typedArray.hasValue(i3)) {
            int integer = typedArray.getInteger(i3, this.f6584o00ooOO.getValue());
            o0O00O0 o0o00o0 = o0O00O0.START;
            if (integer != o0o00o0.getValue()) {
                o0o00o0 = o0O00O0.TOP;
                if (integer != o0o00o0.getValue()) {
                    o0o00o0 = o0O00O0.END;
                    if (integer != o0o00o0.getValue()) {
                        o0o00o0 = o0O00O0.BOTTOM;
                        if (integer != o0o00o0.getValue()) {
                            throw new IllegalArgumentException("unknown argument: spinner_arrow_gravity");
                        }
                    }
                }
            }
            this.f6584o00ooOO = o0o00o0;
        }
        int i4 = R.styleable.PowerSpinnerView_spinner_popup_top_padding;
        if (typedArray.hasValue(i4)) {
            this.f6578o00oo0oO.f13178o00oOOo0 = typedArray.getDimensionPixelSize(i4, 0);
        }
        int i5 = R.styleable.PowerSpinnerView_spinner_popup_end_padding;
        if (typedArray.hasValue(i5)) {
            this.f6578o00oo0oO.f13180o00oOo00 = typedArray.getDimensionPixelSize(i5, 0);
        }
        int i6 = R.styleable.PowerSpinnerView_spinner_popup_bottom_padding;
        if (typedArray.hasValue(i6)) {
            this.f6578o00oo0oO.f13181o00oOooO = typedArray.getDimensionPixelSize(i6, 0);
        }
        int i7 = R.styleable.PowerSpinnerView_spinner_popup_start_padding;
        if (typedArray.hasValue(i7)) {
            this.f6578o00oo0oO.f13179o00oOOoO = typedArray.getDimensionPixelSize(i7, 0);
        }
        int i8 = R.styleable.PowerSpinnerView_spinner_popup_padding;
        if (typedArray.hasValue(i8)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i8, 0);
            o0O0o o0o0o = this.f6578o00oo0oO;
            o0o0o.f13178o00oOOo0 = dimensionPixelSize;
            o0o0o.f13180o00oOo00 = dimensionPixelSize;
            o0o0o.f13181o00oOooO = dimensionPixelSize;
            o0o0o.f13179o00oOOoO = dimensionPixelSize;
        }
        int i9 = R.styleable.PowerSpinnerView_spinner_arrow_padding;
        if (typedArray.hasValue(i9)) {
            this.f6588o00ooOo0 = typedArray.getDimensionPixelSize(i9, this.f6588o00ooOo0);
        }
        int i10 = R.styleable.PowerSpinnerView_spinner_arrow_tint;
        if (typedArray.hasValue(i10)) {
            this.f6587o00ooOo = typedArray.getColor(i10, this.f6587o00ooOo);
        }
        int i11 = R.styleable.PowerSpinnerView_spinner_arrow_animate;
        if (typedArray.hasValue(i11)) {
            this.f6605o0O0o = typedArray.getBoolean(i11, this.f6605o0O0o);
        }
        int i12 = R.styleable.PowerSpinnerView_spinner_arrow_animate_duration;
        if (typedArray.hasValue(i12)) {
            this.f6572o00oo = typedArray.getInteger(i12, (int) this.f6572o00oo);
        }
        int i13 = R.styleable.PowerSpinnerView_spinner_divider_show;
        if (typedArray.hasValue(i13)) {
            this.f6589o00ooOoO = typedArray.getBoolean(i13, this.f6589o00ooOoO);
        }
        int i14 = R.styleable.PowerSpinnerView_spinner_divider_size;
        if (typedArray.hasValue(i14)) {
            this.f6590o00ooOoo = typedArray.getDimensionPixelSize(i14, this.f6590o00ooOoo);
        }
        int i15 = R.styleable.PowerSpinnerView_spinner_divider_color;
        if (typedArray.hasValue(i15)) {
            this.f6592o00ooo00 = typedArray.getColor(i15, this.f6592o00ooo00);
        }
        int i16 = R.styleable.PowerSpinnerView_spinner_popup_background;
        if (typedArray.hasValue(i16)) {
            this.f6591o00ooo0 = typedArray.getDrawable(i16);
        }
        int i17 = R.styleable.PowerSpinnerView_spinner_popup_animation;
        if (typedArray.hasValue(i17)) {
            int integer2 = typedArray.getInteger(i17, this.f6602o0O00000.getValue());
            o0O00 o0o00 = o0O00.DROPDOWN;
            if (integer2 != o0o00.getValue()) {
                o0o00 = o0O00.FADE;
                if (integer2 != o0o00.getValue()) {
                    o0o00 = o0O00.BOUNCE;
                    if (integer2 != o0o00.getValue()) {
                        o0o00 = o0O00.NORMAL;
                        if (integer2 != o0o00.getValue()) {
                            throw new IllegalArgumentException("unknown argument: spinner_popup_animation");
                        }
                    }
                }
            }
            this.f6602o0O00000 = o0o00;
        }
        int i18 = R.styleable.PowerSpinnerView_spinner_popup_animation_style;
        if (typedArray.hasValue(i18)) {
            this.f6594o00ooo0o = typedArray.getResourceId(i18, this.f6594o00ooo0o);
        }
        int i19 = R.styleable.PowerSpinnerView_spinner_popup_width;
        if (typedArray.hasValue(i19)) {
            this.f6595o00oooO = typedArray.getDimensionPixelSize(i19, this.f6595o00oooO);
        }
        int i20 = R.styleable.PowerSpinnerView_spinner_popup_height;
        if (typedArray.hasValue(i20)) {
            this.f6596o00oooOO = typedArray.getDimensionPixelSize(i20, this.f6596o00oooOO);
        }
        int i21 = R.styleable.PowerSpinnerView_spinner_popup_max_height;
        if (typedArray.hasValue(i21)) {
            this.f6597o00oooOo = typedArray.getDimensionPixelSize(i21, this.f6597o00oooOo);
        }
        int i22 = R.styleable.PowerSpinnerView_spinner_item_height;
        if (typedArray.hasValue(i22)) {
            this.f6599o00oooo0 = typedArray.getDimensionPixelSize(i22, this.f6599o00oooo0);
        }
        int i23 = R.styleable.PowerSpinnerView_spinner_selected_item_background;
        if (typedArray.hasValue(i23)) {
            this.f6598o00oooo = typedArray.getDrawable(i23);
        }
        int i24 = R.styleable.PowerSpinnerView_spinner_popup_elevation;
        if (typedArray.hasValue(i24)) {
            this.f6593o00ooo0O = typedArray.getDimensionPixelSize(i24, this.f6593o00ooo0O);
        }
        int i25 = R.styleable.PowerSpinnerView_spinner_item_array;
        if (typedArray.hasValue(i25) && (resourceId = typedArray.getResourceId(i25, Integer.MIN_VALUE)) != Integer.MIN_VALUE) {
            setItems(resourceId);
        }
        int i26 = R.styleable.PowerSpinnerView_spinner_dismiss_notified_select;
        if (typedArray.hasValue(i26)) {
            this.f6600o00ooooO = typedArray.getBoolean(i26, this.f6600o00ooooO);
        }
        int i27 = R.styleable.PowerSpinnerView_spinner_debounce_duration;
        if (typedArray.hasValue(i27)) {
            this.f6580o00ooO0 = typedArray.getInteger(i27, (int) this.f6580o00ooO0);
        }
        int i28 = R.styleable.PowerSpinnerView_spinner_preference_name;
        if (typedArray.hasValue(i28)) {
            setPreferenceName(typedArray.getString(i28));
        }
        int i29 = R.styleable.PowerSpinnerView_spinner_popup_focusable;
        if (typedArray.hasValue(i29)) {
            setIsFocusable(typedArray.getBoolean(i29, false));
        }
    }

    public final boolean getArrowAnimate() {
        return this.f6605o0O0o;
    }

    public final long getArrowAnimationDuration() {
        return this.f6572o00oo;
    }

    @Nullable
    public final Drawable getArrowDrawable() {
        return this.f6581o00ooO00;
    }

    @NotNull
    public final o0O00O0 getArrowGravity() {
        return this.f6584o00ooOO;
    }

    @o0OO0
    public final int getArrowPadding() {
        return this.f6588o00ooOo0;
    }

    @o0O0O0o0
    public final int getArrowResource() {
        return this.f6579o00ooO;
    }

    @Nullable
    public final o0OoO00O getArrowSize() {
        return this.f6586o00ooOOo;
    }

    @o0O00O
    public final int getArrowTint() {
        return this.f6587o00ooOo;
    }

    public final long getDebounceDuration() {
        return this.f6580o00ooO0;
    }

    public final boolean getDismissWhenNotifiedItemSelected() {
        return this.f6600o00ooooO;
    }

    @o0O00O
    public final int getDividerColor() {
        return this.f6592o00ooo00;
    }

    @o0OO0
    public final int getDividerSize() {
        return this.f6590o00ooOoo;
    }

    @Nullable
    public final o0O0O0O getLifecycleOwner() {
        return this.f6604o0O0000o;
    }

    @Nullable
    public final o00oo0 getOnSpinnerDismissListener() {
        return this.f6571o0;
    }

    @Nullable
    public final String getPreferenceName() {
        return this.f6603o0O0000O;
    }

    public final int getSelectedIndex() {
        return this.f6577o00oo0o0;
    }

    public final boolean getShowArrow() {
        return this.f6585o00ooOO0;
    }

    public final boolean getShowDivider() {
        return this.f6589o00ooOoO;
    }

    @NotNull
    public final <T> o00oo0O<T> getSpinnerAdapter() {
        o00oo0O<T> o00oo0o2 = (o00oo0O<T>) this.f6576o00oo0o;
        o0ooO.o00oo0(o00oo0o2, "null cannot be cast to non-null type com.skydoves.powerspinner.PowerSpinnerInterface<T of com.skydoves.powerspinner.PowerSpinnerView.getSpinnerAdapter>");
        return o00oo0o2;
    }

    @NotNull
    public final FrameLayout getSpinnerBodyView() {
        FrameLayout frameLayout = this.f6574o00oo0O0.body;
        o0ooO.o00oo0OO(frameLayout, "binding.body");
        return frameLayout;
    }

    public final int getSpinnerHeight() {
        int i = this.f6596o00oooOO;
        if (i == Integer.MIN_VALUE) {
            i = this.f6599o00oooo0 != Integer.MIN_VALUE ? o00ooO0() : getSpinnerRecyclerView().getHeight();
        }
        int i2 = this.f6597o00oooOo;
        return (i2 != Integer.MIN_VALUE && i2 <= i) ? i2 : i;
    }

    public final int getSpinnerItemHeight() {
        return this.f6599o00oooo0;
    }

    @Nullable
    public final o00oo0O0 getSpinnerOutsideTouchListener() {
        return this.f6601o00ooooo;
    }

    @NotNull
    public final o0O00 getSpinnerPopupAnimation() {
        return this.f6602o0O00000;
    }

    public final int getSpinnerPopupAnimationStyle() {
        return this.f6594o00ooo0o;
    }

    @Nullable
    public final Drawable getSpinnerPopupBackground() {
        return this.f6591o00ooo0;
    }

    @o0OO0
    public final int getSpinnerPopupElevation() {
        return this.f6593o00ooo0O;
    }

    public final int getSpinnerPopupHeight() {
        return this.f6596o00oooOO;
    }

    public final int getSpinnerPopupMaxHeight() {
        return this.f6597o00oooOo;
    }

    public final int getSpinnerPopupWidth() {
        return this.f6595o00oooO;
    }

    @NotNull
    public final RecyclerView getSpinnerRecyclerView() {
        RecyclerView recyclerView = this.f6574o00oo0O0.recyclerView;
        o0ooO.o00oo0OO(recyclerView, "binding.recyclerView");
        return recyclerView;
    }

    @Nullable
    public final Drawable getSpinnerSelectedItemBackground() {
        return this.f6598o00oooo;
    }

    @NotNull
    public final PopupWindow getSpinnerWindow() {
        return this.f6573o00oo0O;
    }

    public final void o0() {
        post(new Runnable() { // from class: o0OO0Ooo.o0
            @Override // java.lang.Runnable
            public final void run() {
                PowerSpinnerView.o0O00000(PowerSpinnerView.this);
            }
        });
    }

    @Override // androidx.lifecycle.o00oo
    public void o00oOoOO(@NotNull o0O0O0O o0o0o0o) {
        androidx.lifecycle.o0O00 lifecycle;
        o0ooO.o00oo0O0(o0o0o0o, "owner");
        super.o00oOoOO(o0o0o0o);
        o00ooO();
        o0O0O0O o0o0o0o2 = this.f6604o0O0000o;
        if (o0o0o0o2 == null || (lifecycle = o0o0o0o2.getLifecycle()) == null) {
            return;
        }
        lifecycle.o00oOooO(this);
    }

    public final void o00oo(boolean z) {
        if (this.f6605o0O0o) {
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f6581o00ooO00, FirebaseAnalytics.Param.LEVEL, z ? 0 : 10000, z ? 10000 : 0);
            ofInt.setDuration(this.f6572o00oo);
            ofInt.start();
        }
    }

    @o0O
    public final void o00ooO() {
        o00ooO0o(new o00oOo00());
    }

    public final int o00ooO0() {
        int itemCount = getSpinnerAdapter().getItemCount();
        RecyclerView.o0O00000 layoutManager = getSpinnerRecyclerView().getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((getDividerSize() + this.f6599o00oooo0) * itemCount) / ((GridLayoutManager) layoutManager).o00oOoo0();
        }
        return (getDividerSize() + this.f6599o00oooo0) * itemCount;
    }

    public final void o00ooO00() {
        PopupWindow popupWindow;
        int i;
        int i2 = this.f6594o00ooo0o;
        if (i2 != Integer.MIN_VALUE) {
            this.f6573o00oo0O.setAnimationStyle(i2);
            return;
        }
        int i3 = o00oOOoO.f6608o00oOOoO[this.f6602o0O00000.ordinal()];
        if (i3 == 1) {
            popupWindow = this.f6573o00oo0O;
            i = R.style.PowerSpinner_DropDown;
        } else if (i3 == 2) {
            popupWindow = this.f6573o00oo0O;
            i = R.style.PowerSpinner_Fade;
        } else if (i3 != 3) {
            return;
        } else {
            popupWindow = this.f6573o00oo0O;
            i = R.style.PowerSpinner_Elastic;
        }
        popupWindow.setAnimationStyle(i);
    }

    public final void o00ooO0O() {
        o00ooOo0(-1, "");
    }

    public final void o00ooO0o(o0OOOO.o00oOOo0<oO0Ooooo> o00oooo02) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f6583o00ooO0o > this.f6580o00ooO0) {
            this.f6583o00ooO0o = currentTimeMillis;
            o00oooo02.invoke();
        }
    }

    public final void o00ooOO(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.PowerSpinnerView, i, 0);
        o0ooO.o00oo0OO(obtainStyledAttributes, "context.obtainStyledAttr…fStyleAttr,\n      0\n    )");
        try {
            setTypeArray(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void o00ooOO0(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.PowerSpinnerView);
        o0ooO.o00oo0OO(obtainStyledAttributes, "context.obtainStyledAttr…yleable.PowerSpinnerView)");
        try {
            setTypeArray(obtainStyledAttributes);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean o00ooOOo() {
        return this.f6575o00oo0Oo;
    }

    public final void o00ooOo(int i) {
        this.f6576o00oo0o.o00oo0O(i);
    }

    public final void o00ooOo0(int i, @NotNull CharSequence charSequence) {
        o0ooO.o00oo0O0(charSequence, "changedText");
        this.f6577o00oo0o0 = i;
        if (!this.f6582o00ooO0O) {
            setText(charSequence);
        }
        if (this.f6600o00ooooO) {
            o00ooO();
        }
        String str = this.f6603o0O0000O;
        if (str == null || str.length() == 0) {
            return;
        }
        o00oOOoO.o00oOOo0 o00oooo02 = com.skydoves.powerspinner.o00oOOoO.f6610o00oOOo0;
        Context context = getContext();
        o0ooO.o00oo0OO(context, "context");
        o00oooo02.o00oOOo0(context).o00oOoO0(str, this.f6577o00oo0o0);
    }

    @o0OOOO0o.o00oo0O0
    @o0O
    public final void o00ooo0(int i) {
        o00ooo0o(this, i, 0, 2, null);
    }

    @o0OOOO0o.o00oo0O0
    @o0O
    public final void o00ooo00() {
        o00ooo0o(this, 0, 0, 3, null);
    }

    @o0OOOO0o.o00oo0O0
    @o0O
    public final void o00ooo0O(int i, int i2) {
        o00ooO0o(new o00oOo0O(i, i2));
    }

    @o0OOOO0o.o00oo0O0
    @o0O
    public final void o00oooO() {
        o00oooo0(this, 0, 0, 3, null);
    }

    @o0OOOO0o.o00oo0O0
    @o0O
    public final void o00oooOO(int i) {
        o00oooo0(this, i, 0, 2, null);
    }

    @o0OOOO0o.o00oo0O0
    @o0O
    public final void o00oooOo(int i, int i2) {
        RecyclerView.o00oo0OO adapter = getSpinnerRecyclerView().getAdapter();
        if (adapter == null) {
            return;
        }
        if (this.f6575o00oo0Oo || adapter.getItemCount() <= 0) {
            o00ooO();
        } else {
            o00ooo0O(i, i2);
        }
    }

    public final void o00oooo(Drawable drawable) {
        if (!getShowArrow()) {
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            o0ooO.o00oo0OO(mutate, "wrap(it).mutate()");
            mutate.invalidateSelf();
            if (getArrowTint() != Integer.MIN_VALUE) {
                o0O0O0Oo.o00oOOoO.o00oOoO0(mutate, getArrowTint());
            }
        }
        int i = o00oOOoO.f6607o00oOOo0[getArrowGravity().ordinal()];
        if (i == 1) {
            setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i == 2) {
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable, (Drawable) null, (Drawable) null);
        } else if (i == 3) {
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else if (i != 4) {
        } else {
            setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        }
    }

    public final void o00ooooO() {
        Drawable drawable = null;
        if (getArrowResource() != Integer.MIN_VALUE) {
            Context context = getContext();
            o0ooO.o00oo0OO(context, "context");
            Drawable o00oOOo02 = o0OO0o0.o00oOOoO.o00oOOo0(context, getArrowResource());
            this.f6581o00ooO00 = o00oOOo02 != null ? o00oOOo02.mutate() : null;
        }
        setCompoundDrawablePadding(getArrowPadding());
        o0OoO00O arrowSize = getArrowSize();
        if (arrowSize != null) {
            Drawable drawable2 = this.f6581o00ooO00;
            if (drawable2 != null) {
                Context context2 = getContext();
                o0ooO.o00oo0OO(context2, "context");
                drawable = o0OO0o0.o00oOo0O.o00oOOo0(drawable2, context2, arrowSize);
            }
            this.f6581o00ooO00 = drawable;
        }
        o00oooo(this.f6581o00ooO00);
    }

    public final void o00ooooo() {
        if (this.f6576o00oo0o.getItemCount() > 0) {
            String str = this.f6603o0O0000O;
            if (str == null || str.length() == 0) {
                return;
            }
            o00oOOoO.o00oOOo0 o00oooo02 = com.skydoves.powerspinner.o00oOOoO.f6610o00oOOo0;
            Context context = getContext();
            o0ooO.o00oo0OO(context, "context");
            if (o00oooo02.o00oOOo0(context).o00oOo0o(str) != -1) {
                o00oo0O<?> o00oo0o2 = this.f6576o00oo0o;
                Context context2 = getContext();
                o0ooO.o00oo0OO(context2, "context");
                o00oo0o2.o00oo0O(o00oooo02.o00oOOo0(context2).o00oOo0o(str));
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        o0();
        o00ooooO();
        o00ooooo();
    }

    public final void setArrowAnimate(boolean z) {
        this.f6605o0O0o = z;
    }

    public final void setArrowAnimationDuration(long j) {
        this.f6572o00oo = j;
    }

    public final void setArrowDrawable(@Nullable Drawable drawable) {
        this.f6581o00ooO00 = drawable;
    }

    public final void setArrowGravity(@NotNull o0O00O0 o0o00o0) {
        o0ooO.o00oo0O0(o0o00o0, "value");
        this.f6584o00ooOO = o0o00o0;
        o00ooooO();
    }

    public final void setArrowPadding(@o0OO0 int i) {
        this.f6588o00ooOo0 = i;
        o00ooooO();
    }

    public final void setArrowResource(@o0O0O0o0 int i) {
        this.f6579o00ooO = i;
        o00ooooO();
    }

    public final void setArrowSize(@Nullable o0OoO00O o0ooo00o) {
        this.f6586o00ooOOo = o0ooo00o;
        o00ooooO();
    }

    public final void setArrowTint(@o0O00O int i) {
        this.f6587o00ooOo = i;
        o00ooooO();
    }

    public final void setDisableChangeTextWhenNotified(boolean z) {
        this.f6582o00ooO0O = z;
    }

    public final void setDismissWhenNotifiedItemSelected(boolean z) {
        this.f6600o00ooooO = z;
    }

    public final void setDividerColor(@o0O00O int i) {
        this.f6592o00ooo00 = i;
        o0();
    }

    public final void setDividerSize(@o0OO0 int i) {
        this.f6590o00ooOoo = i;
        o0();
    }

    public final void setIsFocusable(boolean z) {
        this.f6573o00oo0O.setFocusable(z);
        this.f6571o0 = new o00oo0() { // from class: o0OO0Ooo.o0O000
            @Override // o0OO0Ooo.o00oo0
            public final void onDismiss() {
                PowerSpinnerView.setIsFocusable$lambda$14(PowerSpinnerView.this);
            }
        };
    }

    public final void setItems(@o0OoOoOo int i) {
        if (this.f6576o00oo0o instanceof o0OO0Ooo.o00oOo00) {
            String[] stringArray = getContext().getResources().getStringArray(i);
            o0ooO.o00oo0OO(stringArray, "context.resources.getStringArray(resource)");
            setItems(o0O000O.oooO0O0O(stringArray));
        }
    }

    public final <T> void setItems(@NotNull List<? extends T> list) {
        o0ooO.o00oo0O0(list, "itemList");
        o00oo0O<?> o00oo0o2 = this.f6576o00oo0o;
        o0ooO.o00oo0(o00oo0o2, "null cannot be cast to non-null type com.skydoves.powerspinner.PowerSpinnerInterface<T of com.skydoves.powerspinner.PowerSpinnerView.setItems>");
        o00oo0o2.o00oOoOO(list);
    }

    public final void setLifecycleOwner(@Nullable o0O0O0O o0o0o0o) {
        androidx.lifecycle.o0O00 lifecycle;
        androidx.lifecycle.o0O00 lifecycle2;
        o0O0O0O o0o0o0o2 = this.f6604o0O0000o;
        if (o0o0o0o2 != null && (lifecycle2 = o0o0o0o2.getLifecycle()) != null) {
            lifecycle2.o00oOooO(this);
        }
        this.f6604o0O0000o = o0o0o0o;
        if (o0o0o0o == null || (lifecycle = o0o0o0o.getLifecycle()) == null) {
            return;
        }
        lifecycle.o00oOOo0(this);
    }

    public final void setOnSpinnerDismissListener(@Nullable o00oo0 o00oo0Var) {
        this.f6571o0 = o00oo0Var;
    }

    public final /* synthetic */ void setOnSpinnerDismissListener(final o0OOOO.o00oOOo0 o00oooo02) {
        o0ooO.o00oo0O0(o00oooo02, "block");
        this.f6571o0 = new o00oo0() { // from class: o0OO0Ooo.o0O0000O
            @Override // o0OO0Ooo.o00oo0
            public final void onDismiss() {
                PowerSpinnerView.setOnSpinnerDismissListener$lambda$13(o00oOOo0.this);
            }
        };
    }

    public final <T> void setOnSpinnerItemSelectedListener(@NotNull o00oo0OO<T> o00oo0oo) {
        o0ooO.o00oo0O0(o00oo0oo, "onSpinnerItemSelectedListener");
        o00oo0O<?> o00oo0o2 = this.f6576o00oo0o;
        o0ooO.o00oo0(o00oo0o2, "null cannot be cast to non-null type com.skydoves.powerspinner.PowerSpinnerInterface<T of com.skydoves.powerspinner.PowerSpinnerView.setOnSpinnerItemSelectedListener>");
        o00oo0o2.o00oOo0o(o00oo0oo);
    }

    public final /* synthetic */ void setOnSpinnerItemSelectedListener(final o0O000 o0o000) {
        o0ooO.o00oo0O0(o0o000, "block");
        o00oo0O<?> o00oo0o2 = this.f6576o00oo0o;
        o0ooO.o00oo0(o00oo0o2, "null cannot be cast to non-null type com.skydoves.powerspinner.PowerSpinnerInterface<T of com.skydoves.powerspinner.PowerSpinnerView.setOnSpinnerItemSelectedListener>");
        o00oo0o2.o00oOo0o(new o00oo0OO() { // from class: o0OO0Ooo.o0O00000
            @Override // o0OO0Ooo.o00oo0OO
            public final void o00oOOo0(int i, Object obj, int i2, Object obj2) {
                PowerSpinnerView.o00ooOoO(o0OOOO.o0O000.this, i, obj, i2, obj2);
            }
        });
    }

    public final /* synthetic */ void setOnSpinnerOutsideTouchListener(final o0O00000 o0o00000) {
        o0ooO.o00oo0O0(o0o00000, "block");
        this.f6601o00ooooo = new o00oo0O0() { // from class: o0OO0Ooo.o00ooO0
            @Override // o0OO0Ooo.o00oo0O0
            public final void o00oOOo0(View view, MotionEvent motionEvent) {
                PowerSpinnerView.o00ooOoo(o0OOOO.o0O00000.this, view, motionEvent);
            }
        };
    }

    public final void setPreferenceName(@Nullable String str) {
        this.f6603o0O0000O = str;
        o00ooooo();
    }

    public final void setShowArrow(boolean z) {
        this.f6585o00ooOO0 = z;
        o00ooooO();
    }

    public final void setShowDivider(boolean z) {
        this.f6589o00ooOoO = z;
        o0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void setSpinnerAdapter(@NotNull o00oo0O<T> o00oo0o2) {
        o0ooO.o00oo0O0(o00oo0o2, "powerSpinnerInterface");
        this.f6576o00oo0o = o00oo0o2;
        if (o00oo0o2 instanceof RecyclerView.o00oo0OO) {
            RecyclerView spinnerRecyclerView = getSpinnerRecyclerView();
            o00oo0O<?> o00oo0o3 = this.f6576o00oo0o;
            o0ooO.o00oo0(o00oo0o3, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<*>");
            spinnerRecyclerView.setAdapter((RecyclerView.o00oo0OO) o00oo0o3);
        }
    }

    public final void setSpinnerItemHeight(int i) {
        this.f6599o00oooo0 = i;
    }

    public final void setSpinnerOutsideTouchListener(@Nullable o00oo0O0 o00oo0o02) {
        this.f6601o00ooooo = o00oo0o02;
    }

    public final void setSpinnerPopupAnimation(@NotNull o0O00 o0o00) {
        o0ooO.o00oo0O0(o0o00, "<set-?>");
        this.f6602o0O00000 = o0o00;
    }

    public final void setSpinnerPopupAnimationStyle(int i) {
        this.f6594o00ooo0o = i;
    }

    public final void setSpinnerPopupBackground(@Nullable Drawable drawable) {
        this.f6591o00ooo0 = drawable;
        o0();
    }

    public final void setSpinnerPopupElevation(@o0OO0 int i) {
        this.f6593o00ooo0O = i;
        o0();
    }

    public final void setSpinnerPopupHeight(int i) {
        this.f6596o00oooOO = i;
    }

    public final void setSpinnerPopupMaxHeight(int i) {
        this.f6597o00oooOo = i;
    }

    public final void setSpinnerPopupWidth(int i) {
        this.f6595o00oooO = i;
    }

    public final void setSpinnerSelectedItemBackground(@Nullable Drawable drawable) {
        this.f6598o00oooo = drawable;
    }
}
