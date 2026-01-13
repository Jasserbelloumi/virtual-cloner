package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.o00oOoO;
/* loaded from: classes.dex */
public class Barrier extends o00oOOoO {

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f1765o00ooO = 0;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final int f1766o00ooOO = 1;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final int f1767o00ooOO0 = 2;

    /* renamed from: o00ooOOo  reason: collision with root package name */
    public static final int f1768o00ooOOo = 3;

    /* renamed from: o00ooOo  reason: collision with root package name */
    public static final int f1769o00ooOo = 6;

    /* renamed from: o00ooOo0  reason: collision with root package name */
    public static final int f1770o00ooOo0 = 5;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public int f1771o00ooO0;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f1772o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public o00ooO.o00oOOo0 f1773o00ooO0o;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public int getMargin() {
        return this.f1773o00ooO0o.o0OO00Oo();
    }

    public int getType() {
        return this.f1771o00ooO0;
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0O0(o00oOoO.o00oOOo0 o00oooo02, o00ooO.o00oo0O o00oo0o2, ConstraintLayout.o00oOOoO o00ooooo2, SparseArray<o00ooO.o00oOoO> sparseArray) {
        super.o00oo0O0(o00oooo02, o00oo0o2, o00ooooo2, sparseArray);
        if (o00oo0o2 instanceof o00ooO.o00oOOo0) {
            o00ooO.o00oOOo0 o00oooo03 = (o00ooO.o00oOOo0) o00oo0o2;
            o00ooO0o(o00oooo03, o00oooo02.f2096o00oOooO.f2202o0O000Oo, ((o00ooO.o00oo00O) o00oo0o2.o0()).o0OOO00o());
            o00oooo03.o0OO00o(o00oooo02.f2096o00oOooO.f2208o0OoO00O);
            o00oooo03.o0OO0O0(o00oooo02.f2096o00oOooO.f2209o0OoOoOO);
        }
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0OO(AttributeSet attributeSet) {
        super.o00oo0OO(attributeSet);
        this.f1773o00ooO0o = new o00ooO.o00oOOo0();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == R.styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1773o00ooO0o.o0OO00o(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == R.styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.f1773o00ooO0o.o0OO0O0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1935o00oo0o0 = this.f1773o00ooO0o;
        o00ooO0();
    }

    @Override // androidx.constraintlayout.widget.o00oOOoO
    public void o00oo0Oo(o00ooO.o00oOoO o00oooo2, boolean z) {
        o00ooO0o(o00oooo2, this.f1771o00ooO0, z);
    }

    public boolean o00ooO0O() {
        return this.f1773o00ooO0o.o0OO00OO();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r6 == 6) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r6 == 6) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00ooO0o(o00ooO.o00oOoO r4, int r5, boolean r6) {
        /*
            r3 = this;
            r3.f1772o00ooO0O = r5
            r5 = 1
            r0 = 0
            r1 = 6
            r2 = 5
            if (r6 == 0) goto L12
            int r6 = r3.f1771o00ooO0
            if (r6 != r2) goto Lf
        Lc:
            r3.f1772o00ooO0O = r5
            goto L1c
        Lf:
            if (r6 != r1) goto L1c
            goto L16
        L12:
            int r6 = r3.f1771o00ooO0
            if (r6 != r2) goto L19
        L16:
            r3.f1772o00ooO0O = r0
            goto L1c
        L19:
            if (r6 != r1) goto L1c
            goto Lc
        L1c:
            boolean r5 = r4 instanceof o00ooO.o00oOOo0
            if (r5 == 0) goto L27
            o00ooO.o00oOOo0 r4 = (o00ooO.o00oOOo0) r4
            int r5 = r3.f1772o00ooO0O
            r4.o0OO0(r5)
        L27:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.Barrier.o00ooO0o(o00ooO.o00oOoO, int, boolean):void");
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1773o00ooO0o.o0OO00o(z);
    }

    public void setDpMargin(int i) {
        o00ooO.o00oOOo0 o00oooo02 = this.f1773o00ooO0o;
        o00oooo02.o0OO0O0((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f1773o00ooO0o.o0OO0O0(i);
    }

    public void setType(int i) {
        this.f1771o00ooO0 = i;
    }
}
