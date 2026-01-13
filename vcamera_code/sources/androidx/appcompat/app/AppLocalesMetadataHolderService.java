package androidx.appcompat.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {

    @o0OOooO0(24)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        public static int o00oOOo0() {
            return 512;
        }
    }

    @oo0oO0
    public static ServiceInfo o00oOOo0(@oo0oO0 Context context) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getServiceInfo(new ComponentName(context, AppLocalesMetadataHolderService.class), o00oOOo0.o00oOOo0() | 128);
    }

    @Override // android.app.Service
    @oo0oO0
    public IBinder onBind(@oo0oO0 Intent intent) {
        throw new UnsupportedOperationException();
    }
}
