package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaol {
    public static boolean zza;
    private static MessageDigest zzc;
    private static final Object zzd = new Object();
    private static final Object zze = new Object();
    public static final CountDownLatch zzb = new CountDownLatch(1);

    public static String zza(zzans zzansVar, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] zzg;
        zzgqm zzal;
        byte[] zzax = zzansVar.zzax();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbar.zzcO)).booleanValue()) {
            Vector zzb2 = zzb(zzax, 255);
            if (zzb2 == null || zzb2.size() == 0) {
                zzg = zzg(zzf(4096).zzax(), str, true);
                return zzaoh.zza(zzg, true);
            }
            zzaoe zza2 = zzaof.zza();
            int size = zzb2.size();
            for (int i = 0; i < size; i++) {
                zza2.zza(zzgpe.zzv(zzg((byte[]) zzb2.get(i), str, false)));
            }
            zza2.zzb(zzgpe.zzv(zze(zzax)));
            zzal = zza2.zzal();
        } else if (zzaqz.zza == null) {
            throw new GeneralSecurityException();
        } else {
            byte[] zza3 = zzaqz.zza.zza(zzax, str != null ? str.getBytes() : new byte[0]);
            zzaoe zza4 = zzaof.zza();
            zza4.zza(zzgpe.zzv(zza3));
            zza4.zzc(3);
            zzal = zza4.zzal();
        }
        zzg = ((zzaof) zzal).zzax();
        return zzaoh.zza(zzg, true);
    }

    public static Vector zzb(byte[] bArr, int i) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        int i2 = length + 254;
        Vector vector = new Vector();
        for (int i3 = 0; i3 < i2 / 255; i3++) {
            int i4 = i3 * 255;
            try {
                int length2 = bArr.length;
                if (length2 - i4 > 255) {
                    length2 = i4 + 255;
                }
                vector.add(Arrays.copyOfRange(bArr, i4, length2));
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    public static void zzd() {
        synchronized (zze) {
            if (!zza) {
                zza = true;
                new Thread(new zzaok(null)).start();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x001c, code lost:
        r1.reset();
        r1.update(r6);
        r6 = com.google.android.gms.internal.ads.zzaol.zzc.digest();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] zze(byte[] r6) throws java.security.NoSuchAlgorithmException {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzaol.zzd
            monitor-enter(r0)
            zzd()     // Catch: java.lang.Throwable -> L32
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = com.google.android.gms.internal.ads.zzaol.zzb     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            r3 = 2
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            boolean r2 = r2.await(r3, r5)     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L32
            if (r2 != 0) goto L14
            goto L1a
        L14:
            java.security.MessageDigest r2 = com.google.android.gms.internal.ads.zzaol.zzc     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 == 0) goto L2a
            r1.reset()     // Catch: java.lang.Throwable -> L32
            r1.update(r6)     // Catch: java.lang.Throwable -> L32
            java.security.MessageDigest r6 = com.google.android.gms.internal.ads.zzaol.zzc     // Catch: java.lang.Throwable -> L32
            byte[] r6 = r6.digest()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r6
        L2a:
            java.security.NoSuchAlgorithmException r6 = new java.security.NoSuchAlgorithmException     // Catch: java.lang.Throwable -> L32
            java.lang.String r1 = "Cannot compute hash"
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaol.zze(byte[]):byte[]");
    }

    public static zzans zzf(int i) {
        zzamv zza2 = zzans.zza();
        zza2.zzD(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
        return (zzans) zza2.zzal();
    }

    private static byte[] zzg(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        ByteBuffer put;
        int length = bArr.length;
        int i = true != z ? 255 : 239;
        if (length > i) {
            bArr = zzf(4096).zzax();
        }
        int length2 = bArr.length;
        if (length2 < i) {
            byte[] bArr2 = new byte[i - length2];
            new SecureRandom().nextBytes(bArr2);
            put = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr).put(bArr2);
        } else {
            put = ByteBuffer.allocate(i + 1).put((byte) length2).put(bArr);
        }
        byte[] array = put.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(zze(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        zzaom[] zzaomVarArr = new zzapl().zzcG;
        int length3 = zzaomVarArr.length;
        for (int i2 = 0; i2 < 12; i2++) {
            zzaomVarArr[i2].zza(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzgol(str.getBytes(C.UTF8_NAME)).zza(bArr3);
        }
        return bArr3;
    }
}
