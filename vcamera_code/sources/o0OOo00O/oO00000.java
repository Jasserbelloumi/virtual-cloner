package o0OOo00O;

import java.io.Closeable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import o0OO.o00oOOoO;
import o0OO.o00oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u000b2\u00020\u00012\u00020\u0002:\u0001\fB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0004\u001a\u00020\u0003H&R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lo0OOo00O/oO00000;", "Lo0OOo00O/o0O0o000;", "Ljava/io/Closeable;", "Lo0OO0o/oO0Ooooo;", "close", "Ljava/util/concurrent/Executor;", "o0O0oo", "()Ljava/util/concurrent/Executor;", "executor", "<init>", "()V", "o00oo0Oo", "o00oOOo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class oO00000 extends o0O0o000 implements Closeable {
    @NotNull

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final o00oOOo0 f14063o00oo0Oo = new o00oOOo0();

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo0OOo00O/oO00000$o00oOOo0;", "Lo0OO/o00oOOoO;", "Lo0OOo00O/o0O0o000;", "Lo0OOo00O/oO00000;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @o0OO0o.o0O000
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o00oOOoO<o0O0o000, oO00000> {

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0OO/o00oo0$o00oOOoO;", "it", "Lo0OOo00O/oO00000;", "invoke", "(Lo0OO/o00oo0$o00oOOoO;)Lo0OOo00O/oO00000;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: o0OOo00O.oO00000$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0176o00oOOo0 extends o0OOOOO0.o0O0OO implements o0OOOO.o00oo<o00oo0.o00oOOoO, oO00000> {
            public static final C0176o00oOOo0 INSTANCE = new C0176o00oOOo0();

            public C0176o00oOOo0() {
                super(1);
            }

            @Override // o0OOOO.o00oo
            @Nullable
            public final oO00000 invoke(@NotNull o00oo0.o00oOOoO o00ooooo2) {
                if (o00ooooo2 instanceof oO00000) {
                    return (oO00000) o00ooooo2;
                }
                return null;
            }
        }

        public o00oOOo0() {
            super(o0O0o000.f14013o00oo0O, C0176o00oOOo0.INSTANCE);
        }

        public /* synthetic */ o00oOOo0(o0OOOOO0.o0O00 o0o00) {
            this();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();

    @NotNull
    public abstract Executor o0O0oo();
}
