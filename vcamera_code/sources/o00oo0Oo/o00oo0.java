package o00oo0Oo;

import android.annotation.SuppressLint;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import com.google.android.exoplayer2.C;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OOooO0;
/* loaded from: classes.dex */
public class o00oo0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final String f7487o00oOOo0 = "PackageIdentity";

    @o0OOooO0(28)
    /* loaded from: classes.dex */
    public static class o00oOOo0 implements o00oOo00 {
        @Override // o00oo0Oo.o00oo0.o00oOo00
        public boolean o00oOOo0(String str, PackageManager packageManager, o0O0o o0o0o) throws PackageManager.NameNotFoundException, IOException {
            List<byte[]> o00oOOoO2;
            if (o0o0o.o00oOoO().equals(str) && (o00oOOoO2 = o00oOOoO(str, packageManager)) != null) {
                return o00oOOoO2.size() == 1 ? packageManager.hasSigningCertificate(str, o0o0o.o00oOo0o(0), 1) : o0o0o.equals(o0O0o.o00oOo00(str, o00oOOoO2));
            }
            return false;
        }

        @Override // o00oo0Oo.o00oo0.o00oOo00
        @o0OO00OO
        public List<byte[]> o00oOOoO(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, C.BUFFER_FLAG_FIRST_SAMPLE);
            ArrayList arrayList = new ArrayList();
            SigningInfo signingInfo = packageInfo.signingInfo;
            if (signingInfo.hasMultipleSigners()) {
                for (Signature signature : signingInfo.getApkContentsSigners()) {
                    arrayList.add(o00oo0.o00oOOo0(signature));
                }
            } else {
                arrayList.add(o00oo0.o00oOOo0(signingInfo.getSigningCertificateHistory()[0]));
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO implements o00oOo00 {
        @Override // o00oo0Oo.o00oo0.o00oOo00
        public boolean o00oOOo0(String str, PackageManager packageManager, o0O0o o0o0o) throws IOException, PackageManager.NameNotFoundException {
            List<byte[]> o00oOOoO2;
            if (str.equals(o0o0o.o00oOoO()) && (o00oOOoO2 = o00oOOoO(str, packageManager)) != null) {
                return o0o0o.equals(o0O0o.o00oOo00(str, o00oOOoO2));
            }
            return false;
        }

        @Override // o00oo0Oo.o00oo0.o00oOo00
        @o0OO00OO
        @SuppressLint({"PackageManagerGetSignatures"})
        public List<byte[]> o00oOOoO(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 64);
            ArrayList arrayList = new ArrayList(packageInfo.signatures.length);
            for (Signature signature : packageInfo.signatures) {
                byte[] o00oOOo02 = o00oo0.o00oOOo0(signature);
                if (o00oOOo02 == null) {
                    return null;
                }
                arrayList.add(o00oOOo02);
            }
            return arrayList;
        }
    }

    /* loaded from: classes.dex */
    public interface o00oOo00 {
        boolean o00oOOo0(String str, PackageManager packageManager, o0O0o o0o0o) throws IOException, PackageManager.NameNotFoundException;

        @o0OO00OO
        List<byte[]> o00oOOoO(String str, PackageManager packageManager) throws PackageManager.NameNotFoundException;
    }

    @o0OO00OO
    public static byte[] o00oOOo0(Signature signature) {
        try {
            return MessageDigest.getInstance("SHA256").digest(signature.toByteArray());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    @o0OO00OO
    public static List<byte[]> o00oOOoO(String str, PackageManager packageManager) {
        try {
            return new o00oOOo0().o00oOOoO(str, packageManager);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static o00oOo00 o00oOo00() {
        return new o00oOOo0();
    }

    public static boolean o00oOooO(String str, PackageManager packageManager, o0O0o o0o0o) {
        try {
            return new o00oOOo0().o00oOOo0(str, packageManager, o0o0o);
        } catch (PackageManager.NameNotFoundException | IOException unused) {
            return false;
        }
    }
}
