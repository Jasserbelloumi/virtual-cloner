package com.google.android.gms.common.logging;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;
import o00oOooO.oo0oO0;
@KeepForSdk
/* loaded from: classes.dex */
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(@oo0oO0 String str, @oo0oO0 String... strArr) {
        String sb;
        if (strArr.length == 0) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            for (String str2 : strArr) {
                if (sb2.length() > 1) {
                    sb2.append(",");
                }
                sb2.append(str2);
            }
            sb2.append("] ");
            sb = sb2.toString();
        }
        this.zzb = sb;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.zza, i)) {
            i++;
        }
        this.zzd = i;
    }

    @KeepForSdk
    public void d(@oo0oO0 String str, @oo0oO0 Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void e(@oo0oO0 String str, @oo0oO0 Throwable th, @oo0oO0 Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void e(@oo0oO0 String str, @oo0oO0 Object... objArr) {
        format(str, objArr);
    }

    @oo0oO0
    @KeepForSdk
    public String format(@oo0oO0 String str, @oo0oO0 Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @oo0oO0
    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    public void i(@oo0oO0 String str, @oo0oO0 Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.zzd <= i;
    }

    @KeepForSdk
    public void v(@oo0oO0 String str, @oo0oO0 Throwable th, @oo0oO0 Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void v(@oo0oO0 String str, @oo0oO0 Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    public void w(@oo0oO0 String str, @oo0oO0 Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(@oo0oO0 String str, @oo0oO0 Throwable th, @oo0oO0 Object... objArr) {
        Log.wtf(this.zza, format(str, objArr), th);
    }

    @KeepForSdk
    public void wtf(@oo0oO0 Throwable th) {
        Log.wtf(this.zza, th);
    }
}
