package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;
import o00oOooO.o0OO00OO;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzepu implements zzepn {
    private final zzfuu zza;
    private final Context zzb;

    public zzepu(zzfuu zzfuuVar, Context context) {
        this.zza = zzfuuVar;
        this.zzb = context;
    }

    @o0OO00OO
    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzepn
    public final zzfut zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzept
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzepu.this.zzc();
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:4|2)|5|6|(3:50|51|(15:53|9|10|11|(11:13|14|15|(1:17)(3:32|(3:35|(3:38|(2:41|42)(1:40)|36)|43)|44)|18|(2:20|(5:22|(1:24)(1:30)|(1:26)|27|28))|31|(0)(0)|(0)|27|28)|46|15|(0)(0)|18|(0)|31|(0)(0)|(0)|27|28))|8|9|10|11|(0)|46|15|(0)(0)|18|(0)|31|(0)(0)|(0)|27|28) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #1 {Exception -> 0x00b2, blocks: (B:16:0x008c, B:18:0x009a), top: B:53:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.zzeps zzc() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzepu.zzc():com.google.android.gms.internal.ads.zzeps");
    }
}
