package oo0ooO;

import android.view.View;
import oo0ooO.o00oo0OO;
/* loaded from: classes2.dex */
public final class o0O0o implements View.OnLongClickListener {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0OO.o00oOOoO f17438o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo0OO<?> f17439o00oo0O0;

    public o0O0o(o00oo0OO<?> o00oo0oo, o00oo0OO.o00oOOoO o00ooooo2) {
        this.f17439o00oo0O0 = o00oo0oo;
        this.f17438o00oo0O = o00ooooo2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        o00oo0OO.o00oOOoO o00ooooo2 = this.f17438o00oo0O;
        if (o00ooooo2 == null) {
            return false;
        }
        return o00ooooo2.o00oOOo0(this.f17439o00oo0O0, view);
    }
}
