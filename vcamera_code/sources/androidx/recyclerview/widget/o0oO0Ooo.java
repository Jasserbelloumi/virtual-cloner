package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public class o0oO0Ooo extends o0O000oo.o00oOOoO {
    private final o00oOOo0 mItemDelegate;
    public final RecyclerView mRecyclerView;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o0O000oo.o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0oO0Ooo f4775o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public Map<View, o0O000oo.o00oOOoO> f4776o00oOOoO = new WeakHashMap();

        public o00oOOo0(@oo0oO0 o0oO0Ooo o0oo0ooo) {
            this.f4775o00oOOo0 = o0oo0ooo;
        }

        @Override // o0O000oo.o00oOOoO
        public boolean dispatchPopulateAccessibilityEvent(@oo0oO0 View view, @oo0oO0 AccessibilityEvent accessibilityEvent) {
            o0O000oo.o00oOOoO o00ooooo2 = this.f4776o00oOOoO.get(view);
            return o00ooooo2 != null ? o00ooooo2.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // o0O000oo.o00oOOoO
        @o0OO00OO
        public o0O00.o00oo getAccessibilityNodeProvider(@oo0oO0 View view) {
            o0O000oo.o00oOOoO o00ooooo2 = this.f4776o00oOOoO.get(view);
            return o00ooooo2 != null ? o00ooooo2.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        public o0O000oo.o00oOOoO o00oOOo0(View view) {
            return this.f4776o00oOOoO.remove(view);
        }

        public void o00oOOoO(View view) {
            o0O000oo.o00oOOoO o00ooOOo2 = o0O0o00O.o00ooOOo(view);
            if (o00ooOOo2 == null || o00ooOOo2 == this) {
                return;
            }
            this.f4776o00oOOoO.put(view, o00ooOOo2);
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityEvent(@oo0oO0 View view, @oo0oO0 AccessibilityEvent accessibilityEvent) {
            o0O000oo.o00oOOoO o00ooooo2 = this.f4776o00oOOoO.get(view);
            if (o00ooooo2 != null) {
                o00ooooo2.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityNodeInfo(View view, o0O00.o00oo0O o00oo0o2) {
            if (!this.f4775o00oOOo0.shouldIgnore() && this.f4775o00oOOo0.mRecyclerView.getLayoutManager() != null) {
                this.f4775o00oOOo0.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, o00oo0o2);
                o0O000oo.o00oOOoO o00ooooo2 = this.f4776o00oOOoO.get(view);
                if (o00ooooo2 != null) {
                    o00ooooo2.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
                    return;
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
        }

        @Override // o0O000oo.o00oOOoO
        public void onPopulateAccessibilityEvent(@oo0oO0 View view, @oo0oO0 AccessibilityEvent accessibilityEvent) {
            o0O000oo.o00oOOoO o00ooooo2 = this.f4776o00oOOoO.get(view);
            if (o00ooooo2 != null) {
                o00ooooo2.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // o0O000oo.o00oOOoO
        public boolean onRequestSendAccessibilityEvent(@oo0oO0 ViewGroup viewGroup, @oo0oO0 View view, @oo0oO0 AccessibilityEvent accessibilityEvent) {
            o0O000oo.o00oOOoO o00ooooo2 = this.f4776o00oOOoO.get(viewGroup);
            return o00ooooo2 != null ? o00ooooo2.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // o0O000oo.o00oOOoO
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (this.f4775o00oOOo0.shouldIgnore() || this.f4775o00oOOo0.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            o0O000oo.o00oOOoO o00ooooo2 = this.f4776o00oOOoO.get(view);
            if (o00ooooo2 != null) {
                if (o00ooooo2.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.f4775o00oOOo0.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        @Override // o0O000oo.o00oOOoO
        public void sendAccessibilityEvent(@oo0oO0 View view, int i) {
            o0O000oo.o00oOOoO o00ooooo2 = this.f4776o00oOOoO.get(view);
            if (o00ooooo2 != null) {
                o00ooooo2.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // o0O000oo.o00oOOoO
        public void sendAccessibilityEventUnchecked(@oo0oO0 View view, @oo0oO0 AccessibilityEvent accessibilityEvent) {
            o0O000oo.o00oOOoO o00ooooo2 = this.f4776o00oOOoO.get(view);
            if (o00ooooo2 != null) {
                o00ooooo2.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public o0oO0Ooo(@oo0oO0 RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        o0O000oo.o00oOOoO itemDelegate = getItemDelegate();
        this.mItemDelegate = (itemDelegate == null || !(itemDelegate instanceof o00oOOo0)) ? new o00oOOo0(this) : (o00oOOo0) itemDelegate;
    }

    @oo0oO0
    public o0O000oo.o00oOOoO getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // o0O000oo.o00oOOoO
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // o0O000oo.o00oOOoO
    public void onInitializeAccessibilityNodeInfo(View view, o0O00.o00oo0O o00oo0o2) {
        super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(o00oo0o2);
    }

    @Override // o0O000oo.o00oOOoO
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
