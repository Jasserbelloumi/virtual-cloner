package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.window.layout.o00oo;
import androidx.window.layout.o00oo0;
import androidx.window.layout.o0O00;
import androidx.window.layout.o0O000O;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO0o.o0O0oo0o;
import o0OO0o.oO0Ooooo;
import o0OO0o.oo0ooO;
import o0OOO0.o0;
import o0OOO0.o00oo00O;
import o0OOOO.o0O00000;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O;
import o0OOo00O.o0O0oo00;
import o0OOo00O.oO0000O;
import o0OOo00O.ooOOOOoo;
import o0OOo0OO.o0OO0;
import o0OOo0OO.o0OO00o;
import o0OOo0OO.o0OOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001d"}, d2 = {"Landroidx/slidingpanelayout/widget/o00oOOo0;", "", "Landroidx/slidingpanelayout/widget/o00oOOo0$o00oOOo0;", "onFoldingFeatureChangeListener", "Lo0OO0o/oO0Ooooo;", "o00oOo0o", "Landroid/app/Activity;", "activity", "o00oOo0O", "o00oOoO0", "Landroidx/window/layout/o0O00;", "windowLayoutInfo", "Landroidx/window/layout/o00oo;", "o00oOooO", "Landroidx/window/layout/o0O000O;", "o00oOOo0", "Landroidx/window/layout/o0O000O;", "windowInfoTracker", "Ljava/util/concurrent/Executor;", o0OO000o.o00oOOoO.f12961o00oOo00, "Ljava/util/concurrent/Executor;", "executor", "Lo0OOo00O/ooOOOOoo;", "o00oOo00", "Lo0OOo00O/ooOOOOoo;", "job", "Landroidx/slidingpanelayout/widget/o00oOOo0$o00oOOo0;", "<init>", "(Landroidx/window/layout/o0O000O;Ljava/util/concurrent/Executor;)V", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class o00oOOo0 {
    @NotNull

    /* renamed from: o00oOOo0  reason: collision with root package name */
    public final o0O000O f4928o00oOOo0;
    @NotNull

    /* renamed from: o00oOOoO  reason: collision with root package name */
    public final Executor f4929o00oOOoO;
    @Nullable

    /* renamed from: o00oOo00  reason: collision with root package name */
    public ooOOOOoo f4930o00oOo00;
    @Nullable

    /* renamed from: o00oOooO  reason: collision with root package name */
    public InterfaceC0051o00oOOo0 f4931o00oOooO;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Landroidx/slidingpanelayout/widget/o00oOOo0$o00oOOo0;", "", "Landroidx/window/layout/o00oo;", "foldingFeature", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "slidingpanelayout_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: androidx.slidingpanelayout.widget.o00oOOo0$o00oOOo0  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0051o00oOOo0 {
        void o00oOOo0(@NotNull o00oo o00ooVar);
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes.dex */
    public static final class o00oOOoO extends o0 implements o0O00000<o0O0oo00, o00oOo0O<? super oO0Ooooo>, Object> {
        public final /* synthetic */ Activity $activity;
        public int label;

        @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"o0OOo0OO/o0OO0o$o00oOOo0", "Lo0OOo0OO/o0OO0;", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.slidingpanelayout.widget.o00oOOo0$o00oOOoO$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0052o00oOOo0 implements o0OO0<o00oo> {

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o00oOOo0 f4932o00oo0O0;

            public C0052o00oOOo0(o00oOOo0 o00oooo02) {
                this.f4932o00oo0O0 = o00oooo02;
            }

            @Override // o0OOo0OO.o0OO0
            @Nullable
            public Object emit(o00oo o00ooVar, @NotNull o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
                oO0Ooooo oo0ooooo;
                o00oo o00ooVar2 = o00ooVar;
                InterfaceC0051o00oOOo0 interfaceC0051o00oOOo0 = this.f4932o00oo0O0.f4931o00oOooO;
                if (interfaceC0051o00oOOo0 == null) {
                    oo0ooooo = null;
                } else {
                    interfaceC0051o00oOOo0.o00oOOo0(o00ooVar2);
                    oo0ooooo = oO0Ooooo.f13240o00oOOo0;
                }
                return oo0ooooo == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? oo0ooooo : oO0Ooooo.f13240o00oOOo0;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lo0OOo0OO/o0OO00o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o0OOo0OO/o0oo0000$o00oo00O"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.slidingpanelayout.widget.o00oOOo0$o00oOOoO$o00oOOoO  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0053o00oOOoO implements o0OO00o<o00oo> {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o00oOOo0 f4933o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0OO00o f4934o00oo0O0;

            @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lo0OOo0OO/o0OO0;", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core", "o0OOo0OO/o0oo0000$o00oo00O$o00oOOoO"}, k = 1, mv = {1, 6, 0})
            /* renamed from: androidx.slidingpanelayout.widget.o00oOOo0$o00oOOoO$o00oOOoO$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0054o00oOOo0 implements o0OO0<o0O00> {

                /* renamed from: o00oo0O  reason: collision with root package name */
                public final /* synthetic */ o00oOOo0 f4935o00oo0O;

                /* renamed from: o00oo0O0  reason: collision with root package name */
                public final /* synthetic */ o0OO0 f4936o00oo0O0;

                @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
                @o00oo00O(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "emit", n = {}, s = {})
                /* renamed from: androidx.slidingpanelayout.widget.o00oOOo0$o00oOOoO$o00oOOoO$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0055o00oOOo0 extends o0OOO0.o00oOo0O {
                    public Object L$0;
                    public int label;
                    public /* synthetic */ Object result;

                    public C0055o00oOOo0(o00oOo0O o00ooo0o2) {
                        super(o00ooo0o2);
                    }

                    @Override // o0OOO0.o00oOOo0
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C0054o00oOOo0.this.emit(null, this);
                    }
                }

                public C0054o00oOOo0(o0OO0 o0oo0, o00oOOo0 o00oooo02) {
                    this.f4936o00oo0O0 = o0oo0;
                    this.f4935o00oo0O = o00oooo02;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
                @Override // o0OOo0OO.o0OO0
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(androidx.window.layout.o0O00 r5, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof androidx.slidingpanelayout.widget.o00oOOo0.o00oOOoO.C0053o00oOOoO.C0054o00oOOo0.C0055o00oOOo0
                        if (r0 == 0) goto L13
                        r0 = r6
                        androidx.slidingpanelayout.widget.o00oOOo0$o00oOOoO$o00oOOoO$o00oOOo0$o00oOOo0 r0 = (androidx.slidingpanelayout.widget.o00oOOo0.o00oOOoO.C0053o00oOOoO.C0054o00oOOo0.C0055o00oOOo0) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.slidingpanelayout.widget.o00oOOo0$o00oOOoO$o00oOOoO$o00oOOo0$o00oOOo0 r0 = new androidx.slidingpanelayout.widget.o00oOOo0$o00oOOoO$o00oOOoO$o00oOOo0$o00oOOo0
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L2f
                        if (r2 != r3) goto L27
                        o0OO0o.oo0ooO.o00oo0(r6)
                        goto L48
                    L27:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L2f:
                        o0OO0o.oo0ooO.o00oo0(r6)
                        o0OOo0OO.o0OO0 r6 = r4.f4936o00oo0O0
                        androidx.window.layout.o0O00 r5 = (androidx.window.layout.o0O00) r5
                        androidx.slidingpanelayout.widget.o00oOOo0 r2 = r4.f4935o00oo0O
                        androidx.window.layout.o00oo r5 = r2.o00oOooO(r5)
                        if (r5 != 0) goto L3f
                        goto L48
                    L3f:
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        o0OO0o.oO0Ooooo r5 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.o00oOOo0.o00oOOoO.C0053o00oOOoO.C0054o00oOOo0.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
                }
            }

            public C0053o00oOOoO(o0OO00o o0oo00o, o00oOOo0 o00oooo02) {
                this.f4934o00oo0O0 = o0oo00o;
                this.f4933o00oo0O = o00oooo02;
            }

            @Override // o0OOo0OO.o0OO00o
            @Nullable
            public Object o00oOOo0(@NotNull o0OO0<? super o00oo> o0oo0, @NotNull o00oOo0O o00ooo0o2) {
                Object o00oOOo02 = this.f4934o00oo0O0.o00oOOo0(new C0054o00oOOo0(o0oo0, this.f4933o00oo0O), o00ooo0o2);
                return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : oO0Ooooo.f13240o00oOOo0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oOOoO(Activity activity, o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$activity = activity;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOoO(this.$activity, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        @Nullable
        public final Object invoke(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(o0o0oo00, o00ooo0o2)).invokeSuspend(oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                oo0ooO.o00oo0(obj);
                o0OO00o o00oOOo02 = o0OOO0.o00oOOo0(new C0053o00oOOoO(o00oOOo0.this.f4928o00oOOo0.o00oOo00(this.$activity), o00oOOo0.this));
                C0052o00oOOo0 c0052o00oOOo0 = new C0052o00oOOo0(o00oOOo0.this);
                this.label = 1;
                if (o00oOOo02.o00oOOo0(c0052o00oOOo0, this) == o00oooo02) {
                    return o00oooo02;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                oo0ooO.o00oo0(obj);
            }
            return oO0Ooooo.f13240o00oOOo0;
        }
    }

    public o00oOOo0(@NotNull o0O000O o0o000o, @NotNull Executor executor) {
        o0ooO.o00oo0O0(o0o000o, "windowInfoTracker");
        o0ooO.o00oo0O0(executor, "executor");
        this.f4928o00oOOo0 = o0o000o;
        this.f4929o00oOOoO = executor;
    }

    public final void o00oOo0O(@NotNull Activity activity) {
        o0ooO.o00oo0O0(activity, "activity");
        ooOOOOoo oooooooo = this.f4930o00oOo00;
        if (oooooooo != null) {
            ooOOOOoo.o00oOOo0.o00oOOoO(oooooooo, null, 1, null);
        }
        this.f4930o00oOo00 = o0OOo00O.o0O00000.o00oOo0o(o0O.o00oOOo0(oO0000O.o00oOo00(this.f4929o00oOOoO)), null, null, new o00oOOoO(activity, null), 3, null);
    }

    public final void o00oOo0o(@NotNull InterfaceC0051o00oOOo0 interfaceC0051o00oOOo0) {
        o0ooO.o00oo0O0(interfaceC0051o00oOOo0, "onFoldingFeatureChangeListener");
        this.f4931o00oOooO = interfaceC0051o00oOOo0;
    }

    public final void o00oOoO0() {
        ooOOOOoo oooooooo = this.f4930o00oOo00;
        if (oooooooo == null) {
            return;
        }
        ooOOOOoo.o00oOOo0.o00oOOoO(oooooooo, null, 1, null);
    }

    public final o00oo o00oOooO(o0O00 o0o00) {
        Object obj;
        Iterator<T> it = o0o00.f5513o00oOOo0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((o00oo0) obj) instanceof o00oo) {
                break;
            }
        }
        if (obj instanceof o00oo) {
            return (o00oo) obj;
        }
        return null;
    }
}
