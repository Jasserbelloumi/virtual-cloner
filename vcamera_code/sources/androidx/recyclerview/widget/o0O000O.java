package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public class o0O000O {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f4569o00oOoOo = -1;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f4570o00oOoo0 = 1;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f4571o00oOooo = Integer.MIN_VALUE;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f4572o00oo0 = 1;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f4573o00oo00O = -1;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public int f4575o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public int f4576o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public int f4577o00oOo0O;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public boolean f4579o00oOoO;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public boolean f4581o00oOoOO;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public int f4582o00oOooO;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public boolean f4574o00oOOo0 = true;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public int f4578o00oOo0o = 0;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public int f4580o00oOoO0 = 0;

    public boolean o00oOOo0(RecyclerView.o0O00OOO o0o00ooo) {
        int i = this.f4576o00oOo00;
        return i >= 0 && i < o0o00ooo.o00oOooO();
    }

    public View o00oOOoO(RecyclerView.o0O00O0 o0o00o0) {
        View o00oo0O2 = o0o00o0.o00oo0O(this.f4576o00oOo00, false);
        this.f4576o00oOo00 += this.f4582o00oOooO;
        return o00oo0O2;
    }

    public String toString() {
        StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("LayoutState{mAvailable=");
        o00oOOo02.append(this.f4575o00oOOoO);
        o00oOOo02.append(", mCurrentPosition=");
        o00oOOo02.append(this.f4576o00oOo00);
        o00oOOo02.append(", mItemDirection=");
        o00oOOo02.append(this.f4582o00oOooO);
        o00oOOo02.append(", mLayoutDirection=");
        o00oOOo02.append(this.f4577o00oOo0O);
        o00oOOo02.append(", mStartLine=");
        o00oOOo02.append(this.f4578o00oOo0o);
        o00oOOo02.append(", mEndLine=");
        o00oOOo02.append(this.f4580o00oOoO0);
        o00oOOo02.append('}');
        return o00oOOo02.toString();
    }
}
