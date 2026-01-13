package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.o0O0o;
import java.util.ArrayList;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOo0O extends BaseAdapter {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f630o00oo0O = -1;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOoO f631o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public boolean f632o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final LayoutInflater f633o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public final boolean f634o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final int f635o00oo0oO;

    public o00oOo0O(o00oOoO o00oooo2, LayoutInflater layoutInflater, boolean z, int i) {
        this.f634o00oo0o0 = z;
        this.f633o00oo0o = layoutInflater;
        this.f631o00oo0O0 = o00oooo2;
        this.f635o00oo0oO = i;
        o00oOOo0();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<o00oo0OO> nonActionItems = this.f634o00oo0o0 ? this.f631o00oo0O0.getNonActionItems() : this.f631o00oo0O0.getVisibleItems();
        int i = this.f630o00oo0O;
        int size = nonActionItems.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f633o00oo0o.inflate(this.f635o00oo0oO, viewGroup, false);
        }
        int i2 = getItem(i).f689o00oo00O;
        int i3 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f631o00oo0O0.isGroupDividerEnabled() && i2 != (i3 >= 0 ? getItem(i3).f689o00oo00O : i2));
        o0O0o.o00oOOo0 o00oooo02 = (o0O0o.o00oOOo0) view;
        if (this.f632o00oo0Oo) {
            listMenuItemView.setForceShowIcon(true);
        }
        o00oooo02.initialize(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        o00oOOo0();
        super.notifyDataSetChanged();
    }

    public void o00oOOo0() {
        o00oo0OO expandedItem = this.f631o00oo0O0.getExpandedItem();
        if (expandedItem != null) {
            ArrayList<o00oo0OO> nonActionItems = this.f631o00oo0O0.getNonActionItems();
            int size = nonActionItems.size();
            for (int i = 0; i < size; i++) {
                if (nonActionItems.get(i) == expandedItem) {
                    this.f630o00oo0O = i;
                    return;
                }
            }
        }
        this.f630o00oo0O = -1;
    }

    public o00oOoO o00oOOoO() {
        return this.f631o00oo0O0;
    }

    public boolean o00oOo00() {
        return this.f632o00oo0Oo;
    }

    public void o00oOo0O(boolean z) {
        this.f632o00oo0Oo = z;
    }

    @Override // android.widget.Adapter
    /* renamed from: o00oOooO */
    public o00oo0OO getItem(int i) {
        ArrayList<o00oo0OO> nonActionItems = this.f634o00oo0o0 ? this.f631o00oo0O0.getNonActionItems() : this.f631o00oo0O0.getVisibleItems();
        int i2 = this.f630o00oo0O;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return nonActionItems.get(i);
    }
}
