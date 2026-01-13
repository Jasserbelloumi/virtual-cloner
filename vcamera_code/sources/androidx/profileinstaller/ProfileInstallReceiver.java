package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.o00oOo00;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
import o0O0OO0.o00oo00O;
/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f3975o00oOOo0 = "androidx.profileinstaller.action.INSTALL_PROFILE";
    @oo0oO0

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f3976o00oOOoO = "androidx.profileinstaller.action.SAVE_PROFILE";
    @oo0oO0

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final String f3977o00oOo00 = "androidx.profileinstaller.action.SKIP_FILE";
    @oo0oO0

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final String f3978o00oOo0O = "EXTRA_SKIP_FILE_OPERATION";
    @oo0oO0

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final String f3979o00oOo0o = "WRITE_SKIP_FILE";
    @oo0oO0

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final String f3980o00oOoO = "EXTRA_BENCHMARK_OPERATION";
    @oo0oO0

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final String f3981o00oOoO0 = "DELETE_SKIP_FILE";
    @oo0oO0

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final String f3982o00oOoOO = "DROP_SHADER_CACHE";
    @oo0oO0

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f3983o00oOooO = "androidx.profileinstaller.action.BENCHMARK_OPERATION";

    /* loaded from: classes.dex */
    public class o00oOOo0 implements o00oOo00.o00oOo0O {
        public o00oOOo0() {
        }

        @Override // androidx.profileinstaller.o00oOo00.o00oOo0O
        public void o00oOOo0(int i, @o0OO00OO Object obj) {
            o00oOo00.f4002o00oOoO.o00oOOo0(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        @Override // androidx.profileinstaller.o00oOo00.o00oOo0O
        public void o00oOOoO(int i, @o0OO00OO Object obj) {
            o00oOo00.f4002o00oOoO.o00oOOoO(i, obj);
        }
    }

    public static void o00oOOo0(@oo0oO0 o00oOo00.o00oOo0O o00ooo0o2) {
        Process.sendSignal(Process.myPid(), 10);
        o00ooo0o2.o00oOOo0(12, null);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@oo0oO0 Context context, @o0OO00OO Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (f3975o00oOOo0.equals(action)) {
            o00oOo00.o00oo0(context, new o00oo00O(), new o00oOOo0(), true);
        } else if (f3977o00oOo00.equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString(f3978o00oOo0O);
                if (f3979o00oOo0o.equals(string)) {
                    o00oOo00.o00oo0OO(context, new o00oo00O(), new o00oOOo0());
                } else if (f3981o00oOoO0.equals(string)) {
                    o00oOo00.o00oOooO(context, new o00oo00O(), new o00oOOo0());
                }
            }
        } else if (f3976o00oOOoO.equals(action)) {
            o00oOOo0(new o00oOOo0());
        } else if (!f3983o00oOooO.equals(action) || (extras = intent.getExtras()) == null) {
        } else {
            String string2 = extras.getString(f3980o00oOoO);
            o00oOOo0 o00oooo02 = new o00oOOo0();
            if (f3982o00oOoOO.equals(string2)) {
                androidx.profileinstaller.o00oOOo0.o00oOOoO(context, o00oooo02);
            } else {
                o00oooo02.o00oOOo0(16, null);
            }
        }
    }
}
