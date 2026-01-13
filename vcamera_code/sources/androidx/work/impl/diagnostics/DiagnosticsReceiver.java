package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO;
import o00oOooO.oo0oO0;
import o0O0Ooo.o0O00O0;
import o0O0Ooo0.o0O000;
import o0O0Ooo0.o0O00000;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f5643o00oOOo0 = o0O00000.o00oOo0o("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(@oo0oO0 Context context, @o0OO00OO Intent intent) {
        if (intent == null) {
            return;
        }
        o0O00000.o00oOo00().o00oOOo0(f5643o00oOOo0, "Requesting diagnostics", new Throwable[0]);
        try {
            o0O00O0.o00ooOoO(context).o00oOoo0(o0O000.o00oOo0o(DiagnosticsWorker.class));
        } catch (IllegalStateException e) {
            o0O00000.o00oOo00().o00oOOoO(f5643o00oOOo0, "WorkManager is not initialized", e);
        }
    }
}
