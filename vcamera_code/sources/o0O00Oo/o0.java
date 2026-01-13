package o0O00Oo;

import com.google.common.primitives.UnsignedInts;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import o0OO0o.oO0000Oo;
import o0OOOoo0.oOo0oooO;
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final int f10996o00oOOo0 = 0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f10997o00oOOoO = 1;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f10998o00oOo00 = 2;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f10999o00oOo0O = 4;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f11000o00oOo0o = 5;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final int f11001o00oOoO = 7;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f11002o00oOoO0 = 6;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f11003o00oOoOO = 8;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f11004o00oOoOo = 9;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f11005o00oOoo0 = 10;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f11006o00oOooO = 3;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f11007o00oOooo = 11;

    /* renamed from: o00oo  reason: collision with root package name */
    public static final int f11008o00oo = 22;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f11009o00oo0 = 13;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f11010o00oo00O = 12;

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final int f11011o00oo0O = 16;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final int f11012o00oo0O0 = 15;

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final int f11013o00oo0OO = 14;

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final int f11014o00oo0Oo = 17;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public static final int f11015o00oo0o = 19;

    /* renamed from: o00oo0o0  reason: collision with root package name */
    public static final int f11016o00oo0o0 = 18;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final int f11017o00oo0oO = 20;

    /* renamed from: o00ooO  reason: collision with root package name */
    public static final int f11018o00ooO = 36;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public static final int f11019o00ooO0 = 24;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public static final int f11020o00ooO00 = 23;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public static final int f11021o00ooO0O = 25;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public static final int f11022o00ooO0o = 26;

    /* renamed from: o00ooOO  reason: collision with root package name */
    public static final /* synthetic */ boolean f11023o00ooOO = false;

    /* renamed from: o00ooOO0  reason: collision with root package name */
    public static final o0O000o0 f11024o00ooOO0 = new o0O00Oo.o00oo00O(new byte[]{0}, 1);

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final int f11025o0O0o = 21;

    /* loaded from: classes.dex */
    public static class o00oOOo0 extends o00oo0OO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final o00oOOo0 f11026o00oOo0O = new o00oOOo0(o0.f11024o00ooOO0, 1, 1);

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final /* synthetic */ boolean f11027o00oOo0o = false;

        public o00oOOo0(o0O000o0 o0o000o0, int i, int i2) {
            super(o0o000o0, i, i2);
        }

        public static o00oOOo0 o00oOooO() {
            return f11026o00oOo0O;
        }

        @Override // o0O00Oo.o0.o00oo00O
        public StringBuilder o00oOOo0(StringBuilder sb) {
            sb.append(oOo0oooO.f13903o00oOOoO);
            sb.append(this.f11037o00oOOo0.o00oOo0o(this.f11038o00oOOoO, o00oOOoO()));
            sb.append(oOo0oooO.f13903o00oOOoO);
            return sb;
        }

        @Override // o0O00Oo.o0.o00oo0OO
        public int o00oOOoO() {
            return this.f11042o00oOooO;
        }

        public ByteBuffer o00oOo00() {
            ByteBuffer wrap = ByteBuffer.wrap(this.f11037o00oOOo0.o00oOo0O());
            wrap.position(this.f11038o00oOOoO);
            wrap.limit(o00oOOoO() + this.f11038o00oOOoO);
            return wrap.asReadOnlyBuffer().slice();
        }

        public byte o00oOo0O(int i) {
            return this.f11037o00oOOo0.get(this.f11038o00oOOoO + i);
        }

        public byte[] o00oOo0o() {
            int o00oOOoO2 = o00oOOoO();
            byte[] bArr = new byte[o00oOOoO2];
            for (int i = 0; i < o00oOOoO2; i++) {
                bArr[i] = this.f11037o00oOOo0.get(this.f11038o00oOOoO + i);
            }
            return bArr;
        }

        @Override // o0O00Oo.o0.o00oo00O
        public String toString() {
            return this.f11037o00oOOo0.o00oOo0o(this.f11038o00oOOoO, o00oOOoO());
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOOoO extends RuntimeException {
        public o00oOOoO(String str) {
            super(str);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo00 extends o00oo00O {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final o00oOo00 f11028o00oOooO = new o00oOo00(o0.f11024o00ooOO0, 0, 0);

        public o00oOo00(o0O000o0 o0o000o0, int i, int i2) {
            super(o0o000o0, i, i2);
        }

        public static o00oOo00 o00oOooO() {
            return f11028o00oOooO;
        }

        public boolean equals(Object obj) {
            if (obj instanceof o00oOo00) {
                o00oOo00 o00ooo002 = (o00oOo00) obj;
                return o00ooo002.f11038o00oOOoO == this.f11038o00oOOoO && o00ooo002.f11039o00oOo00 == this.f11039o00oOo00;
            }
            return false;
        }

        public int hashCode() {
            return this.f11038o00oOOoO ^ this.f11039o00oOo00;
        }

        @Override // o0O00Oo.o0.o00oo00O
        public StringBuilder o00oOOo0(StringBuilder sb) {
            sb.append(toString());
            return sb;
        }

        public int o00oOo00(byte[] bArr) {
            byte b;
            byte b2;
            int i = this.f11038o00oOOoO;
            int i2 = 0;
            do {
                b = this.f11037o00oOOo0.get(i);
                b2 = bArr[i2];
                if (b == 0) {
                    return b - b2;
                }
                i++;
                i2++;
                if (i2 == bArr.length) {
                    return b - b2;
                }
            } while (b == b2);
            return b - b2;
        }

        @Override // o0O00Oo.o0.o00oo00O
        public String toString() {
            int i = this.f11038o00oOOoO;
            while (this.f11037o00oOOo0.get(i) != 0) {
                i++;
            }
            int i2 = this.f11038o00oOOoO;
            return this.f11037o00oOOo0.o00oOo0o(i2, i - i2);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOo0O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o00oo0O0 f11029o00oOOo0;

        public o00oOo0O(o00oo0O0 o00oo0o02) {
            this.f11029o00oOOo0 = o00oo0o02;
        }

        public o00oOo00 o00oOOo0(int i) {
            if (i >= o00oOOoO()) {
                return o00oOo00.f11028o00oOooO;
            }
            o00oo0O0 o00oo0o02 = this.f11029o00oOOo0;
            int i2 = (i * o00oo0o02.f11039o00oOo00) + o00oo0o02.f11038o00oOOoO;
            o00oo0O0 o00oo0o03 = this.f11029o00oOOo0;
            o0O000o0 o0o000o0 = o00oo0o03.f11037o00oOOo0;
            return new o00oOo00(o0o000o0, o0.o00oOoOO(o0o000o0, i2, o00oo0o03.f11039o00oOo00), 1);
        }

        public int o00oOOoO() {
            return this.f11029o00oOOo0.o00oOOoO();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (int i = 0; i < this.f11029o00oOOo0.o00oOOoO(); i++) {
                this.f11029o00oOOo0.o00oOooO(i).o00ooO0O(sb);
                if (i != this.f11029o00oOOo0.o00oOOoO() - 1) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            return sb.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oOoO extends o0O0o {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final o00oOoO f11030o00oOo0o = new o00oOoO(o0.f11024o00ooOO0, 1, 1);

        public o00oOoO(o0O000o0 o0o000o0, int i, int i2) {
            super(o0o000o0, i, i2);
        }

        public static o00oOoO o00oOoO0() {
            return f11030o00oOo0o;
        }

        @Override // o0O00Oo.o0.o0O0o, o0O00Oo.o0.o00oo00O
        public StringBuilder o00oOOo0(StringBuilder sb) {
            sb.append("{ ");
            o00oOo0O o00oOoOo2 = o00oOoOo();
            int o00oOOoO2 = o00oOOoO();
            o0O0o o00oOoo02 = o00oOoo0();
            for (int i = 0; i < o00oOOoO2; i++) {
                sb.append(oOo0oooO.f13903o00oOOoO);
                sb.append(o00oOoOo2.o00oOOo0(i).toString());
                sb.append("\" : ");
                sb.append(o00oOoo02.o00oOooO(i).toString());
                if (i != o00oOOoO2 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" }");
            return sb;
        }

        public final int o00oOo0o(o00oOo0O o00ooo0o2, byte[] bArr) {
            int o00oOOoO2 = o00ooo0o2.o00oOOoO() - 1;
            int i = 0;
            while (i <= o00oOOoO2) {
                int i2 = (i + o00oOOoO2) >>> 1;
                int o00oOo002 = o00ooo0o2.o00oOOo0(i2).o00oOo00(bArr);
                if (o00oOo002 < 0) {
                    i = i2 + 1;
                } else if (o00oOo002 <= 0) {
                    return i2;
                } else {
                    o00oOOoO2 = i2 - 1;
                }
            }
            return -(i + 1);
        }

        public o00oo0 o00oOoO(String str) {
            return o00oOoOO(str.getBytes(StandardCharsets.UTF_8));
        }

        public o00oo0 o00oOoOO(byte[] bArr) {
            o00oOo0O o00oOoOo2 = o00oOoOo();
            int o00oOOoO2 = o00oOoOo2.o00oOOoO();
            int o00oOo0o2 = o00oOo0o(o00oOoOo2, bArr);
            return (o00oOo0o2 < 0 || o00oOo0o2 >= o00oOOoO2) ? o00oo0.f11031o00oOo0o : o00oOooO(o00oOo0o2);
        }

        public o00oOo0O o00oOoOo() {
            int i = this.f11038o00oOOoO - (this.f11039o00oOo00 * 3);
            o0O000o0 o0o000o0 = this.f11037o00oOOo0;
            int o00oOoOO2 = o0.o00oOoOO(o0o000o0, i, this.f11039o00oOo00);
            o0O000o0 o0o000o02 = this.f11037o00oOOo0;
            int i2 = this.f11039o00oOo00;
            return new o00oOo0O(new o00oo0O0(o0o000o0, o00oOoOO2, (int) o0.o00oo0OO(o0o000o02, i + i2, i2), 4));
        }

        public o0O0o o00oOoo0() {
            return new o0O0o(this.f11037o00oOOo0, this.f11038o00oOOoO, this.f11039o00oOo00);
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0 {

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final o00oo0 f11031o00oOo0o = new o00oo0(o0.f11024o00ooOO0, 0, 1, 0);

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0O000o0 f11032o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f11033o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f11034o00oOo00;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public int f11035o00oOo0O;

        /* renamed from: o00oOooO  reason: collision with root package name */
        public int f11036o00oOooO;

        public o00oo0(o0O000o0 o0o000o0, int i, int i2, int i3) {
            this(o0o000o0, i, i2, 1 << (i3 & 3), i3 >> 2);
        }

        public o00oo0(o0O000o0 o0o000o0, int i, int i2, int i3, int i4) {
            this.f11032o00oOOo0 = o0o000o0;
            this.f11033o00oOOoO = i;
            this.f11034o00oOo00 = i2;
            this.f11036o00oOooO = i3;
            this.f11035o00oOo0O = i4;
        }

        public o00oOOo0 o00oOOoO() {
            if (o00oo00O() || o0O0o()) {
                o0O000o0 o0o000o0 = this.f11032o00oOOo0;
                return new o00oOOo0(o0o000o0, o0.o00oOoOO(o0o000o0, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
            }
            return o00oOOo0.o00oOooO();
        }

        public boolean o00oOo00() {
            return o00oo0() ? this.f11032o00oOOo0.get(this.f11033o00oOOoO) != 0 : o00oOoOo() != 0;
        }

        public int o00oOo0O() {
            int i = this.f11035o00oOo0O;
            if (i == 1) {
                return o0.o00oOOoO(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i == 6) {
                            o0O000o0 o0o000o0 = this.f11032o00oOOo0;
                            return (int) o0.o00oo0OO(o0o000o0, o0.o00oOoOO(o0o000o0, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
                        } else if (i == 7) {
                            o0O000o0 o0o000o02 = this.f11032o00oOOo0;
                            return (int) o0.o00oo0O0(o0o000o02, o0.o00oOoOO(o0o000o02, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11034o00oOo00);
                        } else if (i == 8) {
                            o0O000o0 o0o000o03 = this.f11032o00oOOo0;
                            return (int) o0.o00oo00O(o0o000o03, o0.o00oOoOO(o0o000o03, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
                        } else if (i != 10) {
                            if (i != 26) {
                                return 0;
                            }
                            return o0.o00oOOoO(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
                        } else {
                            return o00oOoo0().o00oOOoO();
                        }
                    }
                    return Integer.parseInt(o00oOoOO());
                }
                return (int) o0.o00oo00O(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
            }
            return (int) o0.o00oo0O0(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
        }

        public o00oOo00 o00oOo0o() {
            if (o00oo0Oo()) {
                o0O000o0 o0o000o0 = this.f11032o00oOOo0;
                return new o00oOo00(o0o000o0, o0.o00oOoOO(o0o000o0, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
            }
            return o00oOo00.o00oOooO();
        }

        public o00oOoO o00oOoO() {
            if (o00oo0o0()) {
                o0O000o0 o0o000o0 = this.f11032o00oOOo0;
                return new o00oOoO(o0o000o0, o0.o00oOoOO(o0o000o0, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
            }
            return o00oOoO.o00oOoO0();
        }

        public long o00oOoO0() {
            int i = this.f11035o00oOo0O;
            if (i == 1) {
                return o0.o00oo0OO(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
            }
            if (i != 2) {
                if (i != 3) {
                    if (i == 5) {
                        try {
                            return Long.parseLong(o00oOoOO());
                        } catch (NumberFormatException unused) {
                            return 0L;
                        }
                    } else if (i == 6) {
                        o0O000o0 o0o000o0 = this.f11032o00oOOo0;
                        return o0.o00oo0OO(o0o000o0, o0.o00oOoOO(o0o000o0, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
                    } else if (i == 7) {
                        o0O000o0 o0o000o02 = this.f11032o00oOOo0;
                        return o0.o00oo0O0(o0o000o02, o0.o00oOoOO(o0o000o02, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11034o00oOo00);
                    } else if (i == 8) {
                        o0O000o0 o0o000o03 = this.f11032o00oOOo0;
                        return (long) o0.o00oo00O(o0o000o03, o0.o00oOoOO(o0o000o03, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
                    } else if (i != 10) {
                        if (i != 26) {
                            return 0L;
                        }
                        return o0.o00oOOoO(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
                    } else {
                        return o00oOoo0().o00oOOoO();
                    }
                }
                return (long) o0.o00oo00O(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
            }
            return o0.o00oo0O0(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
        }

        public String o00oOoOO() {
            int o00oOoOO2;
            o0O000o0 o0o000o0;
            int i;
            if (o0O0o()) {
                o00oOoOO2 = o0.o00oOoOO(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
                o0O000o0 o0o000o02 = this.f11032o00oOOo0;
                int i2 = this.f11036o00oOooO;
                i = (int) o0.o00oo0O0(o0o000o02, o00oOoOO2 - i2, i2);
                o0o000o0 = this.f11032o00oOOo0;
            } else if (!o00oo0Oo()) {
                return "";
            } else {
                o00oOoOO2 = o0.o00oOoOO(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11036o00oOooO);
                int i3 = o00oOoOO2;
                while (this.f11032o00oOOo0.get(i3) != 0) {
                    i3++;
                }
                o0o000o0 = this.f11032o00oOOo0;
                i = i3 - o00oOoOO2;
            }
            return o0o000o0.o00oOo0o(o00oOoOO2, i);
        }

        public long o00oOoOo() {
            int i = this.f11035o00oOo0O;
            if (i == 2) {
                return o0.o00oo0O0(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
            }
            if (i != 1) {
                if (i != 3) {
                    if (i != 10) {
                        if (i != 26) {
                            if (i != 5) {
                                if (i == 6) {
                                    o0O000o0 o0o000o0 = this.f11032o00oOOo0;
                                    return o0.o00oo0OO(o0o000o0, o0.o00oOoOO(o0o000o0, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
                                } else if (i == 7) {
                                    o0O000o0 o0o000o02 = this.f11032o00oOOo0;
                                    return o0.o00oo0O0(o0o000o02, o0.o00oOoOO(o0o000o02, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
                                } else if (i != 8) {
                                    return 0L;
                                } else {
                                    o0O000o0 o0o000o03 = this.f11032o00oOOo0;
                                    return (long) o0.o00oo00O(o0o000o03, o0.o00oOoOO(o0o000o03, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11034o00oOo00);
                                }
                            }
                            return Long.parseLong(o00oOoOO());
                        }
                        return o0.o00oOOoO(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
                    }
                    return o00oOoo0().o00oOOoO();
                }
                return (long) o0.o00oo00O(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
            }
            return o0.o00oo0OO(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
        }

        public o0O0o o00oOoo0() {
            if (o00ooO0()) {
                o0O000o0 o0o000o0 = this.f11032o00oOOo0;
                return new o0O0o(o0o000o0, o0.o00oOoOO(o0o000o0, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
            }
            int i = this.f11035o00oOo0O;
            if (i == 15) {
                o0O000o0 o0o000o02 = this.f11032o00oOOo0;
                return new o00oo0O0(o0o000o02, o0.o00oOoOO(o0o000o02, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO, 4);
            } else if (o0.o00oOoo0(i)) {
                o0O000o0 o0o000o03 = this.f11032o00oOOo0;
                return new o00oo0O0(o0o000o03, o0.o00oOoOO(o0o000o03, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO, (this.f11035o00oOo0O - 11) + 1);
            } else {
                return o0O0o.o00oOo00();
            }
        }

        public double o00oOooO() {
            int i = this.f11035o00oOo0O;
            if (i == 3) {
                return o0.o00oo00O(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 5) {
                        return Double.parseDouble(o00oOoOO());
                    }
                    if (i == 6) {
                        o0O000o0 o0o000o0 = this.f11032o00oOOo0;
                        return (int) o0.o00oo0OO(o0o000o0, o0.o00oOoOO(o0o000o0, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
                    } else if (i == 7) {
                        o0O000o0 o0o000o02 = this.f11032o00oOOo0;
                        return o0.o00oo0O0(o0o000o02, o0.o00oOoOO(o0o000o02, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
                    } else if (i == 8) {
                        o0O000o0 o0o000o03 = this.f11032o00oOOo0;
                        return o0.o00oo00O(o0o000o03, o0.o00oOoOO(o0o000o03, this.f11033o00oOOoO, this.f11034o00oOo00), this.f11036o00oOooO);
                    } else if (i == 10) {
                        return o00oOoo0().o00oOOoO();
                    } else {
                        if (i != 26) {
                            return 0.0d;
                        }
                    }
                }
                return o0.o00oo0O0(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
            }
            return o0.o00oOOoO(this.f11032o00oOOo0, this.f11033o00oOOoO, this.f11034o00oOo00);
        }

        public int o00oOooo() {
            return this.f11035o00oOo0O;
        }

        public boolean o00oo() {
            return o0.o00oOoo0(this.f11035o00oOo0O);
        }

        public boolean o00oo0() {
            return this.f11035o00oOo0O == 26;
        }

        public boolean o00oo00O() {
            return this.f11035o00oOo0O == 25;
        }

        public boolean o00oo0O() {
            return o00oo0O0() || o00ooO00();
        }

        public boolean o00oo0O0() {
            int i = this.f11035o00oOo0O;
            return i == 1 || i == 6;
        }

        public boolean o00oo0OO() {
            int i = this.f11035o00oOo0O;
            return i == 3 || i == 8;
        }

        public boolean o00oo0Oo() {
            return this.f11035o00oOo0O == 4;
        }

        public boolean o00oo0o() {
            return this.f11035o00oOo0O == 0;
        }

        public boolean o00oo0o0() {
            return this.f11035o00oOo0O == 9;
        }

        public boolean o00oo0oO() {
            return o00oo0O() || o00oo0OO();
        }

        public boolean o00ooO0() {
            int i = this.f11035o00oOo0O;
            return i == 10 || i == 9;
        }

        public boolean o00ooO00() {
            int i = this.f11035o00oOo0O;
            return i == 2 || i == 7;
        }

        public StringBuilder o00ooO0O(StringBuilder sb) {
            int i = this.f11035o00oOo0O;
            if (i != 36) {
                switch (i) {
                    case 0:
                        sb.append("null");
                        return sb;
                    case 1:
                    case 6:
                        sb.append(o00oOoO0());
                        return sb;
                    case 2:
                    case 7:
                        sb.append(o00oOoOo());
                        return sb;
                    case 3:
                    case 8:
                        sb.append(o00oOooO());
                        return sb;
                    case 4:
                        o00oOo00 o00oOo0o2 = o00oOo0o();
                        sb.append(oOo0oooO.f13903o00oOOoO);
                        StringBuilder o00oOOo02 = o00oOo0o2.o00oOOo0(sb);
                        o00oOOo02.append(oOo0oooO.f13903o00oOOoO);
                        return o00oOOo02;
                    case 5:
                        sb.append(oOo0oooO.f13903o00oOOoO);
                        sb.append(o00oOoOO());
                        sb.append(oOo0oooO.f13903o00oOOoO);
                        return sb;
                    case 9:
                        return o00oOoO().o00oOOo0(sb);
                    case 10:
                        return o00oOoo0().o00oOOo0(sb);
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                        StringBuilder o00oOOo03 = android.support.v4.media.o00oOo0O.o00oOOo0("not_implemented:");
                        o00oOOo03.append(this.f11035o00oOo0O);
                        throw new o00oOOoO(o00oOOo03.toString());
                    case 25:
                        return o00oOOoO().o00oOOo0(sb);
                    case 26:
                        sb.append(o00oOo00());
                        return sb;
                    default:
                        return sb;
                }
            }
            sb.append(o00oOoo0());
            return sb;
        }

        public boolean o0O0o() {
            return this.f11035o00oOo0O == 5;
        }

        public String toString() {
            return o00ooO0O(new StringBuilder(128)).toString();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo00O {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public o0O000o0 f11037o00oOOo0;

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public int f11038o00oOOoO;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public int f11039o00oOo00;

        public o00oo00O(o0O000o0 o0o000o0, int i, int i2) {
            this.f11037o00oOOo0 = o0o000o0;
            this.f11038o00oOOoO = i;
            this.f11039o00oOo00 = i2;
        }

        public abstract StringBuilder o00oOOo0(StringBuilder sb);

        public String toString() {
            return o00oOOo0(new StringBuilder(128)).toString();
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O {
        public static int o00oOOo0(byte b) {
            return b & 255;
        }

        public static long o00oOOoO(int i) {
            return i & UnsignedInts.INT_MASK;
        }

        public static int o00oOo00(short s) {
            return s & oO0000Oo.f13232o00oo0o0;
        }
    }

    /* loaded from: classes.dex */
    public static class o00oo0O0 extends o0O0o {

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final o00oo0O0 f11040o00oOoO0 = new o00oo0O0(o0.f11024o00ooOO0, 1, 1, 1);

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public final int f11041o00oOo0o;

        public o00oo0O0(o0O000o0 o0o000o0, int i, int i2, int i3) {
            super(o0o000o0, i, i2);
            this.f11041o00oOo0o = i3;
        }

        public static o00oo0O0 o00oOo0o() {
            return f11040o00oOoO0;
        }

        public boolean o00oOoO() {
            return this == f11040o00oOoO0;
        }

        public int o00oOoO0() {
            return this.f11041o00oOo0o;
        }

        @Override // o0O00Oo.o0.o0O0o
        public o00oo0 o00oOooO(int i) {
            if (i >= o00oOOoO()) {
                return o00oo0.f11031o00oOo0o;
            }
            int i2 = this.f11038o00oOOoO;
            return new o00oo0(this.f11037o00oOOo0, (i * this.f11039o00oOo00) + i2, this.f11039o00oOo00, 1, this.f11041o00oOo0o);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o00oo0OO extends o00oo00O {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final int f11042o00oOooO;

        public o00oo0OO(o0O000o0 o0o000o0, int i, int i2) {
            super(o0o000o0, i, i2);
            this.f11042o00oOooO = o0.o00oOOoO(this.f11037o00oOOo0, i - i2, i2);
        }

        public int o00oOOoO() {
            return this.f11042o00oOooO;
        }
    }

    /* loaded from: classes.dex */
    public static class o0O0o extends o00oo0OO {

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final o0O0o f11043o00oOo0O = new o0O0o(o0.f11024o00ooOO0, 1, 1);

        public o0O0o(o0O000o0 o0o000o0, int i, int i2) {
            super(o0o000o0, i, i2);
        }

        public static o0O0o o00oOo00() {
            return f11043o00oOo0O;
        }

        @Override // o0O00Oo.o0.o00oo00O
        public StringBuilder o00oOOo0(StringBuilder sb) {
            sb.append("[ ");
            int o00oOOoO2 = o00oOOoO();
            for (int i = 0; i < o00oOOoO2; i++) {
                o00oOooO(i).o00ooO0O(sb);
                if (i != o00oOOoO2 - 1) {
                    sb.append(", ");
                }
            }
            sb.append(" ]");
            return sb;
        }

        @Override // o0O00Oo.o0.o00oo0OO
        public int o00oOOoO() {
            return this.f11042o00oOooO;
        }

        public boolean o00oOo0O() {
            return this == f11043o00oOo0O;
        }

        public o00oo0 o00oOooO(int i) {
            long o00oOOoO2 = o00oOOoO();
            long j = i;
            if (j >= o00oOOoO2) {
                return o00oo0.f11031o00oOo0o;
            }
            o0O000o0 o0o000o0 = this.f11037o00oOOo0;
            long j2 = o00oOOoO2 * this.f11039o00oOo00;
            return new o00oo0(this.f11037o00oOOo0, (i * this.f11039o00oOo00) + this.f11038o00oOOoO, this.f11039o00oOo00, o0o000o0.get((int) (j2 + this.f11038o00oOOoO + j)) & 255);
        }

        @Override // o0O00Oo.o0.o00oo00O
        public /* bridge */ /* synthetic */ String toString() {
            return super.toString();
        }
    }

    public static int o00oOOoO(o0O000o0 o0o000o0, int i, int i2) {
        return (int) o00oo0OO(o0o000o0, i, i2);
    }

    public static o00oo0 o00oOoO(o0O000o0 o0o000o0) {
        int o00oOOo02 = o0o000o0.o00oOOo0() - 1;
        byte b = o0o000o0.get(o00oOOo02);
        int i = o00oOOo02 - 1;
        return new o00oo0(o0o000o0, i - b, b, o0o000o0.get(i) & 255);
    }

    @Deprecated
    public static o00oo0 o00oOoO0(ByteBuffer byteBuffer) {
        return o00oOoO(byteBuffer.hasArray() ? new o0O00Oo.o00oo00O(byteBuffer.array(), byteBuffer.limit()) : new o0O00Oo.o00oo0O0(byteBuffer));
    }

    public static int o00oOoOO(o0O000o0 o0o000o0, int i, int i2) {
        return (int) (i - o00oo0O0(o0o000o0, i, i2));
    }

    public static boolean o00oOoOo(int i) {
        return i <= 3 || i == 26;
    }

    public static boolean o00oOoo0(int i) {
        return (i >= 11 && i <= 15) || i == 36;
    }

    public static boolean o00oOooo(int i) {
        return (i >= 1 && i <= 4) || i == 26;
    }

    public static int o00oo0(o0O000o0 o0o000o0, int i, int i2) {
        return (int) o00oo0OO(o0o000o0, i, i2);
    }

    public static double o00oo00O(o0O000o0 o0o000o0, int i, int i2) {
        if (i2 != 4) {
            if (i2 != 8) {
                return -1.0d;
            }
            return o0o000o0.getDouble(i);
        }
        return o0o000o0.getFloat(i);
    }

    public static int o00oo0O(int i, int i2) {
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return 0;
                    }
                    return (i - 1) + 22;
                }
                return (i - 1) + 19;
            }
            return (i - 1) + 16;
        }
        return (i - 1) + 11;
    }

    public static long o00oo0O0(o0O000o0 o0o000o0, int i, int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    if (i2 != 8) {
                        return -1L;
                    }
                    return o0o000o0.getLong(i);
                }
                return o00oo0O.o00oOOoO(o0o000o0.getInt(i));
            }
            return o0o000o0.getShort(i) & oO0000Oo.f13232o00oo0o0;
        }
        return o0o000o0.get(i) & 255;
    }

    public static long o00oo0OO(o0O000o0 o0o000o0, int i, int i2) {
        int i3;
        if (i2 == 1) {
            i3 = o0o000o0.get(i);
        } else if (i2 == 2) {
            i3 = o0o000o0.getShort(i);
        } else if (i2 != 4) {
            if (i2 != 8) {
                return -1L;
            }
            return o0o000o0.getLong(i);
        } else {
            i3 = o0o000o0.getInt(i);
        }
        return i3;
    }

    public static int o00oo0Oo(int i) {
        return (i - 11) + 1;
    }
}
