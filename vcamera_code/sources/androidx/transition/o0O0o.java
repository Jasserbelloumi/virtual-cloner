package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import o00oOooO.oo0oO0;
import o0O0Oo0o.o0O00OO;
import o0O0Oo0o.o0O00oO0;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class o0O0o extends FrameLayout {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public boolean f5200o00oo0O;
    @oo0oO0

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public ViewGroup f5201o00oo0O0;

    public o0O0o(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f5201o00oo0O0 = viewGroup;
        viewGroup.setTag(R.id.ghost_view_holder, this);
        o0O00oO0.o00oOOoO(this.f5201o00oo0O0).add(this);
        this.f5200o00oo0O = true;
    }

    public static o0O0o o00oOOoO(@oo0oO0 ViewGroup viewGroup) {
        return (o0O0o) viewGroup.getTag(R.id.ghost_view_holder);
    }

    public static boolean o00oOo0O(View view, View view2) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        if (view.getZ() != view2.getZ()) {
            return view.getZ() > view2.getZ();
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(o0O00oO0.o00oOOo0(viewGroup, i));
            if (childAt == view) {
                return false;
            }
            if (childAt == view2) {
                break;
            }
        }
        return true;
    }

    public static boolean o00oOo0o(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        if (arrayList.isEmpty() || arrayList2.isEmpty() || arrayList.get(0) != arrayList2.get(0)) {
            return true;
        }
        int min = Math.min(arrayList.size(), arrayList2.size());
        for (int i = 1; i < min; i++) {
            View view = arrayList.get(i);
            View view2 = arrayList2.get(i);
            if (view != view2) {
                return o00oOo0O(view, view2);
            }
        }
        return arrayList2.size() == min;
    }

    public static void o00oOooO(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            o00oOooO((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public void o00oOOo0(o00oo o00ooVar) {
        ArrayList<View> arrayList = new ArrayList<>();
        o00oOooO(o00ooVar.f5018o00oo0Oo, arrayList);
        int o00oOo002 = o00oOo00(arrayList);
        if (o00oOo002 < 0 || o00oOo002 >= getChildCount()) {
            addView(o00ooVar);
        } else {
            addView(o00ooVar, o00oOo002);
        }
    }

    public final int o00oOo00(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int childCount = getChildCount() - 1;
        int i = 0;
        while (i <= childCount) {
            int i2 = (i + childCount) / 2;
            o00oOooO(((o00oo) getChildAt(i2)).f5018o00oo0Oo, arrayList2);
            if (o00oOo0o(arrayList, arrayList2)) {
                i = i2 + 1;
            } else {
                childCount = i2 - 1;
            }
            arrayList2.clear();
        }
        return i;
    }

    public void o00oOoO0() {
        if (!this.f5200o00oo0O) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        o0O00oO0.o00oOOoO(this.f5201o00oo0O0).remove(this);
        new o0O00OO(this.f5201o00oo0O0).add(this);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        if (!this.f5200o00oo0O) {
            throw new IllegalStateException("This GhostViewHolder is detached!");
        }
        super.onViewAdded(view);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f5201o00oo0O0.setTag(R.id.ghost_view_holder, null);
            o0O00oO0.o00oOOoO(this.f5201o00oo0O0).remove(this);
            this.f5200o00oo0O = false;
        }
    }
}
