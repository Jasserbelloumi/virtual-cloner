package o00ooo0O;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import com.google.android.exoplayer2.C;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00oOoOo.o00oo;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOO00;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o0O0000O {

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOo0 {
        @o0O0O0Oo
        @o0OO00OO
        public static Signature[] o00oOOo0(@oo0oO0 SigningInfo signingInfo) {
            return signingInfo.getApkContentsSigners();
        }

        @o0O0O0Oo
        public static long o00oOOoO(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }

        @o0O0O0Oo
        @o0OO00OO
        public static Signature[] o00oOo00(@oo0oO0 SigningInfo signingInfo) {
            return signingInfo.getSigningCertificateHistory();
        }

        @o0O0O0Oo
        public static boolean o00oOo0O(@oo0oO0 PackageManager packageManager, @oo0oO0 String str, @oo0oO0 byte[] bArr, int i) {
            return packageManager.hasSigningCertificate(str, bArr, i);
        }

        @o0O0O0Oo
        public static boolean o00oOooO(@oo0oO0 SigningInfo signingInfo) {
            return signingInfo.hasMultipleSigners();
        }
    }

    public static boolean o00oOOo0(@oo0oO0 byte[][] bArr, @oo0oO0 byte[] bArr2) {
        for (byte[] bArr3 : bArr) {
            if (Arrays.equals(bArr2, bArr3)) {
                return true;
            }
        }
        return false;
    }

    public static byte[] o00oOOoO(byte[] bArr) {
        try {
            return MessageDigest.getInstance("SHA256").digest(bArr);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Device doesn't support SHA256 cert checking", e);
        }
    }

    public static long o00oOo00(@oo0oO0 PackageInfo packageInfo) {
        return o00oOOo0.o00oOOoO(packageInfo);
    }

    public static boolean o00oOo0O(@oo0oO0 PackageManager packageManager, @oo0oO0 String str, @oo0oO0 @o0OOO00(min = 1) Map<byte[], Integer> map, boolean z) throws PackageManager.NameNotFoundException {
        if (map.isEmpty()) {
            return false;
        }
        Set<byte[]> keySet = map.keySet();
        for (byte[] bArr : keySet) {
            if (bArr == null) {
                throw new IllegalArgumentException(o00oo.o00oOOo0("Cert byte array cannot be null when verifying ", str));
            }
            Integer num = map.get(bArr);
            if (num == null) {
                throw new IllegalArgumentException(o00oo.o00oOOo0("Type must be specified for cert when verifying ", str));
            }
            int intValue = num.intValue();
            if (intValue != 0 && intValue != 1) {
                throw new IllegalArgumentException("Unsupported certificate type " + num + " when verifying " + str);
            }
        }
        List<Signature> o00oOooO2 = o00oOooO(packageManager, str);
        if (!z) {
            for (byte[] bArr2 : keySet) {
                if (!o00oOOo0.o00oOo0O(packageManager, str, bArr2, map.get(bArr2).intValue())) {
                    return false;
                }
            }
            return true;
        }
        if (o00oOooO2.size() != 0 && map.size() <= o00oOooO2.size() && (!z || map.size() == o00oOooO2.size())) {
            byte[][] bArr3 = null;
            if (map.containsValue(1)) {
                bArr3 = new byte[o00oOooO2.size()];
                for (int i = 0; i < o00oOooO2.size(); i++) {
                    bArr3[i] = o00oOOoO(o00oOooO2.get(i).toByteArray());
                }
            }
            Iterator<byte[]> it = keySet.iterator();
            if (it.hasNext()) {
                byte[] next = it.next();
                Integer num2 = map.get(next);
                int intValue2 = num2.intValue();
                if (intValue2 != 0) {
                    if (intValue2 != 1) {
                        throw new IllegalArgumentException("Unsupported certificate type " + num2);
                    } else if (!o00oOOo0(bArr3, next)) {
                        return false;
                    }
                } else if (!o00oOooO2.contains(new Signature(next))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @oo0oO0
    public static List<Signature> o00oOooO(@oo0oO0 PackageManager packageManager, @oo0oO0 String str) throws PackageManager.NameNotFoundException {
        SigningInfo signingInfo = packageManager.getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE).signingInfo;
        Signature[] o00oOOo02 = o00oOOo0.o00oOooO(signingInfo) ? o00oOOo0.o00oOOo0(signingInfo) : o00oOOo0.o00oOo00(signingInfo);
        return o00oOOo02 == null ? Collections.emptyList() : Arrays.asList(o00oOOo02);
    }
}
