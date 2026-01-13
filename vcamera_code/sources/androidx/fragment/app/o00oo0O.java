package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class o00oo0O {
    @o0OO00OO
    public abstract View o00oOo0o(@o00oOooO.oo0OOoo int i);

    public abstract boolean o00oOoO0();

    @oo0oO0
    @Deprecated
    public Fragment o00oOooO(@oo0oO0 Context context, @oo0oO0 String str, @o0OO00OO Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }
}
