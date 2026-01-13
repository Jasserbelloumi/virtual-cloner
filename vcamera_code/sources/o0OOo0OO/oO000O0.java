package o0OOo0OO;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO0o.o0O0oo0o;
import o0OO0o.oo0oO0;
import o0OO0oO.o0ooO;
import o0OOO0.o00oo00O;
import o0OOO0.o00oo0OO;
import o0OOOO0o.o00oOoO;
import o0OOo00O.o0O00;
import o0OOo00O.o0OoO00O;
import o0OOo0O0.o0O000;
import o0OOo0Oo.oO00O;
import o0OOo0Oo.oO00OO0O;
import o0OOo0Oo.oO0OO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010 \n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u00014B\u001f\u0012\u0006\u0010K\u001a\u00020\u0016\u0012\u0006\u0010M\u001a\u00020\u0016\u0012\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bp\u0010qJ\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\b\u0010\r\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J9\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00142\u0010\u0010\u0015\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J(\u0010$\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000eH\u0002J\b\u0010%\u001a\u00020\fH\u0002J\u0012\u0010'\u001a\u0004\u0018\u00010\u00112\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0012\u0010*\u001a\u0004\u0018\u00010\u00112\u0006\u0010)\u001a\u00020\u000eH\u0002J\u001b\u0010+\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0003H\u0082@ø\u0001\u0000¢\u0006\u0004\b+\u0010,J3\u0010/\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0014\u0010.\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u0014H\u0002¢\u0006\u0004\b/\u00100J!\u00104\u001a\u0002032\f\u00102\u001a\b\u0012\u0004\u0012\u00028\u000001H\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u0010\nJ\u001b\u00107\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b7\u0010\u001cJ\u000f\u00108\u001a\u00020\u000eH\u0000¢\u0006\u0004\b8\u00109J%\u0010;\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010-0\u00142\u0006\u0010:\u001a\u00020\u000eH\u0000¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0003H\u0014J\u001f\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00142\u0006\u0010>\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010@J\b\u0010A\u001a\u00020\fH\u0016J&\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016R\u0014\u0010K\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010M\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010JR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR \u0010R\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010TR\u0016\u0010Y\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010JR\u0016\u0010[\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010JR\u0014\u0010]\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\\\u00109R\u0014\u0010`\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010b\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\ba\u0010_R\u0014\u0010d\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bc\u00109R\u0014\u0010f\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\be\u00109R\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00028\u00000g8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u001a\u0010o\u001a\u00028\u00008DX\u0084\u0004¢\u0006\f\u0012\u0004\bm\u0010n\u001a\u0004\bk\u0010l\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006r"}, d2 = {"Lo0OOo0OO/oO000O0;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0Oo/oO00O;", "Lo0OOo0OO/oO0Ooooo;", "Lo0OOo0OO/oO00000;", "Lo0OOo0OO/o0OO000o;", "Lo0OOo0Oo/oO0OO00o;", "value", "", "o0O000", "(Ljava/lang/Object;)Z", "o0O000O", "Lo0OO0o/oO0Ooooo;", "o00ooo0", "", "newHead", "o00ooOoO", "", "item", "o00oooO", "", "curBuffer", "", "curSize", "newSize", "o0O0000o", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "o00ooo0o", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0OO/oO000O0$o00oOOo0;", "emitter", "o00ooOOo", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "o0OoOoOO", "o00ooOo0", "slot", "o0O000Oo", "o0OoOoOo", FirebaseAnalytics.Param.INDEX, "o00ooooo", "o00ooOO", "(Lo0OOo0OO/oO0Ooooo;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OO/o00oOo0O;", "resumesIn", "o00oooOO", "([Lo0OO/o00oOo0O;)[Lo0OO/o00oOo0O;", "Lo0OOo0OO/o0OO0;", "collector", "", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", o0OO000o.o00oOOoO.f12961o00oOo00, "emit", "o0O000o", "()J", "oldIndex", "o0O000o0", "(J)[Lo0OO/o00oOo0O;", "o00ooOoo", "size", "o00ooo00", "(I)[Lo0OOo0OO/oO0Ooooo;", "o00oOoO", "Lo0OO/o00oo0;", "context", "capacity", "Lo0OOo0O0/o0O000;", "onBufferOverflow", "Lo0OOo0OO/o0OO00o;", "o00oOooO", "o00oo0o", "I", "replay", "o00oo0oO", "bufferCapacity", "o0O0o", "Lo0OOo0O0/o0O000;", "o00oo", "[Ljava/lang/Object;", "buffer", "o00ooO00", "J", "replayIndex", "o00ooO0", "minCollectorIndex", "o00ooO0O", "bufferSize", "o00ooO0o", "queueSize", "o00oooo0", TtmlNode.TAG_HEAD, "o0O00000", "()I", "replaySize", "o0O0000O", "totalSize", "o00oooOo", "bufferEndIndex", "o0", "queueEndIndex", "", "o00oOo0O", "()Ljava/util/List;", "replayCache", "o00oooo", "()Ljava/lang/Object;", "getLastReplayedLocked$annotations", "()V", "lastReplayedLocked", "<init>", "(IILo0OOo0O0/o0O000;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public class oO000O0<T> extends oO00O<oO0Ooooo> implements oO00000<T>, o0OO000o<T>, oO0OO00o<T> {
    @Nullable

    /* renamed from: o00oo  reason: collision with root package name */
    public Object[] f14460o00oo;

    /* renamed from: o00oo0o  reason: collision with root package name */
    public final int f14461o00oo0o;

    /* renamed from: o00oo0oO  reason: collision with root package name */
    public final int f14462o00oo0oO;

    /* renamed from: o00ooO0  reason: collision with root package name */
    public long f14463o00ooO0;

    /* renamed from: o00ooO00  reason: collision with root package name */
    public long f14464o00ooO00;

    /* renamed from: o00ooO0O  reason: collision with root package name */
    public int f14465o00ooO0O;

    /* renamed from: o00ooO0o  reason: collision with root package name */
    public int f14466o00ooO0o;
    @NotNull

    /* renamed from: o0O0o  reason: collision with root package name */
    public final o0O000 f14467o0O0o;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B3\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lo0OOo0OO/oO000O0$o00oOOo0;", "Lo0OOo00O/o0OOO0OO;", "Lo0OO0o/oO0Ooooo;", o0OO000o.o00oOOoO.f12961o00oOo00, "Lo0OOo0OO/oO000O0;", "o00oo0O0", "Lo0OOo0OO/oO000O0;", "flow", "", "o00oo0O", "J", FirebaseAnalytics.Param.INDEX, "", "o00oo0Oo", "Ljava/lang/Object;", "value", "Lo0OO/o00oOo0O;", "o00oo0o0", "Lo0OO/o00oOo0O;", "cont", "<init>", "(Lo0OOo0OO/oO000O0;JLjava/lang/Object;Lo0OO/o00oOo0O;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 implements o0OOo00O.o0OOO0OO {
        @o00oOoO

        /* renamed from: o00oo0O  reason: collision with root package name */
        public long f14468o00oo0O;
        @o00oOoO
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final oO000O0<?> f14469o00oo0O0;
        @o00oOoO
        @Nullable

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final Object f14470o00oo0Oo;
        @o00oOoO
        @NotNull

        /* renamed from: o00oo0o0  reason: collision with root package name */
        public final o00oOo0O<o0OO0o.oO0Ooooo> f14471o00oo0o0;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(@NotNull oO000O0<?> oo000o0, long j, @Nullable Object obj, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            this.f14469o00oo0O0 = oo000o0;
            this.f14468o00oo0O = j;
            this.f14470o00oo0Oo = obj;
            this.f14471o00oo0o0 = o00ooo0o2;
        }

        @Override // o0OOo00O.o0OOO0OO
        public void o00oOOoO() {
            this.f14469o00oo0O0.o00ooOOo(this);
        }
    }

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class o00oOOoO {

        /* renamed from: o00oOOo0  reason: collision with root package name */
        public static final /* synthetic */ int[] f14472o00oOOo0;

        static {
            int[] iArr = new int[o0O000.values().length];
            iArr[o0O000.SUSPEND.ordinal()] = 1;
            iArr[o0O000.DROP_LATEST.ordinal()] = 2;
            iArr[o0O000.DROP_OLDEST.ordinal()] = 3;
            f14472o00oOOo0 = iArr;
        }
    }

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o00oo00O(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {373, 380, 383}, m = "collect$suspendImpl", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "this", "collector", "slot", "collectorJob"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    /* loaded from: classes3.dex */
    public static final class o00oOo00 extends o0OOO0.o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;
        public final /* synthetic */ oO000O0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOo00(oO000O0<T> oo000o0, o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(o00ooo0o2);
            this.this$0 = oo000o0;
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return oO000O0.o00ooOo(this.this$0, null, this);
        }
    }

    public oO000O0(int i, int i2, @NotNull o0O000 o0o000) {
        this.f14461o00oo0o = i;
        this.f14462o00oo0oO = i2;
        this.f14467o0O0o = o0o000;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:41|42))(1:43)|12|13|14|15|(3:16|(3:28|29|(2:31|32)(1:33))(4:18|(1:20)|21|(2:23|24)(1:26))|27))(4:44|45|46|47)|37|38)(5:53|54|55|(2:57|(1:59))|61)|48|49|15|(3:16|(0)(0)|27)))|64|6|(0)(0)|48|49|15|(3:16|(0)(0)|27)) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d1, code lost:
        r5 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object o00ooOo(o0OOo0OO.oO000O0 r8, o0OOo0OO.o0OO0 r9, o0OO.o00oOo0O r10) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.oO000O0.o00ooOo(o0OOo0OO.oO000O0, o0OOo0OO.o0OO0, o0OO.o00oOo0O):java.lang.Object");
    }

    public static Object o00ooo0O(oO000O0 oo000o0, Object obj, o00oOo0O o00ooo0o2) {
        Object o00ooo0o3;
        return (!oo000o0.o00oOOoO(obj) && (o00ooo0o3 = oo000o0.o00ooo0o(obj, o00ooo0o2)) == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED) ? o00ooo0o3 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long o00oooo0() {
        return Math.min(this.f14463o00ooO0, this.f14464o00ooO00);
    }

    public static /* synthetic */ void o00ooooO() {
    }

    @Override // o0OOo0OO.oO00000, o0OOo0OO.o0OO0
    @Nullable
    public Object emit(T t, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        return o00ooo0O(this, t, o00ooo0o2);
    }

    public final long o0() {
        return o00oooo0() + this.f14465o00ooO0O + this.f14466o00ooO0o;
    }

    @Override // o0OOo0OO.oO000, o0OOo0OO.o0OO00o
    @Nullable
    public Object o00oOOo0(@NotNull o0OO0<? super T> o0oo0, @NotNull o00oOo0O<?> o00ooo0o2) {
        return o00ooOo(this, o0oo0, o00ooo0o2);
    }

    @Override // o0OOo0OO.oO00000
    public boolean o00oOOoO(T t) {
        int i;
        boolean z;
        o00oOo0O<o0OO0o.oO0Ooooo>[] o00ooo0oArr = oO00OO0O.f14521o00oOOo0;
        synchronized (this) {
            if (o0O000(t)) {
                o00ooo0oArr = o00oooOO(o00ooo0oArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (o00oOo0O<o0OO0o.oO0Ooooo> o00ooo0o2 : o00ooo0oArr) {
            if (o00ooo0o2 != null) {
                oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
                o00ooo0o2.resumeWith(o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0));
            }
        }
        return z;
    }

    @Override // o0OOo0OO.oO000
    @NotNull
    public List<T> o00oOo0O() {
        synchronized (this) {
            int o0O000002 = o0O00000();
            if (o0O000002 == 0) {
                return o0ooO.INSTANCE;
            }
            ArrayList arrayList = new ArrayList(o0O000002);
            Object[] objArr = this.f14460o00oo;
            o0OOOOO0.o0ooO.o00oo00O(objArr);
            for (int i = 0; i < o0O000002; i++) {
                arrayList.add(oO000O0O.o00oOo00(objArr, this.f14464o00ooO00 + i));
            }
            return arrayList;
        }
    }

    @Override // o0OOo0OO.oO00000
    public void o00oOoO() {
        synchronized (this) {
            o0OoOoOO(o00oooOo(), this.f14463o00ooO0, o00oooOo(), o0());
            o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    @Override // o0OOo0Oo.oO0OO00o
    @NotNull
    public o0OO00o<T> o00oOooO(@NotNull o00oo0 o00oo0Var, int i, @NotNull o0O000 o0o000) {
        return oO000O0O.o00oOo0O(this, o00oo0Var, i, o0o000);
    }

    public final Object o00ooOO(oO0Ooooo oo0ooooo, o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        o0OO0o.oO0Ooooo oo0ooooo2;
        o0O00 o0o00 = new o0O00(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2), 1);
        o0o00.o00ooo00();
        synchronized (this) {
            if (o0OoOoOo(oo0ooooo) < 0) {
                oo0ooooo.f14493o00oOOoO = o0o00;
            } else {
                oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
                o0o00.resumeWith(o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0));
            }
            oo0ooooo2 = o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
        Object o00ooO002 = o0o00.o00ooO00();
        o0OOO00o.o00oOOo0 o00oooo03 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        if (o00ooO002 == o00oooo03) {
            o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002 == o00oooo03 ? o00ooO002 : oo0ooooo2;
    }

    public final void o00ooOOo(o00oOOo0 o00oooo02) {
        synchronized (this) {
            if (o00oooo02.f14468o00oo0O < o00oooo0()) {
                return;
            }
            Object[] objArr = this.f14460o00oo;
            o0OOOOO0.o0ooO.o00oo00O(objArr);
            if (oO000O0O.o00oOo00(objArr, o00oooo02.f14468o00oo0O) != o00oooo02) {
                return;
            }
            oO000O0O.o00oOoO(objArr, o00oooo02.f14468o00oo0O, oO000O0O.f14473o00oOOo0);
            o00ooOo0();
            o0OO0o.oO0Ooooo oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    public final void o00ooOo0() {
        if (this.f14462o00oo0oO != 0 || this.f14466o00ooO0o > 1) {
            Object[] objArr = this.f14460o00oo;
            o0OOOOO0.o0ooO.o00oo00O(objArr);
            while (this.f14466o00ooO0o > 0 && oO000O0O.o00oOo00(objArr, (o00oooo0() + o0O0000O()) - 1) == oO000O0O.f14473o00oOOo0) {
                this.f14466o00ooO0o--;
                oO000O0O.o00oOoO(objArr, o00oooo0() + o0O0000O(), null);
            }
        }
    }

    public final void o00ooOoO(long j) {
        Object[] objArr;
        if (this.f14517o00oo0O != 0 && (objArr = this.f14518o00oo0O0) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    oO0Ooooo oo0ooooo = (oO0Ooooo) obj;
                    long j2 = oo0ooooo.f14492o00oOOo0;
                    if (j2 >= 0 && j2 < j) {
                        oo0ooooo.f14492o00oOOo0 = j;
                    }
                }
            }
        }
        this.f14463o00ooO0 = j;
    }

    @Override // o0OOo0Oo.oO00O
    @NotNull
    /* renamed from: o00ooOoo */
    public oO0Ooooo o00oOoo0() {
        return new oO0Ooooo();
    }

    public final void o00ooo0() {
        Object[] objArr = this.f14460o00oo;
        o0OOOOO0.o0ooO.o00oo00O(objArr);
        oO000O0O.o00oOooO(objArr, o00oooo0(), null);
        this.f14465o00ooO0O--;
        long o00oooo02 = o00oooo0() + 1;
        if (this.f14464o00ooO00 < o00oooo02) {
            this.f14464o00ooO00 = o00oooo02;
        }
        if (this.f14463o00ooO0 < o00oooo02) {
            o00ooOoO(o00oooo02);
        }
    }

    @Override // o0OOo0Oo.oO00O
    @NotNull
    /* renamed from: o00ooo00 */
    public oO0Ooooo[] o00oOooo(int i) {
        return new oO0Ooooo[i];
    }

    public final Object o00ooo0o(T t, o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        o00oOo0O<o0OO0o.oO0Ooooo>[] o00ooo0oArr;
        o00oOOo0 o00oooo02;
        o0O00 o0o00 = new o0O00(o0OOO00o.o00oOo00.o00oOooO(o00ooo0o2), 1);
        o0o00.o00ooo00();
        o00oOo0O<o0OO0o.oO0Ooooo>[] o00ooo0oArr2 = oO00OO0O.f14521o00oOOo0;
        synchronized (this) {
            if (o0O000(t)) {
                oo0oO0.o00oOOo0 o00oooo03 = o0OO0o.oo0oO0.Companion;
                o0o00.resumeWith(o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0));
                o00ooo0oArr = o00oooOO(o00ooo0oArr2);
                o00oooo02 = null;
            } else {
                o00oOOo0 o00oooo04 = new o00oOOo0(this, o0O0000O() + o00oooo0(), t, o0o00);
                o00oooO(o00oooo04);
                this.f14466o00ooO0o++;
                if (this.f14462o00oo0oO == 0) {
                    o00ooo0oArr2 = o00oooOO(o00ooo0oArr2);
                }
                o00ooo0oArr = o00ooo0oArr2;
                o00oooo02 = o00oooo04;
            }
        }
        if (o00oooo02 != null) {
            o0OoO00O.o00oOOo0(o0o00, o00oooo02);
        }
        for (o00oOo0O<o0OO0o.oO0Ooooo> o00ooo0o3 : o00ooo0oArr) {
            if (o00ooo0o3 != null) {
                oo0oO0.o00oOOo0 o00oooo05 = o0OO0o.oo0oO0.Companion;
                o00ooo0o3.resumeWith(o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0));
            }
        }
        Object o00ooO002 = o0o00.o00ooO00();
        o0OOO00o.o00oOOo0 o00oooo06 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
        if (o00ooO002 == o00oooo06) {
            o00oo0OO.o00oOo00(o00ooo0o2);
        }
        return o00ooO002 == o00oooo06 ? o00ooO002 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }

    public final void o00oooO(Object obj) {
        int o0O0000O2 = o0O0000O();
        Object[] objArr = this.f14460o00oo;
        if (objArr == null) {
            objArr = o0O0000o(null, 0, 2);
        } else if (o0O0000O2 >= objArr.length) {
            objArr = o0O0000o(objArr, o0O0000O2, objArr.length * 2);
        }
        oO000O0O.o00oOooO(objArr, o00oooo0() + o0O0000O2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final o00oOo0O<o0OO0o.oO0Ooooo>[] o00oooOO(o00oOo0O<o0OO0o.oO0Ooooo>[] o00ooo0oArr) {
        Object[] objArr;
        oO0Ooooo oo0ooooo;
        o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2;
        int length = o00ooo0oArr.length;
        if (this.f14517o00oo0O != 0 && (objArr = this.f14518o00oo0O0) != null) {
            int i = 0;
            int length2 = objArr.length;
            o00ooo0oArr = o00ooo0oArr;
            while (i < length2) {
                Object obj = objArr[i];
                if (obj != null && (o00ooo0o2 = (oo0ooooo = (oO0Ooooo) obj).f14493o00oOOoO) != null && o0OoOoOo(oo0ooooo) >= 0) {
                    int length3 = o00ooo0oArr.length;
                    o00ooo0oArr = o00ooo0oArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(o00ooo0oArr, Math.max(2, o00ooo0oArr.length * 2));
                        o0OOOOO0.o0ooO.o00oo0OO(copyOf, "copyOf(this, newSize)");
                        o00ooo0oArr = copyOf;
                    }
                    o00ooo0oArr[length] = o00ooo0o2;
                    oo0ooooo.f14493o00oOOoO = null;
                    length++;
                }
                i++;
                o00ooo0oArr = o00ooo0oArr;
            }
        }
        return o00ooo0oArr;
    }

    public final long o00oooOo() {
        return o00oooo0() + this.f14465o00ooO0O;
    }

    public final T o00oooo() {
        Object[] objArr = this.f14460o00oo;
        o0OOOOO0.o0ooO.o00oo00O(objArr);
        return (T) oO000O0O.o00oOo00(objArr, (this.f14464o00ooO00 + o0O00000()) - 1);
    }

    public final Object o00ooooo(long j) {
        Object[] objArr = this.f14460o00oo;
        o0OOOOO0.o0ooO.o00oo00O(objArr);
        Object o00oOo002 = oO000O0O.o00oOo00(objArr, j);
        return o00oOo002 instanceof o00oOOo0 ? ((o00oOOo0) o00oOo002).f14470o00oo0Oo : o00oOo002;
    }

    public final boolean o0O000(T t) {
        if (o00oo0OO() == 0) {
            return o0O000O(t);
        }
        if (this.f14465o00ooO0O >= this.f14462o00oo0oO && this.f14463o00ooO0 <= this.f14464o00ooO00) {
            int i = o00oOOoO.f14472o00oOOo0[this.f14467o0O0o.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
        }
        o00oooO(t);
        int i2 = this.f14465o00ooO0O + 1;
        this.f14465o00ooO0O = i2;
        if (i2 > this.f14462o00oo0oO) {
            o00ooo0();
        }
        if (o0O00000() > this.f14461o00oo0o) {
            o0OoOoOO(this.f14464o00ooO00 + 1, this.f14463o00ooO0, o00oooOo(), o0());
        }
        return true;
    }

    public final int o0O00000() {
        return (int) ((o00oooo0() + this.f14465o00ooO0O) - this.f14464o00ooO00);
    }

    public final int o0O0000O() {
        return this.f14465o00ooO0O + this.f14466o00ooO0o;
    }

    public final Object[] o0O0000o(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.f14460o00oo = objArr2;
            if (objArr == null) {
                return objArr2;
            }
            long o00oooo02 = o00oooo0();
            for (int i3 = 0; i3 < i; i3++) {
                long j = i3 + o00oooo02;
                oO000O0O.o00oOoO(objArr2, j, oO000O0O.o00oOo00(objArr, j));
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow".toString());
    }

    public final boolean o0O000O(T t) {
        if (this.f14461o00oo0o == 0) {
            return true;
        }
        o00oooO(t);
        int i = this.f14465o00ooO0O + 1;
        this.f14465o00ooO0O = i;
        if (i > this.f14461o00oo0o) {
            o00ooo0();
        }
        this.f14463o00ooO0 = o00oooo0() + this.f14465o00ooO0O;
        return true;
    }

    public final Object o0O000Oo(oO0Ooooo oo0ooooo) {
        Object obj;
        o00oOo0O<o0OO0o.oO0Ooooo>[] o00ooo0oArr = oO00OO0O.f14521o00oOOo0;
        synchronized (this) {
            long o0OoOoOo2 = o0OoOoOo(oo0ooooo);
            if (o0OoOoOo2 < 0) {
                obj = oO000O0O.f14473o00oOOo0;
            } else {
                long j = oo0ooooo.f14492o00oOOo0;
                Object o00ooooo2 = o00ooooo(o0OoOoOo2);
                oo0ooooo.f14492o00oOOo0 = o0OoOoOo2 + 1;
                o00ooo0oArr = o0O000o0(j);
                obj = o00ooooo2;
            }
        }
        for (o00oOo0O<o0OO0o.oO0Ooooo> o00ooo0o2 : o00ooo0oArr) {
            if (o00ooo0o2 != null) {
                oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
                o00ooo0o2.resumeWith(o0OO0o.oo0oO0.m7constructorimpl(o0OO0o.oO0Ooooo.f13240o00oOOo0));
            }
        }
        return obj;
    }

    public final long o0O000o() {
        long j = this.f14464o00ooO00;
        if (j < this.f14463o00ooO0) {
            this.f14463o00ooO0 = j;
        }
        return j;
    }

    @NotNull
    public final o00oOo0O<o0OO0o.oO0Ooooo>[] o0O000o0(long j) {
        long j2;
        long j3;
        long j4;
        Object[] objArr;
        if (j > this.f14463o00ooO0) {
            return oO00OO0O.f14521o00oOOo0;
        }
        long o00oooo02 = o00oooo0();
        long j5 = this.f14465o00ooO0O + o00oooo02;
        if (this.f14462o00oo0oO == 0 && this.f14466o00ooO0o > 0) {
            j5++;
        }
        if (this.f14517o00oo0O != 0 && (objArr = this.f14518o00oo0O0) != null) {
            for (Object obj : objArr) {
                if (obj != null) {
                    long j6 = ((oO0Ooooo) obj).f14492o00oOOo0;
                    if (j6 >= 0 && j6 < j5) {
                        j5 = j6;
                    }
                }
            }
        }
        if (j5 <= this.f14463o00ooO0) {
            return oO00OO0O.f14521o00oOOo0;
        }
        long o00oooOo2 = o00oooOo();
        int min = o00oo0OO() > 0 ? Math.min(this.f14466o00ooO0o, this.f14462o00oo0oO - ((int) (o00oooOo2 - j5))) : this.f14466o00ooO0o;
        o00oOo0O<o0OO0o.oO0Ooooo>[] o00ooo0oArr = oO00OO0O.f14521o00oOOo0;
        long j7 = this.f14466o00ooO0o + o00oooOo2;
        if (min > 0) {
            o00ooo0oArr = new o00oOo0O[min];
            Object[] objArr2 = this.f14460o00oo;
            o0OOOOO0.o0ooO.o00oo00O(objArr2);
            long j8 = o00oooOo2;
            int i = 0;
            while (true) {
                if (o00oooOo2 >= j7) {
                    j2 = j5;
                    j3 = j7;
                    break;
                }
                Object o00oOo002 = oO000O0O.o00oOo00(objArr2, o00oooOo2);
                j2 = j5;
                o0OOo0o0.oO0o0o oo0o0o = oO000O0O.f14473o00oOOo0;
                if (o00oOo002 == oo0o0o) {
                    j3 = j7;
                    j4 = 1;
                } else if (o00oOo002 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                } else {
                    o00oOOo0 o00oooo03 = (o00oOOo0) o00oOo002;
                    int i2 = i + 1;
                    j3 = j7;
                    o00ooo0oArr[i] = o00oooo03.f14471o00oo0o0;
                    oO000O0O.o00oOoO(objArr2, o00oooOo2, oo0o0o);
                    oO000O0O.o00oOoO(objArr2, j8, o00oooo03.f14470o00oo0Oo);
                    j4 = 1;
                    j8++;
                    if (i2 >= min) {
                        break;
                    }
                    i = i2;
                }
                o00oooOo2 += j4;
                j5 = j2;
                j7 = j3;
            }
            o00oooOo2 = j8;
        } else {
            j2 = j5;
            j3 = j7;
        }
        int i3 = (int) (o00oooOo2 - o00oooo02);
        long j9 = o00oo0OO() == 0 ? o00oooOo2 : j2;
        long max = Math.max(this.f14464o00ooO00, o00oooOo2 - Math.min(this.f14461o00oo0o, i3));
        if (this.f14462o00oo0oO == 0 && max < j3) {
            Object[] objArr3 = this.f14460o00oo;
            o0OOOOO0.o0ooO.o00oo00O(objArr3);
            if (o0OOOOO0.o0ooO.o00oOoO0(oO000O0O.o00oOo00(objArr3, max), oO000O0O.f14473o00oOOo0)) {
                o00oooOo2++;
                max++;
            }
        }
        o0OoOoOO(max, j9, o00oooOo2, j3);
        o00ooOo0();
        return (o00ooo0oArr.length == 0) ^ true ? o00oooOO(o00ooo0oArr) : o00ooo0oArr;
    }

    public final void o0OoOoOO(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long o00oooo02 = o00oooo0(); o00oooo02 < min; o00oooo02++) {
            Object[] objArr = this.f14460o00oo;
            o0OOOOO0.o0ooO.o00oo00O(objArr);
            oO000O0O.o00oOooO(objArr, o00oooo02, null);
        }
        this.f14464o00ooO00 = j;
        this.f14463o00ooO0 = j2;
        this.f14465o00ooO0O = (int) (j3 - min);
        this.f14466o00ooO0o = (int) (j4 - j3);
    }

    public final long o0OoOoOo(oO0Ooooo oo0ooooo) {
        long j = oo0ooooo.f14492o00oOOo0;
        if (j < o00oooOo()) {
            return j;
        }
        if (this.f14462o00oo0oO <= 0 && j <= o00oooo0() && this.f14466o00ooO0o != 0) {
            return j;
        }
        return -1L;
    }
}
