package o0O00000;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public interface o00oo0OO extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@oo0oO0 List<Location> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onLocationChanged(list.get(i));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@oo0oO0 String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@oo0oO0 String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@oo0oO0 String str, int i, @o0OO00OO Bundle bundle) {
    }
}
