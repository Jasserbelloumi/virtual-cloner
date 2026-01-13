package o0OOo0O0;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import o0OO0o.o0O;
import o0OO0o.o0OO000;
import o0OO0o.oO0Ooooo;
import o0OOO0.o00oOo0O;
import o0OOo00O.o;
import o0OOo00O.oO00Oo0;
import o0OOo0O0.o0O0OO;
import o0OOo0oo.oO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aE\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f\"\b\b\u0000\u0010\u0000*\u00020\t*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0007\u001aR\u0010\u000e\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001d\u0010\u0006\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\b\u0005H\u0086\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a7\u0010\u0012\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0086Hø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a)\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000b\u001a7\u0010\u0016\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00100\u0003H\u0087Hø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001a\u0010\u001a\u001a\u00020\u0010*\u0006\u0012\u0002\b\u00030\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0001\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"E", "R", "Lo0OOo0O0/o00ooO;", "Lkotlin/Function1;", "Lo0OOo0O0/o0O0OO;", "Lo0OO0o/o0O000Oo;", "block", o0OO000o.o00oOOoO.f12961o00oOo00, "(Lo0OOo0O0/o00ooO;Lo0OOOO/o00oo;)Ljava/lang/Object;", "", "o00oOoOO", "(Lo0OOo0O0/o0O0OO;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0oo/oO;", "o00oOoO", "o00oOo00", "(Lo0OOo0O0/o0O0OO;Lo0OOOO/o00oo;)Ljava/lang/Object;", "Lo0OO0o/oO0Ooooo;", "action", "o00oOo0O", "(Lo0OOo0O0/o0O0OO;Lo0OOOO/o00oo;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "", "o00oOoOo", "o00oOooO", "(Lo0OOo0O0/o00ooO;Lo0OOOO/o00oo;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "", "cause", "o00oOOo0", "", "DEFAULT_CLOSE_MESSAGE", "Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class o0O00O0o {

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {104}, m = "consumeEach", n = {"action", "$this$consume$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<E> extends o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o00oOOo0(o0OO.o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O0o.o00oOo0O(null, null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 176)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {TsExtractor.TS_STREAM_TYPE_AC3}, m = "consumeEach", n = {"action", "channel$iv"}, s = {"L$0", "L$1"})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<E> extends o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public o00oOOoO(o0OO.o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O0o.o00oOooO(null, null, this);
        }
    }

    @o0OO0o.o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o0OOO0.o00oo00O(c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", f = "Channels.common.kt", i = {0, 0}, l = {148}, m = "toList", n = {"$this$toList_u24lambda_u2d3", "$this$consume$iv$iv"}, s = {"L$1", "L$2"})
    /* loaded from: classes3.dex */
    public static final class o00oOo00<E> extends o00oOo0O {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public o00oOo00(o0OO.o00oOo0O<? super o00oOo00> o00ooo0o2) {
            super(o00ooo0o2);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return o0O00O0o.o00oOoOo(null, this);
        }
    }

    @o0O
    public static final void o00oOOo0(@NotNull o0O0OO<?> o0o0oo, @Nullable Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = o.o00oOOo0("Channel was consumed, consumer had failed", th);
            }
        }
        o0o0oo.o00oOOoO(r0);
    }

    @oO00Oo0
    public static final <E, R> R o00oOOoO(@NotNull o00ooO<E> o00ooo, @NotNull o0OOOO.o00oo<? super o0O0OO<? extends E>, ? extends R> o00ooVar) {
        o0O0OO<E> o00oo0Oo2 = o00ooo.o00oo0Oo();
        try {
            return o00ooVar.invoke(o00oo0Oo2);
        } finally {
            o0O0OO.o00oOOo0.o00oOOoO(o00oo0Oo2, null, 1, null);
        }
    }

    public static final <E, R> R o00oOo00(@NotNull o0O0OO<? extends E> o0o0oo, @NotNull o0OOOO.o00oo<? super o0O0OO<? extends E>, ? extends R> o00ooVar) {
        try {
            R invoke = o00ooVar.invoke(o0o0oo);
            o00oOOo0(o0o0oo, null);
            return invoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o00oOOo0(o0o0oo, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:25:0x005a, B:27:0x0063, B:21:0x0048, B:28:0x006c), top: B:39:0x002f }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:12:0x002f, B:25:0x005a, B:27:0x0063, B:21:0x0048, B:28:0x006c), top: B:39:0x002f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0057 -> B:25:0x005a). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object o00oOo0O(@org.jetbrains.annotations.NotNull o0OOo0O0.o0O0OO<? extends E> r6, @org.jetbrains.annotations.NotNull o0OOOO.o00oo<? super E, o0OO0o.oO0Ooooo> r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r8) {
        /*
            boolean r0 = r8 instanceof o0OOo0O0.o0O00O0o.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r8
            o0OOo0O0.o0O00O0o$o00oOOo0 r0 = (o0OOo0O0.o0O00O0o.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O0o$o00oOOo0 r0 = new o0OOo0O0.o0O00O0o$o00oOOo0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r6 = r0.L$2
            o0OOo0O0.o0O000Oo r6 = (o0OOo0O0.o0O000Oo) r6
            java.lang.Object r7 = r0.L$1
            o0OOo0O0.o0O0OO r7 = (o0OOo0O0.o0O0OO) r7
            java.lang.Object r2 = r0.L$0
            o0OOOO.o00oo r2 = (o0OOOO.o00oo) r2
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L33
            goto L5a
        L33:
            r6 = move-exception
            goto L76
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            o0OO0o.oo0ooO.o00oo0(r8)
            o0OOo0O0.o0O000Oo r8 = r6.iterator()     // Catch: java.lang.Throwable -> L72
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L48:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L33
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L33
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L33
            r0.label = r3     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r6.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L33
            if (r2 != r1) goto L57
            return r1
        L57:
            r5 = r2
            r2 = r8
            r8 = r5
        L5a:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L33
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L33
            if (r8 == 0) goto L6c
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L33
            r2.invoke(r8)     // Catch: java.lang.Throwable -> L33
            r8 = r2
            goto L48
        L6c:
            o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L33
            o00oOOo0(r7, r4)
            return r6
        L72:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L76:
            throw r6     // Catch: java.lang.Throwable -> L77
        L77:
            r8 = move-exception
            o00oOOo0(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O0o.o00oOo0O(o0OOo0O0.o0O0OO, o0OOOO.o00oo, o0OO.o00oOo0O):java.lang.Object");
    }

    @oO00Oo0
    public static final <E> Object o00oOo0o(o00ooO<E> o00ooo, o0OOOO.o00oo<? super E, oO0Ooooo> o00ooVar, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        o0O0OO<E> o00oo0Oo2 = o00ooo.o00oo0Oo();
        try {
            o0O000Oo<E> it = o00oo0Oo2.iterator();
            while (((Boolean) it.o00oOOo0(null)).booleanValue()) {
                o00ooVar.invoke(it.next());
            }
            return oO0Ooooo.f13240o00oOOo0;
        } finally {
            o0O0OO.o00oOOo0.o00oOOoO(o00oo0Oo2, null, 1, null);
        }
    }

    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'onReceiveCatching'")
    @NotNull
    public static final <E> oO<E> o00oOoO(@NotNull o0O0OO<? extends E> o0o0oo) {
        return (oO<? extends E>) o0o0oo.o00ooOO0();
    }

    public static final <E> Object o00oOoO0(o0O0OO<? extends E> o0o0oo, o0OOOO.o00oo<? super E, oO0Ooooo> o00ooVar, o0OO.o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
        try {
            o0O000Oo<? extends E> it = o0o0oo.iterator();
            while (((Boolean) it.o00oOOo0(null)).booleanValue()) {
                o00ooVar.invoke((E) it.next());
            }
            oO0Ooooo oo0ooooo = oO0Ooooo.f13240o00oOOo0;
            o00oOOo0(o0o0oo, null);
            return oo0ooooo;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o00oOOo0(o0o0oo, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @o0OO0o.o0O0o(level = o0OO0o.o00ooO0.ERROR, message = "Deprecated in the favour of 'receiveCatching'", replaceWith = @o0OO000(expression = "receiveCatching().getOrNull()", imports = {}))
    @Nullable
    public static final <E> Object o00oOoOO(@NotNull o0O0OO<? extends E> o0o0oo, @NotNull o0OO.o00oOo0O<? super E> o00ooo0o2) {
        return o0o0oo.o00oo0oO(o00ooo0o2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[Catch: all -> 0x0037, TryCatch #2 {all -> 0x0037, blocks: (B:12:0x0033, B:26:0x0067, B:28:0x006f, B:29:0x0078), top: B:44:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #2 {all -> 0x0037, blocks: (B:12:0x0033, B:26:0x0067, B:28:0x006f, B:29:0x0078), top: B:44:0x0033 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0063 -> B:25:0x0066). Please submit an issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object o00oOoOo(@org.jetbrains.annotations.NotNull o0OOo0O0.o0O0OO<? extends E> r8, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super java.util.List<? extends E>> r9) {
        /*
            boolean r0 = r9 instanceof o0OOo0O0.o0O00O0o.o00oOo00
            if (r0 == 0) goto L13
            r0 = r9
            o0OOo0O0.o0O00O0o$o00oOo00 r0 = (o0OOo0O0.o0O00O0o.o00oOo00) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O0o$o00oOo00 r0 = new o0OOo0O0.o0O00O0o$o00oOo00
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L42
            if (r2 != r3) goto L3a
            java.lang.Object r8 = r0.L$3
            o0OOo0O0.o0O000Oo r8 = (o0OOo0O0.o0O000Oo) r8
            java.lang.Object r2 = r0.L$2
            o0OOo0O0.o0O0OO r2 = (o0OOo0O0.o0O0OO) r2
            java.lang.Object r4 = r0.L$1
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r5 = r0.L$0
            java.util.List r5 = (java.util.List) r5
            o0OO0o.oo0ooO.o00oo0(r9)     // Catch: java.lang.Throwable -> L37
            goto L66
        L37:
            r8 = move-exception
            r9 = r2
            goto L88
        L3a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L42:
            o0OO0o.oo0ooO.o00oo0(r9)
            o0OO0oOO.o0O00O r9 = new o0OO0oOO.o0O00O
            r9.<init>()
            o0OOo0O0.o0O000Oo r2 = r8.iterator()     // Catch: java.lang.Throwable -> L84
            r4 = r9
            r5 = r4
            r9 = r8
            r8 = r2
        L52:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L82
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L82
            r0.L$2 = r9     // Catch: java.lang.Throwable -> L82
            r0.L$3 = r8     // Catch: java.lang.Throwable -> L82
            r0.label = r3     // Catch: java.lang.Throwable -> L82
            java.lang.Object r2 = r8.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L82
            if (r2 != r1) goto L63
            return r1
        L63:
            r7 = r2
            r2 = r9
            r9 = r7
        L66:
            r6 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L37
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r9 == 0) goto L78
            java.lang.Object r9 = r8.next()     // Catch: java.lang.Throwable -> L37
            r4.add(r9)     // Catch: java.lang.Throwable -> L37
            r9 = r2
            goto L52
        L78:
            o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L37
            o00oOOo0(r2, r6)
            java.util.List r8 = o0OO0oO.o0OoO00O.o00oOOo0(r5)
            return r8
        L82:
            r8 = move-exception
            goto L88
        L84:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L88:
            throw r8     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            o00oOOo0(r9, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O0o.o00oOoOo(o0OOo0O0.o0O0OO, o0OO.o00oOo0O):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[Catch: all -> 0x007d, TryCatch #3 {all -> 0x007d, blocks: (B:26:0x0064, B:28:0x006c, B:29:0x0077), top: B:46:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0077 A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #3 {all -> 0x007d, blocks: (B:26:0x0064, B:28:0x006c, B:29:0x0077), top: B:46:0x0064 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0060 -> B:14:0x0036). Please submit an issue!!! */
    @o0OOo00O.oO00Oo0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <E> java.lang.Object o00oOooO(@org.jetbrains.annotations.NotNull o0OOo0O0.o00ooO<E> r6, @org.jetbrains.annotations.NotNull o0OOOO.o00oo<? super E, o0OO0o.oO0Ooooo> r7, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r8) {
        /*
            boolean r0 = r8 instanceof o0OOo0O0.o0O00O0o.o00oOOoO
            if (r0 == 0) goto L13
            r0 = r8
            o0OOo0O0.o0O00O0o$o00oOOoO r0 = (o0OOo0O0.o0O00O0o.o00oOOoO) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0O0.o0O00O0o$o00oOOoO r0 = new o0OOo0O0.o0O00O0o$o00oOOoO
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r6 = r0.L$2
            o0OOo0O0.o0O000Oo r6 = (o0OOo0O0.o0O000Oo) r6
            java.lang.Object r7 = r0.L$1
            o0OOo0O0.o0O0OO r7 = (o0OOo0O0.o0O0OO) r7
            java.lang.Object r2 = r0.L$0
            o0OOOO.o00oo r2 = (o0OOOO.o00oo) r2
            o0OO0o.oo0ooO.o00oo0(r8)     // Catch: java.lang.Throwable -> L39
            r5 = r0
            r0 = r7
            r7 = r2
        L36:
            r2 = r1
            r1 = r5
            goto L64
        L39:
            r6 = move-exception
            goto L87
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            o0OO0o.oo0ooO.o00oo0(r8)
            o0OOo0O0.o0O0OO r6 = r6.o00oo0Oo()
            o0OOo0O0.o0O000Oo r8 = r6.iterator()     // Catch: java.lang.Throwable -> L83
            r5 = r8
            r8 = r6
            r6 = r5
        L51:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L80
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L80
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L80
            r0.label = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r2 = r6.o00oOOo0(r0)     // Catch: java.lang.Throwable -> L80
            if (r2 != r1) goto L60
            return r1
        L60:
            r5 = r0
            r0 = r8
            r8 = r2
            goto L36
        L64:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L7d
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L7d
            if (r8 == 0) goto L77
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L7d
            r7.invoke(r8)     // Catch: java.lang.Throwable -> L7d
            r8 = r0
            r0 = r1
            r1 = r2
            goto L51
        L77:
            o0OO0o.oO0Ooooo r6 = o0OO0o.oO0Ooooo.f13240o00oOOo0     // Catch: java.lang.Throwable -> L7d
            o0OOo0O0.o0O0OO.o00oOOo0.o00oOOoO(r0, r3, r4, r3)
            return r6
        L7d:
            r6 = move-exception
            r7 = r0
            goto L87
        L80:
            r6 = move-exception
            r7 = r8
            goto L87
        L83:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L87:
            o0OOo0O0.o0O0OO.o00oOOo0.o00oOOoO(r7, r3, r4, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0O0.o0O00O0o.o00oOooO(o0OOo0O0.o00ooO, o0OOOO.o00oo, o0OO.o00oOo0O):java.lang.Object");
    }
}
