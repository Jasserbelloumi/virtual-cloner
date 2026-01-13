package o0OOo00O;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OOo00O.o0OO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b \u0018\u00002\u00020\u00012\u00020\u0002:\u000489:\nB\u0007¢\u0006\u0004\b7\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00142\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0019\u001a\u00020\u00032\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0003H\u0004¢\u0006\u0004\b \u0010\u0005J\u001b\u0010\"\u001a\u00020!2\n\u0010\u0018\u001a\u00060\fj\u0002`\rH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\rH\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0003H\u0002¢\u0006\u0004\b&\u0010\u0005J\u0017\u0010'\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u001cH\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0003H\u0002¢\u0006\u0004\b,\u0010\u0005R$\u00102\u001a\u00020!2\u0006\u0010-\u001a\u00020!8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00104\u001a\u00020!8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00106\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0013¨\u0006;"}, d2 = {"Lo0OOo00O/o0o0000;", "Lo0OOo00O/oO0Oo;", "Lo0OOo00O/o0OO0;", "Lo0OO0o/oO0Ooooo;", "shutdown", "()V", "", "timeMillis", "Lo0OOo00O/o0O000Oo;", "continuation", "o00oOo0O", "(JLo0OOo00O/o0O000Oo;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lo0OOo00O/o0OOO0OO;", "o0OO0o0", "(JLjava/lang/Runnable;)Lo0OOo00O/o0OOO0OO;", "oo0oO0", "()J", "Lo0OO/o00oo0;", "context", "oo0oOOo", "(Lo0OO/o00oo0;Ljava/lang/Runnable;)V", "task", "o0OO0O0", "(Ljava/lang/Runnable;)V", "now", "Lo0OOo00O/o0o0000$o00oOo00;", "delayedTask", "o0OO0Ooo", "(JLo0OOo00O/o0o0000$o00oOo00;)V", "o0OOooO0", "", "o0OO0O0O", "(Ljava/lang/Runnable;)Z", "o0OO0", "()Ljava/lang/Runnable;", "o0OO00o", "o0OO0o0o", "(Lo0OOo00O/o0o0000$o00oOo00;)Z", "", "o0OO0o00", "(JLo0OOo00O/o0o0000$o00oOo00;)I", "o0OO0OoO", "value", "o00oOoO0", "()Z", "o0OO0o0O", "(Z)V", "isCompleted", "o0O", "isEmpty", "o0O0ooo", "nextTime", "<init>", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class o0o0000 extends oO0Oo implements o0OO0 {

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14052o00oo0oO = AtomicReferenceFieldUpdater.newUpdater(o0o0000.class, Object.class, "_queue");

    /* renamed from: o0O0o  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14053o0O0o = AtomicReferenceFieldUpdater.newUpdater(o0o0000.class, Object.class, "_delayed");
    @NotNull
    private volatile /* synthetic */ Object _queue = null;
    @NotNull
    private volatile /* synthetic */ Object _delayed = null;
    @NotNull
    private volatile /* synthetic */ int _isCompleted = 0;

    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"Lo0OOo00O/o0o0000$o00oOOo0;", "Lo0OOo00O/o0o0000$o00oOo00;", "Lo0OO0o/oO0Ooooo;", "run", "", "toString", "Lo0OOo00O/o0O000Oo;", "o00oo0Oo", "Lo0OOo00O/o0O000Oo;", "cont", "", "nanoTime", "<init>", "(Lo0OOo00O/o0o0000;JLo0OOo00O/o0O000Oo;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public final class o00oOOo0 extends o00oOo00 {
        @NotNull

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final o0O000Oo<o0OO0o.oO0Ooooo> f14054o00oo0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(long j, @NotNull o0O000Oo<? super o0OO0o.oO0Ooooo> o0o000oo) {
            super(j);
            this.f14054o00oo0Oo = o0o000oo;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14054o00oo0Oo.o00oo0O0(o0o0000.this, o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOo00O.o0o0000.o00oOo00
        @NotNull
        public String toString() {
            return super.toString() + this.f14054o00oo0Oo;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\n\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\n\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, d2 = {"Lo0OOo00O/o0o0000$o00oOOoO;", "Lo0OOo00O/o0o0000$o00oOo00;", "Lo0OO0o/oO0Ooooo;", "run", "", "toString", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "o00oo0Oo", "Ljava/lang/Runnable;", "block", "", "nanoTime", "<init>", "(JLjava/lang/Runnable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o00oOo00 {
        @NotNull

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final Runnable f14056o00oo0Oo;

        public o00oOOoO(long j, @NotNull Runnable runnable) {
            super(j);
            this.f14056o00oo0Oo = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14056o00oo0Oo.run();
        }

        @Override // o0OOo00O.o0o0000.o00oOo00
        @NotNull
        public String toString() {
            return super.toString() + this.f14056o00oo0Oo;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b*\u0010+J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0012J\b\u0010\u0015\u001a\u00020\u0014H\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\"\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R0\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010#2\f\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010#8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lo0OOo00O/o0o0000$o00oOo00;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lo0OOo00O/o0OOO0OO;", "Lo0OOo0o0/oO0O0OoO;", "other", "", "o00oOo0o", "", "now", "", "o00oOoo0", "Lo0OOo00O/o0o0000$o00oOo0O;", "delayed", "Lo0OOo00O/o0o0000;", "eventLoop", "o00oOoOo", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "", "toString", "o00oo0O0", "J", "nanoTime", "", "_heap", "Ljava/lang/Object;", "o00oo0O", "I", "getIndex", "()I", "setIndex", "(I)V", FirebaseAnalytics.Param.INDEX, "Lo0OOo0o0/oO000o00;", "value", "o00oOooO", "()Lo0OOo0o0/oO000o00;", "o00oOo0O", "(Lo0OOo0o0/oO000o00;)V", "heap", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static abstract class o00oOo00 implements Runnable, Comparable<o00oOo00>, o0OOO0OO, o0OOo0o0.oO0O0OoO {
        @Nullable
        private volatile Object _heap;

        /* renamed from: o00oo0O  reason: collision with root package name */
        public int f14057o00oo0O = -1;
        @o0OOOO0o.o00oOoO

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public long f14058o00oo0O0;

        public o00oOo00(long j) {
            this.f14058o00oo0O0 = j;
        }

        @Override // o0OOo0o0.oO0O0OoO
        public int getIndex() {
            return this.f14057o00oo0O;
        }

        @Override // o0OOo00O.o0OOO0OO
        public final synchronized void o00oOOoO() {
            o0OOo0o0.oO0o0o oo0o0o;
            Object obj = this._heap;
            oo0o0o = ooo0Oo0.f14138o00oOOo0;
            if (obj == oo0o0o) {
                return;
            }
            o00oOo0O o00ooo0o2 = obj instanceof o00oOo0O ? (o00oOo0O) obj : null;
            if (o00ooo0o2 != null) {
                o00ooo0o2.o00oOoo0(this);
            }
            this._heap = ooo0Oo0.f14138o00oOOo0;
        }

        @Override // o0OOo0o0.oO0O0OoO
        public void o00oOo0O(@Nullable o0OOo0o0.oO000o00<?> oo000o00) {
            o0OOo0o0.oO0o0o oo0o0o;
            Object obj = this._heap;
            oo0o0o = ooo0Oo0.f14138o00oOOo0;
            if (!(obj != oo0o0o)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = oo000o00;
        }

        @Override // java.lang.Comparable
        /* renamed from: o00oOo0o */
        public int compareTo(@NotNull o00oOo00 o00ooo002) {
            int i = ((this.f14058o00oo0O0 - o00ooo002.f14058o00oo0O0) > 0L ? 1 : ((this.f14058o00oo0O0 - o00ooo002.f14058o00oo0O0) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x001a, B:29:0x0045, B:9:0x000d, B:17:0x0021, B:25:0x0037, B:27:0x0040, B:28:0x0042, B:18:0x0024, B:22:0x002e), top: B:37:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized int o00oOoOo(long r8, @org.jetbrains.annotations.NotNull o0OOo00O.o0o0000.o00oOo0O r10, @org.jetbrains.annotations.NotNull o0OOo00O.o0o0000 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L4b
                o0OOo0o0.oO0o0o r1 = o0OOo00O.ooo0Oo0.o00oOOoO()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                o0OOo0o0.oO0O0OoO r0 = r10.o00oOo0o()     // Catch: java.lang.Throwable -> L48
                o0OOo00O.o0o0000$o00oOo00 r0 = (o0OOo00O.o0o0000.o00oOo00) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = o0OOo00O.o0o0000.o0OoOoO(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f14059o00oOOoO = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.f14058o00oo0O0     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f14059o00oOOoO     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f14058o00oo0O0     // Catch: java.lang.Throwable -> L48
                long r3 = r10.f14059o00oOOoO     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r8 >= 0) goto L42
                r7.f14058o00oo0O0 = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.o00oOOo0(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo00O.o0o0000.o00oOo00.o00oOoOo(long, o0OOo00O.o0o0000$o00oOo0O, o0OOo00O.o0o0000):int");
        }

        public final boolean o00oOoo0(long j) {
            return j - this.f14058o00oo0O0 >= 0;
        }

        @Override // o0OOo0o0.oO0O0OoO
        @Nullable
        public o0OOo0o0.oO000o00<?> o00oOooO() {
            Object obj = this._heap;
            if (obj instanceof o0OOo0o0.oO000o00) {
                return (o0OOo0o0.oO000o00) obj;
            }
            return null;
        }

        @Override // o0OOo0o0.oO0O0OoO
        public void setIndex(int i) {
            this.f14057o00oo0O = i;
        }

        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("Delayed[nanos=");
            o00oOOo02.append(this.f14058o00oo0O0);
            o00oOOo02.append(']');
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lo0OOo00O/o0o0000$o00oOo0O;", "Lo0OOo0o0/oO000o00;", "Lo0OOo00O/o0o0000$o00oOo00;", "", o0OO000o.o00oOOoO.f12961o00oOo00, "J", "timeNow", "<init>", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends o0OOo0o0.oO000o00<o00oOo00> {
        @o0OOOO0o.o00oOoO

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public long f14059o00oOOoO;

        public o00oOo0O(long j) {
            this.f14059o00oOOoO = j;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private final boolean o00oOoO0() {
        return this._isCompleted;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    public static final boolean o0OoOoO(o0o0000 o0o0000Var) {
        return o0o0000Var._isCompleted;
    }

    @Override // o0OOo00O.o0OO0
    public void o00oOo0O(long j, @NotNull o0O000Oo<? super o0OO0o.oO0Ooooo> o0o000oo) {
        long o00oOooO2 = ooo0Oo0.o00oOooO(j);
        if (o00oOooO2 < 4611686018427387903L) {
            o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
            long o00oOOoO3 = o00oOOoO2 != null ? o00oOOoO2.o00oOOoO() : System.nanoTime();
            o00oOOo0 o00oooo02 = new o00oOOo0(o00oOooO2 + o00oOOoO3, o0o000oo);
            o0OO0Ooo(o00oOOoO3, o00oooo02);
            o0OoO00O.o00oOOo0(o0o000oo, o00oooo02);
        }
    }

    @Override // o0OOo00O.o0OOo000
    public boolean o0O() {
        o0OOo0o0.oO0o0o oo0o0o;
        if (o0OO000o()) {
            o00oOo0O o00ooo0o2 = (o00oOo0O) this._delayed;
            if (o00ooo0o2 == null || o00ooo0o2.o00oOoO()) {
                Object obj = this._queue;
                if (obj != null) {
                    if (obj instanceof o0OOo0o0.o0OOOO) {
                        return ((o0OOo0o0.o0OOOO) obj).o00oOoO();
                    }
                    oo0o0o = ooo0Oo0.f14143o00oOoO;
                    if (obj != oo0o0o) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @NotNull
    public o0OOO0OO o0O000O(long j, @NotNull Runnable runnable, @NotNull o0OO.o00oo0 o00oo0Var) {
        return o0OO0.o00oOOo0.o00oOOoO(this, j, runnable, o00oo0Var);
    }

    @Override // o0OOo00O.o0OO0
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object o0O0o0oO(long j, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return o0OO0.o00oOOo0.o00oOOo0(this, j, o00ooo0o2);
    }

    @Override // o0OOo00O.o0OOo000
    public long o0O0ooo() {
        o00oOo00 o00oOoOO2;
        o0OOo0o0.oO0o0o oo0o0o;
        if (super.o0O0ooo() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof o0OOo0o0.o0OOOO)) {
                oo0o0o = ooo0Oo0.f14143o00oOoO;
                return obj == oo0o0o ? Long.MAX_VALUE : 0L;
            } else if (!((o0OOo0o0.o0OOOO) obj).o00oOoO()) {
                return 0L;
            }
        }
        o00oOo0O o00ooo0o2 = (o00oOo0O) this._delayed;
        if (o00ooo0o2 == null || (o00oOoOO2 = o00ooo0o2.o00oOoOO()) == null) {
            return Long.MAX_VALUE;
        }
        long j = o00oOoOO2.f14058o00oo0O0;
        o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
        long o00oOOoO3 = j - (o00oOOoO2 != null ? o00oOOoO2.o00oOOoO() : System.nanoTime());
        if (o00oOOoO3 < 0) {
            return 0L;
        }
        return o00oOOoO3;
    }

    public final Runnable o0OO0() {
        o0OOo0o0.oO0o0o oo0o0o;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof o0OOo0o0.o0OOOO) {
                o0OOo0o0.o0OOOO o0oooo = (o0OOo0o0.o0OOOO) obj;
                Object o00oOooo2 = o0oooo.o00oOooo();
                if (o00oOooo2 != o0OOo0o0.o0OOOO.f14624o00oo0o) {
                    return (Runnable) o00oOooo2;
                }
                androidx.concurrent.futures.o00oOo00.o00oOOo0(f14052o00oo0oO, this, obj, o0oooo.o00oOoo0());
            } else {
                oo0o0o = ooo0Oo0.f14143o00oOoO;
                if (obj == oo0o0o) {
                    return null;
                }
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14052o00oo0oO, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public final void o0OO00o() {
        o0OOo0o0.oO0o0o oo0o0o;
        o0OOo0o0.oO0o0o oo0o0o2;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14052o00oo0oO;
                oo0o0o = ooo0Oo0.f14143o00oOoO;
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, null, oo0o0o)) {
                    return;
                }
            } else if (obj instanceof o0OOo0o0.o0OOOO) {
                ((o0OOo0o0.o0OOOO) obj).o00oOooO();
                return;
            } else {
                oo0o0o2 = ooo0Oo0.f14143o00oOoO;
                if (obj == oo0o0o2) {
                    return;
                }
                o0OOo0o0.o0OOOO o0oooo = new o0OOo0o0.o0OOOO(8, true);
                o0oooo.o00oOOo0((Runnable) obj);
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14052o00oo0oO, this, obj, o0oooo)) {
                    return;
                }
            }
        }
    }

    public void o0OO0O0(@NotNull Runnable runnable) {
        if (o0OO0O0O(runnable)) {
            o0OO00o0();
        } else {
            o0OO00OO.f14022o00oo.o0OO0O0(runnable);
        }
    }

    public final boolean o0OO0O0O(Runnable runnable) {
        o0OOo0o0.oO0o0o oo0o0o;
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14052o00oo0oO, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof o0OOo0o0.o0OOOO) {
                o0OOo0o0.o0OOOO o0oooo = (o0OOo0o0.o0OOOO) obj;
                int o00oOOo02 = o0oooo.o00oOOo0(runnable);
                if (o00oOOo02 == 0) {
                    return true;
                }
                if (o00oOOo02 == 1) {
                    androidx.concurrent.futures.o00oOo00.o00oOOo0(f14052o00oo0oO, this, obj, o0oooo.o00oOoo0());
                } else if (o00oOOo02 == 2) {
                    return false;
                }
            } else {
                oo0o0o = ooo0Oo0.f14143o00oOoO;
                if (obj == oo0o0o) {
                    return false;
                }
                o0OOo0o0.o0OOOO o0oooo2 = new o0OOo0o0.o0OOOO(8, true);
                o0oooo2.o00oOOo0((Runnable) obj);
                o0oooo2.o00oOOo0(runnable);
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14052o00oo0oO, this, obj, o0oooo2)) {
                    return true;
                }
            }
        }
    }

    public final void o0OO0OoO() {
        o00oOo00 o00oo02;
        o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
        long o00oOOoO3 = o00oOOoO2 != null ? o00oOOoO2.o00oOOoO() : System.nanoTime();
        while (true) {
            o00oOo0O o00ooo0o2 = (o00oOo0O) this._delayed;
            if (o00ooo0o2 == null || (o00oo02 = o00ooo0o2.o00oo0()) == null) {
                return;
            }
            o0OO00Oo(o00oOOoO3, o00oo02);
        }
    }

    public final void o0OO0Ooo(long j, @NotNull o00oOo00 o00ooo002) {
        int o0OO0o002 = o0OO0o00(j, o00ooo002);
        if (o0OO0o002 == 0) {
            if (o0OO0o0o(o00ooo002)) {
                o0OO00o0();
            }
        } else if (o0OO0o002 == 1) {
            o0OO00Oo(j, o00ooo002);
        } else if (o0OO0o002 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    @NotNull
    public final o0OOO0OO o0OO0o0(long j, @NotNull Runnable runnable) {
        long o00oOooO2 = ooo0Oo0.o00oOooO(j);
        if (o00oOooO2 < 4611686018427387903L) {
            o00oo00O o00oOOoO2 = o00oo0.o00oOOoO();
            long o00oOOoO3 = o00oOOoO2 != null ? o00oOOoO2.o00oOOoO() : System.nanoTime();
            o00oOOoO o00ooooo2 = new o00oOOoO(o00oOooO2 + o00oOOoO3, runnable);
            o0OO0Ooo(o00oOOoO3, o00ooooo2);
            return o00ooooo2;
        }
        return oO00OOo0.f14087o00oo0O0;
    }

    public final int o0OO0o00(long j, o00oOo00 o00ooo002) {
        if (this._isCompleted != 0) {
            return 1;
        }
        o00oOo0O o00ooo0o2 = (o00oOo0O) this._delayed;
        if (o00ooo0o2 == null) {
            androidx.concurrent.futures.o00oOo00.o00oOOo0(f14053o0O0o, this, null, new o00oOo0O(j));
            Object obj = this._delayed;
            o0OOOOO0.o0ooO.o00oo00O(obj);
            o00ooo0o2 = (o00oOo0O) obj;
        }
        return o00ooo002.o00oOoOo(j, o00ooo0o2, this);
    }

    public final void o0OO0o0O(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    public final boolean o0OO0o0o(o00oOo00 o00ooo002) {
        o00oOo0O o00ooo0o2 = (o00oOo0O) this._delayed;
        return (o00ooo0o2 != null ? o00ooo0o2.o00oOoOO() : null) == o00ooo002;
    }

    public final void o0OOooO0() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0057  */
    @Override // o0OOo00O.o0OOo000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long oo0oO0() {
        /*
            r9 = this;
            boolean r0 = r9.oo0ooO()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r9._delayed
            o0OOo00O.o0o0000$o00oOo0O r0 = (o0OOo00O.o0o0000.o00oOo0O) r0
            if (r0 == 0) goto L4d
            boolean r3 = r0.o00oOoO()
            if (r3 != 0) goto L4d
            o0OOo00O.o00oo00O r3 = o0OOo00O.o00oo0.o00oOOoO()
            if (r3 == 0) goto L20
            long r3 = r3.o00oOOoO()
            goto L24
        L20:
            long r3 = java.lang.System.nanoTime()
        L24:
            monitor-enter(r0)
            o0OOo0o0.oO0O0OoO r5 = r0.o00oOo0o()     // Catch: java.lang.Throwable -> L4a
            r6 = 0
            if (r5 != 0) goto L2e
        L2c:
            monitor-exit(r0)
            goto L45
        L2e:
            o0OOo00O.o0o0000$o00oOo00 r5 = (o0OOo00O.o0o0000.o00oOo00) r5     // Catch: java.lang.Throwable -> L4a
            boolean r7 = r5.o00oOoo0(r3)     // Catch: java.lang.Throwable -> L4a
            r8 = 0
            if (r7 == 0) goto L3c
            boolean r5 = r9.o0OO0O0O(r5)     // Catch: java.lang.Throwable -> L4a
            goto L3d
        L3c:
            r5 = r8
        L3d:
            if (r5 == 0) goto L2c
            o0OOo0o0.oO0O0OoO r5 = r0.o00oOooo(r8)     // Catch: java.lang.Throwable -> L4a
            r6 = r5
            goto L2c
        L45:
            o0OOo00O.o0o0000$o00oOo00 r6 = (o0OOo00O.o0o0000.o00oOo00) r6
            if (r6 != 0) goto L24
            goto L4d
        L4a:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L4d:
            java.lang.Runnable r0 = r9.o0OO0()
            if (r0 == 0) goto L57
            r0.run()
            return r1
        L57:
            long r0 = r9.o0O0ooo()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo00O.o0o0000.oo0oO0():long");
    }

    @Override // o0OOo00O.o0O0o000
    public final void oo0oOOo(@NotNull o0OO.o00oo0 o00oo0Var, @NotNull Runnable runnable) {
        o0OO0O0(runnable);
    }

    @Override // o0OOo00O.o0OOo000
    public void shutdown() {
        oO0O00.f14094o00oOOo0.o00oOo00();
        o0OO0o0O(true);
        o0OO00o();
        do {
        } while (oo0oO0() <= 0);
        o0OO0OoO();
    }
}
