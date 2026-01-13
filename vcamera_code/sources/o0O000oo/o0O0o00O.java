package o0O000oo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o00oOooO.o0OO0oO;
import o0O00.o00oo0O;
import o0O000oo.o00oOOoO;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OOO0OO;
import o0O000oo.o0OOo000;
import o0ooOoOO.ooOOOOoo;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class o0O0o00O {

    /* renamed from: o0  reason: collision with root package name */
    public static ThreadLocal<Rect> f10628o0 = null;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f10629o00oOOo0 = "ViewCompat";
    @Deprecated

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10630o00oOOoO = 0;
    @Deprecated

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10631o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f10632o00oOo0O = 0;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f10633o00oOo0o = 1;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f10634o00oOoO = 4;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f10635o00oOoO0 = 2;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f10636o00oOoOO = 0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f10637o00oOoOo = 1;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f10638o00oOoo0 = 2;
    @Deprecated

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f10639o00oOooO = 2;
    @Deprecated

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f10640o00oOooo = 0;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f10641o00oo = 0;
    @Deprecated

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f10642o00oo0 = 2;
    @Deprecated

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f10643o00oo00O = 1;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f10644o00oo0O = 2;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f10645o00oo0O0 = 1;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f10646o00oo0OO = 0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f10647o00oo0Oo = 3;
    @Deprecated

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f10648o00oo0o = -16777216;
    @Deprecated

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f10649o00oo0o0 = 16777215;
    @Deprecated

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f10650o00oo0oO = 16;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f10651o00ooO = 1;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f10652o00ooO0 = 2;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f10653o00ooO00 = 1;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f10654o00ooO0O = 0;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f10655o00ooO0o = 1;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f10656o00ooOO = 4;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f10657o00ooOO0 = 2;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f10658o00ooOOo = 8;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f10659o00ooOo = 32;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f10660o00ooOo0 = 16;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public static Field f10662o00ooOoo = null;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public static Field f10663o00ooo0 = null;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public static boolean f10664o00ooo00 = false;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public static boolean f10665o00ooo0O = false;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public static Method f10666o00ooo0o = null;

    /* renamed from: o00oooO  reason: collision with root package name */
    public static Method f10667o00oooO = null;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public static boolean f10668o00oooOO = false;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public static WeakHashMap<View, String> f10669o00oooOo = null;

    /* renamed from: o00oooo  reason: collision with root package name */
    public static Method f10670o00oooo = null;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static Field f10672o00ooooO = null;
    @Deprecated

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f10677o0O0o = 16777216;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public static final AtomicInteger f10661o00ooOoO = new AtomicInteger(1);

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static WeakHashMap<View, o0OO0oO0> f10671o00oooo0 = null;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static boolean f10673o00ooooo = false;

    /* renamed from: o0O00000  reason: collision with root package name */
    public static final int[] f10674o0O00000 = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: o0O0000O  reason: collision with root package name */
    public static final o0O0OO f10675o0O0000O = new o0O0OO() { // from class: o0O000oo.o0O0o00
        @Override // o0O000oo.o0O0OO
        public final o00oo00O onReceiveContent(o00oo00O o00oo00o) {
            return o0O0o00O.o00oOOo0(o00oo00o);
        }
    };

    /* renamed from: o0O0000o  reason: collision with root package name */
    public static final o00oOoO f10676o0O0000o = new o00oOoO();

    @o00oOooO.o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o0 {
        private o0() {
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(@o00oOooO.oo0oO0 View view) {
            view.cancelDragAndDrop();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo0O(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO ClipData clipData, @o00oOooO.oo0oO0 View.DragShadowBuilder dragShadowBuilder, @o00oOooO.o0OO00OO Object obj, int i) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0o(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooO(@o00oOooO.oo0oO0 View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o00oo00O<Boolean> {
        public o00oOOo0(int i, Class cls, int i2) {
            super(i, cls, 0, i2);
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        @o00oOooO.o0OOooO0(28)
        /* renamed from: o00oOoOO */
        public Boolean o00oOooO(@o00oOooO.oo0oO0 View view) {
            return Boolean.valueOf(o0O0000O.o00oOooO(view));
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        @o00oOooO.o0OOooO0(28)
        /* renamed from: o00oOoOo */
        public void o00oOo0O(@o00oOooO.oo0oO0 View view, Boolean bool) {
            o0O0000O.o00oOoOO(view, bool.booleanValue());
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        /* renamed from: o00oOoo0 */
        public boolean o00oOoO(Boolean bool, Boolean bool2) {
            return !o00oOOo0(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO extends o00oo00O<CharSequence> {
        public o00oOOoO(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        @o00oOooO.o0OOooO0(28)
        /* renamed from: o00oOoOO */
        public CharSequence o00oOooO(View view) {
            return o0O0000O.o00oOOoO(view);
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        @o00oOooO.o0OOooO0(28)
        /* renamed from: o00oOoOo */
        public void o00oOo0O(View view, CharSequence charSequence) {
            o0O0000O.o00oOoO(view, charSequence);
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        /* renamed from: o00oOoo0 */
        public boolean o00oOoO(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o00oo00O<CharSequence> {
        public o00oOo00(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        @o00oOooO.o0OOooO0(30)
        /* renamed from: o00oOoOO */
        public CharSequence o00oOooO(View view) {
            return o0O000O.o00oOOo0(view);
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        @o00oOooO.o0OOooO0(30)
        /* renamed from: o00oOoOo */
        public void o00oOo0O(View view, CharSequence charSequence) {
            o0O000O.o00oOo00(view, charSequence);
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        /* renamed from: o00oOoo0 */
        public boolean o00oOoO(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo0O extends o00oo00O<Boolean> {
        public o00oOo0O(int i, Class cls, int i2) {
            super(i, cls, 0, i2);
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        @o00oOooO.o0OOooO0(28)
        /* renamed from: o00oOoOO */
        public Boolean o00oOooO(View view) {
            return Boolean.valueOf(o0O0000O.o00oOo00(view));
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        @o00oOooO.o0OOooO0(28)
        /* renamed from: o00oOoOo */
        public void o00oOo0O(View view, Boolean bool) {
            o0O0000O.o00oOoO0(view, bool.booleanValue());
        }

        @Override // o0O000oo.o0O0o00O.o00oo00O
        /* renamed from: o00oOoo0 */
        public boolean o00oOoO(Boolean bool, Boolean bool2) {
            return !o00oOOo0(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final WeakHashMap<View, Boolean> f10678o00oo0O0 = new WeakHashMap<>();

        @o00oOooO.o0OOooO0(19)
        public void o00oOOo0(View view) {
            this.f10678o00oo0O0.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (o0O0o.o00oOOoO(view)) {
                o00oOo00(view);
            }
        }

        @o00oOooO.o0OOooO0(19)
        public final void o00oOOoO(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                o0O0o00O.o0O0o00(view, z2 ? 16 : 32);
                this.f10678o00oo0O0.put(view, Boolean.valueOf(z2));
            }
        }

        @o00oOooO.o0OOooO0(19)
        public final void o00oOo00(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @o00oOooO.o0OOooO0(19)
        public final void o00oOo0O(View view) {
            o00oo0OO.o00oo0OO(view.getViewTreeObserver(), this);
        }

        @o00oOooO.o0OOooO0(19)
        public void o00oOooO(View view) {
            this.f10678o00oo0O0.remove(view);
            view.removeOnAttachStateChangeListener(this);
            o00oOo0O(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @o00oOooO.o0OOooO0(19)
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @o00oOooO.o0OOooO0(19)
        public void onViewAttachedToWindow(View view) {
            o00oOo00(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    @o00oOooO.o0OOooO0(20)
    /* loaded from: classes.dex */
    public static class o00oo {
        private o00oo() {
        }

        @o00oOooO.o0O0O0Oo
        public static WindowInsets o00oOOo0(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @o00oOooO.o0O0O0Oo
        public static WindowInsets o00oOOoO(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(View view) {
            view.requestApplyInsets();
        }
    }

    @o00oOooO.o0OOooO0(15)
    /* loaded from: classes.dex */
    public static class o00oo0 {
        private o00oo0() {
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOo0(@o00oOooO.oo0oO0 View view) {
            return view.hasOnClickListeners();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo00O<T> {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final int f10679o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Class<T> f10680o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f10681o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final int f10682o00oOooO;

        public o00oo00O(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        public o00oo00O(int i, Class<T> cls, int i2, int i3) {
            this.f10679o00oOOo0 = i;
            this.f10680o00oOOoO = cls;
            this.f10682o00oOooO = i2;
            this.f10681o00oOo00 = i3;
        }

        public boolean o00oOOo0(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean o00oOOoO() {
            return true;
        }

        public final boolean o00oOo00() {
            return Build.VERSION.SDK_INT >= this.f10681o00oOo00;
        }

        public abstract void o00oOo0O(View view, T t);

        public T o00oOo0o(View view) {
            if (o00oOo00()) {
                return o00oOooO(view);
            }
            if (o00oOOoO()) {
                T t = (T) view.getTag(this.f10679o00oOOo0);
                if (this.f10680o00oOOoO.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        public boolean o00oOoO(T t, T t2) {
            return !t2.equals(t);
        }

        public void o00oOoO0(View view, T t) {
            if (o00oOo00()) {
                o00oOo0O(view, t);
            } else if (o00oOOoO() && o00oOoO(o00oOo0o(view), t)) {
                o0O0o00O.o00ooOO0(view);
                view.setTag(this.f10679o00oOOo0, t);
                o0O0o00O.o0O0o00(view, this.f10682o00oOooO);
            }
        }

        public abstract T o00oOooO(View view);
    }

    @o00oOooO.o0OOooO0(18)
    /* loaded from: classes.dex */
    public static class o00oo0O {
        private o00oo0O() {
        }

        @o00oOooO.o0O0O0Oo
        public static Rect o00oOOo0(@o00oOooO.oo0oO0 View view) {
            return view.getClipBounds();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(@o00oOooO.oo0oO0 View view) {
            return view.isInLayout();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(@o00oOooO.oo0oO0 View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    @o00oOooO.o0OOooO0(17)
    /* loaded from: classes.dex */
    public static class o00oo0O0 {
        private o00oo0O0() {
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0() {
            return View.generateViewId();
        }

        @o00oOooO.o0O0O0Oo
        public static Display o00oOOoO(@o00oOooO.oo0oO0 View view) {
            return view.getDisplay();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo00(View view) {
            return view.getLabelFor();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo0O(View view) {
            return view.getPaddingEnd();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo0o(View view) {
            return view.getPaddingStart();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoO(View view, int i) {
            view.setLabelFor(i);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOoO0(View view) {
            return view.isPaddingRelative();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoOO(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoOo(View view, int i) {
            view.setLayoutDirection(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoo0(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOooO(View view) {
            return view.getLayoutDirection();
        }
    }

    @o00oOooO.o0OOooO0(16)
    /* loaded from: classes.dex */
    public static class o00oo0OO {
        private o00oo0OO() {
        }

        @o00oOooO.o0O0O0Oo
        public static AccessibilityNodeProvider o00oOOo0(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(View view) {
            return view.getFitsSystemWindows();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo00(View view) {
            return view.getImportantForAccessibility();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo0O(View view) {
            return view.getMinimumWidth();
        }

        @o00oOooO.o0O0O0Oo
        public static ViewParent o00oOo0o(View view) {
            return view.getParentForAccessibility();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOoO(View view) {
            return view.hasOverlappingRendering();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOoO0(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOoOO(View view) {
            return view.hasTransientState();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOoOo(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoo0(View view) {
            view.postInvalidateOnAnimation();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOooO(View view) {
            return view.getMinimumHeight();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooo(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo00O(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0O(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0O0(View view) {
            view.requestFitSystemWindows();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0OO(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0Oo(View view, boolean z) {
            view.setHasTransientState(z);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0o0(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    @o00oOooO.o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00ooO {
        private o00ooO() {
        }

        @o00oOooO.o0OO00OO
        public static o0OOo000 o00oOOo0(@o00oOooO.oo0oO0 View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            o0OOo000 o00ooo02 = o0OOo000.o00ooo0(rootWindowInsets);
            o00ooo02.o00ooOoO(o00ooo02);
            o00ooo02.o00oOooO(view.getRootView());
            return o00ooo02;
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOOoO(@o00oOooO.oo0oO0 View view) {
            return view.getScrollIndicators();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(@o00oOooO.oo0oO0 View view, int i) {
            view.setScrollIndicators(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooO(@o00oOooO.oo0oO0 View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    @o00oOooO.o0OOooO0(21)
    /* loaded from: classes.dex */
    public static class o00ooO0 {

        /* loaded from: classes.dex */
        public class o00oOOo0 implements View.OnApplyWindowInsetsListener {

            /* renamed from: o00oOOo0  reason: collision with root package name */
            public o0OOo000 f10683o00oOOo0 = null;

            /* renamed from: o00oOOoO  reason: collision with root package name */
            public final /* synthetic */ View f10684o00oOOoO;

            /* renamed from: o00oOo00  reason: collision with root package name */
            public final /* synthetic */ o0ooO f10685o00oOo00;

            public o00oOOo0(View view, o0ooO o0ooo) {
                this.f10684o00oOOoO = view;
                this.f10685o00oOo00 = o0ooo;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                o0OOo000 o00ooo0O2 = o0OOo000.o00ooo0O(windowInsets, view);
                int i = Build.VERSION.SDK_INT;
                if (i < 30) {
                    o00ooO0.o00oOOo0(windowInsets, this.f10684o00oOOoO);
                    if (o00ooo0O2.equals(this.f10683o00oOOo0)) {
                        return this.f10685o00oOo00.onApplyWindowInsets(view, o00ooo0O2).o00ooo00();
                    }
                }
                this.f10683o00oOOo0 = o00ooo0O2;
                o0OOo000 onApplyWindowInsets = this.f10685o00oOo00.onApplyWindowInsets(view, o00ooo0O2);
                if (i >= 30) {
                    return onApplyWindowInsets.o00ooo00();
                }
                o0O0o00O.o0O0oOO0(view);
                return onApplyWindowInsets.o00ooo00();
            }
        }

        private o00ooO0() {
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(@o00oOooO.oo0oO0 WindowInsets windowInsets, @o00oOooO.oo0oO0 View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @o00oOooO.o0O0O0Oo
        public static o0OOo000 o00oOOoO(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 Rect rect) {
            WindowInsets o00ooo002 = o0ooo000.o00ooo00();
            if (o00ooo002 != null) {
                return o0OOo000.o00ooo0O(view.computeSystemWindowInsets(o00ooo002, rect), view);
            }
            rect.setEmpty();
            return o0ooo000;
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo00(@o00oOooO.oo0oO0 View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo0O(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo0o(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        @o00oOooO.o0O0O0Oo
        public static PorterDuff.Mode o00oOoO(View view) {
            return view.getBackgroundTintMode();
        }

        @o00oOooO.o0O0O0Oo
        public static ColorStateList o00oOoO0(View view) {
            return view.getBackgroundTintList();
        }

        @o00oOooO.o0O0O0Oo
        public static float o00oOoOO(View view) {
            return view.getElevation();
        }

        @o00oOooO.o0O0O0Oo
        @o00oOooO.o0OO00OO
        public static o0OOo000 o00oOoOo(@o00oOooO.oo0oO0 View view) {
            return o0OOo000.o00oOOo0.o00oOOo0(view);
        }

        @o00oOooO.o0O0O0Oo
        public static String o00oOoo0(View view) {
            return view.getTransitionName();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOooO(@o00oOooO.oo0oO0 View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        @o00oOooO.o0O0O0Oo
        public static float o00oOooo(View view) {
            return view.getTranslationZ();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo(View view, float f) {
            view.setTranslationZ(f);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oo0(View view) {
            return view.hasNestedScrollingParent();
        }

        @o00oOooO.o0O0O0Oo
        public static float o00oo00O(@o00oOooO.oo0oO0 View view) {
            return view.getZ();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0O(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oo0O0(View view) {
            return view.isNestedScrollingEnabled();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oo0OO(View view) {
            return view.isImportantForAccessibility();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0Oo(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0o(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0o0(View view, float f) {
            view.setElevation(f);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0oO(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO o0ooO o0ooo) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, o0ooo);
            }
            if (o0ooo == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new o00oOOo0(view, o0ooo));
            }
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00ooO0(View view, int i) {
            return view.startNestedScroll(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00ooO00(@o00oOooO.oo0oO0 View view, float f) {
            view.setZ(f);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00ooO0O(View view) {
            view.stopNestedScroll();
        }

        @o00oOooO.o0O0O0Oo
        public static void o0O0o(View view, String str) {
            view.setTransitionName(str);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O00 {
    }

    @o00oOooO.o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o0O000 {
        private o0O000() {
        }

        @o00oOooO.o0O0O0Oo
        public static View.AccessibilityDelegate o00oOOo0(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        @o00oOooO.o0O0O0Oo
        public static List<Rect> o00oOOoO(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 Context context, @o00oOooO.oo0oO0 int[] iArr, @o00oOooO.o0OO00OO AttributeSet attributeSet, @o00oOooO.oo0oO0 TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooO(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @o00oOooO.o0OOooO0(26)
    /* loaded from: classes.dex */
    public static class o0O00000 {
        private o0O00000() {
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(@o00oOooO.oo0oO0 View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOOoO(View view) {
            return view.getImportantForAutofill();
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOo00(@o00oOooO.oo0oO0 View view) {
            return view.getNextClusterForwardId();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo0O(@o00oOooO.oo0oO0 View view) {
            return view.isFocusedByDefault();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo0o(View view) {
            return view.isImportantForAutofill();
        }

        @o00oOooO.o0O0O0Oo
        public static View o00oOoO(@o00oOooO.oo0oO0 View view, View view2, int i) {
            return view.keyboardNavigationClusterSearch(view2, i);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOoO0(@o00oOooO.oo0oO0 View view) {
            return view.isKeyboardNavigationCluster();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOoOO(@o00oOooO.oo0oO0 View view) {
            return view.restoreDefaultFocus();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoOo(@o00oOooO.oo0oO0 View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoo0(@o00oOooO.oo0oO0 View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOooO(@o00oOooO.oo0oO0 View view) {
            return view.hasExplicitFocusable();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOooo(View view, int i) {
            view.setImportantForAutofill(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo00O(@o00oOooO.oo0oO0 View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oo0OO(@o00oOooO.oo0oO0 View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @o00oOooO.o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o0O0000O {
        private o0O0000O() {
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 final o0O00O0o o0o00o0o) {
            int i = R.id.tag_unhandled_key_listeners;
            androidx.collection.o00ooO0 o00ooo02 = (androidx.collection.o00ooO0) view.getTag(i);
            if (o00ooo02 == null) {
                o00ooo02 = new androidx.collection.o00ooO0();
                view.setTag(i, o00ooo02);
            }
            Objects.requireNonNull(o0o00o0o);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: o0O000oo.o0O0o0
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return o0O0o00O.o0O00O0o.this.onUnhandledKeyEvent(view2, keyEvent);
                }
            };
            o00ooo02.put(o0o00o0o, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @o00oOooO.o0O0O0Oo
        public static CharSequence o00oOOoO(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo00(View view) {
            return view.isAccessibilityHeading();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0O(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0O00O0o o0o00o0o) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            androidx.collection.o00ooO0 o00ooo02 = (androidx.collection.o00ooO0) view.getTag(R.id.tag_unhandled_key_listeners);
            if (o00ooo02 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) o00ooo02.get(o0o00o0o)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @o00oOooO.o0O0O0Oo
        public static <T> T o00oOo0o(View view, int i) {
            return (T) view.requireViewById(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoO(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoO0(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoOO(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOooO(View view) {
            return view.isScreenReaderFocusable();
        }
    }

    @o00oOooO.o0OOooO0(30)
    /* loaded from: classes.dex */
    public static class o0O000O {
        private o0O000O() {
        }

        @o00oOooO.o0O0O0Oo
        public static CharSequence o00oOOo0(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        @o00oOooO.o0OO00OO
        public static oO000O0 o00oOOoO(@o00oOooO.oo0oO0 View view) {
            WindowInsetsController windowInsetsController;
            windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new oO000O0(windowInsetsController);
            }
            return null;
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O000Oo {
    }

    @Retention(RetentionPolicy.SOURCE)
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O000o0 {
    }

    @Retention(RetentionPolicy.SOURCE)
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O00O {
    }

    @Retention(RetentionPolicy.SOURCE)
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O00O0 {
    }

    /* loaded from: classes.dex */
    public interface o0O00O0o {
        boolean onUnhandledKeyEvent(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 KeyEvent keyEvent);
    }

    @Retention(RetentionPolicy.SOURCE)
    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface o0O00OO {
    }

    /* loaded from: classes.dex */
    public static class o0O00OOO {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final ArrayList<WeakReference<View>> f10686o00oOooO = new ArrayList<>();
        @o00oOooO.o0OO00OO

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public WeakHashMap<View, Boolean> f10687o00oOOo0 = null;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f10688o00oOOoO = null;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public WeakReference<KeyEvent> f10689o00oOo00 = null;

        public static o0O00OOO o00oOOo0(View view) {
            int i = R.id.tag_unhandled_key_event_manager;
            o0O00OOO o0o00ooo = (o0O00OOO) view.getTag(i);
            if (o0o00ooo == null) {
                o0O00OOO o0o00ooo2 = new o0O00OOO();
                view.setTag(i, o0o00ooo2);
                return o0o00ooo2;
            }
            return o0o00ooo;
        }

        public static void o00oOoO(View view) {
            ArrayList<WeakReference<View>> arrayList = f10686o00oOooO;
            synchronized (arrayList) {
                Iterator<WeakReference<View>> it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next().get() == view) {
                        return;
                    }
                }
                f10686o00oOooO.add(new WeakReference<>(view));
            }
        }

        public static void o00oOoOO(View view) {
            synchronized (f10686o00oOooO) {
                int i = 0;
                while (true) {
                    ArrayList<WeakReference<View>> arrayList = f10686o00oOooO;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (arrayList.get(i).get() == view) {
                        arrayList.remove(i);
                        return;
                    }
                    i++;
                }
            }
        }

        public boolean o00oOOoO(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                o00oOoO0();
            }
            View o00oOo002 = o00oOo00(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (o00oOo002 != null && !KeyEvent.isModifierKey(keyCode)) {
                    o00oOooO().put(keyCode, new WeakReference<>(o00oOo002));
                }
            }
            return o00oOo002 != null;
        }

        @o00oOooO.o0OO00OO
        public final View o00oOo00(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f10687o00oOOo0;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View o00oOo002 = o00oOo00(viewGroup.getChildAt(childCount), keyEvent);
                        if (o00oOo002 != null) {
                            return o00oOo002;
                        }
                    }
                }
                if (o00oOo0O(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final boolean o00oOo0O(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((o0O00O0o) arrayList.get(size)).onUnhandledKeyEvent(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        public boolean o00oOo0o(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f10689o00oOo00;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f10689o00oOo00 = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> o00oOooO2 = o00oOooO();
                if (keyEvent.getAction() == 1 && (indexOfKey = o00oOooO2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = o00oOooO2.valueAt(indexOfKey);
                    o00oOooO2.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = o00oOooO2.get(keyEvent.getKeyCode());
                }
                if (weakReference2 != null) {
                    View view = weakReference2.get();
                    if (view != null && o0O0o00O.o0O0OOoo(view)) {
                        o00oOo0O(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        public final void o00oOoO0() {
            WeakHashMap<View, Boolean> weakHashMap = this.f10687o00oOOo0;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = f10686o00oOooO;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.f10687o00oOOo0 == null) {
                    this.f10687o00oOOo0 = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = f10686o00oOooO;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.f10687o00oOOo0.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f10687o00oOOo0.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        public final SparseArray<WeakReference<View>> o00oOooO() {
            if (this.f10688o00oOOoO == null) {
                this.f10688o00oOOoO = new SparseArray<>();
            }
            return this.f10688o00oOOoO;
        }
    }

    @o00oOooO.o0OOooO0(19)
    /* loaded from: classes.dex */
    public static class o0O0o {
        private o0O0o() {
        }

        @o00oOooO.o0O0O0Oo
        public static int o00oOOo0(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(@o00oOooO.oo0oO0 View view) {
            return view.isAttachedToWindow();
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOo00(@o00oOooO.oo0oO0 View view) {
            return view.isLaidOut();
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0O(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo0o(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOoO0(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOooO(@o00oOooO.oo0oO0 View view) {
            return view.isLayoutDirectionResolved();
        }
    }

    @o00oOooO.o0OOooO0(31)
    /* loaded from: classes.dex */
    public static final class o0OoO00O implements OnReceiveContentListener {
        @o00oOooO.oo0oO0

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0O0OO0 f10690o00oOOo0;

        public o0OoO00O(@o00oOooO.oo0oO0 o0O0OO0 o0o0oo0) {
            this.f10690o00oOOo0 = o0o0oo0;
        }

        @o00oOooO.o0OO00OO
        public ContentInfo onReceiveContent(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 ContentInfo contentInfo) {
            o0O000oo.o00oo00O o00oo00O2 = o0O000oo.o00oo00O.o00oo00O(contentInfo);
            o0O000oo.o00oo00O o00oOOo02 = this.f10690o00oOOo0.o00oOOo0(view, o00oo00O2);
            if (o00oOOo02 == null) {
                return null;
            }
            return o00oOOo02 == o00oo00O2 ? contentInfo : o00oOOo02.o00oOooo();
        }
    }

    @o00oOooO.o0OOooO0(31)
    /* loaded from: classes.dex */
    public static final class o0OoOoOo {
        private o0OoOoOo() {
        }

        @o00oOooO.o0O0O0Oo
        @o00oOooO.o0OO00OO
        public static String[] o00oOOo0(@o00oOooO.oo0oO0 View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        @o00oOooO.o0O0O0Oo
        @o00oOooO.o0OO00OO
        public static o0O000oo.o00oo00O o00oOOoO(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0O000oo.o00oo00O o00oo00o) {
            ContentInfo performReceiveContent;
            ContentInfo o00oOooo2 = o00oo00o.o00oOooo();
            performReceiveContent = view.performReceiveContent(o00oOooo2);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == o00oOooo2 ? o00oo00o : o0O000oo.o00oo00O.o00oo00O(performReceiveContent);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOo00(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO String[] strArr, @o00oOooO.o0OO00OO o0O0OO0 o0o0oo0) {
            if (o0o0oo0 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new o0OoO00O(o0o0oo0));
            }
        }
    }

    public static boolean o0(@o00oOooO.oo0oO0 View view) {
        return o00oo0OO.o00oOOoO(view);
    }

    public static /* synthetic */ o0O000oo.o00oo00O o00oOOo0(o0O000oo.o00oo00O o00oo00o) {
        return o00oo00o;
    }

    public static o00oo00O<Boolean> o00oOOoO() {
        return new o00oOo0O(R.id.tag_accessibility_heading, Boolean.class, 28);
    }

    public static int o00oOo00(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 CharSequence charSequence, @o00oOooO.oo0oO0 o0O00.o00ooO o00ooo) {
        int o00ooo0o2 = o00ooo0o(view, charSequence);
        if (o00ooo0o2 != -1) {
            o00oOooO(view, new o00oo0O.o00oOOo0(o00ooo0o2, charSequence, o00ooo));
        }
        return o00ooo0o2;
    }

    public static void o00oOo0O(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 Collection<View> collection, int i) {
        o0O00000.o00oOOo0(view, collection, i);
    }

    public static void o00oOo0o(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0O00O0o o0o00o0o) {
        o0O0000O.o00oOOo0(view, o0o00o0o);
    }

    public static void o00oOoO() {
        try {
            f10666o00ooo0o = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            f10667o00oooO = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException unused) {
        }
        f10668o00oooOO = true;
    }

    @o00oOooO.oo0oO0
    public static o0OO0oO0 o00oOoO0(@o00oOooO.oo0oO0 View view) {
        if (f10671o00oooo0 == null) {
            f10671o00oooo0 = new WeakHashMap<>();
        }
        o0OO0oO0 o0oo0oo0 = f10671o00oooo0.get(view);
        if (o0oo0oo0 == null) {
            o0OO0oO0 o0oo0oo02 = new o0OO0oO0(view);
            f10671o00oooo0.put(view, o0oo0oo02);
            return o0oo0oo02;
        }
        return o0oo0oo0;
    }

    @Deprecated
    public static boolean o00oOoOO(View view, int i) {
        return view.canScrollHorizontally(i);
    }

    @Deprecated
    public static boolean o00oOoOo(View view, int i) {
        return view.canScrollVertically(i);
    }

    public static void o00oOoo0(@o00oOooO.oo0oO0 View view) {
        o0.o00oOOo0(view);
    }

    public static void o00oOooO(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o00oo0O.o00oOOo0 o00oooo02) {
        o00ooOO0(view);
        o0O0oO0O(o00oooo02.o00oOOoO(), view);
        o00ooo0(view).add(o00oooo02);
        o0O0o00(view, 0);
    }

    @Deprecated
    public static int o00oOooo(int i, int i2) {
        return View.combineMeasuredStates(i, i2);
    }

    public static boolean o00oo(@o00oOooO.oo0oO0 View view, int i, int i2, int i3, int i4, @o00oOooO.o0OO00OO int[] iArr) {
        return o00ooO0.o00oOo0o(view, i, i2, i3, i4, iArr);
    }

    public static void o00oo0(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            o0OOOOOO(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                o0OOOOOO((View) parent);
            }
        }
    }

    public static void o00oo00O(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            o0OOOOOO(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                o0OOOOOO((View) parent);
            }
        }
    }

    public static void o00oo0O(@o00oOooO.oo0oO0 View view) {
        o0.o00oOOoO(view);
    }

    @o00oOooO.oo0oO0
    public static o0OOo000 o00oo0O0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
        WindowInsets o00ooo002 = o0ooo000.o00ooo00();
        if (o00ooo002 != null) {
            WindowInsets o00oOOo02 = o00oo.o00oOOo0(view, o00ooo002);
            if (!o00oOOo02.equals(o00ooo002)) {
                return o0OOo000.o00ooo0O(o00oOOo02, view);
            }
        }
        return o0ooo000;
    }

    @o00oOooO.oo0oO0
    public static o0OOo000 o00oo0OO(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0OOo000 o0ooo000, @o00oOooO.oo0oO0 Rect rect) {
        return o00ooO0.o00oOOoO(view, o0ooo000, rect);
    }

    public static boolean o00oo0Oo(@o00oOooO.oo0oO0 View view, float f, float f2, boolean z) {
        return o00ooO0.o00oOo00(view, f, f2, z);
    }

    public static boolean o00oo0o(@o00oOooO.oo0oO0 View view, int i, int i2, @o00oOooO.o0OO00OO int[] iArr, @o00oOooO.o0OO00OO int[] iArr2) {
        return o00ooO0.o00oOo0O(view, i, i2, iArr, iArr2);
    }

    public static boolean o00oo0o0(@o00oOooO.oo0oO0 View view, float f, float f2) {
        return o00ooO0.o00oOooO(view, f, f2);
    }

    public static boolean o00oo0oO(@o00oOooO.oo0oO0 View view, int i, int i2, @o00oOooO.o0OO00OO int[] iArr, @o00oOooO.o0OO00OO int[] iArr2, int i3) {
        if (view instanceof o0oO0Ooo) {
            return ((o0oO0Ooo) view).dispatchNestedPreScroll(i, i2, iArr, iArr2, i3);
        }
        if (i3 == 0) {
            return o00ooO0.o00oOo0O(view, i, i2, iArr, iArr2);
        }
        return false;
    }

    public static void o00ooO(@o00oOooO.oo0oO0 View view) {
        o00ooOO0(view);
    }

    public static void o00ooO0(@o00oOooO.oo0oO0 View view) {
        o0.o00oOo00(view);
    }

    public static boolean o00ooO00(@o00oOooO.oo0oO0 View view, int i, int i2, int i3, int i4, @o00oOooO.o0OO00OO int[] iArr, int i5) {
        if (view instanceof o0oO0Ooo) {
            return ((o0oO0Ooo) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5);
        }
        if (i5 == 0) {
            return o00ooO0.o00oOo0o(view, i, i2, i3, i4, iArr);
        }
        return false;
    }

    @o00oOooO.o0OOo000
    public static boolean o00ooO0O(View view, KeyEvent keyEvent) {
        return false;
    }

    @o00oOooO.o0OOo000
    public static boolean o00ooO0o(View view, KeyEvent keyEvent) {
        return false;
    }

    public static int o00ooOO() {
        return o00oo0O0.o00oOOo0();
    }

    public static void o00ooOO0(@o00oOooO.oo0oO0 View view) {
        o0O000oo.o00oOOoO o00ooOOo2 = o00ooOOo(view);
        if (o00ooOOo2 == null) {
            o00ooOOo2 = new o0O000oo.o00oOOoO();
        }
        o0O0oOo(view, o00ooOOo2);
    }

    @o00oOooO.o0OO00OO
    public static o0O000oo.o00oOOoO o00ooOOo(@o00oOooO.oo0oO0 View view) {
        View.AccessibilityDelegate o00ooOo02 = o00ooOo0(view);
        if (o00ooOo02 == null) {
            return null;
        }
        return o00ooOo02 instanceof o00oOOoO.o00oOOo0 ? ((o00oOOoO.o00oOOo0) o00ooOo02).f10421o00oOOo0 : new o0O000oo.o00oOOoO(o00ooOo02);
    }

    @o00oOooO.o0OO00OO
    public static View.AccessibilityDelegate o00ooOo(@o00oOooO.oo0oO0 View view) {
        if (f10673o00ooooo) {
            return null;
        }
        if (f10672o00ooooO == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f10672o00ooooO = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f10673o00ooooo = true;
                return null;
            }
        }
        try {
            Object obj = f10672o00ooooO.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f10673o00ooooo = true;
            return null;
        }
    }

    @o00oOooO.o0OO00OO
    public static View.AccessibilityDelegate o00ooOo0(@o00oOooO.oo0oO0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? o0O000.o00oOOo0(view) : o00ooOo(view);
    }

    public static int o00ooOoO(@o00oOooO.oo0oO0 View view) {
        return o0O0o.o00oOOo0(view);
    }

    @o00oOooO.o0OO00OO
    public static o0O00.o00oo o00ooOoo(@o00oOooO.oo0oO0 View view) {
        AccessibilityNodeProvider o00oOOo02 = o00oo0OO.o00oOOo0(view);
        if (o00oOOo02 != null) {
            return new o0O00.o00oo(o00oOOo02);
        }
        return null;
    }

    public static List<o00oo0O.o00oOOo0> o00ooo0(View view) {
        int i = R.id.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    @o00oOooO.o0OO00OO
    @o00oOooO.o0OOo000
    public static CharSequence o00ooo00(@o00oOooO.oo0oO0 View view) {
        return o0O0o0o0().o00oOo0o(view);
    }

    @Deprecated
    public static float o00ooo0O(View view) {
        return view.getAlpha();
    }

    public static int o00ooo0o(View view, @o00oOooO.oo0oO0 CharSequence charSequence) {
        List<o00oo0O.o00oOOo0> o00ooo02 = o00ooo0(view);
        for (int i = 0; i < o00ooo02.size(); i++) {
            if (TextUtils.equals(charSequence, o00ooo02.get(i).o00oOo00())) {
                return o00ooo02.get(i).o00oOOoO();
            }
        }
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[] iArr = f10674o0O00000;
            if (i3 >= iArr.length || i2 != -1) {
                break;
            }
            int i4 = iArr[i3];
            boolean z = true;
            for (int i5 = 0; i5 < o00ooo02.size(); i5++) {
                z &= o00ooo02.get(i5).o00oOOoO() != i4;
            }
            if (z) {
                i2 = i4;
            }
            i3++;
        }
        return i2;
    }

    @o00oOooO.o0OO00OO
    public static ColorStateList o00oooO(@o00oOooO.oo0oO0 View view) {
        return o00ooO0.o00oOoO0(view);
    }

    @o00oOooO.o0OO00OO
    public static PorterDuff.Mode o00oooOO(@o00oOooO.oo0oO0 View view) {
        return o00ooO0.o00oOoO(view);
    }

    @o00oOooO.o0OO00OO
    public static Rect o00oooOo(@o00oOooO.oo0oO0 View view) {
        return o00oo0O.o00oOOo0(view);
    }

    public static float o00oooo(@o00oOooO.oo0oO0 View view) {
        return o00ooO0.o00oOoOO(view);
    }

    @o00oOooO.o0OO00OO
    public static Display o00oooo0(@o00oOooO.oo0oO0 View view) {
        return o00oo0O0.o00oOOoO(view);
    }

    public static Rect o00ooooO() {
        if (f10628o0 == null) {
            f10628o0 = new ThreadLocal<>();
        }
        Rect rect = f10628o0.get();
        if (rect == null) {
            rect = new Rect();
            f10628o0.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static o0O0OO o00ooooo(@o00oOooO.oo0oO0 View view) {
        return view instanceof o0O0OO ? (o0O0OO) view : f10675o0O0000O;
    }

    public static void o0O(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO Rect rect) {
        o00oo0O.o00oOo00(view, rect);
    }

    @o00oOooO.o0OO00OO
    public static String[] o0O00(@o00oOooO.oo0oO0 View view) {
        return Build.VERSION.SDK_INT >= 31 ? o0OoOoOo.o00oOOo0(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int o0O000(View view) {
        return view.getLayerType();
    }

    public static int o0O00000(@o00oOooO.oo0oO0 View view) {
        return o00oo0OO.o00oOo00(view);
    }

    @SuppressLint({"InlinedApi"})
    public static int o0O0000O(@o00oOooO.oo0oO0 View view) {
        return o0O00000.o00oOOoO(view);
    }

    public static int o0O0000o(@o00oOooO.oo0oO0 View view) {
        return o00oo0O0.o00oOo00(view);
    }

    public static int o0O000O(@o00oOooO.oo0oO0 View view) {
        return o00oo0O0.o00oOooO(view);
    }

    @Deprecated
    public static int o0O000Oo(View view) {
        return view.getMeasuredHeightAndState();
    }

    public static int o0O000o(@o00oOooO.oo0oO0 View view) {
        return o00oo0OO.o00oOooO(view);
    }

    @Deprecated
    public static int o0O000o0(View view) {
        return view.getMeasuredWidthAndState();
    }

    public static int o0O000oo(@o00oOooO.oo0oO0 View view) {
        return o0O00000.o00oOo00(view);
    }

    @o00oOooO.o0OO00OO
    public static ViewParent o0O00O(@o00oOooO.oo0oO0 View view) {
        return o00oo0OO.o00oOo0o(view);
    }

    @Deprecated
    public static int o0O00O0(View view) {
        return view.getOverScrollMode();
    }

    @o00oOooO.o0OO0
    public static int o0O00O0o(@o00oOooO.oo0oO0 View view) {
        return o00oo0O0.o00oOo0o(view);
    }

    @Deprecated
    public static float o0O00OO(View view) {
        return view.getPivotX();
    }

    @Deprecated
    public static float o0O00OOO(View view) {
        return view.getPivotY();
    }

    @o00oOooO.o0OO00OO
    public static o0OOo000 o0O00Oo(@o00oOooO.oo0oO0 View view) {
        return o00ooO.o00oOOo0(view);
    }

    @Deprecated
    public static float o0O00OoO(View view) {
        return view.getRotationX();
    }

    @Deprecated
    public static float o0O00Ooo(View view) {
        return view.getRotationY();
    }

    @o00oOooO.o0OO00OO
    @o00oOooO.o0OOo000
    public static CharSequence o0O00o(@o00oOooO.oo0oO0 View view) {
        return o0OOOO().o00oOo0o(view);
    }

    @Deprecated
    public static float o0O00o00(View view) {
        return view.getScaleX();
    }

    @Deprecated
    public static float o0O00o0O(View view) {
        return view.getScaleY();
    }

    public static int o0O00o0o(@o00oOooO.oo0oO0 View view) {
        return o00ooO.o00oOOoO(view);
    }

    @o00oOooO.oo0oO0
    public static List<Rect> o0O00oO0(@o00oOooO.oo0oO0 View view) {
        return Build.VERSION.SDK_INT >= 29 ? o0O000.o00oOOoO(view) : Collections.emptyList();
    }

    @o00oOooO.o0OO00OO
    public static String o0O0O0O(@o00oOooO.oo0oO0 View view) {
        return o00ooO0.o00oOoo0(view);
    }

    public static float o0O0O0Oo(@o00oOooO.oo0oO0 View view) {
        return o00ooO0.o00oOooo(view);
    }

    @Deprecated
    public static int o0O0O0o(@o00oOooO.oo0oO0 View view) {
        return o00oo0OO.o00oOoO0(view);
    }

    @o00oOooO.o0OO00OO
    @Deprecated
    public static oO000O0 o0O0O0o0(@o00oOooO.oo0oO0 View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return o0O000O.o00oOOoO(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new oO000O0(window, view);
                }
                return null;
            }
        }
        return null;
    }

    @Deprecated
    public static float o0O0O0oO(View view) {
        return view.getX();
    }

    @Deprecated
    public static float o0O0O0oo(View view) {
        return view.getY();
    }

    public static boolean o0O0OO(@o00oOooO.oo0oO0 View view) {
        return o00ooO0.o00oo0(view);
    }

    public static boolean o0O0OO0(@o00oOooO.oo0oO0 View view) {
        return o00ooOo0(view) != null;
    }

    public static boolean o0O0OO0O(@o00oOooO.oo0oO0 View view) {
        return o0O00000.o00oOooO(view);
    }

    public static boolean o0O0OOO(@o00oOooO.oo0oO0 View view) {
        return o00oo0.o00oOOo0(view);
    }

    public static boolean o0O0OOO0(@o00oOooO.oo0oO0 View view, int i) {
        if (view instanceof o0oO0Ooo) {
            ((o0oO0Ooo) view).hasNestedScrollingParent(i);
            return false;
        } else if (i == 0) {
            return o00ooO0.o00oo0(view);
        } else {
            return false;
        }
    }

    public static boolean o0O0OOOo(@o00oOooO.oo0oO0 View view) {
        return o00oo0OO.o00oOoO(view);
    }

    public static boolean o0O0OOo(@o00oOooO.oo0oO0 View view) {
        return o00oo0OO.o00oOoOO(view);
    }

    @o00oOooO.o0OOo000
    public static boolean o0O0OOoO(@o00oOooO.oo0oO0 View view) {
        Boolean o00oOo0o2 = o00oOOoO().o00oOo0o(view);
        return o00oOo0o2 != null && o00oOo0o2.booleanValue();
    }

    public static boolean o0O0OOoo(@o00oOooO.oo0oO0 View view) {
        return o0O0o.o00oOOoO(view);
    }

    public static boolean o0O0Oo(@o00oOooO.oo0oO0 View view) {
        return o0O00000.o00oOoO0(view);
    }

    public static boolean o0O0Oo0(@o00oOooO.oo0oO0 View view) {
        return o00ooO0.o00oo0OO(view);
    }

    public static boolean o0O0Oo0O(@o00oOooO.oo0oO0 View view) {
        return o0O00000.o00oOo0o(view);
    }

    public static boolean o0O0Oo0o(@o00oOooO.oo0oO0 View view) {
        return o00oo0O.o00oOOoO(view);
    }

    @Deprecated
    public static boolean o0O0OoO(View view) {
        return view.isOpaque();
    }

    public static boolean o0O0OoO0(@o00oOooO.oo0oO0 View view) {
        return o0O0o.o00oOooO(view);
    }

    public static boolean o0O0OoOo(@o00oOooO.oo0oO0 View view) {
        return o00oo0O0.o00oOoO0(view);
    }

    @Deprecated
    public static void o0O0Ooo(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @o00oOooO.o0OOo000
    public static boolean o0O0Ooo0(@o00oOooO.oo0oO0 View view) {
        Boolean o00oOo0o2 = oo0oOOo().o00oOo0o(view);
        return o00oOo0o2 != null && o00oOo0o2.booleanValue();
    }

    @o00oOooO.o0OO00OO
    public static View o0O0OooO(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO View view2, int i) {
        return o0O00000.o00oOoO(view, view2, i);
    }

    public static boolean o0O0Oooo(@o00oOooO.oo0oO0 View view) {
        return o0O0o.o00oOo00(view);
    }

    public static void o0O0o(@o00oOooO.oo0oO0 View view, int i, int i2, int i3, int i4, @o00oOooO.o0OO00OO int[] iArr, int i5, @o00oOooO.oo0oO0 int[] iArr2) {
        if (view instanceof o0O00o00) {
            ((o0O00o00) view).dispatchNestedScroll(i, i2, i3, i4, iArr, i5, iArr2);
        } else {
            o00ooO00(view, i, i2, i3, i4, iArr, i5);
        }
    }

    @o00oOooO.oo0oO0
    public static o0OOo000 o0O0o0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0OOo000 o0ooo000) {
        WindowInsets o00ooo002 = o0ooo000.o00ooo00();
        if (o00ooo002 != null) {
            WindowInsets o00oOOoO2 = o00oo.o00oOOoO(view, o00ooo002);
            if (!o00oOOoO2.equals(o00ooo002)) {
                return o0OOo000.o00ooo0O(o00oOOoO2, view);
            }
        }
        return o0ooo000;
    }

    @o00oOooO.o0OOooO0(19)
    public static void o0O0o00(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = o00ooo00(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (o0O0o.o00oOOo0(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                o0O0o.o00oOoO0(obtain, i);
                if (z) {
                    obtain.getText().add(o00ooo00(view));
                    o0OOO0Oo(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        o0O0o.o00oOo0O(view.getParent(), view, view, i);
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                    }
                }
            } else {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                o0O0o.o00oOoO0(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(o00ooo00(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            }
        }
    }

    public static /* synthetic */ o0O000oo.o00oo00O o0O0o000(o0O000oo.o00oo00O o00oo00o) {
        return o00oo00o;
    }

    public static void o0O0o00O(@o00oOooO.oo0oO0 View view, int i) {
        view.offsetLeftAndRight(i);
    }

    public static void o0O0o00o(@o00oOooO.oo0oO0 View view, int i) {
        view.offsetTopAndBottom(i);
    }

    @Deprecated
    public static void o0O0o0O(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public static void o0O0o0OO(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0O00.o00oo0O o00oo0o2) {
        view.onInitializeAccessibilityNodeInfo(o00oo0o2.o0OOooO0());
    }

    @Deprecated
    public static void o0O0o0Oo(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    public static boolean o0O0o0o(@o00oOooO.oo0oO0 View view, int i, @o00oOooO.o0OO00OO Bundle bundle) {
        return o00oo0OO.o00oOoOo(view, i, bundle);
    }

    public static o00oo00O<CharSequence> o0O0o0o0() {
        return new o00oOOoO(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    public static void o0O0o0oO(@o00oOooO.oo0oO0 View view) {
        o00oo0OO.o00oOoo0(view);
    }

    public static void o0O0o0oo(@o00oOooO.oo0oO0 View view, int i, int i2, int i3, int i4) {
        o00oo0OO.o00oOooo(view, i, i2, i3, i4);
    }

    public static void o0O0oO(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o00oo0O.o00oOOo0 o00oooo02, @o00oOooO.o0OO00OO CharSequence charSequence, @o00oOooO.o0OO00OO o0O00.o00ooO o00ooo) {
        if (o00ooo == null && charSequence == null) {
            o0O0oO0(view, o00oooo02.o00oOOoO());
        } else {
            o00oOooO(view, o00oooo02.o00oOOo0(charSequence, o00ooo));
        }
    }

    public static void o0O0oO0(@o00oOooO.oo0oO0 View view, int i) {
        o0O0oO0O(i, view);
        o0O0o00(view, 0);
    }

    public static void o0O0oO0O(int i, View view) {
        List<o00oo0O.o00oOOo0> o00ooo02 = o00ooo0(view);
        for (int i2 = 0; i2 < o00ooo02.size(); i2++) {
            if (o00ooo02.get(i2).o00oOOoO() == i) {
                o00ooo02.remove(i2);
                return;
            }
        }
    }

    public static void o0O0oO0o(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0O00O0o o0o00o0o) {
        o0O0000O.o00oOo0O(view, o0o00o0o);
    }

    @o00oOooO.oo0oO0
    public static <T extends View> T o0O0oOO(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0OOoo int i) {
        return (T) o0O0000O.o00oOo0o(view, i);
    }

    public static void o0O0oOO0(@o00oOooO.oo0oO0 View view) {
        o00oo.o00oOo00(view);
    }

    public static boolean o0O0oOOO(@o00oOooO.oo0oO0 View view) {
        return o0O00000.o00oOoOO(view);
    }

    public static void o0O0oOo(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO o0O000oo.o00oOOoO o00ooooo2) {
        if (o00ooooo2 == null && (o00ooOo0(view) instanceof o00oOOoO.o00oOOo0)) {
            o00ooooo2 = new o0O000oo.o00oOOoO();
        }
        view.setAccessibilityDelegate(o00ooooo2 == null ? null : o00ooooo2.getBridge());
    }

    public static void o0O0oOo0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 @SuppressLint({"ContextFirst"}) Context context, @o00oOooO.oo0oO0 int[] iArr, @o00oOooO.o0OO00OO AttributeSet attributeSet, @o00oOooO.oo0oO0 TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            o0O000.o00oOo00(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    @o00oOooO.o0OOo000
    public static void o0O0oOoO(@o00oOooO.oo0oO0 View view, boolean z) {
        o00oOOoO().o00oOoO0(view, Boolean.valueOf(z));
    }

    public static void o0O0oOoo(@o00oOooO.oo0oO0 View view, int i) {
        o0O0o.o00oOo0o(view, i);
    }

    @Deprecated
    public static void o0O0oo(View view, boolean z) {
        view.setActivated(z);
    }

    @o00oOooO.o0OOo000
    public static void o0O0oo0(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO CharSequence charSequence) {
        o0O0o0o0().o00oOoO0(view, charSequence);
        if (charSequence != null) {
            f10676o0O0000o.o00oOOo0(view);
        } else {
            f10676o0O0000o.o00oOooO(view);
        }
    }

    @Deprecated
    public static int o0O0oo00(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static void o0O0oo0O(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 Runnable runnable) {
        o00oo0OO.o00oo00O(view, runnable);
    }

    @Deprecated
    public static float o0O0oo0o(View view) {
        return view.getTranslationY();
    }

    @Deprecated
    public static void o0O0ooO0(View view, @o00oOooO.o0O0OO0(from = 0.0d, to = 1.0d) float f) {
        view.setAlpha(f);
    }

    public static void o0O0ooOO(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO String... strArr) {
        o0O00000.o00oOoOo(view, strArr);
    }

    public static void o0O0ooo(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO ColorStateList colorStateList) {
        o00ooO0.o00oo0O(view, colorStateList);
    }

    public static void o0O0ooo0(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO Drawable drawable) {
        o00oo0OO.o00oo0O(view, drawable);
    }

    public static void o0O0oooO(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO PorterDuff.Mode mode) {
        o00ooO0.o00oo0Oo(view, mode);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void o0O0oooo(ViewGroup viewGroup, boolean z) {
        if (f10670o00oooo == null) {
            try {
                f10670o00oooo = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            f10670o00oooo.setAccessible(true);
        }
        try {
            f10670o00oooo.invoke(viewGroup, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
        }
    }

    @o00oOooO.o0OOo000
    public static void o0OO(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO CharSequence charSequence) {
        o0OOOO().o00oOoO0(view, charSequence);
    }

    public static void o0OO0(@o00oOooO.oo0oO0 View view, int i) {
        o00oo0O0.o00oOoOo(view, i);
    }

    public static void o0OO000(@o00oOooO.oo0oO0 View view, float f) {
        o00ooO0.o00oo0o0(view, f);
    }

    @Deprecated
    public static void o0OO000o(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    @o00oOooO.o0OOo000
    public static void o0OO00OO(@o00oOooO.oo0oO0 View view, int i) {
        o00oo0OO.o00oo0o0(view, i);
    }

    public static void o0OO00Oo(@o00oOooO.oo0oO0 View view, boolean z) {
        o0O00000.o00oo00O(view, z);
    }

    @Deprecated
    public static void o0OO00o(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    public static void o0OO00o0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0OOoo int i) {
        o00oo0O0.o00oOoO(view, i);
    }

    public static void o0OO00oo(@o00oOooO.oo0oO0 View view, int i) {
        o0O00000.o00oOooo(view, i);
    }

    public static void o0OO0O0(@o00oOooO.oo0oO0 View view, boolean z) {
        o00ooO0.o00oo0o(view, z);
    }

    public static void o0OO0O0O(@o00oOooO.oo0oO0 View view, int i) {
        o0O00000.o00oo0(view, i);
    }

    public static void o0OO0OoO(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO o0ooO o0ooo) {
        o00ooO0.o00oo0oO(view, o0ooo);
    }

    @Deprecated
    public static void o0OO0Ooo(View view, int i) {
        view.setOverScrollMode(i);
    }

    @Deprecated
    public static void o0OO0o(View view, float f) {
        view.setRotation(f);
    }

    @Deprecated
    public static void o0OO0o0(View view, float f) {
        view.setPivotX(f);
    }

    public static void o0OO0o00(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO0 int i, @o00oOooO.o0OO0 int i2, @o00oOooO.o0OO0 int i3, @o00oOooO.o0OO0 int i4) {
        o00oo0O0.o00oOoo0(view, i, i2, i3, i4);
    }

    @Deprecated
    public static void o0OO0o0O(View view, float f) {
        view.setPivotY(f);
    }

    public static void o0OO0o0o(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO o0O0OOO o0o0ooo) {
        o0.o00oOooO(view, o0o0ooo != null ? o0o0ooo.f10622o00oOOo0 : null);
    }

    @Deprecated
    public static void o0OO0oO(View view, float f) {
        view.setRotationY(f);
    }

    @Deprecated
    public static void o0OO0oO0(View view, float f) {
        view.setRotationX(f);
    }

    @Deprecated
    public static void o0OO0oOO(View view, boolean z) {
        view.setSaveFromParentEnabled(z);
    }

    @Deprecated
    public static void o0OO0oOo(View view, float f) {
        view.setScaleY(f);
    }

    @o00oOooO.o0OOo000
    public static void o0OO0oo0(@o00oOooO.oo0oO0 View view, boolean z) {
        oo0oOOo().o00oOoO0(view, Boolean.valueOf(z));
    }

    public static void o0OO0ooO(@o00oOooO.oo0oO0 View view, int i) {
        o00ooO.o00oOo00(view, i);
    }

    public static void o0OO0ooo(@o00oOooO.oo0oO0 View view, int i, int i2) {
        o00ooO.o00oOooO(view, i, i2);
    }

    public static void o0OOO0(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO String str) {
        o00ooO0.o0O0o(view, str);
    }

    public static void o0OOO00(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            o0O000.o00oOooO(view, list);
        }
    }

    public static void o0OOO00o(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO CharSequence charSequence) {
        o0O00000.o00oo0OO(view, charSequence);
    }

    @Deprecated
    public static void o0OOO0O(View view, float f) {
        view.setTranslationY(f);
    }

    @Deprecated
    public static void o0OOO0O0(View view, float f) {
        view.setTranslationX(f);
    }

    public static void o0OOO0OO(@o00oOooO.oo0oO0 View view, float f) {
        o00ooO0.o00oo(view, f);
    }

    public static void o0OOO0Oo(View view) {
        if (o00oo0OO.o00oOo00(view) == 0) {
            o00oo0OO.o00oo0o0(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (o00oo0OO.o00oOo00((View) parent) == 4) {
                o00oo0OO.o00oo0o0(view, 2);
                return;
            }
        }
    }

    public static void o0OOO0o0(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO o0OOO0OO.o00oOOoO o00ooooo2) {
        o0OOO0OO.o00oOoO(view, o00ooooo2);
    }

    @Deprecated
    public static void o0OOO0oO(View view, float f) {
        view.setX(f);
    }

    @Deprecated
    public static void o0OOO0oo(View view, float f) {
        view.setY(f);
    }

    public static o00oo00O<CharSequence> o0OOOO() {
        return new o00oOo00(R.id.tag_state_description, CharSequence.class, 64, 30);
    }

    public static boolean o0OOOO0(@o00oOooO.oo0oO0 View view, int i) {
        return o00ooO0.o00ooO0(view, i);
    }

    public static boolean o0OOOO00(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO ClipData clipData, @o00oOooO.oo0oO0 View.DragShadowBuilder dragShadowBuilder, @o00oOooO.o0OO00OO Object obj, int i) {
        return o0.o00oOo0O(view, clipData, dragShadowBuilder, obj, i);
    }

    public static boolean o0OOOO0o(@o00oOooO.oo0oO0 View view, int i, int i2) {
        if (view instanceof o0oO0Ooo) {
            return ((o0oO0Ooo) view).startNestedScroll(i, i2);
        }
        if (i2 == 0) {
            return o00ooO0.o00ooO0(view, i);
        }
        return false;
    }

    public static void o0OOOOO(@o00oOooO.oo0oO0 View view, int i) {
        if (view instanceof o0oO0Ooo) {
            ((o0oO0Ooo) view).stopNestedScroll(i);
        } else if (i == 0) {
            o00ooO0.o00ooO0O(view);
        }
    }

    public static void o0OOOOO0(@o00oOooO.oo0oO0 View view) {
        o00ooO0.o00ooO0O(view);
    }

    public static void o0OOOOOO(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void o0OOOOOo(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 View.DragShadowBuilder dragShadowBuilder) {
        o0.o00oOo0o(view, dragShadowBuilder);
    }

    public static void o0OOOOoO(@o00oOooO.oo0oO0 View view, float f) {
        o00ooO0.o00ooO00(view, f);
    }

    public static void o0OOooO0(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO String[] strArr, @o00oOooO.o0OO00OO o0O0OO0 o0o0oo0) {
        if (Build.VERSION.SDK_INT >= 31) {
            o0OoOoOo.o00oOo00(view, strArr, o0o0oo0);
            return;
        }
        strArr = (strArr == null || strArr.length == 0) ? null : null;
        boolean z = false;
        if (o0o0oo0 != null) {
            ooOOOOoo.o00oOOoO(strArr != null, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (strArr[i].startsWith("*")) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("A MIME type set here must not start with *: ");
            o00oOOo02.append(Arrays.toString(strArr));
            ooOOOOoo.o00oOOoO(!z, o00oOOo02.toString());
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, o0o0oo0);
    }

    @Deprecated
    public static void o0OOoooO(View view, float f) {
        view.setScaleX(f);
    }

    @o00oOooO.o0OO0
    public static int o0OoO00O(@o00oOooO.oo0oO0 View view) {
        return o00oo0O0.o00oOo0O(view);
    }

    public static void o0OoOoO(@o00oOooO.oo0oO0 View view, @o00oOooO.o0OO00OO Paint paint) {
        o00oo0O0.o00oOoOO(view, paint);
    }

    @Deprecated
    public static int o0OoOoOO(View view) {
        return view.getMeasuredState();
    }

    @o00oOooO.o0OO00OO
    @Deprecated
    public static Matrix o0OoOoOo(View view) {
        return view.getMatrix();
    }

    public static boolean o0OooO0(@o00oOooO.oo0oO0 View view) {
        return o0O00000.o00oOo0O(view);
    }

    @Deprecated
    public static float o0oO0O0o(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float o0oO0Ooo(View view) {
        return view.getRotation();
    }

    @o00oOooO.o0OO00OO
    public static o0O000oo.o00oo00O o0oOo0O0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0O000oo.o00oo00O o00oo00o) {
        if (Log.isLoggable(f10629o00oOOo0, 3)) {
            Objects.toString(o00oo00o);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o0OoOoOo.o00oOOoO(view, o00oo00o);
        }
        o0O0OO0 o0o0oo0 = (o0O0OO0) view.getTag(R.id.tag_on_receive_content_listener);
        if (o0o0oo0 != null) {
            o0O000oo.o00oo00O o00oOOo02 = o0o0oo0.o00oOOo0(view, o00oo00o);
            if (o00oOOo02 == null) {
                return null;
            }
            return o00ooooo(view).onReceiveContent(o00oOOo02);
        }
        return o00ooooo(view).onReceiveContent(o00oo00o);
    }

    public static float o0ooO(@o00oOooO.oo0oO0 View view) {
        return o00ooO0.o00oo00O(view);
    }

    public static int o0ooOoOO(@o00oOooO.oo0oO0 View view) {
        return o00oo0OO.o00oOo0O(view);
    }

    public static boolean oo0OOoo(@o00oOooO.oo0oO0 View view) {
        return o00ooO0.o00oo0O0(view);
    }

    public static void oo0oO0(@o00oOooO.oo0oO0 View view, boolean z) {
        o0O00000.o00oOoo0(view, z);
    }

    public static o00oo00O<Boolean> oo0oOOo() {
        return new o00oOOo0(R.id.tag_screen_reader_focusable, Boolean.class, 28);
    }

    public static void oo0ooO(@o00oOooO.oo0oO0 View view, boolean z) {
        o00oo0OO.o00oo0Oo(view, z);
    }

    @SuppressLint({"LambdaLast"})
    public static void oooOO0(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 Runnable runnable, long j) {
        o00oo0OO.o00oo0(view, runnable, j);
    }
}
