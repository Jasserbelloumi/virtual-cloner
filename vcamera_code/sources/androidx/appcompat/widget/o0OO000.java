package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import o00oOooO.o0OO0oO;
@o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0OO000 extends o0oOo0O0 implements o0O {

    /* renamed from: o0O00O0o  reason: collision with root package name */
    public static Method f1267o0O00O0o = null;

    /* renamed from: o0OoO00O  reason: collision with root package name */
    public static final String f1268o0OoO00O = "MenuPopupWindow";

    /* renamed from: o0O00O0  reason: collision with root package name */
    public o0O f1269o0O00O0;

    @o00oOooO.o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        @o00oOooO.o0O0O0Oo
        public static void o00oOOoO(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    @o00oOooO.o0OOooO0(29)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o00oOooO.o0O0O0Oo
        public static void o00oOOo0(PopupWindow popupWindow, boolean z) {
            popupWindow.setTouchModal(z);
        }
    }

    @o00oOooO.o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class o00oOo00 extends oo0OOoo {

        /* renamed from: o00ooOOo  reason: collision with root package name */
        public final int f1270o00ooOOo;

        /* renamed from: o00ooOo  reason: collision with root package name */
        public o0O f1271o00ooOo;

        /* renamed from: o00ooOo0  reason: collision with root package name */
        public final int f1272o00ooOo0;

        /* renamed from: o00ooOoO  reason: collision with root package name */
        public MenuItem f1273o00ooOoO;

        @o00oOooO.o0OOooO0(17)
        /* loaded from: classes.dex */
        public static class o00oOOo0 {
            @o00oOooO.o0O0O0Oo
            public static int o00oOOo0(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public o00oOo00(Context context, boolean z) {
            super(context, z);
            if (1 == o00oOOo0.o00oOOo0(context.getResources().getConfiguration())) {
                this.f1270o00ooOOo = 21;
                this.f1272o00ooOo0 = 22;
                return;
            }
            this.f1270o00ooOOo = 22;
            this.f1272o00ooOo0 = 21;
        }

        @Override // androidx.appcompat.widget.oo0OOoo, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.oo0OOoo, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.oo0OOoo, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.oo0OOoo, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.oo0OOoo
        public /* bridge */ /* synthetic */ int o00oOo0O(int i, int i2, int i3, int i4, int i5) {
            return super.o00oOo0O(i, i2, i3, i4, i5);
        }

        @Override // androidx.appcompat.widget.oo0OOoo
        public /* bridge */ /* synthetic */ boolean o00oOo0o(MotionEvent motionEvent, int i) {
            return super.o00oOo0o(motionEvent, i);
        }

        @Override // androidx.appcompat.widget.oo0OOoo
        public /* bridge */ /* synthetic */ int o00oOooO(int i, boolean z) {
            return super.o00oOooO(i, z);
        }

        public void o00oo0OO() {
            setSelection(-1);
        }

        @Override // androidx.appcompat.widget.oo0OOoo, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            int pointToPosition;
            int i2;
            if (this.f1271o00ooOo != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                }
                androidx.appcompat.view.menu.o00oOo0O o00ooo0o2 = (androidx.appcompat.view.menu.o00oOo0O) adapter;
                androidx.appcompat.view.menu.o00oo0OO o00oo0oo = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < o00ooo0o2.getCount()) {
                    o00oo0oo = o00ooo0o2.getItem(i2);
                }
                MenuItem menuItem = this.f1273o00ooOoO;
                if (menuItem != o00oo0oo) {
                    androidx.appcompat.view.menu.o00oOoO o00oOOoO2 = o00ooo0o2.o00oOOoO();
                    if (menuItem != null) {
                        this.f1271o00ooOo.o00oo0(o00oOOoO2, menuItem);
                    }
                    this.f1273o00ooOoO = o00oo0oo;
                    if (o00oo0oo != null) {
                        this.f1271o00ooOo.o00oOo00(o00oOOoO2, o00oo0oo);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1270o00ooOOo) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1272o00ooOo0) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((androidx.appcompat.view.menu.o00oOo0O) adapter).o00oOOoO().close(false);
                return true;
            }
        }

        @Override // androidx.appcompat.widget.oo0OOoo, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(o0O o0o) {
            this.f1271o00ooOo = o0o;
        }

        @Override // androidx.appcompat.widget.oo0OOoo, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f1267o0O00O0o = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public o0OO000(@o00oOooO.oo0oO0 Context context, @o00oOooO.o0OO00OO AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.appcompat.widget.o0O
    public void o00oOo00(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @o00oOooO.oo0oO0 MenuItem menuItem) {
        o0O o0o = this.f1269o0O00O0;
        if (o0o != null) {
            o0o.o00oOo00(o00oooo2, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.o0O
    public void o00oo0(@o00oOooO.oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @o00oOooO.oo0oO0 MenuItem menuItem) {
        o0O o0o = this.f1269o0O00O0;
        if (o0o != null) {
            o0o.o00oo0(o00oooo2, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.o0oOo0O0
    @o00oOooO.oo0oO0
    public oo0OOoo o00oo0o0(Context context, boolean z) {
        o00oOo00 o00ooo002 = new o00oOo00(context, z);
        o00ooo002.setHoverListener(this);
        return o00ooo002;
    }

    public void o0O00OOO(Object obj) {
        o00oOOo0.o00oOOo0(this.f1476o0, (Transition) obj);
    }

    public void o0O00Oo(Object obj) {
        o00oOOo0.o00oOOoO(this.f1476o0, (Transition) obj);
    }

    public void o0O00OoO(boolean z) {
        if (Build.VERSION.SDK_INT > 28) {
            o00oOOoO.o00oOOo0(this.f1476o0, z);
            return;
        }
        Method method = f1267o0O00O0o;
        if (method != null) {
            try {
                method.invoke(this.f1476o0, Boolean.valueOf(z));
            } catch (Exception unused) {
            }
        }
    }

    public void o0oO0Ooo(o0O o0o) {
        this.f1269o0O00O0 = o0o;
    }
}
