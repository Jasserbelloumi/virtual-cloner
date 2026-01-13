package o00oOoo0;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.o00oOo0O;
import androidx.appcompat.view.menu.o00oOoO;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o0O0o implements o00ooO0, androidx.appcompat.view.menu.o00oo0O, AdapterView.OnItemClickListener {

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Rect f7125o00oo0O0;

    public static int o00oOo0O(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean o00oo0(o00oOoO o00oooo2) {
        int size = o00oooo2.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = o00oooo2.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static o00oOo0O o00oo0O0(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (o00oOo0O) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (o00oOo0O) listAdapter;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean collapseItemActionView(o00oOoO o00oooo2, androidx.appcompat.view.menu.o00oo0OO o00oo0oo) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean expandItemActionView(o00oOoO o00oooo2, androidx.appcompat.view.menu.o00oo0OO o00oo0oo) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public androidx.appcompat.view.menu.o0O0o getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void initForMenu(@oo0oO0 Context context, @o0OO00OO o00oOoO o00oooo2) {
    }

    public abstract void o00oOOoO(o00oOoO o00oooo2);

    public boolean o00oOo00() {
        return true;
    }

    public abstract void o00oOo0o(View view);

    public abstract void o00oOoO(boolean z);

    public void o00oOoO0(Rect rect) {
        this.f7125o00oo0O0 = rect;
    }

    public abstract void o00oOoOO(int i);

    public abstract void o00oOoOo(int i);

    public abstract void o00oOoo0(PopupWindow.OnDismissListener onDismissListener);

    public Rect o00oOooO() {
        return this.f7125o00oo0O0;
    }

    public abstract void o00oOooo(boolean z);

    public abstract void o00oo00O(int i);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        o00oo0O0(listAdapter).f631o00oo0O0.performItemAction((MenuItem) listAdapter.getItem(i), this, o00oOo00() ? 0 : 4);
    }
}
