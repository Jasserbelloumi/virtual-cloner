package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.annotation.KeepForSdk;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public interface LifecycleDelegate {
    @KeepForSdk
    void onCreate(@o0OO00OO Bundle bundle);

    @oo0oO0
    @KeepForSdk
    View onCreateView(@oo0oO0 LayoutInflater layoutInflater, @o0OO00OO ViewGroup viewGroup, @o0OO00OO Bundle bundle);

    @KeepForSdk
    void onDestroy();

    @KeepForSdk
    void onDestroyView();

    @KeepForSdk
    void onInflate(@oo0oO0 Activity activity, @oo0oO0 Bundle bundle, @o0OO00OO Bundle bundle2);

    @KeepForSdk
    void onLowMemory();

    @KeepForSdk
    void onPause();

    @KeepForSdk
    void onResume();

    @KeepForSdk
    void onSaveInstanceState(@oo0oO0 Bundle bundle);

    @KeepForSdk
    void onStart();

    @KeepForSdk
    void onStop();
}
