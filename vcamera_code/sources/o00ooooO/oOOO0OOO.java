package o00ooooO;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.os.Handler;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import o00oOooO.o0O0O0Oo;
import o00oOooO.o0OO00OO;
import o00oOooO.o0OO0oO0;
import o00oOooO.o0OOooO0;
import o00oOooO.oo0oO0;
@Deprecated
/* loaded from: classes.dex */
public class oOOO0OOO {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final Context f9917o00oOOo0;

    /* loaded from: classes.dex */
    public class o00oOOo0 extends FingerprintManager.AuthenticationCallback {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o00oOo00 f9918o00oOOo0;

        public o00oOOo0(o00oOo00 o00ooo002) {
            this.f9918o00oOOo0 = o00ooo002;
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationError(int i, CharSequence charSequence) {
            this.f9918o00oOOo0.o00oOOo0(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationFailed() {
            this.f9918o00oOOo0.o00oOOoO();
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationHelp(int i, CharSequence charSequence) {
            this.f9918o00oOOo0.o00oOo00(i, charSequence);
        }

        @Override // android.hardware.fingerprint.FingerprintManager.AuthenticationCallback
        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f9918o00oOOo0.o00oOooO(new o00oOo0O(o00oOOoO.o00oOo0o(o00oOOoO.o00oOOoO(authenticationResult))));
        }
    }

    @o0OOooO0(23)
    /* loaded from: classes.dex */
    public static class o00oOOoO {
        @o0O0O0Oo
        @o0OO0oO0("android.permission.USE_FINGERPRINT")
        public static void o00oOOo0(Object obj, Object obj2, CancellationSignal cancellationSignal, int i, Object obj3, Handler handler) {
            ((FingerprintManager) obj).authenticate((FingerprintManager.CryptoObject) obj2, cancellationSignal, i, (FingerprintManager.AuthenticationCallback) obj3, handler);
        }

        @o0O0O0Oo
        public static FingerprintManager.CryptoObject o00oOOoO(Object obj) {
            return ((FingerprintManager.AuthenticationResult) obj).getCryptoObject();
        }

        @o0O0O0Oo
        public static FingerprintManager o00oOo00(Context context) {
            if (context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
                return (FingerprintManager) context.getSystemService(FingerprintManager.class);
            }
            return null;
        }

        @o0O0O0Oo
        @o0OO0oO0("android.permission.USE_FINGERPRINT")
        public static boolean o00oOo0O(Object obj) {
            return ((FingerprintManager) obj).isHardwareDetected();
        }

        @o0O0O0Oo
        public static o00oOoO o00oOo0o(Object obj) {
            FingerprintManager.CryptoObject cryptoObject = (FingerprintManager.CryptoObject) obj;
            if (cryptoObject == null) {
                return null;
            }
            if (cryptoObject.getCipher() != null) {
                return new o00oOoO(cryptoObject.getCipher());
            }
            if (cryptoObject.getSignature() != null) {
                return new o00oOoO(cryptoObject.getSignature());
            }
            if (cryptoObject.getMac() != null) {
                return new o00oOoO(cryptoObject.getMac());
            }
            return null;
        }

        @o0O0O0Oo
        public static FingerprintManager.CryptoObject o00oOoO0(o00oOoO o00oooo2) {
            if (o00oooo2 == null) {
                return null;
            }
            if (o00oooo2.o00oOOo0() != null) {
                return new FingerprintManager.CryptoObject(o00oooo2.o00oOOo0());
            }
            if (o00oooo2.o00oOo00() != null) {
                return new FingerprintManager.CryptoObject(o00oooo2.o00oOo00());
            }
            if (o00oooo2.o00oOOoO() != null) {
                return new FingerprintManager.CryptoObject(o00oooo2.o00oOOoO());
            }
            return null;
        }

        @o0O0O0Oo
        @o0OO0oO0("android.permission.USE_FINGERPRINT")
        public static boolean o00oOooO(Object obj) {
            return ((FingerprintManager) obj).hasEnrolledFingerprints();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oOo00 {
        public void o00oOOo0(int i, CharSequence charSequence) {
        }

        public void o00oOOoO() {
        }

        public void o00oOo00(int i, CharSequence charSequence) {
        }

        public void o00oOooO(o00oOo0O o00ooo0o2) {
        }
    }

    /* loaded from: classes.dex */
    public static final class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oOoO f9919o00oOOo0;

        public o00oOo0O(o00oOoO o00oooo2) {
            this.f9919o00oOOo0 = o00oooo2;
        }

        public o00oOoO o00oOOo0() {
            return this.f9919o00oOOo0;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final Signature f9920o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final Cipher f9921o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final Mac f9922o00oOo00;

        public o00oOoO(@oo0oO0 Signature signature) {
            this.f9920o00oOOo0 = signature;
            this.f9921o00oOOoO = null;
            this.f9922o00oOo00 = null;
        }

        public o00oOoO(@oo0oO0 Cipher cipher) {
            this.f9921o00oOOoO = cipher;
            this.f9920o00oOOo0 = null;
            this.f9922o00oOo00 = null;
        }

        public o00oOoO(@oo0oO0 Mac mac) {
            this.f9922o00oOo00 = mac;
            this.f9921o00oOOoO = null;
            this.f9920o00oOOo0 = null;
        }

        @o0OO00OO
        public Cipher o00oOOo0() {
            return this.f9921o00oOOoO;
        }

        @o0OO00OO
        public Mac o00oOOoO() {
            return this.f9922o00oOo00;
        }

        @o0OO00OO
        public Signature o00oOo00() {
            return this.f9920o00oOOo0;
        }
    }

    public oOOO0OOO(Context context) {
        this.f9917o00oOOo0 = context;
    }

    @oo0oO0
    public static oOOO0OOO o00oOOoO(@oo0oO0 Context context) {
        return new oOOO0OOO(context);
    }

    @o0OOooO0(23)
    @o0OO00OO
    public static FingerprintManager o00oOo00(@oo0oO0 Context context) {
        return o00oOOoO.o00oOo00(context);
    }

    @o0OOooO0(23)
    public static o00oOoO o00oOo0o(FingerprintManager.CryptoObject cryptoObject) {
        return o00oOOoO.o00oOo0o(cryptoObject);
    }

    @o0OOooO0(23)
    public static FingerprintManager.CryptoObject o00oOoO(o00oOoO o00oooo2) {
        return o00oOOoO.o00oOoO0(o00oooo2);
    }

    @o0OOooO0(23)
    public static FingerprintManager.AuthenticationCallback o00oOoO0(o00oOo00 o00ooo002) {
        return new o00oOOo0(o00ooo002);
    }

    @o0OO0oO0("android.permission.USE_FINGERPRINT")
    public void o00oOOo0(@o0OO00OO o00oOoO o00oooo2, int i, @o0OO00OO o0O000.o00oOoO o00oooo3, @oo0oO0 o00oOo00 o00ooo002, @o0OO00OO Handler handler) {
        FingerprintManager o00oOo002 = o00oOOoO.o00oOo00(this.f9917o00oOOo0);
        if (o00oOo002 != null) {
            o00oOOoO.o00oOOo0(o00oOo002, o00oOOoO.o00oOoO0(o00oooo2), o00oooo3 != null ? (CancellationSignal) o00oooo3.o00oOOoO() : null, i, new o00oOOo0(o00ooo002), handler);
        }
    }

    @o0OO0oO0("android.permission.USE_FINGERPRINT")
    public boolean o00oOo0O() {
        FingerprintManager o00oOo002 = o00oOOoO.o00oOo00(this.f9917o00oOOo0);
        return o00oOo002 != null && o00oOOoO.o00oOo0O(o00oOo002);
    }

    @o0OO0oO0("android.permission.USE_FINGERPRINT")
    public boolean o00oOooO() {
        FingerprintManager o00oOo002 = o00oOOoO.o00oOo00(this.f9917o00oOOo0);
        return o00oOo002 != null && o00oOOoO.o00oOooO(o00oOo002);
    }
}
