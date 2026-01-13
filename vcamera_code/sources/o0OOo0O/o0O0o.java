package o0OOo0O;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import o0O0Oooo.oooOO0;
import o0OO0o.o0O0o00;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0oO0;
import o0OO0o.oo0ooO;
import o0OO0oO.o0O000O;
import o0OO0oO.o0O00O;
import o0OO0oO.o0O0oo0o;
import o0OO0oO.oo0oO0;
import o0OO0ooO.o0O0o00O;
import o0OOOOO0.o0O0OO;
import o0OOOOO0.o0OOO0OO;
import o0OOOOO0.o0ooO;
import o0OOOoo0.oO0O00o0;
import o0OOOoo0.oOo0000O;
import o0OOOoo0.oOo0oooO;
import o0OOo00O.o0O0o000;
import o0OOo00O.o0oOo0O0;
import o0OOo00O.oO00O0o0;
import o0OOo00O.oOo00OO0;
import o0OOo00O.ooOOOOoo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0098\u0001B\n\b\u0002¢\u0006\u0005\b\u0097\u0001\u0010\bJ\u001d\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ;\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0015*\u00020\u00012\u001e\b\u0004\u0010\u0019\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00028\u00000\u0016H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u0011*\u00020\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b'\u0010(J5\u0010-\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010)\u001a\u00020\u00112\b\u0010+\u001a\u0004\u0018\u00010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b-\u0010.J?\u00104\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/032\u0006\u00100\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b4\u00105J3\u00107\u001a\u00020/2\u0006\u00106\u001a\u00020/2\f\u00102\u001a\b\u0012\u0004\u0012\u00020%012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010:\u001a\u00020=2\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\b>\u0010?J\u0016\u0010@\u001a\u0004\u0018\u00010=*\u00020=H\u0082\u0010¢\u0006\u0004\b@\u0010AJ/\u0010C\u001a\u00020\u00042\n\u0010B\u001a\u0006\u0012\u0002\b\u00030\u00172\n\u0010:\u001a\u0006\u0012\u0002\b\u0003092\u0006\u0010)\u001a\u00020\u0011H\u0002¢\u0006\u0004\bC\u0010DJ\u001d\u0010E\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u0006\u0012\u0002\b\u000309H\u0002¢\u0006\u0004\bE\u0010FJ\u001a\u0010G\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0017*\u00020=H\u0082\u0010¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u0004\u0018\u00010I*\b\u0012\u0004\u0012\u00020%0\u001aH\u0002¢\u0006\u0004\bJ\u0010KJ3\u0010N\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u0000092\b\u0010:\u001a\u0004\u0018\u00010IH\u0002¢\u0006\u0004\bN\u0010OJ\u001b\u0010P\u001a\u00020\u00042\n\u0010B\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0002¢\u0006\u0004\bP\u0010QJ'\u0010T\u001a\b\u0012\u0004\u0012\u00020%0\u001a\"\b\b\u0000\u0010L*\u00020R2\u0006\u0010S\u001a\u00028\u0000H\u0002¢\u0006\u0004\bT\u0010UJ\r\u0010V\u001a\u00020\u0004¢\u0006\u0004\bV\u0010\bJ\r\u0010W\u001a\u00020\u0004¢\u0006\u0004\bW\u0010\bJ\u0015\u0010Y\u001a\u00020\u00112\u0006\u0010X\u001a\u00020\n¢\u0006\u0004\bY\u0010ZJ\u0013\u0010[\u001a\b\u0012\u0004\u0012\u00020\u000101¢\u0006\u0004\b[\u0010\\J\u0015\u0010_\u001a\u00020\u00112\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J\u0013\u0010a\u001a\b\u0012\u0004\u0012\u00020]0\u001a¢\u0006\u0004\ba\u0010bJ\u0013\u0010d\u001a\b\u0012\u0004\u0012\u00020c0\u001a¢\u0006\u0004\bd\u0010bJ\u0015\u0010e\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\be\u0010$J)\u0010f\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u0010^\u001a\u00020]2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020%0\u001a¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bh\u0010iJ\u001b\u0010j\u001a\u00020\u00042\n\u0010:\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bj\u0010iJ)\u0010k\u001a\b\u0012\u0004\u0012\u00028\u000009\"\u0004\b\u0000\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0000¢\u0006\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010u\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010tR$\u0010x\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0017\u0012\u0004\u0012\u00020\u00030v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010wR\u0016\u0010y\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010}\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010|R&\u0010\u0083\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b\u001b\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R'\u0010\u0086\u0001\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b#\u0010~\u001a\u0006\b\u0084\u0001\u0010\u0080\u0001\"\u0006\b\u0085\u0001\u0010\u0082\u0001R$\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010\u0087\u0001R!\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020\f0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010wR\"\u0010\u008d\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u008a\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\"\u0010\u0091\u0001\u001a\u00020\u0011*\u00020\n8BX\u0082\u0004¢\u0006\u000f\u0012\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u008e\u0001\u0010ZR\u001b\u0010\u0094\u0001\u001a\u00020\u0003*\u00020%8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0017\u0010\u0096\u0001\u001a\u00020\u00038@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0080\u0001¨\u0006\u0099\u0001"}, d2 = {"Lo0OOo0O/o0O0o;", "", "Lkotlin/Function1;", "", "Lo0OO0o/oO0Ooooo;", "o00oo0o", "()Lo0OOOO/o00oo;", "o00ooo0o", "()V", "o00oooO", "Lo0OOo00O/ooOOOOoo;", "", "Lo0OOo0O/o00oo0O0;", "map", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "indent", "o00oOooO", "(Lo0OOo00O/ooOOOOoo;Ljava/util/Map;Ljava/lang/StringBuilder;Ljava/lang/String;)V", "R", "Lkotlin/Function2;", "Lo0OOo0O/o0O0o$o00oOOo0;", "Lo0OO/o00oo0;", "create", "", "o00oOoOO", "(Lo0OOOO/o0O00000;)Ljava/util/List;", "o00oooOo", "(Ljava/lang/Object;)Ljava/lang/String;", "o00ooO0", "(Lo0OOo0O/o0O0o$o00oOOo0;)Z", "Ljava/io/PrintStream;", "out", "o00oOoOo", "(Ljava/io/PrintStream;)V", "Ljava/lang/StackTraceElement;", "frames", "o00ooOO", "(Ljava/io/PrintStream;Ljava/util/List;)V", "state", "Ljava/lang/Thread;", "thread", "coroutineTrace", "o00oo0", "(Ljava/lang/String;Ljava/lang/Thread;Ljava/util/List;)Ljava/util/List;", "", "indexOfResumeWith", "", "actualTrace", "Lo0OO0o/o0O0o00;", "o00oo0OO", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)Lo0OO0o/o0O0o00;", "frameIndex", "o00oo0O0", "(I[Ljava/lang/StackTraceElement;Ljava/util/List;)I", "Lo0OO/o00oOo0O;", "frame", "o00ooooO", "(Lo0OO/o00oOo0O;Ljava/lang/String;)V", "Lo0OOO0/o00oOoO;", "o00oooo", "(Lo0OOO0/o00oOoO;Ljava/lang/String;)V", "o00ooOoo", "(Lo0OOO0/o00oOoO;)Lo0OOO0/o00oOoO;", "owner", "o00ooooo", "(Lo0OOo0O/o0O0o$o00oOOo0;Lo0OO/o00oOo0O;Ljava/lang/String;)V", "o00ooO", "(Lo0OO/o00oOo0O;)Lo0OOo0O/o0O0o$o00oOOo0;", "o00ooOO0", "(Lo0OOO0/o00oOoO;)Lo0OOo0O/o0O0o$o00oOOo0;", "Lo0OOo0O/o0O0000O;", "o00oooOO", "(Ljava/util/List;)Lo0OOo0O/o0O0000O;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "completion", "o00oOo0O", "(Lo0OO/o00oOo0O;Lo0OOo0O/o0O0000O;)Lo0OO/o00oOo0O;", "o00ooOOo", "(Lo0OOo0O/o0O0o$o00oOOo0;)V", "", "throwable", "o00ooo00", "(Ljava/lang/Throwable;)Ljava/util/List;", "o00ooO00", "o00oooo0", "job", "o00oo", "(Lo0OOo00O/ooOOOOoo;)Ljava/lang/String;", "o00oOoO", "()[Ljava/lang/Object;", "Lo0OOo0O/o00oo0OO;", "info", "o00oo00O", "(Lo0OOo0O/o00oo0OO;)Ljava/lang/String;", "o00oOoO0", "()Ljava/util/List;", "Lo0OOo0O/o00ooO;", "o00oOoo0", "o00oOo0o", "o00oOooo", "(Lo0OOo0O/o00oo0OO;Ljava/util/List;)Ljava/util/List;", "o00ooOo", "(Lo0OO/o00oOo0O;)V", "o00ooOoO", "o00ooOo0", "(Lo0OO/o00oOo0O;)Lo0OO/o00oOo0O;", o0OO000o.o00oOOoO.f12961o00oOo00, "Ljava/lang/String;", "ARTIFICIAL_FRAME_MESSAGE", "Ljava/text/SimpleDateFormat;", "o00oOo00", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/lang/Thread;", "weakRefCleanerThread", "Lo0OOo0O/o00oo00O;", "Lo0OOo0O/o00oo00O;", "capturedCoroutinesMap", "installations", "I", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "coroutineStateLock", "Z", "o0O0o", "()Z", "o00ooo0O", "(Z)V", "sanitizeStackTraces", "o00oo0oO", "o00ooo0", "enableCreationStackTraces", "Lo0OOOO/o00oo;", "dynamicAttach", "callerInfoCache", "", "o00oo0O", "()Ljava/util/Set;", "capturedCoroutines", "o00oo0Oo", "getDebugString$annotations", "(Lo0OOo00O/ooOOOOoo;)V", "debugString", "o00ooO0o", "(Ljava/lang/StackTraceElement;)Z", "isInternalMethod", "o00ooO0O", "isInstalled", "<init>", "o00oOOo0", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o0O0o {
    private static volatile int installations = 0;
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public static final o0O0o f14206o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public static final String f14207o00oOOoO = "Coroutine creation stacktrace";
    @NotNull

    /* renamed from: o00oOo00  reason: collision with root package name */
    public static final SimpleDateFormat f14208o00oOo00;
    @NotNull

    /* renamed from: o00oOo0O  reason: collision with root package name */
    public static final o0OOo0O.o00oo00O<o00oOOo0<?>, Boolean> f14209o00oOo0O;
    @NotNull

    /* renamed from: o00oOo0o  reason: collision with root package name */
    public static final /* synthetic */ o00oo f14210o00oOo0o;
    @NotNull

    /* renamed from: o00oOoO  reason: collision with root package name */
    public static final ReentrantReadWriteLock f14211o00oOoO;

    /* renamed from: o00oOoO0  reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14212o00oOoO0;

    /* renamed from: o00oOoOO  reason: collision with root package name */
    public static boolean f14213o00oOoOO;

    /* renamed from: o00oOoOo  reason: collision with root package name */
    public static boolean f14214o00oOoOo;
    @Nullable

    /* renamed from: o00oOoo0  reason: collision with root package name */
    public static final o0OOOO.o00oo<Boolean, oO0Ooooo> f14215o00oOoo0;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public static Thread f14216o00oOooO;
    @NotNull

    /* renamed from: o00oOooo  reason: collision with root package name */
    public static final o0OOo0O.o00oo00O<o0OOO0.o00oOoO, o00oo0O0> f14217o00oOooo;

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B'\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J \u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lo0OOo0O/o0O0o$o00oOOo0;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OO/o00oOo0O;", "Lo0OOO0/o00oOoO;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lo0OO0o/oo0oO0;", "result", "Lo0OO0o/oO0Ooooo;", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "o00oo0O0", "Lo0OO/o00oOo0O;", "delegate", "Lo0OOo0O/o00oo0O0;", "o00oo0O", "Lo0OOo0O/o00oo0O0;", "info", "o00oo0Oo", "Lo0OOO0/o00oOoO;", "frame", "Lo0OO/o00oo0;", "getContext", "()Lo0OO/o00oo0;", "context", "getCallerFrame", "()Lo0OOO0/o00oOoO;", "callerFrame", "<init>", "(Lo0OO/o00oOo0O;Lo0OOo0O/o00oo0O0;Lo0OOO0/o00oOoO;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements o0OO.o00oOo0O<T>, o0OOO0.o00oOoO {
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0O  reason: collision with root package name */
        public final o00oo0O0 f14218o00oo0O;
        @o0OOOO0o.o00oOoO
        @NotNull

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final o0OO.o00oOo0O<T> f14219o00oo0O0;
        @Nullable

        /* renamed from: o00oo0Oo  reason: collision with root package name */
        public final o0OOO0.o00oOoO f14220o00oo0Oo;

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(@NotNull o0OO.o00oOo0O<? super T> o00ooo0o2, @NotNull o00oo0O0 o00oo0o02, @Nullable o0OOO0.o00oOoO o00oooo2) {
            this.f14219o00oo0O0 = o00ooo0o2;
            this.f14218o00oo0O = o00oo0o02;
            this.f14220o00oo0Oo = o00oooo2;
        }

        @Override // o0OOO0.o00oOoO
        @Nullable
        public o0OOO0.o00oOoO getCallerFrame() {
            o0OOO0.o00oOoO o00oooo2 = this.f14220o00oo0Oo;
            if (o00oooo2 != null) {
                return o00oooo2.getCallerFrame();
            }
            return null;
        }

        @Override // o0OO.o00oOo0O
        @NotNull
        public o0OO.o00oo0 getContext() {
            return this.f14219o00oo0O0.getContext();
        }

        @Override // o0OOO0.o00oOoO
        @Nullable
        public StackTraceElement getStackTraceElement() {
            o0OOO0.o00oOoO o00oooo2 = this.f14220o00oo0Oo;
            if (o00oooo2 != null) {
                return o00oooo2.getStackTraceElement();
            }
            return null;
        }

        @Override // o0OO.o00oOo0O
        public void resumeWith(@NotNull Object obj) {
            o0O0o.f14206o00oOOo0.o00ooOOo(this);
            this.f14219o00oo0O0.resumeWith(obj);
        }

        @NotNull
        public String toString() {
            return this.f14219o00oo0O0.toString();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lo0OOo0O/o0O0o$o00oOOo0;", "owner", "invoke", "(Lo0OOo0O/o0O0o$o00oOOo0;)Ljava/lang/Object;", "o0OOo0O/o0O0o$o00oOo00", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0O0OO implements o0OOOO.o00oo<o00oOOo0<?>, o0OOo0O.o00oo0OO> {
        public o00oOOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final o0OOo0O.o00oo0OO invoke(@NotNull o00oOOo0<?> o00oooo02) {
            o0OO.o00oo0 o00oOo002;
            if (o0O0o.f14206o00oOOo0.o00ooO0(o00oooo02) || (o00oOo002 = o00oooo02.f14218o00oo0O.o00oOo00()) == null) {
                return null;
            }
            return new o0OOo0O.o00oo0OO(o00oooo02.f14218o00oo0O, o00oOo002);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "R", "Lo0OOo0O/o0O0o$o00oOOo0;", "owner", "invoke", "(Lo0OOo0O/o0O0o$o00oOOo0;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo00<R> extends o0O0OO implements o0OOOO.o00oo<o00oOOo0<?>, R> {
        public final /* synthetic */ o0OOOO.o0O00000<o00oOOo0<?>, o0OO.o00oo0, R> $create;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOo00(o0OOOO.o0O00000<? super o00oOOo0<?>, ? super o0OO.o00oo0, ? extends R> o0o00000) {
            super(1);
            this.$create = o0o00000;
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final R invoke(@NotNull o00oOOo0<?> o00oooo02) {
            o0OO.o00oo0 o00oOo002;
            if (o0O0o.f14206o00oOOo0.o00ooO0(o00oooo02) || (o00oOo002 = o00oooo02.f14218o00oo0O.o00oOo00()) == null) {
                return null;
            }
            return this.$create.invoke(o00oooo02, o00oOo002);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kotlin.jvm.PlatformType", oooOO0.f12266o00oOOo0, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "o0OO0oo0/o00ooO0$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOo0O<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return o0OO0oo0.o00ooO0.o00oOooo(Long.valueOf(((o00oOOo0) t).f14218o00oo0O.f14190o00oOOoO), Long.valueOf(((o00oOOo0) t2).f14218o00oo0O.f14190o00oOOoO));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo0OOo0O/o0O0o$o00oOOo0;", "it", "", "invoke", "(Lo0OOo0O/o0O0o$o00oOOo0;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOoO extends o0O0OO implements o0OOOO.o00oo<o00oOOo0<?>, Boolean> {
        public static final o00oOoO INSTANCE = new o00oOoO();

        public o00oOoO() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @NotNull
        public final Boolean invoke(@NotNull o00oOOo0<?> o00oooo02) {
            return Boolean.valueOf(!o0O0o.f14206o00oOOo0.o00ooO0(o00oooo02));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "R", "Lo0OOo0O/o0O0o$o00oOOo0;", "owner", "invoke", "(Lo0OOo0O/o0O0o$o00oOOo0;)Ljava/lang/Object;", "o0OOo0O/o0O0o$o00oOo00", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0 extends o0O0OO implements o0OOOO.o00oo<o00oOOo0<?>, o00ooO> {
        public o00oo0() {
            super(1);
        }

        @Override // o0OOOO.o00oo
        @Nullable
        public final o00ooO invoke(@NotNull o00oOOo0<?> o00oooo02) {
            o0OO.o00oo0 o00oOo002;
            if (o0O0o.f14206o00oOOo0.o00ooO0(o00oooo02) || (o00oOo002 = o00oooo02.f14218o00oo0O.o00oOo00()) == null) {
                return null;
            }
            return new o00ooO(o00oooo02.f14218o00oo0O, o00oOo002);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "kotlin.jvm.PlatformType", oooOO0.f12266o00oOOo0, "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "o0OO0oo0/o00ooO0$o00oOOo0", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo00O<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return o0OO0oo0.o00ooO0.o00oOooo(Long.valueOf(((o00oOOo0) t).f14218o00oo0O.f14190o00oOOoO), Long.valueOf(((o00oOOo0) t2).f14218o00oo0O.f14190o00oOOoO));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lo0OO0o/oO0Ooooo;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oo0OO extends o0O0OO implements o0OOOO.o00oOOo0<oO0Ooooo> {
        public static final o00oo0OO INSTANCE = new o00oo0OO();

        public o00oo0OO() {
            super(0);
        }

        @Override // o0OOOO.o00oOOo0
        public /* bridge */ /* synthetic */ oO0Ooooo invoke() {
            invoke2();
            return oO0Ooooo.f13240o00oOOo0;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            o0O0o.f14217o00oOooo.o00oOoo0();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [o0OOo0O.o00oo] */
    static {
        o0O0o o0o0o = new o0O0o();
        f14206o00oOOo0 = o0o0o;
        f14208o00oOo00 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        f14209o00oOo0O = new o0OOo0O.o00oo00O<>(false, 1, null);
        f14210o00oOo0o = new Object(0L) { // from class: o0OOo0O.o00oo
            public volatile long sequenceNumber;

            {
                this.sequenceNumber = r1;
            }
        };
        f14211o00oOoO = new ReentrantReadWriteLock();
        f14213o00oOoOO = true;
        f14214o00oOoOo = true;
        f14215o00oOoo0 = o0o0o.o00oo0o();
        f14217o00oOooo = new o0OOo0O.o00oo00O<>(true);
        f14212o00oOoO0 = AtomicLongFieldUpdater.newUpdater(o00oo.class, "sequenceNumber");
    }

    public static /* synthetic */ void o00oo0o0(ooOOOOoo oooooooo) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> o0OO.o00oOo0O<T> o00oOo0O(o0OO.o00oOo0O<? super T> o00ooo0o2, o0O0000O o0o0000o) {
        if (o00ooO0O()) {
            o00oOOo0<?> o00oooo02 = new o00oOOo0<>(o00ooo0o2, new o00oo0O0(o00ooo0o2.getContext(), o0o0000o, f14212o00oOoO0.incrementAndGet(f14210o00oOo0o)), o0o0000o);
            o0OOo0O.o00oo00O<o00oOOo0<?>, Boolean> o00oo00o = f14209o00oOo0O;
            o00oo00o.put(o00oooo02, Boolean.TRUE);
            if (!o00ooO0O()) {
                o00oo00o.clear();
            }
            return o00oooo02;
        }
        return o00ooo0o2;
    }

    public final void o00oOo0o(@NotNull PrintStream printStream) {
        synchronized (printStream) {
            f14206o00oOOo0.o00oOoOo(printStream);
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
        }
    }

    @NotNull
    public final Object[] o00oOoO() {
        String str;
        List<o0OOo0O.o00oo0OO> o00oOoO02 = o00oOoO0();
        int size = o00oOoO02.size();
        ArrayList arrayList = new ArrayList(size);
        ArrayList arrayList2 = new ArrayList(size);
        ArrayList arrayList3 = new ArrayList(size);
        for (o0OOo0O.o00oo0OO o00oo0oo : o00oOoO02) {
            o0OO.o00oo0 o00oo0Var = o00oo0oo.f14195o00oOOo0;
            o0OOo00O.oooOO0 ooooo0 = (o0OOo00O.oooOO0) o00oo0Var.get(o0OOo00O.oooOO0.f14146o00oo0Oo);
            Long l = null;
            String o00oooOo2 = (ooooo0 == null || (str = ooooo0.f14147o00oo0O) == null) ? null : o00oooOo(str);
            o0O0o000 o0o0o000 = (o0O0o000) o00oo0Var.get(o0O0o000.f14013o00oo0O);
            String o00oooOo3 = o0o0o000 != null ? o00oooOo(o0o0o000) : null;
            StringBuilder sb = new StringBuilder();
            sb.append("\n                {\n                    \"name\": ");
            sb.append(o00oooOo2);
            sb.append(",\n                    \"id\": ");
            o0oOo0O0 o0ooo0o0 = (o0oOo0O0) o00oo0Var.get(o0oOo0O0.f14060o00oo0Oo);
            if (o0ooo0o0 != null) {
                l = Long.valueOf(o0ooo0o0.f14061o00oo0O);
            }
            sb.append(l);
            sb.append(",\n                    \"dispatcher\": ");
            sb.append(o00oooOo3);
            sb.append(",\n                    \"sequenceNumber\": ");
            sb.append(o00oo0oo.f14197o00oOo00);
            sb.append(",\n                    \"state\": \"");
            sb.append(o00oo0oo.f14198o00oOo0O);
            sb.append("\"\n                } \n                ");
            arrayList3.add(oOo0000O.o00oo0O0(sb.toString()));
            arrayList2.add(o00oo0oo.f14201o00oOoO0);
            arrayList.add(o00oo0oo.f14199o00oOo0o);
        }
        Object[] objArr = new Object[4];
        objArr[0] = '[' + o0O0oo0o.o0OOo0o0(arrayList3, null, null, null, 0, null, null, 63, null) + ']';
        Object[] array = arrayList.toArray(new Thread[0]);
        if (array != null) {
            objArr[1] = array;
            Object[] array2 = arrayList2.toArray(new o0OOO0.o00oOoO[0]);
            if (array2 != null) {
                objArr[2] = array2;
                Object[] array3 = o00oOoO02.toArray(new o0OOo0O.o00oo0OO[0]);
                if (array3 != null) {
                    objArr[3] = array3;
                    return objArr;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @NotNull
    public final List<o0OOo0O.o00oo0OO> o00oOoO0() {
        ReentrantReadWriteLock reentrantReadWriteLock = f14211o00oOoO;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            o0O0o o0o0o = f14206o00oOOo0;
            if (o0o0o.o00ooO0O()) {
                return o0OOOoO0.ooOOOOoo.o0OOo0O0(o0OOOoO0.ooOOOOoo.o0O0oo0O(o0OOOoO0.ooOOOOoo.o0OOOOo(o0O0oo0o.o0O0oOO0(o0o0o.o00oo0O()), new o00oOo0O()), new o00oOOoO()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final <R> List<R> o00oOoOO(o0OOOO.o0O00000<? super o00oOOo0<?>, ? super o0OO.o00oo0, ? extends R> o0o00000) {
        ReentrantReadWriteLock reentrantReadWriteLock = f14211o00oOoO;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            o0O0o o0o0o = f14206o00oOOo0;
            if (o0o0o.o00ooO0O()) {
                return o0OOOoO0.ooOOOOoo.o0OOo0O0(o0OOOoO0.ooOOOOoo.o0O0oo0O(o0OOOoO0.ooOOOOoo.o0OOOOo(o0O0oo0o.o0O0oOO0(o0o0o.o00oo0O()), new o00oOo0O()), new o00oOo00(o0o00000)));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void o00oOoOo(PrintStream printStream) {
        ReentrantReadWriteLock reentrantReadWriteLock = f14211o00oOoO;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            o0O0o o0o0o = f14206o00oOOo0;
            if (!o0o0o.o00ooO0O()) {
                throw new IllegalStateException("Debug probes are not installed".toString());
            }
            printStream.print("Coroutines dump " + f14208o00oOo00.format(Long.valueOf(System.currentTimeMillis())));
            for (o00oOOo0 o00oooo02 : o0OOOoO0.ooOOOOoo.o0OOOOo(o0OOOoO0.ooOOOOoo.o0oO0Ooo(o0O0oo0o.o0O0oOO0(o0o0o.o00oo0O()), o00oOoO.INSTANCE), new o00oo00O())) {
                o00oo0O0 o00oo0o02 = o00oooo02.f14218o00oo0O;
                List<StackTraceElement> o00oOoO2 = o00oo0o02.o00oOoO();
                o0O0o o0o0o2 = f14206o00oOOo0;
                List<StackTraceElement> o00oo02 = o0o0o2.o00oo0(o00oo0o02.f14194o00oOooO, o00oo0o02.f14192o00oOo0O, o00oOoO2);
                printStream.print("\n\nCoroutine " + o00oooo02.f14219o00oo0O0 + ", state: " + ((o0ooO.o00oOoO0(o00oo0o02.f14194o00oOooO, o00oo0O.f14187o00oOOoO) && o00oo02 == o00oOoO2) ? o00oo0o02.f14194o00oOooO + " (Last suspension stacktrace, not an actual stacktrace)" : o00oo0o02.f14194o00oOooO));
                if (o00oOoO2.isEmpty()) {
                    printStream.print("\n\tat " + o0OOo0o0.oO0Ooooo.o00oOooO(f14207o00oOOoO));
                    o0o0o2.o00ooOO(printStream, o00oo0o02.o00oOOoO());
                } else {
                    o0o0o2.o00ooOO(printStream, o00oo02);
                }
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @NotNull
    public final List<o00ooO> o00oOoo0() {
        ReentrantReadWriteLock reentrantReadWriteLock = f14211o00oOoO;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            o0O0o o0o0o = f14206o00oOOo0;
            if (o0o0o.o00ooO0O()) {
                return o0OOOoO0.ooOOOOoo.o0OOo0O0(o0OOOoO0.ooOOOOoo.o0O0oo0O(o0OOOoO0.ooOOOOoo.o0OOOOo(o0O0oo0o.o0O0oOO0(o0o0o.o00oo0O()), new o00oOo0O()), new o00oo0()));
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079 A[LOOP:0: B:10:0x0073->B:12:0x0079, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o00oOooO(o0OOo00O.ooOOOOoo r6, java.util.Map<o0OOo00O.ooOOOOoo, o0OOo0O.o00oo0O0> r7, java.lang.StringBuilder r8, java.lang.String r9) {
        /*
            r5 = this;
            java.lang.Object r0 = r7.get(r6)
            o0OOo0O.o00oo0O0 r0 = (o0OOo0O.o00oo0O0) r0
            r1 = 10
            if (r0 != 0) goto L29
            boolean r0 = r6 instanceof o0OOo0o0.oO000
            if (r0 != 0) goto L6b
            java.lang.StringBuilder r0 = android.support.v4.media.o00oOo0O.o00oOOo0(r9)
            java.lang.String r2 = r5.o00oo0Oo(r6)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L5f
        L29:
            java.util.List r2 = r0.o00oOoO()
            java.lang.Object r2 = o0OO0oO.o0O0oo0o.o0OOOOoO(r2)
            java.lang.StackTraceElement r2 = (java.lang.StackTraceElement) r2
            java.lang.String r0 = r0.f14194o00oOooO
            java.lang.StringBuilder r3 = android.support.v4.media.o00oOo0O.o00oOOo0(r9)
            java.lang.String r4 = r5.o00oo0Oo(r6)
            r3.append(r4)
            java.lang.String r4 = ", continuation is "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " at line "
            r3.append(r0)
            r3.append(r2)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r8.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5f:
            r0.append(r9)
            r9 = 9
            r0.append(r9)
            java.lang.String r9 = r0.toString()
        L6b:
            o0OOOoO0.oO000 r6 = r6.o00ooO00()
            java.util.Iterator r6 = r6.iterator()
        L73:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r6.next()
            o0OOo00O.ooOOOOoo r0 = (o0OOo00O.ooOOOOoo) r0
            r5.o00oOooO(r0, r7, r8, r9)
            goto L73
        L83:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O.o0O0o.o00oOooO(o0OOo00O.ooOOOOoo, java.util.Map, java.lang.StringBuilder, java.lang.String):void");
    }

    @NotNull
    public final List<StackTraceElement> o00oOooo(@NotNull o0OOo0O.o00oo0OO o00oo0oo, @NotNull List<StackTraceElement> list) {
        return o00oo0(o00oo0oo.f14198o00oOo0O, o00oo0oo.f14199o00oOo0o, list);
    }

    @NotNull
    public final String o00oo(@NotNull ooOOOOoo oooooooo) {
        ReentrantReadWriteLock reentrantReadWriteLock = f14211o00oOoO;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            o0O0o o0o0o = f14206o00oOOo0;
            if (o0o0o.o00ooO0O()) {
                Set<o00oOOo0<?>> o00oo0O2 = o0o0o.o00oo0O();
                ArrayList arrayList = new ArrayList();
                for (Object obj : o00oo0O2) {
                    if (((o00oOOo0) obj).f14219o00oo0O0.getContext().get(ooOOOOoo.f14136o00oOoO) != null) {
                        arrayList.add(obj);
                    }
                }
                int o00oOoOo2 = oo0oO0.o00oOoOo(o0O00O.o0O000(arrayList, 10));
                if (o00oOoOo2 < 16) {
                    o00oOoOo2 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(o00oOoOo2);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(oO00O0o0.o00ooO0O(((o00oOOo0) obj2).f14219o00oo0O0.getContext()), ((o00oOOo0) obj2).f14218o00oo0O);
                }
                StringBuilder sb = new StringBuilder();
                f14206o00oOOo0.o00oOooO(oooooooo, linkedHashMap, sb, "");
                String sb2 = sb.toString();
                o0ooO.o00oo0OO(sb2, "StringBuilder().apply(builderAction).toString()");
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
                return sb2;
            }
            throw new IllegalStateException("Debug probes are not installed".toString());
        } catch (Throwable th) {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    public final List<StackTraceElement> o00oo0(String str, Thread thread, List<StackTraceElement> list) {
        Object m7constructorimpl;
        if (!o0ooO.o00oOoO0(str, o00oo0O.f14187o00oOOoO) || thread == null) {
            return list;
        }
        try {
            oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
            m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(thread.getStackTrace());
        } catch (Throwable th) {
            oo0oO0.o00oOOo0 o00oooo03 = o0OO0o.oo0oO0.Companion;
            m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th));
        }
        if (o0OO0o.oo0oO0.m13isFailureimpl(m7constructorimpl)) {
            m7constructorimpl = null;
        }
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) m7constructorimpl;
        if (stackTraceElementArr == null) {
            return list;
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            if (o0ooO.o00oOoO0(stackTraceElement.getClassName(), o0OOo0o0.oO0Ooooo.f14662o00oOOo0) && o0ooO.o00oOoO0(stackTraceElement.getMethodName(), "resumeWith") && o0ooO.o00oOoO0(stackTraceElement.getFileName(), "ContinuationImpl.kt")) {
                break;
            }
            i++;
        }
        o0O0o00<Integer, Integer> o00oo0OO2 = o00oo0OO(i, stackTraceElementArr, list);
        int intValue = o00oo0OO2.component1().intValue();
        int intValue2 = o00oo0OO2.component2().intValue();
        if (intValue == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList((((list.size() + i) - intValue) - 1) - intValue2);
        int i2 = i - intValue2;
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(stackTraceElementArr[i3]);
        }
        int size = list.size();
        for (int i4 = intValue + 1; i4 < size; i4++) {
            arrayList.add(list.get(i4));
        }
        return arrayList;
    }

    @NotNull
    public final String o00oo00O(@NotNull o0OOo0O.o00oo0OO o00oo0oo) {
        List<StackTraceElement> o00oOooo2 = o00oOooo(o00oo0oo, o00oo0oo.f14200o00oOoO);
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : o00oOooo2) {
            StringBuilder o00oOOo02 = android.support.v4.media.o00oOo0O.o00oOOo0("\n                {\n                    \"declaringClass\": \"");
            o00oOOo02.append(stackTraceElement.getClassName());
            o00oOOo02.append("\",\n                    \"methodName\": \"");
            o00oOOo02.append(stackTraceElement.getMethodName());
            o00oOOo02.append("\",\n                    \"fileName\": ");
            String fileName = stackTraceElement.getFileName();
            o00oOOo02.append(fileName != null ? o00oooOo(fileName) : null);
            o00oOOo02.append(",\n                    \"lineNumber\": ");
            o00oOOo02.append(stackTraceElement.getLineNumber());
            o00oOOo02.append("\n                }\n                ");
            arrayList.add(oOo0000O.o00oo0O0(o00oOOo02.toString()));
        }
        return '[' + o0O0oo0o.o0OOo0o0(arrayList, null, null, null, 0, null, null, 63, null) + ']';
    }

    public final Set<o00oOOo0<?>> o00oo0O() {
        return f14209o00oOo0O.o00oOOoO();
    }

    public final int o00oo0O0(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        StackTraceElement stackTraceElement = (StackTraceElement) o0O000O.oOO00oO0(stackTraceElementArr, i);
        if (stackTraceElement == null) {
            return -1;
        }
        int i2 = 0;
        for (StackTraceElement stackTraceElement2 : list) {
            if (o0ooO.o00oOoO0(stackTraceElement2.getFileName(), stackTraceElement.getFileName()) && o0ooO.o00oOoO0(stackTraceElement2.getClassName(), stackTraceElement.getClassName()) && o0ooO.o00oOoO0(stackTraceElement2.getMethodName(), stackTraceElement.getMethodName())) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public final o0O0o00<Integer, Integer> o00oo0OO(int i, StackTraceElement[] stackTraceElementArr, List<StackTraceElement> list) {
        for (int i2 = 0; i2 < 3; i2++) {
            int o00oo0O02 = f14206o00oOOo0.o00oo0O0((i - 1) - i2, stackTraceElementArr, list);
            if (o00oo0O02 != -1) {
                return new o0O0o00<>(Integer.valueOf(o00oo0O02), Integer.valueOf(i2));
            }
        }
        return new o0O0o00<>(-1, 0);
    }

    public final String o00oo0Oo(ooOOOOoo oooooooo) {
        return oooooooo instanceof oOo00OO0 ? ((oOo00OO0) oooooooo).o0O0o0oO() : oooooooo.toString();
    }

    public final o0OOOO.o00oo<Boolean, oO0Ooooo> o00oo0o() {
        Object m7constructorimpl;
        Object newInstance;
        try {
            oo0oO0.o00oOOo0 o00oooo02 = o0OO0o.oo0oO0.Companion;
            newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
        } catch (Throwable th) {
            oo0oO0.o00oOOo0 o00oooo03 = o0OO0o.oo0oO0.Companion;
            m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl(oo0ooO.o00oOOo0(th));
        }
        if (newInstance != null) {
            m7constructorimpl = o0OO0o.oo0oO0.m7constructorimpl((o0OOOO.o00oo) o0OOO0OO.o00oo0O(newInstance, 1));
            if (o0OO0o.oo0oO0.m13isFailureimpl(m7constructorimpl)) {
                m7constructorimpl = null;
            }
            return (o0OOOO.o00oo) m7constructorimpl;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
    }

    public final boolean o00oo0oO() {
        return f14214o00oOoOo;
    }

    public final o00oOOo0<?> o00ooO(o0OO.o00oOo0O<?> o00ooo0o2) {
        o0OOO0.o00oOoO o00oooo2 = o00ooo0o2 instanceof o0OOO0.o00oOoO ? (o0OOO0.o00oOoO) o00ooo0o2 : null;
        if (o00oooo2 != null) {
            return o00ooOO0(o00oooo2);
        }
        return null;
    }

    public final boolean o00ooO0(o00oOOo0<?> o00oooo02) {
        ooOOOOoo oooooooo;
        o0OO.o00oo0 o00oOo002 = o00oooo02.f14218o00oo0O.o00oOo00();
        if (o00oOo002 == null || (oooooooo = (ooOOOOoo) o00oOo002.get(ooOOOOoo.f14136o00oOoO)) == null || !oooooooo.o00oOoO0()) {
            return false;
        }
        f14209o00oOo0O.remove(o00oooo02);
        return true;
    }

    public final void o00ooO00() {
        ReentrantReadWriteLock reentrantReadWriteLock = f14211o00oOoO;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            installations++;
            if (installations > 1) {
                return;
            }
            f14206o00oOOo0.o00ooo0o();
            o0OOo0O.o00oOoO.f14161o00oOOo0.getClass();
            if (o0OOo0O.o00oOoO.f14162o00oOOoO) {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            o0OOOO.o00oo<Boolean, oO0Ooooo> o00ooVar = f14215o00oOoo0;
            if (o00ooVar != null) {
                o00ooVar.invoke(Boolean.TRUE);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final boolean o00ooO0O() {
        return installations > 0;
    }

    public final boolean o00ooO0o(StackTraceElement stackTraceElement) {
        return oO0O00o0.o0OOO0O(stackTraceElement.getClassName(), "kotlinx.coroutines", false, 2, null);
    }

    public final void o00ooOO(PrintStream printStream, List<StackTraceElement> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            printStream.print("\n\tat " + ((StackTraceElement) it.next()));
        }
    }

    public final o00oOOo0<?> o00ooOO0(o0OOO0.o00oOoO o00oooo2) {
        while (!(o00oooo2 instanceof o00oOOo0)) {
            o00oooo2 = o00oooo2.getCallerFrame();
            if (o00oooo2 == null) {
                return null;
            }
        }
        return (o00oOOo0) o00oooo2;
    }

    public final void o00ooOOo(o00oOOo0<?> o00oooo02) {
        o0OOO0.o00oOoO o00ooOoo2;
        f14209o00oOo0O.remove(o00oooo02);
        o0OOO0.o00oOoO o00oOo0o2 = o00oooo02.f14218o00oo0O.o00oOo0o();
        if (o00oOo0o2 == null || (o00ooOoo2 = o00ooOoo(o00oOo0o2)) == null) {
            return;
        }
        f14217o00oOooo.remove(o00ooOoo2);
    }

    public final void o00ooOo(@NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
        o00ooooO(o00ooo0o2, o00oo0O.f14187o00oOOoO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <T> o0OO.o00oOo0O<T> o00ooOo0(@NotNull o0OO.o00oOo0O<? super T> o00ooo0o2) {
        if (o00ooO0O() && o00ooO(o00ooo0o2) == null) {
            return o00oOo0O(o00ooo0o2, f14214o00oOoOo ? o00oooOO(o00ooo00(new Exception())) : null);
        }
        return o00ooo0o2;
    }

    public final void o00ooOoO(@NotNull o0OO.o00oOo0O<?> o00ooo0o2) {
        o00ooooO(o00ooo0o2, o00oo0O.f14188o00oOo00);
    }

    public final o0OOO0.o00oOoO o00ooOoo(o0OOO0.o00oOoO o00oooo2) {
        do {
            o00oooo2 = o00oooo2.getCallerFrame();
            if (o00oooo2 == null) {
                return null;
            }
        } while (o00oooo2.getStackTraceElement() == null);
        return o00oooo2;
    }

    public final void o00ooo0(boolean z) {
        f14214o00oOoOo = z;
    }

    public final <T extends Throwable> List<StackTraceElement> o00ooo00(T t) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i2 = length2 - 1;
                if (o0ooO.o00oOoO0(stackTrace[length2].getClassName(), "kotlin.coroutines.jvm.internal.DebugProbesKt")) {
                    i = length2;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length2 = i2;
                }
            }
        }
        if (!f14213o00oOoOO) {
            int i3 = length - i;
            ArrayList arrayList = new ArrayList(i3);
            int i4 = 0;
            while (i4 < i3) {
                arrayList.add(i4 == 0 ? o0OOo0o0.oO0Ooooo.o00oOooO(f14207o00oOOoO) : stackTrace[i4 + i]);
                i4++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList((length - i) + 1);
        arrayList2.add(o0OOo0o0.oO0Ooooo.o00oOooO(f14207o00oOOoO));
        while (true) {
            i++;
            while (i < length) {
                if (o00ooO0o(stackTrace[i])) {
                    arrayList2.add(stackTrace[i]);
                    int i5 = i + 1;
                    while (i5 < length && o00ooO0o(stackTrace[i5])) {
                        i5++;
                    }
                    int i6 = i5 - 1;
                    int i7 = i6;
                    while (i7 > i && stackTrace[i7].getFileName() == null) {
                        i7--;
                    }
                    if (i7 > i && i7 < i6) {
                        arrayList2.add(stackTrace[i7]);
                    }
                    arrayList2.add(stackTrace[i6]);
                    i = i5;
                }
            }
            return arrayList2;
            arrayList2.add(stackTrace[i]);
        }
    }

    public final void o00ooo0O(boolean z) {
        f14213o00oOoOO = z;
    }

    public final void o00ooo0o() {
        f14216o00oOooO = o0O0o00O.o00oOo00(false, true, null, "Coroutines Debugger Cleaner", 0, o00oo0OO.INSTANCE, 21, null);
    }

    public final void o00oooO() {
        Thread thread = f14216o00oOooO;
        if (thread == null) {
            return;
        }
        f14216o00oOooO = null;
        thread.interrupt();
        thread.join();
    }

    public final o0O0000O o00oooOO(List<StackTraceElement> list) {
        o0O0000O o0o0000o = null;
        if (!list.isEmpty()) {
            ListIterator<StackTraceElement> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                o0o0000o = new o0O0000O(o0o0000o, listIterator.previous());
            }
        }
        return o0o0000o;
    }

    public final String o00oooOo(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(oOo0oooO.f13903o00oOOoO);
        sb.append(obj);
        sb.append(oOo0oooO.f13903o00oOOoO);
        return sb.toString();
    }

    public final void o00oooo(o0OOO0.o00oOoO o00oooo2, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f14211o00oOoO.readLock();
        readLock.lock();
        try {
            o0O0o o0o0o = f14206o00oOOo0;
            if (o0o0o.o00ooO0O()) {
                o0OOo0O.o00oo00O<o0OOO0.o00oOoO, o00oo0O0> o00oo00o = f14217o00oOooo;
                o00oo0O0 remove = o00oo00o.remove(o00oooo2);
                if (remove == null) {
                    o00oOOo0<?> o00ooOO02 = o0o0o.o00ooOO0(o00oooo2);
                    if (o00ooOO02 != null && (remove = o00ooOO02.f14218o00oo0O) != null) {
                        o0OOO0.o00oOoO o00oOo0o2 = remove.o00oOo0o();
                        o0OOO0.o00oOoO o00ooOoo2 = o00oOo0o2 != null ? o0o0o.o00ooOoo(o00oOo0o2) : null;
                        if (o00ooOoo2 != null) {
                            o00oo00o.remove(o00ooOoo2);
                        }
                    }
                    return;
                }
                remove.o00oOoOo(str, (o0OO.o00oOo0O) o00oooo2);
                o0OOO0.o00oOoO o00ooOoo3 = o0o0o.o00ooOoo(o00oooo2);
                if (o00ooOoo3 == null) {
                    return;
                }
                o00oo00o.put(o00ooOoo3, remove);
                oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            }
        } finally {
            readLock.unlock();
        }
    }

    public final void o00oooo0() {
        ReentrantReadWriteLock reentrantReadWriteLock = f14211o00oOoO;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            readLock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            o0O0o o0o0o = f14206o00oOOo0;
            if (!o0o0o.o00ooO0O()) {
                throw new IllegalStateException("Agent was not installed".toString());
            }
            installations--;
            if (installations != 0) {
                return;
            }
            o0o0o.o00oooO();
            f14209o00oOo0O.clear();
            f14217o00oOooo.clear();
            o0OOo0O.o00oOoO.f14161o00oOOo0.getClass();
            if (o0OOo0O.o00oOoO.f14162o00oOOoO) {
                while (i < readHoldCount) {
                    readLock.lock();
                    i++;
                }
                writeLock.unlock();
                return;
            }
            o0OOOO.o00oo<Boolean, oO0Ooooo> o00ooVar = f14215o00oOoo0;
            if (o00ooVar != null) {
                o00ooVar.invoke(Boolean.FALSE);
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        } finally {
            while (i < readHoldCount) {
                readLock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final void o00ooooO(o0OO.o00oOo0O<?> o00ooo0o2, String str) {
        if (o00ooO0O()) {
            if (o0ooO.o00oOoO0(str, o00oo0O.f14187o00oOOoO) && o0OO0o.o0O00O.f13197o0O0o.o00oOoOo(1, 3, 30)) {
                o0OOO0.o00oOoO o00oooo2 = o00ooo0o2 instanceof o0OOO0.o00oOoO ? (o0OOO0.o00oOoO) o00ooo0o2 : null;
                if (o00oooo2 == null) {
                    return;
                }
                o00oooo(o00oooo2, str);
                return;
            }
            o00oOOo0<?> o00ooO2 = o00ooO(o00ooo0o2);
            if (o00ooO2 == null) {
                return;
            }
            o00ooooo(o00ooO2, o00ooo0o2, str);
        }
    }

    public final void o00ooooo(o00oOOo0<?> o00oooo02, o0OO.o00oOo0O<?> o00ooo0o2, String str) {
        ReentrantReadWriteLock.ReadLock readLock = f14211o00oOoO.readLock();
        readLock.lock();
        try {
            if (f14206o00oOOo0.o00ooO0O()) {
                o00oooo02.f14218o00oo0O.o00oOoOo(str, o00ooo0o2);
                oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            }
        } finally {
            readLock.unlock();
        }
    }

    public final boolean o0O0o() {
        return f14213o00oOoOO;
    }
}
