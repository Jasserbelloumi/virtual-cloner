package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Calendar;
import o00oOooO.o0OO0oO0;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
import o00ooo0.o0O0o00;
/* loaded from: classes.dex */
public class o0O000o0 {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f507o00oOo0O = 6;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f508o00oOo0o = 22;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static o0O000o0 f509o00oOoO0 = null;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final String f510o00oOooO = "TwilightManager";

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f511o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final LocationManager f512o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o00oOOo0 f513o00oOo00 = new o00oOOo0();

    /* loaded from: classes.dex */
    public static class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public boolean f514o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public long f515o00oOOoO;
    }

    @o0o0000
    public o0O000o0(@oo0oO0 Context context, @oo0oO0 LocationManager locationManager) {
        this.f511o00oOOo0 = context;
        this.f512o00oOOoO = locationManager;
    }

    public static o0O000o0 o00oOOo0(@oo0oO0 Context context) {
        if (f509o00oOoO0 == null) {
            Context applicationContext = context.getApplicationContext();
            f509o00oOoO0 = new o0O000o0(applicationContext, (LocationManager) applicationContext.getSystemService(FirebaseAnalytics.Param.LOCATION));
        }
        return f509o00oOoO0;
    }

    @o0o0000
    public static void o00oOo0o(o0O000o0 o0o000o0) {
        f509o00oOoO0 = o0o000o0;
    }

    @SuppressLint({"MissingPermission"})
    public final Location o00oOOoO() {
        Location o00oOo002 = o0O0o00.o00oOooO(this.f511o00oOOo0, oo0oO0.o00oo0.f17346o00ooOoO) == 0 ? o00oOo00("network") : null;
        Location o00oOo003 = o0O0o00.o00oOooO(this.f511o00oOOo0, oo0oO0.o00oo0.f17344o00ooOo) == 0 ? o00oOo00("gps") : null;
        return (o00oOo003 == null || o00oOo002 == null) ? o00oOo003 != null ? o00oOo003 : o00oOo002 : o00oOo003.getTime() > o00oOo002.getTime() ? o00oOo003 : o00oOo002;
    }

    @o0OO0oO0(anyOf = {oo0oO0.o00oo0.f17346o00ooOoO, oo0oO0.o00oo0.f17344o00ooOo})
    public final Location o00oOo00(String str) {
        try {
            if (this.f512o00oOOoO.isProviderEnabled(str)) {
                return this.f512o00oOOoO.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public final boolean o00oOo0O() {
        return this.f513o00oOo00.f515o00oOOoO > System.currentTimeMillis();
    }

    public final void o00oOoO0(@oo0oO0 Location location) {
        long j;
        o00oOOo0 o00oooo02 = this.f513o00oOo00;
        long currentTimeMillis = System.currentTimeMillis();
        o0O000Oo o00oOOoO2 = o0O000Oo.o00oOOoO();
        o00oOOoO2.o00oOOo0(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        o00oOOoO2.o00oOOo0(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = o00oOOoO2.f506o00oOo00 == 1;
        long j2 = o00oOOoO2.f505o00oOOoO;
        long j3 = o00oOOoO2.f504o00oOOo0;
        o00oOOoO2.o00oOOo0(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = o00oOOoO2.f505o00oOOoO;
        if (j2 == -1 || j3 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j3 ? j4 + 0 : currentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
        }
        o00oooo02.f514o00oOOo0 = z;
        o00oooo02.f515o00oOOoO = j;
    }

    public boolean o00oOooO() {
        o00oOOo0 o00oooo02 = this.f513o00oOo00;
        if (o00oOo0O()) {
            return o00oooo02.f514o00oOOo0;
        }
        Location o00oOOoO2 = o00oOOoO();
        if (o00oOOoO2 != null) {
            o00oOoO0(o00oOOoO2);
            return o00oooo02.f514o00oOOo0;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
