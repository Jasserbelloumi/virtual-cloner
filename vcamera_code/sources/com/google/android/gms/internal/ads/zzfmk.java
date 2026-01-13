package com.google.android.gms.internal.ads;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.o0O00;
import java.util.IllegalFormatException;
import java.util.Locale;
import o00oOooO.o0OO00OO;
/* loaded from: classes2.dex */
public final class zzfmk {
    private final String zza;

    public zzfmk(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.zza = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    private static String zze(String str, String str2, @o0OO00OO Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException unused) {
                "Unable to format ".concat(str2);
                str2 = o0O00.o00oOOo0(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return android.support.v4.media.o00oOoO.o00oOOo0(str, " : ", str2);
    }

    public final int zza(String str, @o0OO00OO Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzb(Throwable th, String str, @o0OO00OO Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", zze(this.zza, str, objArr), th);
        }
        return 0;
    }

    public final int zzc(String str, @o0OO00OO Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", zze(this.zza, str, objArr));
        }
        return 0;
    }

    public final int zzd(String str, @o0OO00OO Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", zze(this.zza, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
        }
        return 0;
    }
}
