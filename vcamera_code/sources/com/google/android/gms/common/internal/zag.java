package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public abstract class zag implements DialogInterface.OnClickListener {
    public static zag zab(Activity activity, @o0OO00OO Intent intent, int i) {
        return new zad(intent, activity, i);
    }

    public static zag zac(@oo0oO0 Fragment fragment, @o0OO00OO Intent intent, int i) {
        return new zae(intent, fragment, i);
    }

    public static zag zad(@oo0oO0 LifecycleFragment lifecycleFragment, @o0OO00OO Intent intent, int i) {
        return new zaf(intent, lifecycleFragment, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            zaa();
        } catch (ActivityNotFoundException unused) {
            Build.FINGERPRINT.contains("generic");
        } finally {
            dialogInterface.dismiss();
        }
    }

    public abstract void zaa();
}
