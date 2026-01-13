package o0OO000;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import o0O0oooo.o0OO0oO;
import o0OO000o.o00oo0;
/* loaded from: classes2.dex */
public class o00oOOoO implements o0O.o00oOOoO {
    @Override // o0O.o00oOOoO
    public Bundle o00oOOo0(Context context, int i, Bundle bundle) {
        String string = bundle.getString("pkg");
        String string2 = bundle.getString(o0OO0oO.f12913o0ooOoOO);
        Intent intent = (Intent) bundle.getParcelable("intent");
        String.format("target intent not found! [caller: %s-%s] [fromToken: %s] [intent: %s]", string, string2, bundle.getBinder(o0OO0oO.f12909o0OoO00O), intent);
        Integer o00oOooO2 = o00oOooO(context, intent);
        if (o00oOooO2 != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt(o0OO0oO.f12897o0O00O0o, o00oOooO2.intValue());
            return bundle2;
        }
        return null;
    }

    public Integer o00oOooO(final Context context, final Intent intent) {
        if (o0OO000o.o00oOo00.o00oOOoO(intent)) {
            o00oo0.o00oOoO0(new Runnable() { // from class: o0OO000.o00oOOo0
                @Override // java.lang.Runnable
                public final void run() {
                    context.startActivity(intent);
                }
            });
            return 0;
        }
        return null;
    }
}
