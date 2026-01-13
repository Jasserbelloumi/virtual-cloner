package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.o00oOoO;
import androidx.appcompat.widget.o0OOO0;
import o00oOooO.o0OO0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements o00oOoO.o00oOOoO, o0O0o, AdapterView.OnItemClickListener {

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int[] f545o00oo0Oo = {16842964, 16843049};

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f546o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public o00oOoO f547o00oo0O0;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        o0OOO0 o00ooOo2 = o0OOO0.o00ooOo(context, attributeSet, f545o00oo0Oo, i, 0);
        if (o00ooOo2.o00ooOO0(0)) {
            setBackgroundDrawable(o00ooOo2.o00oOoO(0));
        }
        if (o00ooOo2.o00ooOO0(1)) {
            setDivider(o00ooOo2.o00oOoO(1));
        }
        o00ooOo2.o00ooOoo();
    }

    @Override // androidx.appcompat.view.menu.o0O0o
    public int getWindowAnimations() {
        return this.f546o00oo0O;
    }

    @Override // androidx.appcompat.view.menu.o0O0o
    public void initialize(o00oOoO o00oooo2) {
        this.f547o00oo0O0 = o00oooo2;
    }

    @Override // androidx.appcompat.view.menu.o00oOoO.o00oOOoO
    public boolean o00oOOo0(o00oo0OO o00oo0oo) {
        return this.f547o00oo0O0.performItemAction(o00oo0oo, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        o00oOOo0((o00oo0OO) getAdapter().getItem(i));
    }
}
