package o0Oo;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes3.dex */
public final class o0O00O0 extends o0O000O {
    @Nullable

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final MessageDigest f15469o00oo0O;
    @Nullable

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Mac f15470o00oo0Oo;

    public o0O00O0(o0O0oo0o o0o0oo0o, String str) {
        super(o0o0oo0o);
        try {
            this.f15469o00oo0O = MessageDigest.getInstance(str);
            this.f15470o00oo0Oo = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public o0O00O0(o0O0oo0o o0o0oo0o, o0O0000O o0o0000o, String str) {
        super(o0o0oo0o);
        try {
            Mac mac = Mac.getInstance(str);
            this.f15470o00oo0Oo = mac;
            mac.init(new SecretKeySpec(o0o0000o.toByteArray(), str));
            this.f15469o00oo0O = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static o0O00O0 o00oOo0O(o0O0oo0o o0o0oo0o, o0O0000O o0o0000o) {
        return new o0O00O0(o0o0oo0o, o0o0000o, "HmacSHA1");
    }

    public static o0O00O0 o00oOo0o(o0O0oo0o o0o0oo0o, o0O0000O o0o0000o) {
        return new o0O00O0(o0o0oo0o, o0o0000o, "HmacSHA256");
    }

    public static o0O00O0 o00oOoO(o0O0oo0o o0o0oo0o) {
        return new o0O00O0(o0o0oo0o, "MD5");
    }

    public static o0O00O0 o00oOoO0(o0O0oo0o o0o0oo0o, o0O0000O o0o0000o) {
        return new o0O00O0(o0o0oo0o, o0o0000o, "HmacSHA512");
    }

    public static o0O00O0 o00oOoo0(o0O0oo0o o0o0oo0o) {
        return new o0O00O0(o0o0oo0o, "SHA-1");
    }

    public static o0O00O0 o00oOooo(o0O0oo0o o0o0oo0o) {
        return new o0O00O0(o0o0oo0o, "SHA-256");
    }

    public static o0O00O0 o00oo0(o0O0oo0o o0o0oo0o) {
        return new o0O00O0(o0o0oo0o, "SHA-512");
    }

    public o0O0000O o00oOOoO() {
        MessageDigest messageDigest = this.f15469o00oo0O;
        return o0O0000O.of(messageDigest != null ? messageDigest.digest() : this.f15470o00oo0Oo.doFinal());
    }

    @Override // o0Oo.o0O000O, o0Oo.o0O0oo0o
    public void o00oo(o00ooO o00ooo, long j) throws IOException {
        o0O0OO0.o00oOOoO(o00ooo.f15434o00oo0O, 0L, j);
        o0O00oO0 o0o00oo0 = o00ooo.f15435o00oo0O0;
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO);
            MessageDigest messageDigest = this.f15469o00oo0O;
            if (messageDigest != null) {
                messageDigest.update(o0o00oo0.f15492o00oOOo0, o0o00oo0.f15493o00oOOoO, min);
            } else {
                this.f15470o00oo0Oo.update(o0o00oo0.f15492o00oOOo0, o0o00oo0.f15493o00oOOoO, min);
            }
            j2 += min;
            o0o00oo0 = o0o00oo0.f15496o00oOo0o;
        }
        super.o00oo(o00ooo, j);
    }
}
