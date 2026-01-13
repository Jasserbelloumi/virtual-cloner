package androidx.core.widget;

import android.widget.ListView;
import androidx.core.widget.o0O00000;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public class o0 extends o00oOOo0 {

    /* renamed from: o0O0000o  reason: collision with root package name */
    public final ListView f2452o0O0000o;

    public o0(@oo0oO0 ListView listView) {
        super(listView);
        this.f2452o0O0000o = listView;
    }

    @Override // androidx.core.widget.o00oOOo0
    public boolean o00oOOo0(int i) {
        return false;
    }

    @Override // androidx.core.widget.o00oOOo0
    public boolean o00oOOoO(int i) {
        ListView listView = this.f2452o0O0000o;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.widget.o00oOOo0
    public void o00oOooo(int i, int i2) {
        o0O00000.o00oOOo0.o00oOOoO(this.f2452o0O0000o, i2);
    }
}
