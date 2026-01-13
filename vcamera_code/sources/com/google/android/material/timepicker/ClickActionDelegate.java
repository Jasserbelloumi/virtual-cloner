package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import o0O00.o00oo0O;
import o0O000oo.o00oOOoO;
/* loaded from: classes2.dex */
class ClickActionDelegate extends o00oOOoO {
    private final o00oo0O.o00oOOo0 clickAction;

    public ClickActionDelegate(Context context, int i) {
        this.clickAction = new o00oo0O.o00oOOo0(16, context.getString(i));
    }

    @Override // o0O000oo.o00oOOoO
    public void onInitializeAccessibilityNodeInfo(View view, o00oo0O o00oo0o2) {
        super.onInitializeAccessibilityNodeInfo(view, o00oo0o2);
        o00oo0o2.o00oOOoO(this.clickAction);
    }
}
