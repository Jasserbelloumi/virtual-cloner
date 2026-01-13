package com.imuxuan.floatingview;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import o00oOooO.o0O0O0o0;
import o00oOooO.oo0oO0;
import o00oOooO.oooOO0;
import o0OO00oo.o00oo;
/* loaded from: classes2.dex */
public class o00oOOo0 extends o00oo {

    /* renamed from: o00ooOO  reason: collision with root package name */
    public final ImageView f6528o00ooOO;

    public o00oOOo0(@oo0oO0 Context context) {
        this(context, R.layout.en_floating_view);
    }

    public o00oOOo0(@oo0oO0 Context context, @oooOO0 int i) {
        super(context, null);
        View.inflate(context, i, this);
        this.f6528o00ooOO = (ImageView) findViewById(R.id.icon);
    }

    public void setIconImage(@o0O0O0o0 int i) {
        this.f6528o00ooOO.setImageResource(i);
    }
}
