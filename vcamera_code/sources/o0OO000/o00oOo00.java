package o0OO000;

import android.content.Context;
import android.os.Bundle;
import o0O0oooo.o0OO0oO;
/* loaded from: classes2.dex */
public class o00oOo00 implements o0O.o00oOOoO {
    @Override // o0O.o00oOOoO
    public final Bundle o00oOOo0(Context context, int i, Bundle bundle) {
        if (i != 1) {
            return null;
        }
        int i2 = bundle.getInt("space");
        o00oOOoO(bundle.getString(o0OO0oO.f12894o0O000oo), bundle.getString("pkg"), i2);
        return null;
    }

    public void o00oOOoO(String str, String str2, int i) {
        String.format("agent process bind complete! [space: %d] [pkg: %s] [process: %s]", Integer.valueOf(i), str2, str);
    }
}
