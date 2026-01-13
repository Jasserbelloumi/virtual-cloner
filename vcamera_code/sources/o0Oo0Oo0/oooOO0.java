package o0Oo0Oo0;

import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.annotation.Nullable;
import o00oo0o0.o00oo0;
import o0OOOoo0.oOo0oooO;
import o0Oo.o0;
import o0Oo.o00ooO;
import o0Oo.o0O0000O;
import o0Oo0Oo.oO0000O;
/* loaded from: classes3.dex */
public final class oooOO0 extends oo0oO0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O0000O f16201o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final o0oOo0O0 f16202o00oOOoO;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public final o0oOo0O0 f16203o00oOo00;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public long f16204o00oOo0O = -1;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public final List<o00oOOoO> f16205o00oOooO;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final o0oOo0O0 f16193o00oOo0o = o0oOo0O0.o00oOo00("multipart/mixed");

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final o0oOo0O0 f16195o00oOoO0 = o0oOo0O0.o00oOo00("multipart/alternative");

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final o0oOo0O0 f16194o00oOoO = o0oOo0O0.o00oOo00("multipart/digest");

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final o0oOo0O0 f16196o00oOoOO = o0oOo0O0.o00oOo00("multipart/parallel");

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final o0oOo0O0 f16197o00oOoOo = o0oOo0O0.o00oOo00(o00oo0.f7540o00oOooo);

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final byte[] f16198o00oOoo0 = {58, 32};

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final byte[] f16199o00oOooo = {Ascii.CR, 10};

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final byte[] f16200o00oo00O = {45, 45};

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0O0000O f16206o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public o0oOo0O0 f16207o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final List<o00oOOoO> f16208o00oOo00;

        public o00oOOo0() {
            this(UUID.randomUUID().toString());
        }

        public o00oOOo0(String str) {
            this.f16207o00oOOoO = oooOO0.f16193o00oOo0o;
            this.f16208o00oOo00 = new ArrayList();
            this.f16206o00oOOo0 = o0O0000O.encodeUtf8(str);
        }

        public o00oOOo0 o00oOOo0(String str, String str2) {
            return o00oOooO(o00oOOoO.o00oOooO(str, str2));
        }

        public o00oOOo0 o00oOOoO(String str, @Nullable String str2, oo0oO0 oo0oo0) {
            return o00oOooO(o00oOOoO.o00oOo0O(str, str2, oo0oo0));
        }

        public o00oOOo0 o00oOo00(@Nullable o0O0o00 o0o0o00, oo0oO0 oo0oo0) {
            return o00oOooO(o00oOOoO.o00oOOoO(o0o0o00, oo0oo0));
        }

        public o00oOOo0 o00oOo0O(oo0oO0 oo0oo0) {
            return o00oOooO(o00oOOoO.o00oOOoO(null, oo0oo0));
        }

        public oooOO0 o00oOo0o() {
            if (this.f16208o00oOo00.isEmpty()) {
                throw new IllegalStateException("Multipart body must have at least one part.");
            }
            return new oooOO0(this.f16206o00oOOo0, this.f16207o00oOOoO, this.f16208o00oOo00);
        }

        public o00oOOo0 o00oOoO0(o0oOo0O0 o0ooo0o0) {
            if (o0ooo0o0 != null) {
                if (o0ooo0o0.f16140o00oOOoO.equals("multipart")) {
                    this.f16207o00oOOoO = o0ooo0o0;
                    return this;
                }
                throw new IllegalArgumentException("multipart != " + o0ooo0o0);
            }
            throw new NullPointerException("type == null");
        }

        public o00oOOo0 o00oOooO(o00oOOoO o00ooooo2) {
            if (o00ooooo2 != null) {
                this.f16208o00oOo00.add(o00ooooo2);
                return this;
            }
            throw new NullPointerException("part == null");
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO {
        @Nullable

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0O0o00 f16209o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final oo0oO0 f16210o00oOOoO;

        public o00oOOoO(@Nullable o0O0o00 o0o0o00, oo0oO0 oo0oo0) {
            this.f16209o00oOOo0 = o0o0o00;
            this.f16210o00oOOoO = oo0oo0;
        }

        public static o00oOOoO o00oOOoO(@Nullable o0O0o00 o0o0o00, oo0oO0 oo0oo0) {
            if (oo0oo0 != null) {
                if (o0o0o00 == null || o0o0o00.o00oOOo0("Content-Type") == null) {
                    if (o0o0o00 == null || o0o0o00.o00oOOo0("Content-Length") == null) {
                        return new o00oOOoO(o0o0o00, oo0oo0);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length");
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            }
            throw new NullPointerException("body == null");
        }

        public static o00oOOoO o00oOo00(oo0oO0 oo0oo0) {
            return o00oOOoO(null, oo0oo0);
        }

        public static o00oOOoO o00oOo0O(String str, @Nullable String str2, oo0oO0 oo0oo0) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                oooOO0.o00oOoOO(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    oooOO0.o00oOoOO(sb, str2);
                }
                return o00oOOoO(o0O0o00.o00oOoO(HttpHeaders.CONTENT_DISPOSITION, sb.toString()), oo0oo0);
            }
            throw new NullPointerException("name == null");
        }

        public static o00oOOoO o00oOooO(String str, String str2) {
            return o00oOo0O(str, null, oo0oO0.o00oOooO(null, str2));
        }

        public oo0oO0 o00oOOo0() {
            return this.f16210o00oOOoO;
        }

        @Nullable
        public o0O0o00 o00oOo0o() {
            return this.f16209o00oOOo0;
        }
    }

    public oooOO0(o0O0000O o0o0000o, o0oOo0O0 o0ooo0o0, List<o00oOOoO> list) {
        this.f16201o00oOOo0 = o0o0000o;
        this.f16202o00oOOoO = o0ooo0o0;
        this.f16203o00oOo00 = o0oOo0O0.o00oOo00(o0ooo0o0 + "; boundary=" + o0o0000o.utf8());
        this.f16205o00oOooO = oO0000O.o00oo0OO(list);
    }

    public static StringBuilder o00oOoOO(StringBuilder sb, String str) {
        String str2;
        sb.append(oOo0oooO.f13903o00oOOoO);
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\n') {
                str2 = "%0A";
            } else if (charAt == '\r') {
                str2 = "%0D";
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                str2 = "%22";
            }
            sb.append(str2);
        }
        sb.append(oOo0oooO.f13903o00oOOoO);
        return sb;
    }

    @Override // o0Oo0Oo0.oo0oO0
    public long o00oOOo0() throws IOException {
        long j = this.f16204o00oOo0O;
        if (j != -1) {
            return j;
        }
        long o00oo0OO2 = o00oo0OO(null, true);
        this.f16204o00oOo0O = o00oo0OO2;
        return o00oo0OO2;
    }

    @Override // o0Oo0Oo0.oo0oO0
    public o0oOo0O0 o00oOOoO() {
        return this.f16203o00oOo00;
    }

    @Override // o0Oo0Oo0.oo0oO0
    public void o00oOoO(o0 o0Var) throws IOException {
        o00oo0OO(o0Var, false);
    }

    public String o00oOoOo() {
        return this.f16201o00oOOo0.utf8();
    }

    public o00oOOoO o00oOoo0(int i) {
        return this.f16205o00oOooO.get(i);
    }

    public List<o00oOOoO> o00oOooo() {
        return this.f16205o00oOooO;
    }

    public o0oOo0O0 o00oo0() {
        return this.f16202o00oOOoO;
    }

    public int o00oo00O() {
        return this.f16205o00oOooO.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long o00oo0OO(@Nullable o0 o0Var, boolean z) throws IOException {
        o00ooO o00ooo;
        if (z) {
            o0Var = new o00ooO();
            o00ooo = o0Var;
        } else {
            o00ooo = 0;
        }
        int size = this.f16205o00oOooO.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            o00oOOoO o00ooooo2 = this.f16205o00oOooO.get(i);
            o0O0o00 o0o0o00 = o00ooooo2.f16209o00oOOo0;
            oo0oO0 oo0oo0 = o00ooooo2.f16210o00oOOoO;
            o0Var.write(f16200o00oo00O);
            o0Var.o0O0OO0O(this.f16201o00oOOo0);
            o0Var.write(f16199o00oOooo);
            if (o0o0o00 != null) {
                int length = o0o0o00.f15872o00oOOo0.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    o0Var.o00oooo0(o0o0o00.o00oOooO(i2)).write(f16198o00oOoo0).o00oooo0(o0o0o00.o00oOoo0(i2)).write(f16199o00oOooo);
                }
            }
            o0oOo0O0 o00oOOoO2 = oo0oo0.o00oOOoO();
            if (o00oOOoO2 != null) {
                o0Var.o00oooo0("Content-Type: ").o00oooo0(o00oOOoO2.f16139o00oOOo0).write(f16199o00oOooo);
            }
            long o00oOOo02 = oo0oo0.o00oOOo0();
            if (o00oOOo02 != -1) {
                o0Var.o00oooo0("Content-Length: ").o0O00O(o00oOOo02).write(f16199o00oOooo);
            } else if (z) {
                o00ooo.o00oOOoO();
                return -1L;
            }
            byte[] bArr = f16199o00oOooo;
            o0Var.write(bArr);
            if (z) {
                j += o00oOOo02;
            } else {
                oo0oo0.o00oOoO(o0Var);
            }
            o0Var.write(bArr);
        }
        byte[] bArr2 = f16200o00oo00O;
        o0Var.write(bArr2);
        o0Var.o0O0OO0O(this.f16201o00oOOo0);
        o0Var.write(bArr2);
        o0Var.write(f16199o00oOooo);
        if (z) {
            long j2 = j + o00ooo.f15434o00oo0O;
            o00ooo.o00oOOoO();
            return j2;
        }
        return j;
    }
}
