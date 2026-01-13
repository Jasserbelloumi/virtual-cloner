package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o0O00Oo.o0oO0Ooo;
import org.videolan.libvlc.MediaPlayer;
/* loaded from: classes2.dex */
public final class zzaju {
    public static X509Certificate[][] zza(String str) throws zzajr, SecurityException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair zzc = zzajv.zzc(randomAccessFile);
            if (zzc == null) {
                throw new zzajr("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) zzc.first;
            long longValue = ((Long) zzc.second).longValue();
            long j = (-20) + longValue;
            if (j >= 0) {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new zzajr("ZIP64 APK not supported");
                }
            }
            long zza = zzajv.zza(byteBuffer);
            if (zza >= longValue) {
                throw new zzajr("ZIP Central Directory offset out of range: " + zza + ". ZIP End of Central Directory offset: " + longValue);
            } else if (zzajv.zzb(byteBuffer) + zza == longValue) {
                if (zza < 32) {
                    throw new zzajr("APK too small for APK Signing Block. ZIP Central Directory offset: " + zza);
                }
                ByteBuffer allocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                allocate.order(byteOrder);
                randomAccessFile.seek(zza - allocate.capacity());
                randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
                if (allocate.getLong(8) == 2334950737559900225L && allocate.getLong(16) == 3617552046287187010L) {
                    int i = 0;
                    long j2 = allocate.getLong(0);
                    if (j2 < allocate.capacity() || j2 > 2147483639) {
                        throw new zzajr("APK Signing Block size out of range: " + j2);
                    }
                    int i2 = (int) (8 + j2);
                    long j3 = zza - i2;
                    if (j3 < 0) {
                        throw new zzajr("APK Signing Block offset out of range: " + j3);
                    }
                    ByteBuffer allocate2 = ByteBuffer.allocate(i2);
                    allocate2.order(byteOrder);
                    randomAccessFile.seek(j3);
                    randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
                    long j4 = allocate2.getLong(0);
                    if (j4 != j2) {
                        throw new zzajr("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                    }
                    Pair create = Pair.create(allocate2, Long.valueOf(j3));
                    ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
                    long longValue2 = ((Long) create.second).longValue();
                    if (byteBuffer2.order() == byteOrder) {
                        int capacity = byteBuffer2.capacity() - 24;
                        if (capacity < 8) {
                            throw new IllegalArgumentException("end < start: " + capacity + " < 8");
                        }
                        int capacity2 = byteBuffer2.capacity();
                        if (capacity > byteBuffer2.capacity()) {
                            throw new IllegalArgumentException("end > capacity: " + capacity + " > " + capacity2);
                        }
                        int limit = byteBuffer2.limit();
                        int position = byteBuffer2.position();
                        byteBuffer2.position(0);
                        byteBuffer2.limit(capacity);
                        byteBuffer2.position(8);
                        ByteBuffer slice = byteBuffer2.slice();
                        slice.order(byteBuffer2.order());
                        byteBuffer2.position(0);
                        byteBuffer2.limit(limit);
                        byteBuffer2.position(position);
                        while (slice.hasRemaining()) {
                            i++;
                            if (slice.remaining() < 8) {
                                throw new zzajr("Insufficient data to read size of APK Signing Block entry #" + i);
                            }
                            long j5 = slice.getLong();
                            if (j5 < 4 || j5 > 2147483647L) {
                                throw new zzajr("APK Signing Block entry #" + i + " size out of range: " + j5);
                            }
                            int i3 = (int) j5;
                            int position2 = slice.position() + i3;
                            if (i3 > slice.remaining()) {
                                throw new zzajr("APK Signing Block entry #" + i + " size out of range: " + i3 + ", available: " + slice.remaining());
                            } else if (slice.getInt() == 1896449818) {
                                X509Certificate[][] zzl = zzl(randomAccessFile.getChannel(), new zzajq(zze(slice, i3 - 4), longValue2, zza, longValue, byteBuffer, null));
                                randomAccessFile.close();
                                return zzl;
                            } else {
                                slice.position(position2);
                            }
                        }
                        throw new zzajr("No APK Signature Scheme v2 block in APK Signing Block");
                    }
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                throw new zzajr("No APK Signing Block before ZIP Central Directory");
            } else {
                throw new zzajr("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    private static int zzb(int i) {
        if (i != 1) {
            if (i == 2) {
                return 64;
            }
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Unknown content digest algorthm: ", i));
        }
        return 32;
    }

    private static int zzc(int i) {
        if (i != 513) {
            if (i != 514) {
                if (i != 769) {
                    switch (i) {
                        case 257:
                        case MediaPlayer.Event.Buffering /* 259 */:
                            return 1;
                        case MediaPlayer.Event.Opening /* 258 */:
                        case MediaPlayer.Event.Playing /* 260 */:
                            return 2;
                        default:
                            throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    }
                }
                return 1;
            }
            return 2;
        }
        return 1;
    }

    private static String zzd(int i) {
        if (i != 1) {
            if (i == 2) {
                return "SHA-512";
            }
            throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Unknown content digest algorthm: ", i));
        }
        return "SHA-256";
    }

    private static ByteBuffer zze(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i2 = i + position;
        if (i2 < position || i2 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    private static ByteBuffer zzf(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() >= 4) {
            int i = byteBuffer.getInt();
            if (i >= 0) {
                if (i <= byteBuffer.remaining()) {
                    return zze(byteBuffer, i);
                }
                throw new IOException(o0oO0Ooo.o00oOOo0("Length-prefixed field longer than remaining buffer. Field length: ", i, ", remaining: ", byteBuffer.remaining()));
            }
            throw new IllegalArgumentException("Negative length");
        }
        throw new IOException(android.support.v4.media.o00oOOo0.o00oOOo0("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
    }

    private static void zzg(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    private static void zzh(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        zzajo zzajoVar = new zzajo(fileChannel, 0L, j);
        zzajo zzajoVar2 = new zzajo(fileChannel, j2, j3 - j2);
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        zzajv.zzd(duplicate, j);
        zzajm zzajmVar = new zzajm(duplicate);
        int size = map.size();
        int[] iArr = new int[size];
        int i = 0;
        for (Integer num : map.keySet()) {
            iArr[i] = num.intValue();
            i++;
        }
        try {
            byte[][] zzk = zzk(iArr, new zzajn[]{zzajoVar, zzajoVar2, zzajmVar});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), zzk[i2])) {
                    throw new SecurityException(zzd(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    private static byte[] zzi(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i >= 0) {
            if (i <= byteBuffer.remaining()) {
                byte[] bArr = new byte[i];
                byteBuffer.get(bArr);
                return bArr;
            }
            throw new IOException(o0oO0Ooo.o00oOOo0("Underflow while reading length-prefixed value. Length: ", i, ", available: ", byteBuffer.remaining()));
        }
        throw new IOException("Negative length");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
        r11 = zzc(r10);
        r12 = zzc(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r11 == 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r12 == 1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120 A[Catch: SignatureException -> 0x022a, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x022c, InvalidKeyException -> 0x022e, InvalidKeySpecException -> 0x0230, NoSuchAlgorithmException -> 0x0232, TryCatch #5 {InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | SignatureException | InvalidKeySpecException -> 0x022c, blocks: (B:60:0x010a, B:62:0x0120, B:63:0x0123), top: B:130:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.security.cert.X509Certificate[] zzj(java.nio.ByteBuffer r21, java.util.Map r22, java.security.cert.CertificateFactory r23) throws java.lang.SecurityException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaju.zzj(java.nio.ByteBuffer, java.util.Map, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    private static byte[][] zzk(int[] iArr, zzajn[] zzajnVarArr) throws DigestException {
        int length;
        long j = 0;
        int i = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            j2 += (zzajnVarArr[i2].zza() + 1048575) / 1048576;
        }
        if (j2 < 2097151) {
            byte[][] bArr = new byte[iArr.length];
            int i3 = 0;
            while (true) {
                length = iArr.length;
                if (i3 >= length) {
                    break;
                }
                int i4 = (int) j2;
                byte[] bArr2 = new byte[(zzb(iArr[i3]) * i4) + 5];
                bArr2[0] = 90;
                zzg(i4, bArr2, 1);
                bArr[i3] = bArr2;
                i3++;
            }
            byte[] bArr3 = new byte[5];
            bArr3[0] = -91;
            MessageDigest[] messageDigestArr = new MessageDigest[length];
            for (int i5 = 0; i5 < iArr.length; i5++) {
                String zzd = zzd(iArr[i5]);
                try {
                    messageDigestArr[i5] = MessageDigest.getInstance(zzd);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(zzd.concat(" digest not supported"), e);
                }
            }
            int i6 = 3;
            long j3 = 1048576;
            int i7 = 0;
            int i8 = 0;
            while (i < i6) {
                zzajn zzajnVar = zzajnVarArr[i];
                int i9 = i;
                byte[][] bArr4 = bArr;
                long zza = zzajnVar.zza();
                long j4 = j3;
                int i10 = i8;
                long j5 = j;
                while (zza > j) {
                    int min = (int) Math.min(zza, j4);
                    zzg(min, bArr3, 1);
                    for (int i11 = 0; i11 < length; i11++) {
                        messageDigestArr[i11].update(bArr3);
                    }
                    try {
                        zzajnVar.zzb(messageDigestArr, j5, min);
                        int i12 = 0;
                        while (i12 < iArr.length) {
                            int i13 = iArr[i12];
                            byte[] bArr5 = bArr4[i12];
                            int zzb = zzb(i13);
                            byte[] bArr6 = bArr3;
                            MessageDigest messageDigest = messageDigestArr[i12];
                            MessageDigest[] messageDigestArr2 = messageDigestArr;
                            int digest = messageDigest.digest(bArr5, (i10 * zzb) + 5, zzb);
                            if (digest != zzb) {
                                throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                            }
                            i12++;
                            bArr3 = bArr6;
                            messageDigestArr = messageDigestArr2;
                        }
                        long j6 = min;
                        j5 += j6;
                        zza -= j6;
                        i10++;
                        j = 0;
                        j4 = 1048576;
                    } catch (IOException e2) {
                        throw new DigestException(o0oO0Ooo.o00oOOo0("Failed to digest chunk #", i10, " of section #", i7), e2);
                    }
                }
                i7++;
                i = i9 + 1;
                j = 0;
                i6 = 3;
                i8 = i10;
                j3 = 1048576;
                bArr = bArr4;
                bArr3 = bArr3;
            }
            byte[][] bArr7 = bArr;
            byte[][] bArr8 = new byte[iArr.length];
            for (int i14 = 0; i14 < iArr.length; i14++) {
                int i15 = iArr[i14];
                byte[] bArr9 = bArr7[i14];
                String zzd2 = zzd(i15);
                try {
                    bArr8[i14] = MessageDigest.getInstance(zzd2).digest(bArr9);
                } catch (NoSuchAlgorithmException e3) {
                    throw new RuntimeException(zzd2.concat(" digest not supported"), e3);
                }
            }
            return bArr8;
        }
        throw new DigestException(o0O0OO0.o00oOo0O.o00oOOo0("Too many chunks: ", j2));
    }

    private static X509Certificate[][] zzl(FileChannel fileChannel, zzajq zzajqVar) throws SecurityException {
        ByteBuffer byteBuffer;
        long j;
        long j2;
        long j3;
        ByteBuffer byteBuffer2;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                byteBuffer = zzajqVar.zza;
                ByteBuffer zzf = zzf(byteBuffer);
                int i = 0;
                while (zzf.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(zzj(zzf(zzf), hashMap, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException(o00ooO0.o00oOoO.o00oOOo0("Failed to parse/verify signer #", i, " block"), e);
                    }
                }
                if (i > 0) {
                    if (hashMap.isEmpty()) {
                        throw new SecurityException("No content digests found");
                    }
                    j = zzajqVar.zzb;
                    j2 = zzajqVar.zzc;
                    j3 = zzajqVar.zzd;
                    byteBuffer2 = zzajqVar.zze;
                    zzh(hashMap, fileChannel, j, j2, j3, byteBuffer2);
                    return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()]);
                }
                throw new SecurityException("No signers found");
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
        }
    }
}
