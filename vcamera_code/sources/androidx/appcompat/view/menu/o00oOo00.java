package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.view.menu.o0O0o;
import java.util.ArrayList;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o00oOo00 implements o00oo0O, AdapterView.OnItemClickListener {

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final String f616o00ooO0O = "ListMenuPresenter";

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final String f617o00ooO0o = "android:menu:list";

    /* renamed from: o00oo  reason: collision with root package name */
    public o00oo0O.o00oOOo0 f618o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public LayoutInflater f619o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Context f620o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o00oOoO f621o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public int f622o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public ExpandedMenuView f623o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public int f624o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f625o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public o00oOOo0 f626o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f627o0O0o;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends BaseAdapter {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public int f629o00oo0O0 = -1;

        public o00oOOo0() {
            o00oOOo0();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = o00oOo00.this.f621o00oo0Oo.getNonActionItems().size() - o00oOo00.this.f622o00oo0o;
            return this.f629o00oo0O0 < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                o00oOo00 o00ooo002 = o00oOo00.this;
                view = o00ooo002.f619o00oo0O.inflate(o00ooo002.f627o0O0o, viewGroup, false);
            }
            ((o0O0o.o00oOOo0) view).initialize(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            o00oOOo0();
            super.notifyDataSetChanged();
        }

        public void o00oOOo0() {
            o00oo0OO expandedItem = o00oOo00.this.f621o00oo0Oo.getExpandedItem();
            if (expandedItem != null) {
                ArrayList<o00oo0OO> nonActionItems = o00oOo00.this.f621o00oo0Oo.getNonActionItems();
                int size = nonActionItems.size();
                for (int i = 0; i < size; i++) {
                    if (nonActionItems.get(i) == expandedItem) {
                        this.f629o00oo0O0 = i;
                        return;
                    }
                }
            }
            this.f629o00oo0O0 = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: o00oOOoO */
        public o00oo0OO getItem(int i) {
            ArrayList<o00oo0OO> nonActionItems = o00oOo00.this.f621o00oo0Oo.getNonActionItems();
            int i2 = i + o00oOo00.this.f622o00oo0o;
            int i3 = this.f629o00oo0O0;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return nonActionItems.get(i2);
        }
    }

    public o00oOo00(int i, int i2) {
        this.f627o0O0o = i;
        this.f624o00oo0oO = i2;
    }

    public o00oOo00(Context context, int i) {
        this(i, 0);
        this.f620o00oo0O0 = context;
        this.f619o00oo0O = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean collapseItemActionView(o00oOoO o00oooo2, o00oo0OO o00oo0oo) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean expandItemActionView(o00oOoO o00oooo2, o00oo0OO o00oo0oo) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public int getId() {
        return this.f625o00ooO0;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public o0O0o getMenuView(ViewGroup viewGroup) {
        if (this.f623o00oo0o0 == null) {
            this.f623o00oo0o0 = (ExpandedMenuView) this.f619o00oo0O.inflate(R.layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f626o00ooO00 == null) {
                this.f626o00ooO00 = new o00oOOo0();
            }
            this.f623o00oo0o0.setAdapter((ListAdapter) this.f626o00ooO00);
            this.f623o00oo0o0.setOnItemClickListener(this);
        }
        return this.f623o00oo0o0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.o00oo0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void initForMenu(android.content.Context r3, androidx.appcompat.view.menu.o00oOoO r4) {
        /*
            r2 = this;
            int r0 = r2.f624o00oo0oO
            if (r0 == 0) goto L14
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            int r1 = r2.f624o00oo0oO
            r0.<init>(r3, r1)
            r2.f620o00oo0O0 = r0
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r0)
        L11:
            r2.f619o00oo0O = r3
            goto L23
        L14:
            android.content.Context r0 = r2.f620o00oo0O0
            if (r0 == 0) goto L23
            r2.f620o00oo0O0 = r3
            android.view.LayoutInflater r0 = r2.f619o00oo0O
            if (r0 != 0) goto L23
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            goto L11
        L23:
            r2.f621o00oo0Oo = r4
            androidx.appcompat.view.menu.o00oOo00$o00oOOo0 r3 = r2.f626o00ooO00
            if (r3 == 0) goto L2c
            r3.notifyDataSetChanged()
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.o00oOo00.initForMenu(android.content.Context, androidx.appcompat.view.menu.o00oOoO):void");
    }

    public ListAdapter o00oOOo0() {
        if (this.f626o00ooO00 == null) {
            this.f626o00ooO00 = new o00oOOo0();
        }
        return this.f626o00ooO00;
    }

    public int o00oOOoO() {
        return this.f622o00oo0o;
    }

    public void o00oOo00(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(f617o00ooO0o);
        if (sparseParcelableArray != null) {
            this.f623o00oo0o0.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void o00oOo0O(int i) {
        this.f625o00ooO0 = i;
    }

    public void o00oOo0o(int i) {
        this.f622o00oo0o = i;
        if (this.f623o00oo0o0 != null) {
            updateMenuView(false);
        }
    }

    public void o00oOooO(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f623o00oo0o0;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(f617o00ooO0o, sparseArray);
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onCloseMenu(o00oOoO o00oooo2, boolean z) {
        o00oo0O.o00oOOo0 o00oooo02 = this.f618o00oo;
        if (o00oooo02 != null) {
            o00oooo02.onCloseMenu(o00oooo2, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f621o00oo0Oo.performItemAction(this.f626o00ooO00.getItem(i), this, 0);
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onRestoreInstanceState(Parcelable parcelable) {
        o00oOo00((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public Parcelable onSaveInstanceState() {
        if (this.f623o00oo0o0 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o00oOooO(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean onSubMenuSelected(o00ooO0 o00ooo02) {
        if (o00ooo02.hasVisibleItems()) {
            new o00oo00O(o00ooo02).o00oOooO(null);
            o00oo0O.o00oOOo0 o00oooo02 = this.f618o00oo;
            if (o00oooo02 != null) {
                o00oooo02.o00oOOo0(o00ooo02);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void setCallback(o00oo0O.o00oOOo0 o00oooo02) {
        this.f618o00oo = o00oooo02;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void updateMenuView(boolean z) {
        o00oOOo0 o00oooo02 = this.f626o00ooO00;
        if (o00oooo02 != null) {
            o00oooo02.notifyDataSetChanged();
        }
    }
}
