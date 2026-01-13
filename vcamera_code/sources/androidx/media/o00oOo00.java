package androidx.media;

import android.content.Context;
import androidx.media.o00oOOoO;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@o0OOooO0(21)
/* loaded from: classes.dex */
public class o00oOo00 extends o00oOoO {
    public o00oOo00(Context context) {
        super(context);
        this.f3659o00oOOo0 = context;
    }

    @Override // androidx.media.o00oOoO, androidx.media.o00oOOoO.o00oOOo0
    public boolean o00oOOo0(@oo0oO0 o00oOOoO.o00oOo00 o00ooo002) {
        return o00oOooO(o00ooo002) || super.o00oOOo0(o00ooo002);
    }

    public final boolean o00oOooO(@oo0oO0 o00oOOoO.o00oOo00 o00ooo002) {
        return getContext().checkPermission(o00oOoO.f3656o00oOo0o, o00ooo002.o00oOOo0(), o00ooo002.getUid()) == 0;
    }
}
