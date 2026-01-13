package o0OOo0o0;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import o0OOOO.o00oo;
import o0OOOOO0.o0ooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@o0OOo00O.oO0o0o
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0017\u0018\u00002\u00020\u0001:\u0005JKLMNB\u0007¢\u0006\u0004\bI\u00102J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0016\u001a\u00020\u00152\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0081\b¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u001a\u0010\fJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c\"\f\b\u0000\u0010\u001b*\u00060\u0000j\u0002`\u00052\u0006\u0010\u0011\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b\u001f\u0010 J4\u0010#\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b#\u0010$JD\u0010%\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\u0016\u0010\"\u001a\u0012\u0012\b\u0012\u00060\u0000j\u0002`\u0005\u0012\u0004\u0012\u00020\u00130!2\u000e\b\u0004\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0086\b¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020\u00132\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b'\u0010(J/\u0010+\u001a\u00020*2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010)\u001a\u00020\u0015H\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\n¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\nH\u0001¢\u0006\u0004\b3\u00102J\u0015\u00104\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b4\u00100J\u0017\u00106\u001a\f\u0012\b\u0012\u00060\u0000j\u0002`\u000505¢\u0006\u0004\b6\u00107J.\u00108\u001a\u0004\u0018\u00018\u0000\"\u0006\b\u0000\u0010\u001b\u0018\u00012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130!H\u0086\b¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0014¢\u0006\u0004\b:\u00100J'\u0010<\u001a\u00020\n2\n\u0010;\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0000¢\u0006\u0004\b<\u0010=J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010.R\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0015\u0010F\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bE\u00100R\u0015\u0010H\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\bG\u00100¨\u0006O"}, d2 = {"Lo0OOo0o0/o0OOO0OO;", "", "Lo0OOo0o0/oO0000Oo;", "o0O000o", "()Lo0OOo0o0/oO0000Oo;", "Lkotlinx/coroutines/internal/Node;", "current", "o00oooo0", "(Lo0OOo0o0/o0OOO0OO;)Lo0OOo0o0/o0OOO0OO;", "next", "Lo0OO0o/oO0Ooooo;", "o00oooo", "(Lo0OOo0o0/o0OOO0OO;)V", "Lo0OOo0o0/oO00000o;", "op", "o00ooo0o", "(Lo0OOo0o0/oO00000o;)Lo0OOo0o0/o0OOO0OO;", "node", "Lkotlin/Function0;", "", "condition", "Lo0OOo0o0/o0OOO0OO$o00oOo00;", "o0O000", "(Lo0OOo0o0/o0OOO0OO;Lo0OOOO/o00oOOo0;)Lo0OOo0o0/o0OOO0OO$o00oOo00;", "o00ooo0", "(Lo0OOo0o0/o0OOO0OO;)Z", "o00ooOO0", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0o0/o0OOO0OO$o00oOOoO;", "o00oooO", "(Lo0OOo0o0/o0OOO0OO;)Lo0OOo0o0/o0OOO0OO$o00oOOoO;", "o00ooOOo", "(Lo0OOo0o0/o0OOO0OO;Lo0OOOO/o00oOOo0;)Z", "Lkotlin/Function1;", "predicate", "o00ooOo0", "(Lo0OOo0o0/o0OOO0OO;Lo0OOOO/o00oo;)Z", "o00ooOo", "(Lo0OOo0o0/o0OOO0OO;Lo0OOOO/o00oo;Lo0OOOO/o00oOOo0;)Z", "o00ooOoO", "(Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO;)Z", "condAdd", "", "o0ooOoOO", "(Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO$o00oOo00;)I", "o0OoOoOo", "()Z", "o0O000o0", "()Lo0OOo0o0/o0OOO0OO;", "o0O00000", "()V", "o0O0000O", "o0OoOoOO", "Lo0OOo0o0/o0OOO0OO$o00oOoO;", "o00oooOo", "()Lo0OOo0o0/o0OOO0OO$o00oOoO;", "o0O000Oo", "(Lo0OOOO/o00oo;)Ljava/lang/Object;", "o0O000O", "prev", "o0O000oo", "(Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO;)V", "", "toString", "()Ljava/lang/String;", "o0O0000o", "isRemoved", "o00ooooO", "()Ljava/lang/Object;", "o00ooooo", "nextNode", "o0", "prevNode", "<init>", "o00oOOo0", o0OO000o.o00oOOoO.f12961o00oOo00, "o00oOo00", "o00oOo0O", "o00oOoO", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class o0OOO0OO {
    @NotNull
    public volatile /* synthetic */ Object _next = this;
    @NotNull
    public volatile /* synthetic */ Object _prev = this;
    @NotNull
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14595o00oo0O0 = AtomicReferenceFieldUpdater.newUpdater(o0OOO0OO.class, Object.class, "_next");

    /* renamed from: o00oo0O  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14594o00oo0O = AtomicReferenceFieldUpdater.newUpdater(o0OOO0OO.class, Object.class, "_prev");

    /* renamed from: o00oo0Oo  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14596o00oo0Oo = AtomicReferenceFieldUpdater.newUpdater(o0OOO0OO.class, Object.class, "_removedRef");

    @Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lo0OOo0o0/o0OOO0OO$o00oOOo0;", "Lo0OOo0o0/o0oOo0O0;", "Lo0OOo0o0/oO00000o;", "op", "Lo0OOo0o0/o0OOO0OO;", "Lkotlinx/coroutines/internal/Node;", "o00oo00O", "affected", "", "o00oOo0O", "next", "", "o00oOooo", "Lo0OO0o/oO0Ooooo;", "o00oOo0o", "o00oo0", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "prepareOp", "o00oOoO0", "o00oOoOo", "o00oOoo0", "Lo0OOo0o0/o0O0oo00;", "o00oOo00", "failure", "o00oOOo0", "o00oOoO", "()Lo0OOo0o0/o0OOO0OO;", "affectedNode", "o00oOoOO", "originalNext", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static abstract class o00oOOo0 extends o0oOo0O0 {
        @Override // o0OOo0o0.o0oOo0O0
        public final void o00oOOo0(@NotNull o0O0oo00<?> o0o0oo00, @Nullable Object obj) {
            o0OOO0OO o00oOoOO2;
            boolean z = obj == null;
            o0OOO0OO o00oOoO2 = o00oOoO();
            if (o00oOoO2 == null || (o00oOoOO2 = o00oOoOO()) == null) {
                return;
            }
            if (androidx.concurrent.futures.o00oOo00.o00oOOo0(o0OOO0OO.f14595o00oo0O0, o00oOoO2, o0o0oo00, z ? o00oo0(o00oOoO2, o00oOoOO2) : o00oOoOO2) && z) {
                o00oOo0o(o00oOoO2, o00oOoOO2);
            }
        }

        @Override // o0OOo0o0.o0oOo0O0
        @Nullable
        public final Object o00oOo00(@NotNull o0O0oo00<?> o0o0oo00) {
            while (true) {
                o0OOO0OO o00oo00O2 = o00oo00O(o0o0oo00);
                if (o00oo00O2 == null) {
                    return oooOO0.f14679o00oOOoO;
                }
                Object obj = o00oo00O2._next;
                if (obj == o0o0oo00 || o0o0oo00.o00oOoO()) {
                    return null;
                }
                if (obj instanceof oO00000o) {
                    oO00000o oo00000o = (oO00000o) obj;
                    if (o0o0oo00.o00oOOoO(oo00000o)) {
                        return oooOO0.f14679o00oOOoO;
                    }
                    oo00000o.o00oOo00(o00oo00O2);
                } else {
                    Object o00oOo0O2 = o00oOo0O(o00oo00O2);
                    if (o00oOo0O2 != null) {
                        return o00oOo0O2;
                    }
                    if (o00oOooo(o00oo00O2, obj)) {
                        continue;
                    } else {
                        o00oOo0O o00ooo0o2 = new o00oOo0O(o00oo00O2, (o0OOO0OO) obj, this);
                        if (androidx.concurrent.futures.o00oOo00.o00oOOo0(o0OOO0OO.f14595o00oo0O0, o00oo00O2, obj, o00ooo0o2)) {
                            try {
                                if (o00ooo0o2.o00oOo00(o00oo00O2) != o0OOOO00.f14633o00oOOo0) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                androidx.concurrent.futures.o00oOo00.o00oOOo0(o0OOO0OO.f14595o00oo0O0, o00oo00O2, o00ooo0o2, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        @Nullable
        public Object o00oOo0O(@NotNull o0OOO0OO o0ooo0oo) {
            return null;
        }

        public abstract void o00oOo0o(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2);

        @Nullable
        public abstract o0OOO0OO o00oOoO();

        public abstract void o00oOoO0(@NotNull o00oOo0O o00ooo0o2);

        @Nullable
        public abstract o0OOO0OO o00oOoOO();

        @Nullable
        public Object o00oOoOo(@NotNull o00oOo0O o00ooo0o2) {
            o00oOoO0(o00ooo0o2);
            return null;
        }

        public void o00oOoo0(@NotNull o0OOO0OO o0ooo0oo) {
        }

        public boolean o00oOooo(@NotNull o0OOO0OO o0ooo0oo, @NotNull Object obj) {
            return false;
        }

        @NotNull
        public abstract Object o00oo0(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2);

        @Nullable
        public o0OOO0OO o00oo00O(@NotNull oO00000o oo00000o) {
            o0OOO0OO o00oOoO2 = o00oOoO();
            o0ooO.o00oo00O(o00oOoO2);
            return o00oOoO2;
        }
    }

    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000*\f\b\u0000\u0010\u0003*\u00060\u0001j\u0002`\u00022\u00020\u0004B\u001b\u0012\n\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002\u0012\u0006\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u0017J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\f2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00112\n\u0010\t\u001a\u00060\u0001j\u0002`\u00022\n\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002H\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u00060\u0001j\u0002`\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00028\u00008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010!\u001a\u00060\u0001j\u0002`\u00028DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001e¨\u0006#"}, d2 = {"Lo0OOo0o0/o0OOO0OO$o00oOOoO;", "Lo0OOo0o0/o0OOO0OO;", "Lkotlinx/coroutines/internal/Node;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0o0/o0OOO0OO$o00oOOo0;", "Lo0OOo0o0/oO00000o;", "op", "o00oo00O", "(Lo0OOo0o0/oO00000o;)Lo0OOo0o0/o0OOO0OO;", "affected", "", "next", "", "o00oOooo", "(Lo0OOo0o0/o0OOO0OO;Ljava/lang/Object;)Z", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "prepareOp", "Lo0OO0o/oO0Ooooo;", "o00oOoO0", "(Lo0OOo0o0/o0OOO0OO$o00oOo0O;)V", "o00oo0", "(Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO;)Ljava/lang/Object;", "o00oOo0o", "(Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO;)V", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OOo0o0/o0OOO0OO;", "queue", "o00oOo00", "node", "o00oOoO", "()Lo0OOo0o0/o0OOO0OO;", "affectedNode", "o00oOoOO", "originalNext", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class o00oOOoO<T extends o0OOO0OO> extends o00oOOo0 {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14597o00oOooO = AtomicReferenceFieldUpdater.newUpdater(o00oOOoO.class, Object.class, "_affectedNode");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode = null;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0OOO0OO f14598o00oOOoO;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final T f14599o00oOo00;

        public o00oOOoO(@NotNull o0OOO0OO o0ooo0oo, @NotNull T t) {
            this.f14598o00oOOoO = o0ooo0oo;
            this.f14599o00oOo00 = t;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        public void o00oOo0o(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2) {
            this.f14599o00oOo00.o00oooo(this.f14598o00oOOoO);
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public final o0OOO0OO o00oOoO() {
            return (o0OOO0OO) this._affectedNode;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        public void o00oOoO0(@NotNull o00oOo0O o00ooo0o2) {
            androidx.concurrent.futures.o00oOo00.o00oOOo0(f14597o00oOooO, this, null, o00ooo0o2.f14602o00oOOo0);
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @NotNull
        public final o0OOO0OO o00oOoOO() {
            return this.f14598o00oOOoO;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        public boolean o00oOooo(@NotNull o0OOO0OO o0ooo0oo, @NotNull Object obj) {
            return obj != this.f14598o00oOOoO;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @NotNull
        public Object o00oo0(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2) {
            T t = this.f14599o00oOo00;
            androidx.concurrent.futures.o00oOo00.o00oOOo0(o0OOO0OO.f14594o00oo0O, t, t, o0ooo0oo);
            T t2 = this.f14599o00oOo00;
            androidx.concurrent.futures.o00oOo00.o00oOOo0(o0OOO0OO.f14595o00oo0O0, t2, t2, this.f14598o00oOOoO);
            return this.f14599o00oOo00;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public final o0OOO0OO o00oo00O(@NotNull oO00000o oo00000o) {
            return this.f14598o00oOOoO.o00ooo0o(oo00000o);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Lo0OOo0o0/o0OOO0OO$o00oOo00;", "Lo0OOo0o0/o0O0oo00;", "Lo0OOo0o0/o0OOO0OO;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "Lo0OO0o/oO0Ooooo;", "o00oOoOo", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OOo0o0/o0OOO0OO;", "newNode", "o00oOo00", "oldNext", "<init>", "(Lo0OOo0o0/o0OOO0OO;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    @o0OO0o.o0O
    /* loaded from: classes3.dex */
    public static abstract class o00oOo00 extends o0O0oo00<o0OOO0OO> {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0OOO0OO f14600o00oOOoO;
        @o0OOOO0o.o00oOoO
        @Nullable

        /* renamed from: o00oOo00  reason: collision with root package name */
        public o0OOO0OO f14601o00oOo00;

        public o00oOo00(@NotNull o0OOO0OO o0ooo0oo) {
            this.f14600o00oOOoO = o0ooo0oo;
        }

        @Override // o0OOo0o0.o0O0oo00
        /* renamed from: o00oOoOo */
        public void o00oOooO(@NotNull o0OOO0OO o0ooo0oo, @Nullable Object obj) {
            boolean z = obj == null;
            o0OOO0OO o0ooo0oo2 = z ? this.f14600o00oOOoO : this.f14601o00oOo00;
            if (o0ooo0oo2 != null && androidx.concurrent.futures.o00oOo00.o00oOOo0(o0OOO0OO.f14595o00oo0O0, o0ooo0oo, this, o0ooo0oo2) && z) {
                o0OOO0OO o0ooo0oo3 = this.f14600o00oOOoO;
                o0OOO0OO o0ooo0oo4 = this.f14601o00oOo00;
                o0ooO.o00oo00O(o0ooo0oo4);
                o0ooo0oo3.o00oooo(o0ooo0oo4);
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "Lo0OOo0o0/oO00000o;", "", "affected", "o00oOo00", "Lo0OO0o/oO0Ooooo;", "o00oOooO", "", "toString", "Lo0OOo0o0/o0OOO0OO;", "Lkotlinx/coroutines/internal/Node;", "o00oOOo0", "Lo0OOo0o0/o0OOO0OO;", o0OO000o.o00oOOoO.f12961o00oOo00, "next", "Lo0OOo0o0/o0OOO0OO$o00oOOo0;", "Lo0OOo0o0/o0OOO0OO$o00oOOo0;", "desc", "Lo0OOo0o0/o0O0oo00;", "()Lo0OOo0o0/o0O0oo00;", "atomicOp", "<init>", "(Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO$o00oOOo0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O extends oO00000o {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public final o0OOO0OO f14602o00oOOo0;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0OOO0OO f14603o00oOOoO;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOo00  reason: collision with root package name */
        public final o00oOOo0 f14604o00oOo00;

        public o00oOo0O(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2, @NotNull o00oOOo0 o00oooo02) {
            this.f14602o00oOOo0 = o0ooo0oo;
            this.f14603o00oOOoO = o0ooo0oo2;
            this.f14604o00oOo00 = o00oooo02;
        }

        @Override // o0OOo0o0.oO00000o
        @NotNull
        public o0O0oo00<?> o00oOOo0() {
            return this.f14604o00oOo00.o00oOOoO();
        }

        @Override // o0OOo0o0.oO00000o
        @Nullable
        public Object o00oOo00(@Nullable Object obj) {
            if (obj != null) {
                o0OOO0OO o0ooo0oo = (o0OOO0OO) obj;
                Object o00oOoOo2 = this.f14604o00oOo00.o00oOoOo(this);
                Object obj2 = o0OOOO00.f14633o00oOOo0;
                if (o00oOoOo2 != obj2) {
                    Object o00oOo0O2 = o00oOoOo2 != null ? o00oOOo0().o00oOo0O(o00oOoOo2) : o00oOOo0().o00oOo0o();
                    androidx.concurrent.futures.o00oOo00.o00oOOo0(o0OOO0OO.f14595o00oo0O0, o0ooo0oo, this, o00oOo0O2 == oooOO0.f14678o00oOOo0 ? o00oOOo0() : o00oOo0O2 == null ? this.f14604o00oOo00.o00oo0(o0ooo0oo, this.f14603o00oOOoO) : this.f14603o00oOOoO);
                    return null;
                }
                o0OOO0OO o0ooo0oo2 = this.f14603o00oOOoO;
                if (androidx.concurrent.futures.o00oOo00.o00oOOo0(o0OOO0OO.f14595o00oo0O0, o0ooo0oo, this, o0ooo0oo2.o0O000o())) {
                    this.f14604o00oOo00.o00oOoo0(o0ooo0oo);
                    o0ooo0oo2.o00ooo0o(null);
                }
                return obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        public final void o00oOooO() {
            this.f14604o00oOo00.o00oOoO0(this);
        }

        @Override // o0OOo0o0.oO00000o
        @NotNull
        public String toString() {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("PrepareOp(op=");
            o00oOOo02.append(o00oOOo0());
            o00oOOo02.append(')');
            return o00oOOo02.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Lo0OOo0o0/o0OOO0OO$o00oOoO;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0o0/o0OOO0OO$o00oOOo0;", "Lo0OOo0o0/oO00000o;", "op", "Lo0OOo0o0/o0OOO0OO;", "Lkotlinx/coroutines/internal/Node;", "o00oo00O", "(Lo0OOo0o0/oO00000o;)Lo0OOo0o0/o0OOO0OO;", "affected", "", "o00oOo0O", "(Lo0OOo0o0/o0OOO0OO;)Ljava/lang/Object;", "next", "", "o00oOooo", "(Lo0OOo0o0/o0OOO0OO;Ljava/lang/Object;)Z", "Lo0OOo0o0/o0OOO0OO$o00oOo0O;", "prepareOp", "Lo0OO0o/oO0Ooooo;", "o00oOoO0", "(Lo0OOo0o0/o0OOO0OO$o00oOo0O;)V", "o00oo0", "(Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO;)Ljava/lang/Object;", "o00oOo0o", "(Lo0OOo0o0/o0OOO0OO;Lo0OOo0o0/o0OOO0OO;)V", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OOo0o0/o0OOO0OO;", "queue", "o00oo0OO", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", "o00oOoO", "()Lo0OOo0o0/o0OOO0OO;", "affectedNode", "o00oOoOO", "originalNext", "<init>", "(Lo0OOo0o0/o0OOO0OO;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static class o00oOoO<T> extends o00oOOo0 {

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14605o00oOo00 = AtomicReferenceFieldUpdater.newUpdater(o00oOoO.class, Object.class, "_affectedNode");

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f14606o00oOooO = AtomicReferenceFieldUpdater.newUpdater(o00oOoO.class, Object.class, "_originalNext");
        @NotNull
        private volatile /* synthetic */ Object _affectedNode = null;
        @NotNull
        private volatile /* synthetic */ Object _originalNext = null;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public final o0OOO0OO f14607o00oOOoO;

        public o00oOoO(@NotNull o0OOO0OO o0ooo0oo) {
            this.f14607o00oOOoO = o0ooo0oo;
        }

        public static /* synthetic */ void o00oo0O0() {
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public Object o00oOo0O(@NotNull o0OOO0OO o0ooo0oo) {
            if (o0ooo0oo == this.f14607o00oOOoO) {
                return o0OOO0O.o00oOooO();
            }
            return null;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        public final void o00oOo0o(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2) {
            o0ooo0oo2.o00ooo0o(null);
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public final o0OOO0OO o00oOoO() {
            return (o0OOO0OO) this._affectedNode;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        public void o00oOoO0(@NotNull o00oOo0O o00ooo0o2) {
            androidx.concurrent.futures.o00oOo00.o00oOOo0(f14605o00oOo00, this, null, o00ooo0o2.f14602o00oOOo0);
            androidx.concurrent.futures.o00oOo00.o00oOOo0(f14606o00oOooO, this, null, o00ooo0o2.f14603o00oOOoO);
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public final o0OOO0OO o00oOoOO() {
            return (o0OOO0OO) this._originalNext;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        public final boolean o00oOooo(@NotNull o0OOO0OO o0ooo0oo, @NotNull Object obj) {
            if (obj instanceof oO0000Oo) {
                ((oO0000Oo) obj).f14645o00oOOo0.o0O0000O();
                return true;
            }
            return false;
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @NotNull
        public final Object o00oo0(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2) {
            return o0ooo0oo2.o0O000o();
        }

        @Override // o0OOo0o0.o0OOO0OO.o00oOOo0
        @Nullable
        public final o0OOO0OO o00oo00O(@NotNull oO00000o oo00000o) {
            o0OOO0OO o0ooo0oo = this.f14607o00oOOoO;
            while (true) {
                Object obj = o0ooo0oo._next;
                if (!(obj instanceof oO00000o)) {
                    return (o0OOO0OO) obj;
                }
                oO00000o oo00000o2 = (oO00000o) obj;
                if (oo00000o.o00oOOoO(oo00000o2)) {
                    return null;
                }
                oo00000o2.o00oOo00(this.f14607o00oOOoO);
            }
        }

        public final T o00oo0OO() {
            T t = (T) o00oOoO();
            o0ooO.o00oo00O(t);
            return t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"o0OOo0o0/o0OOO0OO$o00oo00O", "Lo0OOo0o0/o0OOO0OO$o00oOo00;", "Lo0OOo0o0/o0OOO0OO;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "o00oOoo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo00O extends o00oOo00 {

        /* renamed from: o00oOooO  reason: collision with root package name */
        public final /* synthetic */ o0OOOO.o00oOOo0<Boolean> f14608o00oOooO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oo00O(o0OOO0OO o0ooo0oo, o0OOOO.o00oOOo0<Boolean> o00oooo02) {
            super(o0ooo0oo);
            this.f14608o00oOooO = o00oooo02;
        }

        @Override // o0OOo0o0.o0O0oo00
        @Nullable
        /* renamed from: o00oOoo0 */
        public Object o00oOoOO(@NotNull o0OOO0OO o0ooo0oo) {
            if (this.f14608o00oOooO.invoke().booleanValue()) {
                return null;
            }
            return o0OOO0O.o00oOOo0();
        }
    }

    @NotNull
    public final o0OOO0OO o0() {
        o0OOO0OO o00ooo0o2 = o00ooo0o(null);
        return o00ooo0o2 == null ? o00oooo0((o0OOO0OO) this._prev) : o00ooo0o2;
    }

    public final void o00ooOO0(@NotNull o0OOO0OO o0ooo0oo) {
        do {
        } while (!o0().o00ooOoO(o0ooo0oo, this));
    }

    public final boolean o00ooOOo(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOOO.o00oOOo0<Boolean> o00oooo02) {
        int o0ooOoOO2;
        o00oo00O o00oo00o = new o00oo00O(o0ooo0oo, o00oooo02);
        do {
            o0ooOoOO2 = o0().o0ooOoOO(o0ooo0oo, this, o00oo00o);
            if (o0ooOoOO2 == 1) {
                return true;
            }
        } while (o0ooOoOO2 != 2);
        return false;
    }

    public final boolean o00ooOo(@NotNull o0OOO0OO o0ooo0oo, @NotNull o00oo<? super o0OOO0OO, Boolean> o00ooVar, @NotNull o0OOOO.o00oOOo0<Boolean> o00oooo02) {
        int o0ooOoOO2;
        o00oo00O o00oo00o = new o00oo00O(o0ooo0oo, o00oooo02);
        do {
            o0OOO0OO o02 = o0();
            if (!o00ooVar.invoke(o02).booleanValue()) {
                return false;
            }
            o0ooOoOO2 = o02.o0ooOoOO(o0ooo0oo, this, o00oo00o);
            if (o0ooOoOO2 == 1) {
                return true;
            }
        } while (o0ooOoOO2 != 2);
        return false;
    }

    public final boolean o00ooOo0(@NotNull o0OOO0OO o0ooo0oo, @NotNull o00oo<? super o0OOO0OO, Boolean> o00ooVar) {
        o0OOO0OO o02;
        do {
            o02 = o0();
            if (!o00ooVar.invoke(o02).booleanValue()) {
                return false;
            }
        } while (!o02.o00ooOoO(o0ooo0oo, this));
        return true;
    }

    @o0OO0o.o0O
    public final boolean o00ooOoO(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2) {
        f14594o00oo0O.lazySet(o0ooo0oo, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14595o00oo0O0;
        atomicReferenceFieldUpdater.lazySet(o0ooo0oo, o0ooo0oo2);
        if (androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, o0ooo0oo2, o0ooo0oo)) {
            o0ooo0oo.o00oooo(o0ooo0oo2);
            return true;
        }
        return false;
    }

    public final boolean o00ooo0(@NotNull o0OOO0OO o0ooo0oo) {
        f14594o00oo0O.lazySet(o0ooo0oo, this);
        f14595o00oo0O0.lazySet(o0ooo0oo, this);
        while (o00ooooO() == this) {
            if (androidx.concurrent.futures.o00oOo00.o00oOOo0(f14595o00oo0O0, this, this, o0ooo0oo)) {
                o0ooo0oo.o00oooo(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (androidx.concurrent.futures.o00oOo00.o00oOOo0(o0OOo0o0.o0OOO0OO.f14595o00oo0O0, r3, r2, ((o0OOo0o0.oO0000Oo) r4).f14645o00oOOo0) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o0OOo0o0.o0OOO0OO o00ooo0o(o0OOo0o0.oO00000o r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            o0OOo0o0.o0OOO0OO r0 = (o0OOo0o0.o0OOO0OO) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = o0OOo0o0.o0OOO0OO.f14594o00oo0O
            boolean r0 = androidx.concurrent.futures.o00oOo00.o00oOOo0(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.o0O0000o()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof o0OOo0o0.oO00000o
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            o0OOo0o0.oO00000o r0 = (o0OOo0o0.oO00000o) r0
            boolean r0 = r8.o00oOOoO(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            o0OOo0o0.oO00000o r4 = (o0OOo0o0.oO00000o) r4
            r4.o00oOo00(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof o0OOo0o0.oO0000Oo
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = o0OOo0o0.o0OOO0OO.f14595o00oo0O0
            o0OOo0o0.oO0000Oo r4 = (o0OOo0o0.oO0000Oo) r4
            o0OOo0o0.o0OOO0OO r4 = r4.f14645o00oOOo0
            boolean r2 = androidx.concurrent.futures.o00oOo00.o00oOOo0(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            o0OOo0o0.o0OOO0OO r2 = (o0OOo0o0.o0OOO0OO) r2
            goto L7
        L52:
            r3 = r4
            o0OOo0o0.o0OOO0OO r3 = (o0OOo0o0.o0OOO0OO) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0o0.o0OOO0OO.o00ooo0o(o0OOo0o0.oO00000o):o0OOo0o0.o0OOO0OO");
    }

    @NotNull
    public final <T extends o0OOO0OO> o00oOOoO<T> o00oooO(@NotNull T t) {
        return new o00oOOoO<>(this, t);
    }

    @NotNull
    public final o00oOoO<o0OOO0OO> o00oooOo() {
        return new o00oOoO<>(this);
    }

    public final void o00oooo(o0OOO0OO o0ooo0oo) {
        o0OOO0OO o0ooo0oo2;
        do {
            o0ooo0oo2 = (o0OOO0OO) o0ooo0oo._prev;
            if (o00ooooO() != o0ooo0oo) {
                return;
            }
        } while (!androidx.concurrent.futures.o00oOo00.o00oOOo0(f14594o00oo0O, o0ooo0oo, o0ooo0oo2, this));
        if (o0O0000o()) {
            o0ooo0oo.o00ooo0o(null);
        }
    }

    public final o0OOO0OO o00oooo0(o0OOO0OO o0ooo0oo) {
        while (o0ooo0oo.o0O0000o()) {
            o0ooo0oo = (o0OOO0OO) o0ooo0oo._prev;
        }
        return o0ooo0oo;
    }

    @NotNull
    public final Object o00ooooO() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof oO00000o)) {
                return obj;
            }
            ((oO00000o) obj).o00oOo00(this);
        }
    }

    @NotNull
    public final o0OOO0OO o00ooooo() {
        return o0OOO0O.o00oOoO(o00ooooO());
    }

    @o0OO0o.o0O
    @NotNull
    public final o00oOo00 o0O000(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOOO.o00oOOo0<Boolean> o00oooo02) {
        return new o00oo00O(o0ooo0oo, o00oooo02);
    }

    public final void o0O00000() {
        ((oO0000Oo) o00ooooO()).f14645o00oOOo0.o0O0000O();
    }

    @o0OO0o.o0O
    public final void o0O0000O() {
        o0OOO0OO o0ooo0oo = this;
        while (true) {
            Object o00ooooO2 = o0ooo0oo.o00ooooO();
            if (!(o00ooooO2 instanceof oO0000Oo)) {
                o0ooo0oo.o00ooo0o(null);
                return;
            }
            o0ooo0oo = ((oO0000Oo) o00ooooO2).f14645o00oOOo0;
        }
    }

    public boolean o0O0000o() {
        return o00ooooO() instanceof oO0000Oo;
    }

    @Nullable
    public o0OOO0OO o0O000O() {
        Object o00ooooO2 = o00ooooO();
        oO0000Oo oo0000oo = o00ooooO2 instanceof oO0000Oo ? (oO0000Oo) o00ooooO2 : null;
        if (oo0000oo != null) {
            return oo0000oo.f14645o00oOOo0;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, o0OOo0o0.o0OOO0OO, java.lang.Object] */
    public final <T> T o0O000Oo(o00oo<? super T, Boolean> o00ooVar) {
        o0OOO0OO o0O000o02;
        while (true) {
            o0OOO0OO o0ooo0oo = (o0OOO0OO) o00ooooO();
            if (o0ooo0oo == this) {
                return null;
            }
            o0ooO.o00oooOo();
            if (!(o0ooo0oo instanceof Object)) {
                return null;
            }
            if ((o00ooVar.invoke(o0ooo0oo).booleanValue() && !o0ooo0oo.o0O0000o()) || (o0O000o02 = o0ooo0oo.o0O000o0()) == null) {
                return o0ooo0oo;
            }
            o0O000o02.o0O0000O();
        }
    }

    public final oO0000Oo o0O000o() {
        oO0000Oo oo0000oo = (oO0000Oo) this._removedRef;
        if (oo0000oo == null) {
            oO0000Oo oo0000oo2 = new oO0000Oo(this);
            f14596o00oo0Oo.lazySet(this, oo0000oo2);
            return oo0000oo2;
        }
        return oo0000oo;
    }

    @o0OO0o.o0O
    @Nullable
    public final o0OOO0OO o0O000o0() {
        Object o00ooooO2;
        o0OOO0OO o0ooo0oo;
        do {
            o00ooooO2 = o00ooooO();
            if (o00ooooO2 instanceof oO0000Oo) {
                return ((oO0000Oo) o00ooooO2).f14645o00oOOo0;
            }
            if (o00ooooO2 == this) {
                return (o0OOO0OO) o00ooooO2;
            }
            o0ooo0oo = (o0OOO0OO) o00ooooO2;
        } while (!androidx.concurrent.futures.o00oOo00.o00oOOo0(f14595o00oo0O0, this, o00ooooO2, o0ooo0oo.o0O000o()));
        o0ooo0oo.o00ooo0o(null);
        return null;
    }

    public final void o0O000oo(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2) {
    }

    @Nullable
    public final o0OOO0OO o0OoOoOO() {
        while (true) {
            o0OOO0OO o0ooo0oo = (o0OOO0OO) o00ooooO();
            if (o0ooo0oo == this) {
                return null;
            }
            if (o0ooo0oo.o0OoOoOo()) {
                return o0ooo0oo;
            }
            o0ooo0oo.o0O00000();
        }
    }

    public boolean o0OoOoOo() {
        return o0O000o0() == null;
    }

    @o0OO0o.o0O
    public final int o0ooOoOO(@NotNull o0OOO0OO o0ooo0oo, @NotNull o0OOO0OO o0ooo0oo2, @NotNull o00oOo00 o00ooo002) {
        f14594o00oo0O.lazySet(o0ooo0oo, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14595o00oo0O0;
        atomicReferenceFieldUpdater.lazySet(o0ooo0oo, o0ooo0oo2);
        o00ooo002.f14601o00oOo00 = o0ooo0oo2;
        if (androidx.concurrent.futures.o00oOo00.o00oOOo0(atomicReferenceFieldUpdater, this, o0ooo0oo2, o00ooo002)) {
            return o00ooo002.o00oOo00(this) == null ? 1 : 2;
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return new o0OOOOO0.oo0ooO(this) { // from class: o0OOo0o0.o0OOO0OO.o00oo0
            @Override // o0OOOOO0.oo0ooO, o0OOOo.o0O0OO
            @Nullable
            public Object get() {
                return o0OOo00O.oo0ooO.o00oOOo0(this.receiver);
            }
        } + '@' + o0OOo00O.oo0ooO.o00oOOoO(this);
    }
}
