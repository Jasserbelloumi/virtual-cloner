package o0O00;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oOOo0 extends ClickableSpan {
    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final String f9932o00oo0o0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID";

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final o00oo0O f9933o00oo0O;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final int f9934o00oo0O0;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final int f9935o00oo0Oo;

    @o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP_PREFIX})
    public o00oOOo0(int i, @oo0oO0 o00oo0O o00oo0o2, int i2) {
        this.f9934o00oo0O0 = i;
        this.f9933o00oo0O = o00oo0o2;
        this.f9935o00oo0Oo = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@oo0oO0 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(f9932o00oo0o0, this.f9934o00oo0O0);
        this.f9933o00oo0O.o0O0OOO(this.f9935o00oo0Oo, bundle);
    }
}
