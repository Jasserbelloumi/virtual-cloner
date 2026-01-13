package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import com.google.android.material.R;
import o00oOooO.o0O0O0O;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
import o0O000oo.o0OOo000;
import o0O000oo.o0ooO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class ViewUtils {

    /* loaded from: classes2.dex */
    public interface OnApplyWindowInsetsListener {
        o0OOo000 onApplyWindowInsets(View view, o0OOo000 o0ooo000, RelativePadding relativePadding);
    }

    /* loaded from: classes2.dex */
    public static class RelativePadding {
        public int bottom;
        public int end;
        public int start;
        public int top;

        public RelativePadding(int i, int i2, int i3, int i4) {
            this.start = i;
            this.top = i2;
            this.end = i3;
            this.bottom = i4;
        }

        public RelativePadding(@oo0oO0 RelativePadding relativePadding) {
            this.start = relativePadding.start;
            this.top = relativePadding.top;
            this.end = relativePadding.end;
            this.bottom = relativePadding.bottom;
        }

        public void applyToView(View view) {
            o0O0o00O.o0OO0o00(view, this.start, this.top, this.end, this.bottom);
        }
    }

    private ViewUtils() {
    }

    public static void addOnGlobalLayoutListener(@o0OO00OO View view, @oo0oO0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    public static void doOnApplyWindowInsets(@oo0oO0 View view, @o0OO00OO AttributeSet attributeSet, int i, int i2) {
        doOnApplyWindowInsets(view, attributeSet, i, i2, null);
    }

    public static void doOnApplyWindowInsets(@oo0oO0 View view, @o0OO00OO AttributeSet attributeSet, int i, int i2, @o0OO00OO final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, R.styleable.Insets, i, i2);
        final boolean z = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingBottomSystemWindowInsets, false);
        final boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingLeftSystemWindowInsets, false);
        final boolean z3 = obtainStyledAttributes.getBoolean(R.styleable.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        doOnApplyWindowInsets(view, new OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
            @oo0oO0
            public o0OOo000 onApplyWindowInsets(View view2, @oo0oO0 o0OOo000 o0ooo000, @oo0oO0 RelativePadding relativePadding) {
                if (z) {
                    relativePadding.bottom = o0ooo000.o00oo0OO() + relativePadding.bottom;
                }
                boolean isLayoutRtl = ViewUtils.isLayoutRtl(view2);
                if (z2) {
                    if (isLayoutRtl) {
                        relativePadding.end = o0ooo000.o00oo0O0() + relativePadding.end;
                    } else {
                        relativePadding.start = o0ooo000.o00oo0O0() + relativePadding.start;
                    }
                }
                if (z3) {
                    if (isLayoutRtl) {
                        relativePadding.start = o0ooo000.o00oo0O() + relativePadding.start;
                    } else {
                        relativePadding.end = o0ooo000.o00oo0O() + relativePadding.end;
                    }
                }
                relativePadding.applyToView(view2);
                OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                return onApplyWindowInsetsListener2 != null ? onApplyWindowInsetsListener2.onApplyWindowInsets(view2, o0ooo000, relativePadding) : o0ooo000;
            }
        });
    }

    public static void doOnApplyWindowInsets(@oo0oO0 View view, @oo0oO0 final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        final RelativePadding relativePadding = new RelativePadding(o0O0o00O.o0O00O0o(view), view.getPaddingTop(), o0O0o00O.o00oo0O0.o00oOo0O(view), view.getPaddingBottom());
        o0O0o00O.o00ooO0.o00oo0oO(view, new o0ooO() { // from class: com.google.android.material.internal.ViewUtils.3
            @Override // o0O000oo.o0ooO
            public o0OOo000 onApplyWindowInsets(View view2, o0OOo000 o0ooo000) {
                return OnApplyWindowInsetsListener.this.onApplyWindowInsets(view2, o0ooo000, new RelativePadding(relativePadding));
            }
        });
        requestApplyInsetsWhenAttached(view);
    }

    public static float dpToPx(@oo0oO0 Context context, @o0O0O0O(unit = 0) int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    @o0OO00OO
    public static ViewGroup getContentView(@o0OO00OO View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    @o0OO00OO
    public static ViewOverlayImpl getContentViewOverlay(@oo0oO0 View view) {
        return getOverlay(getContentView(view));
    }

    @o0OO00OO
    public static ViewOverlayImpl getOverlay(@o0OO00OO View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static float getParentAbsoluteElevation(@oo0oO0 View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += o0O0o00O.o00oooo((View) parent);
        }
        return f;
    }

    public static boolean isLayoutRtl(View view) {
        return o0O0o00O.o0O000O(view) == 1;
    }

    public static PorterDuff.Mode parseTintMode(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void removeOnGlobalLayoutListener(@o0OO00OO View view, @oo0oO0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            removeOnGlobalLayoutListener(view.getViewTreeObserver(), onGlobalLayoutListener);
        }
    }

    public static void removeOnGlobalLayoutListener(@oo0oO0 ViewTreeObserver viewTreeObserver, @oo0oO0 ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void requestApplyInsetsWhenAttached(@oo0oO0 View view) {
        if (o0O0o00O.o0O0OOoo(view)) {
            o0O0o00O.o00oo.o00oOo00(view);
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.internal.ViewUtils.4
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@oo0oO0 View view2) {
                    view2.removeOnAttachStateChangeListener(this);
                    o0O0o00O.o0O0oOO0(view2);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(View view2) {
                }
            });
        }
    }

    public static void requestFocusAndShowKeyboard(@oo0oO0 final View view) {
        view.requestFocus();
        view.post(new Runnable() { // from class: com.google.android.material.internal.ViewUtils.1
            @Override // java.lang.Runnable
            public void run() {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 1);
            }
        });
    }
}
