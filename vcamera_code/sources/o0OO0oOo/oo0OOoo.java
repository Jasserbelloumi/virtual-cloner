package o0OO0oOo;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import o0OO0o.o0O0o;
import o0OO0o.o0OO000;
import o0OO0o.o0OO00o0;
import o0OO0o.o0OOO0O;
import o0OO0o.o0OOO0OO;
import o0OO0o.o0OOOO;
import o0OO0o.o0OOo000;
import o0OO0o.o0OoOoOo;
import o0OO0o.o0oo0000;
import o0OO0o.oO0000Oo;
import o0OO0o.oO0000o0;
import o0OO0o.oO0OoOO0;
import o0OO0o.ooo0Oo0;
import o0OO0oO.o0;
import o0OO0oO.o0O000O;
import o0OO0oO.o0O0o0;
import o0OOO0OO.o00oo00O;
import o0OOOO.o00oo;
import o0OOOO0o.o00oo0OO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class oo0OOoo {

    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0OO0oO.o00oOo00<o0OOOO> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ int[] f13399o00oo0O0;

        public o00oOOo0(int[] iArr) {
            this.f13399o00oo0O0 = iArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof o0OOOO) {
                return o00oOOo0(((o0OOOO) obj).f13218o00oo0O0);
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return o0OOOO.o00oOooO(o00oOOoO(i));
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13399o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof o0OOOO) {
                return o00oOo00(((o0OOOO) obj).f13218o00oo0O0);
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return o0OOo000.o00oo0O0(this.f13399o00oo0O0);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof o0OOOO) {
                return o00oOooO(((o0OOOO) obj).f13218o00oo0O0);
            }
            return -1;
        }

        public boolean o00oOOo0(int i) {
            return o0O000O.o0oooooO(this.f13399o00oo0O0, i);
        }

        public int o00oOOoO(int i) {
            return o0OOo000.o00oOoo0(this.f13399o00oo0O0, i);
        }

        public int o00oOo00(int i) {
            return o0O000O.oOO0o0o(this.f13399o00oo0O0, i);
        }

        public int o00oOooO(int i) {
            return o0O000O.oOOOoOo0(this.f13399o00oo0O0, i);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0OO0oO.o00oOo00<o0oo0000> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ long[] f13400o00oo0O0;

        public o00oOOoO(long[] jArr) {
            this.f13400o00oo0O0 = jArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof o0oo0000) {
                return o00oOOo0(((o0oo0000) obj).f13227o00oo0O0);
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return o0oo0000.o00oOooO(o00oOOoO(i));
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13400o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof o0oo0000) {
                return o00oOo00(((o0oo0000) obj).f13227o00oo0O0);
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return ooo0Oo0.o00oo0O0(this.f13400o00oo0O0);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof o0oo0000) {
                return o00oOooO(((o0oo0000) obj).f13227o00oo0O0);
            }
            return -1;
        }

        public boolean o00oOOo0(long j) {
            return o0O000O.o0oooooo(this.f13400o00oo0O0, j);
        }

        public long o00oOOoO(int i) {
            return ooo0Oo0.o00oOoo0(this.f13400o00oo0O0, i);
        }

        public int o00oOo00(long j) {
            return o0O000O.oOO0o0oO(this.f13400o00oo0O0, j);
        }

        public int o00oOooO(long j) {
            return o0O000O.oOOOoOo(this.f13400o00oo0O0, j);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0OO0oO.o00oOo00<o0OOO0O> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ byte[] f13401o00oo0O0;

        public o00oOo00(byte[] bArr) {
            this.f13401o00oo0O0 = bArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof o0OOO0O) {
                return o00oOOo0(((o0OOO0O) obj).f13209o00oo0O0);
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return o0OOO0O.o00oOooO(o00oOOoO(i));
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13401o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof o0OOO0O) {
                return o00oOo00(((o0OOO0O) obj).f13209o00oo0O0);
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return o0OOO0OO.o00oo0O0(this.f13401o00oo0O0);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof o0OOO0O) {
                return o00oOooO(((o0OOO0O) obj).f13209o00oo0O0);
            }
            return -1;
        }

        public boolean o00oOOo0(byte b) {
            return o0O000O.o0ooooOo(this.f13401o00oo0O0, b);
        }

        public byte o00oOOoO(int i) {
            return o0OOO0OO.o00oOoo0(this.f13401o00oo0O0, i);
        }

        public int o00oOo00(byte b) {
            return o0O000O.oOO0o0OO(this.f13401o00oo0O0, b);
        }

        public int o00oOooO(byte b) {
            return o0O000O.oOOOoOO0(this.f13401o00oo0O0, b);
        }
    }

    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0OO0oO.o00oOo00<oO0000Oo> implements RandomAccess {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ short[] f13402o00oo0O0;

        public o00oOo0O(short[] sArr) {
            this.f13402o00oo0O0 = sArr;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof oO0000Oo) {
                return o00oOOo0(((oO0000Oo) obj).f13234o00oo0O0);
            }
            return false;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public /* bridge */ /* synthetic */ Object get(int i) {
            return oO0000Oo.o00oOooO(o00oOOoO(i));
        }

        @Override // o0OO0oO.o00oOo00, o0OO0oO.o00oOOo0
        public int getSize() {
            return this.f13402o00oo0O0.length;
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof oO0000Oo) {
                return o00oOo00(((oO0000Oo) obj).f13234o00oo0O0);
            }
            return -1;
        }

        @Override // o0OO0oO.o00oOOo0, java.util.Collection
        public boolean isEmpty() {
            return oO0000o0.o00oo0O0(this.f13402o00oo0O0);
        }

        @Override // o0OO0oO.o00oOo00, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof oO0000Oo) {
                return o00oOooO(((oO0000Oo) obj).f13234o00oo0O0);
            }
            return -1;
        }

        public boolean o00oOOo0(short s) {
            return o0O000O.oO00000(this.f13402o00oo0O0, s);
        }

        public short o00oOOoO(int i) {
            return oO0000o0.o00oOoo0(this.f13402o00oo0O0, i);
        }

        public int o00oOo00(short s) {
            return o0O000O.oOO0oO00(this.f13402o00oo0O0, s);
        }

        public int o00oOooO(short s) {
            return o0O000O.oOOOoo0(this.f13402o00oo0O0, s);
        }
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO0o.o0O0o000
    @o00oo0OO(name = "sumOfBigInteger")
    @o0OO00o0(version = "1.4")
    public static final BigInteger o0(long[] jArr, o00oo<? super o0oo0000, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$sumOf");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            valueOf = valueOf.add((BigInteger) o0O0OOO0.o00oOOo0(jArr, i, o00ooVar));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final List<o0OOOO> o00oOOo0(@NotNull int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$asList");
        return new o00oOOo0(iArr);
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final List<o0OOO0O> o00oOOoO(@NotNull byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$asList");
        return new o00oOo00(bArr);
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final List<o0oo0000> o00oOo00(@NotNull long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$asList");
        return new o00oOOoO(jArr);
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    public static final int o00oOo0O(@NotNull int[] iArr, int i, int i2, int i3) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$binarySearch");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i2, i3, iArr.length);
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int o00oOo002 = oO0OoOO0.o00oOo00(iArr[i5], i);
            if (o00oOo002 < 0) {
                i2 = i5 + 1;
            } else if (o00oOo002 <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static int o00oOo0o(int[] iArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = iArr.length;
        }
        return o00oOo0O(iArr, i, i2, i3);
    }

    public static int o00oOoO(short[] sArr, short s, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = sArr.length;
        }
        return o00oOoO0(sArr, s, i, i2);
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    public static final int o00oOoO0(@NotNull short[] sArr, short s, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$binarySearch");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, sArr.length);
        int i3 = s & oO0000Oo.f13232o00oo0o0;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int o00oOo002 = oO0OoOO0.o00oOo00(sArr[i5], i3);
            if (o00oOo002 < 0) {
                i = i5 + 1;
            } else if (o00oOo002 <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    public static final int o00oOoOO(@NotNull long[] jArr, long j, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$binarySearch");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, jArr.length);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int o00oOoO02 = oO0OoOO0.o00oOoO0(jArr[i4], j);
            if (o00oOoO02 < 0) {
                i = i4 + 1;
            } else if (o00oOoO02 <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static int o00oOoOo(long[] jArr, long j, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = jArr.length;
        }
        return o00oOoOO(jArr, j, i, i2);
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    public static final int o00oOoo0(@NotNull byte[] bArr, byte b, int i, int i2) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$binarySearch");
        o0OO0oO.o00oOo00.Companion.o00oOooO(i, i2, bArr.length);
        int i3 = b & 255;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int o00oOo002 = oO0OoOO0.o00oOo00(bArr[i5], i3);
            if (o00oOo002 < 0) {
                i = i5 + 1;
            } else if (o00oOo002 <= 0) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    @o0OoOoOo
    @o0OO00o0(version = "1.3")
    @NotNull
    public static final List<oO0000Oo> o00oOooO(@NotNull short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$asList");
        return new o00oOo0O(sArr);
    }

    public static int o00oOooo(byte[] bArr, byte b, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return o00oOoo0(bArr, b, i, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Comparable, java.lang.Object] */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o00oo00O
    @o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> o0OOOO o00oo(int[] iArr, o00oo<? super o0OOOO, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$maxBy");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (o0OOo000.o00oo0O0(iArr)) {
            return null;
        }
        int o00oOoo02 = o0OOo000.o00oOoo0(iArr, 0);
        int oOO000oo = o0O000O.oOO000oo(iArr);
        if (oOO000oo == 0) {
            return o0OOOO.o00oOooO(o00oOoo02);
        }
        R invoke = o00ooVar.invoke(o0OOOO.o00oOooO(o00oOoo02));
        o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000oo);
        while (o00oOOo02.hasNext()) {
            int o00oOoo03 = o0OOo000.o00oOoo0(iArr, o00oOOo02.nextInt());
            ?? r4 = (Comparable) o0ooO.o00oOOo0(o00oOoo03, o00ooVar);
            if (invoke.compareTo(r4) < 0) {
                o00oOoo02 = o00oOoo03;
                invoke = r4;
            }
        }
        return new o0OOOO(o00oOoo02);
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final short o00oo0(short[] sArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$elementAt");
        return oO0000o0.o00oOoo0(sArr, i);
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final byte o00oo00O(byte[] bArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$elementAt");
        return o0OOO0OO.o00oOoo0(bArr, i);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0OOOO o00oo0O(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$max");
        return o0O0o000.o0o0Oo0(iArr);
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final long o00oo0O0(long[] jArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$elementAt");
        return ooo0Oo0.o00oOoo0(jArr, i);
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final int o00oo0OO(int[] iArr, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$elementAt");
        return o0OOo000.o00oOoo0(iArr, i);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0OOO0O o00oo0Oo(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$max");
        return o0O0o000.o0o0Oo0O(bArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ oO0000Oo o00oo0o(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$max");
        return o0O0o000.o0o0OoO(sArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use maxOrNull instead.", replaceWith = @o0OO000(expression = "this.maxOrNull()", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0oo0000 o00oo0o0(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$max");
        return o0O0o000.o0o0Oo0o(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Comparable, java.lang.Object] */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o00oo00O
    @o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> o0OOO0O o00oo0oO(byte[] bArr, o00oo<? super o0OOO0O, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$maxBy");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (o0OOO0OO.o00oo0O0(bArr)) {
            return null;
        }
        byte o00oOoo02 = o0OOO0OO.o00oOoo0(bArr, 0);
        int oOO000Oo = o0O000O.oOO000Oo(bArr);
        if (oOO000Oo == 0) {
            return o0OOO0O.o00oOooO(o00oOoo02);
        }
        R invoke = o00ooVar.invoke(o0OOO0O.o00oOooO(o00oOoo02));
        o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000Oo);
        while (o00oOOo02.hasNext()) {
            byte o00oOoo03 = o0OOO0OO.o00oOoo0(bArr, o00oOOo02.nextInt());
            ?? r4 = (Comparable) o0O0O0o0.o00oOOo0(o00oOoo03, o00ooVar);
            if (invoke.compareTo(r4) < 0) {
                o00oOoo02 = o00oOoo03;
                invoke = r4;
            }
        }
        return new o0OOO0O(o00oOoo02);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0oo0000 o00ooO(long[] jArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$maxWith");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0o000.o0oOOoo(jArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0OOO0O o00ooO0(byte[] bArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$maxWith");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0o000.o0oOooOO(bArr, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Comparable, java.lang.Object] */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o00oo00O
    @o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> oO0000Oo o00ooO00(short[] sArr, o00oo<? super oO0000Oo, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$maxBy");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (oO0000o0.o00oo0O0(sArr)) {
            return null;
        }
        short o00oOoo02 = oO0000o0.o00oOoo0(sArr, 0);
        int oOO00O0 = o0O000O.oOO00O0(sArr);
        if (oOO00O0 == 0) {
            return oO0000Oo.o00oOooO(o00oOoo02);
        }
        R invoke = o00ooVar.invoke(oO0000Oo.o00oOooO(o00oOoo02));
        o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00O0);
        while (o00oOOo02.hasNext()) {
            short o00oOoo03 = oO0000o0.o00oOoo0(sArr, o00oOOo02.nextInt());
            ?? r4 = (Comparable) o0O0OO0.o00oOOo0(o00oOoo03, o00ooVar);
            if (invoke.compareTo(r4) < 0) {
                o00oOoo02 = o00oOoo03;
                invoke = r4;
            }
        }
        return new oO0000Oo(o00oOoo02);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0OOOO o00ooO0O(int[] iArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$maxWith");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0o000.o0oOOoOo(iArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use maxWithOrNull instead.", replaceWith = @o0OO000(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ oO0000Oo o00ooO0o(short[] sArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$maxWith");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0o000.o0oOOoo0(sArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0OOO0O o00ooOO(byte[] bArr) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$min");
        return o0O0o000.o0oo0OO0(bArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0OOOO o00ooOO0(int[] iArr) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$min");
        return o0O0o000.o0oo0O(iArr);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0oo0000 o00ooOOo(long[] jArr) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$min");
        return o0O0o000.o0oo0OO(jArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Comparable, java.lang.Object] */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o00oo00O
    @o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> o0OOO0O o00ooOo(byte[] bArr, o00oo<? super o0OOO0O, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$minBy");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (o0OOO0OO.o00oo0O0(bArr)) {
            return null;
        }
        byte o00oOoo02 = o0OOO0OO.o00oOoo0(bArr, 0);
        int oOO000Oo = o0O000O.oOO000Oo(bArr);
        if (oOO000Oo == 0) {
            return o0OOO0O.o00oOooO(o00oOoo02);
        }
        R invoke = o00ooVar.invoke(o0OOO0O.o00oOooO(o00oOoo02));
        o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000Oo);
        while (o00oOOo02.hasNext()) {
            byte o00oOoo03 = o0OOO0OO.o00oOoo0(bArr, o00oOOo02.nextInt());
            ?? r4 = (Comparable) o0O0O0o0.o00oOOo0(o00oOoo03, o00ooVar);
            if (invoke.compareTo(r4) > 0) {
                o00oOoo02 = o00oOoo03;
                invoke = r4;
            }
        }
        return new o0OOO0O(o00oOoo02);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use minOrNull instead.", replaceWith = @o0OO000(expression = "this.minOrNull()", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ oO0000Oo o00ooOo0(short[] sArr) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$min");
        return o0O0o000.o0oo0OOO(sArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Comparable, java.lang.Object] */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o00oo00O
    @o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> o0oo0000 o00ooOoO(long[] jArr, o00oo<? super o0oo0000, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$minBy");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (ooo0Oo0.o00oo0O0(jArr)) {
            return null;
        }
        long o00oOoo02 = ooo0Oo0.o00oOoo0(jArr, 0);
        int oOO00 = o0O000O.oOO00(jArr);
        if (oOO00 == 0) {
            return o0oo0000.o00oOooO(o00oOoo02);
        }
        R invoke = o00ooVar.invoke(o0oo0000.o00oOooO(o00oOoo02));
        o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00);
        while (o00oOOo02.hasNext()) {
            long o00oOoo03 = ooo0Oo0.o00oOoo0(jArr, o00oOOo02.nextInt());
            ?? r6 = (Comparable) o0O0OOOo.o00oOOo0(o00oOoo03, o00ooVar);
            if (invoke.compareTo(r6) > 0) {
                o00oOoo02 = o00oOoo03;
                invoke = r6;
            }
        }
        return new o0oo0000(o00oOoo02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Comparable, java.lang.Object] */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o00oo00O
    @o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> o0OOOO o00ooOoo(int[] iArr, o00oo<? super o0OOOO, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$minBy");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (o0OOo000.o00oo0O0(iArr)) {
            return null;
        }
        int o00oOoo02 = o0OOo000.o00oOoo0(iArr, 0);
        int oOO000oo = o0O000O.oOO000oo(iArr);
        if (oOO000oo == 0) {
            return o0OOOO.o00oOooO(o00oOoo02);
        }
        R invoke = o00ooVar.invoke(o0OOOO.o00oOooO(o00oOoo02));
        o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO000oo);
        while (o00oOOo02.hasNext()) {
            int o00oOoo03 = o0OOo000.o00oOoo0(iArr, o00oOOo02.nextInt());
            ?? r4 = (Comparable) o0ooO.o00oOOo0(o00oOoo03, o00ooVar);
            if (invoke.compareTo(r4) > 0) {
                o00oOoo02 = o00oOoo03;
                invoke = r4;
            }
        }
        return new o0OOOO(o00oOoo02);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0OOO0O o00ooo0(byte[] bArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$minWith");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0o000.o0oo0o00(bArr, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Comparable, java.lang.Object] */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o00oo00O
    @o0O0o(message = "Use minByOrNull instead.", replaceWith = @o0OO000(expression = "this.minByOrNull(selector)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> oO0000Oo o00ooo00(short[] sArr, o00oo<? super oO0000Oo, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$minBy");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (oO0000o0.o00oo0O0(sArr)) {
            return null;
        }
        short o00oOoo02 = oO0000o0.o00oOoo0(sArr, 0);
        int oOO00O0 = o0O000O.oOO00O0(sArr);
        if (oOO00O0 == 0) {
            return oO0000Oo.o00oOooO(o00oOoo02);
        }
        R invoke = o00ooVar.invoke(oO0000Oo.o00oOooO(o00oOoo02));
        o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00O0);
        while (o00oOOo02.hasNext()) {
            short o00oOoo03 = oO0000o0.o00oOoo0(sArr, o00oOOo02.nextInt());
            ?? r4 = (Comparable) o0O0OO0.o00oOOo0(o00oOoo03, o00ooVar);
            if (invoke.compareTo(r4) > 0) {
                o00oOoo02 = o00oOoo03;
                invoke = r4;
            }
        }
        return new oO0000Oo(o00oOoo02);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0OOOO o00ooo0O(int[] iArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$minWith");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0o000.o0oo0o0(iArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ oO0000Oo o00ooo0o(short[] sArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$minWith");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0o000.o0oo0o0O(sArr, comparator);
    }

    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o0O0o(message = "Use minWithOrNull instead.", replaceWith = @o0OO000(expression = "this.minWithOrNull(comparator)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ o0oo0000 o00oooO(long[] jArr, Comparator comparator) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$minWith");
        o0OOOOO0.o0ooO.o00oo0O0(comparator, "comparator");
        return o0O0o000.o0oo0o0o(jArr, comparator);
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO0o.o0O0o000
    @o00oo0OO(name = "sumOfBigDecimal")
    @o0OO00o0(version = "1.4")
    public static final BigDecimal o00oooOO(byte[] bArr, o00oo<? super o0OOO0O, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$sumOf");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            valueOf = valueOf.add((BigDecimal) o0O0OO.o00oOOo0(bArr, i, o00ooVar));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO0o.o0O0o000
    @o00oo0OO(name = "sumOfBigDecimal")
    @o0OO00o0(version = "1.4")
    public static final BigDecimal o00oooOo(int[] iArr, o00oo<? super o0OOOO, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$sumOf");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            valueOf = valueOf.add((BigDecimal) o0O0OOO.o00oOOo0(iArr, i, o00ooVar));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO0o.o0O0o000
    @o00oo0OO(name = "sumOfBigDecimal")
    @o0OO00o0(version = "1.4")
    public static final BigDecimal o00oooo(short[] sArr, o00oo<? super oO0000Oo, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$sumOf");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            valueOf = valueOf.add((BigDecimal) o0OooO0.o00oOOo0(sArr, i, o00ooVar));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO0o.o0O0o000
    @o00oo0OO(name = "sumOfBigDecimal")
    @o0OO00o0(version = "1.4")
    public static final BigDecimal o00oooo0(long[] jArr, o00oo<? super o0oo0000, ? extends BigDecimal> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$sumOf");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            valueOf = valueOf.add((BigDecimal) o0O0OOO0.o00oOOo0(jArr, i, o00ooVar));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO0o.o0O0o000
    @o00oo0OO(name = "sumOfBigInteger")
    @o0OO00o0(version = "1.4")
    public static final BigInteger o00ooooO(byte[] bArr, o00oo<? super o0OOO0O, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(bArr, "$this$sumOf");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            valueOf = valueOf.add((BigInteger) o0O0OO.o00oOOo0(bArr, i, o00ooVar));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO0o.o0O0o000
    @o00oo0OO(name = "sumOfBigInteger")
    @o0OO00o0(version = "1.4")
    public static final BigInteger o00ooooo(int[] iArr, o00oo<? super o0OOOO, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(iArr, "$this$sumOf");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            valueOf = valueOf.add((BigInteger) o0O0OOO.o00oOOo0(iArr, i, o00ooVar));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @o0OoOoOo
    @o00oo00O
    @o0OO0o.o0O0o000
    @o00oo0OO(name = "sumOfBigInteger")
    @o0OO00o0(version = "1.4")
    public static final BigInteger o0O00000(short[] sArr, o00oo<? super oO0000Oo, ? extends BigInteger> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(sArr, "$this$sumOf");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        o0OOOOO0.o0ooO.o00oo0OO(valueOf, "valueOf(this.toLong())");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            valueOf = valueOf.add((BigInteger) o0OooO0.o00oOOo0(sArr, i, o00ooVar));
            o0OOOOO0.o0ooO.o00oo0OO(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Comparable, java.lang.Object] */
    @o0OO0o.o00oo(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @o0OoOoOo
    @o00oo00O
    @o0O0o(message = "Use maxByOrNull instead.", replaceWith = @o0OO000(expression = "this.maxByOrNull(selector)", imports = {}))
    @o0OO00o0(version = "1.3")
    public static final /* synthetic */ <R extends Comparable<? super R>> o0oo0000 o0O0o(long[] jArr, o00oo<? super o0oo0000, ? extends R> o00ooVar) {
        o0OOOOO0.o0ooO.o00oo0O0(jArr, "$this$maxBy");
        o0OOOOO0.o0ooO.o00oo0O0(o00ooVar, "selector");
        if (ooo0Oo0.o00oo0O0(jArr)) {
            return null;
        }
        long o00oOoo02 = ooo0Oo0.o00oOoo0(jArr, 0);
        int oOO00 = o0O000O.oOO00(jArr);
        if (oOO00 == 0) {
            return o0oo0000.o00oOooO(o00oOoo02);
        }
        R invoke = o00ooVar.invoke(o0oo0000.o00oOooO(o00oOoo02));
        o0O0o0 o00oOOo02 = o0.o00oOOo0(1, oOO00);
        while (o00oOOo02.hasNext()) {
            long o00oOoo03 = ooo0Oo0.o00oOoo0(jArr, o00oOOo02.nextInt());
            ?? r6 = (Comparable) o0O0OOOo.o00oOOo0(o00oOoo03, o00ooVar);
            if (invoke.compareTo(r6) < 0) {
                o00oOoo02 = o00oOoo03;
                invoke = r6;
            }
        }
        return new o0oo0000(o00oOoo02);
    }
}
