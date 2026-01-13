package o0OOO0oo;

import android.support.v4.media.o00oOo0O;
import androidx.recyclerview.widget.o00oo0O0;
import com.google.common.base.Ascii;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;
import o0O00Oo.o0oO0Ooo;
import o0OO0o.o0OO00o0;
import o0OO0oO.o00oOo00;
import o0OOOOO0.o0O00;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oO00OO0O;
import o0OOOoo0.oO00OOO;
import org.jetbrains.annotations.NotNull;
@o0oOo0O0
@o0OO00o0(version = "1.8")
/* loaded from: classes3.dex */
public class oo0OOoo {

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final int f13514o00oOo0O = 6;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final int f13515o00oOo0o = 3;

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final byte f13516o00oOoO = 61;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final int f13517o00oOoO0 = 4;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final int f13518o00oOoOO = 76;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f13519o00oOoOo = 19;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f13521o00oOooO = 8;

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final boolean f13524o00oOOo0;

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final boolean f13525o00oOOoO;
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final o00oOOo0 f13513o00oOo00 = new o00oOOo0(null);
    @NotNull

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final byte[] f13520o00oOoo0 = {Ascii.CR, 10};
    @NotNull

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final oo0OOoo f13522o00oOooo = new oo0OOoo(true, false);
    @NotNull

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final oo0OOoo f13523o00oo00O = new oo0OOoo(false, true);

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends oo0OOoo {
        public o00oOOo0() {
            super(false, false);
        }

        @NotNull
        public final oo0OOoo o00ooOo() {
            return oo0OOoo.f13523o00oo00O;
        }

        @NotNull
        public final byte[] o00ooOoO() {
            return oo0OOoo.f13520o00oOoo0;
        }

        @NotNull
        public final oo0OOoo o00ooOoo() {
            return oo0OOoo.f13522o00oOooo;
        }

        public o00oOOo0(o0O00 o0o00) {
            super(false, false);
        }
    }

    public oo0OOoo(boolean z, boolean z2) {
        this.f13524o00oOOo0 = z;
        this.f13525o00oOOoO = z2;
        if (!((z && z2) ? false : true)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public /* synthetic */ oo0OOoo(boolean z, boolean z2, o0O00 o0o00) {
        this(z, z2);
    }

    public static /* synthetic */ byte[] o00oOoOo(oo0OOoo oo0oooo, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = charSequence.length();
            }
            return oo0oooo.o00oOoO(charSequence, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ byte[] o00oOoo0(oo0OOoo oo0oooo, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return oo0oooo.o00oOoOO(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
    }

    public static /* synthetic */ int o00oo0O0(oo0OOoo oo0oooo, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            int i5 = (i4 & 4) != 0 ? 0 : i;
            int i6 = (i4 & 8) != 0 ? 0 : i2;
            if ((i4 & 16) != 0) {
                i3 = bArr.length;
            }
            return oo0oooo.o00oo0(bArr, bArr2, i5, i6, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public static /* synthetic */ int o00oo0OO(oo0OOoo oo0oooo, CharSequence charSequence, byte[] bArr, int i, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            int i5 = (i4 & 4) != 0 ? 0 : i;
            int i6 = (i4 & 8) != 0 ? 0 : i2;
            if ((i4 & 16) != 0) {
                i3 = charSequence.length();
            }
            return oo0oooo.o00oo00O(charSequence, bArr, i5, i6, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
    }

    public static /* synthetic */ String o00oo0o0(oo0OOoo oo0oooo, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return oo0oooo.o00oo0Oo(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
    }

    public static /* synthetic */ int o00oo0oO(oo0OOoo oo0oooo, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj == null) {
            int i5 = (i4 & 4) != 0 ? 0 : i;
            int i6 = (i4 & 8) != 0 ? 0 : i2;
            if ((i4 & 16) != 0) {
                i3 = bArr.length;
            }
            return oo0oooo.o00oo0o(bArr, bArr2, i5, i6, i3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
    }

    public static /* synthetic */ Appendable o00ooO0(oo0OOoo oo0oooo, byte[] bArr, Appendable appendable, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return oo0oooo.o00ooO00(bArr, appendable, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
    }

    public static /* synthetic */ byte[] o00ooO0o(oo0OOoo oo0oooo, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return oo0oooo.o00ooO0O(bArr, i, i2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
    }

    @NotNull
    public final byte[] o00oOo0O(@NotNull CharSequence charSequence, int i, int i2) {
        o0ooO.o00oo0O0(charSequence, FirebaseAnalytics.Param.SOURCE);
        o00oOoO0(charSequence.length(), i, i2);
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt <= 255) {
                bArr[i3] = (byte) charAt;
                i3++;
            } else {
                bArr[i3] = 63;
                i3++;
            }
            i++;
        }
        return bArr;
    }

    public final void o00oOo0o(int i, int i2, int i3) {
        if (i2 < 0 || i2 > i) {
            throw new IndexOutOfBoundsException(o0oO0Ooo.o00oOOo0("destination offset: ", i2, ", destination size: ", i));
        }
        int i4 = i2 + i3;
        if (i4 < 0 || i4 > i) {
            StringBuilder o00oOOo02 = o00oo0O0.o00oOOo0("The destination array does not have enough capacity, destination offset: ", i2, ", destination size: ", i, ", capacity needed: ");
            o00oOOo02.append(i3);
            throw new IndexOutOfBoundsException(o00oOOo02.toString());
        }
    }

    @NotNull
    public final byte[] o00oOoO(@NotNull CharSequence charSequence, int i, int i2) {
        byte[] o00oOo0O2;
        o0ooO.o00oo0O0(charSequence, FirebaseAnalytics.Param.SOURCE);
        if (charSequence instanceof String) {
            o00oOoO0(charSequence.length(), i, i2);
            String substring = ((String) charSequence).substring(i, i2);
            o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = oO00OOO.f13869o00oOoO0;
            o0ooO.o00oo0(substring, "null cannot be cast to non-null type java.lang.String");
            o00oOo0O2 = substring.getBytes(charset);
            o0ooO.o00oo0OO(o00oOo0O2, "this as java.lang.String).getBytes(charset)");
        } else {
            o00oOo0O2 = o00oOo0O(charSequence, i, i2);
        }
        return o00oOoo0(this, o00oOo0O2, 0, 0, 6, null);
    }

    public final void o00oOoO0(int i, int i2, int i3) {
        o00oOo00.Companion.o00oOOo0(i2, i3, i);
    }

    @NotNull
    public final byte[] o00oOoOO(@NotNull byte[] bArr, int i, int i2) {
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        o00oOoO0(bArr.length, i, i2);
        int o00oo0O2 = o00oo0O(bArr, i, i2);
        byte[] bArr2 = new byte[o00oo0O2];
        if (o00oOooo(bArr, bArr2, 0, i, i2) == o00oo0O2) {
            return bArr2;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @NotNull
    public final String o00oOooO(@NotNull byte[] bArr) {
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append((char) b);
        }
        String sb2 = sb.toString();
        o0ooO.o00oo0OO(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public final int o00oOooo(byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        int[] o00oOo002 = this.f13524o00oOOo0 ? o0O0o00.o00oOo00() : o0O0o00.o00oOOo0();
        int i4 = i;
        int i5 = -8;
        int i6 = -8;
        int i7 = 0;
        int i8 = i2;
        while (true) {
            if (i8 >= i3) {
                break;
            }
            if (i5 == i6 && i8 + 3 < i3) {
                int i9 = i8 + 1;
                int i10 = i9 + 1;
                int i11 = i10 + 1;
                int i12 = i11 + 1;
                int i13 = (o00oOo002[bArr[i8] & 255] << 18) | (o00oOo002[bArr[i9] & 255] << 12) | (o00oOo002[bArr[i10] & 255] << 6) | o00oOo002[bArr[i11] & 255];
                if (i13 >= 0) {
                    int i14 = i4 + 1;
                    bArr2[i4] = (byte) (i13 >> 16);
                    int i15 = i14 + 1;
                    bArr2[i14] = (byte) (i13 >> 8);
                    bArr2[i15] = (byte) i13;
                    i4 = i15 + 1;
                    i8 = i12;
                    i6 = -8;
                } else {
                    i8 = i12 - 4;
                }
            }
            int i16 = bArr[i8] & 255;
            int i17 = o00oOo002[i16];
            if (i17 >= 0) {
                i8++;
                i7 = (i7 << 6) | i17;
                i5 += 6;
                if (i5 >= 0) {
                    bArr2[i4] = (byte) (i7 >>> i5);
                    i7 &= (1 << i5) - 1;
                    i5 -= 8;
                    i4++;
                }
            } else if (i17 == -2) {
                i8 = o00ooOO0(bArr, i8, i3, i5);
                break;
            } else if (!this.f13525o00oOOoO) {
                StringBuilder o00oOOo02 = o00oOo0O.o00oOOo0("Invalid symbol '");
                o00oOOo02.append((char) i16);
                o00oOOo02.append("'(");
                String num = Integer.toString(i16, oO00OO0O.o00oOOo0(8));
                o0ooO.o00oo0OO(num, "toString(this, checkRadix(radix))");
                o00oOOo02.append(num);
                o00oOOo02.append(") at index ");
                o00oOOo02.append(i8);
                throw new IllegalArgumentException(o00oOOo02.toString());
            } else {
                i8++;
            }
            i6 = -8;
        }
        if (i5 != -2) {
            int o00ooOo02 = o00ooOo0(bArr, i8, i3);
            if (o00ooOo02 >= i3) {
                return i4 - i;
            }
            int i18 = bArr[o00ooOo02] & 255;
            StringBuilder o00oOOo03 = o00oOo0O.o00oOOo0("Symbol '");
            o00oOOo03.append((char) i18);
            o00oOOo03.append("'(");
            String num2 = Integer.toString(i18, oO00OO0O.o00oOOo0(8));
            o0ooO.o00oo0OO(num2, "toString(this, checkRadix(radix))");
            o00oOOo03.append(num2);
            o00oOOo03.append(") at index ");
            o00oOOo03.append(o00ooOo02 - 1);
            o00oOOo03.append(" is prohibited after the pad character");
            throw new IllegalArgumentException(o00oOOo03.toString());
        }
        throw new IllegalArgumentException("The last unit of input does not have enough bits");
    }

    public final int o00oo(int i) {
        int i2 = ((i + 3) - 1) / 3;
        int i3 = ((this.f13525o00oOOoO ? (i2 - 1) / 19 : 0) * 2) + (i2 * 4);
        if (i3 >= 0) {
            return i3;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    public final int o00oo0(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(bArr2, FirebaseAnalytics.Param.DESTINATION);
        o00oOoO0(bArr.length, i2, i3);
        o00oOo0o(bArr2.length, i, o00oo0O(bArr, i2, i3));
        return o00oOooo(bArr, bArr2, i, i2, i3);
    }

    public final int o00oo00O(@NotNull CharSequence charSequence, @NotNull byte[] bArr, int i, int i2, int i3) {
        byte[] o00oOo0O2;
        o0ooO.o00oo0O0(charSequence, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.DESTINATION);
        if (charSequence instanceof String) {
            o00oOoO0(charSequence.length(), i2, i3);
            String substring = ((String) charSequence).substring(i2, i3);
            o0ooO.o00oo0OO(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = oO00OOO.f13869o00oOoO0;
            o0ooO.o00oo0(substring, "null cannot be cast to non-null type java.lang.String");
            o00oOo0O2 = substring.getBytes(charset);
            o0ooO.o00oo0OO(o00oOo0O2, "this as java.lang.String).getBytes(charset)");
        } else {
            o00oOo0O2 = o00oOo0O(charSequence, i2, i3);
        }
        return o00oo0O0(this, o00oOo0O2, bArr, i, 0, 0, 24, null);
    }

    public final int o00oo0O(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        if (i3 == 0) {
            return 0;
        }
        if (i3 != 1) {
            if (this.f13525o00oOOoO) {
                while (true) {
                    if (i >= i2) {
                        break;
                    }
                    int i4 = o0O0o00.o00oOOo0()[bArr[i] & 255];
                    if (i4 < 0) {
                        if (i4 == -2) {
                            i3 -= i2 - i;
                            break;
                        }
                        i3--;
                    }
                    i++;
                }
            } else if (bArr[i2 - 1] == 61) {
                i3--;
                if (bArr[i2 - 2] == 61) {
                    i3--;
                }
            }
            return (int) ((i3 * 6) / 8);
        }
        throw new IllegalArgumentException(o0oO0Ooo.o00oOOo0("Input should have at list 2 symbols for Base64 decoding, startIndex: ", i, ", endIndex: ", i2));
    }

    @NotNull
    public final String o00oo0Oo(@NotNull byte[] bArr, int i, int i2) {
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        return new String(o00ooO(bArr, i, i2), oO00OOO.f13869o00oOoO0);
    }

    public final int o00oo0o(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(bArr2, FirebaseAnalytics.Param.DESTINATION);
        return o0O0o(bArr, bArr2, i, i2, i3);
    }

    @NotNull
    public final byte[] o00ooO(@NotNull byte[] bArr, int i, int i2) {
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        o00oOoO0(bArr.length, i, i2);
        byte[] bArr2 = new byte[o00oo(i2 - i)];
        o0O0o(bArr, bArr2, 0, i, i2);
        return bArr2;
    }

    @NotNull
    public final <A extends Appendable> A o00ooO00(@NotNull byte[] bArr, @NotNull A a, int i, int i2) {
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(a, FirebaseAnalytics.Param.DESTINATION);
        a.append(new String(o00ooO(bArr, i, i2), oO00OOO.f13869o00oOoO0));
        return a;
    }

    @NotNull
    public final byte[] o00ooO0O(@NotNull byte[] bArr, int i, int i2) {
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        return o00ooO(bArr, i, i2);
    }

    public final boolean o00ooOO() {
        return this.f13525o00oOOoO;
    }

    public final int o00ooOO0(byte[] bArr, int i, int i2, int i3) {
        if (i3 != -8) {
            if (i3 != -6) {
                if (i3 == -4) {
                    i = o00ooOo0(bArr, i + 1, i2);
                    if (i == i2 || bArr[i] != 61) {
                        throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Missing one pad character at index ", i));
                    }
                } else if (i3 != -2) {
                    throw new IllegalStateException("Unreachable".toString());
                }
            }
            return i + 1;
        }
        throw new IllegalArgumentException(android.support.v4.media.o00oOOo0.o00oOOo0("Redundant pad character at index ", i));
    }

    public final boolean o00ooOOo() {
        return this.f13524o00oOOo0;
    }

    public final int o00ooOo0(byte[] bArr, int i, int i2) {
        if (this.f13525o00oOOoO) {
            while (i < i2) {
                if (o0O0o00.o00oOOo0()[bArr[i] & 255] != -1) {
                    return i;
                }
                i++;
            }
            return i;
        }
        return i;
    }

    public final int o0O0o(@NotNull byte[] bArr, @NotNull byte[] bArr2, int i, int i2, int i3) {
        o0ooO.o00oo0O0(bArr, FirebaseAnalytics.Param.SOURCE);
        o0ooO.o00oo0O0(bArr2, FirebaseAnalytics.Param.DESTINATION);
        o00oOoO0(bArr.length, i2, i3);
        o00oOo0o(bArr2.length, i, o00oo(i3 - i2));
        byte[] o00oOooO2 = this.f13524o00oOOo0 ? o0O0o00.o00oOooO() : o0O0o00.o00oOOoO();
        int i4 = this.f13525o00oOOoO ? 19 : Integer.MAX_VALUE;
        int i5 = i;
        while (true) {
            if (i2 + 2 >= i3) {
                break;
            }
            int min = Math.min((i3 - i2) / 3, i4);
            int i6 = 0;
            while (i6 < min) {
                int i7 = i2 + 1;
                int i8 = i7 + 1;
                int i9 = ((bArr[i2] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
                int i10 = i5 + 1;
                bArr2[i5] = o00oOooO2[i9 >>> 18];
                int i11 = i10 + 1;
                bArr2[i10] = o00oOooO2[(i9 >>> 12) & 63];
                int i12 = i11 + 1;
                bArr2[i11] = o00oOooO2[(i9 >>> 6) & 63];
                i5 = i12 + 1;
                bArr2[i12] = o00oOooO2[i9 & 63];
                i6++;
                i2 = i8 + 1;
            }
            if (min == i4 && i2 != i3) {
                int i13 = i5 + 1;
                byte[] bArr3 = f13520o00oOoo0;
                bArr2[i5] = bArr3[0];
                i5 = i13 + 1;
                bArr2[i13] = bArr3[1];
            }
        }
        int i14 = i3 - i2;
        if (i14 == 1) {
            int i15 = i2 + 1;
            int i16 = (bArr[i2] & 255) << 4;
            int i17 = i5 + 1;
            bArr2[i5] = o00oOooO2[i16 >>> 6];
            int i18 = i17 + 1;
            bArr2[i17] = o00oOooO2[i16 & 63];
            int i19 = i18 + 1;
            bArr2[i18] = f13516o00oOoO;
            i5 = i19 + 1;
            bArr2[i19] = f13516o00oOoO;
            i2 = i15;
        } else if (i14 == 2) {
            int i20 = i2 + 1;
            int i21 = i20 + 1;
            int i22 = ((bArr[i20] & 255) << 2) | ((bArr[i2] & 255) << 10);
            int i23 = i5 + 1;
            bArr2[i5] = o00oOooO2[i22 >>> 12];
            int i24 = i23 + 1;
            bArr2[i23] = o00oOooO2[(i22 >>> 6) & 63];
            int i25 = i24 + 1;
            bArr2[i24] = o00oOooO2[i22 & 63];
            i5 = i25 + 1;
            bArr2[i25] = f13516o00oOoO;
            i2 = i21;
        }
        if (i2 == i3) {
            return i5 - i;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
