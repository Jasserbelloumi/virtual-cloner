package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import kotlin.Metadata;
import o0OO.o00oOo0O;
import o0OO.o00oo0;
import o0OO0o.o0O0oo0o;
import o0OOO0.o0;
import o0OOO0.o00oo00O;
import o0OOOO.o0O00000;
import o0OOOOO0.o0OO0O0;
import o0OOOOO0.o0ooO;
import o0OOo00O.o0O00o00;
import o0OOo00O.o0O0O0O;
import o0OOo00O.o0O0oo00;
import o0OOo0OO.oO0OoOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
@Metadata(bv = {}, d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u001a-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aC\u0010\u001e\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010\u001a\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000!\u001aU\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2-\u0010(\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0%\u0012\u0006\u0012\u0004\u0018\u00010&0#¢\u0006\u0002\b'ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO00o;", "Lo0OOo00O/o0O0oo00;", "scope", "Lo0OOo0OO/oO0OoOO0;", "started", "", "replay", "Lo0OOo0OO/oO000;", "o00oOoO0", "Lo0OOo0OO/oO000O;", "o00oOo00", "(Lo0OOo0OO/o0OO00o;I)Lo0OOo0OO/oO000O;", "Lo0OO/o00oo0;", "context", "upstream", "Lo0OOo0OO/oO00000;", "shared", "initialValue", "Lo0OOo00O/ooOOOOoo;", "o00oOooO", "(Lo0OOo00O/o0O0oo00;Lo0OO/o00oo0;Lo0OOo0OO/o0OO00o;Lo0OOo0OO/oO00000;Lo0OOo0OO/oO0OoOO0;Ljava/lang/Object;)Lo0OOo00O/ooOOOOoo;", "Lo0OOo0OO/oO000Oo0;", "o00oOoOo", "(Lo0OOo0OO/o0OO00o;Lo0OOo00O/o0O0oo00;Lo0OOo0OO/oO0OoOO0;Ljava/lang/Object;)Lo0OOo0OO/oO000Oo0;", "o00oOoOO", "(Lo0OOo0OO/o0OO00o;Lo0OOo00O/o0O0oo00;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo00O/o0O00o00;", "result", "Lo0OO0o/oO0Ooooo;", "o00oOo0O", "(Lo0OOo00O/o0O0oo00;Lo0OO/o00oo0;Lo0OOo0OO/o0OO00o;Lo0OOo00O/o0O00o00;)V", "o00oOOo0", "Lo0OOo0OO/oO00000o;", o0OO000o.o00oOOoO.f12961o00oOo00, "Lkotlin/Function2;", "Lo0OOo0OO/o0OO0;", "Lo0OO/o00oOo0O;", "", "Lo0OO0o/o0O000Oo;", "action", "o00oOo0o", "(Lo0OOo0OO/oO000;Lo0OOOO/o0O00000;)Lo0OOo0OO/oO000;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class oO0Oo {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, HideBottomViewOnScrollBehavior.ENTER_ANIMATION_DURATION}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0 extends o0 implements o0O00000<o0O0oo00, o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ T $initialValue;
        public final /* synthetic */ oO00000<T> $shared;
        public final /* synthetic */ oO0OoOO0 $started;
        public final /* synthetic */ o0OO00o<T> $upstream;
        public int label;

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: o0OOo0OO.oO0Oo$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0200o00oOOo0 extends o0 implements o0O00000<Integer, o00oOo0O<? super Boolean>, Object> {
            public /* synthetic */ int I$0;
            public int label;

            public C0200o00oOOo0(o00oOo0O<? super C0200o00oOOo0> o00ooo0o2) {
                super(2, o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @NotNull
            public final o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
                C0200o00oOOo0 c0200o00oOOo0 = new C0200o00oOOo0(o00ooo0o2);
                c0200o00oOOo0.I$0 = ((Number) obj).intValue();
                return c0200o00oOOo0;
            }

            @Nullable
            public final Object invoke(int i, @Nullable o00oOo0O<? super Boolean> o00ooo0o2) {
                return ((C0200o00oOOo0) create(Integer.valueOf(i), o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
            }

            @Override // o0OOOO.o0O00000
            public /* bridge */ /* synthetic */ Object invoke(Integer num, o00oOo0O<? super Boolean> o00ooo0o2) {
                return invoke(num.intValue(), o00ooo0o2);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    o0OO0o.oo0ooO.o00oo0(obj);
                    return Boolean.valueOf(this.I$0 > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/oO0o0o;", "it", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
        /* loaded from: classes3.dex */
        public static final class o00oOOoO extends o0 implements o0O00000<oO0o0o, o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
            public final /* synthetic */ T $initialValue;
            public final /* synthetic */ oO00000<T> $shared;
            public final /* synthetic */ o0OO00o<T> $upstream;
            public /* synthetic */ Object L$0;
            public int label;

            @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: o0OOo0OO.oO0Oo$o00oOOo0$o00oOOoO$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C0201o00oOOo0 {

                /* renamed from: o00oOOo0  reason: collision with root package name */
                public static final /* synthetic */ int[] f14484o00oOOo0;

                static {
                    int[] iArr = new int[oO0o0o.values().length];
                    iArr[oO0o0o.START.ordinal()] = 1;
                    iArr[oO0o0o.STOP.ordinal()] = 2;
                    iArr[oO0o0o.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    f14484o00oOOo0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public o00oOOoO(o0OO00o<? extends T> o0oo00o, oO00000<T> oo00000, T t, o00oOo0O<? super o00oOOoO> o00ooo0o2) {
                super(2, o00ooo0o2);
                this.$upstream = o0oo00o;
                this.$shared = oo00000;
                this.$initialValue = t;
            }

            @Override // o0OOO0.o00oOOo0
            @NotNull
            public final o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
                o00oOOoO o00ooooo2 = new o00oOOoO(this.$upstream, this.$shared, this.$initialValue, o00ooo0o2);
                o00ooooo2.L$0 = obj;
                return o00ooooo2;
            }

            @Override // o0OOOO.o0O00000
            public /* bridge */ /* synthetic */ Object invoke(oO0o0o oo0o0o, o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
                return invoke2(oo0o0o, o00ooo0o2);
            }

            @Nullable
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull oO0o0o oo0o0o, @Nullable o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
                return ((o00oOOoO) create(oo0o0o, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    o0OO0o.oo0ooO.o00oo0(obj);
                    int i2 = C0201o00oOOo0.f14484o00oOOo0[((oO0o0o) this.L$0).ordinal()];
                    if (i2 == 1) {
                        o0OO00o<T> o0oo00o = this.$upstream;
                        o0OO00o o0oo00o2 = this.$shared;
                        this.label = 1;
                        if (o0oo00o.o00oOOo0(o0oo00o2, this) == o00oooo02) {
                            return o00oooo02;
                        }
                    } else if (i2 == 3) {
                        T t = this.$initialValue;
                        if (t == oO000O0O.f14473o00oOOo0) {
                            this.$shared.o00oOoO();
                        } else {
                            this.$shared.o00oOOoO(t);
                        }
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    o0OO0o.oo0ooO.o00oo0(obj);
                }
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(oO0OoOO0 oo0oooo0, o0OO00o<? extends T> o0oo00o, oO00000<T> oo00000, T t, o00oOo0O<? super o00oOOo0> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$started = oo0oooo0;
            this.$upstream = o0oo00o;
            this.$shared = oo00000;
            this.$initialValue = t;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            return new o00oOOo0(this.$started, this.$upstream, this.$shared, this.$initialValue, o00ooo0o2);
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(o0O0oo00 o0o0oo00, o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke2(o0o0oo00, o00ooo0o2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oOOo0) create(o0o0oo00, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        @Override // o0OOO0.o00oOOo0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                o0OOO00o.o00oOOo0 r0 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r1 = r7.label
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L23
                if (r1 == r5) goto L1f
                if (r1 == r4) goto L1b
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L13
                goto L1f
            L13:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1b:
                o0OO0o.oo0ooO.o00oo0(r8)
                goto L5c
            L1f:
                o0OO0o.oo0ooO.o00oo0(r8)
                goto L8d
            L23:
                o0OO0o.oo0ooO.o00oo0(r8)
                o0OOo0OO.oO0OoOO0 r8 = r7.$started
                o0OOo0OO.oO0OoOO0$o00oOOo0 r1 = o0OOo0OO.oO0OoOO0.f14488o00oOOo0
                r1.getClass()
                o0OOo0OO.oO0OoOO0 r6 = o0OOo0OO.oO0OoOO0.o00oOOo0.f14490o00oOOoO
                if (r8 != r6) goto L3e
                o0OOo0OO.o0OO00o<T> r8 = r7.$upstream
                o0OOo0OO.oO00000<T> r1 = r7.$shared
                r7.label = r5
                java.lang.Object r8 = r8.o00oOOo0(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3e:
                o0OOo0OO.oO0OoOO0 r8 = r7.$started
                r1.getClass()
                o0OOo0OO.oO0OoOO0 r1 = o0OOo0OO.oO0OoOO0.o00oOOo0.f14491o00oOo00
                r5 = 0
                if (r8 != r1) goto L69
                o0OOo0OO.oO00000<T> r8 = r7.$shared
                o0OOo0OO.oO000Oo0 r8 = r8.o00oOo00()
                o0OOo0OO.oO0Oo$o00oOOo0$o00oOOo0 r1 = new o0OOo0OO.oO0Oo$o00oOOo0$o00oOOo0
                r1.<init>(r5)
                r7.label = r4
                java.lang.Object r8 = o0OOo0OO.o0o0000.o00oOOoO(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                o0OOo0OO.o0OO00o<T> r8 = r7.$upstream
                o0OOo0OO.oO00000<T> r1 = r7.$shared
                r7.label = r3
                java.lang.Object r8 = r8.o00oOOo0(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                o0OOo0OO.oO0OoOO0 r8 = r7.$started
                o0OOo0OO.oO00000<T> r1 = r7.$shared
                o0OOo0OO.oO000Oo0 r1 = r1.o00oOo00()
                o0OOo0OO.o0OO00o r8 = r8.o00oOOo0(r1)
                o0OOo0OO.o0OO00o r8 = o0OOo0OO.o0OOO0.o00oOOo0(r8)
                o0OOo0OO.oO0Oo$o00oOOo0$o00oOOoO r1 = new o0OOo0OO.oO0Oo$o00oOOo0$o00oOOoO
                o0OOo0OO.o0OO00o<T> r3 = r7.$upstream
                o0OOo0OO.oO00000<T> r4 = r7.$shared
                T r6 = r7.$initialValue
                r1.<init>(r3, r4, r6, r5)
                r7.label = r2
                java.lang.Object r8 = o0OOo0OO.o0OO0o.o00oOo0o(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                o0OO0o.oO0Ooooo r8 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.oO0Oo.o00oOOo0.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo00O/o0O0oo00;", "Lo0OO0o/oO0Ooooo;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO extends o0 implements o0O00000<o0O0oo00, o00oOo0O<? super o0OO0o.oO0Ooooo>, Object> {
        public final /* synthetic */ o0O00o00<oO000Oo0<T>> $result;
        public final /* synthetic */ o0OO00o<T> $upstream;
        private /* synthetic */ Object L$0;
        public int label;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* loaded from: classes3.dex */
        public static final class o00oOOo0<T> implements o0OO0 {

            /* renamed from: o00oo0O  reason: collision with root package name */
            public final /* synthetic */ o0O0oo00 f14485o00oo0O;

            /* renamed from: o00oo0O0  reason: collision with root package name */
            public final /* synthetic */ o0OO0O0.o00oo0OO<oO00000o<T>> f14486o00oo0O0;

            /* renamed from: o00oo0Oo  reason: collision with root package name */
            public final /* synthetic */ o0O00o00<oO000Oo0<T>> f14487o00oo0Oo;

            public o00oOOo0(o0OO0O0.o00oo0OO<oO00000o<T>> o00oo0oo, o0O0oo00 o0o0oo00, o0O00o00<oO000Oo0<T>> o0o00o00) {
                this.f14486o00oo0O0 = o00oo0oo;
                this.f14485o00oo0O = o0o0oo00;
                this.f14487o00oo0Oo = o0o00o00;
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [T, o0OOo0OO.oO00000o, o0OOo0OO.oO000Oo0] */
            @Override // o0OOo0OO.o0OO0
            @Nullable
            public final Object emit(T t, @NotNull o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
                o0OO0o.oO0Ooooo oo0ooooo;
                oO00000o<T> oo00000o = this.f14486o00oo0O0.element;
                if (oo00000o != null) {
                    oo00000o.setValue(t);
                    oo0ooooo = o0OO0o.oO0Ooooo.f13240o00oOOo0;
                } else {
                    oo0ooooo = null;
                }
                if (oo0ooooo == null) {
                    o0O0oo00 o0o0oo00 = this.f14485o00oo0O;
                    o0OO0O0.o00oo0OO<oO00000o<T>> o00oo0oo = this.f14486o00oo0O0;
                    o0O00o00<oO000Oo0<T>> o0o00o00 = this.f14487o00oo0Oo;
                    ?? r4 = (T) oO000o00.o00oOOo0(t);
                    o0o00o00.o0O000o0(new oO0000Oo(r4, o0OOo00O.oO00O0o0.o00ooO0O(o0o0oo00.o0O000O())));
                    o00oo0oo.element = r4;
                }
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOoO(o0OO00o<? extends T> o0oo00o, o0O00o00<oO000Oo0<T>> o0o00o00, o00oOo0O<? super o00oOOoO> o00ooo0o2) {
            super(2, o00ooo0o2);
            this.$upstream = o0oo00o;
            this.$result = o0o00o00;
        }

        @Override // o0OOO0.o00oOOo0
        @NotNull
        public final o00oOo0O<o0OO0o.oO0Ooooo> create(@Nullable Object obj, @NotNull o00oOo0O<?> o00ooo0o2) {
            o00oOOoO o00ooooo2 = new o00oOOoO(this.$upstream, this.$result, o00ooo0o2);
            o00ooooo2.L$0 = obj;
            return o00ooooo2;
        }

        @Override // o0OOOO.o0O00000
        public /* bridge */ /* synthetic */ Object invoke(o0O0oo00 o0o0oo00, o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return invoke2(o0o0oo00, o00ooo0o2);
        }

        @Nullable
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull o0O0oo00 o0o0oo00, @Nullable o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            return ((o00oOOoO) create(o0o0oo00, o00ooo0o2)).invokeSuspend(o0OO0o.oO0Ooooo.f13240o00oOOo0);
        }

        @Override // o0OOO0.o00oOOo0
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OOO00o.o00oOOo0 o00oooo02 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    o0OO0o.oo0ooO.o00oo0(obj);
                    o0O0oo00 o0o0oo00 = (o0O0oo00) this.L$0;
                    o0OO0O0.o00oo0OO o00oo0oo = new o0OO0O0.o00oo0OO();
                    o0OO00o<T> o0oo00o = this.$upstream;
                    o00oOOo0 o00oooo03 = new o00oOOo0(o00oo0oo, o0o0oo00, this.$result);
                    this.label = 1;
                    if (o0oo00o.o00oOOo0(o00oooo03, this) == o00oooo02) {
                        return o00oooo02;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    o0OO0o.oo0ooO.o00oo0(obj);
                }
                return o0OO0o.oO0Ooooo.f13240o00oOOo0;
            } catch (Throwable th) {
                this.$result.o00oOo0o(th);
                throw th;
            }
        }
    }

    @NotNull
    public static final <T> oO000<T> o00oOOo0(@NotNull oO00000<T> oo00000) {
        return new oO0000O(oo00000, null);
    }

    @NotNull
    public static final <T> oO000Oo0<T> o00oOOoO(@NotNull oO00000o<T> oo00000o) {
        return new oO0000Oo(oo00000o, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r3 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> o0OOo0OO.oO000O<T> o00oOo00(o0OOo0OO.o0OO00o<? extends T> r7, int r8) {
        /*
            o0OOo0O0.o0O000O$o00oOOoO r0 = o0OOo0O0.o0O000O.f14273o00oOoOO
            r0.getClass()
            int r0 = o0OOo0O0.o0O000O.o00oOOoO.f14285o00oOoO
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof o0OOo0Oo.oO00OOO
            if (r1 == 0) goto L3e
            r1 = r7
            o0OOo0Oo.oO00OOO r1 = (o0OOo0Oo.oO00OOO) r1
            o0OOo0OO.o0OO00o r2 = r1.o00oOooo()
            if (r2 == 0) goto L3e
            o0OOo0OO.oO000O r7 = new o0OOo0OO.oO000O
            int r3 = r1.f14522o00oo0O
            r4 = -3
            r5 = 0
            if (r3 == r4) goto L28
            r4 = -2
            if (r3 == r4) goto L28
            if (r3 == 0) goto L28
            r0 = r3
            goto L36
        L28:
            o0OOo0O0.o0O000 r4 = r1.f14524o00oo0Oo
            o0OOo0O0.o0O000 r6 = o0OOo0O0.o0O000.SUSPEND
            if (r4 != r6) goto L31
            if (r3 != 0) goto L36
            goto L35
        L31:
            if (r8 != 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = r5
        L36:
            o0OOo0O0.o0O000 r8 = r1.f14524o00oo0Oo
            o0OO.o00oo0 r1 = r1.f14523o00oo0O0
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3e:
            o0OOo0OO.oO000O r8 = new o0OOo0OO.oO000O
            o0OOo0O0.o0O000 r1 = o0OOo0O0.o0O000.SUSPEND
            o0OO.o00oo0O0 r2 = o0OO.o00oo0O0.INSTANCE
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.oO0Oo.o00oOo00(o0OOo0OO.o0OO00o, int):o0OOo0OO.oO000O");
    }

    public static final <T> void o00oOo0O(o0O0oo00 o0o0oo00, o00oo0 o00oo0Var, o0OO00o<? extends T> o0oo00o, o0O00o00<oO000Oo0<T>> o0o00o00) {
        o0OOo00O.o0O00000.o00oOo0o(o0o0oo00, o00oo0Var, null, new o00oOOoO(o0oo00o, o0o00o00, null), 2, null);
    }

    @NotNull
    public static final <T> oO000<T> o00oOo0o(@NotNull oO000<? extends T> oo000, @NotNull o0O00000<? super o0OO0<? super T>, ? super o00oOo0O<? super o0OO0o.oO0Ooooo>, ? extends Object> o0o00000) {
        return new oO00O0o(oo000, o0o00000);
    }

    public static oO000 o00oOoO(o0OO00o o0oo00o, o0O0oo00 o0o0oo00, oO0OoOO0 oo0oooo0, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return o00oOoO0(o0oo00o, o0o0oo00, oo0oooo0, i);
    }

    @NotNull
    public static final <T> oO000<T> o00oOoO0(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0oo00 o0o0oo00, @NotNull oO0OoOO0 oo0oooo0, int i) {
        oO000O o00oOo002 = o00oOo00(o0oo00o, i);
        oO00000 o00oOOo02 = oO000O0O.o00oOOo0(i, o00oOo002.f14457o00oOOoO, o00oOo002.f14458o00oOo00);
        return new oO0000O(o00oOOo02, o00oOooO(o0o0oo00, o00oOo002.f14459o00oOooO, o00oOo002.f14456o00oOOo0, o00oOOo02, oo0oooo0, oO000O0O.f14473o00oOOo0));
    }

    @Nullable
    public static final <T> Object o00oOoOO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0oo00 o0o0oo00, @NotNull o00oOo0O<? super oO000Oo0<? extends T>> o00ooo0o2) {
        oO000O o00oOo002 = o00oOo00(o0oo00o, 1);
        o0O00o00 o00oOo003 = o0O0O0O.o00oOo00(null, 1, null);
        o00oOo0O(o0o0oo00, o00oOo002.f14459o00oOooO, o00oOo002.f14456o00oOOo0, o00oOo003);
        return o00oOo003.o00oOoo0(o00ooo0o2);
    }

    @NotNull
    public static final <T> oO000Oo0<T> o00oOoOo(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull o0O0oo00 o0o0oo00, @NotNull oO0OoOO0 oo0oooo0, T t) {
        oO000O o00oOo002 = o00oOo00(o0oo00o, 1);
        oO00000o o00oOOo02 = oO000o00.o00oOOo0(t);
        return new oO0000Oo(o00oOOo02, o00oOooO(o0o0oo00, o00oOo002.f14459o00oOooO, o00oOo002.f14456o00oOOo0, o00oOOo02, oo0oooo0, t));
    }

    public static final <T> o0OOo00O.ooOOOOoo o00oOooO(o0O0oo00 o0o0oo00, o00oo0 o00oo0Var, o0OO00o<? extends T> o0oo00o, oO00000<T> oo00000, oO0OoOO0 oo0oooo0, T t) {
        oO0OoOO0.f14488o00oOOo0.getClass();
        return o0OOo00O.o0O00000.o00oOo0O(o0o0oo00, o00oo0Var, o0ooO.o00oOoO0(oo0oooo0, oO0OoOO0.o00oOOo0.f14490o00oOOoO) ? o0OOo00O.o0OO000.DEFAULT : o0OOo00O.o0OO000.UNDISPATCHED, new o00oOOo0(oo0oooo0, o0oo00o, oo00000, t, null));
    }
}
