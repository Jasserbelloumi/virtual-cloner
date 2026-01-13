package com.google.android.gms.measurement;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzfr;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurementContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public void attachInfo(@oo0oO0 Context context, @oo0oO0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if ("com.google.android.gms.measurement.google_measurement_service".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@oo0oO0 Uri uri, @o0OO00OO String str, @oo0oO0 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public String getType(@oo0oO0 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public Uri insert(@oo0oO0 Uri uri, @oo0oO0 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Preconditions.checkNotNull(context);
        zzfr.zzp(context, null, null);
        return false;
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public Cursor query(@oo0oO0 Uri uri, @oo0oO0 String[] strArr, @o0OO00OO String str, @oo0oO0 String[] strArr2, @o0OO00OO String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@oo0oO0 Uri uri, @o0OO00OO ContentValues contentValues, @o0OO00OO String str, @oo0oO0 String[] strArr) {
        return 0;
    }
}
