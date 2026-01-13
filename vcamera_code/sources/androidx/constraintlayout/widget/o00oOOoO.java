package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R;
import androidx.constraintlayout.widget.o00oOoO;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class o00oOOoO extends View {

    /* renamed from: o00oo  reason: collision with root package name */
    public View[] f1930o00oo;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public int f1931o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public int[] f1932o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public Context f1933o00oo0Oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public boolean f1934o00oo0o;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public o00ooO.o00oo0O0 f1935o00oo0o0;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public String f1936o00oo0oO;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public HashMap<Integer, String> f1937o00ooO00;

    /* renamed from: o0O0o  reason: collision with root package name */
    public String f1938o0O0o;

    public o00oOOoO(Context context) {
        super(context);
        this.f1932o00oo0O0 = new int[32];
        this.f1934o00oo0o = false;
        this.f1930o00oo = null;
        this.f1937o00ooO00 = new HashMap<>();
        this.f1933o00oo0Oo = context;
        o00oo0OO(null);
    }

    public o00oOOoO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1932o00oo0O0 = new int[32];
        this.f1934o00oo0o = false;
        this.f1930o00oo = null;
        this.f1937o00ooO00 = new HashMap<>();
        this.f1933o00oo0Oo = context;
        o00oo0OO(attributeSet);
    }

    public o00oOOoO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1932o00oo0O0 = new int[32];
        this.f1934o00oo0o = false;
        this.f1930o00oo = null;
        this.f1937o00ooO00 = new HashMap<>();
        this.f1933o00oo0Oo = context;
        o00oo0OO(attributeSet);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1932o00oo0O0, this.f1931o00oo0O);
    }

    public final void o00oOo0O(String str) {
        if (str == null || str.length() == 0 || this.f1933o00oo0Oo == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int o00oo00O2 = o00oo00O(trim);
        if (o00oo00O2 != 0) {
            this.f1937o00ooO00.put(Integer.valueOf(o00oo00O2), trim);
            o00oOo0o(o00oo00O2);
        }
    }

    public final void o00oOo0o(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f1931o00oo0O + 1;
        int[] iArr = this.f1932o00oo0O0;
        if (i2 > iArr.length) {
            this.f1932o00oo0O0 = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1932o00oo0O0;
        int i3 = this.f1931o00oo0O;
        iArr2[i3] = i;
        this.f1931o00oo0O = i3 + 1;
    }

    public void o00oOoO(View view) {
        if (view == this || view.getId() == -1 || view.getParent() == null) {
            return;
        }
        this.f1936o00oo0oO = null;
        o00oOo0o(view.getId());
        requestLayout();
    }

    public final void o00oOoO0(String str) {
        if (str == null || str.length() == 0 || this.f1933o00oo0Oo == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.o00oOOoO) && trim.equals(((ConstraintLayout.o00oOOoO) layoutParams).f1841o0O00000) && childAt.getId() != -1) {
                o00oOo0o(childAt.getId());
            }
        }
    }

    public void o00oOoOO() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        o00oOoOo((ConstraintLayout) parent);
    }

    public void o00oOoOo(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f1931o00oo0O; i++) {
            View viewById = constraintLayout.getViewById(this.f1932o00oo0O0[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int[] o00oOoo0(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String str2 : split) {
            int o00oo00O2 = o00oo00O(str2.trim());
            if (o00oo00O2 != 0) {
                iArr[i] = o00oo00O2;
                i++;
            }
        }
        return i != split.length ? Arrays.copyOf(iArr, i) : iArr;
    }

    public final int o00oOooo(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1933o00oo0Oo.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void o00oo(ConstraintLayout constraintLayout) {
        String str;
        int o00oOooo2;
        if (isInEditMode()) {
            setIds(this.f1936o00oo0oO);
        }
        o00ooO.o00oo0O0 o00oo0o02 = this.f1935o00oo0o0;
        if (o00oo0o02 == null) {
            return;
        }
        o00oo0o02.o00oOo00();
        for (int i = 0; i < this.f1931o00oo0O; i++) {
            int i2 = this.f1932o00oo0O0[i];
            View viewById = constraintLayout.getViewById(i2);
            if (viewById == null && (o00oOooo2 = o00oOooo(constraintLayout, (str = this.f1937o00ooO00.get(Integer.valueOf(i2))))) != 0) {
                this.f1932o00oo0O0[i] = o00oOooo2;
                this.f1937o00ooO00.put(Integer.valueOf(o00oOooo2), str);
                viewById = constraintLayout.getViewById(o00oOooo2);
            }
            if (viewById != null) {
                this.f1935o00oo0o0.o00oOOo0(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f1935o00oo0o0.o00oOOoO(constraintLayout.mLayoutWidget);
    }

    public View[] o00oo0(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f1930o00oo;
        if (viewArr == null || viewArr.length != this.f1931o00oo0O) {
            this.f1930o00oo = new View[this.f1931o00oo0O];
        }
        for (int i = 0; i < this.f1931o00oo0O; i++) {
            this.f1930o00oo[i] = constraintLayout.getViewById(this.f1932o00oo0O0[i]);
        }
        return this.f1930o00oo;
    }

    public final int o00oo00O(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = o00oOooo(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = R.id.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f1933o00oo0Oo.getResources().getIdentifier(str, "id", this.f1933o00oo0Oo.getPackageName()) : i;
    }

    public void o00oo0O(View view) {
        int i;
        int id = view.getId();
        if (id == -1) {
            return;
        }
        this.f1936o00oo0oO = null;
        int i2 = 0;
        while (true) {
            if (i2 >= this.f1931o00oo0O) {
                break;
            } else if (this.f1932o00oo0O0[i2] == id) {
                while (true) {
                    i = this.f1931o00oo0O;
                    if (i2 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.f1932o00oo0O0;
                    int i3 = i2 + 1;
                    iArr[i2] = iArr[i3];
                    i2 = i3;
                }
                this.f1932o00oo0O0[i - 1] = 0;
                this.f1931o00oo0O = i - 1;
            } else {
                i2++;
            }
        }
        requestLayout();
    }

    public void o00oo0O0(o00oOoO.o00oOOo0 o00oooo02, o00ooO.o00oo0O o00oo0o2, ConstraintLayout.o00oOOoO o00ooooo2, SparseArray<o00ooO.o00oOoO> sparseArray) {
        o00oOoO.o00oOOoO o00ooooo3 = o00oooo02.f2096o00oOooO;
        int[] iArr = o00ooooo3.f2203o0O000o;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = o00ooooo3.f2211o0ooOoOO;
            if (str != null && str.length() > 0) {
                o00oOoO.o00oOOoO o00ooooo4 = o00oooo02.f2096o00oOooO;
                o00ooooo4.f2203o0O000o = o00oOoo0(this, o00ooooo4.f2211o0ooOoOO);
            }
        }
        o00oo0o2.o00oOo00();
        if (o00oooo02.f2096o00oOooO.f2203o0O000o == null) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr2 = o00oooo02.f2096o00oOooO.f2203o0O000o;
            if (i >= iArr2.length) {
                return;
            }
            o00ooO.o00oOoO o00oooo2 = sparseArray.get(iArr2[i]);
            if (o00oooo2 != null) {
                o00oo0o2.o00oOOo0(o00oooo2);
            }
            i++;
        }
    }

    public void o00oo0OO(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1936o00oo0oO = string;
                    setIds(string);
                } else if (index == R.styleable.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1938o0O0o = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o00oo0Oo(o00ooO.o00oOoO o00oooo2, boolean z) {
    }

    public void o00oo0o(ConstraintLayout constraintLayout) {
    }

    public void o00oo0o0(ConstraintLayout constraintLayout) {
    }

    public void o00oo0oO(ConstraintLayout constraintLayout) {
    }

    public void o00ooO0() {
        if (this.f1935o00oo0o0 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.o00oOOoO) {
            ((ConstraintLayout.o00oOOoO) layoutParams).f1853o0O00OOO = (o00ooO.o00oOoO) this.f1935o00oo0o0;
        }
    }

    public void o00ooO00(o00ooO.o00oo00O o00oo00o, o00ooO.o00oo0O0 o00oo0o02, SparseArray<o00ooO.o00oOoO> sparseArray) {
        o00oo0o02.o00oOo00();
        for (int i = 0; i < this.f1931o00oo0O; i++) {
            o00oo0o02.o00oOOo0(sparseArray.get(this.f1932o00oo0O0[i]));
        }
    }

    public void o0O0o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1936o00oo0oO;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1938o0O0o;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.f1934o00oo0o) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f1936o00oo0oO = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1931o00oo0O = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                o00oOo0O(str.substring(i));
                return;
            } else {
                o00oOo0O(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1938o0O0o = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1931o00oo0O = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                o00oOoO0(str.substring(i));
                return;
            } else {
                o00oOoO0(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1936o00oo0oO = null;
        this.f1931o00oo0O = 0;
        for (int i : iArr) {
            o00oOo0o(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f1936o00oo0oO == null) {
            o00oOo0o(i);
        }
    }
}
