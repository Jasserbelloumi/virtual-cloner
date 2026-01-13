package o0OooOo;

import android.annotation.SuppressLint;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OOO0oO.o0O000Oo;
import o0OOOO0o.o00ooO0;
import o0OOOOO0.o0ooO;
import o0OOo0O.o00oOoO;
import o0OOo0O.o0O0o;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Signal;
import sun.misc.SignalHandler;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Lo0OooOo/o0O0O0O;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "Lo0OO0o/oO0Ooooo;", "o00oOooO", o00oOOoO.f12961o00oOo00, "", "Z", "enableCreationStackTraces", "<init>", "()V", "o00oOOo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@SuppressLint({TtmlNode.COMBINE_ALL})
@IgnoreJRERequirement
/* loaded from: classes3.dex */
public final class o0O0O0O {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0O0O f16893o00oOOo0 = new o0O0O0O();

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final boolean f16894o00oOOoO;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Lo0OooOo/o0O0O0O$o00oOOo0;", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", "o00oOOo0", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements ClassFileTransformer {
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final o00oOOo0 f16895o00oOOo0 = new o00oOOo0();

        @Nullable
        public byte[] o00oOOo0(@NotNull ClassLoader classLoader, @NotNull String str, @Nullable Class<?> cls, @NotNull ProtectionDomain protectionDomain, @Nullable byte[] bArr) {
            if (o0ooO.o00oOoO0(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                o00oOoO.f14161o00oOOo0.getClass();
                o00oOoO.f14162o00oOOoO = true;
                return o0O000Oo.o00oo0O0(classLoader.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    static {
        Object m7constructorimpl;
        boolean z;
        try {
            oo0oO0.o00oOOo0 o00oooo02 = oo0oO0.Companion;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            m7constructorimpl = oo0oO0.m7constructorimpl(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th) {
            oo0oO0.o00oOOo0 o00oooo03 = oo0oO0.Companion;
            m7constructorimpl = oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th));
        }
        Boolean bool = oo0oO0.m13isFailureimpl(m7constructorimpl) ? null : m7constructorimpl;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            o0O0o.f14206o00oOOo0.getClass();
            z = o0O0o.f14214o00oOoOo;
        }
        f16894o00oOOoO = z;
    }

    public static final void o00oOo00(Signal signal) {
        o0O0o o0o0o = o0O0o.f14206o00oOOo0;
        if (o0o0o.o00ooO0O()) {
            o0o0o.o00oOo0o(System.out);
        } else {
            System.out.println((Object) "Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @o00ooO0
    public static final void o00oOooO(@Nullable String str, @NotNull Instrumentation instrumentation) {
        o00oOoO.f14161o00oOOo0.o00oOOoO(true);
        instrumentation.addTransformer(o00oOOo0.f16895o00oOOo0);
        o0O0o o0o0o = o0O0o.f14206o00oOOo0;
        o0o0o.o00ooo0(f16894o00oOOoO);
        o0o0o.o00ooO00();
        f16893o00oOOo0.o00oOOoO();
    }

    public final void o00oOOoO() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: o0OooOo.o0O00oO0
                public final void o00oOOo0(Signal signal) {
                    o0O0O0O.o00oOo00(signal);
                }
            });
        } catch (Throwable unused) {
        }
    }
}
