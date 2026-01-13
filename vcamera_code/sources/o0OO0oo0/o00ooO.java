package o0OO0oo0;

import com.google.android.exoplayer2.text.CueDecoder;
import o0O0Oooo.oooOO0;
import o0OO0o.o0OO00o0;
import o0OOO0OO.o00oo00O;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
/* loaded from: classes3.dex */
public class o00ooO extends o00ooO0 {
    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final long o0(long j, long j2) {
        return Math.max(j, j2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final byte o00ooOoo(byte b, byte b2) {
        return (byte) Math.max((int) b, (int) b2);
    }

    @o0OO00o0(version = "1.4")
    public static final byte o00ooo0(byte b, @NotNull byte... bArr) {
        o0ooO.o00oo0O0(bArr, "other");
        for (byte b2 : bArr) {
            b = (byte) Math.max((int) b, (int) b2);
        }
        return b;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final byte o00ooo00(byte b, byte b2, byte b3) {
        return (byte) Math.max((int) b, Math.max((int) b2, (int) b3));
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final double o00ooo0O(double d, double d2) {
        return Math.max(d, d2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final double o00ooo0o(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    @o0OO00o0(version = "1.4")
    public static final double o00oooO(double d, @NotNull double... dArr) {
        o0ooO.o00oo0O0(dArr, "other");
        for (double d2 : dArr) {
            d = Math.max(d, d2);
        }
        return d;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final float o00oooOO(float f, float f2) {
        return Math.max(f, f2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final float o00oooOo(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final int o00oooo(int i, int i2) {
        return Math.max(i, i2);
    }

    @o0OO00o0(version = "1.4")
    public static final float o00oooo0(float f, @NotNull float... fArr) {
        o0ooO.o00oo0O0(fArr, "other");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final int o00ooooO(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    @o0OO00o0(version = "1.4")
    public static final int o00ooooo(int i, @NotNull int... iArr) {
        o0ooO.o00oo0O0(iArr, "other");
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final double o0O00(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }

    @o0OO00o0(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T o0O000(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        o0ooO.o00oo0O0(t, oooOO0.f12266o00oOOo0);
        o0ooO.o00oo0O0(t2, "b");
        o0ooO.o00oo0O0(t3, CueDecoder.BUNDLED_CUES);
        return (T) o0O0000o(t, o0O0000o(t2, t3));
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final long o0O00000(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    @o0OO00o0(version = "1.4")
    public static final long o0O0000O(long j, @NotNull long... jArr) {
        o0ooO.o00oo0O0(jArr, "other");
        for (long j2 : jArr) {
            j = Math.max(j, j2);
        }
        return j;
    }

    @o0OO00o0(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T o0O0000o(@NotNull T t, @NotNull T t2) {
        o0ooO.o00oo0O0(t, oooOO0.f12266o00oOOo0);
        o0ooO.o00oo0O0(t2, "b");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T o0O000O(@NotNull T t, @NotNull T... tArr) {
        o0ooO.o00oo0O0(t, oooOO0.f12266o00oOOo0);
        o0ooO.o00oo0O0(tArr, "other");
        for (T t2 : tArr) {
            t = (T) o0O0000o(t, t2);
        }
        return t;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final short o0O000Oo(short s, short s2, short s3) {
        return (short) Math.max((int) s, Math.max((int) s2, (int) s3));
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final byte o0O000o(byte b, byte b2, byte b3) {
        return (byte) Math.min((int) b, Math.min((int) b2, (int) b3));
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final byte o0O000o0(byte b, byte b2) {
        return (byte) Math.min((int) b, (int) b2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final double o0O000oo(double d, double d2) {
        return Math.min(d, d2);
    }

    @o0OO00o0(version = "1.4")
    public static final float o0O00O(float f, @NotNull float... fArr) {
        o0ooO.o00oo0O0(fArr, "other");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }

    @o0OO00o0(version = "1.4")
    public static final double o0O00O0(double d, @NotNull double... dArr) {
        o0ooO.o00oo0O0(dArr, "other");
        for (double d2 : dArr) {
            d = Math.min(d, d2);
        }
        return d;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final float o0O00O0o(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final int o0O00OO(int i, int i2) {
        return Math.min(i, i2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final int o0O00OOO(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    @o0OO00o0(version = "1.4")
    public static final int o0O00Oo(int i, @NotNull int... iArr) {
        o0ooO.o00oo0O0(iArr, "other");
        for (int i2 : iArr) {
            i = Math.min(i, i2);
        }
        return i;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final long o0O00OoO(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    @o0OO00o0(version = "1.4")
    public static final long o0O00Ooo(long j, @NotNull long... jArr) {
        o0ooO.o00oo0O0(jArr, "other");
        for (long j2 : jArr) {
            j = Math.min(j, j2);
        }
        return j;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final short o0O00o(short s, short s2) {
        return (short) Math.min((int) s, (int) s2);
    }

    @o0OO00o0(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T o0O00o00(@NotNull T t, @NotNull T t2) {
        o0ooO.o00oo0O0(t, oooOO0.f12266o00oOOo0);
        o0ooO.o00oo0O0(t2, "b");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    @o0OO00o0(version = "1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T o0O00o0O(@NotNull T t, @NotNull T t2, @NotNull T t3) {
        o0ooO.o00oo0O0(t, oooOO0.f12266o00oOOo0);
        o0ooO.o00oo0O0(t2, "b");
        o0ooO.o00oo0O0(t3, CueDecoder.BUNDLED_CUES);
        return (T) o0O00o00(t, o0O00o00(t2, t3));
    }

    @o0OO00o0(version = "1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T o0O00o0o(@NotNull T t, @NotNull T... tArr) {
        o0ooO.o00oo0O0(t, oooOO0.f12266o00oOOo0);
        o0ooO.o00oo0O0(tArr, "other");
        for (T t2 : tArr) {
            t = (T) o0O00o00(t, t2);
        }
        return t;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final short o0O00oO0(short s, short s2, short s3) {
        return (short) Math.min((int) s, Math.min((int) s2, (int) s3));
    }

    @o0OO00o0(version = "1.4")
    public static final short o0O0O0O(short s, @NotNull short... sArr) {
        o0ooO.o00oo0O0(sArr, "other");
        for (short s2 : sArr) {
            s = (short) Math.min((int) s, (int) s2);
        }
        return s;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final float o0OoO00O(float f, float f2) {
        return Math.min(f, f2);
    }

    @o0OO00o0(version = "1.4")
    public static final short o0OoOoOO(short s, @NotNull short... sArr) {
        o0ooO.o00oo0O0(sArr, "other");
        for (short s2 : sArr) {
            s = (short) Math.max((int) s, (int) s2);
        }
        return s;
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final short o0OoOoOo(short s, short s2) {
        return (short) Math.max((int) s, (int) s2);
    }

    @o00oo00O
    @o0OO00o0(version = "1.1")
    public static final long o0oO0Ooo(long j, long j2) {
        return Math.min(j, j2);
    }

    @o0OO00o0(version = "1.4")
    public static final byte o0ooOoOO(byte b, @NotNull byte... bArr) {
        o0ooO.o00oo0O0(bArr, "other");
        for (byte b2 : bArr) {
            b = (byte) Math.min((int) b, (int) b2);
        }
        return b;
    }
}
