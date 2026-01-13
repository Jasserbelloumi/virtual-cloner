package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import o0OO0o.o0O0oo0o;
import o0OOO0.o00oOo0O;
import o0OOO0.o00oo00O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lo0OOo0OO/oo0oO0;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO000o;", "Lo0OOo0OO/o0OO0;", "collector", "Lo0OO0o/oO0Ooooo;", "o00oOOo0", "(Lo0OOo0OO/o0OO0;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "Lo0OOo0OO/o0OO00o;", "o00oo0O0", "Lo0OOo0OO/o0OO00o;", "flow", "<init>", "(Lo0OOo0OO/o0OO00o;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class oo0oO0<T> implements o0OO000o<T> {
    @NotNull

    /* renamed from: o00oo0O0  reason: collision with root package name */
    public final o0OO00o<T> f14495o00oo0O0;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T> implements o0OO0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ o0OO0<T> f14496o00oo0O0;

        @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
        @o00oo00O(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {275}, m = "emit", n = {}, s = {})
        /* renamed from: o0OOo0OO.oo0oO0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0202o00oOOo0 extends o00oOo0O {
            public int label;
            public /* synthetic */ Object result;
            public final /* synthetic */ o00oOOo0<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0202o00oOOo0(o00oOOo0<? super T> o00oooo02, o0OO.o00oOo0O<? super C0202o00oOOo0> o00ooo0o2) {
                super(o00ooo0o2);
                this.this$0 = o00oooo02;
            }

            @Override // o0OOO0.o00oOOo0
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public o00oOOo0(o0OO0<? super T> o0oo0) {
            this.f14496o00oo0O0 = o0oo0;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
        @Override // o0OOo0OO.o0OO0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof o0OOo0OO.oo0oO0.o00oOOo0.C0202o00oOOo0
                if (r0 == 0) goto L13
                r0 = r6
                o0OOo0OO.oo0oO0$o00oOOo0$o00oOOo0 r0 = (o0OOo0OO.oo0oO0.o00oOOo0.C0202o00oOOo0) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                o0OOo0OO.oo0oO0$o00oOOo0$o00oOOo0 r0 = new o0OOo0OO.oo0oO0$o00oOOo0$o00oOOo0
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.result
                o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                o0OO0o.oo0ooO.o00oo0(r6)
                goto L44
            L27:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L2f:
                o0OO0o.oo0ooO.o00oo0(r6)
                o0OO.o00oo0 r6 = r0.getContext()
                o0OOo00O.oO00O0o0.o00ooO00(r6)
                o0OOo0OO.o0OO0<T> r6 = r4.f14496o00oo0O0
                r0.label = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L44
                return r1
            L44:
                o0OO0o.oO0Ooooo r5 = o0OO0o.oO0Ooooo.f13240o00oOOo0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.oo0oO0.o00oOOo0.emit(java.lang.Object, o0OO.o00oOo0O):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public oo0oO0(@NotNull o0OO00o<? extends T> o0oo00o) {
        this.f14495o00oo0O0 = o0oo00o;
    }

    @Override // o0OOo0OO.o0OO00o
    @Nullable
    public Object o00oOOo0(@NotNull o0OO0<? super T> o0oo0, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
        Object o00oOOo02 = this.f14495o00oo0O0.o00oOOo0(new o00oOOo0(o0oo0), o00ooo0o2);
        return o00oOOo02 == o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED ? o00oOOo02 : o0OO0o.oO0Ooooo.f13240o00oOOo0;
    }
}
