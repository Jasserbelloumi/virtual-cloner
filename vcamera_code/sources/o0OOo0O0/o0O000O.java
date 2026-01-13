package o0OOo0O0;

import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.o0OO000;
import o0OOo0O0.o0O0OO;
import o0OOo0O0.o0OooO0;
import o0OOo0o0.oO000OOo;
import o0OOo0oo.oO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lo0OOo0O0/o0O000O;", "E", "Lo0OOo0O0/o0OooO0;", "Lo0OOo0O0/o0O0OO;", "o00oOoOO", o0OO000o.o00oOOoO.f12961o00oOo00, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface o0O000O<E> extends o0OooO0<E>, o0O0OO<E> {
    @NotNull

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static final o00oOOoO f14273o00oOoOO = o00oOOoO.f14280o00oOOo0;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static final int f14274o00oOoOo = Integer.MAX_VALUE;

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final int f14275o00oOoo0 = 0;

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final int f14276o00oOooo = -1;

    /* renamed from: o00oo0  reason: collision with root package name */
    public static final int f14277o00oo0 = -3;

    /* renamed from: o00oo00O  reason: collision with root package name */
    public static final int f14278o00oo00O = -2;
    @NotNull

    /* renamed from: o00oo0OO  reason: collision with root package name */
    public static final String f14279o00oo0OO = "kotlinx.coroutines.channels.defaultBuffer";

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 {
        @NotNull
        public static <E> oO<E> o00oOOoO(@NotNull o0O000O<E> o0o000o) {
            return new o0O0OO.o00oOOo0.C0181o00oOOo0(o0o000o);
        }

        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @o0OO000(expression = "trySend(element).isSuccess", imports = {}))
        public static <E> boolean o00oOo00(@NotNull o0O000O<E> o0o000o, E e) {
            return o0OooO0.o00oOOo0.o00oOo00(o0o000o, e);
        }

        @o0OOO0OO.o00oo0OO
        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @o0OO000(expression = "receiveCatching().getOrNull()", imports = {}))
        @Nullable
        public static <E> Object o00oOo0O(@NotNull o0O000O<E> o0o000o, @NotNull o00oOo0O<? super E> o00ooo0o2) {
            return o0O0OO.o00oOOo0.o00oOoOO(o0o000o, o00ooo0o2);
        }

        @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @o0OO000(expression = "tryReceive().getOrNull()", imports = {}))
        @Nullable
        public static <E> E o00oOooO(@NotNull o0O000O<E> o0o000o) {
            return (E) o0O0OO.o00oOOo0.o00oOoO(o0o000o);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lo0OOo0O0/o0O000O$o00oOOoO;", "", "", o0OO000o.o00oOOoO.f12961o00oOo00, "I", "UNLIMITED", "o00oOo00", "RENDEZVOUS", "o00oOooO", "CONFLATED", "o00oOo0O", "BUFFERED", "o00oOo0o", "OPTIONAL_CHANNEL", "", "o00oOoO0", "Ljava/lang/String;", "DEFAULT_BUFFER_PROPERTY_NAME", "o00oOoO", "o00oOOo0", "()I", "CHANNEL_DEFAULT_CAPACITY", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO {

        /* renamed from: o00oOOoO  reason: collision with root package name */
        public static final int f14281o00oOOoO = Integer.MAX_VALUE;

        /* renamed from: o00oOo00  reason: collision with root package name */
        public static final int f14282o00oOo00 = 0;

        /* renamed from: o00oOo0O  reason: collision with root package name */
        public static final int f14283o00oOo0O = -2;

        /* renamed from: o00oOo0o  reason: collision with root package name */
        public static final int f14284o00oOo0o = -3;
        @NotNull

        /* renamed from: o00oOoO0  reason: collision with root package name */
        public static final String f14286o00oOoO0 = "kotlinx.coroutines.channels.defaultBuffer";

        /* renamed from: o00oOooO  reason: collision with root package name */
        public static final int f14287o00oOooO = -1;

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ o00oOOoO f14280o00oOOo0 = new o00oOOoO();

        /* renamed from: o00oOoO  reason: collision with root package name */
        public static final int f14285o00oOoO = oO000OOo.o00oOOo0("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        public final int o00oOOo0() {
            return f14285o00oOoO;
        }
    }
}
