package o00oo0Oo;

import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.List;
import o00oOooO.o0OO00OO;
import o00oOooO.oo0oO0;
/* loaded from: classes.dex */
public final class o00oo0O0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f7488o00oOOoO = "Token";
    @oo0oO0

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0o f7489o00oOOo0;

    public o00oo0O0(@oo0oO0 o0O0o o0o0o) {
        this.f7489o00oOOo0 = o0o0o;
    }

    @o0OO00OO
    public static o00oo0O0 o00oOOo0(@oo0oO0 String str, @oo0oO0 PackageManager packageManager) {
        List<byte[]> o00oOOoO2 = o00oo0.o00oOOoO(str, packageManager);
        if (o00oOOoO2 == null) {
            return null;
        }
        try {
            return new o00oo0O0(o0O0o.o00oOo00(str, o00oOOoO2));
        } catch (IOException unused) {
            return null;
        }
    }

    @oo0oO0
    public static o00oo0O0 o00oOOoO(@oo0oO0 byte[] bArr) {
        return new o00oo0O0(new o0O0o(bArr));
    }

    public boolean o00oOo00(@oo0oO0 String str, @oo0oO0 PackageManager packageManager) {
        return o00oo0.o00oOooO(str, packageManager, this.f7489o00oOOo0);
    }

    @oo0oO0
    public byte[] o00oOooO() {
        return this.f7489o00oOOo0.o00oOoOo();
    }
}
