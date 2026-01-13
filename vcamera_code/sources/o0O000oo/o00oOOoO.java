package o0O000oo;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import o00oOooO.o0OO0oO;
import o0O00.o00oo0O;
/* loaded from: classes.dex */
public class o00oOOoO {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* loaded from: classes.dex */
    public static final class o00oOOo0 extends View.AccessibilityDelegate {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOOoO f10421o00oOOo0;

        public o00oOOo0(o00oOOoO o00ooooo2) {
            this.f10421o00oOOo0 = o00ooooo2;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f10421o00oOOo0.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        @o00oOooO.o0OOooO0(16)
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            o0O00.o00oo accessibilityNodeProvider = this.f10421o00oOOo0.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.o00oOo0O();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10421o00oOOo0.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            o0O00.o00oo0O o0OO0Ooo2 = o0O00.o00oo0O.o0OO0Ooo(accessibilityNodeInfo);
            o0OO0Ooo2.o0O0ooOO(o0O0o00O.o0O0Ooo0(view));
            o0OO0Ooo2.o0O0o0oO(o0O0o00O.o0O0OOoO(view));
            o0OO0Ooo2.o0O0oOo(o0O0o00O.o00ooo00(view));
            o0OO0Ooo2.o0OO000(o0O0o00O.o0O00o(view));
            this.f10421o00oOOo0.onInitializeAccessibilityNodeInfo(view, o0OO0Ooo2);
            o0OO0Ooo2.o00oOo0o(accessibilityNodeInfo.getText(), view);
            List<o00oo0O.o00oOOo0> actionList = o00oOOoO.getActionList(view);
            for (int i = 0; i < actionList.size(); i++) {
                o0OO0Ooo2.o00oOOoO(actionList.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f10421o00oOOo0.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f10421o00oOOo0.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f10421o00oOOo0.performAccessibilityAction(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f10421o00oOOo0.sendAccessibilityEvent(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f10421o00oOOo0.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    @o00oOooO.o0OOooO0(16)
    /* renamed from: o0O000oo.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0132o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static AccessibilityNodeProvider o00oOOo0(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        @o00oOooO.o0O0O0Oo
        public static boolean o00oOOoO(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public o00oOOoO() {
        this(DEFAULT_DELEGATE);
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOOoO(@o00oOooO.oo0oO0 View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new o00oOOo0(this);
    }

    public static List<o00oo0O.o00oOOo0> getActionList(View view) {
        List<o00oo0O.o00oOOo0> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] o00ooO002 = o0O00.o00oo0O.o00ooO00(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; o00ooO002 != null && i < o00ooO002.length; i++) {
                if (clickableSpan.equals(o00ooO002[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (isSpanStillValid(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @o00oOooO.o0OO00OO
    public o0O00.o00oo getAccessibilityNodeProvider(@o00oOooO.oo0oO0 View view) {
        AccessibilityNodeProvider o00oOOo02 = C0132o00oOOoO.o00oOOo0(this.mOriginalDelegate, view);
        if (o00oOOo02 != null) {
            return new o0O00.o00oo(o00oOOo02);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 o0O00.o00oo0O o00oo0o2) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, o00oo0o2.o0OOooO0());
    }

    public void onPopulateAccessibilityEvent(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(@o00oOooO.oo0oO0 ViewGroup viewGroup, @o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(@o00oOooO.oo0oO0 View view, int i, @o00oOooO.o0OO00OO Bundle bundle) {
        List<o00oo0O.o00oOOo0> actionList = getActionList(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            o00oo0O.o00oOOo0 o00oooo02 = actionList.get(i2);
            if (o00oooo02.o00oOOoO() == i) {
                z = o00oooo02.o00oOooO(view, bundle);
                break;
            }
            i2++;
        }
        if (!z) {
            z = C0132o00oOOoO.o00oOOoO(this.mOriginalDelegate, view, i, bundle);
        }
        return (z || i != R.id.accessibility_action_clickable_span || bundle == null) ? z : performClickableSpanAction(bundle.getInt(o0O00.o00oOOo0.f9932o00oo0o0, -1), view);
    }

    public void sendAccessibilityEvent(@o00oOooO.oo0oO0 View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(@o00oOooO.oo0oO0 View view, @o00oOooO.oo0oO0 AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
