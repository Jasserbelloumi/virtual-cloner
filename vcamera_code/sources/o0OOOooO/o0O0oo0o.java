package o0OOOooO;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import o0OOOOO0.o0OOO00;
import org.jetbrains.annotations.NotNull;
@o0OOO00({"SMAP\nDurationJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DurationJvm.kt\nkotlin/time/DurationJvmKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* loaded from: classes3.dex */
public final class o0O0oo0o {

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final boolean f13963o00oOOo0 = false;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final ThreadLocal<DecimalFormat>[] f13964o00oOOoO;

    static {
        ThreadLocal<DecimalFormat>[] threadLocalArr = new ThreadLocal[4];
        for (int i = 0; i < 4; i++) {
            threadLocalArr[i] = new ThreadLocal<>();
        }
        f13964o00oOOoO = threadLocalArr;
    }

    public static final DecimalFormat o00oOOo0(int i) {
        DecimalFormat decimalFormat = new DecimalFormat(SessionDescription.SUPPORTED_SDP_VERSION);
        if (i > 0) {
            decimalFormat.setMinimumFractionDigits(i);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }

    @NotNull
    public static final String o00oOOoO(double d, int i) {
        DecimalFormat o00oOOo02;
        ThreadLocal<DecimalFormat>[] threadLocalArr = f13964o00oOOoO;
        if (i < threadLocalArr.length) {
            ThreadLocal<DecimalFormat> threadLocal = threadLocalArr[i];
            DecimalFormat decimalFormat = threadLocal.get();
            if (decimalFormat == null) {
                decimalFormat = o00oOOo0(i);
                threadLocal.set(decimalFormat);
            } else {
                o0OOOOO0.o0ooO.o00oo0OO(decimalFormat, "get() ?: default().also(this::set)");
            }
            o00oOOo02 = decimalFormat;
        } else {
            o00oOOo02 = o00oOOo0(i);
        }
        String format = o00oOOo02.format(d);
        o0OOOOO0.o0ooO.o00oo0OO(format, "format.format(value)");
        return format;
    }

    @NotNull
    public static final String o00oOo00(double d, int i) {
        DecimalFormat o00oOOo02 = o00oOOo0(0);
        o00oOOo02.setMaximumFractionDigits(i);
        String format = o00oOOo02.format(d);
        o0OOOOO0.o0ooO.o00oo0OO(format, "createFormatForDecimals(… }\n        .format(value)");
        return format;
    }

    public static final boolean o00oOooO() {
        return f13963o00oOOo0;
    }
}
