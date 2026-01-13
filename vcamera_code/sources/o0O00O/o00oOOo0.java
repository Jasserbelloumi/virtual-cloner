package o0O00O;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.o00ooO;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O00.o00oOOoO;
import o0O00.o00oo;
import o0O00.o00oo0O;
import o0O00.o00ooO0;
import o0O000oo.o0O0o00O;
import o0O00O.o00oOOoO;
/* loaded from: classes.dex */
public abstract class o00oOOo0 extends o0O000oo.o00oOOoO {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final o00oOOoO.o00oOOo0<o00oo0O> NODE_ADAPTER = new C0136o00oOOo0();
    private static final o00oOOoO.InterfaceC0137o00oOOoO<o00ooO<o00oo0O>, o00oo0O> SPARSE_VALUES_ADAPTER = new o00oOOoO();
    private final View mHost;
    private final AccessibilityManager mManager;
    private o00oOo00 mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    public int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    public int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* renamed from: o0O00O.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0136o00oOOo0 implements o00oOOoO.o00oOOo0<o00oo0O> {
        @Override // o0O00O.o00oOOoO.o00oOOo0
        /* renamed from: o00oOOoO */
        public void o00oOOo0(o00oo0O o00oo0o2, Rect rect) {
            o00oo0o2.o00oo0o0(rect);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOOoO implements o00oOOoO.InterfaceC0137o00oOOoO<o00ooO<o00oo0O>, o00oo0O> {
        @Override // o0O00O.o00oOOoO.InterfaceC0137o00oOOoO
        /* renamed from: o00oOo00 */
        public o00oo0O o00oOOo0(o00ooO<o00oo0O> o00ooo, int i) {
            return o00ooo.o00ooOO0(i);
        }

        @Override // o0O00O.o00oOOoO.InterfaceC0137o00oOOoO
        /* renamed from: o00oOooO */
        public int o00oOOoO(o00ooO<o00oo0O> o00ooo) {
            return o00ooo.o00ooO();
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 extends o00oo {
        public o00oOo00() {
        }

        @Override // o0O00.o00oo
        public o00oo0O o00oOOoO(int i) {
            return o00oo0O.o0O0OO(o00oOOo0.this.obtainAccessibilityNodeInfo(i));
        }

        @Override // o0O00.o00oo
        public boolean o00oOo0o(int i, int i2, Bundle bundle) {
            return o00oOOo0.this.performAction(i, i2, bundle);
        }

        @Override // o0O00.o00oo
        public o00oo0O o00oOooO(int i) {
            int i2 = i == 2 ? o00oOOo0.this.mAccessibilityFocusedVirtualViewId : o00oOOo0.this.mKeyboardFocusedVirtualViewId;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return o00oOOoO(i2);
        }
    }

    public o00oOOo0(@oo0oO0 View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (o0O0o00O.o0O00000(view) == 0) {
            o0O0o00O.o00oo0OO.o00oo0o0(view, 1);
        }
    }

    private boolean clearAccessibilityFocus(int i) {
        if (this.mAccessibilityFocusedVirtualViewId == i) {
            this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
            this.mHost.invalidate();
            sendEventForVirtualView(i, 65536);
            return true;
        }
        return false;
    }

    private boolean clickKeyboardFocusedVirtualView() {
        int i = this.mKeyboardFocusedVirtualViewId;
        return i != Integer.MIN_VALUE && onPerformActionForVirtualView(i, 16, null);
    }

    private AccessibilityEvent createEvent(int i, int i2) {
        return i != -1 ? createEventForChild(i, i2) : createEventForHost(i2);
    }

    private AccessibilityEvent createEventForChild(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        o00oo0O obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i);
        obtain.getText().add(obtainAccessibilityNodeInfo.o0O00000());
        obtain.setContentDescription(obtainAccessibilityNodeInfo.o00ooO0o());
        obtain.setScrollable(obtainAccessibilityNodeInfo.o0O0oo0o());
        obtain.setPassword(obtainAccessibilityNodeInfo.o0O0O0O());
        obtain.setEnabled(obtainAccessibilityNodeInfo.o0O00OoO());
        obtain.setChecked(obtainAccessibilityNodeInfo.o0O00O0o());
        onPopulateEventForVirtualView(i, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(obtainAccessibilityNodeInfo.o00oo());
        o00ooO0.o00oOOoO.o00oOOo0(obtain, this.mHost, i);
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        return obtain;
    }

    private AccessibilityEvent createEventForHost(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.mHost.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    @oo0oO0
    private o00oo0O createNodeForChild(int i) {
        o00oo0O o0ooO2 = o00oo0O.o0ooO();
        o0ooO2.o0O0o0Oo(true);
        o0ooO2.o0O0o0o(true);
        o0ooO2.o0O0Ooo0(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        o0ooO2.o0O0Oooo(rect);
        o0ooO2.o0O0OoO0(rect);
        o0ooO2.o0O0oOoO(this.mHost);
        onPopulateNodeForVirtualView(i, o0ooO2);
        if (o0ooO2.o0O00000() == null && o0ooO2.o00ooO0o() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        o0ooO2.o00oo0o0(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int o00oo0O02 = o0ooO2.o00oo0O0();
        if ((o00oo0O02 & 64) == 0) {
            if ((o00oo0O02 & 128) == 0) {
                o0ooO2.oo0oOOo(this.mHost.getContext().getPackageName());
                o0ooO2.o0O(this.mHost, i);
                if (this.mAccessibilityFocusedVirtualViewId == i) {
                    o0ooO2.o0O0Oo0O(true);
                    o0ooO2.o00oOOo0(128);
                } else {
                    o0ooO2.o0O0Oo0O(false);
                    o0ooO2.o00oOOo0(64);
                }
                boolean z = this.mKeyboardFocusedVirtualViewId == i;
                if (z) {
                    o0ooO2.o00oOOo0(2);
                } else if (o0ooO2.o0O00Ooo()) {
                    o0ooO2.o00oOOo0(1);
                }
                o0ooO2.o0oOo0O0(z);
                this.mHost.getLocationOnScreen(this.mTempGlobalRect);
                o0ooO2.o00oo0o(this.mTempScreenRect);
                if (this.mTempScreenRect.equals(rect)) {
                    o0ooO2.o00oo0o0(this.mTempScreenRect);
                    if (o0ooO2.f10034o00oOOoO != -1) {
                        o00oo0O o0ooO3 = o00oo0O.o0ooO();
                        for (int i2 = o0ooO2.f10034o00oOOoO; i2 != -1; i2 = o0ooO3.f10034o00oOOoO) {
                            o0ooO3.o0O0oOoo(this.mHost, -1);
                            o0ooO3.o0O0Oooo(INVALID_PARENT_BOUNDS);
                            onPopulateNodeForVirtualView(i2, o0ooO3);
                            o0ooO3.o00oo0o0(this.mTempParentRect);
                            Rect rect2 = this.mTempScreenRect;
                            Rect rect3 = this.mTempParentRect;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        o0ooO3.o0O0OOOo();
                    }
                    this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                }
                if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
                    this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
                    if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                        o0ooO2.o0O0OoO0(this.mTempScreenRect);
                        if (isVisibleToUser(this.mTempScreenRect)) {
                            o0ooO2.o0OO0OoO(true);
                        }
                    }
                }
                return o0ooO2;
            }
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    @oo0oO0
    private o00oo0O createNodeForHost() {
        o00oo0O o0O0OO02 = o00oo0O.o0O0OO0(this.mHost);
        o0O0o00O.o0O0o0OO(this.mHost, o0O0OO02);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (o0O0OO02.o0O0o() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                o0O0OO02.o00oOooO(this.mHost, ((Integer) arrayList.get(i)).intValue());
            }
            return o0O0OO02;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    private o00ooO<o00oo0O> getAllNodes() {
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        o00ooO<o00oo0O> o00ooo = new o00ooO<>();
        for (int i = 0; i < arrayList.size(); i++) {
            o00ooo.o00oo0Oo(((Integer) arrayList.get(i)).intValue(), createNodeForChild(((Integer) arrayList.get(i)).intValue()));
        }
        return o00ooo;
    }

    private void getBoundsInParent(int i, Rect rect) {
        obtainAccessibilityNodeInfo(i).o00oo0o0(rect);
    }

    private static Rect guessPreviouslyFocusedRect(@oo0oO0 View view, int i, @oo0oO0 Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean isVisibleToUser(Rect rect) {
        if (rect == null || rect.isEmpty() || this.mHost.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.mHost;
        do {
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private static int keyToDirection(int i) {
        if (i != 19) {
            if (i != 21) {
                if (i != 22) {
                    return TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
                }
                return 66;
            }
            return 17;
        }
        return 33;
    }

    private boolean moveFocus(int i, @o0OO00OO Rect rect) {
        Object o00oOooO2;
        o00ooO<o00oo0O> allNodes = getAllNodes();
        int i2 = this.mKeyboardFocusedVirtualViewId;
        o00oo0O o00oOooo2 = i2 == Integer.MIN_VALUE ? null : allNodes.o00oOooo(i2);
        if (i == 1 || i == 2) {
            o00oOooO2 = o0O00O.o00oOOoO.o00oOooO(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, o00oOooo2, i, o0O0o00O.o0O000O(this.mHost) == 1, false);
        } else if (i != 17 && i != 33 && i != 66 && i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } else {
            Rect rect2 = new Rect();
            int i3 = this.mKeyboardFocusedVirtualViewId;
            if (i3 != Integer.MIN_VALUE) {
                getBoundsInParent(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                guessPreviouslyFocusedRect(this.mHost, i, rect2);
            }
            o00oOooO2 = o0O00O.o00oOOoO.o00oOo00(allNodes, SPARSE_VALUES_ADAPTER, NODE_ADAPTER, o00oOooo2, rect2, i);
        }
        o00oo0O o00oo0o2 = (o00oo0O) o00oOooO2;
        return requestKeyboardFocusForVirtualView(o00oo0o2 != null ? allNodes.o00oo0O(allNodes.o00oo0OO(o00oo0o2)) : Integer.MIN_VALUE);
    }

    private boolean performActionForChild(int i, int i2, Bundle bundle) {
        return i2 != 1 ? i2 != 2 ? i2 != 64 ? i2 != 128 ? onPerformActionForVirtualView(i, i2, bundle) : clearAccessibilityFocus(i) : requestAccessibilityFocus(i) : clearKeyboardFocusForVirtualView(i) : requestKeyboardFocusForVirtualView(i);
    }

    private boolean performActionForHost(int i, Bundle bundle) {
        return o0O0o00O.o0O0o0o(this.mHost, i, bundle);
    }

    private boolean requestAccessibilityFocus(int i) {
        int i2;
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled() && (i2 = this.mAccessibilityFocusedVirtualViewId) != i) {
            if (i2 != Integer.MIN_VALUE) {
                clearAccessibilityFocus(i2);
            }
            this.mAccessibilityFocusedVirtualViewId = i;
            this.mHost.invalidate();
            sendEventForVirtualView(i, 32768);
            return true;
        }
        return false;
    }

    private void updateHoveredVirtualView(int i) {
        int i2 = this.mHoveredVirtualViewId;
        if (i2 == i) {
            return;
        }
        this.mHoveredVirtualViewId = i;
        sendEventForVirtualView(i, 128);
        sendEventForVirtualView(i2, 256);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i) {
        if (this.mKeyboardFocusedVirtualViewId != i) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i, false);
        sendEventForVirtualView(i, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@oo0oO0 MotionEvent motionEvent) {
        if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
                updateHoveredVirtualView(virtualViewAt);
                return virtualViewAt != Integer.MIN_VALUE;
            } else if (action == 10 && this.mHoveredVirtualViewId != Integer.MIN_VALUE) {
                updateHoveredVirtualView(Integer.MIN_VALUE);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean dispatchKeyEvent(@oo0oO0 KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return moveFocus(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return moveFocus(1, null);
                }
                return false;
            }
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (keyEvent.hasNoModifiers()) {
                            int keyToDirection = keyToDirection(keyCode);
                            int repeatCount = keyEvent.getRepeatCount() + 1;
                            boolean z = false;
                            while (i < repeatCount && moveFocus(keyToDirection, null)) {
                                i++;
                                z = true;
                            }
                            return z;
                        }
                        return false;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                clickKeyboardFocusedVirtualView();
                return true;
            }
            return false;
        }
        return false;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // o0O000oo.o00oOOoO
    public o00oo getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new o00oOo00();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f, float f2);

    public abstract void getVisibleVirtualViews(List<Integer> list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i) {
        invalidateVirtualView(i, 0);
    }

    public final void invalidateVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent createEvent = createEvent(i, 2048);
        o00oOOoO.C0118o00oOOoO.o00oOOoO(createEvent, i2);
        parent.requestSendAccessibilityEvent(this.mHost, createEvent);
    }

    @oo0oO0
    public o00oo0O obtainAccessibilityNodeInfo(int i) {
        return i == -1 ? createNodeForHost() : createNodeForChild(i);
    }

    public final void onFocusChanged(boolean z, int i, @o0OO00OO Rect rect) {
        int i2 = this.mKeyboardFocusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i2);
        }
        if (z) {
            moveFocus(i, rect);
        }
    }

    @Override // o0O000oo.o00oOOoO
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // o0O000oo.o00oOOoO
    public void onInitializeAccessibilityNodeInfo(View view, o00oo0O o00oo0o2) {
        super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
        onPopulateNodeForHost(o00oo0o2);
    }

    public abstract boolean onPerformActionForVirtualView(int i, int i2, @o0OO00OO Bundle bundle);

    public void onPopulateEventForHost(@oo0oO0 AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i, @oo0oO0 AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@oo0oO0 o00oo0O o00oo0o2) {
    }

    public abstract void onPopulateNodeForVirtualView(int i, @oo0oO0 o00oo0O o00oo0o2);

    public void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
    }

    public boolean performAction(int i, int i2, Bundle bundle) {
        return i != -1 ? performActionForChild(i, i2, bundle) : performActionForHost(i2, bundle);
    }

    public final boolean requestKeyboardFocusForVirtualView(int i) {
        int i2;
        if ((this.mHost.isFocused() || this.mHost.requestFocus()) && (i2 = this.mKeyboardFocusedVirtualViewId) != i) {
            if (i2 != Integer.MIN_VALUE) {
                clearKeyboardFocusForVirtualView(i2);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.mKeyboardFocusedVirtualViewId = i;
            onVirtualViewKeyboardFocusChanged(i, true);
            sendEventForVirtualView(i, 8);
            return true;
        }
        return false;
    }

    public final boolean sendEventForVirtualView(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, createEvent(i, i2));
    }
}
