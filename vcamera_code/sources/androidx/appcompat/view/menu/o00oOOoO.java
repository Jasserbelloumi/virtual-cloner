package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.widget.o0O;
import androidx.appcompat.widget.o0OO000;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0O000Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO0OO;
import o00oOooO.oo0oO0;
import o0O000oo.o0O0o00O;
/* loaded from: classes.dex */
public final class o00oOOoO extends o00oOoo0.o0O0o implements o00oo0O, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: o00oooo  reason: collision with root package name */
    public static final int f576o00oooo = 0;

    /* renamed from: o00oooo0  reason: collision with root package name */
    public static final int f577o00oooo0 = R.layout.abc_cascading_menu_item_layout;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public static final int f578o00ooooO = 1;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public static final int f579o00ooooo = 200;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final Context f581o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f582o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final int f583o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final int f584o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final boolean f585o00oo0oO;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public View f591o00ooOO;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public View f593o00ooOOo;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public boolean f594o00ooOo;

    /* renamed from: o00ooOoO  reason: collision with root package name */
    public boolean f596o00ooOoO;

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public int f597o00ooOoo;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public int f599o00ooo00;

    /* renamed from: o00ooo0O  reason: collision with root package name */
    public boolean f600o00ooo0O;

    /* renamed from: o00ooo0o  reason: collision with root package name */
    public o00oo0O.o00oOOo0 f601o00ooo0o;

    /* renamed from: o00oooO  reason: collision with root package name */
    public ViewTreeObserver f602o00oooO;

    /* renamed from: o00oooOO  reason: collision with root package name */
    public PopupWindow.OnDismissListener f603o00oooOO;

    /* renamed from: o00oooOo  reason: collision with root package name */
    public boolean f604o00oooOo;

    /* renamed from: o0O0o  reason: collision with root package name */
    public final Handler f605o0O0o;

    /* renamed from: o00oo  reason: collision with root package name */
    public final List<androidx.appcompat.view.menu.o00oOoO> f580o00oo = new ArrayList();

    /* renamed from: o00ooO00  reason: collision with root package name */
    public final List<o00oOo0O> f588o00ooO00 = new ArrayList();

    /* renamed from: o00ooO0  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f587o00ooO0 = new o00oOOo0();

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public final View.OnAttachStateChangeListener f589o00ooO0O = new View$OnAttachStateChangeListenerC0006o00oOOoO();

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public final o0O f590o00ooO0o = new o00oOo00();

    /* renamed from: o00ooO  reason: collision with root package name */
    public int f586o00ooO = 0;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public int f592o00ooOO0 = 0;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public boolean f598o00ooo0 = false;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public int f595o00ooOo0 = o00oo0oO();

    /* loaded from: classes.dex */
    public class o00oOOo0 implements ViewTreeObserver.OnGlobalLayoutListener {
        public o00oOOo0() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!o00oOOoO.this.o00oOOo0() || o00oOOoO.this.f588o00ooO00.size() <= 0 || o00oOOoO.this.f588o00ooO00.get(0).f613o00oOOo0.o00ooo00()) {
                return;
            }
            View view = o00oOOoO.this.f593o00ooOOo;
            if (view == null || !view.isShown()) {
                o00oOOoO.this.dismiss();
                return;
            }
            for (o00oOo0O o00ooo0o2 : o00oOOoO.this.f588o00ooO00) {
                o00ooo0o2.f613o00oOOo0.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.o00oOOoO$o00oOOoO  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class View$OnAttachStateChangeListenerC0006o00oOOoO implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0006o00oOOoO() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = o00oOOoO.this.f602o00oooO;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    o00oOOoO.this.f602o00oooO = view.getViewTreeObserver();
                }
                o00oOOoO o00ooooo2 = o00oOOoO.this;
                o00ooooo2.f602o00oooO.removeGlobalOnLayoutListener(o00ooooo2.f587o00ooO0);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: classes.dex */
    public class o00oOo00 implements o0O {

        /* loaded from: classes.dex */
        public class o00oOOo0 implements Runnable {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ MenuItem f609o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o00oOo0O f610o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.view.menu.o00oOoO f611o00oo0Oo;

            public o00oOOo0(o00oOo0O o00ooo0o2, MenuItem menuItem, androidx.appcompat.view.menu.o00oOoO o00oooo2) {
                this.f610o00oo0O0 = o00ooo0o2;
                this.f609o00oo0O = menuItem;
                this.f611o00oo0Oo = o00oooo2;
            }

            @Override // java.lang.Runnable
            public void run() {
                o00oOo0O o00ooo0o2 = this.f610o00oo0O0;
                if (o00ooo0o2 != null) {
                    o00oOOoO.this.f604o00oooOo = true;
                    o00ooo0o2.f614o00oOOoO.close(false);
                    o00oOOoO.this.f604o00oooOo = false;
                }
                if (this.f609o00oo0O.isEnabled() && this.f609o00oo0O.hasSubMenu()) {
                    this.f611o00oo0Oo.performItemAction(this.f609o00oo0O, 4);
                }
            }
        }

        public o00oOo00() {
        }

        @Override // androidx.appcompat.widget.o0O
        public void o00oOo00(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem) {
            o00oOOoO.this.f605o0O0o.removeCallbacksAndMessages(null);
            int size = o00oOOoO.this.f588o00ooO00.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (o00oooo2 == o00oOOoO.this.f588o00ooO00.get(i).f614o00oOOoO) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            o00oOOoO.this.f605o0O0o.postAtTime(new o00oOOo0(i2 < o00oOOoO.this.f588o00ooO00.size() ? o00oOOoO.this.f588o00ooO00.get(i2) : null, menuItem, o00oooo2), o00oooo2, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.o0O
        public void o00oo0(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @oo0oO0 MenuItem menuItem) {
            o00oOOoO.this.f605o0O0o.removeCallbacksAndMessages(o00oooo2);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0OO000 f613o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final androidx.appcompat.view.menu.o00oOoO f614o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final int f615o00oOo00;

        public o00oOo0O(@oo0oO0 o0OO000 o0oo000, @oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, int i) {
            this.f613o00oOOo0 = o0oo000;
            this.f614o00oOOoO = o00oooo2;
            this.f615o00oOo00 = i;
        }

        public ListView o00oOOo0() {
            return this.f613o00oOOo0.o00oo0OO();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface o00oOoO {
    }

    public o00oOOoO(@oo0oO0 Context context, @oo0oO0 View view, @o0O000Oo int i, @o0OOO0OO int i2, boolean z) {
        this.f581o00oo0O = context;
        this.f591o00ooOO = view;
        this.f584o00oo0o0 = i;
        this.f583o00oo0o = i2;
        this.f585o00oo0oO = z;
        Resources resources = context.getResources();
        this.f582o00oo0Oo = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f605o0O0o = new Handler();
    }

    @Override // o00oOoo0.o00ooO0
    public void dismiss() {
        int size = this.f588o00ooO00.size();
        if (size > 0) {
            o00oOo0O[] o00ooo0oArr = (o00oOo0O[]) this.f588o00ooO00.toArray(new o00oOo0O[size]);
            for (int i = size - 1; i >= 0; i--) {
                o00oOo0O o00ooo0o2 = o00ooo0oArr[i];
                if (o00ooo0o2.f613o00oOOo0.o00oOOo0()) {
                    o00ooo0o2.f613o00oOOo0.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean flagActionItems() {
        return false;
    }

    @Override // o00oOoo0.o00ooO0
    public boolean o00oOOo0() {
        return this.f588o00ooO00.size() > 0 && this.f588o00ooO00.get(0).f613o00oOOo0.o00oOOo0();
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOOoO(androidx.appcompat.view.menu.o00oOoO o00oooo2) {
        o00oooo2.addMenuPresenter(this, this.f581o00oo0O);
        if (o00oOOo0()) {
            o00oo(o00oooo2);
        } else {
            this.f580o00oo.add(o00oooo2);
        }
    }

    @Override // o00oOoo0.o0O0o
    public boolean o00oOo00() {
        return false;
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOo0o(@oo0oO0 View view) {
        if (this.f591o00ooOO != view) {
            this.f591o00ooOO = view;
            this.f592o00ooOO0 = Gravity.getAbsoluteGravity(this.f586o00ooO, o0O0o00O.o0O000O(view));
        }
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOoO(boolean z) {
        this.f598o00ooo0 = z;
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOoOO(int i) {
        if (this.f586o00ooO != i) {
            this.f586o00ooO = i;
            this.f592o00ooOO0 = Gravity.getAbsoluteGravity(i, o0O0o00O.o0O000O(this.f591o00ooOO));
        }
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOoOo(int i) {
        this.f594o00ooOo = true;
        this.f597o00ooOoo = i;
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOoo0(PopupWindow.OnDismissListener onDismissListener) {
        this.f603o00oooOO = onDismissListener;
    }

    @Override // o00oOoo0.o0O0o
    public void o00oOooo(boolean z) {
        this.f600o00ooo0O = z;
    }

    public final void o00oo(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
        o00oOo0O o00ooo0o2;
        View view;
        int width;
        LayoutInflater from = LayoutInflater.from(this.f581o00oo0O);
        androidx.appcompat.view.menu.o00oOo0O o00ooo0o3 = new androidx.appcompat.view.menu.o00oOo0O(o00oooo2, from, this.f585o00oo0oO, f577o00oooo0);
        if (!o00oOOo0() && this.f598o00ooo0) {
            o00ooo0o3.f632o00oo0Oo = true;
        } else if (o00oOOo0()) {
            o00ooo0o3.f632o00oo0Oo = o00oOoo0.o0O0o.o00oo0(o00oooo2);
        }
        int o00oOo0O2 = o00oOoo0.o0O0o.o00oOo0O(o00ooo0o3, null, this.f581o00oo0O, this.f582o00oo0Oo);
        o0OO000 o00oo0O2 = o00oo0O();
        o00oo0O2.o00oo00O(o00ooo0o3);
        o00oo0O2.o00ooooO(o00oOo0O2);
        o00oo0O2.o0(this.f592o00ooOO0);
        if (this.f588o00ooO00.size() > 0) {
            List<o00oOo0O> list = this.f588o00ooO00;
            o00ooo0o2 = list.get(list.size() - 1);
            view = o00oo0o(o00ooo0o2, o00oooo2);
        } else {
            o00ooo0o2 = null;
            view = null;
        }
        if (view != null) {
            o00oo0O2.o0O00OoO(false);
            o00oo0O2.o0O00OOO(null);
            int o0O0o2 = o0O0o(o00oOo0O2);
            boolean z = o0O0o2 == 1;
            this.f595o00ooOo0 = o0O0o2;
            o00oo0O2.o00oooo0(view);
            if ((this.f592o00ooOO0 & 5) != 5) {
                if (z) {
                    width = view.getWidth() + 0;
                    o00oo0O2.o00oOooO(width);
                    o00oo0O2.o0ooOoOO(true);
                    o00oo0O2.o00oOoO(0);
                }
                width = 0 - o00oOo0O2;
                o00oo0O2.o00oOooO(width);
                o00oo0O2.o0ooOoOO(true);
                o00oo0O2.o00oOoO(0);
            } else if (z) {
                width = o00oOo0O2 + 0;
                o00oo0O2.o00oOooO(width);
                o00oo0O2.o0ooOoOO(true);
                o00oo0O2.o00oOoO(0);
            } else {
                o00oOo0O2 = view.getWidth();
                width = 0 - o00oOo0O2;
                o00oo0O2.o00oOooO(width);
                o00oo0O2.o0ooOoOO(true);
                o00oo0O2.o00oOoO(0);
            }
        } else {
            if (this.f594o00ooOo) {
                o00oo0O2.o00oOooO(this.f597o00ooOoo);
            }
            if (this.f596o00ooOoO) {
                o00oo0O2.o00oOoO(this.f599o00ooo00);
            }
            o00oo0O2.o0O00000(this.f7125o00oo0O0);
        }
        this.f588o00ooO00.add(new o00oOo0O(o00oo0O2, o00oooo2, this.f595o00ooOo0));
        o00oo0O2.show();
        ListView o00oo0OO2 = o00oo0O2.o00oo0OO();
        o00oo0OO2.setOnKeyListener(this);
        if (o00ooo0o2 == null && this.f600o00ooo0O && o00oooo2.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) o00oo0OO2, false);
            frameLayout.setEnabled(false);
            ((TextView) frameLayout.findViewById(16908310)).setText(o00oooo2.getHeaderTitle());
            o00oo0OO2.addHeaderView(frameLayout, null, false);
            o00oo0O2.show();
        }
    }

    @Override // o00oOoo0.o0O0o
    public void o00oo00O(int i) {
        this.f596o00ooOoO = true;
        this.f599o00ooo00 = i;
    }

    public final o0OO000 o00oo0O() {
        o0OO000 o0oo000 = new o0OO000(this.f581o00oo0O, null, this.f584o00oo0o0, this.f583o00oo0o);
        o0oo000.f1269o0O00O0 = this.f590o00ooO0o;
        o0oo000.f1497o00ooo00 = this;
        o0oo000.o0OoOoOO(this);
        o0oo000.f1494o00ooOoO = this.f591o00ooOO;
        o0oo000.f1488o00ooO0o = this.f592o00ooOO0;
        o0oo000.o0O000Oo(true);
        o0oo000.o0O000(2);
        return o0oo000;
    }

    @Override // o00oOoo0.o00ooO0
    public ListView o00oo0OO() {
        if (this.f588o00ooO00.isEmpty()) {
            return null;
        }
        List<o00oOo0O> list = this.f588o00ooO00;
        return list.get(list.size() - 1).o00oOOo0();
    }

    public final int o00oo0Oo(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
        int size = this.f588o00ooO00.size();
        for (int i = 0; i < size; i++) {
            if (o00oooo2 == this.f588o00ooO00.get(i).f614o00oOOoO) {
                return i;
            }
        }
        return -1;
    }

    @o0OO00OO
    public final View o00oo0o(@oo0oO0 o00oOo0O o00ooo0o2, @oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2) {
        androidx.appcompat.view.menu.o00oOo0O o00ooo0o3;
        int i;
        int firstVisiblePosition;
        MenuItem o00oo0o02 = o00oo0o0(o00ooo0o2.f614o00oOOoO, o00oooo2);
        if (o00oo0o02 == null) {
            return null;
        }
        ListView o00oOOo02 = o00ooo0o2.o00oOOo0();
        ListAdapter adapter = o00oOOo02.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            o00ooo0o3 = (androidx.appcompat.view.menu.o00oOo0O) headerViewListAdapter.getWrappedAdapter();
        } else {
            o00ooo0o3 = (androidx.appcompat.view.menu.o00oOo0O) adapter;
            i = 0;
        }
        int count = o00ooo0o3.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (o00oo0o02 == o00ooo0o3.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - o00oOOo02.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < o00oOOo02.getChildCount()) {
            return o00oOOo02.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final MenuItem o00oo0o0(@oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo2, @oo0oO0 androidx.appcompat.view.menu.o00oOoO o00oooo3) {
        int size = o00oooo2.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = o00oooo2.getItem(i);
            if (item.hasSubMenu() && o00oooo3 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final int o00oo0oO() {
        return o0O0o00O.o0O000O(this.f591o00ooOO) == 1 ? 0 : 1;
    }

    public final int o0O0o(int i) {
        List<o00oOo0O> list = this.f588o00ooO00;
        ListView o00oOOo02 = list.get(list.size() - 1).o00oOOo0();
        int[] iArr = new int[2];
        o00oOOo02.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f593o00ooOOo.getWindowVisibleDisplayFrame(rect);
        if (this.f595o00ooOo0 == 1) {
            return (o00oOOo02.getWidth() + iArr[0]) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onCloseMenu(androidx.appcompat.view.menu.o00oOoO o00oooo2, boolean z) {
        int o00oo0Oo2 = o00oo0Oo(o00oooo2);
        if (o00oo0Oo2 < 0) {
            return;
        }
        int i = o00oo0Oo2 + 1;
        if (i < this.f588o00ooO00.size()) {
            this.f588o00ooO00.get(i).f614o00oOOoO.close(false);
        }
        o00oOo0O remove = this.f588o00ooO00.remove(o00oo0Oo2);
        remove.f614o00oOOoO.removeMenuPresenter(this);
        if (this.f604o00oooOo) {
            remove.f613o00oOOo0.o0O00Oo(null);
            remove.f613o00oOOo0.o00oooo(0);
        }
        remove.f613o00oOOo0.dismiss();
        int size = this.f588o00ooO00.size();
        this.f595o00ooOo0 = size > 0 ? this.f588o00ooO00.get(size - 1).f615o00oOo00 : o00oo0oO();
        if (size != 0) {
            if (z) {
                this.f588o00ooO00.get(0).f614o00oOOoO.close(false);
                return;
            }
            return;
        }
        dismiss();
        o00oo0O.o00oOOo0 o00oooo02 = this.f601o00ooo0o;
        if (o00oooo02 != null) {
            o00oooo02.onCloseMenu(o00oooo2, true);
        }
        ViewTreeObserver viewTreeObserver = this.f602o00oooO;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f602o00oooO.removeGlobalOnLayoutListener(this.f587o00ooO0);
            }
            this.f602o00oooO = null;
        }
        this.f593o00ooOOo.removeOnAttachStateChangeListener(this.f589o00ooO0O);
        this.f603o00oooOO.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        o00oOo0O o00ooo0o2;
        int size = this.f588o00ooO00.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                o00ooo0o2 = null;
                break;
            }
            o00ooo0o2 = this.f588o00ooO00.get(i);
            if (!o00ooo0o2.f613o00oOOo0.o00oOOo0()) {
                break;
            }
            i++;
        }
        if (o00ooo0o2 != null) {
            o00ooo0o2.f614o00oOOoO.close(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean onSubMenuSelected(o00ooO0 o00ooo02) {
        for (o00oOo0O o00ooo0o2 : this.f588o00ooO00) {
            if (o00ooo02 == o00ooo0o2.f614o00oOOoO) {
                o00ooo0o2.o00oOOo0().requestFocus();
                return true;
            }
        }
        if (o00ooo02.hasVisibleItems()) {
            o00oOOoO(o00ooo02);
            o00oo0O.o00oOOo0 o00oooo02 = this.f601o00ooo0o;
            if (o00oooo02 != null) {
                o00oooo02.o00oOOo0(o00ooo02);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void setCallback(o00oo0O.o00oOOo0 o00oooo02) {
        this.f601o00ooo0o = o00oooo02;
    }

    @Override // o00oOoo0.o00ooO0
    public void show() {
        if (o00oOOo0()) {
            return;
        }
        for (androidx.appcompat.view.menu.o00oOoO o00oooo2 : this.f580o00oo) {
            o00oo(o00oooo2);
        }
        this.f580o00oo.clear();
        View view = this.f591o00ooOO;
        this.f593o00ooOOo = view;
        if (view != null) {
            boolean z = this.f602o00oooO == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f602o00oooO = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f587o00ooO0);
            }
            this.f593o00ooOOo.addOnAttachStateChangeListener(this.f589o00ooO0O);
        }
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void updateMenuView(boolean z) {
        for (o00oOo0O o00ooo0o2 : this.f588o00ooO00) {
            o00oOoo0.o0O0o.o00oo0O0(o00ooo0o2.o00oOOo0().getAdapter()).notifyDataSetChanged();
        }
    }
}
