package o0Oo0Oo0;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import o0Oo.o0;
import o0Oo.o0O0000O;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public abstract class oo0oO0 {

    /* loaded from: classes3.dex */
    public class o00oOOo0 extends oo0oO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f16160o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ o0O0000O f16161o00oOOoO;

        public o00oOOo0(o0oOo0O0 o0ooo0o0, o0O0000O o0o0000o) {
            this.f16160o00oOOo0 = o0ooo0o0;
            this.f16161o00oOOoO = o0o0000o;
        }

        @Override // o0Oo0Oo0.oo0oO0
        public long o00oOOo0() throws IOException {
            return this.f16161o00oOOoO.size();
        }

        @Override // o0Oo0Oo0.oo0oO0
        @Nullable
        public o0oOo0O0 o00oOOoO() {
            return this.f16160o00oOOo0;
        }

        @Override // o0Oo0Oo0.oo0oO0
        public void o00oOoO(o0 o0Var) throws IOException {
            o0Var.o0O0OO0O(this.f16161o00oOOoO);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO extends oo0oO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f16162o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ int f16163o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final /* synthetic */ byte[] f16164o00oOo00;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ int f16165o00oOooO;

        public o00oOOoO(o0oOo0O0 o0ooo0o0, int i, byte[] bArr, int i2) {
            this.f16162o00oOOo0 = o0ooo0o0;
            this.f16163o00oOOoO = i;
            this.f16164o00oOo00 = bArr;
            this.f16165o00oOooO = i2;
        }

        @Override // o0Oo0Oo0.oo0oO0
        public long o00oOOo0() {
            return this.f16163o00oOOoO;
        }

        @Override // o0Oo0Oo0.oo0oO0
        @Nullable
        public o0oOo0O0 o00oOOoO() {
            return this.f16162o00oOOo0;
        }

        @Override // o0Oo0Oo0.oo0oO0
        public void o00oOoO(o0 o0Var) throws IOException {
            o0Var.write(this.f16164o00oOo00, this.f16165o00oOooO, this.f16163o00oOOoO);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 extends oo0oO0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f16166o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final /* synthetic */ File f16167o00oOOoO;

        public o00oOo00(o0oOo0O0 o0ooo0o0, File file) {
            this.f16166o00oOOo0 = o0ooo0o0;
            this.f16167o00oOOoO = file;
        }

        @Override // o0Oo0Oo0.oo0oO0
        public long o00oOOo0() {
            return this.f16167o00oOOoO.length();
        }

        @Override // o0Oo0Oo0.oo0oO0
        @Nullable
        public o0oOo0O0 o00oOOoO() {
            return this.f16166o00oOOo0;
        }

        @Override // o0Oo0Oo0.oo0oO0
        public void o00oOoO(o0 o0Var) throws IOException {
            o0Oo.o0O0O0Oo o0o0o0oo = null;
            try {
                o0o0o0oo = o0Oo.o0O00O.o00oOoo0(this.f16167o00oOOoO);
                o0Var.o0O0o0o(o0o0o0oo);
            } finally {
                oO0000O.o00oOo00(o0o0o0oo);
            }
        }
    }

    public static oo0oO0 o00oOo00(@Nullable o0oOo0O0 o0ooo0o0, File file) {
        if (file != null) {
            return new o00oOo00(o0ooo0o0, file);
        }
        throw new NullPointerException("content == null");
    }

    public static oo0oO0 o00oOo0O(@Nullable o0oOo0O0 o0ooo0o0, o0O0000O o0o0000o) {
        return new o00oOOo0(o0ooo0o0, o0o0000o);
    }

    public static oo0oO0 o00oOo0o(@Nullable o0oOo0O0 o0ooo0o0, byte[] bArr) {
        return o00oOoO0(o0ooo0o0, bArr, 0, bArr.length);
    }

    public static oo0oO0 o00oOoO0(@Nullable o0oOo0O0 o0ooo0o0, byte[] bArr, int i, int i2) {
        if (bArr != null) {
            oO0000O.o00oOOoO(bArr.length, i, i2);
            return new o00oOOoO(o0ooo0o0, i2, bArr, i);
        }
        throw new NullPointerException("content == null");
    }

    public static oo0oO0 o00oOooO(@Nullable o0oOo0O0 o0ooo0o0, String str) {
        Charset charset = oO0000O.f15758o00oOoOo;
        if (o0ooo0o0 != null) {
            Charset o00oOOoO2 = o0ooo0o0.o00oOOoO(null);
            if (o00oOOoO2 == null) {
                o0ooo0o0 = o0oOo0O0.o00oOo00(o0ooo0o0 + "; charset=utf-8");
            } else {
                charset = o00oOOoO2;
            }
        }
        return o00oOo0o(o0ooo0o0, str.getBytes(charset));
    }

    public long o00oOOo0() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract o0oOo0O0 o00oOOoO();

    public abstract void o00oOoO(o0 o0Var) throws IOException;
}
