package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzauo {
    @VisibleForTesting
    public static long zza(long j, int i) {
        return i == 1 ? j : (i & 1) == 0 ? zza((j * j) % 1073807359, i >> 1) % 1073807359 : ((zza((j * j) % 1073807359, i >> 1) % 1073807359) * j) % 1073807359;
    }

    @VisibleForTesting
    public static String zzb(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzbza.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i >= i4) {
                sb.append(strArr[i4]);
                return sb.toString();
            }
            sb.append(strArr[i]);
            sb.append(' ');
            i++;
        }
    }

    public static void zzc(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        int i3 = 6;
        if (length < 6) {
            zzd(i, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        int i4 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i4 >= length2 - 5) {
                return;
            }
            String zzb = zzb(strArr, i4, i3);
            long zza = (zzauk.zza(strArr[i4 + 5]) + 2147483647L) % 1073807359;
            zze = (zza + (((((zze + 1073807359) - ((((zzauk.zza(strArr[i4 - 1]) + 2147483647L) % 1073807359) * zza(16785407L, 5)) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzd(i, zze, zzb, length2, priorityQueue);
            i4++;
            i3 = 6;
        }
    }

    @VisibleForTesting
    public static void zzd(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzaun zzaunVar = new zzaun(j, str, i2);
        if ((priorityQueue.size() != i || (((zzaun) priorityQueue.peek()).zzc <= zzaunVar.zzc && ((zzaun) priorityQueue.peek()).zza <= zzaunVar.zza)) && !priorityQueue.contains(zzaunVar)) {
            priorityQueue.add(zzaunVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i, int i2) {
        long zza = (zzauk.zza(strArr[0]) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            zza = (((zzauk.zza(strArr[i3]) + 2147483647L) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
