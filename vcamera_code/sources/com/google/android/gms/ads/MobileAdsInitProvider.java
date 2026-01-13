package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzek;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdkWithMembers
/* loaded from: classes.dex */
public class MobileAdsInitProvider extends ContentProvider {
    private final zzek zza = new zzek();

    @Override // android.content.ContentProvider
    public void attachInfo(@oo0oO0 Context context, @oo0oO0 ProviderInfo providerInfo) {
        this.zza.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@oo0oO0 Uri uri, @oo0oO0 String str, @oo0oO0 String[] strArr) {
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
        return false;
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public Cursor query(@oo0oO0 Uri uri, @oo0oO0 String[] strArr, @oo0oO0 String str, @oo0oO0 String[] strArr2, @oo0oO0 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@oo0oO0 Uri uri, @oo0oO0 ContentValues contentValues, @oo0oO0 String str, @oo0oO0 String[] strArr) {
        return 0;
    }
}
