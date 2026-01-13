package o0O0o0O;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00000;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class o00oo00O<T> extends o00oo0<T> {

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f12356o00oOoO = o0O00000.o00oOo0o("BrdcstRcvrCnstrntTrckr");

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final BroadcastReceiver f12357o00oOoO0;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends BroadcastReceiver {
        public o00oOOo0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                o00oo00O.this.o00oOoO(context, intent);
            }
        }
    }

    public o00oo00O(@oo0oO0 Context context, @oo0oO0 oO00O0oO oo00o0oo) {
        super(context, oo00o0oo);
        this.f12357o00oOoO0 = new o00oOOo0();
    }

    @Override // o0O0o0O.o00oo0
    public void o00oOo0O() {
        o0O00000.o00oOo00().o00oOOo0(f12356o00oOoO, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f12350o00oOOoO.registerReceiver(this.f12357o00oOoO0, o00oOoO0());
    }

    @Override // o0O0o0O.o00oo0
    public void o00oOo0o() {
        o0O00000.o00oOo00().o00oOOo0(f12356o00oOoO, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f12350o00oOOoO.unregisterReceiver(this.f12357o00oOoO0);
    }

    public abstract void o00oOoO(Context context, @oo0oO0 Intent intent);

    public abstract IntentFilter o00oOoO0();
}
