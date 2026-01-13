package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O00.o00oo0O;
import o0O00.o00ooO;
import o0O000oo.o0O0o00O;
import o0O00O.o00oOo0O;
/* loaded from: classes2.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.o00oOo00<V> {
    private static final float DEFAULT_ALPHA_END_DISTANCE = 0.5f;
    private static final float DEFAULT_ALPHA_START_DISTANCE = 0.0f;
    private static final float DEFAULT_DRAG_DISMISS_THRESHOLD = 0.5f;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    public static final int SWIPE_DIRECTION_ANY = 2;
    public static final int SWIPE_DIRECTION_END_TO_START = 1;
    public static final int SWIPE_DIRECTION_START_TO_END = 0;
    private boolean interceptingEvents;
    public OnDismissListener listener;
    private boolean sensitivitySet;
    public o00oOo0O viewDragHelper;
    private float sensitivity = 0.0f;
    public int swipeDirection = 2;
    public float dragDismissThreshold = 0.5f;
    public float alphaStartSwipeDistance = 0.0f;
    public float alphaEndSwipeDistance = 0.5f;
    private final o00oOo0O.o00oOo00 dragCallback = new o00oOo0O.o00oOo00() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.1
        private static final int INVALID_POINTER_ID = -1;
        private int activePointerId = -1;
        private int originalCapturedViewLeft;

        private boolean shouldDismiss(@oo0oO0 View view, float f) {
            int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
            if (i == 0) {
                return Math.abs(view.getLeft() - this.originalCapturedViewLeft) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.dragDismissThreshold);
            }
            boolean z = o0O0o00O.o0O000O(view) == 1;
            int i2 = SwipeDismissBehavior.this.swipeDirection;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                if (z) {
                    if (f >= 0.0f) {
                        return false;
                    }
                } else if (i <= 0) {
                    return false;
                }
                return true;
            } else if (i2 == 1) {
                if (z) {
                    if (i <= 0) {
                        return false;
                    }
                } else if (f >= 0.0f) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
            r5 = r2.originalCapturedViewLeft;
            r3 = r3.getWidth() + r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            if (r5 != false) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
            if (r5 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
            r5 = r2.originalCapturedViewLeft - r3.getWidth();
            r3 = r2.originalCapturedViewLeft;
         */
        @Override // o0O00O.o00oOo0O.o00oOo00
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int clampViewPositionHorizontal(@o00oOooO.oo0oO0 android.view.View r3, int r4, int r5) {
            /*
                r2 = this;
                int r5 = o0O000oo.o0O0o00O.o0O000O(r3)
                r0 = 1
                if (r5 != r0) goto L9
                r5 = r0
                goto La
            L9:
                r5 = 0
            La:
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r1 = r1.swipeDirection
                if (r1 != 0) goto L24
                if (r5 == 0) goto L1c
            L12:
                int r5 = r2.originalCapturedViewLeft
                int r3 = r3.getWidth()
                int r5 = r5 - r3
                int r3 = r2.originalCapturedViewLeft
                goto L37
            L1c:
                int r5 = r2.originalCapturedViewLeft
                int r3 = r3.getWidth()
                int r3 = r3 + r5
                goto L37
            L24:
                if (r1 != r0) goto L29
                if (r5 == 0) goto L12
                goto L1c
            L29:
                int r5 = r2.originalCapturedViewLeft
                int r0 = r3.getWidth()
                int r5 = r5 - r0
                int r0 = r2.originalCapturedViewLeft
                int r3 = r3.getWidth()
                int r3 = r3 + r0
            L37:
                int r3 = com.google.android.material.behavior.SwipeDismissBehavior.clamp(r5, r4, r3)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.AnonymousClass1.clampViewPositionHorizontal(android.view.View, int, int):int");
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public int clampViewPositionVertical(@oo0oO0 View view, int i, int i2) {
            return view.getTop();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public int getViewHorizontalDragRange(@oo0oO0 View view) {
            return view.getWidth();
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewCaptured(@oo0oO0 View view, int i) {
            this.activePointerId = i;
            this.originalCapturedViewLeft = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewDragStateChanged(int i) {
            OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
            if (onDismissListener != null) {
                onDismissListener.onDragStateChanged(i);
            }
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewPositionChanged(@oo0oO0 View view, int i, int i2, int i3, int i4) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.alphaStartSwipeDistance) + this.originalCapturedViewLeft;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.alphaEndSwipeDistance) + this.originalCapturedViewLeft;
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.clamp(0.0f, 1.0f - SwipeDismissBehavior.fraction(width, width2, f), 1.0f));
            }
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public void onViewReleased(@oo0oO0 View view, float f, float f2) {
            int i;
            boolean z;
            OnDismissListener onDismissListener;
            this.activePointerId = -1;
            int width = view.getWidth();
            if (shouldDismiss(view, f)) {
                int left = view.getLeft();
                int i2 = this.originalCapturedViewLeft;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.originalCapturedViewLeft;
                z = false;
            }
            if (SwipeDismissBehavior.this.viewDragHelper.o0O00000(i, view.getTop())) {
                o0O0o00O.o0O0oo0O(view, new SettleRunnable(view, z));
            } else if (!z || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
            } else {
                onDismissListener.onDismiss(view);
            }
        }

        @Override // o0O00O.o00oOo0O.o00oOo00
        public boolean tryCaptureView(View view, int i) {
            int i2 = this.activePointerId;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.canSwipeDismissView(view);
        }
    };

    /* loaded from: classes2.dex */
    public interface OnDismissListener {
        void onDismiss(View view);

        void onDragStateChanged(int i);
    }

    /* loaded from: classes2.dex */
    public class SettleRunnable implements Runnable {
        private final boolean dismiss;
        private final View view;

        public SettleRunnable(View view, boolean z) {
            this.view = view;
            this.dismiss = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            OnDismissListener onDismissListener;
            o00oOo0O o00ooo0o2 = SwipeDismissBehavior.this.viewDragHelper;
            if (o00ooo0o2 != null && o00ooo0o2.o00oo0OO(true)) {
                o0O0o00O.o0O0oo0O(this.view, this);
            } else if (!this.dismiss || (onDismissListener = SwipeDismissBehavior.this.listener) == null) {
            } else {
                onDismissListener.onDismiss(this.view);
            }
        }
    }

    public static float clamp(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    public static int clamp(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void ensureViewDragHelper(ViewGroup viewGroup) {
        if (this.viewDragHelper == null) {
            this.viewDragHelper = this.sensitivitySet ? o00oOo0O.o00oo0O0(viewGroup, this.sensitivity, this.dragCallback) : o00oOo0O.o00oo0O(viewGroup, this.dragCallback);
        }
    }

    public static float fraction(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    private void updateAccessibilityActions(View view) {
        o0O0o00O.o0O0oO0(view, 1048576);
        if (canSwipeDismissView(view)) {
            o0O0o00O.o0O0oO(view, o00oo0O.o00oOOo0.f10058o00ooO0O, null, new o00ooO() { // from class: com.google.android.material.behavior.SwipeDismissBehavior.2
                @Override // o0O00.o00ooO
                public boolean perform(@oo0oO0 View view2, @o0OO00OO o00ooO.o00oOOo0 o00oooo02) {
                    boolean z = false;
                    if (SwipeDismissBehavior.this.canSwipeDismissView(view2)) {
                        boolean z2 = o0O0o00O.o0O000O(view2) == 1;
                        int i = SwipeDismissBehavior.this.swipeDirection;
                        if ((i == 0 && z2) || (i == 1 && !z2)) {
                            z = true;
                        }
                        int width = view2.getWidth();
                        if (z) {
                            width = -width;
                        }
                        view2.offsetLeftAndRight(width);
                        view2.setAlpha(0.0f);
                        OnDismissListener onDismissListener = SwipeDismissBehavior.this.listener;
                        if (onDismissListener != null) {
                            onDismissListener.onDismiss(view2);
                        }
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    public boolean canSwipeDismissView(@oo0oO0 View view) {
        return true;
    }

    public int getDragState() {
        o00oOo0O o00ooo0o2 = this.viewDragHelper;
        if (o00ooo0o2 != null) {
            return o00ooo0o2.o00ooOo0();
        }
        return 0;
    }

    @o0OO00OO
    @o0o0000
    public OnDismissListener getListener() {
        return this.listener;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public boolean onInterceptTouchEvent(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, @oo0oO0 MotionEvent motionEvent) {
        boolean z = this.interceptingEvents;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.isPointInChildBounds(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.interceptingEvents = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.interceptingEvents = false;
        }
        if (z) {
            ensureViewDragHelper(coordinatorLayout);
            return this.viewDragHelper.o0O0000O(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public boolean onLayoutChild(@oo0oO0 CoordinatorLayout coordinatorLayout, @oo0oO0 V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        if (o0O0o00O.o0O00000(v) == 0) {
            o0O0o00O.o00oo0OO.o00oo0o0(v, 1);
            updateAccessibilityActions(v);
        }
        return onLayoutChild;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.o00oOo00
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        o00oOo0O o00ooo0o2 = this.viewDragHelper;
        if (o00ooo0o2 != null) {
            o00ooo0o2.o00ooo0o(motionEvent);
            return true;
        }
        return false;
    }

    public void setDragDismissDistance(float f) {
        this.dragDismissThreshold = clamp(0.0f, f, 1.0f);
    }

    public void setEndAlphaSwipeDistance(float f) {
        this.alphaEndSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setListener(@o0OO00OO OnDismissListener onDismissListener) {
        this.listener = onDismissListener;
    }

    public void setSensitivity(float f) {
        this.sensitivity = f;
        this.sensitivitySet = true;
    }

    public void setStartAlphaSwipeDistance(float f) {
        this.alphaStartSwipeDistance = clamp(0.0f, f, 1.0f);
    }

    public void setSwipeDirection(int i) {
        this.swipeDirection = i;
    }
}
