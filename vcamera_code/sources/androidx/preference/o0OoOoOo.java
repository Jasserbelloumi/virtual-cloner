package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o0oO0Ooo;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
@Deprecated
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class o0OoOoOo extends o0oO0Ooo {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final RecyclerView f3971o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0O000oo.o00oOOoO f3972o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0O000oo.o00oOOoO f3973o00oOo00;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends o0O000oo.o00oOOoO {
        public o00oOOo0() {
        }

        @Override // o0O000oo.o00oOOoO
        public void onInitializeAccessibilityNodeInfo(View view, o0O00.o00oo0O o00oo0o2) {
            Preference o00ooO0O2;
            o0OoOoOo.this.f3972o00oOOoO.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
            int childAdapterPosition = o0OoOoOo.this.f3971o00oOOo0.getChildAdapterPosition(view);
            RecyclerView.o00oo0OO adapter = o0OoOoOo.this.f3971o00oOOo0.getAdapter();
            if ((adapter instanceof o00ooO) && (o00ooO0O2 = ((o00ooO) adapter).o00ooO0O(childAdapterPosition)) != null) {
                o00ooO0O2.o0O00O0(o00oo0o2);
            }
        }

        @Override // o0O000oo.o00oOOoO
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return o0OoOoOo.this.f3972o00oOOoO.performAccessibilityAction(view, i, bundle);
        }
    }

    public o0OoOoOo(@oo0oO0 RecyclerView recyclerView) {
        super(recyclerView);
        this.f3972o00oOOoO = super.getItemDelegate();
        this.f3973o00oOo00 = new o00oOOo0();
        this.f3971o00oOOo0 = recyclerView;
    }

    @Override // androidx.recyclerview.widget.o0oO0Ooo
    @oo0oO0
    public o0O000oo.o00oOOoO getItemDelegate() {
        return this.f3973o00oOo00;
    }
}
