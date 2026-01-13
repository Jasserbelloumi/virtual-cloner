package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.StartupTime;
import java.util.concurrent.atomic.AtomicBoolean;
import o00oOooO.o0OO00OO;
import o00oOooO.o0o0000;
import o00oOooO.oo0oO0;
/* loaded from: classes2.dex */
public class FirebaseInitProvider extends ContentProvider {
    @o0o0000
    public static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseinitprovider";
    private static final String TAG = "FirebaseInitProvider";
    @o0OO00OO
    private static StartupTime startupTime = StartupTime.now();
    @oo0oO0
    private static AtomicBoolean currentlyInitializing = new AtomicBoolean(false);

    private static void checkContentProviderAuthority(@oo0oO0 ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @o0OO00OO
    public static StartupTime getStartupTime() {
        return startupTime;
    }

    public static boolean isCurrentlyInitializing() {
        return currentlyInitializing.get();
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@oo0oO0 Context context, @oo0oO0 ProviderInfo providerInfo) {
        checkContentProviderAuthority(providerInfo);
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@oo0oO0 Uri uri, @o0OO00OO String str, @o0OO00OO String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public String getType(@oo0oO0 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public Uri insert(@oo0oO0 Uri uri, @o0OO00OO ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        try {
            currentlyInitializing.set(true);
            FirebaseApp.initializeApp(getContext());
            return false;
        } finally {
            currentlyInitializing.set(false);
        }
    }

    @Override // android.content.ContentProvider
    @o0OO00OO
    public Cursor query(@oo0oO0 Uri uri, @o0OO00OO String[] strArr, @o0OO00OO String str, @o0OO00OO String[] strArr2, @o0OO00OO String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@oo0oO0 Uri uri, @o0OO00OO ContentValues contentValues, @o0OO00OO String str, @o0OO00OO String[] strArr) {
        return 0;
    }
}
