package o0Oo;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes3.dex */
public final class o0OoO00O extends o0OoOoOo {

    /* renamed from: o00oo0O  reason: collision with root package name */
    public final MessageDigest f15507o00oo0O;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public final Mac f15508o00oo0Oo;

    public o0OoO00O(o0O0O0Oo o0o0o0oo, String str) {
        super(o0o0o0oo);
        try {
            this.f15507o00oo0O = MessageDigest.getInstance(str);
            this.f15508o00oo0Oo = null;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public o0OoO00O(o0O0O0Oo o0o0o0oo, o0O0000O o0o0000o, String str) {
        super(o0o0o0oo);
        try {
            Mac mac = Mac.getInstance(str);
            this.f15508o00oo0Oo = mac;
            mac.init(new SecretKeySpec(o0o0000o.toByteArray(), str));
            this.f15507o00oo0O = null;
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    public static o0OoO00O o00oOo0O(o0O0O0Oo o0o0o0oo, o0O0000O o0o0000o) {
        return new o0OoO00O(o0o0o0oo, o0o0000o, "HmacSHA1");
    }

    public static o0OoO00O o00oOo0o(o0O0O0Oo o0o0o0oo, o0O0000O o0o0000o) {
        return new o0OoO00O(o0o0o0oo, o0o0000o, "HmacSHA256");
    }

    public static o0OoO00O o00oOoO(o0O0O0Oo o0o0o0oo) {
        return new o0OoO00O(o0o0o0oo, "SHA-1");
    }

    public static o0OoO00O o00oOoO0(o0O0O0Oo o0o0o0oo) {
        return new o0OoO00O(o0o0o0oo, "MD5");
    }

    public static o0OoO00O o00oOoo0(o0O0O0Oo o0o0o0oo) {
        return new o0OoO00O(o0o0o0oo, "SHA-256");
    }

    public o0O0000O o00oOOoO() {
        MessageDigest messageDigest = this.f15507o00oo0O;
        return o0O0000O.of(messageDigest != null ? messageDigest.digest() : this.f15508o00oo0Oo.doFinal());
    }

    @Override // o0Oo.o0OoOoOo, o0Oo.o0O0O0Oo
    public long o0O0o000(o00ooO o00ooo, long j) throws IOException {
        long o0O0o0002 = super.o0O0o000(o00ooo, j);
        if (o0O0o0002 != -1) {
            long j2 = o00ooo.f15434o00oo0O;
            long j3 = j2 - o0O0o0002;
            o0O00oO0 o0o00oo0 = o00ooo.f15435o00oo0O0;
            while (j2 > j3) {
                o0o00oo0 = o0o00oo0.f15497o00oOoO0;
                j2 -= o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO;
            }
            while (j2 < o00ooo.f15434o00oo0O) {
                int i = (int) ((o0o00oo0.f15493o00oOOoO + j3) - j2);
                MessageDigest messageDigest = this.f15507o00oo0O;
                if (messageDigest != null) {
                    messageDigest.update(o0o00oo0.f15492o00oOOo0, i, o0o00oo0.f15494o00oOo00 - i);
                } else {
                    this.f15508o00oo0Oo.update(o0o00oo0.f15492o00oOOo0, i, o0o00oo0.f15494o00oOo00 - i);
                }
                j3 = (o0o00oo0.f15494o00oOo00 - o0o00oo0.f15493o00oOOoO) + j2;
                o0o00oo0 = o0o00oo0.f15496o00oOo0o;
                j2 = j3;
            }
        }
        return o0O0o0002;
    }
}
