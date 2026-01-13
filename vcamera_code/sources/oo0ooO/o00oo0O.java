package oo0ooO;

import android.view.View;
import oo0ooO.o00oo0OO;
/* loaded from: classes2.dex */
public final class o00oo0O implements View.OnClickListener {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0OO.o00oOOo0 f17419o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o00oo0OO<?> f17420o00oo0O0;

    public o00oo0O(o00oo0OO<?> o00oo0oo, o00oo0OO.o00oOOo0 o00oooo02) {
        this.f17420o00oo0O0 = o00oo0oo;
        this.f17419o00oo0O = o00oooo02;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o00oo0OO.o00oOOo0 o00oooo02 = this.f17419o00oo0O;
        if (o00oooo02 == null) {
            return;
        }
        o00oooo02.o00oOOo0(this.f17420o00oo0O0, view);
    }
}
