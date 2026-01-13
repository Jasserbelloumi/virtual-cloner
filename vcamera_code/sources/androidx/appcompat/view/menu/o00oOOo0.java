package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.o00oo0O;
import androidx.appcompat.view.menu.o0O0o;
import java.util.ArrayList;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class o00oOOo0 implements o00oo0O {

    /* renamed from: o00oo  reason: collision with root package name */
    public int f566o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public Context f567o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public Context f568o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public o00oOoO f569o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public LayoutInflater f570o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public LayoutInflater f571o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public o00oo0O.o00oOOo0 f572o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f573o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public o0O0o f574o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public int f575o0O0o;

    public o00oOOo0(Context context, int i, int i2) {
        this.f568o00oo0O0 = context;
        this.f571o00oo0o0 = LayoutInflater.from(context);
        this.f575o0O0o = i;
        this.f566o00oo = i2;
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
        return this.f573o00ooO0;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public o0O0o getMenuView(ViewGroup viewGroup) {
        if (this.f574o00ooO00 == null) {
            o0O0o o0o0o = (o0O0o) this.f571o00oo0o0.inflate(this.f575o0O0o, viewGroup, false);
            this.f574o00ooO00 = o0o0o;
            o0o0o.initialize(this.f569o00oo0Oo);
            updateMenuView(true);
        }
        return this.f574o00ooO00;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void initForMenu(Context context, o00oOoO o00oooo2) {
        this.f567o00oo0O = context;
        this.f570o00oo0o = LayoutInflater.from(context);
        this.f569o00oo0Oo = o00oooo2;
    }

    public void o00oOOoO(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f574o00ooO00).addView(view, i);
    }

    public abstract void o00oOo00(o00oo0OO o00oo0oo, o0O0o.o00oOOo0 o00oooo02);

    public boolean o00oOo0O(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    public o00oo0O.o00oOOo0 o00oOo0o() {
        return this.f572o00oo0oO;
    }

    public void o00oOoO(int i) {
        this.f573o00ooO0 = i;
    }

    public View o00oOoO0(o00oo0OO o00oo0oo, View view, ViewGroup viewGroup) {
        o0O0o.o00oOOo0 o00oOooO2 = view instanceof o0O0o.o00oOOo0 ? (o0O0o.o00oOOo0) view : o00oOooO(viewGroup);
        o00oOo00(o00oo0oo, o00oOooO2);
        return (View) o00oOooO2;
    }

    public boolean o00oOoOO(int i, o00oo0OO o00oo0oo) {
        return true;
    }

    public o0O0o.o00oOOo0 o00oOooO(ViewGroup viewGroup) {
        return (o0O0o.o00oOOo0) this.f571o00oo0o0.inflate(this.f566o00oo, viewGroup, false);
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void onCloseMenu(o00oOoO o00oooo2, boolean z) {
        o00oo0O.o00oOOo0 o00oooo02 = this.f572o00oo0oO;
        if (o00oooo02 != null) {
            o00oooo02.onCloseMenu(o00oooo2, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.o00oOoO] */
    @Override // androidx.appcompat.view.menu.o00oo0O
    public boolean onSubMenuSelected(o00ooO0 o00ooo02) {
        o00oo0O.o00oOOo0 o00oooo02 = this.f572o00oo0oO;
        o00ooO0 o00ooo03 = o00ooo02;
        if (o00oooo02 != null) {
            if (o00ooo02 == null) {
                o00ooo03 = this.f569o00oo0Oo;
            }
            return o00oooo02.o00oOOo0(o00ooo03);
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void setCallback(o00oo0O.o00oOOo0 o00oooo02) {
        this.f572o00oo0oO = o00oooo02;
    }

    @Override // androidx.appcompat.view.menu.o00oo0O
    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f574o00ooO00;
        if (viewGroup == null) {
            return;
        }
        o00oOoO o00oooo2 = this.f569o00oo0Oo;
        int i = 0;
        if (o00oooo2 != null) {
            o00oooo2.flagActionItems();
            ArrayList<o00oo0OO> visibleItems = this.f569o00oo0Oo.getVisibleItems();
            int size = visibleItems.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                o00oo0OO o00oo0oo = visibleItems.get(i3);
                if (o00oOoOO(i2, o00oo0oo)) {
                    View childAt = viewGroup.getChildAt(i2);
                    o00oo0OO itemData = childAt instanceof o0O0o.o00oOOo0 ? ((o0O0o.o00oOOo0) childAt).getItemData() : null;
                    View o00oOoO02 = o00oOoO0(o00oo0oo, childAt, viewGroup);
                    if (o00oo0oo != itemData) {
                        o00oOoO02.setPressed(false);
                        o00oOoO02.jumpDrawablesToCurrentState();
                    }
                    if (o00oOoO02 != childAt) {
                        o00oOOoO(o00oOoO02, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!o00oOo0O(viewGroup, i)) {
                i++;
            }
        }
    }
}
