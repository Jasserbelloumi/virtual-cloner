package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import androidx.recyclerview.widget.o00oo0O0;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public final class zzdis {
    private final com.google.android.gms.ads.internal.util.zzbo zza;
    private final Clock zzb;
    private final Executor zzc;

    public zzdis(com.google.android.gms.ads.internal.util.zzbo zzboVar, Clock clock, Executor executor) {
        this.zza = zzboVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        long elapsedRealtime = this.zzb.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = this.zzb.elapsedRealtime();
        if (decodeByteArray != null) {
            long j = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder o00oOOo02 = o00oo0O0.o00oOOo0("Decoded image w: ", width, " h:", height, " bytes: ");
            o00oOOo02.append(allocationByteCount);
            o00oOOo02.append(" time: ");
            o00oOOo02.append(j);
            o00oOOo02.append(" on ui thread: ");
            o00oOOo02.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(o00oOOo02.toString());
        }
        return decodeByteArray;
    }

    public final /* synthetic */ Bitmap zza(double d, boolean z, zzakk zzakkVar) {
        byte[] bArr = zzakkVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfI)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i - 1) / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzfJ)).intValue())) / 2);
            }
        }
        return zzc(bArr, options);
    }

    public final zzfut zzb(String str, final double d, final boolean z) {
        return zzfuj.zzl(this.zza.zza(str), new zzfnj() { // from class: com.google.android.gms.internal.ads.zzdir
            @Override // com.google.android.gms.internal.ads.zzfnj
            public final Object apply(Object obj) {
                return zzdis.this.zza(d, z, (zzakk) obj);
            }
        }, this.zzc);
    }
}
