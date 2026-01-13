package o0OOo0OO;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import o0OO0o.o0O0oo0o;
import o0OOO0.o00oOo0O;
import o0OOO0.o00oo00O;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\u001a9\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\r\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\f*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lo0OOo0OO/o0OO00o;", "", FirebaseAnalytics.Param.DESTINATION, "", o0OO000o.o00oOOoO.f12961o00oOo00, "(Lo0OOo0OO/o0OO00o;Ljava/util/List;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "", "", "o00oOooO", "(Lo0OOo0OO/o0OO00o;Ljava/util/Set;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "", "C", "o00oOOo0", "(Lo0OOo0OO/o0OO00o;Ljava/util/Collection;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* loaded from: classes3.dex */
public final /* synthetic */ class o0OO0oO0 {

    @o0O0oo0o(k = 3, mv = {1, 6, 0}, xi = 48)
    @o00oo00O(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", i = {0}, l = {26}, m = "toCollection", n = {FirebaseAnalytics.Param.DESTINATION}, s = {"L$0"})
    /* loaded from: classes3.dex */
    public static final class o00oOOo0<T, C extends Collection<? super T>> extends o00oOo0O {
        public Object L$0;
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
            return o0OO0oO0.o00oOOo0(null, null, this);
        }
    }

    /* JADX WARN: Incorrect field signature: TC; */
    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010\u0002*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "C", "value", "Lo0OO0o/oO0Ooooo;", "emit", "(Ljava/lang/Object;Lo0OO/o00oOo0O;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class o00oOOoO<T> implements o0OO0 {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ Collection f14328o00oo0O0;

        /* JADX WARN: Incorrect types in method signature: (TC;)V */
        public o00oOOoO(Collection collection) {
            this.f14328o00oo0O0 = collection;
        }

        @Override // o0OOo0OO.o0OO0
        @Nullable
        public final Object emit(T t, @NotNull o0OO.o00oOo0O<? super o0OO0o.oO0Ooooo> o00ooo0o2) {
            this.f14328o00oo0O0.add(t);
            return o0OO0o.oO0Ooooo.f13240o00oOOo0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, C extends java.util.Collection<? super T>> java.lang.Object o00oOOo0(@org.jetbrains.annotations.NotNull o0OOo0OO.o0OO00o<? extends T> r4, @org.jetbrains.annotations.NotNull C r5, @org.jetbrains.annotations.NotNull o0OO.o00oOo0O<? super C> r6) {
        /*
            boolean r0 = r6 instanceof o0OOo0OO.o0OO0oO0.o00oOOo0
            if (r0 == 0) goto L13
            r0 = r6
            o0OOo0OO.o0OO0oO0$o00oOOo0 r0 = (o0OOo0OO.o0OO0oO0.o00oOOo0) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            o0OOo0OO.o0OO0oO0$o00oOOo0 r0 = new o0OOo0OO.o0OO0oO0$o00oOOo0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            o0OOO00o.o00oOOo0 r1 = o0OOO00o.o00oOOo0.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.L$0
            r5 = r4
            java.util.Collection r5 = (java.util.Collection) r5
            o0OO0o.oo0ooO.o00oo0(r6)
            goto L47
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            o0OO0o.oo0ooO.o00oo0(r6)
            o0OOo0OO.o0OO0oO0$o00oOOoO r6 = new o0OOo0OO.o0OO0oO0$o00oOOoO
            r6.<init>(r5)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r4 = r4.o00oOOo0(r6, r0)
            if (r4 != r1) goto L47
            return r1
        L47:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o0OOo0OO.o0OO0oO0.o00oOOo0(o0OOo0OO.o0OO00o, java.util.Collection, o0OO.o00oOo0O):java.lang.Object");
    }

    @Nullable
    public static final <T> Object o00oOOoO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull List<T> list, @NotNull o0OO.o00oOo0O<? super List<? extends T>> o00ooo0o2) {
        return o00oOOo0(o0oo00o, list, o00ooo0o2);
    }

    public static Object o00oOo00(o0OO00o o0oo00o, List list, o0OO.o00oOo0O o00ooo0o2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return o00oOOo0(o0oo00o, list, o00ooo0o2);
    }

    public static Object o00oOo0O(o0OO00o o0oo00o, Set set, o0OO.o00oOo0O o00ooo0o2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = new LinkedHashSet();
        }
        return o00oOOo0(o0oo00o, set, o00ooo0o2);
    }

    @Nullable
    public static final <T> Object o00oOooO(@NotNull o0OO00o<? extends T> o0oo00o, @NotNull Set<T> set, @NotNull o0OO.o00oOo0O<? super Set<? extends T>> o00ooo0o2) {
        return o00oOOo0(o0oo00o, set, o00ooo0o2);
    }
}
