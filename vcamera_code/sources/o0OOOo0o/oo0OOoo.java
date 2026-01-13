package o0OOOo0o;

import androidx.concurrent.futures.o00oOOo0;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.NoSuchElementException;
import o0OO0o.o00oo;
import o0OO0o.o0O000;
import o0OO0o.o0O0o;
import o0OO0o.o0OO00o0;
import o0OO0o.oO0Oo0oo;
import o0OOO0OO.o00oo00O;
import o0OOOO0o.o00oo0OO;
import o0OOOOO0.o0OOO00;
import o0OOOo0.o00oo0;
import o0OOOo0o.o0O0O0o0;
import o0OOOo0o.o0OoO00O;
import o0OOOo0o.o0oO0O0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOO00({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"})
/* loaded from: classes3.dex */
public class oo0OOoo extends o0OooO0 {
    @o00oo00O
    public static final boolean o0(o0O0O0Oo o0o0o0oo, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "<this>");
        return o0O0OOOo(o0o0o0oo, s);
    }

    @o00oo0OO(name = "byteRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o00oOoOo(o0O00o00 o0o00o00, double d) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Byte o0O0oOoo2 = o0O0oOoo(d);
        if (o0O0oOoo2 != null) {
            return o0o00o00.contains(o0O0oOoo2);
        }
        return false;
    }

    @o00oo0OO(name = "byteRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o00oOoo0(o0O00o00 o0o00o00, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Byte o0O0oo02 = o0O0oo0(f);
        if (o0O0oo02 != null) {
            return o0o00o00.contains(o0O0oo02);
        }
        return false;
    }

    @o00oo0OO(name = "byteRangeContains")
    public static final boolean o00oOooo(@NotNull o0O00o00<Byte> o0o00o00, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Byte o0O0oo2 = o0O0oo(i);
        if (o0O0oo2 != null) {
            return o0o00o00.contains(o0O0oo2);
        }
        return false;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T o00oo(@NotNull T t, @NotNull T t2) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(t2, "minimumValue");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    @o00oo0OO(name = "byteRangeContains")
    public static final boolean o00oo0(@NotNull o0O00o00<Byte> o0o00o00, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Byte o0O0ooOO2 = o0O0ooOO(s);
        if (o0O0ooOO2 != null) {
            return o0o00o00.contains(o0O0ooOO2);
        }
        return false;
    }

    @o00oo0OO(name = "byteRangeContains")
    public static final boolean o00oo00O(@NotNull o0O00o00<Byte> o0o00o00, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Byte o0O0ooO02 = o0O0ooO0(j);
        if (o0O0ooO02 != null) {
            return o0o00o00.contains(o0O0ooO02);
        }
        return false;
    }

    @o00oo0OO(name = "byteRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o00oo0O(@NotNull o0O0OOO<Byte> o0o0ooo, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        Byte o0O0ooOO2 = o0O0ooOO(s);
        if (o0O0ooOO2 != null) {
            return o0o0ooo.contains(o0O0ooOO2);
        }
        return false;
    }

    @o00oo0OO(name = "byteRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o00oo0O0(@NotNull o0O0OOO<Byte> o0o0ooo, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        Byte o0O0ooO02 = o0O0ooO0(j);
        if (o0O0ooO02 != null) {
            return o0o0ooo.contains(o0O0ooO02);
        }
        return false;
    }

    @o00oo0OO(name = "byteRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o00oo0OO(@NotNull o0O0OOO<Byte> o0o0ooo, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        Byte o0O0oo2 = o0O0oo(i);
        if (o0O0oo2 != null) {
            return o0o0ooo.contains(o0O0oo2);
        }
        return false;
    }

    public static final byte o00oo0Oo(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static final float o00oo0o(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static final double o00oo0o0(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final int o00oo0oO(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static final int o00ooO(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static final byte o00ooO0(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    public static final short o00ooO00(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final double o00ooO0O(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final float o00ooO0o(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T o00ooOO(@NotNull T t, @NotNull T t2) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(t2, "maximumValue");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    public static final long o00ooOO0(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static final short o00ooOOo(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    public static final double o00ooOo(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final byte o00ooOo0(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            return b < b2 ? b2 : b > b3 ? b3 : b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + '.');
    }

    public static final float o00ooOoO(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final int o00ooOoo(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static final long o00ooo0(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        StringBuilder o00oOOo02 = o00oOOo0.o00oOOo0("Cannot coerce value to an empty range: maximum ", j3, " is less than minimum ");
        o00oOOo02.append(j2);
        o00oOOo02.append('.');
        throw new IllegalArgumentException(o00oOOo02.toString());
    }

    public static final int o00ooo00(int i, @NotNull o0O00o00<Integer> o0o00o00) {
        Integer o00oOo002;
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, SessionDescription.ATTR_RANGE);
        if (o0o00o00 instanceof o0oO0Ooo) {
            return ((Number) o00oooO(Integer.valueOf(i), (o0oO0Ooo) o0o00o00)).intValue();
        }
        if (o0o00o00.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + o0o00o00 + '.');
        }
        if (i < o0o00o00.o00oOOo0().intValue()) {
            o00oOo002 = o0o00o00.o00oOOo0();
        } else if (i <= o0o00o00.o00oOo00().intValue()) {
            return i;
        } else {
            o00oOo002 = o0o00o00.o00oOo00();
        }
        return o00oOo002.intValue();
    }

    public static final long o00ooo0O(long j, @NotNull o0O00o00<Long> o0o00o00) {
        Long o00oOo002;
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, SessionDescription.ATTR_RANGE);
        if (o0o00o00 instanceof o0oO0Ooo) {
            return ((Number) o00oooO(Long.valueOf(j), (o0oO0Ooo) o0o00o00)).longValue();
        }
        if (o0o00o00.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + o0o00o00 + '.');
        }
        if (j < o0o00o00.o00oOOo0().longValue()) {
            o00oOo002 = o0o00o00.o00oOOo0();
        } else if (j <= o0o00o00.o00oOo00().longValue()) {
            return j;
        } else {
            o00oOo002 = o0o00o00.o00oOo00();
        }
        return o00oOo002.longValue();
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T o00ooo0o(@NotNull T t, @Nullable T t2, @Nullable T t3) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "<this>");
        if (t2 == null || t3 == null) {
            if (t2 != null && t.compareTo(t2) < 0) {
                return t2;
            }
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        } else if (t2.compareTo(t3) > 0) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + '.');
        } else if (t.compareTo(t2) < 0) {
            return t2;
        } else {
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    @o0OO00o0(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T o00oooO(@NotNull T t, @NotNull o0oO0Ooo<T> o0oo0ooo) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0ooo, SessionDescription.ATTR_RANGE);
        if (!o0oo0ooo.isEmpty()) {
            return (!o0oo0ooo.o00oOOoO(t, o0oo0ooo.o00oOOo0()) || o0oo0ooo.o00oOOoO(o0oo0ooo.o00oOOo0(), t)) ? (!o0oo0ooo.o00oOOoO(o0oo0ooo.o00oOo00(), t) || o0oo0ooo.o00oOOoO(t, o0oo0ooo.o00oOo00())) ? t : o0oo0ooo.o00oOo00() : o0oo0ooo.o00oOOo0();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + o0oo0ooo + '.');
    }

    @NotNull
    public static final <T extends Comparable<? super T>> T o00oooOO(@NotNull T t, @NotNull o0O00o00<T> o0o00o00) {
        o0OOOOO0.o0ooO.o00oo0O0(t, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, SessionDescription.ATTR_RANGE);
        if (o0o00o00 instanceof o0oO0Ooo) {
            return (T) o00oooO(t, (o0oO0Ooo) o0o00o00);
        }
        if (!o0o00o00.isEmpty()) {
            return t.compareTo(o0o00o00.o00oOOo0()) < 0 ? o0o00o00.o00oOOo0() : t.compareTo(o0o00o00.o00oOo00()) > 0 ? o0o00o00.o00oOo00() : t;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + o0o00o00 + '.');
    }

    public static final short o00oooOo(short s, short s2, short s3) {
        if (s2 <= s3) {
            return s < s2 ? s2 : s > s3 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + '.');
    }

    @o00oo00O
    public static final boolean o00oooo(o0O0O0Oo o0o0o0oo, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "<this>");
        return o0O0OO0O(o0o0o0oo, b);
    }

    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final boolean o00oooo0(o0O00O o0o00o, Character ch) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o, "<this>");
        return ch != null && o0o00o.o00oOoo0(ch.charValue());
    }

    @o00oo00O
    public static final boolean o00ooooO(o0O0O0Oo o0o0o0oo, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "<this>");
        return o0O0OOO(o0o0o0oo, j);
    }

    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final boolean o00ooooo(o0O0O0Oo o0o0o0oo, Integer num) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "<this>");
        return num != null && o0o0o0oo.o00oOoo0(num.intValue());
    }

    @Nullable
    public static final Long o0O(float f) {
        boolean z = false;
        if (-9.223372E18f <= f && f <= 9.223372E18f) {
            z = true;
        }
        if (z) {
            return Long.valueOf(f);
        }
        return null;
    }

    @NotNull
    public static final o0oO0O0o o0O00(byte b, int i) {
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(b, i, -1);
    }

    @o00oo00O
    public static final boolean o0O000(o0O0OO0 o0o0oo0, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0, "<this>");
        return o0O0Ooo0(o0o0oo0, s);
    }

    @o00oo00O
    public static final boolean o0O00000(o0O0OO0 o0o0oo0, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0, "<this>");
        return o0O0OoO0(o0o0oo0, b);
    }

    @o00oo00O
    public static final boolean o0O0000O(o0O0OO0 o0o0oo0, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0, "<this>");
        return o0O0OoOo(o0o0oo0, i);
    }

    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final boolean o0O0000o(o0O0OO0 o0o0oo0, Long l) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0, "<this>");
        return l != null && o0o0oo0.o00oOoo0(l.longValue());
    }

    @o00oo0OO(name = "doubleRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O000O(o0O00o00 o0o00o00, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Double.valueOf(b));
    }

    @o00oo0OO(name = "doubleRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O000Oo(o0O00o00 o0o00o00, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Double.valueOf(i));
    }

    @o00oo0OO(name = "doubleRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O000o(@NotNull o0O0OOO<Double> o0o0ooo, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        return o0o0ooo.contains(Double.valueOf(f));
    }

    @o00oo0OO(name = "doubleRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O000o0(o0O00o00 o0o00o00, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Double.valueOf(s));
    }

    @NotNull
    public static final o0oO0O0o o0O000oo(byte b, byte b2) {
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(b, b2, -1);
    }

    @NotNull
    public static final o0oO0O0o o0O00O(int i, short s) {
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(i, s, -1);
    }

    @NotNull
    public static final o0oO0O0o o0O00O0(byte b, short s) {
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(b, s, -1);
    }

    @NotNull
    public static final o0oO0O0o o0O00O0o(int i, int i2) {
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(i, i2, -1);
    }

    @NotNull
    public static final o0oO0O0o o0O00OO(short s, byte b) {
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(s, b, -1);
    }

    @NotNull
    public static final o0oO0O0o o0O00OOO(short s, int i) {
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(s, i, -1);
    }

    @NotNull
    public static final o0oO0O0o o0O00Oo(short s, short s2) {
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(s, s2, -1);
    }

    @NotNull
    public static final o0O0O0o0 o0O00OoO(int i, long j) {
        return o0O0O0o0.f13716o00oo0o0.o00oOOo0(i, j, -1L);
    }

    @NotNull
    public static final o0O0O0o0 o0O00Ooo(long j, byte b) {
        return o0O0O0o0.f13716o00oo0o0.o00oOOo0(j, b, -1L);
    }

    @NotNull
    public static final o0O0O0o0 o0O00o(short s, long j) {
        return o0O0O0o0.f13716o00oo0o0.o00oOOo0(s, j, -1L);
    }

    @NotNull
    public static final o0O0O0o0 o0O00o00(long j, int i) {
        return o0O0O0o0.f13716o00oo0o0.o00oOOo0(j, i, -1L);
    }

    @NotNull
    public static final o0O0O0o0 o0O00o0O(long j, long j2) {
        return o0O0O0o0.f13716o00oo0o0.o00oOOo0(j, j2, -1L);
    }

    @NotNull
    public static final o0O0O0o0 o0O00o0o(long j, short s) {
        return o0O0O0o0.f13716o00oo0o0.o00oOOo0(j, s, -1L);
    }

    @o0OO00o0(version = "1.7")
    public static final char o0O00oO0(@NotNull o0OoO00O o0ooo00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo00o, "<this>");
        if (o0ooo00o.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0ooo00o + " is empty.");
        }
        return o0ooo00o.o00oOo0O();
    }

    @o0OO00o0(version = "1.7")
    public static final int o0O0O0O(@NotNull o0oO0O0o o0oo0o0o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0o0o, "<this>");
        if (o0oo0o0o.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0oo0o0o + " is empty.");
        }
        return o0oo0o0o.o00oOo0O();
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final Integer o0O0O0Oo(@NotNull o0oO0O0o o0oo0o0o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0o0o, "<this>");
        if (o0oo0o0o.isEmpty()) {
            return null;
        }
        return Integer.valueOf(o0oo0o0o.o00oOo0O());
    }

    @o00oo0OO(name = "floatRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O0O0o(o0O00o00 o0o00o00, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Float.valueOf(b));
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final Long o0O0O0o0(@NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "<this>");
        if (o0o0o0o0.isEmpty()) {
            return null;
        }
        return Long.valueOf(o0o0o0o0.o00oOo0O());
    }

    @o00oo0OO(name = "floatRangeContains")
    public static final boolean o0O0O0oO(@NotNull o0O00o00<Float> o0o00o00, double d) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Float.valueOf((float) d));
    }

    @o00oo0OO(name = "floatRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O0O0oo(o0O00o00 o0o00o00, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Float.valueOf(i));
    }

    @o00oo0OO(name = "intRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O0OO(o0O00o00 o0o00o00, double d) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Integer o0O0ooo02 = o0O0ooo0(d);
        if (o0O0ooo02 != null) {
            return o0o00o00.contains(o0O0ooo02);
        }
        return false;
    }

    @o00oo0OO(name = "floatRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O0OO0(o0O00o00 o0o00o00, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Float.valueOf(s));
    }

    @o00oo0OO(name = "intRangeContains")
    public static final boolean o0O0OO0O(@NotNull o0O00o00<Integer> o0o00o00, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Integer.valueOf(b));
    }

    @o00oo0OO(name = "intRangeContains")
    public static final boolean o0O0OOO(@NotNull o0O00o00<Integer> o0o00o00, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Integer o0O0oooO2 = o0O0oooO(j);
        if (o0O0oooO2 != null) {
            return o0o00o00.contains(o0O0oooO2);
        }
        return false;
    }

    @o00oo0OO(name = "intRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O0OOO0(o0O00o00 o0o00o00, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Integer o0O0ooo2 = o0O0ooo(f);
        if (o0O0ooo2 != null) {
            return o0o00o00.contains(o0O0ooo2);
        }
        return false;
    }

    @o00oo0OO(name = "intRangeContains")
    public static final boolean o0O0OOOo(@NotNull o0O00o00<Integer> o0o00o00, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Integer.valueOf(s));
    }

    @o00oo0OO(name = "intRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O0OOo(@NotNull o0O0OOO<Integer> o0o0ooo, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        return o0o0ooo.contains(Integer.valueOf(b));
    }

    @o00oo0OO(name = "intRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O0OOoO(@NotNull o0O0OOO<Integer> o0o0ooo, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        Integer o0O0oooO2 = o0O0oooO(j);
        if (o0O0oooO2 != null) {
            return o0o0ooo.contains(o0O0oooO2);
        }
        return false;
    }

    @o00oo0OO(name = "intRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O0OOoo(@NotNull o0O0OOO<Integer> o0o0ooo, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        return o0o0ooo.contains(Integer.valueOf(s));
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final Integer o0O0Oo(@NotNull o0oO0O0o o0oo0o0o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0o0o, "<this>");
        if (o0oo0o0o.isEmpty()) {
            return null;
        }
        return Integer.valueOf(o0oo0o0o.o00oOoO0());
    }

    @o0OO00o0(version = "1.7")
    public static final int o0O0Oo0(@NotNull o0oO0O0o o0oo0o0o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0o0o, "<this>");
        if (o0oo0o0o.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0oo0o0o + " is empty.");
        }
        return o0oo0o0o.o00oOoO0();
    }

    @o0OO00o0(version = "1.7")
    public static final long o0O0Oo0O(@NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "<this>");
        if (o0o0o0o0.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0o0o0o0 + " is empty.");
        }
        return o0o0o0o0.o00oOoO0();
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final Character o0O0Oo0o(@NotNull o0OoO00O o0ooo00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo00o, "<this>");
        if (o0ooo00o.isEmpty()) {
            return null;
        }
        return Character.valueOf(o0ooo00o.o00oOoO0());
    }

    @o00oo0OO(name = "longRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O0OoO(o0O00o00 o0o00o00, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Long o0O2 = o0O(f);
        if (o0O2 != null) {
            return o0o00o00.contains(o0O2);
        }
        return false;
    }

    @o00oo0OO(name = "longRangeContains")
    public static final boolean o0O0OoO0(@NotNull o0O00o00<Long> o0o00o00, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Long.valueOf(b));
    }

    @o00oo0OO(name = "longRangeContains")
    public static final boolean o0O0OoOo(@NotNull o0O00o00<Long> o0o00o00, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Long.valueOf(i));
    }

    @o00oo0OO(name = "longRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O0Ooo(@NotNull o0O0OOO<Long> o0o0ooo, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        return o0o0ooo.contains(Long.valueOf(b));
    }

    @o00oo0OO(name = "longRangeContains")
    public static final boolean o0O0Ooo0(@NotNull o0O00o00<Long> o0o00o00, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Long.valueOf(s));
    }

    @o00oo0OO(name = "longRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O0OooO(@NotNull o0O0OOO<Long> o0o0ooo, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        return o0o0ooo.contains(Long.valueOf(i));
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final Long o0O0Oooo(@NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "<this>");
        if (o0o0o0o0.isEmpty()) {
            return null;
        }
        return Long.valueOf(o0o0o0o0.o00oOoO0());
    }

    public static final long o0O0o(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    @o0OO00o0(version = "1.3")
    public static final int o0O0o0(@NotNull o0O0O0Oo o0o0o0oo, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        try {
            return o0OOOo0.o00oo0OO.o00oOoO(o00oo0Var, o0o0o0oo);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final char o0O0o00(o0O00O o0o00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o, "<this>");
        return o0O0o00O(o0o00o, o00oo0.Default);
    }

    @o00oo0OO(name = "longRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O0o000(@NotNull o0O0OOO<Long> o0o0ooo, short s) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        return o0o0ooo.contains(Long.valueOf(s));
    }

    @o0OO00o0(version = "1.3")
    public static final char o0O0o00O(@NotNull o0O00O o0o00o, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        try {
            return (char) o00oo0Var.nextInt(o0o00o.f13746o00oo0O0, o0o00o.f13745o00oo0O + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final int o0O0o00o(o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "<this>");
        return o0O0o0(o0o0o0oo, o00oo0.Default);
    }

    @o00oo00O
    @o0OO00o0(version = "1.3")
    public static final long o0O0o0O(o0O0OO0 o0o0oo0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0, "<this>");
        return o0O0o0OO(o0o0oo0, o00oo0.Default);
    }

    @o0OO00o0(version = "1.3")
    public static final long o0O0o0OO(@NotNull o0O0OO0 o0o0oo0, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        try {
            return o0OOOo0.o00oo0OO.o00oOoOO(o00oo0Var, o0o0oo0);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final Character o0O0o0Oo(o0O00O o0o00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o, "<this>");
        return o0O0o0o0(o0o00o, o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final Integer o0O0o0o(o0O0O0Oo o0o0o0oo) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "<this>");
        return o0oOo0O0(o0o0o0oo, o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @Nullable
    public static final Character o0O0o0o0(@NotNull o0O00O o0o00o, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (o0o00o.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) o00oo0Var.nextInt(o0o00o.f13746o00oo0O0, o0o00o.f13745o00oo0O + 1));
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o00oo00O
    @o0OO00o0(version = "1.4")
    public static final Long o0O0o0oO(o0O0OO0 o0o0oo0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0, "<this>");
        return o0O0o0oo(o0o0oo0, o00oo0.Default);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @Nullable
    public static final Long o0O0o0oo(@NotNull o0O0OO0 o0o0oo0, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0oo0, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (o0o0oo0.isEmpty()) {
            return null;
        }
        return Long.valueOf(o0OOOo0.o00oo0OO.o00oOoOO(o00oo0Var, o0o0oo0));
    }

    @o00oo0OO(name = "shortRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O0oO(o0O00o00 o0o00o00, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Short o0OO000o2 = o0OO000o(f);
        if (o0OO000o2 != null) {
            return o0o00o00.contains(o0OO000o2);
        }
        return false;
    }

    @NotNull
    public static final o0O0O0o0 o0O0oO0(@NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "<this>");
        return o0O0O0o0.f13716o00oo0o0.o00oOOo0(o0o0o0o0.o00oOoO0(), o0o0o0o0.o00oOo0O(), -o0o0o0o0.o00oOoO());
    }

    @o00oo0OO(name = "shortRangeContains")
    public static final boolean o0O0oO0O(@NotNull o0O00o00<Short> o0o00o00, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Short.valueOf(b));
    }

    @o00oo0OO(name = "shortRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0O0oO0o(o0O00o00 o0o00o00, double d) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Short o0OO0002 = o0OO000(d);
        if (o0OO0002 != null) {
            return o0o00o00.contains(o0OO0002);
        }
        return false;
    }

    @o00oo0OO(name = "shortRangeContains")
    public static final boolean o0O0oOO(@NotNull o0O00o00<Short> o0o00o00, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Short oo0ooO2 = oo0ooO(j);
        if (oo0ooO2 != null) {
            return o0o00o00.contains(oo0ooO2);
        }
        return false;
    }

    @o00oo0OO(name = "shortRangeContains")
    public static final boolean o0O0oOO0(@NotNull o0O00o00<Short> o0o00o00, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Short oo0oO02 = oo0oO0(i);
        if (oo0oO02 != null) {
            return o0o00o00.contains(oo0oO02);
        }
        return false;
    }

    @o00oo0OO(name = "shortRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O0oOOO(@NotNull o0O0OOO<Short> o0o0ooo, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        Short oo0oO02 = oo0oO0(i);
        if (oo0oO02 != null) {
            return o0o0ooo.contains(oo0oO02);
        }
        return false;
    }

    @NotNull
    public static final o0oO0O0o o0O0oOo(@NotNull o0oO0O0o o0oo0o0o, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0o0o, "<this>");
        o0OooO0.o00oOOo0(i > 0, Integer.valueOf(i));
        o0oO0O0o.o00oOOo0 o00oooo02 = o0oO0O0o.f13748o00oo0o0;
        int o00oOo0O2 = o0oo0o0o.o00oOo0O();
        int o00oOoO02 = o0oo0o0o.o00oOoO0();
        if (o0oo0o0o.o00oOoO() <= 0) {
            i = -i;
        }
        o00oooo02.getClass();
        return new o0oO0O0o(o00oOo0O2, o00oOoO02, i);
    }

    @o00oo0OO(name = "shortRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O0oOo0(@NotNull o0O0OOO<Short> o0o0ooo, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        Short oo0ooO2 = oo0ooO(j);
        if (oo0ooO2 != null) {
            return o0o0ooo.contains(oo0ooO2);
        }
        return false;
    }

    @NotNull
    public static final o0O0O0o0 o0O0oOoO(@NotNull o0O0O0o0 o0o0o0o0, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "<this>");
        o0OooO0.o00oOOo0(j > 0, Long.valueOf(j));
        o0O0O0o0.o00oOOo0 o00oooo02 = o0O0O0o0.f13716o00oo0o0;
        long o00oOo0O2 = o0o0o0o0.o00oOo0O();
        long o00oOoO02 = o0o0o0o0.o00oOoO0();
        if (o0o0o0o0.o00oOoO() <= 0) {
            j = -j;
        }
        return o00oooo02.o00oOOo0(o00oOo0O2, o00oOoO02, j);
    }

    @Nullable
    public static final Byte o0O0oOoo(double d) {
        boolean z = false;
        if (-128.0d <= d && d <= 127.0d) {
            z = true;
        }
        if (z) {
            return Byte.valueOf((byte) d);
        }
        return null;
    }

    @Nullable
    public static final Byte o0O0oo(int i) {
        if (new o0O0O0Oo(-128, 127).o00oOoo0(i)) {
            return Byte.valueOf((byte) i);
        }
        return null;
    }

    @Nullable
    public static final Byte o0O0oo0(float f) {
        boolean z = false;
        if (-128.0f <= f && f <= 127.0f) {
            z = true;
        }
        if (z) {
            return Byte.valueOf((byte) f);
        }
        return null;
    }

    @o00oo0OO(name = "shortRangeContains")
    @o0O000
    @o0OO00o0(version = "1.7")
    public static final boolean o0O0oo00(@NotNull o0O0OOO<Short> o0o0ooo, byte b) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0ooo, "<this>");
        return o0o0ooo.contains(Short.valueOf(b));
    }

    @NotNull
    public static final o0OoO00O o0O0oo0O(@NotNull o0OoO00O o0ooo00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo00o, "<this>");
        o0OoO00O.f13744o00oo0o0.getClass();
        return new o0OoO00O(o0ooo00o.o00oOoO0(), o0ooo00o.o00oOo0O(), -o0ooo00o.o00oOoO());
    }

    @o0OO00o0(version = "1.7")
    @Nullable
    public static final Character o0O0oo0o(@NotNull o0OoO00O o0ooo00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo00o, "<this>");
        if (o0ooo00o.isEmpty()) {
            return null;
        }
        return Character.valueOf(o0ooo00o.o00oOo0O());
    }

    @Nullable
    public static final Byte o0O0ooO0(long j) {
        if (new o0O0OO0(-128L, 127L).o00oOoo0(j)) {
            return Byte.valueOf((byte) j);
        }
        return null;
    }

    @Nullable
    public static final Byte o0O0ooOO(short s) {
        if (o0O0OOOo(new o0O0O0Oo(-128, 127), s)) {
            return Byte.valueOf((byte) s);
        }
        return null;
    }

    @Nullable
    public static final Integer o0O0ooo(float f) {
        boolean z = false;
        if (-2.14748365E9f <= f && f <= 2.14748365E9f) {
            z = true;
        }
        if (z) {
            return Integer.valueOf((int) f);
        }
        return null;
    }

    @Nullable
    public static final Integer o0O0ooo0(double d) {
        boolean z = false;
        if (-2.147483648E9d <= d && d <= 2.147483647E9d) {
            z = true;
        }
        if (z) {
            return Integer.valueOf((int) d);
        }
        return null;
    }

    @Nullable
    public static final Integer o0O0oooO(long j) {
        if (new o0O0OO0(-2147483648L, 2147483647L).o00oOoo0(j)) {
            return Integer.valueOf((int) j);
        }
        return null;
    }

    @Nullable
    public static final Long o0O0oooo(double d) {
        boolean z = false;
        if (-9.223372036854776E18d <= d && d <= 9.223372036854776E18d) {
            z = true;
        }
        if (z) {
            return Long.valueOf((long) d);
        }
        return null;
    }

    @NotNull
    public static final o0O0O0Oo o0OO0(int i, short s) {
        return new o0O0O0Oo(i, s - 1);
    }

    @Nullable
    public static final Short o0OO000(double d) {
        boolean z = false;
        if (-32768.0d <= d && d <= 32767.0d) {
            z = true;
        }
        if (z) {
            return Short.valueOf((short) d);
        }
        return null;
    }

    @Nullable
    public static final Short o0OO000o(float f) {
        boolean z = false;
        if (-32768.0f <= f && f <= 32767.0f) {
            z = true;
        }
        if (z) {
            return Short.valueOf((short) f);
        }
        return null;
    }

    @NotNull
    public static final o0O00O o0OO00OO(char c, char c2) {
        if (o0OOOOO0.o0ooO.o00oo0o(c2, 0) <= 0) {
            o0O00O.f13700o00oo0o.getClass();
            return o0O00O.f13701o00oo0oO;
        }
        return new o0O00O(c, (char) (c2 - 1));
    }

    @NotNull
    public static final o0O0O0Oo o0OO00Oo(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            o0O0O0Oo.f13714o00oo0o.getClass();
            return o0O0O0Oo.f13715o00oo0oO;
        }
        return new o0O0O0Oo(b, i - 1);
    }

    @NotNull
    public static final o0O0O0Oo o0OO00o(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            o0O0O0Oo.f13714o00oo0o.getClass();
            return o0O0O0Oo.f13715o00oo0oO;
        }
        return new o0O0O0Oo(i, i2 - 1);
    }

    @NotNull
    public static final o0O0O0Oo o0OO00o0(byte b, short s) {
        return new o0O0O0Oo(b, s - 1);
    }

    @NotNull
    public static final o0O0O0Oo o0OO00oo(byte b, byte b2) {
        return new o0O0O0Oo(b, b2 - 1);
    }

    @NotNull
    public static final o0O0O0Oo o0OO0O0(short s, byte b) {
        return new o0O0O0Oo(s, b - 1);
    }

    @NotNull
    public static final o0O0O0Oo o0OO0O0O(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            o0O0O0Oo.f13714o00oo0o.getClass();
            return o0O0O0Oo.f13715o00oo0oO;
        }
        return new o0O0O0Oo(s, i - 1);
    }

    @NotNull
    public static final o0O0O0Oo o0OO0OoO(short s, short s2) {
        return new o0O0O0Oo(s, s2 - 1);
    }

    @NotNull
    public static final o0O0OO0 o0OO0Ooo(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            o0O0OO0.f13722o00oo0o.getClass();
            return o0O0OO0.f13723o00oo0oO;
        }
        return new o0O0OO0(i, j - 1);
    }

    @NotNull
    public static final o0O0OO0 o0OO0o(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            o0O0OO0.f13722o00oo0o.getClass();
            return o0O0OO0.f13723o00oo0oO;
        }
        return new o0O0OO0(s, j - 1);
    }

    @NotNull
    public static final o0O0OO0 o0OO0o0(long j, int i) {
        return new o0O0OO0(j, i - 1);
    }

    @NotNull
    public static final o0O0OO0 o0OO0o00(long j, byte b) {
        return new o0O0OO0(j, b - 1);
    }

    @NotNull
    public static final o0O0OO0 o0OO0o0O(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            o0O0OO0.f13722o00oo0o.getClass();
            return o0O0OO0.f13723o00oo0oO;
        }
        return new o0O0OO0(j, j2 - 1);
    }

    @NotNull
    public static final o0O0OO0 o0OO0o0o(long j, short s) {
        return new o0O0OO0(j, s - 1);
    }

    @NotNull
    public static final o0O0OO0 o0OOooO0(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            o0O0OO0.f13722o00oo0o.getClass();
            return o0O0OO0.f13723o00oo0oO;
        }
        return new o0O0OO0(b, j - 1);
    }

    @NotNull
    public static final o0oO0O0o o0OoO00O(int i, byte b) {
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(i, b, -1);
    }

    @NotNull
    public static final o0O0O0Oo o0OoOoO(int i, byte b) {
        return new o0O0O0Oo(i, b - 1);
    }

    @o00oo0OO(name = "doubleRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0OoOoOO(o0O00o00 o0o00o00, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Double.valueOf(j));
    }

    @o00oo0OO(name = "doubleRangeContains")
    public static final boolean o0OoOoOo(@NotNull o0O00o00<Double> o0o00o00, float f) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Double.valueOf(f));
    }

    @o0OO00o0(version = "1.7")
    public static final char o0OooO0(@NotNull o0OoO00O o0ooo00o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo00o, "<this>");
        if (o0ooo00o.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0ooo00o + " is empty.");
        }
        return o0ooo00o.o00oOoO0();
    }

    @o0OO00o0(version = "1.7")
    public static final long o0oO0O0o(@NotNull o0O0O0o0 o0o0o0o0) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0o0, "<this>");
        if (o0o0o0o0.isEmpty()) {
            throw new NoSuchElementException("Progression " + o0o0o0o0 + " is empty.");
        }
        return o0o0o0o0.o00oOo0O();
    }

    @NotNull
    public static final o0O0O0o0 o0oO0Ooo(byte b, long j) {
        return o0O0O0o0.f13716o00oo0o0.o00oOOo0(b, j, -1L);
    }

    @oO0Oo0oo(markerClass = {o0O000.class})
    @o0OO00o0(version = "1.4")
    @Nullable
    public static final Integer o0oOo0O0(@NotNull o0O0O0Oo o0o0o0oo, @NotNull o00oo0 o00oo0Var) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o0o0oo, "<this>");
        o0OOOOO0.o0ooO.o00oo0O0(o00oo0Var, "random");
        if (o0o0o0oo.isEmpty()) {
            return null;
        }
        return Integer.valueOf(o0OOOo0.o00oo0OO.o00oOoO(o00oo0Var, o0o0o0oo));
    }

    @o00oo0OO(name = "floatRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean o0ooO(o0O00o00 o0o00o00, long j) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        return o0o00o00.contains(Float.valueOf((float) j));
    }

    @NotNull
    public static final o0OoO00O o0ooOoOO(char c, char c2) {
        o0OoO00O.f13744o00oo0o0.getClass();
        return new o0OoO00O(c, c2, -1);
    }

    @o00oo0OO(name = "longRangeContains")
    @o00oo(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @o0O0o(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean oo0OOoo(o0O00o00 o0o00o00, double d) {
        o0OOOOO0.o0ooO.o00oo0O0(o0o00o00, "<this>");
        Long o0O0oooo2 = o0O0oooo(d);
        if (o0O0oooo2 != null) {
            return o0o00o00.contains(o0O0oooo2);
        }
        return false;
    }

    @Nullable
    public static final Short oo0oO0(int i) {
        if (new o0O0O0Oo(-32768, 32767).o00oOoo0(i)) {
            return Short.valueOf((short) i);
        }
        return null;
    }

    @NotNull
    public static final o0OoO00O oo0oOOo(@NotNull o0OoO00O o0ooo00o, int i) {
        o0OOOOO0.o0ooO.o00oo0O0(o0ooo00o, "<this>");
        o0OooO0.o00oOOo0(i > 0, Integer.valueOf(i));
        o0OoO00O.o00oOOo0 o00oooo02 = o0OoO00O.f13744o00oo0o0;
        char o00oOo0O2 = o0ooo00o.o00oOo0O();
        char o00oOoO02 = o0ooo00o.o00oOoO0();
        if (o0ooo00o.o00oOoO() <= 0) {
            i = -i;
        }
        o00oooo02.getClass();
        return new o0OoO00O(o00oOo0O2, o00oOoO02, i);
    }

    @Nullable
    public static final Short oo0ooO(long j) {
        if (new o0O0OO0(-32768L, 32767L).o00oOoo0(j)) {
            return Short.valueOf((short) j);
        }
        return null;
    }

    @NotNull
    public static final o0oO0O0o oooOO0(@NotNull o0oO0O0o o0oo0o0o) {
        o0OOOOO0.o0ooO.o00oo0O0(o0oo0o0o, "<this>");
        o0oO0O0o.f13748o00oo0o0.getClass();
        return new o0oO0O0o(o0oo0o0o.o00oOoO0(), o0oo0o0o.o00oOo0O(), -o0oo0o0o.o00oOoO());
    }
}
