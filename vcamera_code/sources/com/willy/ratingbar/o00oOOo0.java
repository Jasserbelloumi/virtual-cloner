package com.willy.ratingbar;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.AttributeSet;
import java.util.UUID;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public class o00oOOo0 extends BaseRatingBar {

    /* renamed from: o00ooOoo  reason: collision with root package name */
    public Handler f6647o00ooOoo;

    /* renamed from: o00ooo0  reason: collision with root package name */
    public String f6648o00ooo0;

    /* renamed from: o00ooo00  reason: collision with root package name */
    public Runnable f6649o00ooo00;

    public o00oOOo0(Context context) {
        super(context);
        this.f6648o00ooo0 = UUID.randomUUID().toString();
        o00oo0();
    }

    public o00oOOo0(Context context, @o0OO00OO AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6648o00ooo0 = UUID.randomUUID().toString();
        o00oo0();
    }

    public o00oOOo0(Context context, @o0OO00OO AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6648o00ooo0 = UUID.randomUUID().toString();
        o00oo0();
    }

    public final void o00oo0() {
        this.f6647o00ooOoo = new Handler();
    }

    public void o00oo0OO(Runnable runnable, long j) {
        if (this.f6647o00ooOoo == null) {
            this.f6647o00ooOoo = new Handler();
        }
        this.f6647o00ooOoo.postAtTime(runnable, this.f6648o00ooo0, SystemClock.uptimeMillis() + j);
    }
}
