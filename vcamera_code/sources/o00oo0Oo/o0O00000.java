package o00oo0Oo;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O00000 {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Intent f7502o00oOOo0;
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final List<Uri> f7503o00oOOoO;

    public o0O00000(@oo0oO0 Intent intent, @oo0oO0 List<Uri> list) {
        this.f7502o00oOOo0 = intent;
        this.f7503o00oOOoO = list;
    }

    @oo0oO0
    public Intent o00oOOo0() {
        return this.f7502o00oOOo0;
    }

    public final void o00oOOoO(Context context) {
        for (Uri uri : this.f7503o00oOOoO) {
            context.grantUriPermission(this.f7502o00oOOo0.getPackage(), uri, 1);
        }
    }

    public void o00oOo00(@oo0oO0 Context context) {
        o00oOOoO(context);
        o00ooo0.o0.startActivity(context, this.f7502o00oOOo0, null);
    }
}
