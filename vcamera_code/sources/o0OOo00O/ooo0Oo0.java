package o0OOo00O;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO000o.o00oOOoO;
import org.jetbrains.annotations.NotNull;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u001a\u0010\n\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\r\"\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\r\"\u0014\u0010\u0013\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012\"\u001a\u0010\u001a\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0007\u0012\u0004\b\u0019\u0010\t*\u001e\b\u0002\u0010\u001d\u001a\u0004\b\u0000\u0010\u001b\"\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\u0012\u0004\u0012\u00028\u00000\u001c¨\u0006\u001e"}, d2 = {"", "timeMillis", "o00oOooO", "timeNanos", "o00oOo00", "Lo0OOo0o0/oO0o0o;", "o00oOOo0", "Lo0OOo0o0/oO0o0o;", "getDISPOSED_TASK$annotations", "()V", "DISPOSED_TASK", "", o00oOOoO.f12961o00oOo00, "I", "SCHEDULE_OK", "SCHEDULE_COMPLETED", "SCHEDULE_DISPOSED", "o00oOo0O", "J", "MS_TO_NS", "o00oOo0o", "MAX_MS", "o00oOoO0", "MAX_DELAY_NS", "o00oOoO", "getCLOSED_EMPTY$annotations", "CLOSED_EMPTY", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0o0/o0OOOO;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class ooo0Oo0 {

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final int f14139o00oOOoO = 0;

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final int f14140o00oOo00 = 1;

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final long f14141o00oOo0O = 1000000;

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final long f14142o00oOo0o = 9223372036854L;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final long f14144o00oOoO0 = 4611686018427387903L;

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static final int f14145o00oOooO = 2;
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0OOo0o0.oO0o0o f14138o00oOOo0 = new o0OOo0o0.oO0o0o("REMOVED_TASK");
    @NotNull

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final o0OOo0o0.oO0o0o f14143o00oOoO = new o0OOo0o0.oO0o0o("CLOSED_EMPTY");

    public static final long o00oOo00(long j) {
        return j / 1000000;
    }

    public static /* synthetic */ void o00oOo0O() {
    }

    public static /* synthetic */ void o00oOo0o() {
    }

    public static final long o00oOooO(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= f14142o00oOo0o) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
