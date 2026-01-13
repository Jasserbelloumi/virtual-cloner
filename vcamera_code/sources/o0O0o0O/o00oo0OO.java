package o0O0o0O;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import o00oOooO.o0OO0oO;
import o00oOooO.o0OOooO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o0O0000o.o00oOOoO;
import o0O0Ooo0.o0O00000;
import o0oOo0O0.oO00O0oO;
@o0OO0oO({o0OO0oO.o00oOOo0.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class o00oo0OO extends o00oo0<o0O0o00o.o00oo00O> {

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final String f12365o00oOoOo = o0O00000.o00oOo0o("NetworkStateTracker");
    @o0OOooO0(24)

    /* renamed from: o00oOoO  reason: collision with root package name */
    public o00oOOoO f12366o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public final ConnectivityManager f12367o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public o00oOOo0 f12368o00oOoOO;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends BroadcastReceiver {
        public o00oOOo0() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            o0O00000.o00oOo00().o00oOOo0(o00oo0OO.f12365o00oOoOo, "Network broadcast received", new Throwable[0]);
            o00oo0OO o00oo0oo = o00oo0OO.this;
            o00oo0oo.o00oOooO(o00oo0oo.o00oOoO0());
        }
    }

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public class o00oOOoO extends ConnectivityManager.NetworkCallback {
        public o00oOOoO() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@oo0oO0 Network network, @oo0oO0 NetworkCapabilities networkCapabilities) {
            o0O00000.o00oOo00().o00oOOo0(o00oo0OO.f12365o00oOoOo, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            o00oo0OO o00oo0oo = o00oo0OO.this;
            o00oo0oo.o00oOooO(o00oo0oo.o00oOoO0());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@oo0oO0 Network network) {
            o0O00000.o00oOo00().o00oOOo0(o00oo0OO.f12365o00oOoOo, "Network connection lost", new Throwable[0]);
            o00oo0OO o00oo0oo = o00oo0OO.this;
            o00oo0oo.o00oOooO(o00oo0oo.o00oOoO0());
        }
    }

    public o00oo0OO(@oo0oO0 Context context, @oo0oO0 oO00O0oO oo00o0oo) {
        super(context, oo00o0oo);
        this.f12367o00oOoO0 = (ConnectivityManager) this.f12350o00oOOoO.getSystemService("connectivity");
        this.f12366o00oOoO = new o00oOOoO();
    }

    public static boolean o00oOoOo() {
        return true;
    }

    @Override // o0O0o0O.o00oo0
    public void o00oOo0O() {
        try {
            o0O00000.o00oOo00().o00oOOo0(f12365o00oOoOo, "Registering network callback", new Throwable[0]);
            this.f12367o00oOoO0.registerDefaultNetworkCallback(this.f12366o00oOoO);
        } catch (IllegalArgumentException | SecurityException e) {
            o0O00000.o00oOo00().o00oOOoO(f12365o00oOoOo, "Received exception while registering network callback", e);
        }
    }

    @Override // o0O0o0O.o00oo0
    public void o00oOo0o() {
        try {
            o0O00000.o00oOo00().o00oOOo0(f12365o00oOoOo, "Unregistering network callback", new Throwable[0]);
            this.f12367o00oOoO0.unregisterNetworkCallback(this.f12366o00oOoO);
        } catch (IllegalArgumentException | SecurityException e) {
            o0O00000.o00oOo00().o00oOOoO(f12365o00oOoOo, "Received exception while unregistering network callback", e);
        }
    }

    @Override // o0O0o0O.o00oo0
    /* renamed from: o00oOoO */
    public o0O0o00o.o00oo00O o00oOOoO() {
        return o00oOoO0();
    }

    public o0O0o00o.o00oo00O o00oOoO0() {
        NetworkInfo activeNetworkInfo = this.f12367o00oOoO0.getActiveNetworkInfo();
        boolean z = true;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean o00oOoOO2 = o00oOoOO();
        boolean o00oOOo02 = o00oOOoO.o00oOOo0.o00oOOo0(this.f12367o00oOoO0);
        if (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) {
            z = false;
        }
        return new o0O0o00o.o00oo00O(z2, o00oOoOO2, o00oOOo02, z);
    }

    @o0o0000
    public boolean o00oOoOO() {
        try {
            NetworkCapabilities networkCapabilities = this.f12367o00oOoO0.getNetworkCapabilities(this.f12367o00oOoO0.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e) {
            o0O00000.o00oOo00().o00oOOoO(f12365o00oOoOo, "Unable to validate active network", e);
            return false;
        }
    }
}
