package o0O0o0O;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo0.o0O00000;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oo0O0 extends o00oo00O<Boolean> {

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f12364o00oOoOO = o0O00000.o00oOo0o("StorageNotLowTracker");

    public o00oo0O0(@oo0oO0 Context context, @oo0oO0 oO00O0oO oo00o0oo) {
        super(context, oo00o0oo);
    }

    @Override // o0O0o0O.o00oo00O
    public void o00oOoO(Context context, @oo0oO0 Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        o0O00000.o00oOo00().o00oOOo0(f12364o00oOoOO, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        o00oOooO(bool);
    }

    @Override // o0O0o0O.o00oo00O
    public IntentFilter o00oOoO0() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // o0O0o0O.o00oo0
    /* renamed from: o00oOoOO */
    public Boolean o00oOOoO() {
        Intent registerReceiver = this.f12350o00oOOoO.registerReceiver(null, o00oOoO0());
        if (registerReceiver == null || registerReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = registerReceiver.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }
}
